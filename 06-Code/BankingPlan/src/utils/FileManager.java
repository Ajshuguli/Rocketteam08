<<<<<<< HEAD

=======
>>>>>>> 0bcd76e72023c10631c76cff390a288b84955733
package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
<<<<<<< HEAD
=======
import java.util.ArrayList;
>>>>>>> 0bcd76e72023c10631c76cff390a288b84955733
import java.util.Scanner;

/**
 *
<<<<<<< HEAD
 * @author Camila
 */
public class FileManager {
    public static String read(String fileName) {
        String recoveredData = "";
=======
 * @author Sebas
 */
public class FileManager {

    public static String read(String fileName) {
        String recoveredData = "";

>>>>>>> 0bcd76e72023c10631c76cff390a288b84955733
        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                recoveredData = recoveredData + reader.nextLine() + "\n";
            }
            reader.close();
<<<<<<< HEAD
        } catch (FileNotFoundException ex) {
            System.out.println("An error occuured while opening " + fileName
                    + "\n File not found. \n Please make sure that your "
                    + "file is in the project folder"
                    + "Please contact the progam manager and provide the log of the system");

            ex.printStackTrace();
=======
        } catch (Exception ex) {
            System.out.println("An error ocurred while opening" + fileName
                    + "\n File not found. "
                    + "\n Please make sure that your file is in the project folder");
            ex.printStackTrace(); //it most be saved in a -->log<--
>>>>>>> 0bcd76e72023c10631c76cff390a288b84955733
        }

        return recoveredData;
    }
<<<<<<< HEAD

    public static boolean save(String fileName, String data) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.write(data + "\n");
            fileWriter.close();
            return true;
        } catch (IOException ex) {
            System.out.println("An error occurred " + fileName + "could not be updated");
            ex.printStackTrace();
            return false;
        }
    }
    
=======
>>>>>>> 0bcd76e72023c10631c76cff390a288b84955733
}
