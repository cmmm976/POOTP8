
/**
 * Décrivez votre classe Programmeuir ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Programmeur extends Employe
{
    private int chezClient;
    private int erreursCorrigees;

    /**
     * Constructeur d'objets de classe Programmeur
     */
    public Programmeur(String nom, double revenu)
    {
        super(nom,revenu);
        chezClient = 0;
        erreursCorrigees = 0;
    }
    /**
     * Atre Constructeur d'objets de classe Programmeur
     */
    public Programmeur(String nom, double revenu, boolean chezClient)
    {
        super(nom,revenu);
        if(chezClient)
        {
            this.chezClient = 1;
        }
        else
        {
            this.chezClient = 0;
        }
        
        erreursCorrigees = 0;
    }
    /**
     * Encore un autre Constructeur d'objets de classe Programmeur
     */
    public Programmeur(String nom, double revenu, boolean chezClient, int erreursCorrigees)
    {
        super(nom,revenu);
        if(chezClient)
        {
            this.chezClient = 1;
        }
        else
        {
            this.chezClient = 0;
        }
        this.erreursCorrigees = erreursCorrigees;
    }

    /**
     * actualise le statut d'être chez un client
     *
     */
    public void setChezClient(boolean b)
    {
        if(b)
        {
            chezClient = 1;
        }
        else
        {
            chezClient = 0;
        }
    }
    
    /**
     * actualise le nombre d'erreurs corrigées d'un programmeur
     */
    public void setErreursCorrigees(int e)
    {
        erreursCorrigees = e;
    }
    
    /**
     * actualise le bonus d'un programmeur
     */
    protected void setBonus()
    {
        bonus = bonusErreurs*erreursCorrigees + bonusChezClient*chezClient;
    }
    /**
     * affiche les caractéristiques d'un vendeur
     */
    public String toString()
    {
        if(chezClient == 0){
            return super.toString() + "\nC’est un programmeur qui a corrigé "+ erreursCorrigees +" erreurs.";
        }
        else
        {
           return super.toString() + "\nC’est un programmeur qui a corrigé "+ erreursCorrigees +" erreurs chez un client.";
        }
        
    }
}
