import java.util.Scanner;

public class PraticaRepeticaoWhile3
    {
        public static void main (String args[])
        {
            Scanner sc = new Scanner(System.in);

            int x = sc.nextInt();
            int alcool = 0;
            int gasolina = 0;
            int diesel = 0;

            while (x != 4) {

                switch (x) {
                    case 1:
                        alcool += 1;
                        break;
                    case 2:
                        gasolina +=1;
                        break;
                    case 3:
                        diesel += 1;
                        break;
                    default:

                }

                x = sc.nextInt();
            }

            System.out.println("MUITO OBRIGADO");
            System.out.println("Alcool: " + alcool);
            System.out.println("Gasolina: " + gasolina);
            System.out.println("Diesel: " + diesel);
        }
    }
