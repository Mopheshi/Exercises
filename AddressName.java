package exercises;

/**
 *
 * @author MOPHE
 */
public class AddressName {

    private int houseNumber;
    private String streetName;
    private String town;
    private String state;
    private int postCode;

    public AddressName() {
    }

    public AddressName(int houseNumber, String streetName, String town, String state, int postCode) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.town = town;
        this.state = state;
        this.postCode = postCode;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "No. " + houseNumber + ", " + streetName + " st.,\n" + town + ", " + state + ",\n" + postCode;
    }

    public static void main(String[] args) {
        AddressName addressName1 = new AddressName(25, "Zaranda", "Jimeta-Yola", "Adamawa", 640101);
        String address1 = addressName1.toString();
        System.out.println(address1);

        System.out.println("\nAlternative addressing format is:\n");

        AddressName addressName2 = new AddressName();
        addressName2.setHouseNumber(18);
        addressName2.setStreetName("Bauchi");
        addressName2.setTown("Jimeta-Yola");
        addressName2.setState("Adamawa");
        addressName2.setPostCode(640102);
        System.out.println(addressName2);
    }
}
