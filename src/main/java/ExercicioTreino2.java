import java.util.Scanner;
import java.util.Locale;

public class ExercicioTreino2
    {

        public static void main(String args [])
            {
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);

                double pi = 3.14159;
                double raio, area;

                raio = sc.nextDouble();

                area = pi * (Math.pow(raio, 2.0));

                System.out.printf("A = %.4f%n", area);

                sc.close();
            }

    }
