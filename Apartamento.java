public class Apartamento {
    String endereco;
    int numQuartos;
    double area;
    double aluguel;

    public Apartamento(String endereco, int numQuartos, double area, double aluguel) {
        this.endereco = endereco;
        this.numQuartos = numQuartos;
        this.area = area;
        this.aluguel = aluguel;
    }

    void mostraInfo(){
        System.out.println("Endereco: "+this.endereco);
        System.out.println("Numero de quartos: "+this.numQuartos);
        System.out.println("Area: "+this.area);
        System.out.println("Aluguel: "+this.aluguel);
    }
}
