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
        ACityDB cityDB = new ACityDB(10); // create a DB

        Scanner sc = new Scanner (System.in);
        while(sc.hasNext()) {
            String data = sc.nextLine();
            String[] token = data.split(",");
            String city = token[0];
            String state = token[1];
            Float lon = Float.valueOf(token[2]);
            Float lat = Float.valueOf(token[3]);
            Integer pop = Integer.valueOf(token[4]);
            cityDB.insert(city,state,lon,lat,pop);

        }

        System.out.println(cityDB.test());
        cityDB.insert("a","b",1.0f,2.0f,2);
        System.out.println(cityDB.test());
        System.out.println(cityDB.search("NYC","ABC"));
        System.out.println(cityDB.search(1.5f,2f));
        cityDB.delete(1.5f,2f);
        System.out.println(cityDB.search("AC","SA"));



        // For each line of the input file
        //   get city name, state, coordinates, and population
        //   using these data, insert a new record into DB

        // Do other operations on DB
    }
}