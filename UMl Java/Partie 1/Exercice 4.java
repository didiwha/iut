
public class Ville
{
	private String nom; 
	private String localisation; 

	
	public Ville( String nom; String localisation)
	{
		this.nom    			= nom;
		this.localisation      	= localisation;
	}
	
	public void AfficheInfos (){
			system.out.print( "Nom ville " + nom +" Localisation : " +localisation ); 
	}

}

public  abstract class Trajet
{
	private String villeD; 
	private String villeA; 
	private float Distance;

}
public class TrajetDirecte extends Trajet
{

	private String villeDi; 
	private String villeAi; 
	private float Distance;
	
	public Trajet( String villeD; String villeA; float Distance; ){
		this.villeD    			= villeD;
		this.villeA      		= villeA;
		this.Distance 			= Distance;	
	}


}

public class TrajetDirecte extends Trajet
{

	private private ArrayList<Trajet> lesTrajets ; 
	
	public Trajet( String villeD; String villeA; float Distance; ){
		lesTrajets = new ArrayList(); 	
	}

	public void AjouterTrajet(Trajet tD)
	{
		lesTrajets.add(tD);
	}
	
	
}
