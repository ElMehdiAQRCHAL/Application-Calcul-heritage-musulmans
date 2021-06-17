public class Fard extends Famille
{
	protected boolean branche;
	protected boolean kalala;
	protected int x;
	protected int y=1;
	
	public void SetBranche(Fils f,Fille fe,FilsDeFils ff,FilleDeFils fef)
	{
		if(f.GetExiste()==true || fe.GetExiste()==true || ff.GetExiste()==true || fef.GetExiste()==true)
		{
			branche=true;
		}
		else
		{
			branche=false;
		}
	}
	
	public void SetKalalaG(Pere p,GrandPereDePere gpp)
	{
		if(p.GetExiste()==true || gpp.GetExiste()==true)
		{
			kalala=true;
		}
		else
		{
			kalala=false;
		}
	}
	
	public void SetX(int x)
	{
		this.x=x;
	}
	
	public void SetY(int y)
	{
		this.y=y;
	}
	
	public int GetX()
	{
		return x;
	}
	
	public int GetY()
	{
		return y;
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
}
