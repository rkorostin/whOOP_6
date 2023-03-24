import java.io.FileNotFoundException;
import java.util.ArrayList;

import Files.Base.FileManager;
import Files.Managers.CsvContactsFileManager;
import Models.PhoneBook;
import Presenters.PhoneBookPresenter;
import Views.ConsoleView;

public class Main {

    public static void main(String[] args) {

        PhoneBook phoneBook = null;
        ConsoleView consoleView = new ConsoleView(phoneBook);
        FileManager manager = new CsvContactsFileManager("contacts.csv");
        try {
            if (manager.hasFile())
                phoneBook = new PhoneBook(new ArrayList<>(manager.readContacts()));
            else
                phoneBook = new PhoneBook();
            PhoneBookPresenter presenter = new PhoneBookPresenter(consoleView, phoneBook, manager);
            presenter.buttonClick();
        } catch (FileNotFoundException ex) {
            consoleView.printErrorMassage(ex.getMessage());
        }
    }

}