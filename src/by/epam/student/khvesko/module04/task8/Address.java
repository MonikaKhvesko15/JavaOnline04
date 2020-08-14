package by.epam.student.khvesko.module04.task8;

public class Address {
    private String country;
    private String city;

    public Address(String country,String city){
        this.country=country;
       this.city=city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void show(){
        System.out.println("Address: "+this.country+", "+this.city);
    }
}
