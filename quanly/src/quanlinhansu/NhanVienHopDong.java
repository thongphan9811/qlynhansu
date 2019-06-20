/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlinhansu;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class NhanVienHopDong extends nhanvien {
    private double mucluong;
    public NhanVienHopDong () {
    }

    public NhanVienHopDong(double mucluong, String Manv, String hoten, Date ngayvaocoquan) {
        super(Manv, hoten, ngayvaocoquan);
        this.mucluong = mucluong;
    }
   
    public double getMucluong() {
        return mucluong;
    }

    public void setMucluong(double mucluong) {
        this.mucluong = mucluong;
    }    
        @Override
    public String toString() {
        return "Ma nhan vien: "+this.Manv +"Ho va ten: "
                +this.hoten+"ngay vao lam: "+this.ngayvaocoquan+
                "Phucap"+this.Phucap()+"Thuc Linh "+this.Thuclinh();
    }
    @Override
    public double Phucap() {
        if(thamnien()>=2)  return 0.1*200000;
        else return 0.1*LUONGCB+100000;
    }
    @Override
    public double Thuclinh() {
        return LUONGCB*mucluong+Phucap();
    }
}
