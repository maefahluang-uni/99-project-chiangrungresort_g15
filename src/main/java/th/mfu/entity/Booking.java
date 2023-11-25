package th.mfu.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "check_in", nullable = false)
    private Date Checkin ;

     @Column(name = "check_out", nullable = false)
    private Date Checkout;

    @Column(name = "number_of_guests", nullable = false)
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

    public void setId(Long id2) {
    }

    public Object getCheckIn() {
        return null;
    }

    public void setCheckIn(Object checkIn2) {
    }

    public Object getCheckOut() {
        return null;
    }

    public void setCheckOut(Object checkOut2) {
    }

    public Object getNumberOfGuests() {
        return null;
    }

    public void setNumberOfGuests(Object numberOfGuests) {
    }
 
    

}
