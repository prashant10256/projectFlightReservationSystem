public class Source {
    public static <setAddressDetails> void main(String[] args) {
        Flight f1 = new Flight("6E456", "AirIndia", 180, "Pune", "Delhi");
        System.out.println(f1.toString());
        System.out.println(f1.seatAvailable());

        Ticket t1 = new Ticket("648795232001", "Nagpur","Delhi", "12/12/2021", "15:45", "12/12/2021", "17:25",2799.83, "01 hr:40 min");
        System.out.println(Ticket.isConfirmed());
        System.out.println(t1.toString());

        RegularTicket t1R = new RegularTicket(){
            @Override
            public boolean isSplService() {
                return super.isSplService();
            }

            @Override
            public void setSplService(boolean splService) {
                super.setSplService(splService);
            }
        };
        TouristTicket s = new TouristTicket("Sarojini Nagar, Mahatma Bridge, Pune", "Bund Garden", "Saras Baug", "DagduSheth Ganpati Temple", "Lonavala","Mahabaleshwar") {
            @Override
            public String toString() {
                return super.toString();
            }
        };

        Passenger p1 = new Passenger("Ashish Sharma", "B12", 26) {
            @Override
            public void getFlightDetails() {
                super.getFlightDetails();
            }
        };

        Address a1 = new Address(){
            public void getAddressDetails(){
                System.out.println();
            }
            public void setAddressDetails(){

            }
        };

        Contact c1 = new Contact(){
            public void getContactDetails(){
                System.out.println();
            }
            public void setContactDetails(){

            }
        };
    }
}
