package Files.Exporters;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import Files.Base.ContactsFileExporter;
import Models.Contact;

public class CsvFileExporter implements ContactsFileExporter {

    @Override
    public void exportContacts(List<Contact> contacts, String fileName) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(new File(fileName))) {
            StringBuilder sb = new StringBuilder();
            sb.append("id,Имя,Фамилия,Телефон\n");

            for (Contact contact : contacts) {
                sb.append(contact.getIdContact()).append(",");
                sb.append(contact.getFirstName()).append(",");
                sb.append(contact.getLastName()).append(",");
                sb.append(contact.getPhone()).append("\n");
            }

            writer.write(sb.toString());
        } catch (FileNotFoundException e) {
            throw e;
        }
    }

}
