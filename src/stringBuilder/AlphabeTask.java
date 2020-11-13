package stringBuilder;

public class AlphabeTask {
    public static void main(String[] args) {
        // Create the alphabet by using StringBuilder
        StringBuilder sb=new StringBuilder();
        for (char i = 'a'; i <='z' ; i++) {
            sb.append(i);
        }
        System.out.println(sb);

        // Create a method reverseStringBuilder
        // Return type is String, parameter is StringBuilder
        // Reverse the stringbuilder
        // convert to String
    }
}
