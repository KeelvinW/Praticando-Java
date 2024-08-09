import java.util.Scanner;

public class PraticasCondicionais4
    {
        public static void main (String args [])
        {
            Scanner sc = new Scanner(System.in);

            int inicio, fim, duracao;

            inicio = sc.nextInt();
            fim = sc.nextInt();

            if(inicio < fim) {
                duracao = fim - inicio;
            }
            else {
                duracao = 24 - inicio + fim;
            }

            System.out.println("O JOGO DUROU " + duracao + " HORAS");
        }
    }
