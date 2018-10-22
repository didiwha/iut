package Bataille;

/**
 * @author Marion
 */
public class Partie {
    private Chateau bleu=new Chateau();
    private Chateau rouge=new Chateau();
    private Plateau plateau=new Plateau();
    private Carreau carreau=new Carreau(3);
    
    public Partie(){      
    }
    //Permet de lancer une partie
    public void lancerPartie(){
        plateau.initPlateau();
        
        plateau.remplirCarreau(bleu);
        carreau.afficherArmee(bleu);
        
        plateau.remplirCarreau(rouge);
        carreau.afficherArmee(rouge);
        
        carreau.combat();
        
    }

    public Chateau getBleu() {
        return bleu;
    }

    public Chateau getRouge() {
        return rouge;
    }  
}
