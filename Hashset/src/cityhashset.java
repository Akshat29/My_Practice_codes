import java.util.HashMap;
import java.util.HashSet;

public class cityhashset {
    public static void main(String[] args){
        String [] str = {"Delhi","Goa","Haryana"};
        HashSet <String> hs = new HashSet<>();
        for (int i=0 ; i<str.length ; i++){
            hs.add(str[i]);
        }

        for(String s : hs){
            System.out.print(s+" ");
        }
        HashMap <String , Integer> hm = new HashMap<>();
        for(int i=0 ; i<str.length ; i++ ){
            hm.put(str[i],50);
        }
//        for(String ans : hm){
//            System.out.println(hm.get(ans));
//        }
        hm.put("Delhi",25);
        int val = hm.get("Haryana");
        hm.put("Haryana",val+10);

        System.out.println(hs);
        System.out.println(hm);


        hs.add("Punjab");

        for(String s : hs){
            if (hm.containsKey(s))
                System.out.println(s+" Population - "+ hm.get(s));
        }

        for(String si : hs)
            System.out.println(si+" Population - "+ hm.getOrDefault(si,1000));
}

    }

