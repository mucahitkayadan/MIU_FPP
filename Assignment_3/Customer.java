class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}

class Customer {
    private String firstName;
    private String lastName;
    private String socSecurityNum;
    private Address billingAddress;
    private Address shippingAddress;

    public Customer(String firstName, String lastName, String socSecurityNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNum = socSecurityNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocSecurityNum() {
        return socSecurityNum;
    }

    public void setSocSecurityNum(String socSecurityNum) {
        this.socSecurityNum = socSecurityNum;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @Override
    public String toString() {
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("1000 North 4th Street", "Fairfield", "IA", "525577");
        Address address2 = new Address("Golden Dome", "New York", "NY", "10000");
        Address address3 = new Address("Peace Palace", "Los Angeles", "CA", "10000");

        Customer customer1 = new Customer("Muja", "Kayadan", "111-11-1111");
        Customer customer2 = new Customer("Burmaa", "Enkhbat", "222-22-2222");
        Customer customer3 = new Customer("Ken", "Daley", "333-33-3333");

        customer1.setBillingAddress(address1);
        customer1.setShippingAddress(address2);

        customer2.setBillingAddress(address2);
        customer2.setShippingAddress(address3);

        customer3.setBillingAddress(address3);
        customer3.setShippingAddress(address1);

        Customer[] customers = { customer1, customer2, customer3 };

        for (Customer customer : customers) {
            if (customer.getBillingAddress().getCity().equals("Chicago")) {
                System.out.println(customer);
            }
        }
    }
}
