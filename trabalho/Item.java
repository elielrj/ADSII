package ADSII.trabalho;

public class Item {

    private int id_item;
    private String nome;
    private int tamanho;
    private String tipo;
    private String cor;

    public Item(int id_item, String nome, String tipo, int tamanho, String cor) {
        this.id_item = id_item;
        this.nome = nome;
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String imprimirItem() {
        String item;
        item = "Id: " + this.getId_item() + "\nNome: " + this.getNome() + "\nTamanho: " + this.getTamanho() + "\nTipo: " + this.getTipo() + "\nCor: " + this.getCor() + "\n";
        return item;
    }

    public int getId_item() {
        return id_item;
    }

    public int getTamanho() {
        return tamanho;
    }

    public String getCor() {
        return cor;
    }
}
