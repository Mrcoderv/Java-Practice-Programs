public class P34StringConcatenation {
          public static void main(String[] args) {
            String Str1="Hello";
            String Str2="World!";
            //Using + operator
            System.err.println(Str1+" "+Str2);
            //using String Buffer
            StringBuffer buffer=new StringBuffer();
            buffer.append(Str1).append(" ").append(Str2);
            String resultbuffer=buffer.toString();
            System.out.println(resultbuffer);
        }
    }

