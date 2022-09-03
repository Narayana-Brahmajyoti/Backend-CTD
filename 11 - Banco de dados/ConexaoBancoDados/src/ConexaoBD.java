import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexaoBD {
    public static void main(String[] args) throws Exception{
        // Instanciar classe Driver para utilizar no main
        Class.forName("org.h2.Driver").newInstance();
        // Configurar a conexão
        Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        // Declarar statement para enviar as queries para o banco
        Statement statement = connection. createStatement();

        String sqlCreateTable = "DROP TABLE IF EXISTS Teste; CREATE TABLE Teste(Id int PRIMARY KEY, Nome VARCHAR(255))";
        statement.execute(sqlCreateTable);

        String sqlInsert1 = "INSERT INTO Teste(id, Nome) Values(1,'Oi')";
        String sqlInsert2 = "INSERT INTO Teste(id, Nome) Values(2,'Ola')";
        statement.execute(sqlInsert1);
        statement.execute(sqlInsert2);

        String sqlRead = "SELECT * fROM Teste";
        ResultSet resultSet = statement.executeQuery(sqlRead);

        while (resultSet.next()){
            System.out.println((resultSet.getInt(1) + " - " + resultSet.getString(2)));
        }
    }
}
