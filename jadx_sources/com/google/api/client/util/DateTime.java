package com.google.api.client.util;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes56.dex */
public final class DateTime implements Serializable {
    private static final long serialVersionUID = 1;
    private final boolean dateOnly;
    private final int tzShift;
    private final long value;
    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");
    private static final String RFC3339_REGEX = "(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d{1,9})?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?";
    private static final Pattern RFC3339_PATTERN = Pattern.compile(RFC3339_REGEX);

    public static class Rfc3339ParseResult implements Serializable {
        private final int nanos;
        private final long seconds;
        private final boolean timeGiven;
        private final Integer tzShift;

        private Rfc3339ParseResult(long j11, int i11, boolean z11, Integer num) {
            this.seconds = j11;
            this.nanos = i11;
            this.timeGiven = z11;
            this.tzShift = num;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DateTime toDateTime() {
            return new DateTime(!this.timeGiven, TimeUnit.SECONDS.toMillis(this.seconds) + TimeUnit.NANOSECONDS.toMillis(this.nanos), this.tzShift);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SecondsAndNanos toSecondsAndNanos() {
            return new SecondsAndNanos(this.seconds, this.nanos);
        }
    }

    public static final class SecondsAndNanos implements Serializable {
        private final int nanos;
        private final long seconds;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SecondsAndNanos.class == obj.getClass()) {
                SecondsAndNanos secondsAndNanos = (SecondsAndNanos) obj;
                if (this.seconds == secondsAndNanos.seconds && this.nanos == secondsAndNanos.nanos) {
                    return true;
                }
            }
            return false;
        }

        private SecondsAndNanos(long j11, int i11) {
            this.seconds = j11;
            this.nanos = i11;
        }

        public static SecondsAndNanos ofSecondsAndNanos(long j11, int i11) {
            return new SecondsAndNanos(j11, i11);
        }

        public int getNanos() {
            return this.nanos;
        }

        public long getSeconds() {
            return this.seconds;
        }

        public int hashCode() {
            return java.util.Objects.hash(Long.valueOf(this.seconds), Integer.valueOf(this.nanos));
        }

        public String toString() {
            return String.format("Seconds: %d, Nanos: %d", Long.valueOf(this.seconds), Integer.valueOf(this.nanos));
        }
    }

