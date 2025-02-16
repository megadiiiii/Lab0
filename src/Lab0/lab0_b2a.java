//Viết chương trình in ra tổng của 10 số đầu tiên (sử dụng vòng lặp for hoặc while)
public class lab0_b2a {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1;i<=10;i++) {
            sum += i;
        }
        System.out.println("Tong cac so tu 1 den 10 " + sum);
    }
}