import java.io.*;

/*
Methods Of File Class

boolean canRead();
boolean canWrite();
boolean createNewFile();
boolean delete();
boolean exists();
String getName();
long length();
String[] list();
boolean mkdir();
*/

class FileClassDemo
{
 public static void main(String...arg) throws IOException
 {
  // creating a file in current directory

  File f=new File("Bhoma.txt");
  
  if(!f.exists())
  {
   f.createNewFile();
   System.out.println("File created...");
  }
  else
   System.out.println("File is already exists...");


  // write code to create a directory named with "bhoma123" in current working directory 
  // and create file named with demo.txt in that directory

  File f1=new File("bhoma123");
  f1.mkdir();
 

  /* Method 1
  File f2=new File("bhoma123","demo.txt");
  f2.createNewFile();

  */

  /*Method 2

   File f2=new File(f1,"demo.txt");
   f2.createNewFile();  
 */

  File f3=new File("d:/notes","demo.txt");
  // f3.createNewFile();   java.io.IOException: The system cannot find the path specified	
 }
}