package Bataille;

/**
 * @author Marion
 */

public class Elfe extends Guerrier {
    
    public Elfe(){
        super.setCout(super.getCout()*2);
        super.setForce(super.getForce()*2);
    }
}
