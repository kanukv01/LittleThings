public class Address {
    String city;
    String State;
public String getCity() {
    return city;
}
public void setCity(String city) {
    this.city = city;
}
public String getState() {
    return State;
}
public Address(String city, String state) {
    this.city = city;
    this.State = state;
}
public void setState(String state) {
    State = state;
}
}
