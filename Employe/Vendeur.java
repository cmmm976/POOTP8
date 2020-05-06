
/**
 * Cette classe décrit un vendeur.
 *
 * @author Charles-Meldhine Madi Mnemoi
 * @version 05/12/2019
 */
public class Vendeur extends Employe
{
    private int ventes;

    /**
     * Constructeur d'objets de classe Vendeur
     */
    public Vendeur(String nom, double revenu, int ventes)
    {
        super(nom,revenu);
        bonus = bonusVentes*ventes;
    }
    
    /**
     * Autre constructeur d'objets de classe Vendeur
     */
    public Vendeur(String nom, double revenu)
    {
        super(nom,revenu);
    }
    
    /**
     * actualise le nombre de ventes d'un vendeur
     */
    
    public void setVentes(int ventes)
    {
        this.ventes = ventes;
    }
    
    /**
     * actualise le bonus d'un vendeur
     */
    protected void setBonus()
    {
        bonus = bonusVentes*ventes;
    }
    /**
     * affiche les caractéristiques d'un vendeur
     */
    public String toString()
    {
        return super.toString() + "\nC’est un vendeur qui a fait un chiffre de vente de "+ ventes+".";
    }
}

