import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // A = 3,14 * r²
        double raio;
        double area;

        Scanner sc = new Scanner(System.in);
        raio = sc.nextDouble();
        sc.close();

        area = 3.14 * (raio * raio);

        System.out.println("A área desse círculo em cm² é " + area);
        
    }
}
