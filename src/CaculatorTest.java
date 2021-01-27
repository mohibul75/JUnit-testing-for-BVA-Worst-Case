import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.junit.Test;

public class CaculatorTest {
	public static final String delimiter = ",";

	@Test
	public void testAddIntInt() throws Exception {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Test Case ID,a,b,expexted,actualValue,Result\n");
		Caculator gc = new Caculator();

		File file = new File("C:\\Users\\Dell\\Downloads\\SoftwareTestingAssignment-1\\src\\WorstCase.csv");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		String[] tempArr;
		line = br.readLine();
		int count=1;
		while ((line = br.readLine()) != null) {
			tempArr = line.split(delimiter);
			int grade = gc.add(Integer.parseInt(tempArr[1]),Integer.parseInt(tempArr[2]));
			int expected = 30 ;
			String res="False";
			if(grade==expected) res="TRUE";
			stringBuilder.append(String.valueOf(count)+","+ tempArr[1]+","+tempArr[2]+","+String.valueOf(expected)+","+String.valueOf(grade)+","+res+"\n");
			//assertEquals(expected, grade);
			count++;
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CSVWriter(stringBuilder.toString(),"CalculatorMethoAdd.csv");
	}

	@Test
	public void testAddIntIntInt() throws Exception {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Test Case ID,a,b,c,expexted,actualValue,Result\n");
		Caculator gc = new Caculator();

		File file = new File("C:\\Users\\Dell\\Downloads\\SoftwareTestingAssignment-1\\src\\WorstCase2.csv");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		String[] tempArr;
		line = br.readLine();
		int count=1;
		while ((line = br.readLine()) != null) {
			tempArr = line.split(delimiter);
			int grade = gc.add(Integer.parseInt(tempArr[1]),Integer.parseInt(tempArr[2]),Integer.parseInt(tempArr[3]));
			int expected = 30 ;
			String res="False";
			if(grade==expected) res="TRUE";
			stringBuilder.append(String.valueOf(count)+","+ tempArr[1]+","+tempArr[2]+","+tempArr[2]+","+String.valueOf(expected)+","+String.valueOf(grade)+","+res+"\n");
			//assertEquals(expected, grade);
			count++;
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CSVWriter(stringBuilder.toString(),"CalculatorMethoAddthreeInt.csv");
	}

	@Test
	public void testAddListOfInteger() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSubtract() throws Exception {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Test Case ID,a,b,expexted,actualValue,Result\n");
		Caculator gc = new Caculator();

		File file = new File("C:\\Users\\Dell\\Downloads\\SoftwareTestingAssignment-1\\src\\WorstCase.csv");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		String[] tempArr;
		line = br.readLine();
		int count=1;
		while ((line = br.readLine()) != null) {
			tempArr = line.split(delimiter);
			int grade = gc.subtract(Integer.parseInt(tempArr[1]),Integer.parseInt(tempArr[2]));
			int expected = 30 ;
			String res="False";
			if(grade==expected) res="TRUE";
			stringBuilder.append(String.valueOf(count)+","+ tempArr[1]+","+tempArr[2]+","+String.valueOf(expected)+","+String.valueOf(grade)+","+res+"\n");
			//assertEquals(expected, grade);
			count++;
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CSVWriter(stringBuilder.toString(),"CalculatorMethoSubtract.csv");
	}

	@Test
	public void testDivide() throws Exception {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Test Case ID,a,b,expexted,actualValue,Result\n");
		Caculator gc = new Caculator();

		File file = new File("C:\\Users\\Dell\\Downloads\\SoftwareTestingAssignment-1\\src\\WorstCase.csv");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		String[] tempArr;
		line = br.readLine();
		int count=1;
		while ((line = br.readLine()) != null) {
			tempArr = line.split(delimiter);
			int grade = gc.divide(Integer.parseInt(tempArr[1]),Integer.parseInt(tempArr[2]));
			int expected = 30 ;
			String res="False";
			if(grade==expected) res="TRUE";
			stringBuilder.append(String.valueOf(count)+","+ tempArr[1]+","+tempArr[2]+","+String.valueOf(expected)+","+String.valueOf(grade)+","+res+"\n");
			//assertEquals(expected, grade);
			count++;
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CSVWriter(stringBuilder.toString(),"CalculatorMethodivide.csv");
	}

	@Test
	public void testMultiply() throws Exception {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Test Case ID,a,b,expexted,actualValue,Result\n");
		Caculator gc = new Caculator();

		File file = new File("C:\\Users\\Dell\\Downloads\\SoftwareTestingAssignment-1\\src\\WorstCase.csv");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		String[] tempArr;
		line = br.readLine();
		int count=1;
		while ((line = br.readLine()) != null) {
			tempArr = line.split(delimiter);
			int grade = gc.multiply(Integer.parseInt(tempArr[1]),Integer.parseInt(tempArr[2]));
			int expected = 30 ;
			String res="False";
			if(grade==expected) res="TRUE";
			stringBuilder.append(String.valueOf(count)+","+ tempArr[1]+","+tempArr[2]+","+String.valueOf(expected)+","+String.valueOf(grade)+","+res+"\n");
			//assertEquals(expected, grade);
			count++;
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CSVWriter(stringBuilder.toString(),"CalculatorMethomultiply.csv");
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
