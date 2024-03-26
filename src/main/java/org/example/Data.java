package org.example;

import java.util.Objects;

public record Data(String a, String b, String c) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return Objects.equals(a, data.a) && Objects.equals(b, data.b) && Objects.equals(c, data.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}
