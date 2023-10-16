class Program2 extends ConsoleProgram {

  /**
  * Description: Converts Km to Miles from 10km to 100km in incraments of 10km.
  * @author: Joshua
  */
  
  public void run() {

    double dblMiles;
    
    for (int intKm = 10; intKm <= 100; intKm += 10){
      dblMiles = intKm * 0.621371;
      System.out.println(intKm + "km --> " + dblMiles + " mi");
    }
  }
}
