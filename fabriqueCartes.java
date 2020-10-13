package cartes;

import java.util.Random;

public class FabriqueCartes {

    private static FabriqueCartes INSTANCE;

    private static int valeur_max;

    private static int valeur_min;

    private FabriqueCartes()
    {
      this.INSTANCE;
      this.valeur_max = 1;
      this.valeur_min = 8;
    }

    public static FabriqueCartes getInstance()
    {
      INSTANCE = new FabriqueCartes();
        return INSTANCE;
    }

    public PaquetDeCartes getPaquet32()
    {
      a =  new PaquetDeCartes();
      PaquetDeCartes pdc = a ;
      for (Couleur couleur : Couleur.values())
      {
        int i;
        for (i = valeur_min; i <= valeur_max; i++)
        {
          card = new Carte(i, couleur);
          Carte cardColor = card;
          pdc.ajouter(cardColor);
        }
      }
      return pdc;
    }

    public PaquetDeCartes getPaquet1Vert()
    {
        random = new Random();
        cartes = new PaquetDeCartes();
        color = new Carte(valeur, Couleur.VERT)

        Random ch = random;
        int valeur = ch.nextInt(valeur_max + 1);
        Carte onlyVert = color;
        PaquetDeCartes pdc = cartes;


        pdc.ajouter(onlyVert);

        return pdc;
    }

}
