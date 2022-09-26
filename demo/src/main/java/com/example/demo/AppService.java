package com.example.demo;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class AppService {
    public BigDecimal arithmetic(BigDecimal[] array){
        if(array.length==0) return BigDecimal.valueOf(0);
        if(array.length==1) return array[0];
        BigDecimal d = array[0].subtract(array[1]);
        BigDecimal sum=array[0];
        for(int i=1; i< array.length-1;i++){
            if(!d.equals(array[i].subtract(array[i+1]))) return BigDecimal.valueOf(0);
            sum = sum.add(array[i]);
        }
        sum = sum.add(array[array.length-1]);
        return sum;
    }
    public BigDecimal geometric(BigDecimal[] array){
        if(array.length==0) return BigDecimal.valueOf(0);
        if(array.length==1) return array[0];
        BigDecimal d = array[0].divide(array[1],4,RoundingMode.HALF_UP);
        BigDecimal sum=array[0];
        for(int i=1; i< array.length-1;i++){
            if(!d.equals(array[i].divide(array[i+1],4,RoundingMode.HALF_UP))) return BigDecimal.valueOf(0);
            sum = sum.add(array[i]);
        }
        sum = sum.add(array[array.length-1]);
        return sum;
    }
}
