package Array;

public class Hewan1 {
    public static void main(String[] args) {
        String[] hewan = { "Kucing", "Anjing", "Burung", "Ikan", "Kelinci" };

        System.out.println("Hewan dengan nama lebih dari 4 huruf:");
        for (int i = 0; i < hewan.length; i++) {
            if (hewan[i].length() > 4) {
                System.out.println("- " + hewan[i]);
            }
        }
    }
}
