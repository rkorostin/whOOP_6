package Presenters;

import Files.Base.FileManager;
import Models.PhoneBook;
import Views.Base.View;

public class PhoneBookPresenter {
    private View view;
    private FileManager fileManager;
    private PhoneBook phoneBook;

    public PhoneBookPresenter(View view, PhoneBook phoneBook, FileManager fileManager) {
        this.view = view;
        this.phoneBook = phoneBook;
        this.fileManager = fileManager;
    }

    public void buttonClick() {
        view.showMenu();
    }
}
