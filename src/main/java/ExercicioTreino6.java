import java.util.Locale;
import java.util.Scanner;

public class ExercicioTreino6
    {
        public static void main (String args[])
        {
            Locale.setDefault(Locale.US);
            Scanner sc =  new Scanner(System.in);

            double A, B, C, areaA, areaB, areaC, areaD, areaE;
            double pi = 3.14159;

            A = sc.nextDouble();
            B = sc.nextDouble();
            C = sc.nextDouble();

            areaA = (A * C)/2;
            areaB = pi * (Math.pow(C, 2.0));
            areaC = ((A + B) * C) / 2.0;
            areaD = Math.pow(B, 2.0);
            areaE = A * B;

            System.out.printf("TRIANGULO = %.3f%n", areaA);
            System.out.printf("CIRCULO = %.3f%n", areaB);
            System.out.printf("TRAPEZIO = %.3f%n", areaC);
            System.out.printf("QUADRADO = %.3f%n", areaD);
            System.out.printf("RETANGULO = %.3f%n", areaE);

            sc.close();
        }
    }
