
public state void main (String[] args)
{
MaisonProduction M1= new MaisonProduction("Universal" "Ici" "www.ici.fr");
CdAudio Cd1 = new CdAudio("KYO" "Le chemin" M1 );
Cd1.afficheInfos;
}

public class CdAudio{
	private String Artiste; 
	private String Titre;
	private String MaisonEdit
	private Date AnneProd;
	
	public CdAudio( String Artiste;String Tit; MaisonProduction Medit ; Date prod)
	{
		Artiste    = Artiste;
		Titre      = Tit;
		MaisonEdit = Medit;
		AnneProd   = prod;
		Medit.ajouterCd(This);
	}
	public afficheInfos()
	{
		system.out.print( "Informations Artiste : " + Artiste +" Titre : " +Titre +" Maison d'édition : " + MaisonEdit.nomMaisonProd() ); 
	}
	
}

public class MaisonProduction
{
	private String Nom; 
	private String AdressePhy; 
	private String AdresseWeb;
	private HashSet<CdAudio> CdProduit;
	
	public MaisonProduction( String n; String ap; String aw )
	{
		Nom    			= n;
		AdressePhy      = ap;
		AdresseWeb 		= aw;
		CdProduit		= HashSet<CdAudio> ();
	}
	public String nomMaisonProd()
	{
		return Nom;
	}
	public ajouterCd (CdAudio cd)
	{
		CdProduit.add(cd);
	}
}


