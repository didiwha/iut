package Bataille;

/**
 * @author Marion
 */

/*Classe Guerrier*/
public class Guerrier {
    private int force=10;
    private int PV=100;
    private int armure=1;
    private int cout=1;
            
    public Guerrier(){//Constructeur de la classe
    }
    
    /*Un guerrier inflige des dégats au guerrier passé en paramètre*/
    public void inflige(Guerrier guerrier){
        //De de=new De(3);//Lance un dé pour que les dégats soient aléatoires
        int degat=0;
        for(int i=0;i<getForce();i++){//Fait la somme de tous les dés afin d'avoir les dégats totaux
            degat= degat + De.alea();
        }
        degat=degat/guerrier.getArmure();//Réduit les dégats en fonction de l'armure du guerrier
        guerrier.recoit(degat);
        System.out.println(" reçoit " + degat +" dégats");//Affiche les dégats subit par le guerrier
    }
    
    //Met à jour les PV d'un guerrier en fonction des dégats qu'il reçoit
    public void recoit(int degat){
        this.setPV(this.getPV()-degat);
    }
    
    //Test si un guerrier est vivant, renvoie true si ses PV>0
    public boolean estVivant(){
        return this.getPV()>0;
    }
    
    public int mangeRessource(int ressource){
        return ressource-getCout();
    }
    
    //Getter et Setter    
    public int getForce() {
        return force;
    }

    public int getPV() {
        return PV;
    }

    public void setPV(int PV) {
        if(PV<0){
            this.PV=0;
        }
        else{
            this.PV = PV;
        }
    }

    public int getArmure() {
        return armure;
    }

    public void setArmure(int armure) {
        this.armure = armure;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getCout() {
        return cout;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }    
}
