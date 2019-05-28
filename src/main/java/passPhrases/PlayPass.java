package passPhrases;

public class PlayPass {

    public static String playPass(String passPhrase, int shift) {
        char[] chars = passPhrase.toCharArray();

        StringBuilder str = new StringBuilder();

        for (char ch : chars) {
            if (!Character.isLetter(ch)) {
                str.append((ch));
            } else {
                char c = (char) (ch + shift);
                str.append(c);
            }
        }
        return String.valueOf(str.reverse());
    }
}



