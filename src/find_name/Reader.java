package find_name;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
    Scanner scanner;

    public Reader(Scanner scanner) {
        this.scanner = scanner;
    }

    private Path findFile() {
        System.out.println("Find a file:");
        String input = scanner.nextLine();
        return Paths.get(input);
    }

    public List<String> storeNames() {
        Path file = findFile();
        List<String> names = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                names.add(scanner.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return names;
    }
}