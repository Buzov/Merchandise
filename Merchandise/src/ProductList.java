
import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * @author Buzov Artur
 */
public class ProductList {
    /** Array for object storage "ElectronicDevice".*/
    private ArrayList<ElectronicDevice> list = new ArrayList<ElectronicDevice>();

    /**
     * Returns array of objects.
     * @return
     */
    public ArrayList<ElectronicDevice> getList() {
        return list;
    }
    
    /**
     * Adds objects to array.
     * @param device
     */
    public void Add(ElectronicDevice device) {
        list.add(device);
    }
    
    /**
     * Returns the sum of prices of all objects.
     * @return
     */
    public double Count() {
        double sum = 0;
        for (ElectronicDevice list1 : list) {
            sum = sum + list1.getPrice();
        }
        return Math.rint(100.0 * sum) / 100.0;
    }

    /**
     * Returns the object from the array according to their indexes.
     * @param index
     * @return
     */
    public ElectronicDevice getDeviceArrayList(int index) {
        return list.get(index - 1);
    }

    /**
     * Outputs to the console array`s content.
     */
    public void printList() {
        for (Object list1 : list) {
            System.out.println(list1);
        }
    }
    
    /**
     * Sorts array.
     */
    public void sortList() {
        Collections.sort(list);
    }
    
    
}
