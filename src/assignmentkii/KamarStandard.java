/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentkii;

/**
 *
 * @author crova
 */
public class KamarStandard extends Kamar implements Reservasi {

    private boolean hasWorkDesk = false;

    public KamarStandard(int noKamar, String tipeKamar, int harga, int nights, boolean hasWorkDesk) {
        super(noKamar, tipeKamar, harga, nights);
        this.hasWorkDesk = hasWorkDesk;
    }

    @Override
    protected double calcTotalPrice(int nights) {
        return (harga * nights) + 5;
    }

    @Override
    public void getInfoRoom() {
        System.out.println("Standard Room");
        super.getInfoRoom();
//        System.out.println("Room Number : " + noKamar);
//        System.out.println("Type Room : " + tipeKamar);
//        System.out.println("Room Price per night: " + harga);
        if (hasWorkDesk) {
            System.out.println("This room has a Work Desk");
        } else {
            System.out.println("This room hasn't a Work Desk");
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
;

}
