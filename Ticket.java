public class Ticket {
    String pnr;
    String sourceStation;
    String destinationStation;
    String departureDate;
    String departureTime;
    String arrivalDate;
    String arrivalTime;
    double fare;
    static boolean status;
    String durationOfJourney;


    public Ticket(String pnr, String sourceStation, String destinationStation, String departureDate, String departureTime, String arrivalDate, String arrivalTime, double fare, String durationOfJourney) {
        this.pnr = pnr;
        this.sourceStation = sourceStation;
        this.destinationStation = destinationStation;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.fare = fare;
        this.durationOfJourney = durationOfJourney;
    }

    public static boolean isConfirmed(){
        return status = true;

    }
}
