package Fundamentals.mod06;

import java.util.Arrays;

public class SortingArrays {
  public static void main(String[] args) {
    String[] nameList = {
        "Natalie", "Brittany", "Zachary", "Ezra", "Ian",
        "Siddalee", "Elisha", "Pursalane", "Zephaniah"
    };
    Arrays.sort(nameList);
    for (String name : nameList) {
      System.out.println(name);
    }
  }
}