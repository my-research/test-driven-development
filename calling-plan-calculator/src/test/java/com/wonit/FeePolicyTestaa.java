package com.wonit;

import static com.wonit.SharedFixture.NOW;
import static com.wonit.SharedFixture.NOW_BEFORE_1H;
import static com.wonit.SharedFixture.NOW_BEFORE_2H;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

class FeePolicyTestaa {

    FeePolicy sut = new FeePolicy();

    /**
     * 1 시간, 분당 요금 : 18 원
     * 18 * 59
     */

    @Test
    void name() {
        Call call = Call.of(NOW_BEFORE_1H, NOW);
        Fee basicPrice = Fee.of(18);

        Fee actual = sut.calculateFee(call);

        assertThat(actual.getValue()).isEqualTo(18 * 59);
    }

    @Test
    void name2() {
        Call call = Call.of(NOW_BEFORE_2H, NOW);
        Fee basicPrice = Fee.of(18);

        Fee actual = sut.calculateFee(call);

        assertThat(actual).isEqualTo(basicPrice.times(119));
    }
}