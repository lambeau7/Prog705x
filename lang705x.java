import java.io.*;
import java.util.*;

public class lang705x {
    public static void main(String[] args) throws IOException 
    {
        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<String[]> poem = new ArrayList<String[]>();
        String Secret = "";
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
        for(int lcv = 0; lcv < num.size(); lcv++)
        {
            int temp = num.get(lcv);
            int spt = temp/100;
            int word = (temp / 10) % 10;
            int chara = temp %10;
            String[] fah = poem.get(spt-1);
            String nah = fah[word - 1];
            Secret += nah.substring(chara - 1, chara);
        }

        System.out.println("The secret phrase is: " + Secret);
        // DIE DIE DIE DIE
        // MURDER MURDER

    }
}
