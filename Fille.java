import java.util.Scanner;

public class Fille extends Fard
{
	protected boolean moassib;
	public Fille(String ex_fille,int nbr_fille)
	{
		Scanner sc = new Scanner(System.in);
		String c="";
		System.out.println("Est-ce qu\'il a des filles : ");
		c=ex_fille;
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
		SetNbr(nbr_fille);
	}
	
	public void SetNbr(int nbr_fille)
	{
		int a;
		Scanner sc = new Scanner(System.in);
		if(existe==true)
		{
			System.out.println("Donner le nombre de filles : ");
			a=nbr_fille;
			this.nbr=a;
		}
		else
		{
			this.nbr=0;
		}
	}
	
	public void SetCoefficient()
	{
		if(moassib==true)
		{
			SetStatut("taassib");
		}
		else
		{
			if(nbr==1)
			{
				this.x=1;
				this.y=2;
			}
			if(nbr>1)
			{
				this.x=2;
				this.y=3;
			}
			SetStatut("fard");
		}
	}
	
	public void ExisteMoassib(Fils fils)
	{
		if(fils.GetExiste()==true)
		{
			moassib=true;
		}
		else
		{
			moassib=false;
		}
	}
}
