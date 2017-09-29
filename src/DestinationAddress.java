public class DestinationAddress extends Address {
    private String specialInstructions;
    public DestinationAddress(String streetName, Integer buildingNumber, Boolean business, String specialInstructions){
        super(streetName, buildingNumber, business);
        this.specialInstructions=specialInstructions;
    }
}
