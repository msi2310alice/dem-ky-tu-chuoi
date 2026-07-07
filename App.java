import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String chuoi = "Mei Mei";
        char kyTuNhap = input.next().charAt(0);

        int count = 0;

        for (int i = 0; i < chuoi.length(); i++){
            char kyTu = chuoi.charAt(i);
            if (Character.toLowerCase(kyTu) == Character.toLowerCase(kyTuNhap)){
                count++;
            }
        }
        System.out.println("Co "+count+" lan xuat hien của ky tu nhap tu ban phim trong chuoi cho truoc");
        
        input.close();
    }
}
