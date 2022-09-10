package com.wonit;

import java.math.BigDecimal;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Fee {

    public static final Fee ZERO = Fee.of(0);

    private final Long value;

    public Fee(Long value) {
        this.value = value;
    }

    public static Fee of(long amount) {
        return new Fee(amount);
    }

    public int getValue() {
        return value.intValue();
    }

    public Fee plus(Fee amount) {
        return new Fee(this.value + (amount.value));
    }

    public Fee minus(Fee amount) {
        return new Fee(this.value - (amount.value));
    }

    public Fee times(long percent) {
        return new Fee(this.value * percent);
    }

    public boolean isLessThen(Fee other) {
        return value.compareTo(other.value) < 0;
    }

    public boolean isGreaterThanOrEqual(Fee other) {
        return value.compareTo(other.value) >= 0;
    }

    @Override
    public String toString() {
        return "Fee{" +
                "amount=" + value +
                '}';
    }
}
