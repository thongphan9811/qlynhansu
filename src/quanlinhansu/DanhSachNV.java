/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlinhansu;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class DanhSachNV {
    ArrayList<nhanvien> list;

    public DanhSachNV() {
        this.list=new ArrayList<nhanvien>();
    }
    public void nhap(nhanvien nv){
        list.add(nv);        
    }
    public nhanvien Tim(String maNV){
        for(nhanvien nv: list){
            if(nv.getManv().equals(maNV))
                return nv;
        }
        return null;
    }
    public void xoa(String maNV){
        for(nhanvien nv: list){
            if(nv.getManv().equals(maNV))
                list.remove(nv);
        }       
    }
    public void sua(nhanvien nv){
        for(int i=0;i<=list.size();i++){
            if(list.get(i).getManv().equals(nv.getManv()))
                list.set(i,nv);
        } 
    }
    public double tongQuyLuong(){
        double tongQuyLuong=0;
        for(nhanvien nv: list){
            tongQuyLuong+=nv.Thuclinh();            
        } 
        return tongQuyLuong;
    }
    public void thongKe(){
        int tongNVBC=0, tongNVHD=0;
        for(nhanvien nv: list){
            if(nv instanceof NhanVienBC)
                tongNVBC++;
            else tongNVHD++;
        }
        System.out.println("tong so nhan vien bien che: "+tongNVBC);
        System.out.println("tong so nhan vien hop dong: "+tongNVHD);
    }
    
}
