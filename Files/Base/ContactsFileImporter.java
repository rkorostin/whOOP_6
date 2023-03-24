package Files.Base;

import Models.Contact;
import java.io.FileNotFoundException;
import java.util.Collection;

public interface ContactsFileImporter {
    Collection<Contact> imporContacts(String fileName) throws FileNotFoundException;
}
