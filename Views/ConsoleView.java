package Views;

import java.util.Scanner;

import Models.Contact;
import Models.PhoneBook;
import Views.Base.View;

public class ConsoleView implements View {

    private PhoneBook phoneBook;
    private Scanner scanner;

    public ConsoleView(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("Выберите действие: ");
        System.out.println("1. Посмотреть контакты");
        System.out.println("2. Добавить контакт");
        System.out.println("3. Удалить контакт");
        System.out.println("4. Обновить контакт");
        System.out.println("5. Поиск по телефону");
        System.out.println("6. Поиск по имени");
        System.out.println("7. Импорт из CSV");
        System.out.println("8. Экспорт в CSV");
        System.out.println("0. Выход");
    }
    public void printErrorMassage(String message){
        System.out.println(message);
    }

    public void start() {
        boolean running = true;
        while (running) {


            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // phoneBook.displayContacts();
                    break;
                case 2:
                    System.out.println("Введите имя: ");
                    String firstName = scanner.nextLine();
                    System.out.println("Введите фамилию: ");
                    String lastName = scanner.nextLine();
                    System.out.println("Введите телефон: ");
                    String phone = scanner.nextLine();
                    System.out.println("Введите id (любое число): ");
                    String idContact = scanner.nextLine();
                    Contact contact = new Contact(idContact, firstName, lastName, phone);
                    phoneBook.addContact(contact);
                    break;
                case 3:
                    System.out.println("Введите id удаляемого контакта: ");
                    String idContactDelete = scanner.nextLine();
                    phoneBook.removeContact(idContactDelete);
                    break;
                case 4:
                    System.out.println("Введите id обновляемого контакта: ");
                    String idContactUpdate = scanner.nextLine();
                    System.out.println("Введите новое имя: ");
                    String newFirstName = scanner.nextLine();
                    System.out.println("Введите новую фамилию: ");
                    String newLastName = scanner.nextLine();
                    System.out.println("Введите новый телефон: ");
                    String newPhone = scanner.nextLine();
                    phoneBook.updateContact(idContactUpdate, newFirstName, newLastName, newPhone);
                    break;
                case 5:
                    System.out.println("Введите телефон для поиска:");
                    String searchPhone = scanner.nextLine();
                    phoneBook.searchByPhone(searchPhone);
                    break;
                case 6:
                    System.out.println("Введите имя для поиска:");
                    String searchName = scanner.nextLine();
                    phoneBook.searchByName(searchName);
                    break;
                case 7:
                    System.out.println("(Импорт данных) введите имя файла:");
                    // String fileName = scanner.nextLine();
                    // phoneBook.importFromCSV(fileName);
                    break;
                case 8:
                    System.out.println("(Экспорт данных) введите имя файла:");
                    // fileName = scanner.nextLine();
                    // phoneBook.exportToCSV(fileName);
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Неверный выбор");

            }
        }
    }
}