import java.util.Scanner;

/**
 *
 * Tests DB operations implemented using a linked list
 *
 * Run with:
 *    $ java LCityDBTest < input_file_name
 */

public class LCityDBTest {
   public static void main (String[] args) {
      LCityDB<City> cityDB = new LCityDB<City>();


       Scanner sc = new Scanner (System.in);

       while(sc.hasNext()) {
          String data = sc.nextLine();
          String[] token = data.split(",");
          String name = token[0];
          String state = token[1];
          double lat = Double.valueOf(token[2]);
          double lon = Double.valueOf(token[3]);
          Integer pop = Integer.valueOf(token[4]);
          City city = new City(name, state, lat, lon, pop);
          cityDB.insert(city);

       }

      System.out.println(cityDB.search("Abbs Valley","VA"));
      System.out.println(cityDB.search(39.4629,-76.2754));

   }
}
