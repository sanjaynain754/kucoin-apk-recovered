package com.google.android.material.datepicker;

import androidx.annotation.Nullable;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes45.dex */
class TimeSource {
    private static final TimeSource SYSTEM_TIME_SOURCE = new TimeSource(null, null);

    @Nullable
    private final Long fixedTimeMs;

    @Nullable
    private final TimeZone fixedTimeZone;

    public static TimeSource fixed(long j11, @Nullable TimeZone timeZone) {
        return new TimeSource(Long.valueOf(j11), timeZone);
    }

    public Calendar now() {
        return now(this.fixedTimeZone);
    }

    public static TimeSource fixed(long j11) {
        return new TimeSource(Long.valueOf(j11), null);
    }

    public static TimeSource system() {
        return SYSTEM_TIME_SOURCE;
    }

    public Calendar now(@Nullable TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l11 = this.fixedTimeMs;
        if (l11 != null) {
            calendar.setTimeInMillis(l11.longValue());
        }
        return calendar;
    }

    private TimeSource(@Nullable Long l11, @Nullable TimeZone timeZone) {
        this.fixedTimeMs = l11;
        this.fixedTimeZone = timeZone;
    }
}
