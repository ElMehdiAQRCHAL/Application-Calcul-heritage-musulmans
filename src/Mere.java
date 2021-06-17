
public class Mere extends Fard
{
	private int nbrFrere;
	
	public Mere(String ex_mere)
	{
		String c="";
		c=ex_mere;
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
