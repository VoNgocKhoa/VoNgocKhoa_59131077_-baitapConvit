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
public class Context {
     private ITinhToan TinhToan;

    public void setTinhToan(ITinhToan TinhToan) 
    {
    this.TinhToan = TinhToan;
    }
    
    public float tinh(float a, float b) 
    {
    return TinhToan.tinh(a, b);
    }
    
}
