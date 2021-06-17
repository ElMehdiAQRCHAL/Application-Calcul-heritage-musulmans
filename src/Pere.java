
public class Pere extends FardEtTaassib
{
	public Pere(String ex_pere)
	{
		String c="";
		c=ex_pere;
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
