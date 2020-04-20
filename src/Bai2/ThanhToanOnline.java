/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author long
 */
public class ThanhToanOnline implements IThanhToan{

    @Override
    public double ThanhToan(int TienHang)
    {
         return TienHang < 1000000 ? TienHang * 0.95 : TienHang * 0.93 ;
    }
    
    
    
}
