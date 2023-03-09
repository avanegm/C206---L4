import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double NP1;
        double NP2;
        double media;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a nota da NP1: ");
        NP1 = sc.nextDouble();

        System.out.println("Entre com a nota da NP2: ");
        NP2 = sc.nextDouble();

        media = (NP1+NP2)/2;

        System.out.printf("Media final: "+(int)media);

        sc.close();

    }
}
