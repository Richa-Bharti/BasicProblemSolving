public class BtoD {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int num = 10101001;
        System.out.println(BinaryToDecimal(num));
    }
    static int BinaryToDecimal(int n){
        int num = n;
        int dec_val = 0;
        int base = 1;
        int temp = num;
        while(temp >0){
            int last_digit =  temp % 10;
            temp = temp / 10;

            dec_val += last_digit *base;
            base = base * 2;

        }
        return dec_val;
    }
}
