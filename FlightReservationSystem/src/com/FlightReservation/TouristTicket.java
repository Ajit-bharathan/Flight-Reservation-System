package com.FlightReservation;

import java.util.Scanner;

public class TouristTicket extends Ticket {
    protected String hotelAddress;
    protected String[] touristLocation = new String[5];
    Scanner sc=new Scanner(System.in);

    public TouristTicket(String addstreet, String addcity, String addstate, String cname, int cphone, String cemail, String fn, String an,
                         String t, String f, String d,String dep, String arr, String pnr,String st, float p,String hotel)
    {
        super(addstreet,addcity,addstate,cname,cphone,cemail,fn,an,t,f,d,dep,arr,pnr,st,p);
        this.hotelAddress=hotel;
        setTouristLocation();
    }


    public String getTicDetails()
    {
        return "PNR:"+this.pnr+" To:"+this.to+" From:"+this.from+" SeatNo: "+this.seatNo+" Date:"+this.date+" Depature Time: "+this.departure+
                " Arrival Time:"+arrival+" Price:"+this.price;
    }

    public  String getTicketDetails()
    {
        return " "+p.getId()+"\n"+p.getContactDetails()+"\n"+p.getAddressDetails()+"\n"+flight.getFlightNumber()+"\n"+flight.getAirline()+
                "\n"+this.getTicDetails()+"\n";
    }

    public  String getDuration()
    {
        int i= Integer.parseInt(departure);
        int j= Integer.parseInt(arrival);
        // System.out.println(i+" "+j);
        //int k=j-i;
        int k;
        float l=0.0f;
        if(j>i)
        {
            k=j-i;
            l=(float) k/100.0f;
        }
        else if(j<i)
        {
            k=i-j;
            l=(float) k/100.0f;
            l=l+24.0f;
        }
        //float l=(float) k/100.0f;
        return "Duration: "+l+"hrs";
    }


    public  String checkedStatus()
    {
        if(cancelled== false)
        {
            return "Ticket Booked...";
        }
        else
        {
            return "Ticket Cancelled";
        }

    }


    public  void cancel()
    {
        cancelled=true;
        Flight.bcan=--Flight.bcan;
        Flight.bookedSeats=Flight.bcan;
        Flight.avail=Flight.cap-Flight.bookedSeats;
    }


    public void setHotelAddress(String hoteladd)
    {
        this.hotelAddress=hoteladd;
    }

    public String getHotelAddress()
    {
        return "Hotel:"+this.hotelAddress;
    }

    public void setTouristLocation()
    {
        System.out.println("Enter the 5 location :");
        System.out.println("\na) Tata hospital   b) lonavala   c) juhu beach  d) ibis hotel e) Tiger Hill  f) Linda's house ");
        try {
            for (int i = 0; i < 5; i++) {
                touristLocation[i] = sc.next();
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

    }

    public void getTouristLocation()
    {
        System.out.println("Tourist Spot:");
        for(String arr:touristLocation)
        {
            System.out.print ("  "+arr);
        }
    }

}



