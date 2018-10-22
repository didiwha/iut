package Bataille;

/**
 * @author Marion
 */
public class ChefElfe extends Elfe{
    
    public ChefElfe(){
        super.setCout(super.getCout()*2);
        super.setForce(super.getForce()*2);
    }
}