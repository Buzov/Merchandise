
import java.util.ArrayList;

/**
 *
 * @author Buzov Artur
 */
public class Laptop extends ElectronicDevice {

    /**
     * The laptop`s diagonal.
     */
    private double diagonal;
    /**
     * The size of the laptop`s hard drive.
     */
    private int hdd;
    /**
     * The laptop`s RAM size.
     */
    private int ram;
    /**
     * The index number of the created object "Laptop".
     */
    private int numberLaptop;
    /**
     * The number of the created objects "Laptop".
     */
    public static int sumNumberLaptop = 0;
    /**
     * The price list of all created objects "Laptop".
     */
    public static ArrayList<Double> priceArrayLaptop = new ArrayList<Double>();

    /**
     * Constructor. The index number is given to the object. The average price
     * is entered to price list “priceArrayLaptop”.
     */
    protected Laptop() {
        numberLaptop = sumNumberLaptop;
        sumNumberLaptop++;
        priceArrayLaptop.add(price);
    }

    /**
     * Constructor. The index number is given to the object. The average price
     * is entered to price list "priceArrayLaptop".
     *
     * @param name The name of the electronic device.
     * @param price The price of the electronic device.
     * @param diagonal The laptop`s diagonal.
     * @param hdd The size of the laptop`s hard drive.
     * @param ram The laptop`s RAM size.
     */
    protected Laptop(String name, double price, double diagonal, int hdd, int ram) {
        super(name, price);
        this.diagonal = diagonal;
        this.hdd = hdd;
        this.ram = ram;

        numberLaptop = sumNumberLaptop;
        sumNumberLaptop++;
        priceArrayLaptop.add(price);
    }

    /**
     * Returns the laptop`s diagonal.
     *
     * @return
     */
    public double getDiagonal() {
        return diagonal;
    }

    /**
     * Returns the size of the laptop`s hard drive.
     *
     * @return
     */
    public int getHdd() {
        return hdd;
    }

    /**
     * Returns the laptop`s RAM size.
     *
     * @return
     */
    public int getRam() {
        return ram;
    }

    /**
     * Returns the laptop`s average price
     *
     * @return
     */
    @Override
    public double getAveragePrice() {
        double sum = 0;
        for (Double list1 : priceArrayLaptop) {
            sum = sum + list1;
        }

        return Math.rint(100.0 * sum / priceArrayLaptop.size()) / 100.0;
    }

    /**
     * Outputs to the console the laptop`s average price
     */
    @Override
    public void printAveragePrice() {
        System.out.println("Средняя цена ноутбука " + getAveragePrice() + "$.");
    }

    /**
     * Sets the laptop`s diagonal
     *
     * @param diagonal
     */
    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    /**
     * Sets the size of the laptop`s hard drive.
     *
     * @param hdd
     */
    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    /**
     * Sets the laptop`s RAM size.
     *
     * @param ram
     */
    public void setRam(int ram) {
        this.ram = ram;
    }

    /**
     * Sets the price of the laptop.
     *
     * @param price
     */
    @Override
    public void setPrice(double price) {
        this.price = price;
        priceArrayLaptop.set(numberLaptop, price);
    }

    /**
     * Returns object concept as a string.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Ноутбук " + getName()
                + ". Стоимость " + getPrice() + "$. "
                + "Диагональ " + diagonal + "\". "
                + "Объём жесткого диска " + hdd + " ГБ. "
                + "Объём оперативной памяти " + ram + " ГБ.";
    }

}
