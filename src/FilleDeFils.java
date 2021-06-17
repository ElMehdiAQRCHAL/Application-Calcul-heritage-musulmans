
public class FilleDeFils extends Fard
{
	protected boolean moassib;
	protected boolean existeFille;
	
	public FilleDeFils(String ex_filledefils,int nbr_filledefils)
	{
		String c="";
		c=ex_filledefils;
		if(c.equals("Non")==true)
		{
			existe=false;
		}
		if(c.equals("Oui")==true)
		{
			existe=true;
		}
		SetNbr(nbr_filledefils);
	}
	public void SetNbr(int nbr_filledefils)
	{
		int a;
		if(existe==true)
		{
			a=nbr_filledefils;
			this.nbr=a;
		}
		else
		{
			this.nbr=0;
		}
	}
	
	public void SetCoefficient()
	{
		if(branche == true)
		{
			SetStatut("hajb");
		}
		else
		{
			if(moassib==true)
			{
				SetStatut("taassib");
			}
			else
			{
				SetStatut("fard");
				if(existeFille==false)
				{
					if(nbr>1)
					{
						this.x=2;
						this.y=3;
					}
					if(nbr==1)
					{
						this.x=1;
						this.y=2;
					}
				}
				else
				{
					this.x=1;
					this.y=6;
				}
			}
		}
	}
	
	public void ExisteMoassib(FilsDeFils filsfils)
	{
		if(filsfils.GetExiste()==true)
		{
			moassib=true;
		}
		else
		{
			moassib=false;
		}
	}
	
	public void SetBrancheHaut(Fils fils,Fille fille)
	{
		if(fils.GetExiste()==true || fille.GetNbr()>1)
		{
			branche=true;
		}
		else
		{
			branche=false;
		}
	}
	
	public void ExisteFille(Fille fille)
	{
		if(fille.GetExiste()==true)
		{
			existeFille=true;
		}
		else
		{
			existeFille=false;
		}
	}
}
