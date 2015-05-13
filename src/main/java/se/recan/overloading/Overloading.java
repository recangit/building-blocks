package se.recan.overloading;

import se.recan.utils.IOutil;

/**
 * Överlagring (overloading), inte förväxlas med överskuggning (overriding).
 * Created: 2012-04-11
 * Last Modified: 2012-04-11
 * @author Anders Recksén (anders[at]recksen[dot]se)
 */
 
public class Overloading {

	public Overloading() {
		IOutil.info(this);
		
        overload();
        overload("");
        overload(0);
        overload("", 0);
    }
    
    private void overload() { System.out.println("overload NO:1"); }
    
    private void overload(String s) { System.out.println("overload NO:2"); }
    
    private void overload(int i) { System.out.println("overload NO:3"); }
    
    private void overload(String s, int i) { System.out.println("overload NO:4"); }
    
	public static void main(String args[]) {
        new Overloading();
    }
}
