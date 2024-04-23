package ex3;

import java.util.List;

public class Zoo {
    private String zooName;
    private List<Animal> animaux;

    public Zoo(String zooname) {
        this.zooName = zooname;
    }

    public void addAnimal(String nomAnimal, String typeAnimal, String comportement) {
        Animal animal = new Animal(nomAnimal, typeAnimal, comportement);
        this.animaux.add(animal);
    }

    public void afficherListeAnimaux() {
        for (Animal animal : animaux) {
            System.out.println(animal.getName() + " " + animal.getType() + " " + animal.getComportement());
        }
    }


    public int taille() {
        return animaux.size();
    }

    /**
     * Getter for nom
     *
     * @return the nom
     */
    public String getNom() {
        return zooName;
    }

    /**
     * Setter
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.zooName = nom;
    }
}
