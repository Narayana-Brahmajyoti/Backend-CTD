import model.Empregado;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empregado> empregados = new ArrayList<>();
        Empregado empregado1 = new Empregado("José", "Ferreira", "MG-12546566", 2.000);
        Empregado empregado2 = new Empregado("Maria", "Martins", "MG-145676786", 3.000);
        Empregado empregado3 = new Empregado("Camila", "Silva", "MG-1278966", 2.500);
        Empregado empregado4 = new Empregado("Felipe", "Fonseca", "MG-1126566", 8.000);

        empregados.add(empregado1);
        empregados.add(empregado2);
        empregados.add(empregado3);
        empregados.add(empregado4);

        try{
            FileOutputStream fileOutputStream = new FileOutputStream("empregados.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(empregados);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<Empregado> empregadoList = null;
        try{
            FileInputStream fileInputStream = new FileInputStream("empregados.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            empregadoList = (List<Empregado>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Empregado empregado: empregadoList){
            System.out.println(empregado.toString());
        }

    }
}
