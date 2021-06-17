
public class Game
{
	private double h1;
	private int h2;
	private double fe1;
	private int fe2;
	private double m1;
	private int m2;
	private double p1;
	private int p2;
	private double g1;
	private int g2;
	private double fi1;
	private int fi2;
	private double gg1;
	private int gg2;
	private double fig1;
	private int fig2;
	private double gp1;
	private int gp2;
	private double gmm1;
	private int gmm2;
	private double gmp1;
	private int gmp2;
	private double fr1;
	private int fr2;
	private double so1;
	private int so2;
	private double frm1;
	private int frm2;
	private double som1;
	private int som2;
	private double frp1;
	private int frp2;
	private double sop1;
	private int sop2;
	private double gfr1;
	private int gfr2;
	private double gfrp1;
	private int gfrp2;
	private double on1;
	private int on2;
	private double onp1;
	private int onp2;
	private double gon1;
	private int gon2;
	private double gonp1;
	private int gonp2;
	private double autreSolde;
	private int autreX;
	private int totalcoef;
	
	
	public static int pgcd(int m,int n)
	{
		int r=2;
		while(n!=0)
		{
			r=m%n;
			m=n;
			n=r;
		}
		return m;
	}
	
	public static int ppcm(int n,int m)
	{
		int ppcm=(m*n)/pgcd(m,n);
		return ppcm;
	}
	
