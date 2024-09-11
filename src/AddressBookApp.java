import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

    class AddressBookEntry {
                 String name;
                 String phone;
                 String address;
    public AddressBookEntry(String name, String phone, String address) {
             this.name = name;
             this.phone = phone;
             this.address = address;
    }
    public void update(String newName, String newPhone, String newAddress) {
            this.name = newName;
            this.phone = newPhone;
            this.address = newAddress;
    }
    @Override
    public String toString() {
    return "Name: " + name + ", Phone: " + phone + ", Address: " + address;

    }
}

public class AddressBookApp {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n Address Book Menu: ");
            System.out.println("1. Add New Entry");
            System.out.println("2. Delete Entry");
            System.out.println("3. Update Entry");
            System.out.println("4. Print All Entries");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addressBook.addEntry();
                    break;
                case 2:
                    addressBook.deleteEntry();
                    break;
                case 3:
                    addressBook.updateEntry();
                    break;
                case 4:
                    addressBook.displayEntries();
                    break;
                case 5:
                    System.out.println("Exiting program.\n");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");

            }
        }
    }
}