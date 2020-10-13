
import java.util.ArrayList;
import java.util.Collections;


/**
* @author belkhadiri rihab
* PaquetDeCartes tests
*/


public class TestPaquetDeCartes
{
  public static void main()
  {
    TestPaquetDeCartes();
    TestEstVide();
    TestGetNombreDeCartes();
    // TestPiocher();
    TestAjouter();
    // TestMelanger();

    public static void TestGetNombreDeCartes()
    {
      FabriqueCartes fabriquecarte = FabriqueCartes.getInstance();
      int number = fabriquecarte.getPaquetVide().getNombreDeCartes();
      assert(b): "Erreur";
    }

    public static void TestAjouter()
    {
      PaquetDeCartes pdc = new PaquetDeCartes();
      int a;
      a = pdc.getNombreDeCartes();
      boolean b = a == 0;
      assert(b): "Erreur";

      Carte c1 = new C1(1,couleur.JAUNE);
      pdc.ajouter(c1);
      a= pdc.getNombreDeCartes();
      a =n ==0;
      assert(b): "Erreur";

      Cartes cartes = new C2 (2,Couleur.VERT);
      Cartes cartes = new C3 (3,Couleur.BLUE);

      pdc.ajouter(C1);
      pdc.ajouter(C2);
      pdc.ajouter(C3);

    }

    public static void TestEstVide()
    {
      FabriqueCartes fabriquecarte = FabriqueCartes.getInstance();
      boolean a = fabriquecarte.getPaquetVide().estVide();
      assert(b): "Erreur";
    }

    public static void TestMelanger()
    {
      boolean a;
      PaquetDeCartes pdc = new PaquetDeCartes();
      PaquetDeCartes pdc1 = new PaquetDeCartes();
      Cartes cartes = new C1 (1,Couleur.VERT);
      Cartes cartes = new C2 (2,Couleur.BLUE);

      pdc.ajouter(C1);
      pdc.ajouter(C2);
      pdc.melanger();
      a = pdc == pdc1;
      assert(b): "Erreur";
  
    }
  }
}
