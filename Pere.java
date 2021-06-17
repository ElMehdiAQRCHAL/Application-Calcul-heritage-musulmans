import java.util.Scanner;

public class Pere extends FardEtTaassib
{
	public Pere(String ex_pere)
	{
		Scanner sc = new Scanner(System.in);
		String c="";
		System.out.println("Est-ce qu\'il a de pere : ");
		c=ex_pere;
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
		if(brancheG==true)
		{
			this.x=1;
			this.y=6;
			SetStatut("fard");
		}
		else
		{
			if(brancheF==true)
			{
				this.x=1;
				this.y=6;
				SetStatut("taassib+fard");
			}
			else
			{
				SetStatut("taassib");
			}
		}
	}
}
