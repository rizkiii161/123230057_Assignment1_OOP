/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignmentkii;

/**
 *
 * @author crova
 */
public class AssignmentKii {

    
    public static void main(String[] args) {
        KamarSuite pesan1 = new KamarSuite(2,"Suite",50,2,true);
        pesan1.pesanKamar();
        pesan1.getInfoRoom();
        System.out.println("");
        KamarStandard pesan2 = new KamarStandard(4,"Standard",20,4,false);
        pesan2.pesanKamar();
        pesan2.getInfoRoom();
        System.out.println("");
        KamarKeluarga pesan3 = new KamarKeluarga(4,"Family",20,4,2);
        pesan3.pesanKamar();
        pesan3.getInfoRoom();
        pesan3.batalkanPesananKamar();
    }
    
}
