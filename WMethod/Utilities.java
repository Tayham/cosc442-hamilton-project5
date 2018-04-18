
/*
 * 
 * This class contains debug switches, and several utility methods.
 * 
 * Coded on: July 31, 2013
 * Aditya Mathur
 * 
 */
import java.io.*;
import java.util.*;

public class Utilities{
  
  public static boolean fsmPrintSw=true;
  public static boolean pTableDebugSw=false;
  public static boolean testingTreeDebugSw=false;
  public static boolean transitionCoverSetDebugSw=true; // To or not to print the transition cover set.
  public static boolean fsmCreationDebugSw=false;
  public static boolean fsmExecutionDebugSw=true;
  public static boolean WSetDebugSw=true;
  
  public static void debugPtable(String s){
    if(pTableDebugSw)
      System.out.println(s);
  }
  
  public static void debugTestingTree(String s){
    if(testingTreeDebugSw)
      System.out.println(s);
  }
  
  public static void debugFSM(String s){
    if(fsmCreationDebugSw)
      System.out.println(s);
  }
  
  public static void debugSort(String s){
	    if(fsmExecutionDebugSw)
	        System.out.println(s);
  }
  
  public static void debugFSMExecution(String s){
    if(fsmExecutionDebugSw)
      System.out.println(s);
  }
  
  
  public static void debugWSet(String s){
    if(WSetDebugSw)
      System.out.println(s);
  }
  
  public static void printException(String c, String m, String s){
    System.out.println("\nException occured. \nClass:"+c +"\nMethod: "+m+"\n"+s);
    System.exit(0);
  }
  
  public static boolean existsInVector(String searchString, Vector searchVector){
    for(int i = 0; i < searchVector.size(); i++){
      if((searchVector.get(i)).toString().equals(searchString)){
        return true;
      }
    }
    return false;
  }// End of existsInVector()  
  
  public static void printAllTestCases(Vector<String> testCases){
    System.out.println("\nNumber of Test Cases :"+ testCases.size());
    Collections.sort(testCases);
    System.out.println("Test cases: " + testCases);
    
  }// End of printAllTestCases()
  
  
  
  public static String runFSM(State [] FSM, int stateID, String input, String separator){
    
    // input is a sequence of  symbols  from the input alphabet separated by string in separator.
    // StateId is the ID of the state to which input is to be applied.
    String outputPattern="";  // Output sequence generated by the FSM. Illegal input generates empty output.
    String token;  // An input symbol from the input sequence.
    StringTokenizer inputTokens=new StringTokenizer(input, separator);
    int currentState=stateID;  // Rest the FSM to state StateID.
//    Utilities.debugFSMExecution("\nFSM execution begins. Input: "+input+" Initial state: "+stateID);
    if(FSM[stateID]==null){
      Utilities.printException("wAlgorithm", "runFSM", "Invalid start state. Execution aborted.");
      return "";
    }
    while(inputTokens.hasMoreTokens()){
      token=inputTokens.nextToken(); //Get next token from input.
      try{
//        Utilities.debugFSMExecution("Current state: "+currentState);
        Edge nextStateEdge=FSM[currentState].getNextState(token);
        String outputGenerated=nextStateEdge.output();
        int nextState=nextStateEdge.tail();
        outputPattern=outputPattern+outputGenerated;
//        Utilities.debugFSMExecution(" Input: "+token+" Next state: "+nextState+" Output: "+outputGenerated);
        currentState=nextState;
      }catch (NoNextStateException e){
        Utilities.printException("WMethod", "runFSM", " Invalid token: "+token);
      }
    }
//    Utilities.debugFSMExecution("\nFSM execution completed. Final state: "+currentState);
//    Utilities.debugFSMExecution("Output pattern:"+outputPattern);
    return outputPattern;
  }
}// End of class Utilities.