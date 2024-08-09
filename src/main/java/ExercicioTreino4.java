import java.util.Scanner;
import java.util.Locale;

public class ExercicioTreino4
    {

        public static void main (String args [])
        {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            int matricula;
            double hora, calcSal, salario;

            matricula = sc.nextInt();
            hora = sc.nextDouble();
            calcSal = sc.nextDouble();

            salario = (Double) hora * calcSal;

            System.out.println("NUMBER = " + matricula);
            System.out.printf("SALARY = U$ %.2f%n", salario);

            sc.close();

        }

    }
