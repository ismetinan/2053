import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    HashMap<Integer, String> map = new HashMap<Integer, String>();
    public String kthDistinct(String[] arr, int k) {

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsValue(arr[i])) {
                map.put(i, arr[i]);
                list.add(arr[i]);                
            } else 
            list.remove(arr[i]);
            
        }
        if (k > list.size()) return "";
        return list.get(k - 1);
    }
}