package Singletone;

import java.util.HashMap;
import java.util.Map;

public class LimitedMultiton {
    public enum Count {
        ONE,
        TWO,
        THREE;
    }
    private static Map instance = new HashMap();
    private static LimitedMultiton limitedMultitonInstance;

    public static LimitedMultiton getInstance (Enum key){
        limitedMultitonInstance = (LimitedMultiton) instance.get(key);
        if (limitedMultitonInstance == null){
            limitedMultitonInstance = new LimitedMultiton();
            instance.put(key, limitedMultitonInstance);
        }
        return  limitedMultitonInstance;
    }
}
