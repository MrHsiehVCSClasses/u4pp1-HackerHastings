package u4pp;

public class MyMath {

    static int abs(int x){
        if(x > 0){
            return x;
        } else {
            int y = x+-x;
            return y+-x;
        }
    }

    static double abs(double x){
        if(x > 0){
            return x;
        } else {
            double y = x+-x;
            return y+-x;
        }
    }

    static double pow(double base, int exponent){
    if(exponent > 1){
        double newBase = base;
        for(int i=0; i<exponent-1; i++){
            newBase *= base;
        }
        return newBase;
    } else if(exponent == 1){
        return base;
    } else if (exponent == 0){
        return 1;
    } else {
        double newBase = base;
        for(int i=0; i<exponent; i++){
            newBase *= base;
        }
        return 1/newBase;
    }
    }

    static int perfectSqrt(int x){
        int num = x;
        int oddNum = 1;
        int sqrt = 0;
        while(num!=0){
            num -= oddNum;
            oddNum+= 2;
            sqrt+=1;
            if(num < 0){
                return -1;
            }
        }

        return sqrt;
        
    }

}
