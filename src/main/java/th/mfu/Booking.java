package th.mfu;

import java.util.Date;

public class Booking {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Date Checkin ;
    private Date Checkout;
    private int guests;

    public Booking(String firstName,String lastName,String email,String phone,Date Checkin,Date Checkout,int guests) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.Checkin = Checkin;
        this.Checkout =Checkout;
        this.guests =guests;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCheckin() {
        return Checkin;
    }

    public void setCheckin(Date checkin) {
        Checkin = checkin;
    }

    public Date getCheckout() {
        return Checkout;
    }

    public void setCheckout(Date checkout) {
        Checkout = checkout;
    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        this.guests = guests;
    }
 
    

}
