package Bataille;

/**
 * @author Marion
 */
public class Plateau {
    private int nbCarreau=5;
    private Carreau[] tabCarreaux;
    
    public Plateau(){
        this.tabCarreaux=new Carreau[nbCarreau];
        this.initPlateau();
    }
    
    public void initPlateau(){
        for(int i=0; i<getNbCarreau(); i++){
            tabCarreaux[i] = new Carreau(i);
}
    }
    
    public void remplirCarreau(Chateau chateau){
        Couleurs couleur=chateau.getCouleurs();
        if(couleur==Couleurs.Bleu){
            tabCarreaux[0].ajouterAuCarreau(chateau.ajouterUnites(),couleur);
            System.out.println("AjoutéB");
        }
        else{
            tabCarreaux[nbCarreau-1].ajouterAuCarreau(chateau.ajouterUnites(),couleur);
            System.out.println("AjoutéR");
        }
    }

    /**
     * @return the nbCarreau
     */
    public int getNbCarreau() {
        return nbCarreau;
    }

    /**
     * @param nbCarreau the nbCarreau to set
     */
    public void setNbCarreau(int nbCarreau) {
        this.nbCarreau = nbCarreau;
    }

    /**
     * @return the tabCarreaux
     */
    public Carreau[] getTabCarreaux() {
        return tabCarreaux;
    }

    /**
     * @param tabCarreaux the tabCarreaux to set
     */
    public void setTabCarreaux(Carreau[] tabCarreaux) {
        this.tabCarreaux = tabCarreaux;
    }
    
    
}
