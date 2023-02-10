/**
*
* City database record definition
*
*/
class City {
   private String name;
   private String state;
   private float longitude;
   private float latitude;
   private int population;

   public City(String n, String s, float lon, float lat, int pop) {
      name = n;
      state = s;
      longitude = lon;
      latitude = lat;
      population = pop;
   }

   // ANY METHODS RELATED TO THIS CLASS SHOULD GO HERE.
}
