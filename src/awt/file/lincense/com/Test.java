package awt.file.lincense.com;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;


public class Test {

	private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());

	public String test()
	{
		// TODO Auto-generated method stub
		
	      LOGGER.info("Inside of test");
		
		 String filename = "file.ser";
		 
         
	       
	        try
	        {    File temp =  new File("file.ser");
				if(temp.exists())
				{
					System.out.print(temp.exists());
					try{
					 
	           
	            FileInputStream file = new FileInputStream(filename);
	            ObjectInputStream in = new ObjectInputStream(file);
	             
	            
	            Demo object1 = (Demo)in.readObject();
	             
	            in.close();
	            file.close();
	             
				if(object1.b.equals(new SimpleDateFormat("yyyy/MM/dd").format(new Date())))
				{
				
					return "Process Complete";
				}
				else{
					return "License Expire";

				}
				}
					 catch(IOException ex)
	        {   
						 LOGGER.info("Inside/Test/IOEXception");
	            System.out.println("IOException is caught1");
	        }
	         
	        catch(ClassNotFoundException ex)
	        {
	        	 LOGGER.info("Inside/Test/ClassNotFoundException");
	            System.out.println("ClassNotFoundException is caught");
	        }
			catch(Exception e)
			{}
				}
				
				else{
						
				Demo object = new Demo(1,new SimpleDateFormat("yyyy/MM/dd"));
	            FileOutputStream file = new FileOutputStream(filename);
	            ObjectOutputStream out = new ObjectOutputStream(file);
	             
	           
	            out.writeObject(object);
	             
	            out.close();
	            file.close();
	             
	            
	            return "Click Again";
				}
			
				
	 
	        }
	         
	        catch(Exception ex)
	        {
	        	 LOGGER.info("Inside/Test/Exception");
	            System.out.println("IOException is caught2");
	        }
			return null;
			

			
			

	}

}

class Demo implements java.io.Serializable

{
    public int a;
    public String b;
 
    
    public Demo(int a, DateFormat dateFormat)
    {
		Date date = new Date();
		
        this.a = a;
        this.b = dateFormat.format(date);
    }
 
}