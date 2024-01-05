import java.io.*;

/*
  Constructors

  FileWriter fw=new FileWriter(String fname) 
  FileWriter fw=new FileWriter(File f);
  FileWriter fw=new FileWriter(String fname,boolean append)
  FileWriter fw=new FileWriter(File f,boolean append);


  Methods

  void write(int ch) write single character
  void write(char[] charArray) write an array of character
  void write(String s) write string to the file
  void flush()
  void close()  NOTE: all these methods coming from OutputStreamWriter

*/


class FileWriterDemo
{
 public static void main(String...arg) throws IOException
 {
  // it will create a file if not present
  FileWriter fw=new FileWriter("abc.txt");
  fw.write("Bhoma");
  fw.flush();
  fw.close();
 }
}









