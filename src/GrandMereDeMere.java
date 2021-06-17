
public class GrandMereDeMere extends Fard
{
	private boolean presenceMere;
	
	public GrandMereDeMere(String ex_gdmm)
	{
		String c="";
		c=ex_gdmm;
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
	
	public void SetCoefficient(int a,boolean m)
	{
		if(presenceMere==false)
		{
			SetStatut("fard");
			if(a>1 && m==false)
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
}
