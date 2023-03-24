package Files.Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.List;

import Models.Contact;

public abstract class FileManager {
    private ContactsFileExporter exporter;
    private ContactsFileImporter importer;
    private String fileName;
    private File file;

    public FileManager(ContactsFileExporter exporter, ContactsFileImporter importer, String fileName) {
        this.exporter = exporter;
        this.importer = importer;
        this.fileName = fileName;
        file = new File(fileName);
    }

    public boolean hasFile() {
        return file.exists();
    }

    public void saveContacts(List<Contact> contact) throws FileNotFoundException {
        exporter.exportContacts(contact, fileName);
    }

    public Collection<Contact> readContacts() throws FileNotFoundException {
        return importer.importContacts(fileName);
    }
}
