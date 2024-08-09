import java.util.Scanner;

public class ExercicioFor7
    {
        public static void main (String args [])
        {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.println(i);
                double quadrado = Math.pow(i, 2);
                double cubo = Math.pow(i, 3);
                System.out.printf("%.0f%n", quadrado);
                System.out.printf("%.0f%n", cubo);
            }

            sc.close();
        }
    }
