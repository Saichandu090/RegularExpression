package usercases;

public class Person
{
    private String firstName;
    private String lastName;
    private String email;
    private long mobileNumber;
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person [" +
                "FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", Email='" + email + '\'' +
                ", MobileNumber=" + mobileNumber +
                ", Password='" + password + '\'' +
                ']';
    }
}
