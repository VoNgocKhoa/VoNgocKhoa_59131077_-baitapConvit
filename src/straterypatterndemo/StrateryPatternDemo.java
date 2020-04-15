/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package straterypatterndemo;

/**
 *
 * @author long
 */
public class StrateryPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
       Duck duck1 = new VitGioi();
       duck1.setFlyBehavior(new FlyByWings());
       duck1.setQuackBehavior(new Squack());
       System.out.println(duck1.Display());
    }
    
}
