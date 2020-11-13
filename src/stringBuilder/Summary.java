package stringBuilder;

import java.sql.SQLOutput;

public class Summary {
    public static void main(String[] args) {
        /*
        Link
        https://docs.google.com/presentation/d/1FJxNjsimlU9ZVohMZeqY9gpMdkLNjPwob2LtdB9zPwI/edit#slide=id.p
         */
        
        /*
        Normally equals method is looking for the location of the
        elements in the java memory, if they have the same spot or not.
        But String changes(override) this method according to it's needs
        It is checking the content of the element equality
         */
        String s1="Cat";
        String s2="Cat";
        String s3=new String("Cat");

        System.out.println( s1.equals(s3));
        System.out.println( s1==s3);

        String str = "a";
        System.out.print("First location in the memory : ");
        System.out.println(str.hashCode());
        str = str.concat("b");
        System.out.print("Second location in the memory : ");
        System.out.println(str.hashCode());
        str = str.concat("c");
        System.out.print("Third location in the memory : ");
        System.out.println(str.hashCode());





        // StringBuilder
        System.out.println("--------------------");
        StringBuilder sb = new StringBuilder("a");
        System.out.println(sb.capacity());
        System.out.println("Memory of the stringbuilder: " + sb.hashCode());
        sb.append("b");
        System.out.println("Memory of the stringbuilder after the append: " + sb + " " + sb.hashCode());
        sb.append("c");
        System.out.println("Memory of the stringbuilder after the insertion: " + sb + " " + sb.hashCode());


        // Initialize StringBuilders
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("atlanta");
        StringBuilder sb3 = new StringBuilder(32); // by default 16
    }
}
