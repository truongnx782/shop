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
public class BaiTap {
//    bt1:
    int chieuDai;
    int chieuRong;

    public BaiTap(int chieuDai,int chieuRong){
        this.chieuDai=chieuDai;
        this.chieuRong=chieuRong;
    }
        public BaiTap(){
 //       dùng khi sử dụng hàm có tham số truyền vào mà vẫn muốn input ở hàm main
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }
    
    int dienTich(){
        return chieuDai * chieuRong;
    }
    int chuVi(){
        return (chieuDai + chieuRong)*2;
    }
    
void HienThiThongTinHCN(){
    System.out.println("chieu dai: " + chieuDai + " chieu rong " +chieuRong + "diện tích: " +dienTich() +" chu vi: " +chuVi() );
} 
    
//    bt2:
    
int a;
int b;
int c;
    public BaiTap(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;  
    }
//    public BaiTap(){
//         đã có ở trên 
//    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    int delta(){
      return (b*b)- 4 *a*c;
    }
    
//     int nghiem(){
//        
//         int kq = delta();
//         
//         if(kq < 0 ){
//             System.out.println("Phương trình vô nghiệm");
//         }else if(kq >0){
//             int x=-b/2*a;
//             System.out.println("phương trình có 2 ng kép x1,x2 =" +x);
//             }
//             else   {
//                     System.out.println("he");
//                     } 
//         
         

    
    void HienThiPhuongTrinh(){
        System.out.println(" a:"+a+" b: "+b+" c: "+c+" delta: "+delta());
    }


    
    
   
}
