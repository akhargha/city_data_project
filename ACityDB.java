class ACityDB{

    private City[] cities;
    private int size;

    public ACityDB(int cap){
        cities = new City[cap];
        size = 0;
    }

    public void insert (String name, String state, float longitude, float latitude, int population){
        City city = new City (name,state,longitude,latitude,population);
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

    public void delete(Float longitude, Float latitude){
        for (int i = 0; i < size; i++) {
            if (Float.compare(cities[i].getLong(),longitude)==0) {
                if (Float.compare(cities[i].getLat(),latitude)==0){
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

    public City search(Float longitude, Float latitude){
        for (int i = 0; i < size; i++) {
            if (Float.compare(cities[i].getLong(),longitude)==0) {
                if (Float.compare(cities[i].getLat(),latitude)==0){
                    return cities[i];
                }
            }
        }
        return null;
    }

    public City test(){
        return cities[1];
    }

}