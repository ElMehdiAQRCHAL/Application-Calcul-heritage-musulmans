import java.util.Scanner;

public class OncleDePere extends Taassib
{
	protected boolean hajib;
	
	public OncleDePere(String ex_oncledepere,int nbr_oncledepere)
	{
		Scanner sc = new Scanner(System.in);
		String c="";
		System.out.println("Est-ce qu\'il a des oncles de la parts de son pere : ");
		c=ex_oncledepere;
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
		SetNbr(nbr_oncledepere);
	}
	
	public void SetNbr(int nbr_oncledepere)
	{
		int a;
		Scanner sc = new Scanner(System.in);
		if(existe==true)
		{
			System.out.println("Donner le nombre d'oncles de la part de son pere : ");
			a=nbr_oncledepere;
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
	
	public void ExisteHajib(Fils fils,FilsDeFils filsfils,Pere pere,GrandPereDePere gdpp,Frere frere,FrereDePere frerepere,Soeur soeur,SoeurDePere soeurpere,FilsDeFrere filsfrere,FilsDeFrereDePere filsfrerepere,Oncle oncle)
	{
		if(fils.GetExiste()==true || filsfils.GetExiste()==true || pere.GetExiste()==true || gdpp.GetExiste()==true || frere.GetExiste()==true || frerepere.GetExiste()==true || (soeur.GetExiste()==true && soeur.GetStatut()=="taassib avec fille") || (soeurpere.GetExiste()==true && soeurpere.GetStatut()=="taassib avec fille") || filsfrere.GetExiste()==true || filsfrerepere.GetExiste()==true || oncle.GetExiste()==true)
		{
			hajib=true; 
		}
		else
		{
			hajib=false;
		}
	}
}
