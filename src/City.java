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

   public double distance(double latitude, double longitude, double lat, double lon){
      longitude = Math.toRadians(longitude);
      latitude = Math.toRadians(latitude);
      lon = Math.toRadians(lon);
      lat = Math.toRadians(lat);

      double dlon = lon - longitude;
      double dlat = lat - latitude;
      double a = Math.pow(Math.sin(dlat/2),2) + Math.cos(latitude) * Math.cos(lat) * Math.pow(Math.sin(dlon/2),2);
      double c = 2 * Math.asin(Math.sqrt(a));
      return(c*6371*(1/1.609344));
   }

   public String toString(){
      return name + "," + state + "," + latitude + "," + longitude + "," + population;
   }



   // ANY METHODS RELATED TO THIS CLASS SHOULD GO HERE.
}
