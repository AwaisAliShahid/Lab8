package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    public CustomList MockCityList(){
        list = new CustomList(null, new ArrayList<>());
        return list;
    }
    @Test
    public void addCityTest(){
//        list = MockCityList();
//        int expectedCountBeforeAdd =0;
//        assertEquals(expectedCountBeforeAdd, list.getCount(), "Count show");
//        City cityToAdd= new City("Edmonton", "AB");
//        list.add(cityToAdd);
//
//        int expectedCountedAfterAdd = 1;
//        assertEquals(expectedCountedAfterAdd, list.getCount(), "The City");
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }
// From chatgpt, openai, "write a java code for a function that check if my hasCity function is working as expected", 2024-10-25
    @Test
    public void hasCityTest() {
        list = MockCityList();
        City city = new City("Vancouver", "BC");
        list.addCity(city);

        // Assert the city is present
        assertEquals(true, list.hasCity(city));
    }
    // From chatgpt, openai, "write a java code for a function that check if my DeleteCity function is working as expected", 2024-10-25
    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City city = new City("Calgary", "AB");
        list.addCity(city);

        // Assert the city is present
        assertEquals(true, list.hasCity(city));

        // Remove city and check if it’s deleted
        list.deleteCity(city);
        assertEquals(false, list.hasCity(city));
    }
    // From chatgpt, openai, "write a java code for a function that check if my countCity function is working as expected", 2024-10-25
    @Test
    public void countCitiesTest() {
        list = MockCityList();
        assertEquals(0, list.countCities());

        list.addCity(new City("Toronto", "ON"));
        assertEquals(1, list.countCities());

        list.addCity(new City("Ottawa", "ON"));
        assertEquals(2, list.countCities());
    }





}
