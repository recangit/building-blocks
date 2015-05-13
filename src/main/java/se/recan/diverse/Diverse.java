package se.recan.diverse;

import java.io.File;
import se.recan.utils.IOutil;

public class Diverse {

    private Diverse() {
        System.out.println(IOutil.printAsterix("break, continue, booleaner"));

        // boolsktUttryck? omSant: omFalskt
        // Detta kan nästlas i flera steg:
        int numb = 2;
        String message = numb == 1 ? "Japp, 1" : numb == 2 ? "Japp, 2" : numb == 3 ? "Japp, 3" : "Helt fel";
        System.out.println(message);

        //Mellan 2 och 8, alltså 6 siffror med början 2
        int random = 2 + (int) (6 * Math.random());
        System.out.println("Random = " + random);

        // Om villkor uppfylls skall loopen hoppa över och fortsätta.
        System.out.println("Continue, hoppar över ett värde i loopen");
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("i = " + i);
        }

        // Om villkor uppfylls skall loopen avbrytas.
        System.out.println("Break, avbryter loopen");
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("i = " + i);
        }

        // Detta avbryter en metod och måste därför ligga sist i denna metod.
        System.out.println("Return, avbryter metoden");
        for (int i = 0; i < 5; i++) {
            if (i >= 3) {
                return;
            }
            System.out.println("i = " + i);
        }

        // Glömmer alltid hur detta ser ut
        File file = new File(System.getProperty("user.dir") + File.separator + "theLog.log");
    }

    public static void main(String[] args) {
        new Diverse();
    }
}
