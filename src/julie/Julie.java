/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package julie;

/**
 *
 * @author Julie
 */
public class Julie {

    static int i;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Hello Word");
       Lapin Lap;
       Lap = new Lapin ("Yves", 50);
       while (i <=10) {
           Lap.Crier();
           i=i+1;
           System.out.println("gdbeu");
       }
    }
    
}
