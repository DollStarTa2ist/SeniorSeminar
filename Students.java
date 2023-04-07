public class Students {
  private String lastName = "";
  private int choice1; 
  private int choice2; 
  private int choice3;
  private int choice4;
  private int choice5; 
  public Students(String ln, int c1, int c2, int c3, int c4, int c5) {
    this.lastName = ln;
    this.choice1 = c1;
    this.choice2 = c2;
    this.choice3 = c3;
    this.choice4 = c4;
    this.choice5 = c5;
  }
  public int getC1(){
   return choice1;
 }
  public int getC2(){
   return choice2;
 }
  public int getC3(){
   return choice3;
 }
  public int getC4(){
   return choice4;
 }
  public int getC5(){
   return choice5;
 }

    public String toString() {
      return("\n" + lastName +" chose sessions "+ choice1 +", " + choice2 +", " + choice3 +", "+ choice4 +", "+ choice5);
    } 
  

  
}