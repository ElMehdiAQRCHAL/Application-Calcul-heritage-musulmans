public class FardEtTaassib extends Fard
{
	protected boolean brancheG;
	protected boolean brancheF;
	protected boolean asslP;
	
	public void SetBrancheG(Fils fils,FilsDeFils filsfils)
	{
		if(fils.GetExiste()==true || filsfils.GetExiste()==true)
		{
			brancheG=true;
		}
		else
		{
			brancheG=false;
		}
	}
	
	public void SetBrancheF(Fille fille,FilleDeFils fillefils)
	{
		if(fille.GetExiste()==true || fillefils.GetExiste()==true)
		{
			brancheF=true;
		}
		else
		{
			brancheF=false;
		}
	}
	
	public void SetAsslP(Pere pere)
	{
		if(pere.GetExiste()==true)
		{
			asslP=true;
		}
		else
		{
			asslP=false;
		}
	}
	
}
