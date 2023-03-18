public class Imobiliaria {
    String nome;
    String telefone;
    String cidade;

    Apartamento[] apartamentos = new Apartamento[30];

    public Imobiliaria(String nome, String telefone, String cidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.cidade = cidade;
    }

    void addApartamento (Apartamento apto){
        for (int i = 0; i < apartamentos.length; i++) {
            if (apartamentos[i]==null){
                apartamentos[i] = apto;
                break;
            }
        }
    }

    void ajustaAluguel(){
        for (int i = 0; i < apartamentos.length; i++) {
            if (apartamentos[i]!=null){
                apartamentos[i].aluguel = apartamentos[i].aluguel*0.05+apartamentos[i].aluguel;
                System.out.println("Aluguel ajustado: "+apartamentos[i].aluguel);
            }
        }
    }

    void mediaArea(){
        double area = 0;
        int cont = 0;
        int media;
        double m;
        for (int i = 0; i < apartamentos.length; i++) {
            if (apartamentos[i]!=null){
                if (apartamentos[i].numQuartos <= 2){
                    area += apartamentos[i].area;
                    cont ++;
                }
                m = area/cont;
                media= (int)m;
                System.out.println("Media da area: "+media);
            }
        }
    }

    void mostraInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Telefone: "+this.telefone);
        System.out.println("Cidade: "+this.cidade);
        for (int i = 0; i < apartamentos.length; i++) {
            if (apartamentos[i]!=null){
                apartamentos[i].mostraInfo();
            }
        }
    }

}
