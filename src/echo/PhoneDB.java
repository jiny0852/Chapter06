package echo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PhoneDB {

   public static void main(String[] args)throws IOException {
      
      InputStream in = new FileInputStream("C:\\javaStudy\\PhoneDB.txt");
      InputStreamReader isr = new InputStreamReader(in,"UTF-8");
      
      BufferedReader br = new BufferedReader(isr);
      
      List<Phone>PhoneList = new ArrayList<Phone>();
      
      while(true) {
         String str = br.readLine();
         
         if(str==null) {
            break;
         }
         String[] ph = str.split(",");
      System.out.println(str);
   
      
      }
      
      br.close();
   }

}
