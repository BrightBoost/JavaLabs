package Fundamentals.mod06;

public class CopyingArrays {
    public static void main(String[] args) {
      String[] colors = { "red", "white", "blue" };
      String[] colorCopy = new String[3];
      // copy from colors at subscript 0 to
      // colorCopy at 0 -- move 3 elements
      System.arraycopy(colors, 0, colorCopy, 0, 3);
      for (int i = 0; i < 3; i++) {
        System.out.println(colorCopy[i]);
      }
      
    }
  
}
