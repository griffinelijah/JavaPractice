public  abstract class Item {
  public String name;
  public Double price;
  public String itemNumber;

  public Item(String name, Double price, String itemNumber){
    this.name = name;
    this.price = price;
    this.itemNumber = itemNumber;
  }
  
  public void setName (String name) {
    this.name = name;
  }

  //get item price
  public String getName() {
    return name;
  }
  //set price
  public void setPrice (Double price) {
    this.price = price;
  }
  //get price
  public Double getPrice() {
    return price;
  }
  //set item number
  public void setItemNumber (String itemNumber) {
    this.itemNumber = itemNumber;
  }
  //get itemnumber
  public String getItemNumber() {
    return itemNumber;
  }
  //this method will calculate amount of change returned to customer based on payment input
  //paymentInput is an argument that takes the payment from the switch ase in main.java
  public Double calcChange(Double paymentInput) {
    Double change = 0.00;
    Double payment = paymentInput;
    String stringMsg = "please enter valid payment";
    //this conditional will check if payment amount entered is a 1 or 5 if so it calculates change if anything else is entered it prints out the statement below
    if(payment == 5.0 || payment == 1.00){
      change = payment - this.price;
      return change;
    } else {
        try {
          double returnMsg = Double.parseDouble(stringMsg);
          return returnMsg;
          } catch (NumberFormatException e){
          System.out.println("You have entered an invalid payment amount");
          }
      return null;
    }


  }


  //create abstract method that can be used to randomly make an item out of stock
  public abstract String inStock();
}

