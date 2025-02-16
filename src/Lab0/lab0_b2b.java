//Viết chương trình in ra tổng của 10 số chẵn đầu tiên (sử dụng vòng lặp for hoặc while).
public class lab0_b2b {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Tong 10 so chan dau tien la: " + sum);
    }
}