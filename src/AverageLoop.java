import java.sql.SQLOutput;
import java.util.Scanner;

public class AverageLoop {




    public static void main(String[] args) {

        System.out.println("Hej med dig!");
        System.out.println("Indtast et tal:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Indtast endnu et tal:");
        int y = scanner.nextInt();

        int sum = x+y;
        int DetHele = 2;
        int GennemSnit = sum/DetHele;

        System.out.println("Gennemsnittet af de indtastede tal er: " + GennemSnit);

        for (int i = 0; i < 8; i++) {
            System.out.println("indtast endnu et tal: ");
            y = scanner.nextInt();
            int nySum = y+sum;
            int gennemsnit = nySum/DetHele;
            System.out.println("Gennemsnittet af de indtastede tal er: " + gennemsnit);




        }


    }





}
