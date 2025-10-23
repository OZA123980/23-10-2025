package Array;

public class PelajaranArray {
    public static void main(String[] args) {
        String[] pelajaran = { "Matematika", "Bahasa Indonesia", "Bahasa Inggris", "Fisika", "Kimia", "Biologi" };

        for (int i = 0; i < pelajaran.length; i++) {
            System.out.println("Pelajaran ke-" + (i + 1) + ": " + pelajaran[i]);
        }
    }
}
