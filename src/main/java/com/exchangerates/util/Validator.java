package com.exchangerates.util;

import java.util.Objects;

/**
 * This is util class used to validate any data.
 * @since 19.0.1
 * @author Evseev Dmitry
 */
public class Validator {

    private Validator() {
        throw new AssertionError("No " + Validator.class.getName() + " instances for you!");
    }

    /**
     * Checks an object for null.
     * @throws NullPointerException if object is null
     * @param object to check for null
     */
    public static void requireNonNull(Object object) {
        Objects.requireNonNull(object);
    }

    /**
     * Checks a group of objects for null.
     * @throws NullPointerException if at least one object is null.
     */
    public static void requireNonNull(Object o1, Object o2) {
        Objects.requireNonNull(o1);
        Objects.requireNonNull(o2);
    }

    /**
     * Checks a group of objects for null.
     * @throws NullPointerException if at least one object is null.
     */
    public static void requireNonNull(Object o1, Object o2, Object o3) {
        Objects.requireNonNull(o1);
        Objects.requireNonNull(o2);
        Objects.requireNonNull(o3);
    }

    /**
     * Checks a group of objects for null.
     * @throws NullPointerException if at least one object is null.
     */
    public static void requireNonNull(Object o1, Object o2, Object o3, Object o4) {
        Objects.requireNonNull(o1);
        Objects.requireNonNull(o2);
        Objects.requireNonNull(o3);
        Objects.requireNonNull(o4);
    }

    /**
     * Checks a group of objects for null.
     * @throws NullPointerException if at least one object is null.
     */
    public static void requireNonNull(Object o1, Object o2, Object o3, Object o4, Object o5) {
        Objects.requireNonNull(o1);
        Objects.requireNonNull(o2);
        Objects.requireNonNull(o3);
        Objects.requireNonNull(o4);
        Objects.requireNonNull(o5);
    }

    /**
     * Checks a group of objects for null.
     * @throws NullPointerException if at least one object is null.
     */
    public static void requireNonNull(Object o1, Object o2, Object o3, Object o4, Object o5, Object o6) {
        Objects.requireNonNull(o1);
        Objects.requireNonNull(o2);
        Objects.requireNonNull(o3);
        Objects.requireNonNull(o4);
        Objects.requireNonNull(o5);
        Objects.requireNonNull(o6);
    }

    /**
     * Checks a group of objects for null.
     * @throws NullPointerException if at least one object is null.
     */
    public static void requireNonNull(Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7) {
        Objects.requireNonNull(o1);
        Objects.requireNonNull(o2);
        Objects.requireNonNull(o3);
        Objects.requireNonNull(o4);
        Objects.requireNonNull(o5);
        Objects.requireNonNull(o6);
        Objects.requireNonNull(o7);
    }

    /**
     * Checks a group of objects for null.
     * @throws NullPointerException if at least one object is null.
     */
    public static void requireNonNull(Object o1, Object o2, Object o3, Object o4,
                                      Object o5, Object o6, Object o7, Object o8) {
        Objects.requireNonNull(o1);
        Objects.requireNonNull(o2);
        Objects.requireNonNull(o3);
        Objects.requireNonNull(o4);
        Objects.requireNonNull(o5);
        Objects.requireNonNull(o6);
        Objects.requireNonNull(o7);
        Objects.requireNonNull(o8);
    }

    /**
     * Checks a group of objects for null.
     * @throws NullPointerException if at least one object is null.
     */
    public static void requireNonNull(Object o1, Object o2, Object o3, Object o4,
                                      Object o5, Object o6, Object o7, Object o8,
                                      Object o9) {
        Objects.requireNonNull(o1);
        Objects.requireNonNull(o2);
        Objects.requireNonNull(o3);
        Objects.requireNonNull(o4);
        Objects.requireNonNull(o5);
        Objects.requireNonNull(o6);
        Objects.requireNonNull(o7);
        Objects.requireNonNull(o8);
        Objects.requireNonNull(o9);
    }

    /**
     * Checks a group of objects for null.
     * @throws NullPointerException if at least one object is null.
     */
    public static void requireNonNull(Object o1, Object o2, Object o3, Object o4,
                                      Object o5, Object o6, Object o7, Object o8,
                                      Object o9, Object o10) {
        Objects.requireNonNull(o1);
        Objects.requireNonNull(o2);
        Objects.requireNonNull(o3);
        Objects.requireNonNull(o4);
        Objects.requireNonNull(o5);
        Objects.requireNonNull(o6);
        Objects.requireNonNull(o7);
        Objects.requireNonNull(o8);
        Objects.requireNonNull(o9);
        Objects.requireNonNull(o10);
    }

    /**
     * Checks a group of objects for null.
     * @throws NullPointerException if at least one object is null.
     */
    public static void requireNonNull(Object... objects) {
        Objects.requireNonNull(objects);

        for (Object object : objects) {
            Objects.requireNonNull(object);
        }
    }

}
