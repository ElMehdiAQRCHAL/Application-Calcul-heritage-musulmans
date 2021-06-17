public class Taassib extends Famille
{
	protected int x;
	protected int y=1;
	
	public void SetX(int a)
	{
		this.x=a;
	}
	public void SetY(int a)
	{
		this.y=a;
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
	public void CalculSolde(double somme,int cf)
	{
		this.solde=(somme*(double)GetX())/(double)cf;
	}
}
