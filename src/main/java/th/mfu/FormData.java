package th.mfu;

public class FormData {
    private String fname;
    private String lname;
    private String email;
    private String phone;
    private String checkin;
    private String checkout;

    // Constructors (you may not need them if you are using default constructor)

    public FormData() {
    }

    public FormData(String fname, String lname, String email, String phone, String checkin, String checkout) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    // Getters and Setters

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
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

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    // You may override toString() for easy debugging

    @Override
    public String toString() {
        return "FormData{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", checkin='" + checkin + '\'' +
                ", checkout='" + checkout + '\'' +
                '}';
    }
}
