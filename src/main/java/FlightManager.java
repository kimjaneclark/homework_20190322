public class FlightManager {

    private Flight flight;


    public FlightManager(Flight flight){
        this.flight = flight;
    }


//    Assumptions:
//
//    Each passenger bag weighs the same
//    Planes reserve half of their total weight for passenger bags
//    The weight of bag per person is the weight reserved for passenger bags divided by the capacity
//    Passengers exist for a single flight only

//    Create a FlightManager class which has methods to:
//
//    calculate how much baggage weight should be reserved for each passenger for a flight

    public int getFlightBaggageWeight(Plane plane){
        return plane.getWeight() / 2;
    }

    public int getBaggageWeightPerPassenger(Plane plane){
        int totalBaggageWeight = getFlightBaggageWeight(plane);
        return totalBaggageWeight / plane.getCapacity();
    }


//    calculate how much baggage weight is booked by passengers of a flight
    public int getBookedWeight(Flight flight, Plane plane){
        return getBaggageWeightPerPassenger(plane) * flight.countPassengers();
    }


//    calculate how much overall weight reserved for baggage remains for a flight
    public int getRemainingBaggageWeight(Plane plane, Flight flight) {
        return getFlightBaggageWeight(plane) - getBookedWeight(flight, plane);

    }

}
