import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Imobiliaria imobiliaria = new Imobiliaria("Imobiliaria do Jair", "5564","Estiva");

        boolean flag = true;

        while (flag){
            System.out.println("--- BEM VINDO " + imobiliaria.nome + " ---");
            System.out.println("1 - Cadastrar um apartamento novo");
            System.out.println("2 - Ajustar aluguel");
            System.out.println("3 - Media dos apartamentos");
            System.out.println("4 - Exibir todas informacoes");
            System.out.println("5 - Sair");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Endereco: ");
                    String endereco = sc.nextLine();
                    System.out.println("Numero de quartos: ");
                    int numQuatos = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Area: ");
                    double area = sc.nextDouble();
                    System.out.println("Aluguel: ");
                    double aluguel = sc.nextDouble();

                    Apartamento apto = new Apartamento(endereco, numQuatos, area, aluguel);

                    // Adicionando estudante criado na escola
                    imobiliaria.addApartamento(apto);
                    break;

                case 2:
                    imobiliaria.ajustaAluguel();
                    break;

                case 3:
                    imobiliaria.mediaArea();
                    break;

                case 4:
                    imobiliaria.mostraInfo();
                    break;

                case 5:
                    System.out.println("Opcao invalida");
                    break;
            }

        }
        sc.close();
    }
}
