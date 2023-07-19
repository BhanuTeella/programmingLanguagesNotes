public class strings {
    public static void main(String[] args){
        //String is a built-in class in java
        //String is immutable in java
        //String is a sequence of characters. But it is not an array of characters
        
        //String declaration
        String name="b";
        System.out.println("hello!"+name);

        //Accessing individual characters
        System.out.println(name.charAt(0));//prints h

        //Concatenating strings
        String str1="Hello";
        String str2="World";
        String str3=str1+" "+str2;
        System.out.println(str3);

    }
}
