import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    private final ArrayList<AddressBookEntry> entries;
    private final Scanner scanner;

    public AddressBook() {
        entries = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
//add all information
    public void addEntry() {
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Phone: ");
        String phone = scanner.nextLine();
        System.out.println("Enter Address: ");
        String address = scanner.nextLine();
        entries.add(new AddressBookEntry(name, phone, address));
        System.out.printf("Entry added: %s\n", name);
    }
//Update information
    public void updateEntry() {
        System.out.println("Enter the Name for update entry: ");
        String name = scanner.nextLine();
        AddressBookEntry entry = findEntryName(name);
        if (entry != null) {
            System.out.println("Enter New Name: ");
            String newName = scanner.nextLine();
            System.out.println("Enter New Phone: ");
            String newPhone = scanner.nextLine();
            System.out.println("Enter New Address: ");
            String newAddress = scanner.nextLine();
            entry.update(newName, newPhone, newAddress);
            System.out.printf("Entry updated: %s\n", name);
        } else {
            System.out.printf("Entry does not exist: %s\n", name);
        }

    }
//delete Information
    public void deleteEntry() {
        System.out.println("Enter Name for delete entry: ");
        String name = scanner.nextLine();
        AddressBookEntry entry = findEntryName(name);
        if (entry != null) {
            entries.remove(entry);
            System.out.printf("Entry deleted: %s\n", name);
        } else {
            System.out.printf("Entry does not exist: %s\n", name);
        }

    }
//display Entry
    public void displayEntries() {
        if (entries.isEmpty()) {
            System.out.println("Address book is empty.");
        } else {
            for (AddressBookEntry entry : entries) {
                System.out.println(entry);
            }
        }
    }

    private AddressBookEntry findEntryName(String name) {
        for (AddressBookEntry entry : entries) {
            if (entry.name.equalsIgnoreCase(name)) {
                return entry;
            }
        }
        return null;
    }
}
