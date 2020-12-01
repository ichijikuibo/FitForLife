package fitforlife;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import com.cc.fitforlife.FitForLife;

public class CalculationTest {

	@Test
	public void testCalculateCost() {
		List<String> data = openCSV("src/test/resources/testdata.csv");
		for(String test:data)
		{
			String[] testData = test.split(",");
			double result1 = FitForLife.calculateCost(Integer.parseInt(testData[1]), Integer.parseInt(testData[0]), 40, Integer.parseInt(testData[2]), testData[3].toLowerCase().equals("yes"));
			double expected1 = Double.parseDouble(testData[4]);
			double result2 = FitForLife.calculateMonthlyCost(result1, Integer.parseInt(testData[2]));
			double expected2 = Double.parseDouble(testData[5]);
			assertEquals(expected1,result1,0.01);
			assertEquals(expected2,result2,0.01);
		}
	}


	public static List<String> openCSV(String path)
	{
		List<String> content = new ArrayList<String>();
		Scanner file;
		try {
			file = new Scanner(new File(path));
		} catch (FileNotFoundException e) {
			return null;
		}
		boolean reading = true;
		do
		{
			String s = file.nextLine();
			content.add(s);
			if(!file.hasNextLine())reading=false;
			
		}while(reading);
		file.close();
		return content;
	}	
}
