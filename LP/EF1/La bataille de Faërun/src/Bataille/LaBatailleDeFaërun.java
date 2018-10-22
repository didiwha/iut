package Bataille;

/**
 * @author Marion
 */

/*Permet de créer une partie et un menu*/
public class LaBatailleDeFaërun {

    public static void main(String[] args) {
        Partie partie=new Partie();
        Menu menu=new Menu();
        menu.menuPrincipal(partie);        
    }
}
