给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。

思路：

1. 考虑base和exponent为0 的情况，base为0，返回0.0,。exponent为0返回1.0
2. 考虑exponent大于0和小于0 的情况。大于0直接相乘，小于0,乘以1/base
3. 因为是double类型的数据，不能直接用等号判断两个数字是否相等，必须要通过两个数相减的绝对值与0.00000001进行判断




public class Solution {
    public double Power(double base, int exponent) {
        double result=0;
        if(equals(base,0)){//考虑基数为0的情况，直接返回0.0
            return 0.0;
        }
        if(equals(exponent,0)){//考虑指数为0，直接返回1.0
            return 1.0;
        }
        if(exponent>0){//指数大于0，
            result=multiply(base,exponent);
        }else{//指数小于0
            result=multiply(1/base,-exponent);
        }
        return result;
  }
    //乘方运算
    public double multiply(double base,int exponent){
        double sum=1;
        for(int i=0;i<exponent;i++){//进行乘方运算，
            sum*=base;
        }
        return sum;
    }
    //因为是double类型的数据不能直接判断，必须要通过两个数的绝对值之差来判断
    public boolean equals(double a,double b){
        if(a-b<0.0000001&&a-b>-0.0000001){
            return true;
        }
        return false;
    }
}
```

