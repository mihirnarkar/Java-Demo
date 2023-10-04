import java.util.HashMap;
import java.util.Map;

class User{
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("Mihir", 22);
        map.put("Srushti", 22);
        map.put("Purva", 20);
        map.put("Riya", 23);
        map.put("Jatin", 25);

        // Accesing values by keys
        
        // System.out.println("Mihir age is, "+map.get("Mihir"));
        // System.out.println("Srushti age is, "+map.get("Srushti"));
        // System.out.println("Purva age is, "+map.get("Purva"));
        // System.out.println("Riya age is, "+map.get("Riya"));
        // System.out.println("Jatin age is, "+map.get("Jatin"));


        // Checking if the key exist
        // boolean containsJatin = map.containsKey("jatin");
        // if(containsJatin){
        //     System.out.println("Yes");
        // }else{
        //     System.out.println("No");
        // }


        // Iterating over the map
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key+" : "+value);
        }

        // Remove elements :
        map.remove("Riya");
        System.out.println();

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key+" : "+value);
        }


        // Size of the map
        System.out.println("Size of the map : "+map.size());


    }
}