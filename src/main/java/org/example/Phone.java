package org.example;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@Getter
@FieldDefaults (level = AccessLevel.PRIVATE)

public class Phone {
    Integer number;
    enum Type {
        stationary,
        mobile
    }

    public Phone() {
    }
}


