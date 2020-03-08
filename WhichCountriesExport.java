
/**
 * Write a description of WhichCountriesExport finds the countries that export 
 * given items from a csv file downloaded from 
 * 
 **N7b
 * @author Dimgba Martha Otisi 
 * @2020,January
 * @martha_samuel_
 */
import edu.duke.*;
import org.apache.commons.csv.*;

public class WhichCountriesExport {
public void listExporters(CSVParser parser,String exportOfInterest){
 //for each row in the csv
 for(CSVRecord record:parser){
     //look at the exports column of that row
     String export=record.get("Exports");
     //check if it contains export of interest
     if(export.contains(exportOfInterest));
     //if so write down the country from that row
     String country=record.get("Country");
     System.out.println(country);
    }
}
public void whoExportsCoffee(){
    FileResource fr=new FileResource();
    CSVParser parser=fr.getCSVParser();
    listExporters(parser,"coffee");
}
}
