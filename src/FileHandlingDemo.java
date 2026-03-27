import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) {

        try {
            // 1. Create File
            File file = new File("example.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // 2. Write to File
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is file handling in Java.\n");
            writer.write("This is the second line.\n");
            writer.close();
            System.out.println("Data written to file.");

            // 3. Append Data to File
            FileWriter appendWriter = new FileWriter("example.txt", true);
            appendWriter.write("This line is appended.\n");
            appendWriter.close();
            System.out.println("Data appended to file.");

            // 4. Read File
            FileReader reader = new FileReader("example.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            System.out.println("\nReading file content:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}