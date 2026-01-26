import java.io.*;
import java.util.*;

public class lang705x {
    public static void main(String[] args) throws IOException 
    {
        ArrayList<Int> num = new ArrayList<int>();
        ArrayList<String[]> poem = new ArrayList<String[]>();
        Scanner r = new Scanner(new File("prog705x.txt"));
        while(r.hasNextInt())
        {
            num.add(r.nextInt());
        }
        Scanner er = new Scanner(new File("prog512h.txt"));
        while(er.hasNext())
        {
            String temp = er.nextLine();
            String[] temps = temp.split(" ");
            poem.add(temps);
        }
        

    }
}
