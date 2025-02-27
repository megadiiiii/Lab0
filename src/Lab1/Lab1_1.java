//Phần I.
//Viết một chương trình Java in ra màn hình thông tin cá nhân của bạn: Họ tên, mã sinh
//viên, lớp, địa chỉ email. Thông tin cần ghi theo đúng thứ tự đó, giữa hai thông tin có đúng
//1 dấu tab ('\t'). Sau đó là 20 dòng sau đây:
//9 bottles of beer on the wall, 9 bottles of beer.
//Take one down, pass it around,
//8 bottles of beer on the wall, 8 bottles of beer.
//Take one down, pass it around,
//...
//1 bottle of beer on the wall, 1 bottle of beer.
//Take one down, pass it around,
//No more bottles of beer on the wall.


public class Lab1_1 {
    public static void main(String[] args) {

        System.out.print("Ho ten: Pham Anh Duc\t");
        System.out.print("MSV: 74DCHT22041\t");
        System.out.print("Lop: 74DCHT21\t");
        System.out.println("Email: duc74dcht22041@st.utt.edu.vn");

        for (int i = 9; i >= 0; i--) {
            if (i > 1) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                System.out.println("Take one down, pass it around,");
            } else if (i == 1) {
                System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer.");
                System.out.println("Take one down, pass it around,");
            } else if (i == 0) {
                System.out.print("No more bottles of beer on the wall.");
            }
        }
    }
}