package Files.Importers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import Files.Base.ContactsFileImporter;
import Models.Contact;

public class CsvFileImporter implements ContactsFileImporter {

    @Override
    public Collection<Contact> importContacts(String fileName) throws FileNotFoundException {
        List<Contact> contacts = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(fileName))) {
            scanner.nextLine();

            while (scanner.hasNextLine()) {
                String[] fields = scanner.nextLine().split(",");
                Contact contact = new Contact(fields[0], fields[1], fields[2], fields[3]);
                contacts.add(contact);
            }
        } catch (FileNotFoundException e) {
            throw e;
        }

        return contacts;
    }

}
