package CH11;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Nikhil on 1/17/2016.
 */
public class Dog {
    public String name;
    public Dog(String n){
        name =  n;
    }
    public boolean equals(Objects o){
        /*if((o instanceof Dog) && (((Dog)o ).name == name)){
            return true;
        }else{
            return false;
        }*/
        return false;
    }
    public int hashCode(){
        return name.length();
    }
}

class Cat{}

enum Pets{DOGS,CAT, HORSE}

class MapTest{
    public static void main(String[] args) {
        Map<Object,Object> map = new HashMap<>();
        map.put("K1", new Dog("Aiko"));
        map.put("K2", Pets.DOGS);
        map.put(Pets.CAT, "CAT key");
        Dog d1= new Dog("Clover");
        map.put(d1,"DOG Key");
        map.put(new Cat(),"CAT Key");

        System.out.println(map.get("K1"));
        String k2= "k2";
        System.out.println(map.get(k2));
        Pets p = Pets.CAT;
        System.out.println(map.get(p));
        System.out.println(map.get(d1));
        System.out.println(map.get(new Cat()));
        System.out.println(map.size());
    }
}