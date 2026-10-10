package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DisplayContext;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.C7090R;
import com.tencent.bugly.proguard.C33627eb;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes45.dex */
class UtcDates {
    static final String UTC = "UTC";
    static AtomicReference<TimeSource> timeSourceRef = new AtomicReference<>();

    public static SimpleDateFormat getDefaultTextInputFormat() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(getDatePatternAsInputFormat(((SimpleDateFormat) DateFormat.getDateInstance(3, Locale.getDefault())).toPattern()), Locale.getDefault());
        simpleDateFormat.setTimeZone(getTimeZone());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    public static DateFormat getFullFormat() {
        return getFullFormat(Locale.getDefault());
    }

    public static DateFormat getMediumFormat() {
        return getMediumFormat(Locale.getDefault());
    }

    public static DateFormat getMediumNoYear() {
        return getMediumNoYear(Locale.getDefault());
    }

    public static SimpleDateFormat getSimpleFormat(String str) {
        return getSimpleFormat(str, Locale.getDefault());
    }

    public static Calendar getUtcCalendar() {
        return getUtcCalendarOf(null);
    }

    @NonNull
    private static String removeYearFromDateFormatPattern(@NonNull String str) {
        int iFindCharactersInDateFormatPattern = findCharactersInDateFormatPattern(str, "yY", 1, 0);
        if (iFindCharactersInDateFormatPattern >= str.length()) {
            return str;
        }
        String str2 = "EMd";
        int iFindCharactersInDateFormatPattern2 = findCharactersInDateFormatPattern(str, "EMd", 1, iFindCharactersInDateFormatPattern);
        if (iFindCharactersInDateFormatPattern2 < str.length()) {
            str2 = "EMd,";
        }
        return str.replace(str.substring(findCharactersInDateFormatPattern(str, str2, -1, iFindCharactersInDateFormatPattern) + 1, iFindCharactersInDateFormatPattern2), C33627eb.f69716f).trim();
    }

    private static int findCharactersInDateFormatPattern(@NonNull String str, @NonNull String str2, int i11, int i12) {
        while (i12 >= 0 && i12 < str.length() && str2.indexOf(str.charAt(i12)) == -1) {
            if (str.charAt(i12) == '\'') {
                do {
                    i12 += i11;
                    if (i12 < 0 || i12 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i12) != '\'');
            }
            i12 += i11;
        }
        return i12;
    }

    @TargetApi(24)
    public static android.icu.text.DateFormat getAbbrMonthDayFormat(Locale locale) {
        return getAndroidFormat("MMMd", locale);
    }

    @NonNull
    public static String getDatePatternAsInputFormat(@NonNull String str) {
        return str.replaceAll("[^dMy/\\-.]", "").replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", "").replaceAll("My", "M/y");
    }

    public static DateFormat getFullFormat(Locale locale) {
        return getFormat(0, locale);
    }

    public static DateFormat getMediumFormat(Locale locale) {
        return getFormat(2, locale);
    }

    public static DateFormat getMediumNoYear(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) getMediumFormat(locale);
        simpleDateFormat.applyPattern(removeYearFromDateFormatPattern(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    @TargetApi(24)
    public static android.icu.text.DateFormat getMonthWeekdayDayFormat(Locale locale) {
        return getAndroidFormat("MMMMEEEEd", locale);
    }

    private static SimpleDateFormat getSimpleFormat(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(getTimeZone());
        return simpleDateFormat;
    }

    public static TimeSource getTimeSource() {
        TimeSource timeSource = timeSourceRef.get();
        return timeSource == null ? TimeSource.system() : timeSource;
    }

    private static TimeZone getTimeZone() {
        return TimeZone.getTimeZone(UTC);
    }

    @TargetApi(24)
    private static android.icu.util.TimeZone getUtcAndroidTimeZone() {
        return android.icu.util.TimeZone.getTimeZone(UTC);
    }

    public static void setTimeSource(@Nullable TimeSource timeSource) {
        timeSourceRef.set(timeSource);
    }

    private UtcDates() {
    }

    public static long canonicalYearMonthDay(long j11) {
        Calendar utcCalendar = getUtcCalendar();
        utcCalendar.setTimeInMillis(j11);
        return getDayCopy(utcCalendar).getTimeInMillis();
    }

    @TargetApi(24)
    private static android.icu.text.DateFormat getAndroidFormat(String str, Locale locale) {
        android.icu.text.DateFormat instanceForSkeleton = android.icu.text.DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(getUtcAndroidTimeZone());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    public static Calendar getDayCopy(Calendar calendar) {
        Calendar utcCalendarOf = getUtcCalendarOf(calendar);
        Calendar utcCalendar = getUtcCalendar();
        utcCalendar.set(utcCalendarOf.get(1), utcCalendarOf.get(2), utcCalendarOf.get(5));
        return utcCalendar;
    }

    public static String getDefaultTextInputHint(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(C7090R.string.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(C7090R.string.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(C7090R.string.mtrl_picker_text_input_day_abbr);
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage())) {
            pattern = pattern.replaceAll("d+", "d").replaceAll("M+", "M").replaceAll("y+", "y");
        }
        return pattern.replace("d", string3).replace("M", string2).replace("y", string);
    }

    private static DateFormat getFormat(int i11, Locale locale) {
        DateFormat dateInstance = DateFormat.getDateInstance(i11, locale);
        dateInstance.setTimeZone(getTimeZone());
        return dateInstance;
    }

    public static DateFormat getNormalizedFormat(@NonNull DateFormat dateFormat) {
        DateFormat dateFormat2 = (DateFormat) dateFormat.clone();
        dateFormat2.setTimeZone(getTimeZone());
        return dateFormat2;
    }

    public static Calendar getTodayCalendar() {
        Calendar calendarNow = getTimeSource().now();
        calendarNow.set(11, 0);
        calendarNow.set(12, 0);
        calendarNow.set(13, 0);
        calendarNow.set(14, 0);
        calendarNow.setTimeZone(getTimeZone());
        return calendarNow;
    }

    public static Calendar getUtcCalendarOf(@Nullable Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(getTimeZone());
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    @TargetApi(24)
    public static android.icu.text.DateFormat getYearAbbrMonthDayFormat(Locale locale) {
        return getAndroidFormat("yMMMd", locale);
    }

    @TargetApi(24)
    public static android.icu.text.DateFormat getYearMonthFormat(Locale locale) {
        return getAndroidFormat("yMMMM", locale);
    }

    @TargetApi(24)
    public static android.icu.text.DateFormat getYearMonthWeekdayDayFormat(Locale locale) {
        return getAndroidFormat("yMMMMEEEEd", locale);
    }
}
