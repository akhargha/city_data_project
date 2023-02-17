import java.util.Scanner;
/**
 *
 * Tests DB operations implemented using arrays
 *
 * Run with:
 *    $ java ACityDBTest < input_file_name
 */

public class ACityDBTest {
    public static void main (String[] args) {
        ACityDB cityDB = new ACityDB(30000); // create a DB

        Scanner sc = new Scanner (System.in);
        while(sc.hasNext()) {
            String data = sc.nextLine();
            String[] token = data.split(",");
            String city = token[0];
            String state = token[1];
            double lat = Double.valueOf(token[2]);
            double lon = Double.valueOf(token[3]);
            Integer pop = Integer.valueOf(token[4]);

            cityDB.insert(city,state,lat,lon,pop);

        }

        cityDB.printAllDistance(39.0,-76.0,5);
        cityDB.printAllPopulation(10,50);




        // For each line of the input file
        //   get city name, state, coordinates, and population
        //   using these data, insert a new record into DB

        // Do other operations on DB
    }
}