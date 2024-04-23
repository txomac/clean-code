package ex2;

public class LivretA extends CompteBancaire {

    public LivretA(String type, double solde, double tauxRemuneration) {
        super(type, solde, 0, tauxRemuneration);
    }

    public void appliquerRemuAnnuelle() {
        if (this.getType().equals("LA")) {
            this.setSolde(this.getSolde() + (this.getSolde() * this.getTauxRemuneration() / 100));
        }
    }

}
