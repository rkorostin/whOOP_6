package Models;

public class Contact {

    private String idContact;
    private String firstName;
    private String lastName;
    private String phone;

    public Contact(String idContact, String firstName, String lastName, String phone) {
        this.idContact = idContact;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdContact() {
        return idContact;
    }

    public void setIdContact(String idContact) {
        this.idContact = idContact;
    }

    @Override
    public String toString() {
        return idContact + "_Контакт{" +
                "Имя='" + firstName + '\'' +
                ", Фамилия='" + lastName + '\'' +
                ", Телефон='" + phone + '\'' +
                '}';
    }
}