package ADSII.Aula12.gerarArquivos;

public class ArquivoPDF implements Arquivo{
    @Override
    public void gerarPDF() {
        System.out.println("Arquivo PDF gerado");
    }

    @Override
    public void gerarXML() {
        System.out.println("Arquivo não suportado");
    }
}
