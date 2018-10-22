
public class Ordinateur
{
	private String nom; 
	private String iP; 
	private String nomDuReseau;
	
	
	public Ordinateur( String nom; String iP; String nomDuReseau )
	{
		this.nom    			= n;
		this.iP      			= iP;
		this.nomDuReseau 		= nomDuReseau;
	}
	
		public void AfficheInfos (){
			system.out.print( "Nom ordinateur " + nom +" IP : " +iP +" Nom du reseau : " + nomDuReseau ); 
	}
	public Boolean Connecter( String reseau)
	{
		return if{reseau==nomDuReseau}
	}
}

public class Passerelle extends Ordinateur
{
	private String nom; 
	private String iP; 
	private String nomDuReseau;
	private String nomDuReseau2;
	
	public Passerelle( String nom; String iP; String nomDuReseau; String nomDuReseau2 )
	{
		this.nom    			= n;
		this.iP      			= iP;
		this.nomDuReseau 		= nomDuReseau;
		this.nomDuReseau2 		= nomDuReseau2
	}
	@Override
	public void AfficheInfos (){
		super.AfficheInfos();
		system.out.print( " Nom du Second reseau : " + nomDuReseau2 ); 
	}
	public Boolean Connecter( String reseau)
	{
		if p instanceof Ordinateur
		{return super.Connecter(reseau)}
		else 
		{return if {reseau==nomDuReseau || reseau==nomDuReseau2}}
	}
}