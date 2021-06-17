import java.util.Scanner;

public class FilsDeFils extends Taassib
{
	protected boolean hajib;
	
	public FilsDeFils(String ex_filsdefils,int nbr_filsdefils)
	{
		Scanner sc = new Scanner(System.in);
		String c="";
		System.out.println("Est-ce qu\'il a des fils de son fils : ");
		c=ex_filsdefils;
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
		SetNbr(nbr_filsdefils);
	}
	
	public void SetNbr(int nbr_filsdefils)
	{
		int a;
		Scanner sc = new Scanner(System.in);
		if(existe==true)
		{
			System.out.println("Donner le nombre des fils de son fils : ");
			a=nbr_filsdefils;
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
	
	public void ExisteHajib(Fils fils)
	{
		if(fils.GetExiste()==true)
		{
			hajib=true; 
		}
		else
		{
			hajib=false;
		}
	}
}
