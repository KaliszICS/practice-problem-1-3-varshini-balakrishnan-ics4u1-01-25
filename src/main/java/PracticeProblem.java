import java.io.*;
import java.util.Scanner;
public class PracticeProblem {

	public static String readFile(String filename) {
		String result = "";
		Scanner s = null;
		try {
			s = new Scanner(new BufferedReader(new FileReader(filename)));
			while (s.hasNextLine()) {
				result = result + s.nextLine() + "\n";
			}
		}
		catch (IOException e) {
			System.out.println("Error reading file");
		}
		finally {
			if (s!= null) {
				s.close();
			}
		}
		return result;

	}

	public static String backwardsReadFile(String filename) {
		String text = readFile(filename);
		String backwards = "";
		for(int i = text.length()-1; i>=0; i--) {
			backwards = backwards + text.charAt(i);
		}
		return backwards;
	}
	public static void main(String[] args) {
		System.out.println(readFile("testfile.txt"));
		System.out.println(backwardsReadFile("textfile.txt"));
	}

}
