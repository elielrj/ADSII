package ADSII.trabalho;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {

        //criação de 1 "item bicicleta" para escolha inicial do usuário, atravéns do site (página home)
        Item itemBicibleta = new Item(1,"Bicicleta", "Masculina", 17, "Azul");

        //1 Inicializar
        Sistema sistemaElielJoniRichard = new Sistema();

        //2 Escolher Item
        ArrayList<Item> itensPossiveis = new ArrayList<>();
        itensPossiveis = sistemaElielJoniRichard.escolherItem(itemBicibleta);

        System.out.println("Itens possíveis: \n");
        for(Item item: itensPossiveis){
            System.out.println(item.imprimirItem());
        }

        //escolha de 1 item pelo usuário
        Item itemEscolhido = null;

        for(Item item: itensPossiveis) {
            if (item.getTipo().equals("Feminina")) {
                itemEscolhido = item;
            }
        }
        sistemaElielJoniRichard.escolherItemPersonalizado(itemEscolhido);

        System.out.println("Item Escolhido pelo usuário:\n" + sistemaElielJoniRichard.imprimirItem());
    }
}
