package se.recan.strings;

public class Strings {

    // Delete files in a given directory
    private void findFile() {
        String directorys[] = {"/opt/i3/i3image/import/addons/mood_base-3.1.0rc1.tar.gz",
            "/opt/i3/i3image/import/config/remote.cfg",
            "/opt/i3/i3image/import/config/keyboard.cfg",
            "/opt/i3/i3image/import/boxes/omc_file_mmb200.txt"};

        String deleteThis = null;

        for (int i = 0; i < directorys.length; i++) {
            String total = directorys[i];
            int breaker = total.lastIndexOf("/");
            String dir = total.substring(0, breaker);
            String toDelete = total.substring(breaker + 1);

            deleteThis = dir.substring(dir.lastIndexOf("/") + 1);
            if (deleteThis.equals("config")) {
                System.out.println("Delete file: " + toDelete + " in directory: " + deleteThis);
            }
        }
    }

    public static void main(String args[]) {
        new ScannerParser();
        new Formatering();
        new SubStringing();
        new ParseFormat();

    }
}
