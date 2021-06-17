import java.util.Scanner;

public class SoeurDePere extends Fard
{
	protected boolean hajib;
	protected boolean moassib;
	protected boolean existeFille;
	protected boolean existeSoeur;
	protected boolean casfrere;
	
	public SoeurDePere(String ex_soeurdepere,int nbr_soeurdepere)
	{
		Scanner sc = new Scanner(System.in);
		String c="";
		System.out.println("Est-ce qu\'il a des soeurs de la part de son pere : ");
		c=ex_soeurdepere;
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
		SetNbr(nbr_soeurdepere);
	}
	
	public void SetNbr(int nbr_soeurdepere)
	{
		int a;
		Scanner sc = new Scanner(System.in);
		if(existe==true)
		{
			System.out.println("Donner le nombre des soeurs de la part de son pere : ");
			a=nbr_soeurdepere;
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
						if(existeSoeur==false)
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
						}
						else
						{
							this.x=1;
							this.y=6;
						}	
					}
				}
			}
		}
	}
	
	public void SetHajib(Fils fils,FilsDeFils filsfils,Pere pere,Frere frere,Soeur soeur)
	{
		if(fils.GetExiste()==true || filsfils.GetExiste()==true || pere.GetExiste()==true  || frere.GetExiste()==true || (soeur.GetExiste()==true && (soeur.GetNbr()>1 || soeur.GetStatut()=="taassib avec fille")))
		{
			hajib=true;
		}
		else
		{
			hajib=false;
		}
	}
	
	public void ExisteMoassib(FrereDePere frerepere)
	{
		if(frerepere.GetExiste()==true)
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
	
	public void ExisteSoeur(Soeur soeur)
	{
		if(soeur.GetExiste()==true)
		{
			existeSoeur=true;
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
