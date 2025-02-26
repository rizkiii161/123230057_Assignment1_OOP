/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentkii;

/**
 *
 * @author crova
 */
 abstract class Kamar {
    protected int noKamar;
    protected String tipeKamar;
    protected int harga;
    protected int nights;
    
    
    public Kamar(int noKamar, String tipeKamar, int harga, int nights){
        this.noKamar = noKamar;
        this.harga = harga;
        this.tipeKamar = tipeKamar;
        this.nights = nights;
    }
    
    protected void getInfoRoom(){
        System.out.println("Room Number : " + noKamar );
        System.out.println("Type Room : " + tipeKamar);
        System.out.println("Nights : " + nights);
        System.out.println("Room Price per night: " + harga);
    }
    
    protected double calcTotalPrice(int nights){
        return (harga * nights);
    }
    
}
