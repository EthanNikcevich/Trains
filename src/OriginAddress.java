public class OriginAddress extends Address{
    private Boolean postOffice;
    public OriginAddress(String streetName, Integer buildingNumber, Boolean business, Boolean postOffice){
        super(streetName,buildingNumber,business);
        this.postOffice=postOffice;
    }
}
