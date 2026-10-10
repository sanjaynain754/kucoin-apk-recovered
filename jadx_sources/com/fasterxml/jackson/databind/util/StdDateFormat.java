package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.p062io.C6313g;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes45.dex */
public class StdDateFormat extends DateFormat {
    protected static final String[] ALL_FORMATS;
    protected static final Calendar CALENDAR;
    protected static final DateFormat DATE_FORMAT_RFC1123;
    public static final String DATE_FORMAT_STR_ISO8601 = "yyyy-MM-dd'T'HH:mm:ss.SSSX";
    protected static final String DATE_FORMAT_STR_PLAIN = "yyyy-MM-dd";
    protected static final String DATE_FORMAT_STR_RFC1123 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    protected static final Locale DEFAULT_LOCALE;
    protected static final TimeZone DEFAULT_TIMEZONE;
    protected static final Pattern PATTERN_ISO8601;
    public static final StdDateFormat instance;
    protected Boolean _lenient;
    protected final Locale _locale;
    protected transient TimeZone _timezone;
    private boolean _tzSerializedWithColon;

    /* JADX INFO: renamed from: b */
    public transient Calendar f10708b;

    /* JADX INFO: renamed from: c */
    public transient DateFormat f10709c;
    protected static final String PATTERN_PLAIN_STR = "\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d";
    protected static final Pattern PATTERN_PLAIN = Pattern.compile(PATTERN_PLAIN_STR);

    public StdDateFormat() {
        this._tzSerializedWithColon = true;
        this._locale = DEFAULT_LOCALE;
    }

    public static <T> boolean _equals(T t11, T t12) {
        if (t11 == t12) {
            return true;
        }
        return t11 != null && t11.equals(t12);
    }

    public void _clearFormats() {
        this.f10709c = null;
    }

    public void _formatBCEYear(StringBuffer stringBuffer, int i11) {
        if (i11 == 1) {
            stringBuffer.append("+0000");
        } else {
            stringBuffer.append('-');
            m11874g(stringBuffer, i11 - 1);
        }
    }

    @Override // java.text.DateFormat
    public Date parse(String str) throws ParseException {
        String strTrim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date date_parseDate = _parseDate(strTrim, parsePosition);
        if (date_parseDate != null) {
            return date_parseDate;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : ALL_FORMATS) {
            if (sb2.length() > 0) {
                sb2.append("\", \"");
            } else {
                sb2.append('\"');
            }
            sb2.append(str2);
        }
        sb2.append('\"');
        throw new ParseException(String.format("Cannot parse date \"%s\": not compatible with any of standard forms (%s)", strTrim, sb2.toString()), parsePosition.getErrorIndex());
    }

