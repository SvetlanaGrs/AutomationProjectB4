package io.loop.test.day8;

public class T000_singleton_pattern_example {
    // private constructor to prevent external instantiation //it will prevent creating an instance of an object from a class
    private T000_singleton_pattern_example (){}
        private static String word;

    //public getter
    public static String getWord(){
        if(word==null){
            System.out.println("First time calling, object is null and assigning now");
            word="driver";
        }else{
            System.out.println("Word is already assigned and has value");
        }
        return word;
    }
}
