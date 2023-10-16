class Program1 extends ConsoleProgram {

  /**
  * Description: 
  * @author: Joshua
  */
  
  public void run() {
    
    // Initialize variables
    int intN = readInt("Enter N:"); 
    int intSum = 0; //set the accumulator variable

    // accumulate sum
    for (int i = 1; i <= intN; i++){
      // update our accumulator variable
      intSum = intSum + i;
    }

    //output result
    System.out.println(intSum);

  }
}
