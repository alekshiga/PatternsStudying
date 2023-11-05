package observer;

public class Main {

    public static void main(String[] args) {

        TheTimes timesJournal = new TheTimes();

        Subscriber subscriber1 = new Subscriber("Subscriber 1");
        Subscriber subscriber2 = new Subscriber("Subscriber 2");

        timesJournal.addObserver(subscriber1);
        timesJournal.addObserver(subscriber2);

        timesJournal.notifyObservers("Breaking News");
    }

}
