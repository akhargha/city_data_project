import java.util.Scanner;

/**
 *
 * Tests DB operations implemented using a linked list
 *
 * Run with:
 *    $ java LCityDBTest < input_file_name
 * @Author: Anupam Khargharia
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

      System.out.println("Search: ");
      long start = System.currentTimeMillis();
      System.out.println(cityDB.search("Adams", "OR"));
      long end = System.currentTimeMillis();
      System.out.println("Elapsed Time in milli seconds: " + (end-start));
      System.out.println(" ");

      System.out.println("Search: ");
      start = System.currentTimeMillis();
      System.out.println(cityDB.search(45.7662,-118.5643));
      end = System.currentTimeMillis();
      System.out.println("Elapsed Time in milli seconds: " + (end-start));
      System.out.println(" ");

      System.out.println("Delete: ");
      start = System.currentTimeMillis();
      cityDB.delete("Adams","OR");
      end = System.currentTimeMillis();
      System.out.println("Elapsed Time in milli seconds: " + (end-start));
      System.out.println(" ");

      System.out.println("Delete: ");
      start = System.currentTimeMillis();
      System.out.println(cityDB.search("Adams", "OR"));
      end = System.currentTimeMillis();
      System.out.println("Elapsed Time in milli seconds: " + (end-start));
      System.out.println(" ");

      System.out.println("Print All State: ");
      start = System.currentTimeMillis();
      cityDB.printAllState("RI");
      end = System.currentTimeMillis();
      System.out.println("Elapsed Time in milli seconds: " + (end-start));
      System.out.println(" ");

      System.out.println("Print All Distance: ");
      start = System.currentTimeMillis();
      cityDB.printAllDistance(39.0, -76.0, 0.5);
      end = System.currentTimeMillis();
      System.out.println("Elapsed Time in milli seconds: " + (end-start));
      System.out.println(" ");

      System.out.println("Print All Population: ");
      start = System.currentTimeMillis();
      cityDB.printAllPopulation(5000000, 20000000);
      end = System.currentTimeMillis();
      System.out.println("Elapsed Time in milli seconds: " + (end-start));
      System.out.println(" ");

   }
}
