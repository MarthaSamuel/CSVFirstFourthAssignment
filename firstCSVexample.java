
/**this code will show how to access a comma seperated file called foods.csv downloaded
 * from dukelearntoprogram
 *
 *N7a
 * @author Dimgba Martha Otisi 
 * @2020,January
 * @martha_samuel_
 */
import edu.duke.*;
import org.apache.commons.csv.*;//this is the library for csv
public class firstCSVexample {
//method
public void readFood(){
    //because the new FR is empty when we run it,we will have a dialog box to choose file from
    FileResource fr=new FileResource();
    //this is a csv parser class.we get the csv parser from a fr object
    CSVParser parser=fr.getCSVParser();
    //we loop over the parser which is an iterable to get records one at a time.this is another class
    for(CSVRecord record:parser){
        System.out.println(record.get("Name")+"");
        System.out.println(record.get("Favorite Food")+"");
        System.out.println(record.get("Favorite Color"));
    }
}  
}
