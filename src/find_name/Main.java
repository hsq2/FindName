package find_name;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().start();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        Reader reader = new Reader(scanner);
        List<String> names = reader.storeNames();

        Manager manager = new Manager(names, scanner);
        manager.searchName();
    }
}
