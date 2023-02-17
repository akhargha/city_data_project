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

   public City(String name, String state, float longitude, float latitude, int population) {
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

   public float getLong(){
      return longitude;
   }

   public float getLat(){
      return latitude;
   }

   public int getPop() {
      return population;
   }

   public String toString(){
      return name + "," + state + "," + longitude + "," + latitude + "," + population;
   }



   // ANY METHODS RELATED TO THIS CLASS SHOULD GO HERE.
}
