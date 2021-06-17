
public class FilsOncleDePere extends Taassib
{
	protected boolean hajib;
	
	public FilsOncleDePere(String ex_filsoncledepere,int nbr_filsoncledepere)
	{
		String c="";
		c=ex_filsoncledepere;
		if(c.equals("Non")==true)
		{
			existe=false;
		}
		if(c.equals("Oui")==true)
		{
			existe=true;
		}
		SetNbr(nbr_filsoncledepere);
	}
	
	public void SetNbr(int nbr_filsoncledepere)
	{
		int a;
		if(existe==true)
		{
			a=nbr_filsoncledepere;
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
	
	public void ExisteHajib(Fils fils,FilsDeFils filsfils,Pere pere,GrandPereDePere gdpp,Frere frere,FrereDePere frerepere,Soeur soeur,SoeurDePere soeurpere,FilsDeFrere filsfrere,FilsDeFrereDePere filsfrerepere,Oncle oncle,OncleDePere onclepere,FilsOncle filsoncle)
	{
		if(fils.GetExiste()==true || filsfils.GetExiste()==true || pere.GetExiste()==true || gdpp.GetExiste()==true || frere.GetExiste()==true || frerepere.GetExiste()==true || (soeur.GetExiste()==true && soeur.GetStatut()=="taassib avec fille") || (soeurpere.GetExiste()==true && soeurpere.GetStatut()=="taassib avec fille") || filsfrere.GetExiste()==true || filsfrerepere.GetExiste()==true || oncle.GetExiste()==true || onclepere.GetExiste()==true || filsoncle.GetExiste()==true)
		{
			hajib=true; 
		}
		else
		{
			hajib=false;
		}
	}
}
