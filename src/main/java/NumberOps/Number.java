package NumberOps;

public class Number {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Boolean CheckPalindrome(int num) {

        Boolean palindrome = false;

        int number = num;
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        if (num == reverse) {
            palindrome = true;
        }
        return palindrome;

    }

    public int checkPrime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                System.out.println("not prime");
            }
        }
        return x;
    }

    public Boolean checkAmstrong(int x) {
        boolean armNumber = false;
        int sum = 0;
        int Num = x;
        while (Num > 0) {
            int r = Num % 10;
            sum = sum + (r * r * r);
            Num = Num / 10;
        }
        if (sum == x) {
            armNumber = true;
        }
        return armNumber;
    }
}

