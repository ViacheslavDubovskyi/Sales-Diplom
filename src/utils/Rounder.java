package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rounder {

    public static BigDecimal getRoundValue(double value) {
        BigDecimal result = new BigDecimal(value);
        result = result.setScale(2, RoundingMode.UP);
        return result;
    }
}
