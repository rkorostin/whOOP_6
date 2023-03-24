package Files.Base;

import java.io.FileNotFoundException;
import java.util.List;
import Models.Contact;

public interface ContactsFileExporter {
    void exportContacts(List<Contact> contacts, String fileName) throws FileNotFoundException;
}
