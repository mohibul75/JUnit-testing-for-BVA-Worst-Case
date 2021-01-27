import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.junit.Test;

public class GradeCalculatorTest {

	public static final String delimiter = ",";

	@Test
	public void testGetGrade() throws Exception {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Test Case ID,mid,ct,final,attandance,expexted,actualValue,Result\n");
		GradeCalculator gc = new GradeCalculator();

		File file = new File("C:\\Users\\Dell\\Downloads\\SoftwareTestingAssignment-1\\src\\worstBVC.csv");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		String[] tempArr;
		line = br.readLine();
		int count=1;
		while ((line = br.readLine()) != null) {
			tempArr = line.split(delimiter);
			String grade = gc.getGrade(Integer.parseInt(tempArr[1]),Integer.parseInt(tempArr[2]),Integer.parseInt(tempArr[3]),Integer.parseInt(tempArr[4]));
			String expected = "C";
		//	System.out.println(grade);
		//	System.out.println(grade.equals(expected));
			stringBuilder.append(String.valueOf(count)+","+ tempArr[1]+","+tempArr[2]+","+tempArr[3]+","+tempArr[4]+","+expected+","+grade+","+grade.equals(expected)+"\n");
			//assertEquals(expected, grade);
			count++;
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CSVWriter(stringBuilder.toString(),"GradeCalculatorMetho1.csv");

	}

	@Test
	public void testGetGPA() {
		GradeCalculator gc = new GradeCalculator();
		String []str= {"A+","A","B","C","D","F"};
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Test Case ID,Grade,expexted,actualValue,Result\n");
		int i;
		
		for(i=0; i<6; i++) {
			double gpa =gc.getGPA(str[i]);
			double expected =4.00;
			String res="FALSE";
			if( (expected-gpa)<=0.1) res="TRUE";
			stringBuilder.append(String.valueOf(i+1)+","+str[i]+","+String.valueOf(gpa)+","+String.valueOf(expected)+","+res+"\n");
		}
		CSVWriter(stringBuilder.toString(),"GradeCalculatorMetho2.csv");
		
	}
	
	
	
	
	   public static void CSVWriter(String str, String pathname)
	    {
	        try (PrintWriter writer = new PrintWriter(new File(pathname))) {

	            writer.write(str);

	            System.out.println("done!");

	        } catch (FileNotFoundException e) {
	            System.out.println(e.getMessage());
	        }
	    }

}
