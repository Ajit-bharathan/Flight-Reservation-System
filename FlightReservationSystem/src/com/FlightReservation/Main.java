package com.FlightReservation;


public class Main {
    public static void main(String[] args) {

        System.out.println("\n\nFLIGHT RESERVATION SYSTEM");
        System.out.println("\nFlight Details:-");


        System.out.println("=======================================================================================================");

        Flight f = new Flight("AI1234\n","AIR INDIA\n");
        System.out.println("\n---------------------------------------------------------------------------------------");
        System.out.println(f.getFlightDetails());
        System.out.println("________________________________________________________________________________________");

        System.out.println("Regular Ticket:-");
        RegularTicket regular = new RegularTicket("sector 34-A", "MUMBAI", "MAHARASHTRA", "Arpita", 1234567890,
                "Am@gmail.com", "AI1234", "AIR INDIA", "MUM", "HYD", "11/09/21", "2000", "2230", "6589658",
                "C18", 2569, "Vodka and dahi vada");
        System.out.println("      ");
        System.out.println(regular.getTicketDetails());
        System.out.println(regular.getDuration());
        System.out.println(regular.getSpecialServices());
        System.out.println(regular.checkedStatus());
        System.out.println("       ");
        System.out.println("Welcome to Air India");

        System.out.println("\n\n\n");

        System.out.println("Tourist Ticket:-\n");
        TouristTicket abc = new TouristTicket("sector 34-A", "MUMBAI", "MAHARASHTRA", "Arpita", 1234567890,
                "Am@gmail.com", "AI1234", "AIR INDIA", "MUM", "HYD", "11/09/21", "2000", "2230", "6589658",
                "C18", 2569, "IBIS");

        System.out.println("          ");
        System.out.println(abc.getTicketDetails());
        System.out.println(abc.getDuration());
        System.out.println();
        abc.getTouristLocation();
        System.out.println();
        System.out.println(abc.checkedStatus());
        System.out.println("           ");
        System.out.println("Thankyou\n");
        System.out.println(f.getFlightDetails());

        System.out.println("\n\nCancel Ticket");
        abc.cancel();
        System.out.println("\n\n"+abc.getTicketDetails());
        System.out.println(abc.checkedStatus());
        System.out.println("\n\n"+f.getFlightDetails());

    }
}
