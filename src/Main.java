import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        SpeedingTicket s = new SpeedingTicket();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            System.out.println("Ingrese los valores a validar por favor");
            String data = input.readLine();
            System.out.println(s.init(data));
        }
    }
}
