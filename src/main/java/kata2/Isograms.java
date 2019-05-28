package kata2;

public class Isograms {

    public static boolean isIsogram(String str) {
        //str.toCharArray() creates a character array of the string
        //lastIndexOf returns the index of the last occurrence of that character
        for(char ch : str.toCharArray()){
            if(str.toLowerCase().indexOf(ch) == str.toLowerCase().lastIndexOf(ch))
                continue;
            else
                return false;
        }
        return true;
    }
}
