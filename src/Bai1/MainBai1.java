/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author long
 */
public class MainBai1 {

    public static void main(String[] args) {
        Context Ctt = new Context();
        Ctt.setTinhToan(new Cong());
        
        System.out.println("75 + 12 = " + Ctt.tinh(75, 12));
        Ctt.setTinhToan(new Tru());
        System.out.println("54 - 78 = " + Ctt.tinh(54, 78));
    }
    
}
