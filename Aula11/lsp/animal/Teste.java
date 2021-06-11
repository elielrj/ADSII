package ADSII.Aula11.lsp.animal;

public class Teste {
    public static void main(String[] args) {
        Leao leao = new Leao();
        leao.come();

        Animal animal = new Leao();
        animal.come();


        Porco porco = new Porco();
        porco.come();

        Animal animal2 = new Porco();
        animal2.come();

        Tigre tigre = new Tigre();
        tigre.come();

        Animal animal3 = new Tigre();
        animal3.come();
    }
}
