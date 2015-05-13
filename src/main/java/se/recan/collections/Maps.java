package se.recan.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import se.recan.utils.IOutil;

public class Maps {

    protected Maps() {
        IOutil.info(this);

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Lukt");
        map.put(2, "Odör");
        map.put(3, "Stank");
        map.put(4, "Doft");

        System.out.println("map.entrySet: " + map.entrySet());
        System.out.println("map.keySet: " + map.keySet());
        System.out.println("HashMap size: " + map.size());

        // Ta ut nyckel ur en HashMap
        for (Iterator<Integer> it = map.keySet().iterator(); it.hasNext();) {
            System.out.println(it.next());
        }

        // Ta ut värdet ur en HashMap
        for (Iterator<String> it = map.values().iterator(); it.hasNext();) {
            System.out.println(it.next());
        }

        // Ta ut nyckel och värde ur en HashMap
        for (Iterator<Integer> it = map.keySet().iterator(); it.hasNext();) {
            int key = it.next();
            System.out.println(key + " => " + map.get(key));
        }

        // HashMap till ArrayList
        List<String> list = new ArrayList<String>(map.values());
    }
}
