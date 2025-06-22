import java.lang.*;
public class first_code {
    public static void main (String[] args){
        String s = "Scaler\nAcademy";
        String output = unEscapeString(s);
        System.out.println(output);
    }
    public static String unEscapeString(String s){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++)
            switch (s.charAt(i)){
                case '\n': sb.append("\\n"); break;
                case '\t': sb.append("\\t"); break;
                // ... rest of escape characters
                default: sb.append(s.charAt(i));
            }
        return sb.toString();
    }
}
