/**
*
* City database record definition
*
*/
class City {
   private String name;
   private String state;
   private double longitude;
   private double latitude;
   private int population;

   public City(String name, String state, double latitude, double longitude, int population) {
      this.name = name;
      this.state = state;
      this.longitude = longitude;
      this.latitude = latitude;
      this.population = population;
   }

   public String getCName(){
      return name;
   }

   public String getSName(){
      return state;
   }

   public double getLong(){
      return longitude;
   }

   public double getLat(){
      return latitude;
   }

   public int getPop() {
      return population;
   }

   public double distance(double latitude, double lat, double longitude, double lon){
      Double eq = Math.sqrt(Math.pow(lat - latitude,2) + Math.pow(lon - longitude,2));
      return eq;
   }
   public String toString(){
      return name + "," + state + "," + latitude + "," + longitude + "," + population;
   }



   // ANY METHODS RELATED TO THIS CLASS SHOULD GO HERE.
}
