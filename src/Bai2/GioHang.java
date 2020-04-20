/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;
import java.util.ArrayList;


/**
 *
 * @author long
 */
public class GioHang 
{
    IThanhToan HinhThucTT;
    ArrayList<HangHoa> DsHangHoa = new ArrayList<>();
    
    // setter
    public void setHinhThucTT(IThanhToan HinhThucTT) 
    {
        this.HinhThucTT = HinhThucTT;
    }
        public void them(HangHoa HangHoa) 
        {
        DsHangHoa.add(HangHoa);
        }
    
    public int TongTienHang() {
        int Tong = 0;
        for (HangHoa HangHoa : DsHangHoa) 
        {
            Tong += HangHoa.getGia();
        }
        return Tong;
    }
    
    public double ThanhToan() 
    {
        return HinhThucTT.ThanhToan(TongTienHang());
    }
    public void inDs() 
    {
        DsHangHoa.forEach(HH -> System.out.println("Hàng hóa: " + HH.thongTinHH()));
    }
}