    public DateTime(Date date, TimeZone timeZone) {
        this(false, date.getTime(), timeZone == null ? null : Integer.valueOf(timeZone.getOffset(date.getTime()) / 60000));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DateTime)) {
            return false;
        }
        DateTime dateTime = (DateTime) obj;
        return this.dateOnly == dateTime.dateOnly && this.value == dateTime.value && this.tzShift == dateTime.tzShift;
    }

    public DateTime(long j11) {
        this(false, j11, null);
    }

    private static void appendInt(StringBuilder sb2, int i11, int i12) {
        if (i11 < 0) {
            sb2.append('-');
            i11 = -i11;
        }
        int i13 = i11;
        while (i13 > 0) {
            i13 /= 10;
            i12--;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            sb2.append('0');
        }
        if (i11 != 0) {
            sb2.append(i11);
        }
    }

    private static Rfc3339ParseResult parseRfc3339WithNanoSeconds(String str) throws NumberFormatException {
        int i11;
        int i12;
        int i13;
        int i14;
        Integer numValueOf;
        Matcher matcher = RFC3339_PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw new NumberFormatException("Invalid date/time format: " + str);
        }
        int i15 = Integer.parseInt(matcher.group(1));
        int i16 = Integer.parseInt(matcher.group(2)) - 1;
        int i17 = Integer.parseInt(matcher.group(3));
        boolean z11 = matcher.group(4) != null;
        String strGroup = matcher.group(9);
        boolean z12 = strGroup != null;
        if (z12 && !z11) {
            throw new NumberFormatException("Invalid date/time format, cannot specify time zone shift without specifying time: " + str);
        }
        if (z11) {
            int i18 = Integer.parseInt(matcher.group(5));
            i12 = Integer.parseInt(matcher.group(6));
            i13 = Integer.parseInt(matcher.group(7));
            i14 = matcher.group(8) != null ? Integer.parseInt(com.google.common.base.Strings.padEnd(matcher.group(8).substring(1), 9, '0')) : 0;
            i11 = i18;
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(GMT);
        gregorianCalendar.clear();
        gregorianCalendar.set(i15, i16, i17, i11, i12, i13);
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        if (!z11 || !z12) {
            numValueOf = null;
        } else if (Character.toUpperCase(strGroup.charAt(0)) != 'Z') {
            int i19 = (Integer.parseInt(matcher.group(11)) * 60) + Integer.parseInt(matcher.group(12));
            if (matcher.group(10).charAt(0) == '-') {
                i19 = -i19;
            }
            timeInMillis -= ((long) i19) * 60000;
            numValueOf = Integer.valueOf(i19);
        } else {
            numValueOf = 0;
        }
        return new Rfc3339ParseResult(timeInMillis / 1000, i14, z11, numValueOf);
    }

    public int getTimeZoneShift() {
        return this.tzShift;
    }

    public long getValue() {
        return this.value;
    }

    public int hashCode() {
        return Arrays.hashCode(new long[]{this.value, this.dateOnly ? 1L : 0L, this.tzShift});
    }

    public boolean isDateOnly() {
        return this.dateOnly;
    }

    public String toStringRfc3339() {
        StringBuilder sb2 = new StringBuilder();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(GMT);
        gregorianCalendar.setTimeInMillis(this.value + (((long) this.tzShift) * 60000));
        appendInt(sb2, gregorianCalendar.get(1), 4);
        sb2.append('-');
        appendInt(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        appendInt(sb2, gregorianCalendar.get(5), 2);
        if (!this.dateOnly) {
            sb2.append('T');
            appendInt(sb2, gregorianCalendar.get(11), 2);
            sb2.append(':');
            appendInt(sb2, gregorianCalendar.get(12), 2);
            sb2.append(':');
            appendInt(sb2, gregorianCalendar.get(13), 2);
            if (gregorianCalendar.isSet(14)) {
                sb2.append('.');
                appendInt(sb2, gregorianCalendar.get(14), 3);
            }
            int i11 = this.tzShift;
            if (i11 == 0) {
                sb2.append('Z');
            } else {
                if (i11 > 0) {
                    sb2.append('+');
                } else {
                    sb2.append('-');
                    i11 = -i11;
                }
                appendInt(sb2, i11 / 60, 2);
                sb2.append(':');
                appendInt(sb2, i11 % 60, 2);
            }
        }
        return sb2.toString();
    }

    public DateTime(Date date) {
        this(date.getTime());
    }

    public static DateTime parseRfc3339(String str) {
        return parseRfc3339WithNanoSeconds(str).toDateTime();
    }

    public static SecondsAndNanos parseRfc3339ToSecondsAndNanos(String str) {
        return parseRfc3339WithNanoSeconds(str).toSecondsAndNanos();
    }

    public String toString() {
        return toStringRfc3339();
    }

    public DateTime(long j11, int i11) {
        this(false, j11, Integer.valueOf(i11));
    }

    public DateTime(boolean z11, long j11, Integer num) {
        int offset;
        this.dateOnly = z11;
        this.value = j11;
        if (z11) {
            offset = 0;
        } else {
            offset = num == null ? TimeZone.getDefault().getOffset(j11) / 60000 : num.intValue();
        }
        this.tzShift = offset;
    }

    public DateTime(String str) {
        DateTime rfc3339 = parseRfc3339(str);
        this.dateOnly = rfc3339.dateOnly;
        this.value = rfc3339.value;
        this.tzShift = rfc3339.tzShift;
    }
}
