public class Record {
    private int index;
    private String customer;
    private String name;
    private String surname;
    private String company;
    private String city;
    private String country;
    private String phone1;
    private String phone2;
    private String email;
    private String data;
    private String website;

    public Record(int index, String customer, String name, String surname, String company, String city, String country, String phone1, String phone2, String email, String data, String website) {
        this.index = index;
        this.customer = customer;
        this.name = name;
        this.surname = surname;
        this.company = company;
        this.city = city;
        this.country = country;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.email = email;
        this.data = data;
        this.website = website;
    }
    
}