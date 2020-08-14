package by.epam.student.khvesko.module04.task8;

public class Main {
    public static void main(String[] args) {
        Address[] address = new Address[5];
        address[0] = new Address("Belarus", "Minsk");
        address[1] = new Address("Russia", "Moscow");
        address[2] = new Address("USA", "New York");
        address[3] = new Address("Belgium", "Brussels");
        address[4] = new Address("Belarus", "Soligorsk");

        Customer[] cust = new Customer[5];

        cust[0] = new Customer(01, "Anna", address[0], "0088 3338 8974 2344", "MC 5675844");
        cust[1] = new Customer(02, "Alex", address[1], "3444 5893 0001 2323", "MC 4647700");
        cust[2] = new Customer(03, "Monika", address[2], "1331 2344 4998 0400", "MC 5644332");
        cust[3] = new Customer(04, "Yana", address[3], "1818 0543 4554 9682", "MC 3545587");
        cust[4] = new Customer(05, "Katya", address[4], "8322 1311 0479 8765", "MC 5112332");

        for (int i = 0; i < cust.length; i++) {
            cust[i].show();
        }
    }
}
