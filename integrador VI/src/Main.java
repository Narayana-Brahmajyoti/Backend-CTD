import model.Empregado;
import model.Empresa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Empresa emp = new Empresa("Flash Limpeza","1234/0001-85");

        Empregado empregado1 = new Empregado("José", "Ferreira", "MG-12546566", 2000.00);
        Empregado empregado2 = new Empregado("Maria", "Martins", "MG-145676786", 3000.00);
        Empregado empregado3 = new Empregado("Camila", "Silva", "MG-1278966", 2500.00);
        Empregado empregado4 = new Empregado("Felipe", "Fonseca", "MG-1126566", 8000.00);


        ArrayList<Empregado> empregados = new ArrayList<>();
        empregados.add(empregado1);
        empregados.add(empregado2);
        empregados.add(empregado3);
        empregados.add(empregado4);

        emp.setEmpregados(empregados);

        try{
            FileOutputStream fileOutputStream = new FileOutputStream("empregados.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(emp);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Empresa empresa = null;
        try{
            FileInputStream fileInputStream = new FileInputStream("empregados.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            empresa = (Empresa) objectInputStream.readObject();
            ArrayList<Empregado> listEmpregados = empresa.getEmpregados();


            for (Empregado empreg: listEmpregados){
                System.out.printf("\nEmpresa: " + empresa.getRazaoSocial() + ", CNPJ: " + empresa.getCnpj()
                        + ", Funcionário: " + empreg.getNome() + " " + empreg.getSobreNome() + ", Rg: " + empreg.getRg() + ", Salário: R$" + empreg.getSalario());

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
