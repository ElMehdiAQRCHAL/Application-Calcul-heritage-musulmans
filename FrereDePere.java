import java.util.Scanner;

public class FrereDePere extends Taassib
{
	protected boolean hajib;
	protected boolean casfrere;
	
	public FrereDePere(String ex_freredepere,int nbr_freredepere)
	{
		Scanner sc = new Scanner(System.in);
		String c="";
		System.out.println("Est-ce qu\'il a des freres de la part de son pere : ");
		c=ex_freredepere;
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
		SetNbr(nbr_freredepere);
	}
	
	public void SetNbr(int nbr_freredepere)
	{
		int a;
		Scanner sc = new Scanner(System.in);
		if(existe==true)
		{
			System.out.println("Donner le nombre des freres de la part de son pere : ");
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
