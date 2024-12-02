public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String lower = "";
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90){
                ch = (char)(str.charAt(i) + 32);
            }
            lower += ch;
        }
        return lower;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        String str = "";

        if (n2 == 0){
            return true;
        }

        if (n1 < n2){
            return false;
        }

        for (int i = 0; i <= n1 - n2; i++){
            int j;
            for (j = 0; j < n2; j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    break; 
                }
            }
            if (j == n2) {
                return true; 
            }
        }
        return false; 
    }
}
