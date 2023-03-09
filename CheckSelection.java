class CheckSelection {
  public String checkUserInput(String userInput) throws InvalidInputException{
    //if input is not a String throw exception
    if(!(userInput instanceof String)){
      throw new InvalidInputException("Invalid Input");
    } else {
    return "Great choice!";
    }
  }
}