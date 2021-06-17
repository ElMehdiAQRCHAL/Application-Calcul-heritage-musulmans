
public class Fille extends Fard
{
	protected boolean moassib;
	public Fille(String ex_fille,int nbr_fille)
	{
		String c="";
		c=ex_fille;
		if(c.equals("Non")==true)
		{
			existe=false;
		}
		if(c.equals("Oui")==true)
		{
			existe=true;
		}
		SetNbr(nbr_fille);
	}
	
	public void SetNbr(int nbr_fille)
	{
		int a;
		if(existe==true)
		{
			a=nbr_fille;
			this.nbr=a;
		}
		else
		{
			this.nbr=0;
		}
	}
	
	public void SetCoefficient()
	{
		if(moassib==true)
		{
			SetStatut("taassib");
		}
		else
		{
			if(nbr==1)
			{
				this.x=1;
				this.y=2;
			}
			if(nbr>1)
			{
				this.x=2;
				this.y=3;
			}
			SetStatut("fard");
		}
	}
	
	public void ExisteMoassib(Fils fils)
	{
		if(fils.GetExiste()==true)
		{
			moassib=true;
		}
		else
		{
			moassib=false;
		}
	}
}
