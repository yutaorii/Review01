
public class Review01 {

    public static void main(String[] args) {

    int num1 = 1500;
    double num2 = 0.1;
    int result;
    int result2;
    result = tax(num1, num2);
    System.out.println(num1 + "円の商品の税込価格は" + (int) (num1 + result) + "円（消費税は150円）   です。");
    }
    private static int tax(int num1, double num2) {
    int num3 = (int) (num1 * num2);
    return num3;
    }
}
