/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;
import java.util.ArrayList;
/**
 *
 * @author long
 */
public class QLSV 
{
        ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
    ISoSanh soSanh;

    public void setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
    }
    
    public void them(SinhVien sv) {
        dsSinhVien.add(sv);
    }
   
    public void sapXep() {
        dsSinhVien.sort((a, b) -> soSanh.soSanh((SinhVien)a, (SinhVien)b));
    }
   
    public void inDs() {
        dsSinhVien.forEach(sv -> System.out.println("Sinh viên: " + sv.getThongTin()));
    }
}
