package com.FlightReservation;

public class Flight {

    private String flightNumber;
    private String airline;
    public static int cap;
    public  static int bookedSeats;
    public static int bcnt;
    public static int avail;




    public Flight(String fn,String al)
    {
        this.flightNumber=fn;
        this.airline=al;
    }

    public String getFlightDetails()
    {
        return "Flight Number:"+flightNumber+" Airline:"+airline+" Capacity: "+cap+" Booked Seats:"+bookedSeats+" Available Seats:"
                +avail;
    }

    public String getFlightNumber()
    {
        return this.flightNumber;
    }

    public String getAirline()
    {
        return this.airline;
    }

    public boolean checkAvailability()
    {
        if((cap-bookedSeats)>0){
            return true;
        }
        else {
            return false;
        }
    }

    public static int getCap()
    {
        return cap;
    }

    public static int getBcnt()
    {
        return bcnt;
    }

    public static int getAvail() {
        return avail;
    }

    public static int getBookedSeats(){
        return bookedSeats;
    }



    static{
        cap=50;
        bcnt=0;
        avail=50;
        bookedSeats=0;
    }

    void incrementBookingCounter()
    {
        bookedSeats=++bcnt;
        avail=cap-bookedSeats;

    }

}