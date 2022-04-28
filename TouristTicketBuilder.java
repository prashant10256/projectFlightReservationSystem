public class TouristTicketBuilder {
    private String hotelAddress;
    private String touristLocation1;
    private String touristLocation2;
    private String touristLocation3;
    private String touristLocation4;
    private String touristLocation5;

    public TouristTicketBuilder setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
        return this;
    }

    public TouristTicketBuilder setTouristLocation1(String touristLocation1) {
        this.touristLocation1 = touristLocation1;
        return this;
    }

    public TouristTicketBuilder setTouristLocation2(String touristLocation2) {
        this.touristLocation2 = touristLocation2;
        return this;
    }

    public TouristTicketBuilder setTouristLocation3(String touristLocation3) {
        this.touristLocation3 = touristLocation3;
        return this;
    }

    public TouristTicketBuilder setTouristLocation4(String touristLocation4) {
        this.touristLocation4 = touristLocation4;
        return this;
    }

    public TouristTicketBuilder setTouristLocation5(String touristLocation5) {
        this.touristLocation5 = touristLocation5;
        return this;
    }

    public TouristTicket createTouristTicket() {
        return new TouristTicket(hotelAddress, touristLocation1, touristLocation2, touristLocation3, touristLocation4, touristLocation5);
    }
}
