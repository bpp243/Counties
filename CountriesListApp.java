package countriesList;

import java.util.List;
import java.util.Scanner;

public class CountriesListApp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			CountriesList countriesList = new CountriesList();

			System.out.println("Welcome to the Countries List Application!");

			while (true) {
			    System.out.println("\nMenu:");
			    System.out.println("1. Display countries");
			    System.out.println("2. Add a country");
			    System.out.println("3. Exit");
			    System.out.print("Enter your choice: ");

			    int choice = scanner.nextInt();
			    scanner.nextLine(); // Consume the remaining newline

			    switch (choice) {
			        case 1:
			            List<String> countries = countriesList.getCountries();
			            if (countries.isEmpty()) {
			                System.out.println("The list is empty.");
			            } else {
			                System.out.println("Countries:");
			                for (String country : countries) {
			                    System.out.println(country);
			                }
			            }
			            break;
			        case 2:
			            System.out.print("Enter the name of the country to add: ");
			            String country = scanner.nextLine();
			            if (countriesList.getCountries().contains(country)) {
			                System.out.println(country + " already exists in the list.");
			            } else {
			                countriesList.addCountry(country);
			                System.out.println(country + " has been added.");
			            }
			            break;
			        case 3:
			            System.out.println("Exiting the program.");
			            return;
			        default:
			            System.out.println("Invalid choice. Please enter 1, 2, or 3.");
			            break;
			    }
			}
		}
    }
}
