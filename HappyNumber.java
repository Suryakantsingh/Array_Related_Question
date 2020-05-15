package array;

public class HappyNumber {
    public boolean isHappy(int n) {

                int sum1 = 0;
                while (n != 0 ) {
                    sum1 = sum1 + (int) Math.pow(n % 10, 2);
                    n = n / 10;
                    if(sum1/10 == 0 && n == 0 && sum1% 10 ==1){
                        return true;
                    }else {
                          if(n == 0) {
                              n = sum1;
                              sum1 = 0;
                          }
                    }

                }


        return false;
    }

    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(1));
    }
}
