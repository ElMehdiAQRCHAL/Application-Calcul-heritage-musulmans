import java.util.Scanner;

public class Fils extends Taassib
{
	public Fils(String ex_fils,int nbr_fils)
	{
		Scanner sc = new Scanner(System.in);
		String c="";
		System.out.println("Est-ce qu\'il a des fils : ");
		c=ex_fils;
		System.out.println(ex_fils);
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
		SetNbr(nbr_fils);
		SetStatut("taassib");
	}
	
	public void SetNbr(int nbr_fils)
	{
		int a;
		Scanner sc = new Scanner(System.in);
		if(existe==true)
		{
			System.out.println("Donner le nombre de fils : ");
			a=nbr_fils;
			this.nbr=a;
		}
		else
		{
			this.nbr=0;
		}
	}
}
