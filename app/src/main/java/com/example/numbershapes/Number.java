package com.example.numbershapes;

public class Number {
    int number;
            public boolean isTraingle(){
                int sum=0;
                if(number<=0)
                    return false;
                for(int i=1;sum<=number;i++){
                    sum+=i;
                    if(sum==number)
                        return true;
                }
                return false;
            }
            public boolean isSquare(){
                double d=Math.sqrt(number);
                if(d==Math.floor(d))
                    return true;
                return false;
            }
}
