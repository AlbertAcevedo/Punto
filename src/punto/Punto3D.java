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
public class Punto3D extends Punto {
    public int z;
    public Punto3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    @Override
    public double Norma(){
        double res = Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2)+Math.pow(this.z,2));
        return res;
    }
    
}
