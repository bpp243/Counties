package countriesList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountriesList {
    private List<String> countries;

    public CountriesList() {
        countries = new ArrayList<>();
    }

    public void addCountry(String country) {
        if (!countries.contains(country)) {
            countries.add(country);
        }
    }

    public List<String> getCountries() {
        Collections.sort(countries);
        return countries;
    }
}



	


