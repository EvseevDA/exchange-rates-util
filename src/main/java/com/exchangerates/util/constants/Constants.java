package com.exchangerates.util.constants;

/**
 * This class aggregates all the constants that use the client and server projects.
 * @since 19.0.1
 * @author Evseev Dmitry
 */
public class Constants {

    private Constants() {
        throw new AssertionError("No " + Constants.class.getName() + " instances for you!");
    }

    /**
     * This request is used to get currencies set from server.<br>
     * The server, in turn, when receives a request to receive currencies set,
     * checks it for compliance with this constant.
     */
    public static final String GET_NEW_RATES_REQUEST = "get new rates";

    /**
     * If no request corresponds to the expected one, the server sends this constant as an answer.<br>
     * (Answers that the server can expect only 1 - {@code GET_NEW_RATES_REQUEST}).
     */
    public static final String DEFAULT_RESPONSE = "unknown request";

    /**
     * The host where the application works
     */
    public static final String HOST = "localhost";

    /**
     * The port on which the application works
     */
    public static final int PORT = 50909;

}
