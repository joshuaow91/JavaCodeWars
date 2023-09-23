
    public class RemoveChars {
        public static String remove(String str) {
            if (str == null || str.length() < 2) {
                return "Invalid";
            }
            return str.substring(1, str.length() - 1);
        }
    }


//    Your goal is to create a function that removes the first and last characters of a string.
//    You're given one parameter, the original string. You don't have to worry with strings
//    with less than two characters.