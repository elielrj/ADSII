package ADSII.Aula10.polimorfisco;

public class Pessoa {

    private String nome;
    private Cumprimento cumprimento;

    public Pessoa(String nome, Cumprimento cumprimento) {
        this.nome = nome;
        this.cumprimento = cumprimento;
    }

    public String getNome() {
        return nome;
    }


    public String cumprimento(){
        return cumprimento.getValor();
    }

}