	public Game(double v_somme,double v_credit,int v_wassiya,int choix,String v_hf,String ex_homme,String ex_femme,String ex_fils,String ex_filsdefils,String ex_fille,String ex_filledefils,String ex_pere,String ex_mere,String ex_gdmm,String ex_gdmp,String ex_gdpp,String ex_frere,String ex_filsdefrere,String ex_soeur,String ex_freredepere,String ex_filsdefreredepere,String ex_soeurdepere,String ex_freredemere,String ex_soeurdemere,String ex_oncle,String ex_filsoncle,String ex_oncledepere,String ex_filsoncledepere,int nbr_femme,int nbr_fils,int nbr_filsdefils,int nbr_fille,int nbr_filledefils,int nbr_frere,int nbr_soeur,int nbr_freredepere,int nbr_soeurdepere,int nbr_freredemere,int nbr_soeurdemere,int nbr_filsdefrere,int nbr_filsdefreredepere,int nbr_oncle,int nbr_oncledepere,int nbr_filsoncle,int nbr_filsoncledepere)
	{
		int b=0;//Pour verifier l'existence de la femme ou l'homme
		int a=0;//Pour verifier l'existence des deux grands meres
		int cf=1;//plus petit commun multiple pour calculer le denominateur
		int cfa=0;//pour assurer al aoul
		double somme = v_somme - v_credit;
		double reste=somme;
		/********************* Genre du defunt *********************************/
		/////////////////////////////////////////////////////////////////////////
		String c="";
		c=v_hf;
		/********************* Declaration des heritiers *********************************/
		////////////////////////////////////////////////////////////////////////////////////////
		Femme femme = new Femme();
		Homme homme = new Homme();
		if (c.equals("h"))
		{
			String d="";
			d=ex_femme;
			if(d.equals("Non")==true)
			{
				femme.existe=false;
			}
			if(d.equals("Oui")==true)
			{
				femme.existe=true;
			}
			femme.SetNbr(nbr_femme);	
			homme.SetExiste(false);
		}
		if (c.equals("f"))
		{
			String d="";
			d=ex_homme;
			if(d.equals("Non")==true)
			{
				homme.existe=false;
			}
			if(d.equals("Oui")==true)
			{
				homme.existe=true;
			}
			homme.SetNbr();
			femme.SetExiste(false);
		}
		////////////////////////////////////////////////////////////////////////////////////////
		Fils fils = new Fils(ex_fils,nbr_fils);
		FilsDeFils filsfils = new FilsDeFils(ex_filsdefils,nbr_filsdefils);
		Fille fille = new Fille(ex_fille,nbr_fille);
		FilleDeFils fillefils = new FilleDeFils(ex_filledefils,nbr_filledefils);
		////////////////////////////////////////////////////////////////////////////////////////
		Pere pere = new Pere(ex_pere);
		Mere mere = new Mere(ex_mere);
		GrandMereDeMere gdmm = new GrandMereDeMere(ex_gdmm);
		GrandMereDePere gdmp = new GrandMereDePere(ex_gdmp);
		GrandPereDePere gdpp = new GrandPereDePere(ex_gdpp);
		////////////////////////////////////////////////////////////////////////////////////////
		Frere frere = new Frere(ex_frere,nbr_frere);
		FilsDeFrere filsfrere = new FilsDeFrere(ex_filsdefrere,nbr_filsdefrere);
		Soeur soeur = new Soeur(ex_soeur,nbr_soeur);
		////////////////////////////////////////////////////////////////////////////////////////
		FrereDePere frerepere = new FrereDePere(ex_freredepere,nbr_freredepere);
		FilsDeFrereDePere filsfrerepere = new FilsDeFrereDePere(ex_filsdefreredepere,nbr_filsdefreredepere);
		SoeurDePere soeurpere = new SoeurDePere(ex_soeurdepere,nbr_soeurdepere);
		////////////////////////////////////////////////////////////////////////////////////////
		FrereDeMere freremere = new FrereDeMere(ex_freredemere,nbr_freredemere);
		SoeurDeMere soeurmere = new SoeurDeMere(ex_soeurdemere,nbr_soeurdemere);
		////////////////////////////////////////////////////////////////////////////////////////
		Oncle oncle = new Oncle(ex_oncle,nbr_oncle);
		FilsOncle filsoncle = new FilsOncle(ex_filsoncle,nbr_filsoncle);
		OncleDePere onclepere = new OncleDePere(ex_oncledepere,nbr_oncledepere);
		FilsOncleDePere filsonclepere = new FilsOncleDePere(ex_filsoncledepere,nbr_filsoncledepere);
		////////////////////////////////////////////////////////////////////////////////////////
		if(gdmm.GetExiste()==true)
		{
			a++;
		}
		if(gdmp.GetExiste()==true)
		{
			a++;
		}
		/********************* Identifier les cas des heritiers *********************************/
		////////////////////////////////////////////////////////////////////////////////////////
		/********************* الوارثون بالفرض فقط *********************************/
		if(femme.GetExiste()==true)
		{
			femme.SetBranche(fils, fille, filsfils, fillefils);
			femme.SetCoefficient();
			cf=ppcm(cf,femme.GetY());
			b=1;
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(homme.GetExiste()==true)
		{
			homme.SetBranche(fils, fille, filsfils, fillefils);
			homme.SetCoefficient();
			cf=ppcm(cf,homme.GetY());
			b=1;
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(freremere.GetExiste()==true)
		{
			freremere.SetBranche(fils, fille, filsfils, fillefils);
			freremere.SetKalalaG(pere, gdpp);
			freremere.ExisteSoeurM(soeurmere);
			freremere.CasP(frere,soeur,freremere,soeurmere);
			freremere.SetCoefficient();
			if(freremere.GetStatut()=="fard" || freremere.GetStatut()=="CasP")
			{
				cf=ppcm(cf,freremere.GetY());
			}
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeurmere.GetExiste()==true)
		{
			soeurmere.SetBranche(fils, fille, filsfils, fillefils);
			soeurmere.SetKalalaG(pere, gdpp);
			soeurmere.ExisteFrereM(freremere);
			soeurmere.CasP(frere,soeur,freremere,soeurmere);
			soeurmere.SetCoefficient();
			if(soeurmere.GetStatut()=="fard" || soeurmere.GetStatut()=="CasP")
			{
				cf=ppcm(cf,soeurmere.GetY());
			}
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(gdmp.GetExiste()==true)
		{
			gdmp.PresenceMere(mere);
			gdmp.PresencePere(pere);
			gdmp.SetCoefficient(a);
			if(gdmp.GetStatut()=="fard")
			{
				cf=ppcm(cf,gdmp.GetY());
			}
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(gdmm.GetExiste()==true)
		{
			gdmm.PresenceMere(mere);
			gdmm.SetCoefficient(a, pere.GetExiste());;
			if(gdmm.GetStatut()=="fard")
			{
				cf=ppcm(cf,gdmm.GetY());
			}
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(mere.GetExiste()==true)
		{
			mere.SetBranche(fils, fille, filsfils, fillefils);
			mere.SetNbrFrere(frere,frerepere,freremere,soeur,soeurpere,soeurmere);
			mere.SetCoefficient();
		}
		if(mere.GetExiste()==true && (b==0 || pere.GetExiste()==false || mere.GetY()==6))
		{
			cf=ppcm(cf,mere.GetY());
		}
		/********************* الوارثون بالفرض و التعصيب مع إمكانية الجمع بينهما *********************************/
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(pere.GetExiste()==true)
		{
			pere.SetBrancheG(fils,filsfils);
			pere.SetBrancheF(fille,fillefils);
			pere.SetCoefficient();
			if(pere.GetStatut()=="fard" || pere.GetStatut()=="taassib+fard")
			{
				cf=ppcm(cf,pere.GetY());
			}
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(gdpp.GetExiste()==true)
		{
			gdpp.SetAsslP(pere);
			gdpp.SetBrancheG(fils,filsfils);
			gdpp.SetBrancheF(fille,fillefils);
			gdpp.CasFrere(frere,soeur,frerepere,soeurpere,fils,filsfils);
			gdpp.Forod(homme,femme,mere,freremere,soeurmere,gdmm,gdmp,fille,fillefils);
			gdpp.SetCoefficient();
			if(gdpp.GetStatut()=="fard" || gdpp.GetStatut()=="taassib+fard")
			{
				cf=ppcm(cf,gdpp.GetY());
			}
		}
		/********************* الوارثون بالفرض و التعصيب دون الجمع بينهما *********************************/
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(fille.GetExiste()==true)
		{
			fille.ExisteMoassib(fils);
			fille.SetCoefficient();
			if(fille.GetStatut()=="fard")
			{
				cf=ppcm(cf,fille.GetY());
			}
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(fillefils.GetExiste()==true)
		{
			fillefils.ExisteMoassib(filsfils);
			fillefils.SetBrancheHaut(fils,fille);
			fillefils.ExisteFille(fille);
			fillefils.SetCoefficient();
			if(fillefils.GetStatut()=="fard")
			{
				cf=ppcm(cf,fillefils.GetY());
			}
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeur.GetExiste()==true)
		{
			soeur.SetHajib(fils,filsfils,pere);
			soeur.ExisteMoassib(frere);
			soeur.ExisteFille(fille,fillefils);
			soeur.CasP(frere,soeur,freremere,soeurmere);
			soeur.SetCoefficient();
			if(soeur.GetStatut()=="fard" || soeur.GetStatut()=="CasP")
			{
				cf=ppcm(cf,soeur.GetY());
			}
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeurpere.GetExiste()==true)
		{
			soeurpere.SetHajib(fils,filsfils,pere,frere,soeur);
			soeurpere.ExisteMoassib(frerepere);
			soeurpere.ExisteFille(fille,fillefils);
			soeurpere.ExisteSoeur(soeur);
			soeurpere.SetCoefficient();
			if(soeurpere.GetStatut()=="fard")
			{
				cf=ppcm(cf,soeurpere.GetY());
			}
		}
		/********************* الوارثون بالتعصيب فقط *********************************/
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsfils.GetExiste()==true)
		{
			filsfils.ExisteHajib(fils);
			filsfils.SetCoefficient();
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(frere.GetExiste()==true)
		{
			frere.ExisteHajib(fils,filsfils,pere,gdpp);
			frere.ExisteSoeur(soeur);
			frere.CasP(frere,soeur,freremere,soeurmere);
			frere.SetCoefficient();
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsfrere.GetExiste()==true)
		{
			filsfrere.ExisteHajib(fils,filsfils,pere,gdpp,frere,frerepere,soeur,soeurpere);
			filsfrere.SetCoefficient();
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(frerepere.GetExiste()==true)
		{
			frerepere.ExisteHajib(fils,filsfils,pere,gdpp,frere,soeur);
			frerepere.SetCoefficient();
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsfrerepere.GetExiste()==true)
		{
			filsfrerepere.ExisteHajib(fils,filsfils,pere,gdpp,frere,frerepere,soeur,soeurpere,filsfrere);
			filsfrerepere.SetCoefficient();
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(oncle.GetExiste()==true)
		{
			oncle.ExisteHajib(fils,filsfils,pere,gdpp,frere,frerepere,soeur,soeurpere,filsfrere,filsfrerepere);
			oncle.SetCoefficient();
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsoncle.GetExiste()==true)
		{
			filsoncle.ExisteHajib(fils,filsfils,pere,gdpp,frere,frerepere,soeur,soeurpere,filsfrere,filsfrerepere,oncle,onclepere);
			filsoncle.SetCoefficient();
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(onclepere.GetExiste()==true)
		{
			onclepere.ExisteHajib(fils,filsfils,pere,gdpp,frere,frerepere,soeur,soeurpere,filsfrere,filsfrerepere,oncle);
			onclepere.SetCoefficient();
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsonclepere.GetExiste()==true)
		{
			filsonclepere.ExisteHajib(fils,filsfils,pere,gdpp,frere,frerepere,soeur,soeurpere,filsfrere,filsfrerepere,oncle,onclepere,filsoncle);
			filsonclepere.SetCoefficient();
		}
		/********************* Rendre au meme dénominateur *********************************/
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(homme.GetExiste()==true)
		{
			homme.denominateur(cf);
			cfa+=homme.GetX();
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(femme.GetExiste()==true)
		{
			femme.denominateur(cf);
			cfa+=femme.GetX();
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(mere.GetExiste()==true && (b==0 || pere.GetExiste()==false || mere.GetY()==6))
		{
			mere.denominateur(cf);
			cfa+=mere.GetX();
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(freremere.GetExiste()==true)
		{
			freremere.denominateur(cf);
			cfa+=freremere.GetX();
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeurmere.GetExiste()==true)
		{
			soeurmere.denominateur(cf);
			cfa+=soeurmere.GetX();
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(gdmm.GetExiste()==true && gdmm.GetStatut()=="fard")
		{
			gdmm.denominateur(cf);
			cfa+=gdmm.GetX();
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(gdmp.GetExiste()==true && gdmp.GetStatut()=="fard")
		{
			gdmp.denominateur(cf);
			cfa+=gdmp.GetX();
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(pere.GetExiste()==true && (pere.GetStatut()=="fard" || pere.GetStatut()=="taassib+fard"))
		{
			pere.denominateur(cf);
			cfa+=pere.GetX();
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(gdpp.GetExiste()==true && (gdpp.GetStatut()=="fard" || gdpp.GetStatut()=="taassib+fard"))
		{
			gdpp.denominateur(cf);
			cfa+=gdpp.GetX();
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(fille.GetExiste()==true && fille.GetStatut()=="fard")
		{
			fille.denominateur(cf);
			cfa+=fille.GetX();
		}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(fillefils.GetExiste()==true && fillefils.GetStatut()=="fard")
		{
			fillefils.denominateur(cf);
			cfa+=fillefils.GetX();
		}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeur.GetExiste()==true && (soeur.GetStatut()=="fard" || soeur.GetStatut()=="CasP"))
		{
			soeur.denominateur(cf);
			cfa+=soeur.GetX();
		}
		if(frere.GetExiste()==true && frere.GetStatut()=="CasP")
		{
			frere.denominateur(cf);
			cfa+=frere.GetX();
		}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeurpere.GetExiste()==true && soeurpere.GetStatut()=="fard")
		{
			soeurpere.denominateur(cf);
			cfa+=soeurpere.GetX();
		}
		/********************* Cas Al Aoul *********************************/
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(cfa>cf)
		{
			cf=cfa;
			if(homme.GetExiste()==true){homme.denominateur(cf);}
			////////////////////////////////////////////////////////////////////////////////////////////////////////		
			if(femme.GetExiste()==true){femme.denominateur(cf);}
			////////////////////////////////////////////////////////////////////////////////////////////////////////
			if(mere.GetExiste()==true && (b==0 || pere.GetExiste()==false || mere.GetY()==6)){mere.denominateur(cf);}
			////////////////////////////////////////////////////////////////////////////////////////////////////////
			if(freremere.GetExiste()==true){freremere.denominateur(cf);}
			////////////////////////////////////////////////////////////////////////////////////////////////////////
			if(soeurmere.GetExiste()==true){soeurmere.denominateur(cf);}
			////////////////////////////////////////////////////////////////////////////////////////////////////////
			if(gdmm.GetExiste()==true && gdmm.GetStatut()=="fard"){gdmm.denominateur(cf);}
			////////////////////////////////////////////////////////////////////////////////////////////////////////
			if(gdmp.GetExiste()==true && gdmp.GetStatut()=="fard"){gdmp.denominateur(cf);}
			////////////////////////////////////////////////////////////////////////////////////////////////////////		
			if(pere.GetExiste()==true && (pere.GetStatut()=="fard" || pere.GetStatut()=="taassib+fard")){pere.denominateur(cf);}
			////////////////////////////////////////////////////////////////////////////////////////////////////////		
			if(gdpp.GetExiste()==true && (gdpp.GetStatut()=="fard" || gdpp.GetStatut()=="taassib+fard")){gdpp.denominateur(cf);}
			////////////////////////////////////////////////////////////////////////////////////////////////////////		
			if(fille.GetExiste()==true && fille.GetStatut()=="fard"){fille.denominateur(cf);}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(fillefils.GetExiste()==true && fillefils.GetStatut()=="fard"){fillefils.denominateur(cf);}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(soeur.GetExiste()==true && (soeur.GetStatut()=="fard" || soeur.GetStatut()=="CasP")){soeur.denominateur(cf);}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(frere.GetExiste()==true && frere.GetStatut()=="CasP"){frere.denominateur(cf);}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(soeurpere.GetExiste()==true && soeurpere.GetStatut()=="fard"){soeurpere.denominateur(cf);}
		}
		/********************* Sahm Taassib *********************************/
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		int cfr=cf-cfa;
		if(cfr>0)
		{
			if(mere.GetExiste()==true && b==1 && pere.GetExiste()==true && mere.GetY()==3)
			{
				mere.SetX(cfr);
				mere.SetY(cf*3);
				cfr=(cfr*3)-cfr;
				cf=cf*3;
			}
			if(pere.GetExiste()==true && pere.GetStatut()=="taassib+fard")
			{
				pere.denominateur(cf);
				pere.SetX(pere.GetX()+cfr);
			}
			if(pere.GetExiste()==true && pere.GetStatut()=="taassib")
			{
				pere.SetX(cfr);
				pere.SetY(cf);
			}
			if(gdpp.GetExiste()==true && gdpp.GetStatut()=="taassib+fard")
			{
				gdpp.denominateur(cf);
				gdpp.SetX(gdpp.GetX()+cfr);
			}
			if(gdpp.GetExiste()==true && gdpp.GetStatut()=="taassib")
			{
				gdpp.SetX(cfr);
				gdpp.SetY(cf);
			}
			
			int cff=cf;
			if(gdpp.GetExiste()==true && gdpp.GetStatut()=="CasFrere")
			{
				int nbrx,nbry;
				nbrx=gdpp.GetNbr()*2;
				nbry=gdpp.GetNbr()*2+frere.GetNbr()*2+frerepere.GetNbr()*2+soeur.GetNbr()+soeurpere.GetNbr();
				if(gdpp.GetForod()==false)
				{
					gdpp.ComparaisonA(nbrx,nbry,cfr,cf);
					if(gdpp.GetZ()==1)
					{
						if(soeur.GetExiste()==true)
						{
							cfr+=soeur.GetX();
						}
						if(soeurpere.GetExiste()==true)
						{
							cfr+=soeurpere.GetX();
						}
						gdpp.ComparaisonA(nbrx,nbry,cfr,cf);
					}
					if(gdpp.GetZ()==0)
					{
						cfr=2*cfr;
						cf=3*cf;
					}
				}
				else
				{
					if(soeur.GetExiste()==true)
					{
						cfr+=soeur.GetX();
					}
					if(soeurpere.GetExiste()==true)
					{
						cfr+=soeurpere.GetX();
					}
					gdpp.ComparaisonB(nbrx,nbry,cfr,cf);
					if(gdpp.GetZ()==0)
					{
						if(soeur.GetExiste()==true)
						{
							cfr-=soeur.GetX();
						}
						if(soeurpere.GetExiste()==true)
						{
							cfr-=soeurpere.GetX();
						}
						gdpp.ComparaisonB(nbrx,nbry,cfr,cf);
						if(gdpp.GetY()==6)
						{
							cfr=6*cfr-cf;
							cf=6*cf;
						}
						else
						{
							cfr=2*cfr;
							cf=3*cf;
						}
					}
				}
				
				if(cf<gdpp.GetY())
				{
					cf=gdpp.GetY();
				}
			}
			
			frere.CasFrere(gdpp);
			frere.SetCoefficient();
			if(frere.GetExiste()==true)
			{
				frere.CasFrere(gdpp);
				frere.SetCoefficient();
			}
			if(frere.GetExiste()==true && frere.GetStatut()=="CasFrere")
			{
				int nbrx,nbry;
				nbrx=frere.GetNbr()*2;
				nbry=gdpp.GetNbr()*2+frere.GetNbr()*2+frerepere.GetNbr()*2+soeur.GetNbr()+soeurpere.GetNbr();
				if(frerepere.GetExiste()==true || soeurpere.GetExiste()==true)
				{
					nbrx+=frerepere.GetNbr()*2+soeurpere.GetNbr();
				}
				frere.SetX(cfr*nbrx);
				frere.SetY(cff*nbry);
			}

			soeur.CasFrere(gdpp);
			soeur.SetCoefficient();
			if(soeur.GetExiste()==true)
			{
				soeur.CasFrere(gdpp);
				soeur.SetCoefficient();
			}
			if(soeur.GetExiste()==true && soeur.GetStatut()=="CasFrere")
			{
				int nbrx,nbry;
				nbrx=soeur.GetNbr();
				nbry=gdpp.GetNbr()*2+frere.GetNbr()*2+frerepere.GetNbr()*2+soeur.GetNbr()+soeurpere.GetNbr();
				if(soeurpere.GetExiste()==true)
				{
					nbrx+=soeurpere.GetNbr();
				}
				soeur.SetX(cfr*nbrx);
				soeur.SetY(cff*nbry);
			}
			
			frerepere.CasFrere(gdpp);
			frerepere.SetCoefficient();
			if(frerepere.GetExiste()==true)
			{
				frerepere.CasFrere(gdpp);
				frerepere.SetCoefficient();
			}
			if(frerepere.GetExiste()==true && frerepere.GetStatut()=="CasFrere")
			{
				int nbrx,nbry;
				nbrx=frerepere.GetNbr()*2;
				nbry=gdpp.GetNbr()*2+frere.GetNbr()*2+frerepere.GetNbr()*2+soeur.GetNbr()+soeurpere.GetNbr();
				frerepere.SetX(cfr*nbrx);
				frerepere.SetY(cff*nbry);
			}
			
			soeurpere.CasFrere(gdpp);
			soeurpere.SetCoefficient();
			if(soeurpere.GetExiste()==true)
			{
				soeurpere.CasFrere(gdpp);
				soeurpere.SetCoefficient();
			}
			if(soeurpere.GetExiste()==true && soeurpere.GetStatut()=="CasFrere")
			{
				int nbrx,nbry;
				nbrx=soeurpere.GetNbr();
				nbry=gdpp.GetNbr()*2+frere.GetNbr()*2+frerepere.GetNbr()*2+soeur.GetNbr()+soeurpere.GetNbr();
				frerepere.SetX(cfr*nbrx);
				frerepere.SetY(cff*nbry);
				if(soeur.GetExiste()==true || frere.GetExiste()==true)
				{
					frerepere.SetX(0);
				}
			}

			//////////////////////////////////////////////////////////////////////////////////////////////////////	
			if(cfr>0) {
			if(fils.GetExiste()==true && fils.GetStatut()=="taassib")
			{
				fils.SetX(cfr*2*fils.GetNbr());
				fils.SetY(cf*(2*fils.GetNbr()+fille.GetNbr()));
				cf=cf*(2*fils.GetNbr()+fille.GetNbr());	
			}
			if(fille.GetExiste()==true && fille.GetStatut()=="taassib")
			{
				fille.SetX(cfr*fille.GetNbr());
				fille.SetY(cf);
			}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(filsfils.GetExiste()==true && filsfils.GetStatut()=="taassib")
			{
				filsfils.SetX(cfr*2*filsfils.GetNbr());
				filsfils.SetY(cf*(2*filsfils.GetNbr()+fillefils.GetNbr()));
				cf=cf*(2*filsfils.GetNbr()+fillefils.GetNbr());
			}
			if(fillefils.GetExiste()==true && fillefils.GetStatut()=="taassib")
			{
				fillefils.SetX(cfr*fillefils.GetNbr());
				fillefils.SetY(cf);
			}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(frere.GetExiste()==true && frere.GetStatut()=="taassib")
			{
				frere.SetX(cfr*2*frere.GetNbr());
				frere.SetY(cf*(2*frere.GetNbr()+soeur.GetNbr()));
				cf=cf*(2*frere.GetNbr()+soeur.GetNbr());
			}
			if(soeur.GetExiste()==true && soeur.GetStatut()=="taassib")
			{
				soeur.SetX(cfr*soeur.GetNbr());
				soeur.SetY(cf);
			}
			if(soeur.GetExiste()==true && soeur.GetStatut()=="taassib avec fille")
			{
				soeur.SetX(cfr);
				soeur.SetY(cf);
			}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(frerepere.GetExiste()==true && frerepere.GetStatut()=="taassib")
			{
				frerepere.SetX(cfr*2*frerepere.GetNbr());
				frerepere.SetY(cf*(2*frerepere.GetNbr()+soeurpere.GetNbr()));
				cf=cf*(2*frerepere.GetNbr()+soeurpere.GetNbr());
			}
			if(soeurpere.GetExiste()==true && soeurpere.GetStatut()=="taassib")
			{
				soeurpere.SetX(cfr*soeurpere.GetNbr());
				soeurpere.SetY(cf);
			}
			if(soeurpere.GetExiste()==true && soeurpere.GetStatut()=="taassib avec fille")
			{
				soeurpere.SetX(cfr);
				soeurpere.SetY(cf);
			}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(filsfrere.GetExiste()==true && filsfrere.GetStatut()=="taassib")
			{
				filsfrere.SetX(cfr);
				filsfrere.SetY(cf);
			}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(filsfrerepere.GetExiste()==true && filsfrerepere.GetStatut()=="taassib")
			{
				filsfrerepere.SetX(cfr);
				filsfrerepere.SetY(cf);
			}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(oncle.GetExiste()==true && oncle.GetStatut()=="taassib")
			{
				oncle.SetX(cfr);
				oncle.SetY(cf);
			}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(filsoncle.GetExiste()==true && filsoncle.GetStatut()=="taassib")
			{
				filsoncle.SetX(cfr);
				filsoncle.SetY(cf);
			}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(onclepere.GetExiste()==true && onclepere.GetStatut()=="taassib")
			{
				onclepere.SetX(cfr);
				onclepere.SetY(cf);
			}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(filsonclepere.GetExiste()==true && filsonclepere.GetStatut()=="taassib")
			{
				filsonclepere.SetX(cfr);
				filsonclepere.SetY(cf);
			}
		}}
		
		/********************* Revsion des denominateur *********************************/
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(homme.GetExiste()==true){homme.denominateur(cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(femme.GetExiste()==true){femme.denominateur(cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(mere.GetExiste()==true){mere.denominateur(cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(freremere.GetExiste()==true){freremere.denominateur(cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeurmere.GetExiste()==true){soeurmere.denominateur(cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(gdmm.GetExiste()==true){gdmm.denominateur(cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(gdmp.GetExiste()==true){gdmp.denominateur(cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(pere.GetExiste()==true){pere.denominateur(cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(gdpp.GetExiste()==true){gdpp.denominateur(cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(fille.GetExiste()==true){fille.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(fillefils.GetExiste()==true){fillefils.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeur.GetExiste()==true){soeur.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(frere.GetExiste()==true){frere.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeurpere.GetExiste()==true){soeurpere.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(fils.GetExiste()==true){fils.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsfils.GetExiste()==true){filsfils.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(frere.GetExiste()==true){frere.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsfrere.GetExiste()==true){filsfrere.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(frerepere.GetExiste()==true){frerepere.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsfrerepere.GetExiste()==true){filsfrerepere.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(oncle.GetExiste()==true){oncle.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsoncle.GetExiste()==true){filsoncle.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(onclepere.GetExiste()==true){onclepere.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsonclepere.GetExiste()==true){filsonclepere.denominateur(cf);}
		
		/********************* Cas particulier du GrandPrere *********************************/
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		/**الأكدرية**/
		if(homme.GetExiste()==true && mere.GetExiste()==true && gdpp.GetExiste()==true && ((soeur.GetExiste()==true && soeurpere.GetExiste()==false) || (soeurpere.GetExiste()==true && soeur.GetExiste()==false)) && gdmm.GetExiste()==false && gdmp.GetExiste()==false && fils.GetExiste()==false && filsfils.GetExiste()==false && frere.GetExiste()==false && filsfrere.GetExiste()==false && frerepere.GetExiste()==false && filsfrerepere.GetExiste()==false)
		{
			homme.SetX(9);
			homme.SetY(27);
			mere.SetX(6);
			mere.SetY(27);
			gdpp.SetX(8);
			gdpp.SetY(27);
			if(soeur.GetExiste()==true)
			{
				soeur.SetX(4);
				soeur.SetY(27);
			}
			if(soeurpere.GetExiste()==true)
			{
				soeurpere.SetX(4);
				soeurpere.SetY(27);
			}
			
			cf=27;
		}
		/**الخرقاء**/
		if(homme.GetExiste()==true && mere.GetExiste()==true && gdpp.GetExiste()==true && frerepere.GetExiste()==true && frerepere.GetNbr()==1 && soeur.GetExiste()==false && gdmm.GetExiste()==false && gdmp.GetExiste()==false && fils.GetExiste()==false && filsfils.GetExiste()==false && frere.GetExiste()==false)
		{
			homme.SetX(3);
			homme.SetY(6);
			mere.SetX(1);
			mere.SetY(6);
			gdpp.SetX(2);
			gdpp.SetY(6);
			frerepere.SetX(0);
			frerepere.SetY(6);
			cf=6;
		}

		/********************* Calcul solde *********************************/
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(homme.GetExiste()==true){homme.CalculSolde(somme);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(femme.GetExiste()==true){femme.CalculSolde(somme);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(mere.GetExiste()==true){mere.CalculSolde(somme);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(freremere.GetExiste()==true){freremere.CalculSolde(somme);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeurmere.GetExiste()==true){soeurmere.CalculSolde(somme);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(gdmm.GetExiste()==true){gdmm.CalculSolde(somme);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(gdmp.GetExiste()==true){gdmp.CalculSolde(somme);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(pere.GetExiste()==true){pere.CalculSolde(somme);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(gdpp.GetExiste()==true){gdpp.CalculSolde(somme);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(fille.GetExiste()==true){fille.CalculSolde(somme);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(fillefils.GetExiste()==true){fillefils.CalculSolde(somme);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeur.GetExiste()==true){soeur.CalculSolde(somme);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(frere.GetExiste()==true){frere.CalculSolde(somme);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeurpere.GetExiste()==true){soeurpere.CalculSolde(somme);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(fils.GetExiste()==true){fils.CalculSolde(somme);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsfils.GetExiste()==true){filsfils.CalculSolde(somme);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsfrere.GetExiste()==true){filsfrere.CalculSolde(somme);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(frerepere.GetExiste()==true){frerepere.CalculSolde(somme);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsfrerepere.GetExiste()==true){filsfrerepere.CalculSolde(somme);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(oncle.GetExiste()==true){oncle.CalculSolde(somme);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsoncle.GetExiste()==true){filsoncle.CalculSolde(somme);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(onclepere.GetExiste()==true){onclepere.CalculSolde(somme);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsonclepere.GetExiste()==true){filsonclepere.CalculSolde(somme);}
		/********************* Calcul solde par Fard *********************************/
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(homme.GetExiste()==true)
		{
			homme.CalculSolde(somme);
			reste=reste-homme.GetSolde();
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(femme.GetExiste()==true)
		{
			femme.CalculSolde(somme);
			reste=reste-femme.GetSolde();
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(mere.GetExiste()==true && (b==0 || pere.GetExiste()==false || mere.GetY()==6))
		{
			mere.CalculSolde(somme);
			reste=reste-mere.GetSolde();
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(freremere.GetExiste()==true)
		{
			freremere.CalculSolde(somme);
			reste=reste-freremere.GetSolde();
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeurmere.GetExiste()==true)
		{
			soeurmere.CalculSolde(somme);
			reste=reste-soeurmere.GetSolde();
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(gdmm.GetExiste()==true && gdmm.GetStatut()=="fard")
		{
			gdmm.CalculSolde(somme);
			reste=reste-gdmm.GetSolde();
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(gdmp.GetExiste()==true && gdmp.GetStatut()=="fard")
		{
			gdmp.CalculSolde(somme);
			reste=reste-gdmp.GetSolde();
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(pere.GetExiste()==true && (pere.GetStatut()=="fard" || pere.GetStatut()=="taassib+fard"))
		{
			pere.CalculSolde(somme);
			reste=reste-pere.GetSolde();
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(gdpp.GetExiste()==true && (gdpp.GetStatut()=="fard" || gdpp.GetStatut()=="taassib+fard"))
		{
			gdpp.CalculSolde(somme);
			reste=reste-gdpp.GetSolde();
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(fille.GetExiste()==true && fille.GetStatut()=="fard")
		{
			fille.CalculSolde(somme);
			reste=reste-fille.GetSolde();
		}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(fillefils.GetExiste()==true && fillefils.GetStatut()=="fard")
		{
			fillefils.CalculSolde(somme);
			reste=reste-fillefils.GetSolde();
		}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeur.GetExiste()==true && (soeur.GetStatut()=="fard" || soeur.GetStatut()=="CasP"))
		{
			soeur.CalculSolde(somme);
			reste=reste-soeur.GetSolde();
		}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(frere.GetExiste()==true && frere.GetStatut()=="CasP")
		{
			frere.CalculSolde(somme);
			reste=reste-frere.GetSolde();
		}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeurpere.GetExiste()==true && soeurpere.GetStatut()=="fard")
		{
			soeurpere.CalculSolde(somme);
			reste=reste-soeurpere.GetSolde();
		}

		/********************* Cas Radd *********************************/
		/****** Verification de l'existence du cas Radd ******/
		int cf_radd=0;
		int tsm = 0;//total coefficient sans epoux ou epouse
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(homme.GetExiste()==true){cf_radd+=homme.GetX();}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(femme.GetExiste()==true){cf_radd+=femme.GetX();}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(mere.GetExiste()==true){cf_radd+=mere.GetX();tsm+=mere.GetX();}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(freremere.GetExiste()==true){cf_radd+=freremere.GetX();tsm+=freremere.GetX();}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeurmere.GetExiste()==true){cf_radd+=soeurmere.GetX();tsm+=soeurmere.GetX();}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(gdmm.GetExiste()==true){cf_radd+=gdmm.GetX();tsm+=gdmm.GetX();}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(gdmp.GetExiste()==true){cf_radd+=gdmp.GetX();tsm+=gdmp.GetX();}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(pere.GetExiste()==true){cf_radd+=pere.GetX();tsm+=pere.GetX();}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(gdpp.GetExiste()==true){cf_radd+=gdpp.GetX();tsm+=gdpp.GetX();}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(fille.GetExiste()==true){cf_radd+=fille.GetX();tsm+=fille.GetX();}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(fillefils.GetExiste()==true){cf_radd+=fillefils.GetX();tsm+=fillefils.GetX();}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeur.GetExiste()==true){cf_radd+=soeur.GetX();tsm+=soeur.GetX();}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(frere.GetExiste()==true){cf_radd+=frere.GetX();tsm+=frere.GetX();}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeurpere.GetExiste()==true){cf_radd+=soeurpere.GetX();tsm+=soeurpere.GetX();}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(fils.GetExiste()==true){cf_radd+=fils.GetX();tsm+=fils.GetX();}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsfils.GetExiste()==true){cf_radd+=filsfils.GetX();tsm+=filsfils.GetX();}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsfrere.GetExiste()==true){cf_radd+=filsfrere.GetX();tsm+=filsfrere.GetX();}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(frerepere.GetExiste()==true){cf_radd+=frerepere.GetX();}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsfrerepere.GetExiste()==true){cf_radd+=filsfrerepere.GetX();}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(oncle.GetExiste()==true){cf_radd+=oncle.GetX();}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsoncle.GetExiste()==true){cf_radd+=filsoncle.GetX();}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(onclepere.GetExiste()==true){cf_radd+=onclepere.GetX();}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsonclepere.GetExiste()==true){cf_radd+=filsonclepere.GetX();}
		/************* Calcul de Radd ****************/
		if(cf>cf_radd)
		{
			if(homme.GetExiste()==true || femme.GetExiste()==true)
			{
				int cm=0;//le coefficient de l'epoux ou l'epouse
				int tcp=0;//total coefficient partiel
				if(femme.GetExiste()==true)
				{
					cm=femme.GetX();
					tcp=cf-cm;
					femme.SetX(cm*tsm);
					cf=cf*tsm;
					femme.SetY(cf);
					////////////////////////////////////////////////////////////////////////////////////////////////////////
					if(mere.GetExiste()==true){mere.SetX(mere.GetX()*tcp);mere.SetY(cf);}
					////////////////////////////////////////////////////////////////////////////////////////////////////////
					if(freremere.GetExiste()==true){freremere.SetX(freremere.GetX()*tcp);freremere.SetY(cf);}
					////////////////////////////////////////////////////////////////////////////////////////////////////////
					if(soeurmere.GetExiste()==true){soeurmere.SetX(soeurmere.GetX()*tcp);soeurmere.SetY(cf);}
					////////////////////////////////////////////////////////////////////////////////////////////////////////
					if(gdmm.GetExiste()==true){gdmm.SetX(gdmm.GetX()*tcp);gdmm.SetY(cf);}
					////////////////////////////////////////////////////////////////////////////////////////////////////////
					if(gdmp.GetExiste()==true){gdmp.SetX(gdmp.GetX()*tcp);gdmp.SetY(cf);}
					////////////////////////////////////////////////////////////////////////////////////////////////////////		
					if(pere.GetExiste()==true){pere.SetX(pere.GetX()*tcp);pere.SetY(cf);}
					////////////////////////////////////////////////////////////////////////////////////////////////////////		
					if(gdpp.GetExiste()==true){gdpp.SetX(gdpp.GetX()*tcp);gdpp.SetY(cf);}
					////////////////////////////////////////////////////////////////////////////////////////////////////////		
					if(fille.GetExiste()==true){fille.SetX(fille.GetX()*tcp);fille.SetY(cf);}
					//////////////////////////////////////////////////////////////////////////////////////////////////////
					if(fillefils.GetExiste()==true){fillefils.SetX(fillefils.GetX()*tcp);fillefils.SetY(cf);}
					//////////////////////////////////////////////////////////////////////////////////////////////////////
					if(soeur.GetExiste()==true){soeur.SetX(soeur.GetX()*tcp);soeur.SetY(cf);}
					//////////////////////////////////////////////////////////////////////////////////////////////////////
					if(soeurpere.GetExiste()==true){soeurpere.SetX(soeurpere.GetX()*tcp);soeurpere.SetY(cf);}
				}
				if(homme.GetExiste()==true)
				{
					cm=homme.GetX();
					tcp=cf-cm;
					homme.SetX(cm*tsm);
					cf=cf*tsm;
					homme.SetY(cf);
					////////////////////////////////////////////////////////////////////////////////////////////////////////
					if(mere.GetExiste()==true){mere.SetX(mere.GetX()*tcp);mere.SetY(cf);}
					////////////////////////////////////////////////////////////////////////////////////////////////////////
					if(freremere.GetExiste()==true){freremere.SetX(freremere.GetX()*tcp);freremere.SetY(cf);}
					////////////////////////////////////////////////////////////////////////////////////////////////////////
					if(soeurmere.GetExiste()==true){soeurmere.SetX(soeurmere.GetX()*tcp);soeurmere.SetY(cf);}
					////////////////////////////////////////////////////////////////////////////////////////////////////////
					if(gdmm.GetExiste()==true){gdmm.SetX(gdmm.GetX()*tcp);gdmm.SetY(cf);}
					////////////////////////////////////////////////////////////////////////////////////////////////////////
					if(gdmp.GetExiste()==true){gdmp.SetX(gdmp.GetX()*tcp);gdmp.SetY(cf);}
					////////////////////////////////////////////////////////////////////////////////////////////////////////		
					if(pere.GetExiste()==true){pere.SetX(pere.GetX()*tcp);pere.SetY(cf);}
					////////////////////////////////////////////////////////////////////////////////////////////////////////		
					if(gdpp.GetExiste()==true){gdpp.SetX(gdpp.GetX()*tcp);gdpp.SetY(cf);}
					////////////////////////////////////////////////////////////////////////////////////////////////////////		
					if(fille.GetExiste()==true){fille.SetX(fille.GetX()*tcp);fille.SetY(cf);}
					//////////////////////////////////////////////////////////////////////////////////////////////////////
					if(fillefils.GetExiste()==true){fillefils.SetX(fillefils.GetX()*tcp);fillefils.SetY(cf);}
					//////////////////////////////////////////////////////////////////////////////////////////////////////
					if(soeur.GetExiste()==true){soeur.SetX(soeur.GetX()*tcp);soeur.SetY(cf);}
					//////////////////////////////////////////////////////////////////////////////////////////////////////
					if(soeurpere.GetExiste()==true){soeurpere.SetX(soeurpere.GetX()*tcp);soeurpere.SetY(cf);}
				}
			}
			else
			{
				cf=cf_radd;
				////////////////////////////////////////////////////////////////////////////////////////////////////////
				if(mere.GetExiste()==true){mere.SetY(cf);}
				////////////////////////////////////////////////////////////////////////////////////////////////////////
				if(freremere.GetExiste()==true){freremere.SetY(cf);}
				////////////////////////////////////////////////////////////////////////////////////////////////////////
				if(soeurmere.GetExiste()==true){soeurmere.SetY(cf);}
				////////////////////////////////////////////////////////////////////////////////////////////////////////
				if(gdmm.GetExiste()==true){gdmm.SetY(cf);}
				////////////////////////////////////////////////////////////////////////////////////////////////////////
				if(gdmp.GetExiste()==true){gdmp.SetY(cf);}
				////////////////////////////////////////////////////////////////////////////////////////////////////////		
				if(pere.GetExiste()==true){pere.SetY(cf);}
				////////////////////////////////////////////////////////////////////////////////////////////////////////		
				if(gdpp.GetExiste()==true){gdpp.SetY(cf);}
				////////////////////////////////////////////////////////////////////////////////////////////////////////		
				if(fille.GetExiste()==true){fille.SetY(cf);}
				//////////////////////////////////////////////////////////////////////////////////////////////////////
				if(fillefils.GetExiste()==true){fillefils.SetY(cf);}
				//////////////////////////////////////////////////////////////////////////////////////////////////////
				if(soeur.GetExiste()==true){soeur.SetY(cf);}
				//////////////////////////////////////////////////////////////////////////////////////////////////////
				if(soeurpere.GetExiste()==true){soeurpere.SetY(cf);}
			}
		}
		/********************* Repartition *********************************/
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(femme.GetExiste()==true && femme.GetX()%femme.GetNbr()!=0)
		{
			femme.SetX(femme.GetX()*femme.GetNbr());
			femme.SetY(femme.GetY()*femme.GetNbr());
			cf=ppcm(cf,femme.GetY());
		}
		if(freremere.GetExiste()==true && freremere.GetX()%freremere.GetNbr()!=0)
		{
			freremere.SetX(freremere.GetX()*freremere.GetNbr());
			freremere.SetY(freremere.GetY()*freremere.GetNbr());
			cf=ppcm(cf,freremere.GetY());
		}
		if(soeurmere.GetExiste()==true && soeurmere.GetX()%soeurmere.GetNbr()!=0)
		{
			soeurmere.SetX(soeurmere.GetX()*soeurmere.GetNbr());
			soeurmere.SetY(soeurmere.GetY()*soeurmere.GetNbr());
			cf=ppcm(cf,soeurmere.GetY());
		}
		if(fils.GetExiste()==true && fils.GetX()%fils.GetNbr()!=0)
		{
			fils.SetX(fils.GetX()*fils.GetNbr());
			fils.SetY(fils.GetY()*fils.GetNbr());
			cf=ppcm(cf,fils.GetY());
		}
		if(filsfils.GetExiste()==true && filsfils.GetX()%filsfils.GetNbr()!=0)
		{
			filsfils.SetX(filsfils.GetX()*filsfils.GetNbr());
			filsfils.SetY(filsfils.GetY()*filsfils.GetNbr());
			cf=ppcm(cf,filsfils.GetY());
		}
		if(frere.GetExiste()==true && frere.GetX()%frere.GetNbr()!=0)
		{
			frere.SetX(frere.GetX()*frere.GetNbr());
			frere.SetY(frere.GetY()*frere.GetNbr());
			cf=ppcm(cf,frere.GetY());
		}
		if(filsfrere.GetExiste()==true && filsfrere.GetX()%filsfrere.GetNbr()!=0)
		{
			filsfrere.SetX(filsfrere.GetX()*filsfrere.GetNbr());
			filsfrere.SetY(filsfrere.GetY()*filsfrere.GetNbr());
			cf=ppcm(cf,filsfrere.GetY());
		}
		if(frerepere.GetExiste()==true && frerepere.GetX()%frerepere.GetNbr()!=0)
		{
			frerepere.SetX(frerepere.GetX()*frerepere.GetNbr());
			frerepere.SetY(frerepere.GetY()*frerepere.GetNbr());
			cf=ppcm(cf,frerepere.GetY());
		}
		if(filsfrerepere.GetExiste()==true && filsfrerepere.GetX()%filsfrerepere.GetNbr()!=0)
		{
			filsfrerepere.SetX(filsfrerepere.GetX()*filsfrerepere.GetNbr());
			filsfrerepere.SetY(filsfrerepere.GetY()*filsfrerepere.GetNbr());
			cf=ppcm(cf,filsfrerepere.GetY());
		}
		if(oncle.GetExiste()==true && oncle.GetX()%oncle.GetNbr()!=0)
		{
			oncle.SetX(oncle.GetX()*oncle.GetNbr());
			oncle.SetY(oncle.GetY()*oncle.GetNbr());
			cf=ppcm(cf,oncle.GetY());
		}
		if(filsoncle.GetExiste()==true && filsoncle.GetX()%filsoncle.GetNbr()!=0)
		{
			filsoncle.SetX(filsoncle.GetX()*filsoncle.GetNbr());
			filsoncle.SetY(filsoncle.GetY()*filsoncle.GetNbr());
			cf=ppcm(cf,filsoncle.GetY());
		}
		if(onclepere.GetExiste()==true && onclepere.GetX()%onclepere.GetNbr()!=0)
		{
			onclepere.SetX(onclepere.GetX()*onclepere.GetNbr());
			onclepere.SetY(onclepere.GetY()*onclepere.GetNbr());
			cf=ppcm(cf,onclepere.GetY());
		}
		if(filsonclepere.GetExiste()==true && filsonclepere.GetX()%filsonclepere.GetNbr()!=0)
		{
			filsonclepere.SetX(filsonclepere.GetX()*filsonclepere.GetNbr());
			filsonclepere.SetY(filsonclepere.GetY()*filsonclepere.GetNbr());
			cf=ppcm(cf,filsonclepere.GetY());
		}
		if(fille.GetExiste()==true && fille.GetX()%fille.GetNbr()!=0)
		{
			fille.SetX(fille.GetX()*fille.GetNbr());
			fille.SetY(fille.GetY()*fille.GetNbr());
			cf=ppcm(cf,fille.GetY());
		}
		if(fillefils.GetExiste()==true && fillefils.GetX()%fillefils.GetNbr()!=0)
		{
			fillefils.SetX(fillefils.GetX()*fillefils.GetNbr());
			fillefils.SetY(fillefils.GetY()*fillefils.GetNbr());
			cf=ppcm(cf,fillefils.GetY());
		}
		if(soeur.GetExiste()==true && soeur.GetX()%soeur.GetNbr()!=0)
		{
			soeur.SetX(soeur.GetX()*soeur.GetNbr());
			soeur.SetY(soeur.GetY()*soeur.GetNbr());
			cf=ppcm(cf,soeur.GetY());
		}
		if(soeurpere.GetExiste()==true && soeurpere.GetX()%soeurpere.GetNbr()!=0)
		{
			soeurpere.SetX(soeurpere.GetX()*soeurpere.GetNbr());
			soeurpere.SetY(soeurpere.GetY()*soeurpere.GetNbr());
			cf=ppcm(cf,soeurpere.GetY());
		}
		
		/********************* Revsion des denominateur 2 *********************************/
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(homme.GetExiste()==true){homme.denominateur(cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(femme.GetExiste()==true){femme.denominateur(cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(mere.GetExiste()==true){mere.denominateur(cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(freremere.GetExiste()==true){freremere.denominateur(cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeurmere.GetExiste()==true){soeurmere.denominateur(cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(gdmm.GetExiste()==true){gdmm.denominateur(cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(gdmp.GetExiste()==true){gdmp.denominateur(cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(pere.GetExiste()==true){pere.denominateur(cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(gdpp.GetExiste()==true){gdpp.denominateur(cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(fille.GetExiste()==true){fille.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(fillefils.GetExiste()==true){fillefils.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeur.GetExiste()==true){soeur.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(frere.GetExiste()==true){frere.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeurpere.GetExiste()==true){soeurpere.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(fils.GetExiste()==true){fils.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsfils.GetExiste()==true){filsfils.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(frere.GetExiste()==true){frere.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsfrere.GetExiste()==true){filsfrere.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(frerepere.GetExiste()==true){frerepere.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsfrerepere.GetExiste()==true){filsfrerepere.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(oncle.GetExiste()==true){oncle.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsoncle.GetExiste()==true){filsoncle.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(onclepere.GetExiste()==true){onclepere.denominateur(cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsonclepere.GetExiste()==true){filsonclepere.denominateur(cf);}
		
		/********************* Simplification *********************************/
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		int s=cf;
		if(homme.GetExiste()==true){homme.SetX(homme.GetX()/homme.GetNbr());s=pgcd(s,homme.GetX());}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(femme.GetExiste()==true){femme.SetX(femme.GetX()/femme.GetNbr());s=pgcd(s,femme.GetX());}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(mere.GetExiste()==true){mere.SetX(mere.GetX()/mere.GetNbr());s=pgcd(s,mere.GetX());}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(freremere.GetExiste()==true){freremere.SetX(freremere.GetX()/freremere.GetNbr());s=pgcd(s,freremere.GetX());}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeurmere.GetExiste()==true){soeurmere.SetX(soeurmere.GetX()/soeurmere.GetNbr());s=pgcd(s,soeurmere.GetX());}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(gdmm.GetExiste()==true){gdmm.SetX(gdmm.GetX()/gdmm.GetNbr());s=pgcd(s,gdmm.GetX());}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(gdmp.GetExiste()==true){gdmp.SetX(gdmp.GetX()/gdmp.GetNbr());s=pgcd(s,gdmp.GetX());}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(pere.GetExiste()==true){pere.SetX(pere.GetX()/pere.GetNbr());s=pgcd(s,pere.GetX());}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(gdpp.GetExiste()==true){gdpp.SetX(gdpp.GetX()/gdpp.GetNbr());s=pgcd(s,gdpp.GetX());}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(fille.GetExiste()==true){fille.SetX(fille.GetX()/fille.GetNbr());s=pgcd(s,fille.GetX());}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(fillefils.GetExiste()==true){fillefils.SetX(fillefils.GetX()/fillefils.GetNbr());s=pgcd(s,fillefils.GetX());}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeur.GetExiste()==true){soeur.SetX(soeur.GetX()/soeur.GetNbr());s=pgcd(s,soeur.GetX());}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(frere.GetExiste()==true){frere.SetX(frere.GetX()/frere.GetNbr());s=pgcd(s,frere.GetX());}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeurpere.GetExiste()==true){soeurpere.SetX(soeurpere.GetX()/soeurpere.GetNbr());s=pgcd(s,soeurpere.GetX());}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(fils.GetExiste()==true){fils.SetX(fils.GetX()/fils.GetNbr());s=pgcd(s,fils.GetX());}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsfils.GetExiste()==true){filsfils.SetX(filsfils.GetX()/filsfils.GetNbr());s=pgcd(s,filsfils.GetX());}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsfrere.GetExiste()==true){filsfrere.SetX(filsfrere.GetX()/filsfrere.GetNbr());s=pgcd(s,filsfrere.GetX());}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(frerepere.GetExiste()==true){frerepere.SetX(frerepere.GetX()/frerepere.GetNbr());s=pgcd(s,frerepere.GetX());}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsfrerepere.GetExiste()==true){filsfrerepere.SetX(filsfrerepere.GetX()/filsfrerepere.GetNbr());s=pgcd(s,filsfrerepere.GetX());}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(oncle.GetExiste()==true){oncle.SetX(oncle.GetX()/oncle.GetNbr());s=pgcd(s,oncle.GetX());}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsoncle.GetExiste()==true){filsoncle.SetX(filsoncle.GetX()/filsoncle.GetNbr());s=pgcd(s,filsoncle.GetX());}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(onclepere.GetExiste()==true){onclepere.SetX(onclepere.GetX()/onclepere.GetNbr());s=pgcd(s,onclepere.GetX());}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsonclepere.GetExiste()==true){filsonclepere.SetX(filsonclepere.GetX()/filsonclepere.GetNbr());s=pgcd(s,filsonclepere.GetX());}
		/******************************************************************************************************/
		if(s==0) {s=1;}
		cf=cf/s;
		if(homme.GetExiste()==true){homme.SetX(homme.GetX()/s);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(femme.GetExiste()==true){femme.SetX(femme.GetX()/s);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(mere.GetExiste()==true){mere.SetX(mere.GetX()/s);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(freremere.GetExiste()==true){freremere.SetX(freremere.GetX()/s);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeurmere.GetExiste()==true){soeurmere.SetX(soeurmere.GetX()/s);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(gdmm.GetExiste()==true){gdmm.SetX(gdmm.GetX()/s);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(gdmp.GetExiste()==true){gdmp.SetX(gdmp.GetX()/s);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(pere.GetExiste()==true){pere.SetX(pere.GetX()/s);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(gdpp.GetExiste()==true){gdpp.SetX(gdpp.GetX()/s);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(fille.GetExiste()==true){fille.SetX(fille.GetX()/s);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(fillefils.GetExiste()==true){fillefils.SetX(fillefils.GetX()/s);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeur.GetExiste()==true){soeur.SetX(soeur.GetX()/s);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(frere.GetExiste()==true){frere.SetX(frere.GetX()/s);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeurpere.GetExiste()==true){soeurpere.SetX(soeurpere.GetX()/s);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(fils.GetExiste()==true){fils.SetX(fils.GetX()/s);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsfils.GetExiste()==true){filsfils.SetX(filsfils.GetX()/s);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsfrere.GetExiste()==true){filsfrere.SetX(filsfrere.GetX()/s);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(frerepere.GetExiste()==true){frerepere.SetX(frerepere.GetX()/s);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsfrerepere.GetExiste()==true){filsfrerepere.SetX(filsfrerepere.GetX()/s);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(oncle.GetExiste()==true){oncle.SetX(oncle.GetX()/s);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsoncle.GetExiste()==true){filsoncle.SetX(filsoncle.GetX()/s);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(onclepere.GetExiste()==true){onclepere.SetX(onclepere.GetX()/s);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsonclepere.GetExiste()==true){filsonclepere.SetX(filsonclepere.GetX()/s);}
		

		
		/********************** Ajout du testament s'il existe *************************/
		if(v_wassiya==1)
		{ 
			////////////////////Ajout du benifice du testament a la personne concernee  \\\\\\\\\\\\\\\\\\\\
			int verified=0; //cette variabe permet de verifier si la personne concerne du testament merite ou non
			switch(choix)
			{
				case 1:
					if(filsfils.GetSolde()==0)
					{
						filsfils.SetSolde(somme/(double)3);
						filsfils.SetX(cf);
						filsfils.SetStatut("Wassiya");
						verified=1;
					}
					break;
				case 2:
					if(fillefils.GetSolde()==0)
					{
						fillefils.SetSolde(somme/(double)3);
						fillefils.SetX(cf);
						fillefils.SetStatut("Wassiya");
						verified=1;
					}
					break;
				case 3:
					if(gdpp.GetSolde()==0)
					{
						gdpp.SetSolde(somme/(double)3);
						gdpp.SetX(cf);
						gdpp.SetStatut("Wassiya");
						verified=1;
					}
					break;
				case 4:
					if(gdmm.GetSolde()==0)
					{
						gdmm.SetSolde(somme/(double)3);
						gdmm.SetX(cf);
						gdmm.SetStatut("Wassiya");
						verified=1;
					}
					break;
				case 5:
					if(gdmp.GetSolde()==0)
					{
						gdmp.SetSolde(somme/(double)3);
						gdmp.SetX(cf);
						gdmp.SetStatut("Wassiya");
						verified=1;
					}
					break;
				case 6:
					if(frere.GetSolde()==0)
					{
						frere.SetSolde(somme/(double)3);
						frere.SetX(cf);
						frere.SetStatut("Wassiya");
						verified=1;
					}
					break;
				case 7:
					if(soeur.GetSolde()==0)
					{
						soeur.SetSolde(somme/(double)3);
						soeur.SetX(cf);
						soeur.SetStatut("Wassiya");
						verified=1;
					}
					break;
				case 8:
					if(freremere.GetSolde()==0)
					{
						freremere.SetSolde(somme/(double)3);
						freremere.SetX(cf);
						freremere.SetStatut("Wassiya");
						verified=1;
					}
					break;
				case 9:
					if(soeurmere.GetSolde()==0)
					{
						soeurmere.SetSolde(somme/(double)3);
						soeurmere.SetX(cf);
						soeurmere.SetStatut("Wassiya");
						verified=1;
					}
					break;
				case 10:
					if(frerepere.GetSolde()==0)
					{
						frerepere.SetSolde(somme/(double)3);
						frerepere.SetX(cf);
						frerepere.SetStatut("Wassiya");
						verified=1;
					}
					break;
				case 11:
					if(soeurpere.GetSolde()==0)
					{
						soeurpere.SetSolde(somme/(double)3);
						soeurpere.SetX(cf);
						soeurpere.SetStatut("Wassiya");
						verified=1;
					}
					break;
				case 12:
					if(filsfrere.GetSolde()==0)
					{
						filsfrere.SetSolde(somme/(double)3);
						filsfrere.SetX(cf);
						filsfrere.SetStatut("Wassiya");
						verified=1;
					}
					break;
				case 13:
					if(filsfrerepere.GetSolde()==0)
					{
						filsfrerepere.SetSolde(somme/(double)3);
						filsfrerepere.SetX(cf);
						filsfrerepere.SetStatut("Wassiya");
						verified=1;
					}
					break;
				case 14:
					if(oncle.GetSolde()==0)
					{
						oncle.SetSolde(somme/(double)3);
						oncle.SetX(cf);
						oncle.SetStatut("Wassiya");
						verified=1;
					}
					break;
				case 15:
					if(onclepere.GetSolde()==0)
					{
						onclepere.SetSolde(somme/(double)3);
						onclepere.SetX(cf);
						onclepere.SetStatut("Wassiya");
						verified=1;
					}
					break;
				case 16:
					if(filsoncle.GetSolde()==0)
					{
						filsoncle.SetSolde(somme/(double)3);
						filsoncle.SetX(cf);
						filsoncle.SetStatut("Wassiya");
						verified=1;
					}
					break;
				case 17:
					if(filsonclepere.GetSolde()==0)
					{
						filsonclepere.SetSolde(somme/(double)3);
						filsonclepere.SetX(cf);
						filsonclepere.SetStatut("Wassiya");
						verified=1;
					}
					break;
				case 18:
					autreSolde=somme/(double)3;
					autreX=cf;
					verified=1;
					break;
			}
			//////////////////// Les nouveaux coefficients et soldes sans affecter le testament au benificiere \\\\\\\\\\\\\\\\\\\\
			if(verified==1)
			{
				cf=cf*3;
				if(homme.GetExiste()==true){homme.SetX(homme.GetX()*2);homme.SetY(homme.GetY()*3);homme.SetSolde((homme.GetSolde()*2)/(double)3);}
				////////////////////////////////////////////////////////////////////////////////////////////////////////		
				if(femme.GetExiste()==true){femme.SetX(femme.GetX()*2);femme.SetY(femme.GetY()*3);femme.SetSolde((femme.GetSolde()*2)/(double)3);}
				////////////////////////////////////////////////////////////////////////////////////////////////////////
				if(mere.GetExiste()==true){mere.SetX(mere.GetX()*2);mere.SetY(mere.GetY()*3);mere.SetSolde((mere.GetSolde()*2)/(double)3);}
				////////////////////////////////////////////////////////////////////////////////////////////////////////
				if(freremere.GetExiste()==true && freremere.GetStatut()!="Wassiya"){freremere.SetX(freremere.GetX()*2);freremere.SetY(freremere.GetY()*3);freremere.SetSolde((freremere.GetSolde()*2)/(double)3);}
				////////////////////////////////////////////////////////////////////////////////////////////////////////
				if(soeurmere.GetExiste()==true && soeurmere.GetStatut()!="Wassiya"){soeurmere.SetX(soeurmere.GetX()*2);soeurmere.SetY(soeurmere.GetY()*3);soeurmere.SetSolde((soeurmere.GetSolde()*2)/(double)3);}
				////////////////////////////////////////////////////////////////////////////////////////////////////////
				if(gdmm.GetExiste()==true && gdmm.GetStatut()!="Wassiya"){gdmm.SetX(gdmm.GetX()*2);gdmm.SetY(gdmm.GetY()*3);gdmm.SetSolde((gdmm.GetSolde()*2)/(double)3);}
				////////////////////////////////////////////////////////////////////////////////////////////////////////
				if(gdmp.GetExiste()==true && gdmp.GetStatut()!="Wassiya"){gdmp.SetX(gdmp.GetX()*2);gdmp.SetY(gdmp.GetY()*3);gdmp.SetSolde((gdmp.GetSolde()*2)/(double)3);}
				////////////////////////////////////////////////////////////////////////////////////////////////////////		
				if(pere.GetExiste()==true){pere.SetX(pere.GetX()*2);pere.SetY(pere.GetY()*3);pere.SetSolde((pere.GetSolde()*2)/(double)3);}
				////////////////////////////////////////////////////////////////////////////////////////////////////////		
				if(gdpp.GetExiste()==true && gdpp.GetStatut()!="Wassiya"){gdpp.SetX(gdpp.GetX()*2);gdpp.SetY(gdpp.GetY()*3);gdpp.SetSolde((gdpp.GetSolde()*2)/(double)3);}
				////////////////////////////////////////////////////////////////////////////////////////////////////////		
				if(fille.GetExiste()==true){fille.SetX(fille.GetX()*2);fille.SetY(fille.GetY()*3);fille.SetSolde((fille.GetSolde()*2)/(double)3);}
				//////////////////////////////////////////////////////////////////////////////////////////////////////
				if(fillefils.GetExiste()==true && fillefils.GetStatut()!="Wassiya"){fillefils.SetX(fillefils.GetX()*2);fillefils.SetY(fillefils.GetY()*3);fillefils.SetSolde((fillefils.GetSolde()*2)/(double)3);}
				//////////////////////////////////////////////////////////////////////////////////////////////////////
				if(soeur.GetExiste()==true && soeur.GetStatut()!="Wassiya"){soeur.SetX(soeur.GetX()*2);soeur.SetY(soeur.GetY()*3);soeur.SetSolde((soeur.GetSolde()*2)/(double)3);}
				//////////////////////////////////////////////////////////////////////////////////////////////////////
				if(frere.GetExiste()==true && frere.GetStatut()!="Wassiya"){frere.SetX(frere.GetX()*2);frere.SetY(frere.GetY()*3);frere.SetSolde((frere.GetSolde()*2)/(double)3);}
				//////////////////////////////////////////////////////////////////////////////////////////////////////
				if(soeurpere.GetExiste()==true && soeurpere.GetStatut()!="Wassiya"){soeurpere.SetX(soeurpere.GetX()*2);soeurpere.SetY(soeurpere.GetY()*3);soeurpere.SetSolde((soeurpere.GetSolde()*2)/(double)3);}
				//////////////////////////////////////////////////////////////////////////////////////////////////////
				if(fils.GetExiste()==true){fils.SetX(fils.GetX()*2);fils.SetY(fils.GetY()*3);fils.SetSolde((fils.GetSolde()*2)/(double)3);}
				//////////////////////////////////////////////////////////////////////////////////////////////////////
				if(filsfils.GetExiste()==true && filsfils.GetStatut()!="Wassiya"){filsfils.SetX(filsfils.GetX()*2);filsfils.SetY(filsfils.GetY()*3);filsfils.SetSolde((filsfils.GetSolde()*2)/(double)3);}
				//////////////////////////////////////////////////////////////////////////////////////////////////////
				if(filsfrere.GetExiste()==true && filsfrere.GetStatut()!="Wassiya"){filsfrere.SetX(filsfrere.GetX()*2);filsfrere.SetY(filsfrere.GetY()*3);filsfrere.SetSolde((filsfrere.GetSolde()*2)/(double)3);}
				//////////////////////////////////////////////////////////////////////////////////////////////////////
				if(frerepere.GetExiste()==true && frerepere.GetStatut()!="Wassiya"){frerepere.SetX(frerepere.GetX()*2);frerepere.SetY(frerepere.GetY()*3);frerepere.SetSolde((frerepere.GetSolde()*2)/(double)3);}
				//////////////////////////////////////////////////////////////////////////////////////////////////////
				if(filsfrerepere.GetExiste()==true && filsfrerepere.GetStatut()!="Wassiya"){filsfrerepere.SetX(filsfrerepere.GetX()*2);filsfrerepere.SetY(filsfrerepere.GetY()*3);filsfrerepere.SetSolde((filsfrerepere.GetSolde()*2)/(double)3);}
				//////////////////////////////////////////////////////////////////////////////////////////////////////
				if(oncle.GetExiste()==true && oncle.GetStatut()!="Wassiya"){oncle.SetX(oncle.GetX()*2);oncle.SetY(oncle.GetY()*3);oncle.SetSolde((oncle.GetSolde()*2)/(double)3);}
				//////////////////////////////////////////////////////////////////////////////////////////////////////
				if(filsoncle.GetExiste()==true && filsoncle.GetStatut()!="Wassiya"){filsoncle.SetX(filsoncle.GetX()*2);filsoncle.SetY(filsoncle.GetY()*3);filsoncle.SetSolde((filsoncle.GetSolde()*2)/(double)3);}
				//////////////////////////////////////////////////////////////////////////////////////////////////////
				if(onclepere.GetExiste()==true && onclepere.GetStatut()!="Wassiya"){onclepere.SetX(onclepere.GetX()*2);onclepere.SetY(onclepere.GetY()*3);onclepere.SetSolde((onclepere.GetSolde()*2)/(double)3);}
				//////////////////////////////////////////////////////////////////////////////////////////////////////
				if(filsonclepere.GetExiste()==true && filsonclepere.GetStatut()!="Wassiya"){filsonclepere.SetX(filsonclepere.GetX()*2);filsonclepere.SetY(filsonclepere.GetY()*3);filsonclepere.SetSolde((filsonclepere.GetSolde()*2)/(double)3);}
			}
			/********************* Simplification *********************************/
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			int ss=cf;
			if(homme.GetExiste()==true){ss=pgcd(ss,homme.GetX());}
			////////////////////////////////////////////////////////////////////////////////////////////////////////		
			if(femme.GetExiste()==true){ss=pgcd(ss,femme.GetX());}
			////////////////////////////////////////////////////////////////////////////////////////////////////////
			if(mere.GetExiste()==true){ss=pgcd(ss,mere.GetX());}
			////////////////////////////////////////////////////////////////////////////////////////////////////////
			if(freremere.GetExiste()==true){ss=pgcd(ss,freremere.GetX());}
			////////////////////////////////////////////////////////////////////////////////////////////////////////
			if(soeurmere.GetExiste()==true){ss=pgcd(ss,soeurmere.GetX());}
			////////////////////////////////////////////////////////////////////////////////////////////////////////
			if(gdmm.GetExiste()==true){ss=pgcd(ss,gdmm.GetX());}
			////////////////////////////////////////////////////////////////////////////////////////////////////////
			if(gdmp.GetExiste()==true){ss=pgcd(ss,gdmp.GetX());}
			////////////////////////////////////////////////////////////////////////////////////////////////////////		
			if(pere.GetExiste()==true){ss=pgcd(ss,pere.GetX());}
			////////////////////////////////////////////////////////////////////////////////////////////////////////		
			if(gdpp.GetExiste()==true){ss=pgcd(ss,gdpp.GetX());}
			////////////////////////////////////////////////////////////////////////////////////////////////////////		
			if(fille.GetExiste()==true){ss=pgcd(ss,fille.GetX());}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(fillefils.GetExiste()==true){ss=pgcd(ss,fillefils.GetX());}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(soeur.GetExiste()==true){ss=pgcd(ss,soeur.GetX());}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(frere.GetExiste()==true){ss=pgcd(ss,frere.GetX());}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(soeurpere.GetExiste()==true){ss=pgcd(ss,soeurpere.GetX());}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(fils.GetExiste()==true){ss=pgcd(ss,fils.GetX());}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(filsfils.GetExiste()==true){ss=pgcd(ss,filsfils.GetX());}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(filsfrere.GetExiste()==true){ss=pgcd(ss,filsfrere.GetX());}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(frerepere.GetExiste()==true){ss=pgcd(ss,frerepere.GetX());}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(filsfrerepere.GetExiste()==true){ss=pgcd(ss,filsfrerepere.GetX());}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(oncle.GetExiste()==true){ss=pgcd(ss,oncle.GetX());}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(filsoncle.GetExiste()==true){ss=pgcd(ss,filsoncle.GetX());}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(onclepere.GetExiste()==true){ss=pgcd(ss,onclepere.GetX());}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(filsonclepere.GetExiste()==true){ss=pgcd(ss,filsonclepere.GetX());}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(choix==18) {ss=pgcd(ss,autreX);}
			/******************************************************************************************************/
			cf=cf/ss;
			if(homme.GetExiste()==true){homme.SetX(homme.GetX()/ss);}
			////////////////////////////////////////////////////////////////////////////////////////////////////////		
			if(femme.GetExiste()==true){femme.SetX(femme.GetX()/ss);}
			////////////////////////////////////////////////////////////////////////////////////////////////////////
			if(mere.GetExiste()==true){mere.SetX(mere.GetX()/ss);}
			////////////////////////////////////////////////////////////////////////////////////////////////////////
			if(freremere.GetExiste()==true){freremere.SetX(freremere.GetX()/ss);}
			////////////////////////////////////////////////////////////////////////////////////////////////////////
			if(soeurmere.GetExiste()==true){soeurmere.SetX(soeurmere.GetX()/ss);}
			////////////////////////////////////////////////////////////////////////////////////////////////////////
			if(gdmm.GetExiste()==true){gdmm.SetX(gdmm.GetX()/ss);}
			////////////////////////////////////////////////////////////////////////////////////////////////////////
			if(gdmp.GetExiste()==true){gdmp.SetX(gdmp.GetX()/ss);}
			////////////////////////////////////////////////////////////////////////////////////////////////////////		
			if(pere.GetExiste()==true){pere.SetX(pere.GetX()/ss);}
			////////////////////////////////////////////////////////////////////////////////////////////////////////		
			if(gdpp.GetExiste()==true){gdpp.SetX(gdpp.GetX()/ss);}
			////////////////////////////////////////////////////////////////////////////////////////////////////////		
			if(fille.GetExiste()==true){fille.SetX(fille.GetX()/ss);}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(fillefils.GetExiste()==true){fillefils.SetX(fillefils.GetX()/ss);}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(soeur.GetExiste()==true){soeur.SetX(soeur.GetX()/ss);}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(frere.GetExiste()==true){frere.SetX(frere.GetX()/ss);}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(soeurpere.GetExiste()==true){soeurpere.SetX(soeurpere.GetX()/ss);}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(fils.GetExiste()==true){fils.SetX(fils.GetX()/ss);}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(filsfils.GetExiste()==true){filsfils.SetX(filsfils.GetX()/ss);}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(filsfrere.GetExiste()==true){filsfrere.SetX(filsfrere.GetX()/ss);}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(frerepere.GetExiste()==true){frerepere.SetX(frerepere.GetX()/ss);}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(filsfrerepere.GetExiste()==true){filsfrerepere.SetX(filsfrerepere.GetX()/ss);}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(oncle.GetExiste()==true){oncle.SetX(oncle.GetX()/ss);}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(filsoncle.GetExiste()==true){filsoncle.SetX(filsoncle.GetX()/ss);}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(onclepere.GetExiste()==true){onclepere.SetX(onclepere.GetX()/ss);}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(filsonclepere.GetExiste()==true){filsonclepere.SetX(filsonclepere.GetX()/ss);}
			//////////////////////////////////////////////////////////////////////////////////////////////////////
			if(choix==18) {autreX=autreX/ss;}
		}
		/********************* Calcul Solde final *********************************/
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(homme.GetExiste()==true){homme.CalculSolde(somme,cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(femme.GetExiste()==true){femme.CalculSolde(somme,cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(mere.GetExiste()==true){mere.CalculSolde(somme,cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(freremere.GetExiste()==true){freremere.CalculSolde(somme,cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeurmere.GetExiste()==true){soeurmere.CalculSolde(somme,cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(gdmm.GetExiste()==true){gdmm.CalculSolde(somme,cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(gdmp.GetExiste()==true){gdmp.CalculSolde(somme,cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(pere.GetExiste()==true){pere.CalculSolde(somme,cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(gdpp.GetExiste()==true){gdpp.CalculSolde(somme,cf);}
		////////////////////////////////////////////////////////////////////////////////////////////////////////		
		if(fille.GetExiste()==true){fille.CalculSolde(somme,cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(fillefils.GetExiste()==true){fillefils.CalculSolde(somme,cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeur.GetExiste()==true){soeur.CalculSolde(somme,cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(frere.GetExiste()==true){frere.CalculSolde(somme,cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(soeurpere.GetExiste()==true){soeurpere.CalculSolde(somme,cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(fils.GetExiste()==true){fils.CalculSolde(somme,cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsfils.GetExiste()==true){filsfils.CalculSolde(somme,cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsfrere.GetExiste()==true){filsfrere.CalculSolde(somme,cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(frerepere.GetExiste()==true){frerepere.CalculSolde(somme,cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsfrerepere.GetExiste()==true){filsfrerepere.CalculSolde(somme,cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(oncle.GetExiste()==true){oncle.CalculSolde(somme,cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsoncle.GetExiste()==true){filsoncle.CalculSolde(somme,cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(onclepere.GetExiste()==true){onclepere.CalculSolde(somme,cf);}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(filsonclepere.GetExiste()==true){filsonclepere.CalculSolde(somme,cf);}
		//Recuperation de la somme des coefficient
		totalcoef=cf;
		/********************* Affichage *********************************/
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		if(homme.GetExiste()==true)
		{
			this.h1=homme.GetSolde();
			this.h2=homme.GetX();
		}
		if(femme.GetExiste()==true)
		{
			this.fe1=femme.GetSolde();
			this.fe2=femme.GetX();
		}
		if(mere.GetExiste()==true)
		{
			this.m1=mere.GetSolde();
			this.m2=mere.GetX();
		}
		if(pere.GetExiste()==true)
		{
			this.p1=pere.GetSolde();
			this.p2=pere.GetX();
		}
		if(fils.GetExiste()==true)
		{
			this.g1=fils.GetSolde();
			this.g2=fils.GetX();
		}
		if(fille.GetExiste()==true)
		{
			this.fi1=fille.GetSolde();
			this.fi2=fille.GetX();
		}
		if(gdmm.GetExiste()==true)
		{
			this.gmm1=gdmm.GetSolde();
			this.gmm2=gdmm.GetX();
		}
		if(gdmp.GetExiste()==true)
		{
			this.gmp1=gdmp.GetSolde();
			this.gmp2=gdmp.GetX();
		}
		if(gdpp.GetExiste()==true)
		{
			this.gp1=gdpp.GetSolde();
			this.gp2=gdpp.GetX();
		}
		if(filsfils.GetExiste()==true)
		{
			this.gg1=filsfils.GetSolde();
			this.gg2=filsfils.GetX();
		}
		if(fillefils.GetExiste()==true)
		{
			this.fig1=fillefils.GetSolde();
			this.fig2=fillefils.GetX();
		}
		if(freremere.GetExiste()==true)
		{
			this.frm1=freremere.GetSolde();
			this.frm2=freremere.GetX();
		}
		if(soeurmere.GetExiste()==true)
		{
			this.som1=soeurmere.GetSolde();
			this.som2=soeurmere.GetX();
		}
		if(frere.GetExiste()==true)
		{
			this.fr1=frere.GetSolde();
			this.fr2=frere.GetX();
		}
		if(soeur.GetExiste()==true)
		{
			this.so1=soeur.GetSolde();
			this.so2=soeur.GetX();
		}
		if(filsfrere.GetExiste()==true)
		{
			this.gfr1=filsfrere.GetSolde();
			this.gfr2=filsfrere.GetX();
		}
		if(frerepere.GetExiste()==true)
		{
			this.frp1=frerepere.GetSolde();
			this.frp2=frerepere.GetX();
		}
		if(soeurpere.GetExiste()==true)
		{
			this.sop1=soeurpere.GetSolde();
			this.sop2=soeurpere.GetX();
		}
		if(filsfrerepere.GetExiste()==true)
		{
			this.gfrp1=filsfrerepere.GetSolde();
			this.gfrp2=filsfrerepere.GetX();
		}
		if(oncle.GetExiste()==true)
		{
			this.on1=oncle.GetSolde();
			this.on2=oncle.GetX();
		}
		if(filsoncle.GetExiste()==true)
		{
			this.gon1=filsoncle.GetSolde();
			this.gon2=filsoncle.GetX();
		}
		if(onclepere.GetExiste()==true)
		{
			this.onp1=onclepere.GetSolde();
			this.onp2=onclepere.GetX();
		}
		if(filsonclepere.GetExiste()==true)
		{
			this.gonp1=filsonclepere.GetSolde();
			this.gonp2=filsonclepere.GetX();
		}

	}
	
	
	public double H1() {return h1;}
	public int H2() {return h2;}
	public double Fe1() {return fe1;}
	public int Fe2() {return fe2;}
	public double M1() {return m1;}
	public int M2() {return m2;}
	public double P1() {return p1;}
	public int P2() {return p2;}
	public double G1() {return g1;}
	public int G2() {return g2;}
	public double Fi1() {return fi1;}
	public int Fi2() {return fi2;}
	public double Gg1() {return gg1;}
	public int Gg2() {return gg2;}
	public double Fig1() {return fig1;}
	public int Fig2() {return fig2;}
	public double Gp1() {return gp1;}
	public int Gp2() {return gp2;}
	public double Gmm1() {return gmm1;}
	public int Gmm2() {return gmm2;}
	public double Gmp1() {return gmp1;}
	public int Gmp2() {return gmp2;}
	public double Fr1() {return fr1;}
	public int Fr2() {return fr2;}
	public double So1() {return so1;}
	public int So2() {return so2;}
	public double Frm1() {return frm1;}
	public int Frm2() {return frm2;}
	public double Som1() {return som1;}
	public int Som2() {return som2;}
	public double Frp1() {return frp1;}
	public int Frp2() {return frp2;}
	public double Sop1() {return sop1;}
	public int Sop2() {return sop2;}
	public double Gfr1() {return gfr1;}
	public int Gfr2() {return gfr2;}
	public double Gfrp1() {return gfrp1;}
	public int Gfrp2() {return gfrp2;}
	public double On1() {return on1;}
	public int On2() {return on2;}
	public double Onp1() {return onp1;}
	public int Onp2() {return onp2;}
	public double Gon1() {return gon1;}
	public int Gon2() {return gon2;}
	public double Gonp1() {return gonp1;}
	public int Gonp2() {return gonp2;}
	public double AutreSolde() {return autreSolde;}
	public int AutreX() {return autreX;}
	public int TotalCoef() {return totalcoef;}

}
