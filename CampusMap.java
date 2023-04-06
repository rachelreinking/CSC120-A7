/**
 * This creates a map of campus that aggregates together many Buildings from Smith College
 * This keeps track of all Buildings that have been added to the campus map
 * Buildings and their subclasses can be added and removed from the map
 * @author Rachel Reinking
 * @version 5 April 2023
 */

import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street, Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court, Northampton, MA 01063", 4));
        myMap.addBuilding(new House("Haven House", "110 Elm Street, Northampton, MA 01063", 3, false, false));
        myMap.addBuilding(new House("Wesley House", "4 Chapin Way, Northampton, MA 01063", 3, false, false));
        myMap.addBuilding(new Library("Neilson Library", "7 Neilson Drive, Northampton, MA 01063", 5, true));
        myMap.addBuilding(new Cafe("Compass Cafe", "7 Neilson Drive, Northampton, MA 01063", 1, 100, 100, 100, 100));
        myMap.addBuilding(new Building("Campus Center", "100 Elm Street, Northampton, MA 01063", 3));
        myMap.addBuilding(new Cafe("Campus Center Cafe", "100 Elm Street, Norhtampton, MA 01063", 100, 100, 100, 100));        
        myMap.addBuilding(new Building("Seelye Hall", "2 Seelye Drive, Northampton, MA 01063", 3));
        myMap.addBuilding(new Building("Lyman Plant House", "16 College Lane, Northampton, MA 01063", 1));
        myMap.addBuilding(new Building("Crew House", "28 College Lane, Northampton, MA 01063", 1));
        myMap.addBuilding(new Library("Josten Library", "122 Green Street, Northampton, MA 01063", 2, false));
        System.out.println(myMap);
    }
    
}
