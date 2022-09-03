import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ComputadorFactory computadorFactory = new ComputadorFactory();
        Computador mac1 = computadorFactory.getComputador(8, 500);
        System.out.println(mac1.toString());
        Computador windows = computadorFactory.getComputador(16, 128);
        Computador mac2 = computadorFactory.getComputador(8, 500);

        //System.out.println(mac1.toString());
        System.out.println(mac2.toString());
        System.out.println(windows.toString());


        List<Computador> computadores = new ArrayList<>();

        for (int i = 0; i<100; i++) {
            computadores.add(new Computador(16, 128));
        }

        for (int i = 0; i<100; i++) {
            computadorFactory.getComputador(8, 500);
        }
    }
}
