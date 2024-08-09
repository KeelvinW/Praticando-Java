import java.util.Scanner;

public class PraticaSwitchCase
    {
        public static void main (String args [])
        {
            Scanner sc = new Scanner(System.in);
            String dia;
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    dia = "Domingo";
                    break;
                case 2:
                    dia = "Segunda-feira";
                    break;
                case 3:
                    dia = "Terça-feira";
                    break;
                case 4:
                    dia = "Quarta-feira";
                    break;
                case 5:
                    dia = "Quinta-feira";
                    break;
                case 6:
                    dia = "Sexta-feira";
                    break;
                case 7:
                    dia = "Sabado";
                    break;
                default:
                    dia = "Valor invalido";
            }
            System.out.println("Dia da semana: " + dia);
        }
    }
