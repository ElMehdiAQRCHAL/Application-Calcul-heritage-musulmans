import java.util.Scanner;

public class GrandPereDePere extends FardEtTaassib
{
	protected boolean existefrere;
	protected boolean forod;
	protected int z=0;
	public GrandPereDePere(String ex_gdpp)
	{
		Scanner sc = new Scanner(System.in);
		String c="";
		System.out.println("Est-ce qu\'il a de grand pere de la part du pere : ");
		c=ex_gdpp;
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
		if(asslP==true)
		{
			SetStatut("hajb");
		}
		else
		{
			if(existefrere==false)
			{
				if(brancheF==true)
				{
					this.x=1;
					this.y=6;
					SetStatut("taassib+fard");
				}
				else
				{
					if(brancheG==true)
					{
						this.x=1;
						this.y=6;
						SetStatut("fard");
					}
					else
					{
						SetStatut("taassib");
					}
				}
			}
			else
			{
				SetStatut("CasFrere");
			}
		}
	}
	
	public void CasFrere(Frere frere,Soeur soeur,FrereDePere frerepere,SoeurDePere soeurpere,Fils fils,FilsDeFils filsfils)
	{
		if(fils.GetExiste()==false && filsfils.GetExiste()==false && (frere.GetExiste()==true || soeur.GetExiste()==true || frerepere.GetExiste()==true || soeurpere.GetExiste()==true))
		{
			existefrere=true;
		}
		else
		{
			existefrere=false;
		}
	}
	
	public void Forod(Homme homme,Femme femme,Mere mere,FrereDeMere freremere,SoeurDeMere soeurmere,GrandMereDeMere gdmm,GrandMereDePere gdmp,Fille fille,FilleDeFils fillefils)
	{
		if(homme.GetStatut()=="fard" || femme.GetStatut()=="fard" || mere.GetStatut()=="fard" || freremere.GetStatut()=="fard" || soeurmere.GetStatut()=="fard" || gdmm.GetStatut()=="fard" || gdmp.GetStatut()=="fard" || fille.GetStatut()=="fard" || fillefils.GetStatut()=="fard" )
		{
			forod=true;
		}
		else
		{
			forod=false;
		}
	}
	
	public boolean GetForod()
	{
		return forod;
	}
	
	public void ComparaisonA(int m,int n,int cfr,int cf)
	{
		double reste=(double)cfr/(double)cf;
		double a=(double)m/(double)n;
		double b=(double)1/(double)3;
		double division=reste*a;
		double tier=reste*b;
		if(division>tier)
		{
			this.x=cfr*m;
			this.y=cf*n;
			z=1;
		}
		else
		{
			this.x=cfr;
			this.y=cf*3;
		}
	}
	
	public void ComparaisonB(int m,int n,int cfr,int cf)
	{
		double reste=(double)cfr/(double)cf;
		double a=(double)m/(double)n;
		double b=(double)1/(double)3;
		double division=reste*a;
		double tier=reste*b;
		double six=(double)1/(double)6;
		if(division>tier)
		{
			if(division>six)
			{
				this.x=cfr*m;
				this.y=cf*n;
				z=1;
			}
			else
			{
				this.x=1;
				this.y=6;
			}
		}
		else
		{
			if(tier>six)
			{
				this.x=cfr;
				this.y=cf*3;
			}
			else
			{
				this.x=1;
				this.y=6;
			}
		}
	}
	
	public int GetZ()
	{
		return z;
	}
}
