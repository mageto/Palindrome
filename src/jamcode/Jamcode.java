
package jamcode;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.lang.Math;
import java.text.DecimalFormat;

public class Jamcode {

    public static boolean checkPal(String input)
        {
            int [] count = new int[26];
            for( int i = 0; i < input.length(); i++ )
                {
                char ch = input.charAt(i);
                count[ch-'a']++;
                }
            int odd = 0;
            for( int cnt:count )
                {
                if( odd > 1)
                return false;
                if( cnt%2 == 1 )
                odd++;
            }
        return true;
        }        
    
    public static void main(String[] args) throws IOException
    {     
        File file = new File("key_bag.txt");
        Scanner sc = new Scanner(file);
        String line = null;
        
//        String input = sc.nextLine();
        while ((line = sc.nextLine()) != null) {
        String[] values = line.split(".,.");
        
                    ArrayList<Integer> n = new ArrayList<Integer>();
                   int d = 0;
        for (int i=0; i<values.length; i++)
            {
                if(checkPal(values[i])){
                    n.add(i); 
                    d++;
             }
                              
            }
        float b = n.size();
        float c = values.length;
        float a = c-b;
        double  prob = a/c;
        DecimalFormat df = new DecimalFormat("#.##########");
        
        System.out.println(df.format(prob));
        }
    }
    
}
