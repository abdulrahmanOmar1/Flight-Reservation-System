package application;

public class Flight  {

	
    protected int flightNumber;
    protected String airlineName;
    protected String source;
    protected String destination; 
    protected int Capacity;
    protected int gage;
    Flight nextFlight;
    Passenger nextPassenger;


    public Flight(int flightNumber, String airlineName, String source, String destination, int Capacity) {

        this.flightNumber = flightNumber;
        this.airlineName = airlineName;
        this.source = source;
        this.destination = destination;
        this.Capacity = Capacity;
        gage = 0;
        nextFlight = null;
        nextPassenger=null;
    }

    
    
    public int getGage() {
		return gage;
	}



	public void setGage(int gage) {
		this.gage = this.gage + gage;
	}



	public Passenger getNextColumn() {
		return nextPassenger;
	}


	public void setNextColumn(Passenger nextPassenger) {
		this.nextPassenger = nextPassenger;
	}


	public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }


	@Override
	public String toString() {
		return flightNumber +","+airlineName +","+source+","+destination+","+Capacity;

	}


	

  
}