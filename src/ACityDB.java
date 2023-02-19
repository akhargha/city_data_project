/**
 * Main Database Class using Array based implementation ACityDB with methods to insert, delete, and print using constraints.
 * @Author: Anupam Khargharia
 */

import java.lang.*;
class ACityDB{

    private City[] cities;
    private int size;

    public ACityDB(int cap){
        cities = new City[cap];
        size = 0;
    }

    public void insert (String name, String state, double latitude, double longitude, int population){
        City city = new City (name,state,latitude,longitude,population);
        cities [size] = city;
        size++;
    }

    public void delete(String name, String state){
        for (int i = 0; i < size; i++) {
            if (cities[i].getCName().equals(name)) {
                if (cities[i].getSName().equals(state)){
                    for (int j = i; j < size; j++){
                        if (j!=size-1){
                            cities[j]=cities[j+1];
                        }
                    }
                    size--;
                }
            }
        }
    }

    public void delete(double latitude, double longitude){
        for (int i = 0; i < size; i++) {
            if (Double.compare(cities[i].getLong(),longitude)==0) {
                if (Double.compare(cities[i].getLat(),latitude)==0) {
                    for (int j = i; j < size; j++){
                        if (j!=size-1){
                            cities[j]=cities[j+1];
                        }
                    }
                    size--;
                }
            }
        }
    }

    public City search(String name, String state){
        for (int i = 0; i < size; i++) {
            if (cities[i].getCName().equals(name)) {
                if (cities[i].getSName().equals(state)){
                    return cities[i];
                }
            }
        }
        return null;
    }

    public City search(double latitude, double longitude){
        for (int i = 0; i < size; i++) {
            if (Double.compare(cities[i].getLong(),longitude)==0) {
                if (Double.compare(cities[i].getLat(),latitude)==0){
                    return cities[i];
                }
            }
        }
        return null;
    }

    public void printAllState(String state){
        for (int i = 0; i < size; i++){
            if (cities[i].getSName().equals(state)){
                System.out.println(cities[i].getCName());
            }
        }
    }

    public void printAllDistance(double latitude, double longitude, double distance){
        for (int i = 0; i < size; i++){
            if (cities[i].distance(latitude, cities[i].getLat(), longitude, cities[i].getLong())<=distance){
                System.out.println(cities[i]);
            }
        }
    }

    public void printAllPopulation(int from, int to){
        for (int i = 0; i < size; i++){
            if (cities[i].getPop()>=from && cities[i].getPop()<=to){
                System.out.println(cities[i]);
            }
        }
    }


}