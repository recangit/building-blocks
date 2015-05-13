package se.recan.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import se.recan.utils.IOutil;

public class Sets {

    protected Sets() {
        IOutil.info(this);

        // Iterera ett HashSet
        Set<String> set = new HashSet<String>();
        set.add("Voluminös");
        set.add("Fyllig");
        set.add("Kraftig");
        set.add("Yppig");
        for (Iterator<String> it = set.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }

        System.out.println(set.contains("Fyllig"));
        System.out.println(set.contains("Yppig"));

        // Konvertera till Array
        String[] string = (String[]) set.toArray(new String[set.size()]);
        for (String string1 : string) {
            System.out.println(string1);
        }

        // Set med objekt
        Set<Person> persons = new HashSet<Person>();

        persons.add(new Person("Kajsa", "Recksén"));
        persons.add(new Person("Annie", "Recksén"));

        Person[] person = (Person[]) persons.toArray(new Person[persons.size()]);
        for (Person person1 : person) {
            System.out.println("\t" + person1.getFirst() + " " + person1.getLast());
        }
    }

    private class Person {

        private final String first;
        private final String last;

        public Person(String first, String last) {
            this.first = first;
            this.last = last;
        }

        public String getFirst() {
            return first;
        }

        public String getLast() {
            return last;
        }
    }
}
