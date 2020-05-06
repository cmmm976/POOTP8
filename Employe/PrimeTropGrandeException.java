/**
 * Cette classe permet de lever des exceptions sur la prime d'un employé.
 *
 * @author  Charles-Meldhine Madi Mnemoi
 * @version 05/12/2019
 */
public class PrimeTropGrandeException extends Exception
{
    public PrimeTropGrandeException()
    {
        System.out.println("Votre prime est trop grande");
    }
}