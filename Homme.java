import java.util.Scanner;

public class Homme extends Fard
{
	public Homme()
	{
		
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
		if(branche==false)
		{
			this.x=1;
			this.y=2;
		}
		else
		{
			this.x=1;
			this.y=4;
		}
	}
	
	public void SetExiste(boolean a)
	{
		this.existe=a;
	}
}
