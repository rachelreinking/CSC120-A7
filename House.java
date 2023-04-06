/**
 * This creates a House that extends Building to be more specific
 * This keeps track of the names of all of the residents of the house and whether the house has a dining room
 * The residents can move in or out of the house
 * This class also has methods that are accessors for the resident roster, dining room status, and number of residents, 
 * and a method for whether or not a certain individual is a resident of the house
 * @author Rachel Reinking
 * @version 5 April 2023
 */

import java.util.ArrayList;

public class House extends Building {

  private ArrayList<String> residents;
  private boolean hasDiningRoom;
  private boolean hasElevator;

  /* Default constructor */
  public House(String name, String address, int nFloors, boolean hasDiningRoom, boolean hasElevator) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    this.hasElevator = hasElevator;
  }

  /* Overloaded constructor with address pre-inputted as "Smith College" */
  public House(String name, int nFloors, boolean hasDiningRoom, boolean hasElevator) {
    this(name, "Smith College", nFloors, hasDiningRoom, hasElevator);
  } 

/** Accessor for hasDiningRoom */
public boolean hasDiningRoom() {
  return this.hasDiningRoom;
}

/** Accessor for number of residents */
public int nResidents() {
  return this.residents.size();
}

/**
 * This method moves a person into a house as long as they are not already moved into the house
 * @param name The name of the person
 */
public void moveIn(String name) {
  //check if this.residents contains name
  if(this.residents.contains(name)) {
    //  if so: throw an exception
    throw new RuntimeException(name + " is already a resident of " + this.name);
  }
  //append name to this.residents
  this.residents.add(name);
}

/**
 * This method overloads the moveIn() method to include the additional int input roomNum
 * This method moves a person into a house as long as they are not already moved into the house
 * @param name The name of the person
 * @param roomNum The room number the person is moving into
 * @return The room that the person is moving into
 */
public Integer moveIn(String name, int roomNum) {
  //check if this.residents contains name
  if(this.residents.contains(name)) {
    //  if so: throw an exception
    throw new RuntimeException(name + " is already a resident of " + this.name);
  }
  //append name to this.residents
  this.residents.add(name);
  return roomNum;
}

/**
 * This method moves a person out of a house as long as they are not already moved out of the house
 * @param name The name of the person who is moving out
 * @return The name of the person who moved out
 */
public String moveOut(String name) {
  if(!this.residents.contains(name)) {
    throw new RuntimeException(name + "does not live in this house");
  }
  this.residents.remove(name);
  return name;
}

/**
 * This method tells us whether or not a given person is a resident of the specified House
 * @param person The name of the person
 * @return T/F: whether a not a person is a resident of the house
 */
public boolean isResident(String person) {
  return residents.contains(person);
}

/**
 * This method overrides the showOptions() method inherited from the Building class
 * This method prints all the additional interactive methods in the Cafe Class
 */
public void showOptions() {
  super.showOptions();
  System.out.println(" + moveIn() \n + moveOut() \n + isResident");
}

/**
 * This method overrides the goToFloor() method inherited from the Building class
 * This method checks if there is an elevator so that movement between non-adjacent floors is permitted
 * @param n the floor number to go to
 */
public void goToFloor(int n) {
  if (!this.hasElevator) {
    throw new RuntimeException("This building does not have an elevator");
  }
  super.goToFloor(n);
}

  public static void main(String[] args) {

  }

}