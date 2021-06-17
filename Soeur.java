import java.util.Scanner;

public class Soeur extends FardEtTaassib
{
	protected boolean hajib;
	protected boolean moassib;
	protected boolean existeFille;
	protected boolean casp;
	protected boolean casfrere;
	
	public Soeur(String ex_soeur,int nbr_soeur)
	{
		Scanner sc = new Scanner(System.in);
		String c="";
		System.out.println("Est-ce qu\'il a des soeurs : ");
		c=ex_soeur;
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
		SetNbr(nbr_soeur);
	}
	
	public void SetNbr(int nbr_soeur)
	{
		int a;
		Scanner sc = new Scanner(System.in);
		if(existe==true)
		{
			System.out.println("Donner le nombre des soeurs : ");
			a=nbr_soeur;
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
				this.y=1;
			}
			else
			{
				if(casp==false)
				{
					if(moassib==true)
					{
						SetStatut("taassib");
					}
					else
					{
						if(existeFille==true)
						{
							SetStatut("taassib avec fille");
						}
						else
						{
							SetStatut("fard");
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
						}
					}
				}
				else
				{
					SetStatut("CasP");
					this.x=1;
					this.y=18;
				}
			}
		}
	}
	
	public void SetHajib(Fils fils,FilsDeFils filsfils,Pere pere)
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
	
	public void ExisteMoassib(Frere frere)
	{
		if(frere.GetExiste()==true)
		{
			moassib=true;
		}
		else
		{
			moassib=false;
		}
	}
	
	public void ExisteFille(Fille fille,FilleDeFils fillefils)
	{
		if(fille.GetExiste()==true || fillefils.GetExiste()==true)
		{
			existeFille=true;
		}
		else
		{
			existeFille=false;
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
