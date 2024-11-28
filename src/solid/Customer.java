package solid;

// Customer Class: = Manages customer information
class Customer {
    private String name;
    private String email;
    private String address;

    // Constructor
    public Customer(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    // Getter for customer contact information
    public String getContactInfo() {
        return "Name: " + name + ", Email: " + email + ", Address: " + address;
    }
}

