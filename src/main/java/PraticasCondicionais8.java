import java.util.Locale;
import java.util.Scanner;

public class PraticasCondicionais8
    {
        public static void main (String args [])
        {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            double salario, imposto, rombus;

            salario = sc.nextDouble();

            if (salario > 0 && salario <= 2000) {
                System.out.println("Isento");
            }
            else if (salario > 2000 && salario <= 3000) {
                imposto = salario - 2000;
                rombus = (imposto / 100) * 8;
                System.out.printf("R$ %.2f%n", rombus);
            }
            else if (salario > 3000 && salario <= 4500) {
                imposto = salario - 3000;
                rombus = ((imposto / 100) * 18) + 80;
                System.out.printf("R$ %.2f%n", rombus);
            }
            else if (salario > 4500);
                imposto = salario - 4500;
                rombus = ((imposto / 100) * 28) + 80 + 270;
                System.out.printf("R$ %.2f%n", rombus);
        }
    }
