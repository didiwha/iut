package Bataille;
import java.util.LinkedList;

/**
 * @author Marion
 */
//EN COURS
public class Chateau {
    private int ressource=3;
    private LinkedList<Guerrier> armee;
    private Couleurs couleur;
    
    public Chateau(){
        this.armee=new LinkedList<>();
    }
    
    //Permet d'entrainer un guerrier dans un château
    public void entrainer(Guerrier guerrier){
            getArmee().add(guerrier);
    }
    
    public LinkedList <Guerrier> ajouterUnites(){
        int ressourceSuffisante=this.getRessource();
        Guerrier guerrier=new Guerrier();
        LinkedList <Guerrier> nouveauArrivant=new LinkedList<>();
        System.out.println("Ressource: " + ressourceSuffisante);
        
        while(!this.getArmee().isEmpty() && ressourceSuffisante>0){ //Tant que l'armée n'est pas vide et que les ressources du château permettent d'entraîner le guerrier
            guerrier=this.getArmee().getFirst();
            
            guerrier.mangeRessource(ressourceSuffisante);
            nouveauArrivant.add(guerrier);
            this.getArmee().remove(guerrier);
        }
        return nouveauArrivant;
    }
    
    //Permet d'afficher l'amée du château
    public void afficherListeAttente(){
        for(int i=0; i<this.getArmee().size();i++){
            System.out.println(getArmee().get(i).getClass().getSimpleName());
        }
    }
    
    public void nouveauTour(){
        setRessource(ressource+1);
    }

    //Getter et Setter
    public int getRessource() {
        return ressource;
    }

    public void setRessource(int ressource) {
        this.ressource = ressource;
    }
    
    public Couleurs getCouleurs(){
        return couleur;
    }
    
    public void setCouleur(Couleurs c){
        this.couleur=c;
    }

    public LinkedList<Guerrier> getArmee() {
        return armee;
    }

    public void setArmee(LinkedList<Guerrier> armee) {
        this.armee = armee;
    }
}
