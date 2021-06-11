package ADSII.Aula12.gerarArquivos;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArquivoXML arquivoXML = new ArquivoXML();
        ArquivoPDF arquivoPDF = new ArquivoPDF();

        ArrayList<Arquivo> lista = new ArrayList<>();

        lista.add(arquivoXML);
        lista.add(arquivoPDF);

        GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
        geradorDeArquivo.gerarArquivo(lista);
    }
}
