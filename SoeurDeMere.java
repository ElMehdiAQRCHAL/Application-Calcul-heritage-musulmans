import java.util.Scanner;

public class SoeurDeMere extends Fard
{
	protected boolean existefrere;
	protected boolean casp;
	
	public SoeurDeMere(String ex_soeurdemere,int nbr_soeurdemere)
	{
		Scanner sc = new Scanner(System.in);
		String c="";
		System.out.println("Est-ce qu\'il a des soeurs de la part de sa mere : ");
		c=ex_soeurdemere;
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
		SetNbr(nbr_soeurdemere);
	}
	
	public void SetNbr(int nbr_soeurdemere)
	{
		int a;
		Scanner sc = new Scanner(System.in);
		if(existe==true)
		{
			System.out.println("Donner le nombre des soeurs de la part de sa mere : ");
			a=nbr_soeurdemere;
			this.nbr=a;
		}
		else
		{
			this.nbr=0;
		}
	}
	
	public void SetCoefficient()
	{
		if(branche==true || kalala==true)
		{
			SetStatut("hajb");
		}
		else
		{
			if(casp==false)
			{
				SetStatut("fard");
				if(nbr==1 || existefrere==true)
				{
					this.x=1;
					this.y=6;
				}
				else
				{
					this.x=1;
					this.y=3;
				}
			}
			else
			{
				SetStatut("CasP");
				if(existefrere==true)
				{
					this.x=1;
					this.y=12;
				}
				else
				{
					this.x=1;
					this.y=6;
				}
			}
		}
	}
	
	public void ExisteFrereM(FrereDeMere freremere)
	{
		if(freremere.GetExiste()==true)
		{
			existefrere=true;
		}
		else
		{
			existefrere=false;
		}
	}
	
	public void CasP(Frere frere,Soeur soeur,FrereDeMere freremere,SoeurDeMere soeurmere)
	{
		if(frere.GetX()==0 && soeur.GetX()==0 && (freremere.GetNbr()+soeurmere.GetNbr()>1) && frere.GetExiste()==true)
		{
			casp=true;
		}
		else
		{
			casp=false;
		}
	}
}
