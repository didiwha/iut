package Bataille;
import java.util.Scanner;

/**
 * @author Marion
 */

public class Menu {
    private Partie partie;
    private Integer menuPartie;
    
    public void menuPrincipal(Partie partie){
        this.partie=partie;
        do {
            System.out.println("|_|_|_|                  |_|_|_|");
            System.out.println("|     |                  |     |");
            System.out.println("|  =  |__________________|  =  |");
            System.out.println("|     |                  |     |");
            System.out.println("|     |       __         |     |");
            System.out.println("|            |##|              |");
            System.out.println("|            |##|              |");
            System.out.println("~~~~~~~~~~~~~|==|~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~|==|~~~~~~~~~~~~~~~");
            System.out.println("     Lancer une partie : 1      ");
            System.out.println("     Créer armée Bleu  : 2      ");
            System.out.println("     Créer armée Rouge : 3      ");
            System.out.println("     Quitter           : 0      ");

            Scanner scanner=new Scanner(System.in);
            menuPartie = scanner.nextInt();

            switch (menuPartie){
                case 1 :
                    partie.lancerPartie();
                    break;
                    
                case 2 :
                    this.menuArmeeBleue();
                    break;
                
                case 3 :
                    this.menuArmeeRouge();
                    break;
                
                default:
                    break;   
            }
        } while (menuPartie != 0);	
    }
    
    //Permet de recruter son armée
    public void menuArmeeBleue(){
        Integer entree;
        do{  
        System.out.println("=========================================================");
        System.out.println("|Entrainer un nain : 1|");
        System.out.println("|Entrainer un elfe : 2|");
        System.out.println("|Entrainer un chef nain : 3|");
        System.out.println("|Entrainer un chef elfe : 4|");
        System.out.println("|Afficher l'armée : 5|");
        System.out.println("|Valider l'armée : 0|");
        
        Scanner scanner=new Scanner(System.in);
            entree = scanner.nextInt();

            switch (entree){
                case 1 :
                    Nain nain=new Nain();
                    partie.getBleu().entrainer(nain);
                    break;
                
                case 2 :
                    Elfe elfe=new Elfe();
                    partie.getBleu().entrainer(elfe);
                    break;
                
                case 3 :
                    ChefNain chefnain=new ChefNain();
                    partie.getBleu().entrainer(chefnain);
                    break;
                
                case 4 :
                    ChefElfe chefelfe=new ChefElfe();
                    partie.getBleu().entrainer(chefelfe);
                    break;
                
                case 5:
                    partie.getBleu().afficherListeAttente();
                    break;

                default:
                    break;                
            }
        }while (entree != 0);                
    }
    
        //Permet de recruter son armée
    public void menuArmeeRouge(){
        Integer entree;
        do{  
        System.out.println("=========================================================");
        System.out.println("|Entrainer un nain : 1|");
        System.out.println("|Entrainer un elfe : 2|");
        System.out.println("|Entrainer un chef nain : 3|");
        System.out.println("|Entrainer un chef elfe : 4|");
        System.out.println("|Afficher l'armée : 5|");
        System.out.println("|Valider l'arméeEEEEEEEEE : 0|");
        
        Scanner scanner=new Scanner(System.in);
            entree = scanner.nextInt();

            switch (entree){
                case 1 :
                    Nain nain=new Nain();
                    partie.getRouge().entrainer(nain);
                    break;
                
                case 2 :
                    Elfe elfe=new Elfe();
                    partie.getRouge().entrainer(elfe);
                    break;
                
                case 3 :
                    ChefNain chefnain=new ChefNain();
                    partie.getRouge().entrainer(chefnain);
                    break;
                
                case 4 :
                    ChefElfe chefelfe=new ChefElfe();
                    partie.getRouge().entrainer(chefelfe);
                    break;
                
                case 5:
                    partie.getRouge().afficherListeAttente();
                    break;

                default:
                    break;                
            }
        }while (entree != 0);                
    }
}
