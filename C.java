package sol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C {
    public static void main(String[] args) {
        String[] str = { "d34", "g54", "d12", "b87", "g1", "c65", "g40", "g5", "d77" };
        Arrays.sort(str, new Comparator<String>() {
            public int compare(String one, String two) {
                return one.charAt(0) - two.charAt(0);

            }
        });
        // List 1
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        System.out.println();
        Map<Character, List<Integer>> map = new HashMap<Character, List<Integer>>();
        for (int i = 0; i < str.length; i++) {
            List<Integer> list = map.getOrDefault(str[i].charAt(0), new ArrayList<Integer>());
            list.add(Integer.valueOf(str[i].substring(1)));
            map.put(str[i].charAt(0), list);
        }
        for (int i = 0; i < str.length; i++) {
            Collections.sort(map.getOrDefault(str[i].charAt(0), new ArrayList<Integer>()));
        }

        // List 2
        map.entrySet().forEach(entry -> {
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.println(entry.getKey() + "" + entry.getValue().get(i));
            }
        });
    }

}
