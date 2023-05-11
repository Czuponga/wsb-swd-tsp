package org.example;

import java.util.ArrayList;
import java.util.List;

public class CitiesGenerator {
    public static List<City> generateCities() {
        final List<City> cities = new ArrayList<>();

        City gdynia = new City("Gdynia", 54.3109, 18.3222);
        City elblag = new City("Elbląg", 54.0930, 19.2410);
        City olsztyn = new City("Olsztyn", 53.4623, 20.2834);
        City bialystok = new City("Białystok", 53.0807, 23.0844);
        City warszawa = new City("Warszawa", 53.1356, 21.0030);
        City plock = new City("Płock", 53.3250, 19.4200);
        City lodz = new City("Łódź", 51.4636, 19.2717);
        City siedlce = new City("Siedlce", 53.1000, 22.1630);
        City lublin = new City("Lublin", 51.1500, 23.3400);
        City kilece = new City("Kielce", 50.5227, 20.3800);
        City rzeszow = new City("Rzeszów", 50.0201, 22.0017);
        City krakow = new City("Kraków", 50.0341, 19.5618);
        City czestochowa = new City("Częstochowa", 50.4904, 19.0818);
        City opole = new City("Opole", 50.3953, 17.5537);
        City kalisz = new City("Kalisz", 51.4545, 18.0523);
        City konin = new City("Konin", 52.1339, 18.1541);
        City leszno = new City("Leszno", 51.5045, 16.3450);
        City zielonaGora = new City("Zielona Góra", 51.5623, 15.3018);
        City poznan = new City("Poznań", 53.2430, 16.5603);
        City pila = new City("Piła", 53.0851, 16.4351);
        City szczecin = new City("Szczecin", 53.2617, 14.3232);
        City szczecinek = new City("Szczecinek", 53.4315, 16.4110);
        City bydgoszcz = new City("Bydgoszcz", 53.0730, 18.0040);

        cities.add(gdynia);
        cities.add(elblag);
        cities.add(olsztyn);
        cities.add(bialystok);
        cities.add(warszawa);
        cities.add(plock);
        cities.add(lodz);
        cities.add(siedlce);
        cities.add(lublin);
        cities.add(kilece);
        cities.add(rzeszow);
        cities.add(krakow);
        cities.add(czestochowa);
        cities.add(opole);
        cities.add(kalisz);
        cities.add(konin);
        cities.add(leszno);
        cities.add(zielonaGora);
        cities.add(poznan);
        cities.add(pila);
        cities.add(szczecin);
        cities.add(szczecinek);
        cities.add(bydgoszcz);

        return cities;
    }
}
