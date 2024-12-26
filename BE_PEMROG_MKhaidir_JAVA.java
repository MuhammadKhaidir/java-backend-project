package Car;
import java.util.Scanner;
public class BE_PEMROG_MKhaidir_JAVA {
	public class MemoryAllocation {
		
		//Nama		: Muhammad Khaidir
		//Prodi		: Manajemen Informatika
		//Fakultas	: Ilmu Komputer
		//Univ		: Universitas Sriwijaya

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Membaca jumlah test case
	        int t = scanner.nextInt();
	        
	        // Iterasi setiap test case
	        while (t-- > 0) {
	            int n = scanner.nextInt();
	            boolean found = false;

	            // Mencoba semua kombinasi bit (3x, 5y, 7z)
	            for (int x = 0; x <= n / 3; x++) {
	                for (int y = 0; y <= n / 5; y++) {
	                    for (int z = 0; z <= n / 7; z++) {
	                        if (3 * x + 5 * y + 7 * z == n) {
	                            // Jika ditemukan kombinasi valid, cetak jumlah bit
	                            System.out.println(x + y + z);
	                            found = true;
	                            break;
	                        }
	                    }
	                    if (found) break;
	                }
	                if (found) break;
	            }

	            // Jika tidak ditemukan kombinasi, cetak "TIDAK"
	            if (!found) {
	                System.out.println("TIDAK");
	            }
	        }

	        scanner.close();
	    }
	}}
//Penjelasan Kode:
//Input:
//Membaca jumlah test case t dan masing-masing nilai n.
//Iterasi Kombinasi:
//Mencoba semua kombinasi jumlah bit 3x + 5y + 7z untuk x, y, z dalam rentang yang sesuai.
//Validasi:
//Jika ditemukan kombinasi yang sesuai, jumlah bit ditampilkan dan keluar dari loop.
//Jika tidak ada kombinasi yang ditemukan, tampilkan "TIDAK".
//Output:
//Jumlah bit yang digunakan atau "TIDAK"
