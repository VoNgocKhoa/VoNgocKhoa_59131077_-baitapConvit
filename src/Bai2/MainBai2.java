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
public class MainBai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        HangHoa HH1 = new HangHoa("Áo dài tay  ", 600000, "kẻ sọc");
        HangHoa HH2 = new HangHoa("Áo ngắn tay", 800000, "trơn");
      
        
        GioHang Giohang1 = new GioHang();
        Giohang1.setHinhThucTT(new ThanhToanOnline());
        Giohang1.them(HH1);
        Giohang1.them(HH2);
        
        ArrayList<HangHoa> DsHangHoa1 = Giohang1.getDsHangHoa();
        System.out.println("Danh sách hàng hóa");
        for (HangHoa HangHoa : DsHangHoa1) 
        {
           System.out.println(HangHoa.ThongTinHangHoa() + "Hàng hóa: ");
        }
        Giohang1.inDs();
        System.out.println("Tiền hàng: " + Giohang1.TongTienHang());
        System.out.println("Số tiền khách phải thanh toán: " + Giohang1.ThanhToan());
        
        System.out.println("");
        
        GioHang GioHang2 = new GioHang();
        GioHang2.setHinhThucTT(new ThanhToanCOD());
        GioHang2.them(HH1);
        GioHang2.them(HH2);
 //       ArrayList<HangHoa> dsHangHoa2 = GioHang2.getDsHangHoa();
 //       System.out.println("Danh sách hàng trong giỏ");
 //       for (HangHoa HangHoa : dsHangHoa2) 
 //           {
 //           System.out.println("Hàng hóa: " + HangHoa.ThongTinHangHoa());
 //           }
        GioHang2.inDs();
        System.out.println("Tiền hàng: " + GioHang2.TongTienHang());
        System.out.println("Số tiền khách phải thanh toán: " + GioHang2.ThanhToan());
    }
}
    

