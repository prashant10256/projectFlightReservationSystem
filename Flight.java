public class Flight {
    String flightNumber;
    String airlineName;
    int flightCapacity;
    int numberOfSeatsAvailable;
    int numberOfSeatsBooked;
    String sourceCity;
    String destinationCity;

    public Flight(String flightNumber, String airlineName, int flightCapacity, String sourceCity, String destinationCity) {
        this.flightNumber = flightNumber;
        this.airlineName = airlineName;
        this.sourceCity = sourceCity;
        this.destinationCity = destinationCity;
        this.flightCapacity = flightCapacity;
    }


    public int seatAvailable(){
        numberOfSeatsAvailable = flightCapacity - numberOfSeatsBooked;
        return numberOfSeatsAvailable;
    }
}
//--------------------------------------------------------------------------------
abstract class Passenger<Static> extends RegularTicket{
    String name1, seatNumber1;
    int age1;

    public void getFlightDetails(){

    }

    public Passenger(String name1, String seatNumber1, int age1) {
        this.name1 = name1;
        this.seatNumber1 = seatNumber1;
        this.age1 = age1;
    }

}