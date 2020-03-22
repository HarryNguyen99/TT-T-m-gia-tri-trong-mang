import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Trường", "Kỳ", "Kháng", "chiến", "Nhất", "Định", "Thắng", "Lợi"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên chiến sĩ: ");
        String input_name = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vị trí của chiến sĩ " + input_name + " trong danh sách Là: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Không tìm thấy chiến sĩ " + input_name + " trong danh sách.");
    }
}
