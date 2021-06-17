import java.util.Scanner;

public class Frere extends Taassib
{
	protected boolean hajib;
	protected boolean existesoeur;
	protected boolean casp;
	protected boolean casfrere;
	
	public Frere(String ex_frere,int nbr_frere)
	{
		Scanner sc = new Scanner(System.in);
		String c="";
		System.out.println("Est-ce qu\'il a des freres : ");
		c=ex_frere;
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
		SetNbr(nbr_frere);
	}
	
	public void SetNbr(int nbr_frere)
	{
		int a;
		Scanner sc = new Scanner(System.in);
		if(existe==true)
		{
			System.out.println("Donner le nombre de freres : ");
			a=nbr_frere;
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
				this.x=0;
				this.y=0;
			}
			else
			{
				if(casp==false)
				{
					SetStatut("taassib");
				}
				else
				{
					SetStatut("CasP");
					if(existesoeur==false)
					{
						this.x=1;
						this.y=6;
					}
					else
					{
						this.x=2;
						this.y=18;
					}
				}
			}
		}
	}
	
	public void ExisteHajib(Fils fils,FilsDeFils filsfils,Pere pere,GrandPereDePere gdpp)
	{
		if(fils.GetExiste()==true || filsfils.GetExiste()==true || pere.GetExiste()==true)
		{
			hajib=true; 
		}
		else
		{
			hajib=false;
		}
	}
	
	public void ExisteSoeur(Soeur soeur)
	{
		if(soeur.GetExiste()==true)
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
	
	public void denominateur(int cf)
	{
		SetX(GetX()*(cf/GetY()));
		SetY(cf);
	}
	
	public void CalculSolde(double somme)
	{
		this.solde=(somme*(double)GetX())/(double)GetY();
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
