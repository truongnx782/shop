/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bthuongdoituong;

/**
 *
 * @author Asus
 */
public class Main {

    public static void main(String[] args) {
        
//        bt1:
        BaiTap HCN1 = new BaiTap(5, 3);
        BaiTap HCN2 = new BaiTap();
        HCN2.setChieuDai(6);
        HCN2.setChieuRong(4);
        
        HCN1.HienThiThongTinHCN();
        HCN2.HienThiThongTinHCN();

        
        
// bt2:
        BaiTap PhuongTrinh= new BaiTap(5,6,7);
        BaiTap PhuongTrinh2= new BaiTap();
        PhuongTrinh2.setA(5);
           PhuongTrinh2.setB(9);
              PhuongTrinh2.setC(7);
       
        
        
        
        PhuongTrinh.HienThiPhuongTrinh();
           PhuongTrinh2.HienThiPhuongTrinh();
    }
}
