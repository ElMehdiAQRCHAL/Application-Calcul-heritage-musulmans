import java.util.Scanner;

public class FilsOncle extends Taassib
{
	protected boolean hajib;
	
	public FilsOncle(String ex_filsoncle,int nbr_filsoncle)
	{
		Scanner sc = new Scanner(System.in);
		String c="";
		System.out.println("Est-ce qu\'il a des fils de son oncle : ");
		c=ex_filsoncle;
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
		SetNbr(nbr_filsoncle);
	}
	
	public void SetNbr(int nbr_filsoncle)
	{
		int a;
		Scanner sc = new Scanner(System.in);
		if(existe==true)
		{
			System.out.println("Donner le nombre de fils de son oncle : ");
			a=nbr_filsoncle;
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
	
	public void ExisteHajib(Fils fils,FilsDeFils filsfils,Pere pere,GrandPereDePere gdpp,Frere frere,FrereDePere frerepere,Soeur soeur,SoeurDePere soeurpere,FilsDeFrere filsfrere,FilsDeFrereDePere filsfrerepere,Oncle oncle,OncleDePere onclepere)
	{
		if(fils.GetExiste()==true || filsfils.GetExiste()==true || pere.GetExiste()==true || gdpp.GetExiste()==true || frere.GetExiste()==true || frerepere.GetExiste()==true || (soeur.GetExiste()==true && soeur.GetStatut()=="taassib avec fille") || (soeurpere.GetExiste()==true && soeurpere.GetStatut()=="taassib avec fille") || filsfrere.GetExiste()==true || filsfrerepere.GetExiste()==true || oncle.GetExiste()==true || onclepere.GetExiste()==true)
		{
			hajib=true; 
		}
		else
		{
			hajib=false;
		}
	}
}
