
public class FilsDeFils extends Taassib
{
	protected boolean hajib;
	
	public FilsDeFils(String ex_filsdefils,int nbr_filsdefils)
	{
		String c="";
		c=ex_filsdefils;
		if(c.equals("Non")==true)
		{
			existe=false;
		}
		if(c.equals("Oui")==true)
		{
			existe=true;
		}
		SetNbr(nbr_filsdefils);
	}
	
	public void SetNbr(int nbr_filsdefils)
	{
		int a;
		if(existe==true)
		{
			a=nbr_filsdefils;
			this.nbr=a;
		}
		else
		{
			this.nbr=0;
		}
	}
	
	public void SetCoefficient()
	{
		if(hajib==true)
		{
			SetStatut("hajb");
		}
		else
		{
			SetStatut("taassib");
		}
	}
	
	public void ExisteHajib(Fils fils)
	{
		if(fils.GetExiste()==true)
		{
			hajib=true; 
		}
		else
		{
			hajib=false;
		}
	}
}
