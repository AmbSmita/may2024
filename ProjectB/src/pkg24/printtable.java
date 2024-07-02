package pkg24;

public class printtable {
	public static void main(String[] args) {
        String[][] table = {
            {"Name", "Age", "City"},
            {"Alice", "25", "New York"},
            {"Bob", "30", "Chicago"},
            {"Carol", "22", "Los Angeles"}
        };

        // Print table headers
        System.out.format("%-15s%-10s%-15s%n", table[0]);

        // Print table rows
        for (int i = 1; i < table.length; i++) {
            System.out.format("%-15s%-10s%-15s%n", table[i]);
        }
    }
}
