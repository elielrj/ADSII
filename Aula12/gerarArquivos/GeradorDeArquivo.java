package ADSII.Aula12.gerarArquivos;

import java.util.ArrayList;
import java.util.List;

public class GeradorDeArquivo {

    private List<Arquivo> arquivos;

    public GeradorDeArquivo() {
        arquivos = new ArrayList<>();
    }

    public void gerarArquivo(List<Arquivo> arquivos){
        for(Arquivo arq: arquivos){
            if(arq instanceof ArquivoPDF){
                arq.gerarPDF();
            }else if(arq instanceof ArquivoXML){
                arq.gerarXML();
            }
        }
    }
}
