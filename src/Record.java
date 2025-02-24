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
    public int getIndex() {
        return index;
    }
    public String getCustomer() {
        return customer;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getCompany() {
        return company;
    }
    public String getCity() {
        return city;
    }
    public String getCountry() {
        return country;
    }
    public String getPhone1() {
        return phone1;
    }
    public String getPhone2() {
        return phone2;
    }
    public String getEmail() {
        return email;
    }
    public String getData() {
        return data;
    }
    public String getWebsite() {
        return website;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }
    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    public String toString() {
        return "Record{" +
                "index=" + index +
                ", customer='" + customer + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", company='" + company + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", phone1='" + phone1 + '\'' +
                ", phone2='" + phone2 + '\'' +
                ", email='" + email + '\'' +
                ", data='" + data + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}