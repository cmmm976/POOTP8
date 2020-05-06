
/**
 * Cette classe décrit un employé.
 *
 * @author Charles-Meldhine Madi Mnemoi
 * @version 05/12/2019
 */

import java.util.Scanner;

public abstract class Employe
{
    protected final String nom;
    protected double revenu;
    protected double prime;
    protected double bonus;
    public final double bonusVentes = 1.05;
    public final double bonusProjets = 100;
    public final double bonusErreurs = 10;
    public final double bonusChezClient = 500;
    
    
    /**
     * Constructeur d'objets de classe Employe
     */
    public Employe(String nom, double revenu)
    {
        this.nom = nom;
        try{
              this.revenu = revenu;
              if(revenu < 1000){
                    throw new SalaireException();
             
              }
        }
        catch (SalaireException e){
              System.out.println(e.getMessage());
              
        }
       
        prime = 0;
        bonus = 0;

   }
   /**
    * retourne le nom d'un employé
    */
   public String getNom(){
         return nom;
   }
   /**
    * retourne le revenu d'un employé
    */
   public double getRevenu()
   {
       return revenu;
   }
   /**
    * calcule le salaire d'un employé
    */
   public double calculerSalaire()
   {
       setBonus();
       return 12*revenu + prime + bonus;
   }
   /**
    * affichre les caractéristiques d'un employé
    */
   public String toString()
   {
       if(prime > 0)
       {
           return "L'employé "+nom+" a un salaire annuel de "+revenu+" qui comprend une prime de "+prime+";";
       }
       else
       {
           return "L'employé "+nom+" a un salaire annuel de "+calculerSalaire();
       }
   }
   
   /**
     * actualise le bonus d'un employé
     */
   abstract void setBonus();
   
   /**
    * permet à un employé de définir sa prime
    */
   public void demandePrime()
   {
       Scanner clavier = new Scanner(System.in);
       int nombreDeTentatives = 0;
       
       System.out.println("Saississez votre prime");
       
       clavier.nextDouble(); // demande de la saisie
       clavier.nextLine(); // purger clavier des données précédentes
								
       
       
       clavier.close();
    }
}
