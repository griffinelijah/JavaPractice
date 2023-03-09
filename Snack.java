class Snack extends Item {
  public Snack(String name, Double price, String itemNumber){
    super(name, price, itemNumber);
  }

  @Override
  public String inStock() {
    String inStock = null;
    //assigns ran value from 0.0 to 1.0
    double rand =  Math.random();
    //assign stock to whatever selectionInput is
    if(rand <= 0.8){
      // System.out.println("this item is out of stock");
      inStock = "in";
      return inStock;
    } else {
      // System.out.println("Thank you for you purchase!");
      inStock = "not";
      return inStock;
    } 
  } 
}