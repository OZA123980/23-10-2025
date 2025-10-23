package Array;

public class KotaArray {
    public static void main(String[] args) {
        String[] kota = { "Jakarta", "Bandung", "Surabaya", "Medan", "Bali", "Tuban", "Malang" };

        System.out.println("7 Kota di Indonesia:");
        for (int i = 0; i < kota.length; i++) {
            System.out.println((i + 1) + ". " + kota[i]);
        }
    }
}
