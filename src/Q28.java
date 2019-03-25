public class Q28 {
    public int strStr(String haystack, String needle) {
        return (haystack.length() >= needle.length()) ? haystack.indexOf(needle):-1;
    }
}
