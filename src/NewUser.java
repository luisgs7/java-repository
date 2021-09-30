public class NewUser {
    private String firstName;
    private String lastName;

    public void setFirstName(String firstName){
        this.firstName = firstName.toUpperCase();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}
