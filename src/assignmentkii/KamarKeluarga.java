/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentkii;

/**
 *
 * @author crova
 */
public class KamarKeluarga extends Kamar implements Reservasi {

    private int extraBed = 0;

    public KamarKeluarga(int noKamar, String tipeKamar, int harga, int nights, int extraBed) {
        super(noKamar, tipeKamar, harga, nights);
        this.extraBed = extraBed;
    }
    
    @Override
    protected double calcTotalPrice(int nights){
        return (harga * nights) + (extraBed * 4) + 4;
    }

    @Override
    public void getInfoRoom() {
        System.out.println("Family Room");
        super.getInfoRoom();
//        System.out.println("Room Number : " + noKamar);
//        System.out.println("Type Room : " + tipeKamar);
//        System.out.println("Room Price per night: " + harga);
        System.out.println("Extra Bed: " + extraBed);
        System.out.println("Total Price : " + calcTotalPrice(nights));

    }

    @Override
    public void pesanKamar() {
        System.out.println("Room Succesfully Booked");
    }

    ;
    
    
    @Override
    public void batalkanPesananKamar() {
        System.out.println("room order has been successfully canceled");

    }
}
