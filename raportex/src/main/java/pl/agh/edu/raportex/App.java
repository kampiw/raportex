package pl.agh.edu.raportex;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {

  	 	
 * 	//TEST DO EXPORT CSV

    	ArrayList<String> list = new ArrayList<>();
		list.add("dasfasdfasdfads");
		list.add("afdasdfasdfasdf");
		String savePath = "C:\\Test\\dupa.csv";
		ExportCSV exp= new ExportCSV(list,savePath);
    	//Test Do export CSV end
    	
    	UserInput ui = new UserInput();
		ui.readPath("v0.1");
		int choice = ui.readReportChoice();*/
		
    	
    	//Test treeExplorer


    }
}
