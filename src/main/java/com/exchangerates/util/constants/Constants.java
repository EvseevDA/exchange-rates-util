package com.exchangerates.util.constants;

public class Constants {

    private Constants() {
        throw new AssertionError("No " + Constants.class.getName() + " instances for you!");
    }

    public static final String GET_NEW_RATES_REQUEST = "get new rates";
    public static final String DEFAULT_RESPONSE = "unknown request";
    public static final String HOST = "localhost";
    public static final int PORT = 50909;

}
