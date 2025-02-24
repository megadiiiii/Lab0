//Phần 2. Nâng cao – đóng gói/che dấu dữ liệu
//1. Hãy viết một lớp chứa phương thức substr(s1,s2) để tìm dãy con trong một xâu ký tự cho trước, trong
//đó s1 là con trỏ đến một đoạn text bất kỳ, s2 – con trỏ tới nơi cần tìm. Trong trường hợp mà tìm được
//dãy con thi sẽ vị trí bắt đầu của dãy tìm được, còn trong trường hợp không tìm được thì trả lại giá trị
//NULL.
//2. Hãy viết lớp chứa phương thức concat(s1,s2) để liên kết 2 dòng ký tự có độ dài bất kỳ. Kết quả trả lại
//là xâu ký tự mới và vị trí liên kết.

public class lab02_p2 {
    private String result;
    private Integer position;

    public void substr(String s1, String s2) {
        int index = s1.indexOf(s2);
        if (index != -1) {
            this.result = s2;
            this.position = index;
        } else {
            this.result = null;
            this.position = null;
        }
    }

    public void concat(String s1, String s2) {
        this.result = s1.concat(s2);
        this.position = s1.length();
    }

    public String getResult() {
        return result;
    }

    public Integer getPosition() {
        return position;
    }

    public static void main(String[] args) {
        lab02_p2 str = new lab02_p2();

        //Substr
        str.substr("Hello, this is a Java example.", "Java");
        System.out.println("Vi tri tim duoc: " + str.getPosition());

        //Concat
        str.concat("Hello, ", "World");
        System.out.println("Chuoi da noi: " + str.getResult());
        System.out.println("Vi tri lien ket: " + str.getPosition());
    }
}
