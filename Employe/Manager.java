
/**
 * Cette classe décrit un manager.
 *
 * @author Madi Mnemoi
 * @version 05/12/2019
 */
public class Manager extends Employe
{
    private int projetsTermines;
    
    /**
     * Constructeur d'objets de classe Manager
     */
    public Manager(String nom, double revenu)
    {
        super(nom,revenu);
    }
    /**
     * Constructeur d'objets de classe Manager
     */
    public Manager(String nom, double revenu, int projets)
    {
        super(nom,revenu);
        projetsTermines = projets;
    }

    /**
     * actualise le bonus d'un manager
     */
    protected void setBonus()
    {
        bonus = bonusProjets*projetsTermines;
    }
    /**
     * affiche les caractéristiques d'un vendeur
     */
    public String toString()
    {
        return super.toString() + "\nC’est un manager qui a terminé "+ projetsTermines +"projets.";
    }
}
