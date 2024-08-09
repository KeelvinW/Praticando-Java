import java.util.Locale;
import java.util.Scanner;

public class PraticasCondicionais5
    {
        public static void main (String args [])
        {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            int codigo, qtd;
            double  total;

            codigo = sc.nextInt();
            qtd = sc.nextInt();

            if (codigo == 1){
                total = qtd * 4.00;
                System.out.printf("Total: R$ %.2f%n", total);
            } else if (codigo == 2){
                total = qtd * 4.50;
                System.out.printf("Total: R$ %.2f%n", total);
            } else if (codigo == 3){
                total = qtd * 5.00;
                System.out.printf("Total: R$ %.2f%n", total);
            } else if(codigo == 4){
                total = qtd * 2.00;
                System.out.printf("Total: R$ %.2f%n", total);
            } else if(codigo == 5){
                total = qtd * 1.50;
                System.out.printf("Total: R$ %.2f%n", total);
            } else {
                System.out.println("Código invalido! Digite o primeiro numero de 1 a 5.");
            }

        }
    }
