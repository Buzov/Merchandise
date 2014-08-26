
/**
 * The container is being filled In this class, 
 * output to the console its contents.
 * Content is sorted by price and output to the console.
 * @author Buzov Artur
 */
public class StartProgram {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        ProductList device = new ProductList();

        Camera c1 = new Camera("Sony", 65.5, 8, 3);
        Camera c2 = new Camera("Panasonic", 200.2, 15.5, 10);
        Camera c3 = new Camera("Canom", 108.3, 12, 5);
        Camera c4 = new Camera("Canom", 50.3, 10, 3);
        Camera c5 = new Camera("Canom", 40.3, 9, 3);
        Camera c6 = new Camera("Canom", 120.3, 15, 6);
        Camera c7 = new Camera();
        Laptop n1 = new Laptop("Asus", 304.52, 11.6, 320, 2);
        Laptop n2 = new Laptop("Apple", 501.12, 11, 120, 8);
        Laptop n3 = new Laptop("Acer", 250.89, 13, 254, 2);
        Laptop n4 = new Laptop();
        
        ElectronicDevice[] array = {c1, c2, c3, c4, c5, c6, c7, n1, n2, n3, n4};
        
        for (ElectronicDevice array1 : array) {
            device.Add(array1);
        }
       
        
        printLine();
        device.printList();
        device.sortList();
        printLine();
        device.printList();
        printLine();

        
        
        System.out.println("Стоимость продукции " + device.Count() + "$.");
        c3.printAveragePrice();
        n4.printAveragePrice();
        printLine();        
        //установка новых цен для созданных товаров 
        c3.setPrice(880.3);
        n4.setPrice(1024.2);
        
        System.out.println("Новая сортировка");
        device.printList();
        device.sortList();
        printLine();
        device.printList();

        printLine();
        System.out.println("Стоимость продукции " + device.Count() + "$.");
        c3.printAveragePrice();
        n4.printAveragePrice();
        

    }
    
    public static void printLine() {
            System.out.println("--------------------------------------------");
    }

}
