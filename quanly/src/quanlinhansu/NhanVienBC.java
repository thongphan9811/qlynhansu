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
public class NhanVienBC extends nhanvien{
    private double heSoLuong;
    public NhanVienBC() {
    }

    public NhanVienBC(double heSoLuong, String Manv, String hoten, Date ngayvaocoquan) {
        super(Manv, hoten, ngayvaocoquan);
        this.heSoLuong = heSoLuong;
    }
    
    public double getHeSoLuong() {
        return heSoLuong;
    }
    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    @Override
    public String toString() {
        return "Ma nhan vien: "+this.Manv +"Ho va ten: "
                +this.hoten+"ngay vao lam: "+this.ngayvaocoquan+
                "Phucap"+this.Phucap()+"Thuc Linh "+this.Thuclinh();
    }
    @Override
    public double Phucap() {
        if(thamnien()>=10)  return 0.1*LUONGCB+500000;
        else return 0.1*LUONGCB+200000;
    }
    @Override
    public double Thuclinh() {
        return LUONGCB*heSoLuong+Phucap();
    }
    
}
