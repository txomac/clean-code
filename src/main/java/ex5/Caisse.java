package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

    private String nom;
    private List<Item> items;
    private int min_size;
    private int max_size;

    /**
     * Constructeur
     *
     * @param nom
     * @param minSize
     * @param maxSize
     */
    public Caisse(String nom, int minSize, int maxSize) {
        super();
        this.nom = nom;
        min_size = minSize;
        max_size = maxSize;
        this.items = new ArrayList<>();
    }

    public boolean peutContenirItem(Item item) {
        int poidsTotal = items.stream().mapToInt(Item::getPoids).sum();
        int nouvelPoidsTotal = poidsTotal + item.getPoids();

        return nouvelPoidsTotal <= max_size &&
                (nouvelPoidsTotal < 5 || (nouvelPoidsTotal >= 5 && nouvelPoidsTotal <= 20) || nouvelPoidsTotal >= 20);
    }




    /**
     * Getter pour l'attribut nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour l'attribut nom
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter pour l'attribut items
     *
     * @return the items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * Setter pour l'attribut items
     *
     * @param items the items to set
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }
}
