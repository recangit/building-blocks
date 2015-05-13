package se.recan.primitiver;

import se.recan.utils.IOutil;

/** 
 * http://java.sun.com/docs/books/jls/second_edition/html/typesValues.doc.html
 * Created: 2010-11-08
 * Last Modified: 2010-11-08
 * @author Anders Recksén (anders[at]recksen[dot]se)
 */
 
public class Primitiver {

    private boolean bol;
    private char c;
    private byte b;
    private short s;
    private int i;
    private long l;
    private float f;
    private double d;
    
    public Primitiver() {
    	IOutil.info(this);
    	
        System.out.println("boolean " + b);
        System.out.println("char " + c);
        System.out.println("byte " + b);
        System.out.println("short " + s);
        System.out.println("int " + i);
        System.out.println("long " + l);
        System.out.println("float " + f);
        System.out.println("double " + d);
        // Literaler är de värden vi tilldelar primitiver eller associationer.
        
        // Automatisk typkonvertering (arithmetic promotion) sker när man utför en aritmetisk operation med operander av olika typ. Den typ med minst talområde konverteras automatiskt till ett större talområde: byte -> short -> char -> int -> long -> float -> double.
        
        // De 8 primitiverna
        // boolean och char samt de resterande som beskriver numerisk data
        // char 16 bitar
        // byte, 8 bitar, -128 till 127
        // short, 16 bitar, -32 768 till 32 767
        // int,  32 bitar, -2 147 483 648 till 2 147 483 647
        // long, 64 bitar, -9 223 372 036 854 775 808 till 9 223 372 036 854 775 807
        // float, 32 bitar, 7 siffrors noggranhet åt båda håll
        // double 64 bitar, 15 siffrors noggranhet åt båda håll
        // När dessa blandas i matematiska operationer blir resultatet i det
        // högsta ingående värde. int + double = double.
        
        // Heltalsliteraler är hela tal.
        // Reela literater är decimaltal.
        
        // Operationer utförs före tilldelning.
        // int x = 0;
        // int y = 3;
        // x = y++;
        // Värdet av x är 3, y är 4.
        
        // int x = 0; int y = 4 % x ? (Dividera int med 0 = Runtime Exception, dividera float med 0 = NaN)
        
        // int i - long l; Resultatet av detta skall vara en long. På engelska: int är först PROMOTED till en long.
        // Resultatet är alltid MINST en int. byte + short = int.
        
        // Hur ser jag skillnad på Literalerna double och float? (Alla floating points literals anses vara doubles)
    }
    
    // Denna metod tar numeriska argument int och lägre. Det går alltså att skicka in en float men inte en long.
    // Detta beror på att automatisk typomvandling kan ske när den är ofarlig. Med detta menas att ingen 
    // förvanskning kan ske, argumentet ryms i mottagaren.
    // Ofarligt är från kortare till längre och från heltal till reeltyp.
    // Vid farlig typomvandling används en castning, alltså en explicit typomvandling.
    // long l = 100;
    // printDigit((int)l);
    // Värden som är för stora för att passa i den castade variabeln snurrar till sitt lägsta värde.
    // int i = 128;
    // byte b = (byte)i;
    // Eftersom högsta positiva värde för en byte är 127 blir detta -128.
    // Sätter vi i till 256 blir b 0.
    private void printDigit(int numb) { System.out.println("Digit = " + numb); }
    
    private void printMinMax() {
        System.out.println("Byte: " + Byte.MIN_VALUE + " t.o.m " + Byte.MIN_VALUE);
        System.out.println("Short: " + Short.MIN_VALUE + " t.o.m " + Short.MIN_VALUE);
        System.out.println("Integer: " + Integer.MIN_VALUE + " t.o.m " + Integer.MIN_VALUE);
        System.out.println("Long: " + Long.MIN_VALUE + " t.o.m " + Long.MIN_VALUE);
        System.out.println("Float: " + Float.MIN_VALUE + " t.o.m " + Float.MIN_VALUE);
        System.out.println("Double: " + Double.MIN_VALUE + " t.o.m " + Double.MIN_VALUE);
    }
    
	public static void main(String args[]) {
        new Primitiver();
        //printMinMax();
    }
}