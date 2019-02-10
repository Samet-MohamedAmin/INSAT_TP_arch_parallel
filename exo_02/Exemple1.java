
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exemple1 extends Thread {
    private String Salutation;
    private int attente;
    private int number;
    static PrintWriter pw;

    public Exemple1(String Salutation) {
        this.Salutation = Salutation;
    }

    public void run() {
        for (int i = 1; i < 1000; i++)
            Exemple1.pw.println("THREAD " + i + ": " + Salutation);
    }

    public static void main(String args[]) {

        System.out.println("MAIN: BEGIN");

        try {
            FileWriter file = new FileWriter("log.txt");
            Exemple1.pw = new PrintWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Exemple1 thread1, thread2, thread3;
        thread1 = new Exemple1("Bonjour ");
        thread2 = new Exemple1("Bonsoir ");
        thread3 = new Exemple1("à demain ");


        Exemple1.pw.println("MAIN: Je suis le main :)");

        thread1.start();
        thread2.start();
        thread3.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.err.println("INTERRUPTED EXCEPTION");
        }
        Exemple1.pw.println("MAIN: main terminé");
        System.out.println("MAIN: END");

        System.exit(0);
    }
}
