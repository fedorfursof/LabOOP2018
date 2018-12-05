import java.io.FileReader;
import java.io.IOException;

public class Demonstrate {
    public static void main(String[] arg) {

        try (FileReader reader = new FileReader("Test.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}



                                                        Text.txt
                                                        
test this lab
