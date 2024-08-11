import java.util.ArrayList;
import java.util.List;

public class Flowershopmanagementsystem2 {

    private List<Flower> flowerList;

    public FlowerDAO() {
        // Initialize the ArrayList
        flowerList = new ArrayList<>();
    }

    public List<Flower> getAllFlowers() {
        // Return the list of flowers
        return flowerList;
    }

    public void addFlower(Flower flower) {
        // Add a flower to the list
        flowerList.add(flower);
        // Implement code to add the flower to the database
    }

    public void updateFlower(Flower updatedFlower) {
        // Find and update the flower in the list
        for (Flower flower : flowerList) {
            if (flower.getId() == updatedFlower.getId()) {
                flower.setName(updatedFlower.getName());
                flower.setPrice(updatedFlower.getPrice());
                // Implement code to update the flower in the database
                break;
            }
        }
    }

    public void deleteFlower(int flowerId) {
        // Remove the flower from the list
        flowerList.removeIf(flower -> flower.getId() == flowerId);
        // Implement code to delete the flower from the database
    }
}
