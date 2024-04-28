package com.exchangerates.util.pojo;

import lombok.*;

import java.io.*;
import java.math.BigDecimal;

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
