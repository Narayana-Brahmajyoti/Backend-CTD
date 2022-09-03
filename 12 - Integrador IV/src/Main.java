import org.apache.log4j.Logger;
import org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException;

import java.sql.*;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Funcionario; CREATE TABLE Funcionario "
            + "("
            + " ID INT PRIMARY KEY NOT NULL, "
            + " Primeiro_Nome varchar(100), "
            + " Sobrenome varchar(100), "
            + " Idade INT, "
            + " Celular varchar(15)"
            + ")";

    private static final String sqlInsert1 =  "INSERT INTO Funcionario (ID, Primeiro_Nome, Sobrenome, Idade, Celular) VALUES (1, 'Israel', 'Martins', 34, 319458726584)";
    private static final String sqlInsert2 =  "INSERT INTO Funcionario (ID, Primeiro_Nome, Sobrenome, Idade, Celular) VALUES (3, 'José', 'Gomes', 40, 2702581456)";
    private static final String sqlInsert3 =  "INSERT INTO Funcionario (ID, Primeiro_Nome, Sobrenome, Idade, Celular) VALUES (3, 'Jessica', ' Happy', 12, 1354469879)";

    private static final String sqlDeleteById =  "DELETE FROM Funcionario WHERE ID=3";

    private static final String sqlDeleteByNome = "DELETE FROM Funcionario WHERE Primeiro_Nome='Jessica'";
    private static final String sqlUpdateById = "UPDATE  Funcionario SET Sobrenome='Cavalcante' WHERE ID=1";
    private static final String findById = "SELECT * FROM FUNCIONARIO WHERE ID=3";


    public static void main(String[] args) throws Exception {
        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();

            statement.execute(sqlCreateTable);
            logger.info("Tabela funcinário criada");

            statement.execute(sqlInsert1);
            logger.info("Usuário 1 inserido!");

            statement.execute(sqlInsert2);
            logger.info("Usuário 2 inserido!");

            try {
                statement.execute(sqlInsert3);
                logger.info("Usuário 3 inserido!");
            }catch (JdbcSQLIntegrityConstraintViolationException erro) {
                logger.error("Primary key repetida!");
            }

            statement.executeUpdate(sqlUpdateById);
            ResultSet busca = statement.executeQuery(findById);

            while (busca.next()){
                logger.info( "\nId: " + busca.getInt(1)
                        + "\n Nome: " + busca.getString(2)
                        + "\n Sobrenome: " + busca.getString(3)
                        + "\n Idade: " +  busca.getInt(4)
                        + "\n Telefone: " + busca.getString(5));
            }
            logger.debug("Usuário 3 atualizado" +  busca );

            statement.executeUpdate(sqlDeleteById);
            logger.info("Usuário deletado pelo id");

            statement.executeUpdate(sqlDeleteByNome);
            logger.info("Usuário deletado pelo nome");

        } catch (Exception e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        } finally {
            if (connection != null){
                connection.close();
            }
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }

}
