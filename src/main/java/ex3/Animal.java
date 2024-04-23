package ex3;

public class Animal {
    private String name;
    private String type;
    private String comportement;

    public Animal(String name, String type, String comportement) {
        this.name = name;
        this.type = type;
        this.comportement = comportement;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getComportement() {
        return comportement;
    }
}
