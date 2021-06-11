package ADSII.Aula12.gerarArquivos;

public class ArquivoXML implements Arquivo{
    @Override
    public void gerarPDF() {
        System.out.println("Arquivo não suportado");
    }

    @Override
    public void gerarXML() {
        System.out.println("Arquivo XML gerado");
    }
}
