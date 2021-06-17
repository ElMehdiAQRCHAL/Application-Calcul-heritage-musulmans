import java.util.Scanner;

public class FilsDeFrere extends Taassib
{
	protected boolean hajib;
	
	public FilsDeFrere(String ex_filsdefrere,int nbr_filsdefrere)
	{
		Scanner sc = new Scanner(System.in);
		String c="";
		System.out.println("Est-ce qu\'il a des fils de son frere : ");
		c=ex_filsdefrere;
		while(c.equals("Oui")==false && c.equals("Non")==false)
		{
			System.out.println("Vous devez repondre soit par \'Oui\' ou par \'Non\'");
			c=sc.next();
		}
		if(c.equals("Non")==true)
		{
			existe=false;
		}
		if(c.equals("Oui")==true)
		{
			existe=true;
		}
		SetNbr(nbr_filsdefrere);
	}
	
	public void SetNbr(int nbr_filsdefrere)
	{
		int a;
		Scanner sc = new Scanner(System.in);
		if(existe==true)
		{
			System.out.println("Donner le nombre de fils de son frere : ");
			a=nbr_filsdefrere;
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
	
	public void ExisteHajib(Fils fils,FilsDeFils filsfils,Pere pere,GrandPereDePere gdpp,Frere frere,FrereDePere frerepere,Soeur soeur,SoeurDePere soeurpere)
	{
		if(fils.GetExiste()==true || filsfils.GetExiste()==true || pere.GetExiste()==true || gdpp.GetExiste()==true || frere.GetExiste()==true || frerepere.GetExiste()==true || (soeur.GetExiste()==true && soeur.GetStatut()=="taassib avec fille") || (soeurpere.GetExiste()==true && soeurpere.GetStatut()=="taassib avec fille"))
		{
			hajib=true; 
		}
		else
		{
			hajib=false;
		}
	}
}
