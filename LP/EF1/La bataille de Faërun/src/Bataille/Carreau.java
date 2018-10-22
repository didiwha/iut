package Bataille;

import java.util.LinkedList;

/**
 * @author Marion
 */
public class Carreau {
    private LinkedList<Guerrier> armeeBleue;
    private LinkedList<Guerrier> armeeRouge;
    private int numCarreau;
    
    public Carreau(int nb){
        this.numCarreau=nb;
        this.armeeBleue=new LinkedList<>();
        this.armeeRouge=new LinkedList<>();
    }
    
    public void ajouterAuCarreau(LinkedList<Guerrier> armee, Couleurs couleur){
        if(couleur==Couleurs.Bleu){
            armeeBleue.addAll(armee);
        }
        else{
            armeeRouge.addAll(armee);
        }
        
    }
    
    public LinkedList<Guerrier> couleurArmee(Chateau chateau){
        LinkedList<Guerrier> n;
        System.out.println("Chateau : "+chateau.getCouleurs());
        if(chateau.getCouleurs()==Couleurs.Bleu){
            System.out.println("BLEUE!!!!!");
            n=getArmeeBleue();
        }
        else
            System.out.println("ROUGE!!!!!");
            n=getArmeeRouge();
        return n;
    }
    
    public void afficherArmee(Chateau chateau){
        for(int i=0; i<this.couleurArmee(chateau).size();i++){
            System.out.println(couleurArmee(chateau).get(i).getClass().getSimpleName());
        }
    }
    
    //Fait combattre deux guerriers
    public void combat(){
        while(!getArmeeBleue().isEmpty() && !getArmeeRouge().isEmpty()){//Le combat continue tant qu'un des deux guerriers est en vie
            Guerrier guerrierB=getArmeeBleue().getFirst();
            Guerrier guerrierR=getArmeeRouge().getFirst();
            int i=0;
            while(guerrierR.estVivant() && i<getArmeeBleue().size()){
                guerrierB.inflige(guerrierR);
                if(!guerrierR.estVivant()){
                    System.out.println(guerrierR + " est mort dans d'atroce souffrance");
                    getArmeeRouge().remove(guerrierR);
                }
                i++;
                guerrierB=getArmeeBleue().get(i);
            }
            i=0;
            while(guerrierB.estVivant() && i<getArmeeRouge().size()){
                guerrierR.inflige(guerrierB);
                if(!guerrierB.estVivant()){
                    System.out.println(guerrierB + " est mort dans d'atroce souffrance");
                    getArmeeBleue().remove(guerrierB);
                }
                i++;
                guerrierR=getArmeeRouge().get(i);
            }
        }
    }
    

    /**
     * @return the armeeBleue
     */
    public LinkedList<Guerrier> getArmeeBleue() {
        return armeeBleue;
    }

    /**
     * @param armeeBleue the armeeBleue to set
     */
    public void setArmeeBleue(LinkedList<Guerrier> armeeBleue) {
        this.armeeBleue = armeeBleue;
    }

    /**
     * @return the armeeRouge
     */
    public LinkedList<Guerrier> getArmeeRouge() {
        return armeeRouge;
    }

    /**
     * @param armeeRouge the armeeRouge to set
     */
    public void setArmeeRouge(LinkedList<Guerrier> armeeRouge) {
        this.armeeRouge = armeeRouge;
    }

    /**
     * @return the numCarreau
     */
    public int getNumCarreau() {
        return numCarreau;
    }

    /**
     * @param numCarreau the numCarreau to set
     */
    public void setNumCarreau(int numCarreau) {
        this.numCarreau = numCarreau;
    }
}
