public class Main {

    // In the Gui interface there are 3 timers, we are afraid that if we keep adding timers
    // the Gui class will become unmanageable. Implement an Observer pattern so the class FrequentEvents in Gui does not
    // need to know about timers.
    
    public static void main(String[] args) {
        Gui gui = new Gui();
    }
}
