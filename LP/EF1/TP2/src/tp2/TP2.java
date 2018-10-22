/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

/**
 *
 * @author Marion
 */
public class TP2 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Point P1;
        P1=new Point(2,5);
        int rayon;
        rayon=3;
        Cercle C1;
        C1=new Cercle(P1,rayon);
        
        System.out.println("Surface du cercle :" + C1.getSurface());
        System.out.println("Périmètre du cerc&le :" + C1.getPerimetre());
    }
    
   
}


