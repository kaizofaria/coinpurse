package coinpurse;
/**
 * A main class to create objects and connect objects together.
 * The user interface needs a reference to coin purse.
 * @author Charin Tantrakul
 */
public class Main {

    /**
     * Configure and start the application.
     * @param args not used
     */
    public static void main( String[] args ) {
    	Purse purse = new Purse(30);
    	ConsoleDialog console = new ConsoleDialog(purse);
    	console.run();
    }
}
