package com.wonit;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

class PhoneTestaa {

    public static final LocalDateTime NOW = LocalDateTime.now();
    Phone sut = new Phone();

    @Test
    void name2() {
        Call call = Call.of(NOW.minusDays(2L), NOW);
        Call call2 = Call.of(NOW.minusDays(1L), NOW);

        sut.call(call);
        sut.call(call2);

        assertThat(sut.numberOfCalls()).isEqualTo(2);
    }
}