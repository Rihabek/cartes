package cartes;

import java.util.ArrayList;
import java.util.Collections;

public class PaquetDeCartes
{
  private static

    private static int nb_cartes_max = 32;

    private ArrayList<Carte> cartes;

    public PaquetDeCartes()
    {
      tab = new ArrayList<>(nb_cartes_max);
      
        this.cartes = a;
    }

    public void ajouter(Carte... cartes)
    {
      for (Carte addCarte : cartes)
      {
        this.carte.add(addCarte);
      }
    }

    public int getNombreDeCartes()
    {
      size = cartes.size();
        return size;
    }

    public Carte piocher()
    {
        int sommet;
        Carte cardPulled;
        sommet = getNombreDeCartes() - 1;
        if (!estVide())
        {
            cardPulled = this.cartes.remove(sommet);
        } else {
            assert !estVide() : "The packet is empty No card left!!";
            cardPulled = null;
        }
        return cardPulled;
    }

    public boolean estVide()
    {
      empty = cartes.isEmpty();
        return empty;

    }

    public void melanger()
    {
      a = this.cartes;
      Collections.shuffle(a);
    }

    public void retourner()
    {
      a = this.cartes;
      Collections.reverse(a);
    }

    public void ajouter(PaquetDeCartes pdc)
    {
      a = pdc.cartes;
      this.cartes.addAll(a);
    }

    public Carte getSommet()
    {
      int sommet;
      Carte cardPulled;
      sommet = getNombreDeCartes()-1;
      if (!estVide())
      {
        cardPulled = this.cartes.remove(sommet);
      } else {
        assert !estVide() : "The packet is empty No card left!!";
        cardPulled = null;
      }
      return cardPulled;
    }

    public String toString()
    {
      classGetter = this.getClass();
      nameGetter = getName();
      cartes = this.cartes;
        return String.format("%s{cartes=%s}",classGetter.nameGetter,cartes);
    }
}
