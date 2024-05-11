package com.mycompany.votingsystem;
import java.lang.Exception;

public class VoteException extends Exception {
    
    public VoteException() {
   }
   
  public VoteException(String message)
  {
      super(message);
  }
}
