package find_name;

import java.util.List;
import java.util.Scanner;

public class Manager {

    private final List<String> names;
    Scanner scanner;

    public Manager(List<String> names, Scanner scanner) {
        this.names = names;
        this.scanner = scanner;
    }

    public void searchName() {
        System.out.println("Find a name:");
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            if (matchName(input)) {
                System.out.println("Name is found");
            } else {
                System.out.println("Name is not found");
            }
        }
    }

    private boolean matchName(String input) {
        for (String entry : names) {
            if (input.equalsIgnoreCase(entry)) {
                return true;
            }
        }
        return false;
    }
}

