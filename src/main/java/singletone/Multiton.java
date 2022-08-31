package singletone;

import java.util.HashMap;
import java.util.Map;

public class Multiton {

    private static Map instance = new HashMap();
    private static Multiton multitonInstance;


    public static Multiton getInstance(String key){
        multitonInstance = (Multiton) instance.get(key);
        if (multitonInstance == null){
            multitonInstance = new Multiton();
            instance.put(key, multitonInstance);
        }
        return multitonInstance;
    }
}
