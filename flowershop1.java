package flowershop1;
class FlowerShop {
   public String[]flowers;
  public  int[] quantities;
   public int capacity;
   public int count;
    public FlowerShop(int capacity) {
    this.capacity = capacity;
    flowers = new String[capacity];
    quantities = new int[capacity];
    count = 0; 
}
public void addFlower(String flower,int quantity){
    if(count<capacity){
        flowers[count] = flower;
        quantities[count]= quantity;
        count ++;
        System.out.println(quantity+" "+ flower +" 's added to the inventory");
    }else{
            System.out.println("Inventory is full , sorry :(");

    }
}
public void displayInventory() {
        System.out.println("Flower Inventory:");
        for (int i = 0; i < count; i++) {
            System.out.println(flowers[i] + ": " + quantities[i]);
        }
    }
}
