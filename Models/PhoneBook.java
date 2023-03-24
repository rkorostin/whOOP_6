package Models;
import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contacts;

    public PhoneBook(List<Contact> contacts) {
        this.contacts = new ArrayList<>();
        for (Contact contact : contacts) {
            this.contacts.add(contact);
        }
    }

    public PhoneBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public boolean removeContact(String idContact) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getIdContact().equals(idContact)) {
                contacts.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean updateContact(String idContact, String newFirstName, String newLastName, String newPhone) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getIdContact().equals(idContact)) {
                Contact contact = contacts.get(i);
                contact.setFirstName(newFirstName);
                contact.setLastName(newLastName);
                contact.setPhone(newPhone);
                return true;
            }
        }
        return false;
    }

    public void searchByName(String name) {
        List<Contact> result = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(name)) {
                result.add(contact);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Контакт не найден");
        } else {
            for (Contact contName : result) {
                System.out.println(contName);
            }
        }
    }

    public void searchByPhone(String phone) {
        List<Contact> result = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getPhone().equals(phone)) {
                result.add(contact);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Контакт не найден");
        } else {
            for (Contact contPhone : result) {
                System.out.println(contPhone);
            }
        }
    }

}