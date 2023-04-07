public class Sessions{
  int sessionId;
  String sessionName = "";
  String presenter = "";
  int studentsPerClass = 16;
  public Sessions(String sN, String p,int sID) {
    this.sessionName = sN;
    this.presenter = p;
    this.sessionId = sID;
  }
  public int getSID(){
    return sessionId;
  }
  public String toString() {
    return("\n" + presenter+ " is leading session "+ sessionName+". Session ID: "+sessionId);
      }
  
}