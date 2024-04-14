package aprill_13;

public class StringReverse {
    public static void main(String[] args) {
        String s1="Pragra";
        char[] chars=s1.toCharArray();
        for (int j=chars.length-1,i=0;i<j;i++,j--) {
           char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

            System.out.println(chars);




    }
}
