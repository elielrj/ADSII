package ADSII.Aula11.lsp.ave;

public class Avestruz extends Ave{
    @Override
    public void voa() {
        throw new RuntimeException("Avestruz não voa");
    }
}
