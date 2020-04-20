/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;
import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 *
 * @author long
 */
public class MainBai3 {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException 
        {
        SimpleDateFormat formaterDate = new SimpleDateFormat("dd/MM/yyyy");
    
              QLSV quanLy = new QLSV();
                 quanLy.them(new SinhVien("Vo Ngoc Khoa mot", formaterDate.parse("1/1/2000"), 9.3f));
                 quanLy.them(new SinhVien("Vo Ngoc Khoa hai", formaterDate.parse("1/7/2000"), 5.5f));
                 quanLy.them(new SinhVien("Vo Ngoc Khoa ba", formaterDate.parse("1/10/2000"), 7.2f));
    
              System.out.println("Danh sách sinh viên");
              quanLy.inDs();
     
         // Thực hiện công việc sắp xếp danh sách sinh viên theo tên và in danh sách này
         // ra màn hinh
             quanLy.setSoSanh(new SoSanhTheoTen());
             quanLy.sapXep();
             quanLy.inDs();
             System.out.println("\nDanh sách sinh viên theo tên");
        
        // Thực hiện công việc sắp xếp danh sách sinh viên theo điểm và in danh sách này
        // ra màn hình
             quanLy.setSoSanh(new SoSanhTheoDiem());
             quanLy.sapXep();
             quanLy.inDs();
             System.out.println("\nDanh sách sinh viên theo điểm");
        }    
}
