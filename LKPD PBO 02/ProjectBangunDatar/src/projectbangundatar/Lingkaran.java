/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar;

/**
 *
 * @author maldy
 */
public class Lingkaran {
    double jejari;
    
    void hitungLuas(){
        double luas = 3.14 * this.jejari * this.jejari;
        System.out.println("Luas Lingkaran : " + luas +"Satuan luas");
    }
    
    void hitungKeliling(){
        double keliling = 2 * 3.14 * this.jejari;
        System.out.println("Keliling Lingkaran : " + keliling +"Satuan panjang");
    }
}
