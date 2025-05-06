 
package composition;
 
import java.util.ArrayList;
import java.util.List;

public class House {
   private String housenumber;
    private List<Room>roomsList;
   public House(String housenumber){
       this.housenumber=housenumber;
       roomsList=new ArrayList();
   }
   public String getHouseNumber(){
       return housenumber;
   }
 public void addRoom(String name){
     Room r1=new Room(name);
     roomsList.add(r1);
 }
 public void showRooms(){
     System.out.println("House Number:" + housenumber);
     for(Room r :roomsList){
         System.out.println(r.getName());
     }
 }
      }
