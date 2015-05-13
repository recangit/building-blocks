package se.recan.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.lang.StringBuilder;
import se.recan.utils.IOutil;

/**
 * ArrayList har en fördefinierad längd. Tills dess att den är fylld är det bara att fylla på.
 * Detta gör den snabb för itereringar men långsam då den väl fyllts eftersom den då måste utökas.
 * Den länkade lista är dynamisk i sin längd, snabb på att ta ut, sätta in och ersätta värden.
 * Däremot långsammare vid iterering.
 * Mitt exempel nedan borde följdaktligen hellre göras med en länkad lista.
 *
 * Listor behåller alltid den ordning elementen lagts in på.
 * Detta gäller alla klasser som implementerar java.util.List interface.
 * Created: 2012-04-17
 * Last Modified: 2012-04-17
 * @author Anders Recksén (anders[at]recksen[dot]se)
 */

class Lists {

	private static final List<String> LIST_ARRAY 
											= new ArrayList<String>();
											
	private static final String UNO 		= "Det ";
	private static final String DOS 		= "finns ";
	private static final String TRES 		= "bara ";
	private static final String CUATRO 		= "en ";
	private static final String CINCO 		= "Gud ";
	private static final String SEIS 		= "och ";
	private static final String SIETE 		= "Muhammed ";
	private static final String OCHO 		= "är ";
	private static final String NUEVE 		= "hans ";
	private static final String DIEZ 		= "profet";
	
	protected Lists() throws Exception {
		IOutil.info(this);
		
		LIST_ARRAY.add(UNO);
		LIST_ARRAY.add(DOS);
		LIST_ARRAY.add(TRES);
		LIST_ARRAY.add(CUATRO);
		LIST_ARRAY.add(CINCO);
		LIST_ARRAY.add(SEIS);
		LIST_ARRAY.add(SIETE);
		LIST_ARRAY.add(OCHO);
		LIST_ARRAY.add(NUEVE);
		LIST_ARRAY.add(DIEZ);
		
		StringBuilder builder = new StringBuilder();

		for(String s: LIST_ARRAY) { builder.append(s); }
		builder.append(". Arraylängd: ");
		builder.append(LIST_ARRAY.size());

		IOutil.print(builder.toString());
		
		IOutil.print("Objektet ( med innehåll " + CINCO + ") ligger på position: " + LIST_ARRAY.indexOf(CINCO));

		// Rensa StringBuilder
		builder.delete(0, builder.capacity());
		
		builder.append("Radera det och ytterligare ett element - ");
		
		LIST_ARRAY.remove(4);
		LIST_ARRAY.remove(SIETE);
		for(String s: LIST_ARRAY) { builder.append(s); }
		builder.append(". Arraylängd: ");
		builder.append(LIST_ARRAY.size());
		IOutil.print(builder.toString());
		
		// Rensa StringBuilder
		builder.delete(0, builder.capacity());

		String gud = "Lindeman ";
		LIST_ARRAY.add(4, gud);
		
		String profet = "Hasse ";
		LIST_ARRAY.add(6, profet);

		builder.append("Addera element på givna positioner - ");
		for(String s: LIST_ARRAY) { builder.append(s); }
		builder.append(". Arraylängd: ");
		builder.append(LIST_ARRAY.size());
		IOutil.print(builder.toString());

		System.out.print("Byt ut ett element - ");
		LIST_ARRAY.set(LIST_ARRAY.indexOf(OCHO), "var ");
		for(Iterator i = LIST_ARRAY.listIterator(); i.hasNext();) {
			System.out.print(i.next());
		}
		
		System.out.println("");
		
		// Rensa StringBuilder
		builder.delete(0, builder.capacity());
		
		builder.append("Gör en kopia av delar av listan med argumenten start och (stopp + 1).");
		builder.append("\n");
		//List<String> list = LIST_ARRAY.subList(3, 6);
		List<String> list = Collections.synchronizedList(LIST_ARRAY.subList(3, 6));
		
		for(String s: list) { builder.append(s); }
		builder.append(". Arraylängd: ");
		builder.append(list.size());
		IOutil.print(builder.toString());
		
		// Rensa StringBuilder
		builder.delete(0, builder.capacity());
		
		builder.append("Radera flera element från originalet med argumenten start och (stopp + 1) samt clear(). Nedanstående tar alltså bort elementen 3, 4 och 5.");
		builder.append("\n");
		LIST_ARRAY.subList(3, 6).clear();
		for(String s: LIST_ARRAY) { builder.append(s); }
		builder.append(". Arraylängd: ");
		builder.append(LIST_ARRAY.size());
		IOutil.print(builder.toString());
		//synchronized
		
		//List<String> myCopy = Collections.synchronizedList(list);
		
//		ArrayList<String> myCopy = new ArrayList<String>(list);

		// Rensa StringBuilder
		builder.delete(0, builder.capacity());
		
		builder.append("Slutligen..");
		builder.append("\n");
// 		synchronized(LIST_ARRAY) { LIST_ARRAY.addAll(3, list); }
// 		for(String s: LIST_ARRAY) { builder.append(s); }
// 		builder.append(". Arraylängd: ");
// 		builder.append(LIST_ARRAY.size());
// 		IOutil.print(builder.toString());
// 
// 		System.out.println("");
// 		
// 		String[] s = LIST_ARRAY.toArray(new String[LIST_ARRAY.size()]);
// 		System.out.println("String[4] - " + s[4]);
// 		LIST_ARRAY.clear();
// 		IOutil.print("ArrayListan är tom - " + LIST_ARRAY.isEmpty());

		sort();
		
		tillArray(LIST_ARRAY);
	}
	
	private void tillArray(List<String> list) {
		IOutil.printAsterix("Konvertera till Array");
        String[] string = list.toArray(new String[list.size()]);
        for (String s : string) {
            System.out.print(s + " ");
        }
        System.out.println("");
	}
	
	private void sort() {
		IOutil.printAsterix("Sortering");
		
		List<String> expected = new ArrayList<String>();
        expected.add("D");
        expected.add("B");
		expected.add("A");
        expected.add("C");
		
		Collections.sort(expected);
		
		List<String> actual = new ArrayList<String>();
		actual.add("A");
		actual.add("B");
		actual.add("C");
		actual.add("D");
		
		for(String s: expected) { System.out.println(s); }
		
		System.out.println("Are this Lists the same?" + ", " + expected.equals(actual));
	}
}