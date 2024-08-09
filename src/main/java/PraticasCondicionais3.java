import java.util.Scanner;

public class PraticasCondicionais3
    {
        public static void main (String args [])
        {
            Scanner sc = new Scanner(System.in);

            int numb = sc.nextInt();

            if (numb % 2 == 1) {
                System.out.println(numb);
            }
            else {
                System.out.println("numero invalido");
            }



        }
    }
