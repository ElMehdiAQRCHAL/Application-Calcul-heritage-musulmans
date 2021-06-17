import java.util.Scanner;

public class Mere extends Fard
{
	private int nbrFrere;
	
	public Mere(String ex_mere)
	{
		Scanner sc = new Scanner(System.in);
		String c="";
		System.out.println("Est-ce qu\'il a une mere : ");
		c=ex_mere;
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
		SetNbr();
	}
	
	public void SetNbr()
	{
		if(existe==true)
		{
			this.nbr=1;
		}
		else
		{
			this.nbr=0;
		}
	}
	
	public void SetCoefficient()
	{
		SetStatut("fard");
		if(branche==false && nbrFrere<=1)
		{
			this.x=1;
			this.y=3;
		}
		else
		{
			this.x=1;
			this.y=6;
		}
	}
	
	public void SetNbrFrere(Frere f,FrereDePere fp,FrereDeMere fm,Soeur s,SoeurDePere sp,SoeurDeMere sm)
	{
		this.nbrFrere=f.GetNbr()+fp.GetNbr()+fm.GetNbr()+s.GetNbr()+sp.GetNbr()+sm.GetNbr();
	}
	
}
