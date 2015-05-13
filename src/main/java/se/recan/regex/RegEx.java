package se.recan.regex;

import java.util.regex.*;
import se.recan.utils.IOutil;

//http://www.vogella.com/tutorials/JavaRegularExpressions/article.html
public class RegEx {

    public RegEx() {
        // en till tre siffror, ordet matchad eller matchade, ordet annons eller annonser
        String regex = "Du har \\d{1,3} matchad\\w* annons\\w*";
        String input = "Du har 112 matchade annonser";
        result(regex, input);

        input = "Du har 11 matchade annonser";
        result(regex, input);

        input = "Du har 1 matchad annons";
        result(regex, input);

        // Case insensitive, flera eller inga tecken, flera eller inga whitespace
        regex = "(?i)\\w*\\s*fullständig";
        input = "Fullständig";
        result(regex, input);

        input = "KANSKE fullständig";
        result(regex, input);

        input = "Inte fullständig";
        result(regex, input);

        regex = "\\w*\\s*Telefontider\\s*\\w*";
        input = "0771-60 00 00\nTelefontider\nmåndag-fredag 8.00-18.00";
        result(regex, input);
    }

    private void result(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        boolean found = false;

        while (matcher.find()) {
            System.out.println("\tLook for: " + regex + ", Found : " + matcher.group() + "\tstarting at: " + matcher.start() + "\tending at: " + matcher.end());
            found = true;
        }
        System.out.println("\t---------------------------------------");
        if (!found) {
            System.out.println("\tLook for: " + regex + ", No match found.");
            System.out.println("\t---------------------------------------");
        }

        boolean b = Pattern.matches(regex, input);
        System.out.println(b);
    }
    
    private void removeA() {
        String txt = "Adress till statist är <a href='http:/www.statist.se'>Statist</a>. Du kan också nå oss på <a href='http://www.extra.co.uk>Extra</a> som är vår engelska sajt.";
//	    String regex = "<a.*>.+[^\\s]";
//String regex = "tatis[^\\s]";
// String regex = "tatis[^\\s]";
// 	    Pattern pattern = Pattern.compile(regex);
// 	    Matcher matcher = pattern.matcher(txt);
//         if(matcher.find()) {
//         System.out.println("\tLook for: " + regex + ", Found : " + matcher.group() + "\tstarting at: " + matcher.start() + "\tending at: " + matcher.end());
//         }
// 
//         System.out.println(txt.replaceAll(regex, ""));

        String regex = "</a>";
        Pattern pattern = Pattern.compile(regex);

        String[] split = pattern.split(txt);

        for (int i = 0; i < split.length; i++) {
            String res = split[i];
            res = res.replaceAll("<a.*>", "");
            IOutil.print(res);
        }
    }

    /**
     * Return 3 lines of text. Remove all <br> and <b>.
     *
     * First split String at either point(.) or exclamation mark(!). Then remove
     * all linebreaks as there might be several in a row. Put one point(.) at
     * end of every line. Finally put ONE linebreak at the end of every line
     * except the last one.
     *
     * @todo E-mail addresses, web addresses (and more) contains points. In that
     * case the split will be done in a incorrect maner.
     * @param text String
     * @return String
     */
    private void clean() {
        String regex = "[.!]";
        String txt = "Tack för din ansökan om att bli kund.<br>"
                + "För att kunna godkänna dig som kund behöver vi veta mer om ert företag. Maila oss kort information om er verksamhet och hemsida! Viktigast av allt<br> "
                + "<a href='#'>Adress</a> "
                + "<b>Vad ni behöver statisterna till för typ av jobb.</b><br><br>"
                + "Vi godkänner ej kunder som anger Hotmail, Gmail eller Yahoo mail.<br>";
        //System.out.println(txt);

//         txt = txt.replaceAll("<", "");
        txt = txt.replaceAll("<br>", "");
        txt = txt.trim();
//         txt = txt.replaceAll("</", "");
//         txt = txt.replaceAll(">", "");

        // Compile regex String to a pattern.
        Pattern pattern = Pattern.compile(regex);

        // Use pattern to split.
        String[] split = pattern.split(txt);
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < split.length; i++) {
//            buffer.append(split[i].replaceAll("<br>", ""));
            buffer.append(i + ". ");
            buffer.append(split[i].trim());
            //buffer.append(".");
            //if(i < 2) { buffer.append("<br>"); }
            buffer.append("\n");
        }
        String res = buffer.toString().replaceAll("<b>", " ");

        IOutil.print(res);
    }

    public static void main(String[] args) {
        new RegEx();
    }
}
