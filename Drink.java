class Drink extends Item {
  //prooperty for cold or not 
  
  public Drink(String name, Double price, String itemNumber){
    super(name, price, itemNumber);
  }
    @Override
  public String inStock() {
    //drink overrides abstract method to always be in stock
    String inStock = "in";
    return inStock;
  } 

}