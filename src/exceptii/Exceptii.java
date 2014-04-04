package exceptii;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptii {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 
		try {
			getValue("1");
		} catch (NumberFormatException e) { 
			System.out.println("NumberFormatException");
		} catch (FileNotFoundException e) { 
			System.out.println("FileNotFoundException");
		}catch (Exception e) {
			System.out.println("exceptie ratata");
		}finally{
			System.out.println("finally");
		}
		 
		 
	}
	
	public static Integer getValue(String a) throws NumberFormatException, FileNotFoundException, Exception{
		 Integer r;
		 boolean v = true;
		try{ 
			FileInputStream in = new FileInputStream(new File("text.txt"));
			r =  new Integer(a);
			}catch(NumberFormatException e) {
				 throw e;
			}
		
		if(v)
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				throw e;
			}
		
		 return r;
		
	}

}
