 
package composition;
 
public class Composition {
 
    public static void main(String[] args) {
        House h=new House("B-342");
        h.addRoom("BedRoom");
        h.addRoom("DryingRoom");
        h.addRoom("DinningRoom");
        h.showRooms();
    }
    
}
