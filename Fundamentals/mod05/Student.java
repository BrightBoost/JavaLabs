package Fundamentals.mod05;

public class Student {
  private String name;
  private double gpa;


  
  // get and set the properties - getters and setters
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getGpa() {
    return this.gpa;
  }

  public void setGpa(double gpa) {
    if(gpa <= 4 && gpa >= 0) {
      this.gpa = gpa;
    }
  }


}