package com.wonit;

public class FeePolicy {

    public Fee calculateFee(Call call) {
        long durationMinute = call.getDuration().toMinutes();
        return Fee.of(18 * durationMinute);
    }
}
