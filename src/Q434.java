public class Q434 {
    public int countSegments(String s) {
        s = s.trim();
        if (s.equals("")||s == null) return 0;
        return s.split("\\s++").length;
    }
}
