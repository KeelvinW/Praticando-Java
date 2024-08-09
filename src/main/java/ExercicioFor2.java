import java.util.Scanner;

public class ExercicioFor2
    {
        public static void main (String args [])
        {
            Scanner sc = new Scanner(System.in);

            int x = sc.nextInt();
            int somaIn = 0;
            int somaOut = 0;

            for (int i=0; i < x; i ++) {
                int numb = sc.nextInt();
                if (numb >= 10 && numb <= 20) {
                    somaIn++;
                }
                else {
                    somaOut++;
                }
            }
            System.out.println(somaIn + " in");
            System.out.println(somaOut + " out");

            sc.close();
        }
    }
