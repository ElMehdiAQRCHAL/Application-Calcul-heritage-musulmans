
public class Femme extends Fard
{
	public Femme()
	{
	
	}
	
	public void SetNbr(int nbr_femme)
	{
		int a;
		if(existe==true)
		{
			a=nbr_femme;
			this.nbr=a;
		}
		else
		{
			this.nbr=0;
		}
	}
	

	
	public void SetCoefficient()
	{
		SetStatut("fard");
		if(branche==false)
		{
			this.x=1;
			this.y=4;
		}
		else
		{
			this.x=1;
			this.y=8;
		}
	}
	
	public void SetExiste(boolean a)
	{
		this.existe=a;
	}
}
