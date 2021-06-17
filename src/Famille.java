import java.util.*;
public class Famille
{
	protected int nbr;
	protected boolean existe;
	protected String statut;
	protected double solde=0;
	
	public void SetNbr()
	{
		int a;
		Scanner sc = new Scanner(System.in);
		if(existe==true)
		{
			System.out.println("Donner le nombre : ");
			a=sc.nextInt();
			this.nbr=a;
		}
		else
		{
			this.nbr=0;
		}
	}
	
	public void SetExiste()
	{
		Scanner sc = new Scanner(System.in);
		String c="";
		System.out.println("Est-ce qu\'il existe");
		c=sc.next();
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
	}
	
	public int GetNbr()
	{
		return nbr;
	}
	
	public boolean GetExiste()
	{
		return existe;
	}
	
	public void SetStatut(String c)
	{
		statut=c;
	}
	
	public String GetStatut()
	{
		return statut;
	}
	
	public void SetSolde(double somme)
	{
		this.solde=somme;
	}
	
	public double GetSolde()
	{
		return solde;
	}
}
