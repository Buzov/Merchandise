
import java.util.ArrayList;

/**
 *
 * @author Buzov Artur
 */
public class Camera extends ElectronicDevice {

    /**
     * The total number of camera`s pixels.
     */
    private double totalNumberOfPixels;
    /**
     * Camera`s zoom.
     */
    private double zoom;
     /**
     * The index number of the created object "Camera".
     */
    private int numberCamera;
    /**
     * The number of the created objects "Camera".
     */
    public static int sumNumberCamera = 0;
    /**
     * The price list of all created objects "Camera".
     */
    public static ArrayList<Double> priceArrayCamera = new ArrayList<Double>();

    /**
     * Constructor. The index number is given to the object. The average price
     * is entered to price list "priceArrayCamera".
     */
    protected Camera() {

        numberCamera = sumNumberCamera;
        sumNumberCamera++;
        priceArrayCamera.add(price);

    }

    /**
     * Constructor. The index number is given to the object. The average price
     * is entered to price list “priceArrayCamera”.
     *
     * @param name The name of the electronic device.
     * @param price The price of the electronic device.
     * @param totalNumberOfPixels The total number of camera`s pixels.
     * @param zoom Camera`s zoom.
     */
    protected Camera(String name, double price, double totalNumberOfPixels, double zoom) {
        super(name, price);
        this.totalNumberOfPixels = totalNumberOfPixels;
        this.zoom = zoom;
        numberCamera = sumNumberCamera;
        sumNumberCamera++;
        priceArrayCamera.add(price);
    }

    /**
     * Returns the total number of camera`s pixels.
     *
     * @return
     */
    public double getTotalNumberOfPixels() {
        return totalNumberOfPixels;
    }

    /**
     * Returns the camera`s zoom.
     *
     * @return
     */
    public double getZoom() {
        return zoom;
    }

    /**
     * Returns the average price of the camera.
     *
     * @return
     */
    @Override
    public double getAveragePrice() {
        double sum = 0;
        for (Double list1 : priceArrayCamera) {
            sum = sum + list1;
        }

        return Math.rint(100.0 * sum / priceArrayCamera.size()) / 100.0;
    }

    /**
     * Outputs to the console the average price of the camera.
     */
    @Override
    public void printAveragePrice() {
        System.out.println("Средняя цена камеры " + getAveragePrice() + "$.");
    }

    /**
     * Sets the total number of camera`s pixels.
     *
     * @param totalNumberOfPixels
     */
    public void setTotalNumberOfPixels(double totalNumberOfPixels) {
        this.totalNumberOfPixels = totalNumberOfPixels;
    }

    /**
     * Sets the camera`s zoom.
     *
     * @param zoom
     */
    public void setZoom(double zoom) {
        this.zoom = zoom;
    }

    /**
     * Sets the price of the camera.
     *
     * @param price
     */
    @Override
    public void setPrice(double price) {
        this.price = price;
        priceArrayCamera.set(numberCamera, price);
    }

    /**
     * Returns object concept as a string.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Камера " + getName()
                + ". Стоимость " + getPrice() + "$. "
                + "Общее число пикселей: " + totalNumberOfPixels + "\". "
                + "Увеличение " + zoom + ".";
    }

}
