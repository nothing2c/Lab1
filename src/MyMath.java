public class MyMath {
    public static int smallestNumber(int x, int y, int z){
        int smallest=x;

        if(y <= smallest)
            smallest=y;
        if(z <= smallest)
            smallest=z;

        return smallest;
    }

    public static double myPow (double number, int power){
        double answer=1;

        for(int i=1;i<=power;i++)
        {
            answer*=number;
        }

        return answer;
    }

    public static int numberSum(int number){
        int answer=0;

        for(int i=0;i<=number;i++)
        {
            answer+=i;
        }

        return answer;
    }

    public static double multipleSum(int number){
        double answer=1;

        for(int i=1;i<=number;i++)
        {
            answer*=i;
        }

        return answer;
    }

    public static boolean isPrime(int number){
        int multipleCount=0;

        for(int i=1;i<=number;i++)
        {
            if(number%i==0)
                multipleCount++;
        }

        if(multipleCount!=2)
            return false;
        else return true;
    }
}
