/** example of custom exception 
 */
class GamesException extends Exception
{ GamesException (String s)
{ 	super (s);	} }
class Tournament 
{
void validateGame (String str) throws GamesException
{
	if  (str.equals("cricket")!= true)
	{		throw new GamesException("only for cricket allowed"); 	}
	else 
	{		System.out.println("Do you want to play cricket!"); 	}
	} }
public class Games {
	public static void main(String[] args) {
				
		Tournament tt= new Tournament ();
		try {
			tt.validateGame ("cricket");
		} catch (GamesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	} }
