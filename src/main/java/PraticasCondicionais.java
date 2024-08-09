import java.sql.SQLOutput;
import java.util.Scanner;

public class PraticasCondicionais
    {
        public static void main(String args [])
        {
            /*Scanner sc = new Scanner(System.in);
            int hora;

            System.out.println("Quantas horas?");
            hora = sc.nextInt();

            if(hora < 12) {
                System.out.println("bom dia");
            }
            else if (hora < 18){
                System.out.println("Boa tarde");
            }
            else {
                System.out.println("Boa noite");
            }*/


            Scanner sc = new Scanner(System.in);
            int numero;

            numero = sc.nextInt();

            if (numero < 0) {
                System.out.println("NEGATIVO");
            }
            else {
                System.out.println("NÃO NEGATIVO");
            }


        }

    }
