package com.exchangerates.util;

import java.util.Objects;

public class Validator {

    private Validator() {
        throw new AssertionError("No " + Validator.class.getName() + " instances for you!");
    }


    public static void requireNonNull(Object object) {
        Objects.requireNonNull(object);
    }

    public static void requireNonNull(Object o1, Object o2) {
        Objects.requireNonNull(o1);
        Objects.requireNonNull(o2);
    }

    public static void requireNonNull(Object o1, Object o2, Object o3) {
        Objects.requireNonNull(o1);
        Objects.requireNonNull(o2);
        Objects.requireNonNull(o3);
    }

    public static void requireNonNull(Object o1, Object o2, Object o3, Object o4) {
        Objects.requireNonNull(o1);
        Objects.requireNonNull(o2);
        Objects.requireNonNull(o3);
        Objects.requireNonNull(o4);
    }

    public static void requireNonNull(Object o1, Object o2, Object o3, Object o4, Object o5) {
        Objects.requireNonNull(o1);
        Objects.requireNonNull(o2);
        Objects.requireNonNull(o3);
        Objects.requireNonNull(o4);
        Objects.requireNonNull(o5);
    }

    public static void requireNonNull(Object o1, Object o2, Object o3, Object o4, Object o5, Object o6) {
        Objects.requireNonNull(o1);
        Objects.requireNonNull(o2);
        Objects.requireNonNull(o3);
        Objects.requireNonNull(o4);
        Objects.requireNonNull(o5);
        Objects.requireNonNull(o6);
    }

    public static void requireNonNull(Object o1, Object o2, Object o3, Object o4, Object o5, Object o6, Object o7) {
        Objects.requireNonNull(o1);
        Objects.requireNonNull(o2);
        Objects.requireNonNull(o3);
        Objects.requireNonNull(o4);
        Objects.requireNonNull(o5);
        Objects.requireNonNull(o6);
        Objects.requireNonNull(o7);
    }

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
    public static void requireNonNull(Object... objects) {
        Objects.requireNonNull(objects);

        for (Object object : objects) {
            Objects.requireNonNull(object);
        }
    }

}
