import java.util.Date;
import java.util.Deque;

public class CleanerTask extends Thread {
    private Deque<Event> deque;

    public void run() {
        while (true) {
            Date date = new Date();
            clean(date);
        }
    }

    private void clean(Date date) {
    }
}