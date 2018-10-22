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
public class Cercle{
   // private int x;
    //private int y;
    private Point P1;
    private double rayon;

   /* public Cercle(int x, int y, double rayon){
        this.x=x;
        this.y=y;
        this.rayon=rayon;
    }*/
    
    public Cercle(Point P,double rayon){
        this.P1=P;
        this.rayon=rayon;
    }
/*

    public int getX() {
        return x;
    }


    public void setX(int x) {
        this.x = x;
    }


    public int getY() {
        return y;
    }


    public void setY(int y) {
        this.y = y;
    }
*/

    public double getRayon() {
        return rayon;
    }


    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double getPerimetre(){
        return 2*rayon*Math.PI;
    }

    public double getSurface(){
        return rayon*rayon*Math.PI;
    }

}
