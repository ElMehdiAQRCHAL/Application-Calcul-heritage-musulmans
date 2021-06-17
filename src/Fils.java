
public class Fils extends Taassib
{
	public Fils(String ex_fils,int nbr_fils)
	{
		String c="";
		c=ex_fils;
		if(c.equals("Non")==true)
		{
			existe=false;
		}
		if(c.equals("Oui")==true)
		{
			existe=true;
		}
		SetNbr(nbr_fils);
		SetStatut("taassib");
	}
	
	public void SetNbr(int nbr_fils)
	{
		int a;
		if(existe==true)
		{
			a=nbr_fils;
			this.nbr=a;
		}
		else
		{
			this.nbr=0;
		}
	}
}
