package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

    private List<Caisse> caisses;

    public Inventaire(int minSize, int maxSize) {
        caisses = new ArrayList<>();
        caisses.add(new Caisse("Petits objets", minSize, maxSize));
        caisses.add(new Caisse("Moyens objets", minSize, maxSize));
        caisses.add(new Caisse("Grands objets", minSize, maxSize));
    }

    public void addItem(Item item) {
        for (Caisse caisse : caisses){
            if (caisse.peutContenirItem(item)){
                caisse.getItems().add(item);
                return;
            }
        }
    }

    public int taille() {
        int total = 0;
        for (Caisse caisse : caisses) {
            total += caisse.getItems().size();
        }
        return total;
    }

}
