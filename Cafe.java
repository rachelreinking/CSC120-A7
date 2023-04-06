/**
 * This creates a Cafe that extends Building to be more specific
 * This keeps track of the number of ounces of coffee, sugar packets, splashes of cream, and cups in the inventory of the store
 * A coffee can be sold that decreases the inventory of the cafe
 * The inventory can also be restocked if there are insufficient amounts to make the coffee being sold
 * @author Rachel Reinking
 * @version 5 April 2023
 */

public class Cafe extends Building{
    
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    /* Default constructor */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
    }
    
    /* Overloaded constructor with nFloors pre-inputted as 1 */
    public Cafe(String name, String address, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        this(name, address, 1, nCoffeeOunces, nSugarPackets, nCreams, nCups);
    }

    /**
     * This method decreases the remaining inventory of the store based on the specifications of the coffee sold
     * Calls restock() method if necessary to restock inventory
     * @param size The size of drink in ounces of coffee
     * @param nSugarPackets The number of Sugar Packets
     * @param nCreams The number of creams
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        if(this.nCoffeeOunces < size || this.nSugarPackets < nSugarPackets || this.nCreams < nCreams || this.nCups < 1) {
            this.restock(size, nSugarPackets, nCreams, 1);
        }
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
    }

    /**
     * This method overloads the sellCoffee() method to include the additional boolean input receipt
     * This method decreases the remaining inventory of the store based on the specifications of the coffee sold
     * and prints a receipt if the customer wants it
     * @param size The size of drink in ounces of coffee
     * @param nSugarPackets The number of Sugar Packets
     * @param nCreams The number of creams
     * @param receipt of the purchase
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams, boolean receipt) {
        this.sellCoffee(size, nSugarPackets, nCreams);
        if(receipt==true) {
            System.out.println("Size: " + size + "\n Number of Sugar Packets: " + nSugarPackets + "\n Splashes of Cream: " + nCreams);
        }
    }
    
    /**
     * This method increases the remaining inventory of the store based on what is needed based on the specifications of the coffee sold
     * @param nCoffeeOunces The number of ounces of coffee
     * @param nSugarPackets The number of Sugar Packets
     * @param nCreams The number of creams
     * @param nCups The number of cups
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
    } 

    /**
     * This method overrides the showOptions() method inherited from the Building class
     * This method prints all the additional interactive methods in the Cafe Class
     */
    public void showOptions() {
        super.showOptions();
        System.out.println(" + sellCoffee() \n + restock()");
    }

    /**
     * This method overrides the goToFloor() method inherited from the Building class
     * This method prints an error message saying that movement off the first floor for the Cafe class is not permitted
     * @param n: the floor number to go to
     */
    public void goToFloor(int n) {
        throw new RuntimeException("This building does not permit movement off the first floor.");
    }

    public static void main(String[] args) {
        
    }
    
}
