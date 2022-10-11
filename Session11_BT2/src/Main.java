import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //TreeMap tu dong sap xep theo key
        String str = "Rikkei Academy - Rikkei Academy la hoc vien dau tien ap dung mo hinh hoc dao nguoc";
        //Khoi tao doi tuong TreeMap
        TreeMap<String, Integer> myMap = new TreeMap<>();
        //Tach chuoi str ra mang
        String[] arrStr = str.toUpperCase().split(" ");
        //Duyet cac phan tu arrStr, day cac phan tu sang myMap
        for (int i = 0; i < arrStr.length; i++) {
            if (myMap.containsKey(arrStr[i])) {
                //key arrStr[i] da ton tai trong myMap --> tang value len 1
                myMap.put(arrStr[i],myMap.get(arrStr[i]) + 1);
            } else {
                //key arrStr[i] chua ton tai trong myMap --> them 1 phan tu vao myMap
                myMap.put(arrStr[i], 1);
            }
        }
        for (String key : myMap.keySet()) {
            System.out.printf("%s - %d\n",key,myMap.get(key));
        }
    }
}