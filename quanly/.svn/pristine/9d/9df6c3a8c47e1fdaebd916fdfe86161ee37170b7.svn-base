/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlinhansu;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public abstract class nhanvien  implements INHANVIEN {
    protected String Manv;
    protected String hoten;
    protected Date ngayvaocoquan;
    protected Scanner sc=new Scanner(System.in);

    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Date getNgayvaocoquan() {
        return ngayvaocoquan;
    }

    public void setNgayvaocoquan(Date ngayvaocoquan) {
        this.ngayvaocoquan = ngayvaocoquan;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    public nhanvien(){}
    public nhanvien( String Manv ,String hoten ,Date ngayvaocoquan)
    { this.Manv=Manv;
      this.hoten=hoten;
      this.ngayvaocoquan=ngayvaocoquan;
      this.sc= new Scanner(System.in);
    }
    @Override
    public abstract String toString();
    public int thamnien(){
        Calendar ngayvao = new GregorianCalendar();
        Calendar ngayhientai = new GregorianCalendar();
         ngayhientai.setTime(Calendar.getInstance().getTime());
         ngayvao.setTime(this.ngayvaocoquan);
         return ngayhientai.get(Calendar.YEAR)- 
                 ngayvao.get(Calendar.YEAR);
    }
   
                
   
    
    
    
    
}
