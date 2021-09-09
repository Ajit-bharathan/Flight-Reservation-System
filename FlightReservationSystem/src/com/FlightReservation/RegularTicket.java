package com.FlightReservation;


public class RegularTicket extends Ticket {
    public String specialServices;

    public RegularTicket(String addstreet, String addcity, String addstate, String cname, int cphone, String cemail, String fn, String an,
                         String t, String f, String d, String dep, String arr, String pnr, String st, float p, String sps) {
        super(addstreet, addcity, addstate, cname, cphone, cemail, fn, an, t, f, d, dep, arr, pnr, st, p);
        this.specialServices = sps;

    }

    public String getTicDetails() {
        return "PNR:" + this.pnr + " To:" + this.to + " From:" + this.from + " SeatNo: " + this.seatNo + "\n Date:" + this.date + " Depature Time: " + this.departure +
                " Arrival Time:" + arrival + " Price:" + this.price;
    }

    public String getTicketDetails() {
        return " " + p.getId() + "\n" + p.getContactDetails() + "\n" + p.getAddressDetails() + "\n" + flight.getFlightNumber() + "\n" + flight.getAirline() +
                "\n" + this.getTicDetails() + "\n";
    }

    public String getDuration() {
        int m = Integer.parseInt(departure);
        int n = Integer.parseInt(arrival);
        int b;
        float t = 0.0f;
        if (n > m) {
            b = n - m;
            t = (float) b / 100.0f;
        } else if (n < m) {
            b = m - n;
            t = (float) b / 100.0f;
            t = t + 24.0f;
        }
        return "Duration: " + t + " hours";
    }

    public String checkedStatus() {
        if (cancelled == false) {
            return "Ticket Booked...";
        } else {
            return "Ticket Cancelled";
        }

    }

    public void cancel() {
        cancelled = true;
        Flight.bcan = Flight.bcan--;
        flight.bookedSeats = Flight.bcan;
    }

    public String getSpecialServices() {
        return "Special Services:" + specialServices;
    }

    public void updateSpecialServices(int i) {
        switch (i) {
            case 1:
                specialServices = "Vodka and dahi vada";
                break;
            case 2:
                specialServices = "Coffee";
                break;
            case 3:
                specialServices = "Meals";
                break;
            default:
                specialServices = "Choose your service";
                break;
        }

    }
}