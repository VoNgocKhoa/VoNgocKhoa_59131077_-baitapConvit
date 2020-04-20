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
        Tong = DsHangHoa.stream().map((HangHoa) -> HangHoa.getGia()).reduce(Tong, Integer::sum);
        return Tong;
    }
    
    public double ThanhToan() 
    {
        return HinhThucTT.ThanhToan(TongTienHang());
    }
    public void inDs() 
    {
        DsHangHoa.forEach(HH -> System.out.println("Hàng hóa: " + HH.ThongTinHangHoa()));
    }

    ArrayList<HangHoa> getDsHangHoa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}  
