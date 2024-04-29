package com.exchangerates.util.pojo;

import lombok.*;

import java.io.*;
import java.math.BigDecimal;

/**
 * This class represents currency entity which characterized
 * by a digital code, a letter code, a unit, a currency name and a currency rate.<br>
 * It defines a constructor without parameters, a constructor for all class fields,
 * getters and setters for all class fields, as well as equals, hashCode and toString.<br>
 * This class is implements Serializable interface. In this project, this is done so that the server socket can send
 * a collection of currencies to the client socket using ObjectOutputStream, and the client, in turn, could read
 * the received collection using ObjectInputStream.
 * @since 19.0.1
 * @author Evseev Dmitry
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Currency implements Serializable {

    @Serial
    private static final long serialVersionUID = 3169052709570187195L;

    @NonNull
    @EqualsAndHashCode.Include
    private String digitalCode;

    @NonNull
    private String letterCode;

    @NonNull
    private int unit;

    @NonNull
    private String currencyName;

    @NonNull
    private BigDecimal rate;

    @Serial
    private void writeObject(ObjectOutputStream outputStream) throws IOException {
        outputStream.defaultWriteObject();
    }

    @Serial
    private void readObject(ObjectInputStream inputStream) throws IOException, ClassNotFoundException {
        inputStream.defaultReadObject();
    }

}
