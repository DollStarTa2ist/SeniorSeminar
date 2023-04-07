//Jonny Osman, Senior Seminar

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  //Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<Students> student = new ArrayList<Students>();
    ArrayList<Sessions> session = new ArrayList<Sessions>();
try {
      File myObj = new File("SeniorSeminar.csv");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
         //System.out.println(data);
        String[] arr = data.split(",");
        student.add(new Students(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), Integer.parseInt(arr[5])));
        
        
         
        }
      myReader.close();
      } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

  try {
      File myObj = new File("SessionNameIdPresenter.csv");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
         //System.out.println(data);
        String[] arr = data.split(",");
        session.add(new Sessions(arr[0], arr[2], Integer.parseInt(arr[1])));
        
         
        }
      myReader.close();
      } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    for (int i = 0; i<1; i++){
      System.out.println(student);
} 
      for (int i = 0; i<1; i++){
      System.out.println(session);
} 
}
}