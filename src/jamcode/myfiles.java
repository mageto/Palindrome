
package jamcode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class myfiles {
       public static void myfiles() throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("key_bag.txt"));
        String line = null;

        while ((line = br.readLine()) != null) {
        String[] values = line.split(".,.");
        for (String str : values) {
            System.out.println(str);
            System.out.println(str.length());
      }
    }
    br.close();
    } 
}
