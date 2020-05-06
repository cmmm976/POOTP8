
/**
 * Cette classe permet de lever des exceptions sur le salaire d'un employé.
 *
 * @author  Charles-Meldhine Madi Mnemoi
 * @version 05/12/2019
 */
public class SalaireException extends Exception
{
    public SalaireException()
    {
        System.out.println("Le salaire est trop bas!");
    }
}
