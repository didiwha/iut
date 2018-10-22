package Bataille;
import java.util.Random;

/**
 * @author Marion
 */
//Cette classe permet de lance un dé pour gérer les dégats de façon aléatoire
public class De {
        private static int nbFace=3;
        private static final Random rand = new Random();
    
    public De(){
    }
    
    public static int alea(){
        return rand.nextInt(nbFace)+1;
    }
    
}
