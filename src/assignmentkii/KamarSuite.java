/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentkii;

/**
 *
 * @author crova
 */
public class KamarSuite extends Kamar implements Reservasi {

    private boolean hasBalcony = false;

    public KamarSuite(int noKamar, String tipeKamar, int harga, int nights, boolean hasBalcony) {
        super(noKamar, tipeKamar, harga, nights);
        this.hasBalcony = hasBalcony;
    }

    @Override
    protected double calcTotalPrice(int nights) {
        return (harga * nights) + 20;
    }

    @Override
    public void getInfoRoom() {
        System.out.println("Suite Room");
        super.getInfoRoom();
//        System.out.println("Room Number : " + noKamar);
//        System.out.println("Type Room : " + tipeKamar);
//        System.out.println("Room Price per night: " + harga);
        if (hasBalcony) {
            System.out.println("This room has a Balcony");
        } else {
            System.out.println("This room hasn't a Balcony");
        }
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
