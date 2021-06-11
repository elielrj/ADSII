package ADSII.Aula10.polimorfisco;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("ana", new Formal());
        System.out.println(pessoa.cumprimento());


        Pessoa pessoa2 = new Pessoa("ana", new Casual("E aí"));
        System.out.println(pessoa2.cumprimento());

        Pessoa pessoa3 = new Pessoa("ana", new Academico());
        System.out.println(pessoa3.cumprimento());

    }

}
