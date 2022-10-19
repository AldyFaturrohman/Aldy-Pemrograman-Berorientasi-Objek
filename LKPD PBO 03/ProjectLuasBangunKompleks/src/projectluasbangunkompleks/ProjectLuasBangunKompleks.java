/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author maldy
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persegi x = new Persegi();
        x.sisi = 42;
        
        Lingkaran o = new Lingkaran();
        o.r = 21;
        
        Lingkaran b = new Lingkaran();
        b.r = 14;
        
        Lingkaran c = new Lingkaran();
        c.r = 7;
        
        double hitungtotalluas = x.hitungLuas() + 2 * o.hitungluas(o.r);
        double hitungtotalluas2 = b.hitungluas(b.r)/2 - c.hitungluas(c.r);
        System.out.println("total luas no 1 adalah = "+hitungtotalluas);
        System.out.println("total luas no 2 adalah = "+hitungtotalluas2);
    }
    
}
