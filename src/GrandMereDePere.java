
public class GrandMereDePere extends Fard
{
	private boolean presenceMere;
	private boolean presencePere;
	
	
	public GrandMereDePere(String ex_gdmp)
	{
		String c="";
		c=ex_gdmp;
		if(c.equals("Non")==true)
		{
			existe=false;
		}
		if(c.equals("Oui")==true)
		{
			existe=true;
		}
		SetNbr();
	}
	
	public void SetNbr()
	{
		if(existe==true)
		{
			this.nbr=1;
		}
		else
		{
			this.nbr=0;
		}
	}
	
	public void SetCoefficient(int a)
	{
		if(presenceMere==false && presencePere==false)
		{
			SetStatut("fard");
			if(a>1)
			{
				this.x=1;
				this.y=12;
			}
			else
			{
				this.x=1;
				this.y=6;
			}
		}
		else
		{
			SetStatut("hajb");
		}
	}
	
	public void PresenceMere(Mere m)
	{
		if(m.GetExiste()==true)
		{
			presenceMere=true;
		}
		else
		{
			presenceMere=false;
		}
	}
	
	public void PresencePere(Pere p)
	{
		if(p.GetExiste()==true)
		{
			presencePere=true;
		}
		else
		{
			presencePere=false;
		}
	}
}
