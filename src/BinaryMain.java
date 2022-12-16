public class BinaryMain {

    public static void main(String[] args) {

        BinaryTreeDatabase tree = new BinaryTreeDatabase();

        System.out.println("");
        tree.addFlight("Flight 1");
        tree.addFlight("Flight 2");
        tree.addFlight("Flight 3");

        tree.listFlights();

        tree.deleteFlight("Flight 2");

        tree.listFlights();

        tree.searchFlight("Flight 1");
        tree.searchFlight("Flight 2");

        System.out.println("");
        tree.addDate("Flight 1", "Jan 10");
        tree.addDate("Flight 1", "Jan 11");
        tree.addDate("Flight 1", "Jan 12");
        tree.addDate("Flight 2", "Jan 5");
        tree.addDate("Flight 3", "Jan 20");
        tree.addDate("Flight 3", "Jan 21");
        tree.addDate("Flight 3", "Jan 22");
        tree.addDate("Flight 3", "Jan 23");

        System.out.println("");
        tree.deleteDate("Flight 1", "Jan 22");
        tree.deleteDate("Flight 3", "Jan 20");

        System.out.println("");
        tree.listDates("Flight 1");
        tree.listDates("Flight 3");

        System.out.println("");
        tree.addPassenger("Flight 1", "Jan 10", "Eric");
        tree.addPassenger("Flight 1", "Jan 10", "Lisa");
        tree.addPassenger("Flight 1", "Jan 10", "Jon");
        tree.addPassenger("Flight 1", "Jan 11", "Joe");
        tree.addPassenger("Flight 1", "Jan 11", "Ann");
        tree.addPassenger("Flight 1", "Jan 11", "Sam");
        tree.addPassenger("Flight 3", "Jan 21", "Kate");
        tree.addPassenger("Flight 3", "Jan 21", "Arthur");
        tree.addPassenger("Flight 3", "Jan 21", "Kevin");

        tree.listPassengers("Flight 1", "Jan 10");
        tree.listPassengers("Flight 1", "Jan 11");
        tree.listPassengers("Flight 3", "Jan 21");

        System.out.println("");
        tree.deletePassenger("Flight 1", "Jan 11", "Ann");
        tree.deletePassenger("Flight 3", "Jan 21", "Kevin");

        tree.listPassengers("Flight 1", "Jan 11");
        tree.listPassengers("Flight 3", "Jan 21");



        }
    }
