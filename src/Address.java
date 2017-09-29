public class Address {
    private String streetName;
    private Integer buildingNumber;
    private Boolean business;
    public Address(String streetName, Integer buildingNumber, Boolean business) {
        this.streetName =  streetName;
        this.buildingNumber = buildingNumber;
        this.business = business;
    }
}
