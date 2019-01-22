public class TestMyMath {
    public static void main(String[] args) {
        int smallest1 = MyMath.smallestNumber(2,5,8);
        System.out.println(smallest1);//2
        int smallest2 = MyMath.smallestNumber(-5,0,-3);
        System.out.println(smallest2);//-5
        int smallest3 = MyMath.smallestNumber(3,4,3);
        System.out.println(smallest3);//3

        double power1 = MyMath.myPow(2,3);
        System.out.println(power1);//8
        double power2 = MyMath.myPow(2,0);
        System.out.println(power2);//1
        double power3 = MyMath.myPow(2,1);
        System.out.println(power3);//2

        int sum1 = MyMath.numberSum(0);
        System.out.println(sum1);//0
        int sum2 = MyMath.numberSum(3);
        System.out.println(sum2);//6

        double mSum1 = MyMath.multipleSum(4);
        System.out.println(mSum1);//24
        double mSum2 = MyMath.multipleSum(0);
        System.out.println(mSum2);//1
        double mSum = MyMath.multipleSum(1);
        System.out.println(mSum);//1

        boolean prime1 = MyMath.isPrime(7);
        System.out.println(prime1);//true
        boolean prime2 = MyMath.isPrime(4);
        System.out.println(prime2);//false
        boolean prime3 = MyMath.isPrime(0);
        System.out.println(prime3);//false
        boolean prime4 = MyMath.isPrime(1);
        System.out.println(prime4);//false
        boolean prime5 = MyMath.isPrime(2);
        System.out.println(prime5);//true
        boolean prime6 = MyMath.isPrime(21);
        System.out.println(prime6);//false
        boolean prime7 = MyMath.isPrime(23);
        System.out.println(prime7);//true
    }
}
