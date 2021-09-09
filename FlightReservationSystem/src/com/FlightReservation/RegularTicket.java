package com.FlightReservation;


public class RegularTicket extends Ticket {
    public String specialServices;

    public RegularTicket(String adstreet, String adcity, String adstate, String cname, int cphone, String cemail, String fn, String an,
                         String t, String f, String d, String dep, String arr, String pnr, String st, float p, String sps) {
        super(adstreet, adcity, adstate, cname, cphone, cemail, fn, an, t, f, d, dep, arr, pnr, st, p);
        this.specialServices = sps;

    }

    public String getTDetails() {
        return "PNR:" + this.pnr + " To:" + this.to + " From:" + this.from + " SeatNo: " + this.seatNo + " Date:" + this.date + " Depature Time: " + this.departure +
                " Arrival Time:" + arrival + " Price:" + this.price;
    }

    public String getTicketDetails() {
        return " " + psg.getId() + "\n" + psg.getContactDetails() + "\n" + psg.getAddressDetails() + "\n" + flight.getFlightNumber() + "\n" + flight.getAirline() +
                "\n" + this.getTDetails() + "\n";
    }

    public String getDuration() {
        int i = Integer.parseInt(departure);
        int j = Integer.parseInt(arrival);
        int k;
        float l = 0.0f;
        if (j > i) {
            k = j - i;
            l = (float) k / 100.0f;
        } else if (j < i) {
            k = i - j;
            l = (float) k / 100.0f;
            l = l + 24.0f;
        }
        return "Duration: " + l + "hrs";
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
        Flight.bcnt = Flight.bcnt--;
        flight.bookedSeats = Flight.bcnt;
    }

    public String getSpecialServices() {
        return "Special Services:" + specialServices;
    }

    public void updateSpecialServices(int i) {
        switch (i) {
            case 1:
                specialServices = "Snacks";
                break;
            case 2:
                specialServices = "food";
                break;
            case 3:
                specialServices = "Water";
                break;
            default:
                specialServices = "Happy Flying..";
                break;
        }

    }
}