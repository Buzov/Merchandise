
/**
 *
 * @author Buzov Artur
 */
public abstract class ElectronicDevice implements Comparable<ElectronicDevice> {

    /**
     * The name of the electronic device.
     */
    private String name;
    /**
     * The price of the electronic device.
     */
    double price;
     /**
     * The initial price of the device.
     */
    private int startingPrice = 100;

    /**
     * Constructor.
     * 
     */
    protected ElectronicDevice() {

        price = startingPrice;
        name = "NoName";
    }

    /**
     * Constructor.
     *
     * @param name The name of the electronic device.
     * @param price The price of the electronic device.
     */
    protected ElectronicDevice(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Returns the name of the object. 
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the price of the object. 
     * @return
     */
    public double getPrice() {
        return price;
    }

     /**
     * Returns the average price of the object
     * @return
     */
    public abstract double getAveragePrice();

    /**
     */
    public abstract void printAveragePrice();

    /**
     * Sets the name of the object.
     * @param name The name of the object.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the price of the object.
     * @param price The price of the object.
     */
    public abstract void setPrice(double price);

    @Override
    public abstract String toString();

    @Override
    public int compareTo(ElectronicDevice e) {
        int rez = (int) (this.price - e.getPrice());
        if (rez > 0) {
            return 1;
        }
        if (rez < 0) {
            return -1;
        }
        return 0;
    }
}
