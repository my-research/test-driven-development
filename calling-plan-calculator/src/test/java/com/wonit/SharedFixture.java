package com.wonit;

import java.time.LocalDateTime;

public class SharedFixture {
    public static LocalDateTime NOW = LocalDateTime.now();
    public static LocalDateTime NOW_BEFORE_1H = LocalDateTime.now().minusHours(1L);
    public static LocalDateTime NOW_BEFORE_2H = LocalDateTime.now().minusHours(2L);
}
