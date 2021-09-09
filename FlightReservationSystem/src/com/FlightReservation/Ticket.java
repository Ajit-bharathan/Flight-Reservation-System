package com.FlightReservation;

public abstract class Ticket {

    protected String pnr;
    protected String from;
    protected String to;
    Flight flight;
    String date;
    String departure;
    String arrival;
    String seatNo;
    float price;
    boolean cancelled = false;
    Passenger psg;

    public Ticket(String adstreet, String adcity, String adstate, String cname, int cphone, String cemail, String fn, String an,
                  String t, String f, String d, String dep, String arr, String pnr, String st, float p)
    {
        this.psg = new Passenger(adstreet, adcity, adstate, cname, cphone, cemail);
        this.flight = new Flight(fn, an);
        this.to = t;
        this.from = f;
        this.departure = dep;
        this.arrival = arr;
        this.date = d;
        this.seatNo = st;
        this.pnr = pnr;
        this.price = p;
        flight.incrementBookingCounter();
    }

    public abstract String getTDetails();

    public abstract String getTicketDetails();

    public abstract String getDuration();

    public abstract String checkedStatus();

    public abstract void cancel();


}




