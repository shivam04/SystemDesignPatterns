package zh.prototypepattern.a.example;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    Map<String,Student> registryValues = new HashMap();

    void register(String key, Student s){
        registryValues.put(key, s);
    }

    Student get(String key) {
        return registryValues.get(key);
    }
}
