package utils;

import java.text.DecimalFormat;

public class Rounder {

    public static String getRoundValue(double value) {
        DecimalFormat roundValue = new DecimalFormat("#.##");
        return roundValue.format(value);
    }
}
