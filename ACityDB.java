class ACityDB{

    private City[] cities;
    private int size;

    public ACityDB(int cap){
        cities = new City[cap];
        size = 0;
    }

    public void insert (String n, String s, float lon, float lat, int pop){
        City city = new City (n,s,lon,lat,pop);
        cities [size] = city;
        size++;
    }

    public City search(String n){
        for (int i = 0; i < size; i++) {
            if (cities[i].getCName().equals(n)) {
                return cities[i];
            }
        }
        return null;
    }

    public City test(){
        return cities[1];
    }

}