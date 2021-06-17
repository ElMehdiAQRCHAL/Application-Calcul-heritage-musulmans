import java.util.Scanner;

public class FrereDeMere extends Fard
{
	protected boolean existesoeur;
	protected boolean casp;//cas des freres avec les frere de mere
	
	public FrereDeMere(String ex_freredemere,int nbr_freredemere)
	{
		Scanner sc = new Scanner(System.in);
		String c="";
		System.out.println("Est-ce qu\'il a des freres de la part de sa mere : ");
		c=ex_freredemere;
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
		SetNbr(nbr_freredemere);
	}
	
	public void SetNbr(int nbr_freredemere)
	{
		int a;
		Scanner sc = new Scanner(System.in);
		if(existe==true)
		{
			System.out.println("Donner le nombre des freres de la part de sa mere : ");
			a=nbr_freredemere;
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
				if(nbr==1 || existesoeur==true)
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
				if(existesoeur==true)
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
	
	public void ExisteSoeurM(SoeurDeMere soeurmere)
	{
		if(soeurmere.GetExiste()==true)
		{
			existesoeur=true;
		}
		else
		{
			existesoeur=false;
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
