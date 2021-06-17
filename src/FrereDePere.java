
public class FrereDePere extends Taassib
{
	protected boolean hajib;
	protected boolean casfrere;
	
	public FrereDePere(String ex_freredepere,int nbr_freredepere)
	{
		String c="";
		c=ex_freredepere;
		if(c.equals("Non")==true)
		{
			existe=false;
		}
		if(c.equals("Oui")==true)
		{
			existe=true;
		}
		SetNbr(nbr_freredepere);
	}
	
	public void SetNbr(int nbr_freredepere)
	{
		int a;
		if(existe==true)
		{
			a=nbr_freredepere;
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
			if(casfrere==true)
			{
				SetStatut("CasFrere");
			}
			else
			{
				SetStatut("taassib");
			}
		}
	}
	
	public void ExisteHajib(Fils fils,FilsDeFils filsfils,Pere pere,GrandPereDePere gdpp,Frere frere,Soeur soeur)
	{
		if(fils.GetExiste()==true || filsfils.GetExiste()==true || pere.GetExiste()==true || frere.GetExiste()==true || (soeur.GetExiste()==true && soeur.GetStatut()=="taassib avec fille"))
		{
			hajib=true; 
		}
		else
		{
			hajib=false;
		}
	}
	
	public void CasFrere(GrandPereDePere gdpp)
	{
		if(gdpp.GetStatut()=="CasFrere" && gdpp.GetZ()==1)
		{
			casfrere=true;
		}
		else
		{
			casfrere=false;
		}
	}
}
