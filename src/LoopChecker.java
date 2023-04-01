public class LoopChecker implements Checker {
    public static final String ALLOWED_CHARACTERS = "abcdifghijklmnopqrstuvwxyzABCDIFGHIJKLMNOPQRSTUVWXYZ0123456789_";

    @Override
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        for (char symbol : chars) {
            if (!ALLOWED_CHARACTERS.contains(Character.toString(symbol))) {
                return false;
            }
        }
        return true;
    }
}

