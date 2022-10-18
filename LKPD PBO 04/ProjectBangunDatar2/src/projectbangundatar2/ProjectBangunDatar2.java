/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author maldy
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persegi a = new Persegi();
        a.hitungLuas(4.5);
        a.hitungLuas(7);
        a.hitungKeliling(4.5);
        a.hitungKeliling(7);
        PersegiPanjang b = new PersegiPanjang();
        b.hitungLuas(10, 5);
        b.hitungLuas(3.6, 8);
        b.hitungLuas(6, 3.8);
        b.hitungLuas(5.6, 8.8);
        b.hitungKeliling(10, 5);
        b.hitungKeliling(3.6, 8);
        b.hitungKeliling(6, 3.8);
        b.hitungKeliling(5.6, 8.8);
        Lingkaran c = new Lingkaran();
        c.hitungLuas(5);
        c.hitungLuas(7.4);
        c.hitungKeliling(5);
        c.hitungKeliling(7.4);
        Segitiga d = new Segitiga();
        d.hitungLuas(8, 10);
        d.hitungLuas(8, 11.5);
        d.hitungLuas(12.2, 9);
        d.hitungLuas(13.9, 20.7);
    }
}