    static {
        try {
            PATTERN_ISO8601 = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?");
            ALL_FORMATS = new String[]{DATE_FORMAT_STR_ISO8601, "yyyy-MM-dd'T'HH:mm:ss.SSS", DATE_FORMAT_STR_RFC1123, "yyyy-MM-dd"};
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            DEFAULT_TIMEZONE = timeZone;
            Locale locale = Locale.US;
            DEFAULT_LOCALE = locale;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT_STR_RFC1123, locale);
            DATE_FORMAT_RFC1123 = simpleDateFormat;
            simpleDateFormat.setTimeZone(timeZone);
            instance = new StdDateFormat();
            CALENDAR = new GregorianCalendar(timeZone, locale);
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final DateFormat m11869a(DateFormat dateFormat, String str, TimeZone timeZone, Locale locale, Boolean bool) {
        DateFormat simpleDateFormat;
        if (locale.equals(DEFAULT_LOCALE)) {
            simpleDateFormat = (DateFormat) dateFormat.clone();
            if (timeZone != null) {
                simpleDateFormat.setTimeZone(timeZone);
            }
        } else {
            simpleDateFormat = new SimpleDateFormat(str, locale);
            if (timeZone == null) {
                timeZone = DEFAULT_TIMEZONE;
            }
            simpleDateFormat.setTimeZone(timeZone);
        }
        if (bool != null) {
            simpleDateFormat.setLenient(bool.booleanValue());
        }
        return simpleDateFormat;
    }

    /* JADX INFO: renamed from: e */
    public static void m11872e(StringBuffer stringBuffer, int i11) {
        int i12 = i11 / 10;
        if (i12 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i12 + 48));
            i11 -= i12 * 10;
        }
        stringBuffer.append((char) (i11 + 48));
    }

    /* JADX INFO: renamed from: f */
    public static void m11873f(StringBuffer stringBuffer, int i11) {
        int i12 = i11 / 100;
        if (i12 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i12 + 48));
            i11 -= i12 * 100;
        }
        m11872e(stringBuffer, i11);
    }

    /* JADX INFO: renamed from: g */
    public static void m11874g(StringBuffer stringBuffer, int i11) {
        int i12 = i11 / 100;
        if (i12 == 0) {
            stringBuffer.append('0');
            stringBuffer.append('0');
        } else {
            if (i12 > 99) {
                stringBuffer.append(i12);
            } else {
                m11872e(stringBuffer, i12);
            }
            i11 -= i12 * 100;
        }
        m11872e(stringBuffer, i11);
    }

    public static TimeZone getDefaultTimeZone() {
        return DEFAULT_TIMEZONE;
    }

    @Deprecated
    public static DateFormat getISO8601Format(TimeZone timeZone, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT_STR_ISO8601, locale);
        simpleDateFormat.setTimeZone(DEFAULT_TIMEZONE);
        return simpleDateFormat;
    }

    @Deprecated
    public static DateFormat getRFC1123Format(TimeZone timeZone, Locale locale) {
        return m11869a(DATE_FORMAT_RFC1123, DATE_FORMAT_STR_RFC1123, timeZone, locale, null);
    }

    public Calendar _getCalendar(TimeZone timeZone) {
        Calendar calendar = this.f10708b;
        if (calendar == null) {
            calendar = (Calendar) CALENDAR.clone();
            this.f10708b = calendar;
        }
        if (!calendar.getTimeZone().equals(timeZone)) {
            calendar.setTimeZone(timeZone);
        }
        calendar.setLenient(isLenient());
        return calendar;
    }

    public Date _parseAsISO8601(String str, ParsePosition parsePosition) throws ParseException, IllegalArgumentException {
        String str2;
        int i11;
        int iM11870b;
        int length = str.length();
        TimeZone timeZone = DEFAULT_TIMEZONE;
        if (this._timezone != null && 'Z' != str.charAt(length - 1)) {
            timeZone = this._timezone;
        }
        Calendar calendar_getCalendar = _getCalendar(timeZone);
        calendar_getCalendar.clear();
        int iCharAt = 0;
        if (length > 10) {
            Matcher matcher = PATTERN_ISO8601.matcher(str);
            if (matcher.matches()) {
                int iStart = matcher.start(2);
                int iEnd = matcher.end(2);
                int i12 = iEnd - iStart;
                if (i12 > 1) {
                    int iM11870b2 = m11870b(str, iStart + 1) * 3600;
                    if (i12 >= 5) {
                        iM11870b2 += m11870b(str, iEnd - 2) * 60;
                    }
                    calendar_getCalendar.set(15, str.charAt(iStart) == '-' ? iM11870b2 * (-1000) : iM11870b2 * 1000);
                    calendar_getCalendar.set(16, 0);
                }
                int iM11871c = m11871c(str, 0);
                int iM11870b3 = m11870b(str, 5) - 1;
                int iM11870b4 = m11870b(str, 8);
                int iM11870b5 = m11870b(str, 11);
                int iM11870b6 = m11870b(str, 14);
                if (length <= 16 || str.charAt(16) != ':') {
                    i11 = iM11871c;
                    iM11870b = 0;
                } else {
                    i11 = iM11871c;
                    iM11870b = m11870b(str, 17);
                }
                calendar_getCalendar.set(i11, iM11870b3, iM11870b4, iM11870b5, iM11870b6, iM11870b);
                int iStart2 = matcher.start(1);
                int i13 = iStart2 + 1;
                int iEnd2 = matcher.end(1);
                if (i13 >= iEnd2) {
                    calendar_getCalendar.set(14, 0);
                } else {
                    int i14 = iEnd2 - i13;
                    if (i14 != 0) {
                        if (i14 != 1) {
                            if (i14 != 2) {
                                if (i14 != 3 && i14 > 9) {
                                    throw new ParseException(String.format("Cannot parse date \"%s\": invalid fractional seconds '%s'; can use at most 9 digits", str, matcher.group(1).substring(1)), i13);
                                }
                                iCharAt = str.charAt(iStart2 + 3) - '0';
                            }
                            iCharAt += (str.charAt(iStart2 + 2) - '0') * 10;
                        }
                        iCharAt += (str.charAt(i13) - '0') * 100;
                    }
                    calendar_getCalendar.set(14, iCharAt);
                }
                return calendar_getCalendar.getTime();
            }
            str2 = DATE_FORMAT_STR_ISO8601;
        } else {
            if (PATTERN_PLAIN.matcher(str).matches()) {
                calendar_getCalendar.set(m11871c(str, 0), m11870b(str, 5) - 1, m11870b(str, 8), 0, 0, 0);
                calendar_getCalendar.set(14, 0);
                return calendar_getCalendar.getTime();
            }
            str2 = "yyyy-MM-dd";
        }
        throw new ParseException(String.format("Cannot parse date \"%s\": while it seems to fit format '%s', parsing fails (leniency? %s)", str, str2, this._lenient), 0);
    }

    @Override // java.text.DateFormat, java.text.Format
    public StdDateFormat clone() {
        return new StdDateFormat(this._timezone, this._locale, this._lenient, this._tzSerializedWithColon);
    }

    @Override // java.text.DateFormat
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // java.text.DateFormat
    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        TimeZone timeZone = this._timezone;
        if (timeZone == null) {
            timeZone = DEFAULT_TIMEZONE;
        }
        _format(timeZone, this._locale, date, stringBuffer);
        return stringBuffer;
    }

    @Override // java.text.DateFormat
    public TimeZone getTimeZone() {
        return this._timezone;
    }

    public boolean isColonIncludedInTimeZone() {
        return this._tzSerializedWithColon;
    }

    @Override // java.text.DateFormat
    public boolean isLenient() {
        Boolean bool = this._lenient;
        return bool == null || bool.booleanValue();
    }

    public Date parseAsRFC1123(String str, ParsePosition parsePosition) {
        if (this.f10709c == null) {
            this.f10709c = m11869a(DATE_FORMAT_RFC1123, DATE_FORMAT_STR_RFC1123, this._timezone, this._locale, this._lenient);
        }
        return this.f10709c.parse(str, parsePosition);
    }

    @Override // java.text.DateFormat
    public void setTimeZone(TimeZone timeZone) {
        if (timeZone.equals(this._timezone)) {
            return;
        }
        _clearFormats();
        this._timezone = timeZone;
    }

    public String toPattern() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("[one of: '");
        sb2.append(DATE_FORMAT_STR_ISO8601);
        sb2.append("', '");
        sb2.append(DATE_FORMAT_STR_RFC1123);
        sb2.append("' (");
        sb2.append(Boolean.FALSE.equals(this._lenient) ? "strict" : "lenient");
        sb2.append(")]");
        return sb2.toString();
    }

    public StdDateFormat withColonInTimeZone(boolean z11) {
        return this._tzSerializedWithColon == z11 ? this : new StdDateFormat(this._timezone, this._locale, this._lenient, z11);
    }

    public StdDateFormat withLenient(Boolean bool) {
        return _equals(bool, this._lenient) ? this : new StdDateFormat(this._timezone, this._locale, bool, this._tzSerializedWithColon);
    }

    public StdDateFormat withLocale(Locale locale) {
        return locale.equals(this._locale) ? this : new StdDateFormat(this._timezone, locale, this._lenient, this._tzSerializedWithColon);
    }

    public StdDateFormat withTimeZone(TimeZone timeZone) {
        if (timeZone == null) {
            timeZone = DEFAULT_TIMEZONE;
        }
        TimeZone timeZone2 = this._timezone;
        return (timeZone == timeZone2 || timeZone.equals(timeZone2)) ? this : new StdDateFormat(timeZone, this._locale, this._lenient, this._tzSerializedWithColon);
    }

    /* JADX INFO: renamed from: b */
    public static int m11870b(String str, int i11) {
        return ((str.charAt(i11) - '0') * 10) + (str.charAt(i11 + 1) - '0');
    }

    /* JADX INFO: renamed from: c */
    public static int m11871c(String str, int i11) {
        return ((str.charAt(i11) - '0') * 1000) + ((str.charAt(i11 + 1) - '0') * 100) + ((str.charAt(i11 + 2) - '0') * 10) + (str.charAt(i11 + 3) - '0');
    }

    public void _format(TimeZone timeZone, Locale locale, Date date, StringBuffer stringBuffer) {
        Calendar calendar_getCalendar = _getCalendar(timeZone);
        calendar_getCalendar.setTime(date);
        int i11 = calendar_getCalendar.get(1);
        char c11 = '+';
        if (calendar_getCalendar.get(0) == 0) {
            _formatBCEYear(stringBuffer, i11);
        } else {
            if (i11 > 9999) {
                stringBuffer.append('+');
            }
            m11874g(stringBuffer, i11);
        }
        stringBuffer.append('-');
        m11872e(stringBuffer, calendar_getCalendar.get(2) + 1);
        stringBuffer.append('-');
        m11872e(stringBuffer, calendar_getCalendar.get(5));
        stringBuffer.append('T');
        m11872e(stringBuffer, calendar_getCalendar.get(11));
        stringBuffer.append(':');
        m11872e(stringBuffer, calendar_getCalendar.get(12));
        stringBuffer.append(':');
        m11872e(stringBuffer, calendar_getCalendar.get(13));
        stringBuffer.append('.');
        m11873f(stringBuffer, calendar_getCalendar.get(14));
        int offset = timeZone.getOffset(calendar_getCalendar.getTimeInMillis());
        if (offset != 0) {
            int i12 = offset / 60000;
            int iAbs = Math.abs(i12 / 60);
            int iAbs2 = Math.abs(i12 % 60);
            if (offset < 0) {
                c11 = '-';
            }
            stringBuffer.append(c11);
            m11872e(stringBuffer, iAbs);
            if (this._tzSerializedWithColon) {
                stringBuffer.append(':');
            }
            m11872e(stringBuffer, iAbs2);
            return;
        }
        if (this._tzSerializedWithColon) {
            stringBuffer.append("+00:00");
        } else {
            stringBuffer.append("+0000");
        }
    }

    public Date _parseDate(String str, ParsePosition parsePosition) throws ParseException {
        if (looksLikeISO8601(str)) {
            return parseAsISO8601(str, parsePosition);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            char cCharAt = str.charAt(length);
            if (cCharAt < '0' || cCharAt > '9') {
                if (length > 0 || cCharAt != '-') {
                    break;
                }
            }
        }
        if (length < 0 && (str.charAt(0) == '-' || C6313g.m11009a(str, false))) {
            return m11875d(str, parsePosition);
        }
        return parseAsRFC1123(str, parsePosition);
    }

    /* JADX INFO: renamed from: d */
    public final Date m11875d(String str, ParsePosition parsePosition) throws ParseException {
        try {
            return new Date(C6313g.m11020l(str));
        } catch (NumberFormatException unused) {
            throw new ParseException(String.format("Timestamp value %s out of 64-bit value range", str), parsePosition.getErrorIndex());
        }
    }

    @Override // java.text.DateFormat
    public int hashCode() {
        return System.identityHashCode(this);
    }

    public boolean looksLikeISO8601(String str) {
        if (str.length() < 7 || !Character.isDigit(str.charAt(0)) || !Character.isDigit(str.charAt(3)) || str.charAt(4) != '-' || !Character.isDigit(str.charAt(5))) {
            return false;
        }
        return true;
    }

    public Date parseAsISO8601(String str, ParsePosition parsePosition) throws ParseException {
        try {
            return _parseAsISO8601(str, parsePosition);
        } catch (IllegalArgumentException e11) {
            throw new ParseException(String.format("Cannot parse date \"%s\", problem: %s", str, e11.getMessage()), parsePosition.getErrorIndex());
        }
    }

    @Override // java.text.DateFormat
    public void setLenient(boolean z11) {
        Boolean boolValueOf = Boolean.valueOf(z11);
        if (!_equals(boolValueOf, this._lenient)) {
            this._lenient = boolValueOf;
            _clearFormats();
        }
    }

    public String toString() {
        return String.format("DateFormat %s: (timezone: %s, locale: %s, lenient: %s)", getClass().getName(), this._timezone, this._locale, this._lenient);
    }

    @Deprecated
    public StdDateFormat(TimeZone timeZone, Locale locale) {
        this._tzSerializedWithColon = true;
        this._timezone = timeZone;
        this._locale = locale;
    }

    public StdDateFormat(TimeZone timeZone, Locale locale, Boolean bool) {
        this(timeZone, locale, bool, false);
    }

    public StdDateFormat(TimeZone timeZone, Locale locale, Boolean bool, boolean z11) {
        this._timezone = timeZone;
        this._locale = locale;
        this._lenient = bool;
        this._tzSerializedWithColon = z11;
    }

    @Override // java.text.DateFormat
    public Date parse(String str, ParsePosition parsePosition) {
        try {
            return _parseDate(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }
}
