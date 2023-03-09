import java.util.*;

class Main {
  public static void main(String[] args) {
    CheckSelection check = new CheckSelection();
    //example items
    Drink coke =  new Drink("coke", 1.00, "A12");
    Drink sprite = new Drink("sprite", 1.00, "A13");
    Candy snickers = new Candy("snickers", 2.00, "B17");
    Candy reeses = new Candy("reeses", 2.00, "B18");
    Snack hotCheetos = new Snack("hot cheetos", 2.00, "C12");
    Snack bbqChips = new Snack("bbq chips", 2.00, "C13");

    //change exception to be if item object created does have all three properties it throws error

    //create an array list that contains all previously created objects and will be used to display a menu
    ArrayList<Item> availableItems = new ArrayList<Item>();
    availableItems.add(coke);
    availableItems.add(sprite);
    availableItems.add(snickers);
    availableItems.add(reeses);
    availableItems.add(hotCheetos);
    availableItems.add(bbqChips);
    
    //traverse over arraylist obtaining each property and print it to the console.
    for(int i = 0; i <availableItems.size(); i++){
      System.out.println(availableItems.get(i).getItemNumber());
      System.out.println(availableItems.get(i).getName());
      System.out.println("$" + availableItems.get(i).getPrice());
      System.out.println("-------");
    }




    //create a scanner to accept user input
    Scanner sc =  new Scanner(System.in);
    //ask user to input selection
    System.out.println("Please make your selection");
    //save selection to variable
    String selection = sc.nextLine();

    try{
      //this will pass users selection to the checkUserInput method
      String checkResult = check.checkUserInput(selection);
      System.out.println(checkResult);
    } catch(InvalidInputException e) {
      e.printStackTrace();
    }

    //store output of inStock method in stockCheck use conditional to determine if switch case for item selection is executed or if scanner closes because item is out of stock.
    // String stockCheck = check.checkInputType(selection);
    char firstChar = selection.charAt(0);
    String stockCheck = null;
    if(firstChar == 'A'){
      coke.inStock();
      if(coke.inStock() == "in"){
        stockCheck = "in";
      } else {
        stockCheck = "out";
      }
    } else if(firstChar == 'B'){
      snickers.inStock();
      if(snickers.inStock() == "in"){
        stockCheck = "in";
      } else {
        stockCheck = "out";
      }
    } else if(firstChar == 'C') {
      hotCheetos.inStock();
      if(hotCheetos.inStock() == "in"){
              stockCheck = "in";
      } else{
        stockCheck = "out";
      }

    }

    // String stockCheck = coke.inStock();
    if(stockCheck == "in") {
          //this switch satement will compare user input to the available items based on item number and return what the price will be for each
    switch(selection){
      case "A12":
        System.out.println("A " + coke.getName() + " will be $" + coke.getPrice() + " , please insert payment amount in $1's or $5's");
        Double paymentCoke = sc.nextDouble();
        //this will invoke the calcChange method and pass the user input that was saved into payment           variable as an argument to calculate change
        System.out.println("Your change is $" + coke.calcChange(paymentCoke) + " , enjoy!");
        break;
      case "A13":
        System.out.println("A " + sprite.getName() + " will be $" + sprite.getPrice() + " , please insert payment in $1's or $5's");
        Double paymentSprite = sc.nextDouble();
        System.out.println("Your change is $" + sprite.calcChange(paymentSprite) + " , enjoy!");
        break;
      case "B17":
        System.out.println("A " + snickers.getName() + " will be $" + snickers.getPrice() + " , please insert payment in $1's or $5's");
        Double paymentSnickers = sc.nextDouble();
        System.out.println("Your change is $" + sprite.calcChange(paymentSnickers) + " , enjoy!");
        break;
        case "B18":
        System.out.println("A " + reeses.getName() + " will be $" + reeses.getPrice() + " , please insert payment in $1's or $5's");
        Double reesesPayment = sc.nextDouble();
        System.out.println("Your change is $" + sprite.calcChange(reesesPayment) + " , enjoy!");
        break;
      case "C12":
        System.out.println("A bag of " + hotCheetos.getName() + " will be $" + hotCheetos.getPrice() + " , please insert payment amount in $1's or $5's");
        Double cheetoPayment = sc.nextDouble();
        //this will invoke the calcChange method and pass the user input that was saved into payment           variable as an argument to calculate change
        System.out.println("Your change is $" + hotCheetos.calcChange(cheetoPayment) + " , enjoy!");
        break;
        case "C13":
        System.out.println("A bag of " + bbqChips.getName() +  " will be $" + bbqChips.getPrice() + " , please insert payment amount in $1's or $5's");
        Double bbqChipsPayment = sc.nextDouble();
        //this will invoke the calcChange method and pass the user input that was saved into payment           variable as an argument to calculate change
        System.out.println("Your change is $" + bbqChips.calcChange(bbqChipsPayment) + " , enjoy!");
        break;
    }
      
    } else {
      System.out.println("Item is out of stock, please make another selection");
      sc.close();
    }

  }
}