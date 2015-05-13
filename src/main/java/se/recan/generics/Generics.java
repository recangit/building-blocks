package se.recan.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import se.recan.utils.IOutil;

public class Generics {

    String[] mainTypes = {"Location", "Rekvisita", "Dekor", "Fordon"};

    List<Reference> references = new ArrayList<Reference>();

    private Generics() {
        IOutil.info(this);

        references.add(new Reference(1, "Metro"));
        references.add(new Reference(2, "Google"));
        references.add(new Reference(3, "Kompis"));
        references.add(new Reference(101, "Radioreklam"));
        references.add(new Reference(102, "Dagens Nyheter"));
        references.add(new Reference(103, "SVD"));
        references.add(new Reference(104, "SF webplats"));

        // This test collects a traditionally built Vector and converts it to a Generic.
        // This is usefull when I use someone elses api and can't change the method who's
        // creating the Vector (getTraditional()).
        ArrayList<Bean> v = (ArrayList<Bean>) getTraditional();
        for (Bean b : v) {
            System.out.println(b.getName());
        }
    }

    private ArrayList<Bean> getTraditional() {
        ArrayList<Bean> list = new ArrayList<Bean>();
        list.add(new Bean("Anders"));
        list.add(new Bean("Sofia"));
        list.add(new Bean("Kajsa"));
        list.add(new Bean("Annie"));
        return list;
    }

    private void first() {
        ArrayList<String> list = getMainTypes();
        for (String s : list) {
            System.out.println(s);
        }
    }

    private List<Reference> getVector() {
        return references;
    }

    private void second() {
        ArrayList<Reference> list = (ArrayList<Reference>) getVector();

        int numb = 1;

        for (Reference r : list) {
            r.setOther(Integer.toString(numb));
            System.out.println(r.getId() + ", " + r.getName() + ", " + r.getOther());
            numb++;
        }
    }

    private void third() {
        HashMap<Integer, Integer> experienceMap = new HashMap<Integer, Integer>();

        experienceMap.put(2008, 0);
        experienceMap.put(2001, 1);
        experienceMap.put(2002, 2);
        experienceMap.put(2003, 3);
        experienceMap.put(2003, 4);
        experienceMap.put(2005, 5);
        experienceMap.put(2006, 6);
        experienceMap.put(2007, 7);
        experienceMap.put(2008, 8);
        experienceMap.put(2008, 9);

        int id = getId(experienceMap, 2003);
        System.out.println("id = " + id);
    }

    private int getId(HashMap<Integer, Integer> experienceMap, int year) {
        int value = -1;

        ArrayList<Integer> keys = new ArrayList<Integer>();

        keys.addAll(experienceMap.keySet());

        Collections.sort(keys);

        for (Integer i : keys) {
            System.out.println(year + " >= " + i);
            if (year >= i) {
                value = experienceMap.get(i);
            } else {
                break;
            }
        }

        return value;
    }

    public ArrayList<String> getMainTypes() {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(mainTypes));
        return list;
    }

    private HashMap<String, Integer> getFourth() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Kajsa", 5);
        map.put("Annie", 2);
        return map;
    }

    public static void main(String[] args) {
        Generics t = new Generics();

        t.first();
        t.second();
        t.third();

        HashMap<String, Integer> fourth = t.getFourth();
        if (fourth.containsKey("Kajsa")) {
            int age = fourth.get("Kajsa");
            System.out.println("age = " + age);
        }

        System.exit(0);
    }

    private static class Reference {

        private int id = 0;
        private String name = "";
        private String other = "";

        Reference(int id, String name) {
            this.id = id;
            this.name = name;
        }

        protected int getId() {
            return id;
        }

        protected String getName() {
            return name;
        }

        protected void setOther(String other) {
            this.other = other;
        }

        protected String getOther() {
            return other;
        }
    }

    private static class Bean {

        private String name;

        protected Bean(String name) {
            this.name = name;
        }

        protected void setName(String name) {
            this.name = name;
        }

        protected String getName() {
            return name;
        }
    }
}
