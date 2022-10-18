/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author maldy
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operasi m = new Operasi();
        
        System.out.println(m.jumlahkan(3,4));
        System.out.println(m.jumlahkan(4,7,-9));
        System.out.println(m.jumlahkan(3.4,-0.002,0.12313));
        System.out.println(m.jumhlahkan(1, 3, 5.9));
    }
    
}
