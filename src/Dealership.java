import java.util.*;
public class Dealership {
    public static void main(String[] args){
        HashMap<String, String> lot = new HashMap<>();
        lot.put("Civic", "Honda");
        lot.put("Mustang", "Ford");
        lot.put("BRZ", "Subaru");
        lot.put("Sequoia", "Toyota");

        Scanner in = new Scanner(System.in);
        System.out.println("What car model are you looking for?");
        String name = in.nextLine();
        if(lot.containsKey(name)){
            System.out.println("Seems like your looking for a " + name + ". Here's our " + lot.get(name) + " inventory");
        }
        else{
            System.out.println("Unfortunately we do not have any " + name + " in our inventory");
        }
    }
}
