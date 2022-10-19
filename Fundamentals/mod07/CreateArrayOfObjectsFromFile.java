import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CreateArrayOfObjectsFromFile {
  public static ArrayList<Example> examples = new ArrayList<>();
  public static void main(String args[]) {
    try {
      // create a FileReader object connected to the File
      FileReader fileReader = new FileReader("objects.txt");
      // create a BufferedReader to manage input stream
      BufferedReader bufReader = new BufferedReader(fileReader);
      String input;
      // read until there is no more data
      while ((input = bufReader.readLine()) != null) {
        System.out.println(input);
        String[] objectElements = input.split("\\|");
        examples.add(new Example(objectElements[0], objectElements[1]));
      }

      System.out.println("length:" + examples.size());
      System.out.println(examples.get(1).getCode());
      // close the stream and release the resources
      bufReader.close();
    } catch (IOException e) {
      // display stack trace if there was an error
      e.printStackTrace();
    }
  }
}
