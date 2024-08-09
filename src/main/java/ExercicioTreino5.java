import java.util.Locale;
import java.util.Scanner;

public class ExercicioTreino5
    {
        public static void main (String args[])
        {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            int codigo1, codigo2, qtd1, qtd2;
            double  valor1, valor2, tot1, tot2, total;

            codigo1 = sc.nextInt();
            qtd1 = sc.nextInt();
            valor1 = sc.nextDouble();

            codigo2 = sc.nextInt();
            qtd2 = sc.nextInt();
            valor2 = sc.nextDouble();

            tot1 = qtd1 * valor1;
            tot2 = qtd2 * valor2;

            total = tot1 + tot2;

            System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        }
    }
