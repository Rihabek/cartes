package cartes;

public enum Couleur {

    JAUNE("JAUNE"),VERT("VERT"),ROUGE("ROUGE"),BLEU("BLEU");

    private final String nom;

    private Couleur(String nom)
    {
        this.nom = nom;
    }

    public String getNom()
    {
        return this.nom;
    }

    public String toString()
    {
      classGetter = this.getClass();
      nameGetter = getName();
        return String.format("%s{couleur=%s}",classGetter.nameGetter,this.nom);
    }

}
