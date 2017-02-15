/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto;

/**
 *
 * @author Alberto pc
 */
public class Punto {
    protected int x;
    protected int y;
    protected int z;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }   
   public static double distance(Punto a, Punto b){
       double res = Math.sqrt(Math.pow(a.x-b.x,2)+Math.pow(a.y - b.y, 2));
       return res;
   }
   public static double distance(int x1, int y1, int x2, int y2){
       double res = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2, 2));
       return res;
   }
   public double Norma(){
       return Math.sqrt(Math.pow(this.x ,2)+Math.pow(this.y, 2));
   }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Punto a = new Punto(1,2);
        Punto b = new Punto(2,4);
        Punto3D c = new Punto3D(1,2,3);
        double dist = distance(a,b);
        System.out.println("La distancia entre a y b es: "+dist);
        double norma = a.Norma();
        System.out.println("La norma de a es: "+norma);
        norma = c.Norma();
        System.out.println("La norma de c es: "+norma);
//        System.out.println(distance(a,b));
        // TODO code application logic here
    }
    
}
