package com.google.android.material.datepicker;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import com.google.android.material.C7090R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes45.dex */
class DateStrings {
    public static Pair<String, String> getDateRangeString(@Nullable Long l11, @Nullable Long l12) {
        return getDateRangeString(l11, l12, null);
    }

    public static String getDateString(long j11) {
        return getDateString(j11, null);
    }

    public static String getMonthDay(long j11) {
        return getMonthDay(j11, Locale.getDefault());
    }

    public static String getMonthDayOfWeekDay(long j11) {
        return getMonthDayOfWeekDay(j11, Locale.getDefault());
    }

    public static String getYearMonthDay(long j11) {
        return getYearMonthDay(j11, Locale.getDefault());
    }

    public static String getYearMonthDayOfWeekDay(long j11) {
        return getYearMonthDayOfWeekDay(j11, Locale.getDefault());
    }

    public static Pair<String, String> getDateRangeString(@Nullable Long l11, @Nullable Long l12, @Nullable SimpleDateFormat simpleDateFormat) {
        if (l11 == null && l12 == null) {
            return Pair.create(null, null);
        }
        if (l11 == null) {
            return Pair.create(null, getDateString(l12.longValue(), simpleDateFormat));
        }
        if (l12 == null) {
            return Pair.create(getDateString(l11.longValue(), simpleDateFormat), null);
        }
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(l11.longValue());
        Calendar utcCalendar2 = UtcDates.getUtcCalendar();
        utcCalendar2.setTimeInMillis(l12.longValue());
        if (simpleDateFormat != null) {
            return Pair.create(simpleDateFormat.format(new Date(l11.longValue())), simpleDateFormat.format(new Date(l12.longValue())));
        }
        if (utcCalendar.get(1) == utcCalendar2.get(1)) {
            return utcCalendar.get(1) == todayCalendar.get(1) ? Pair.create(getMonthDay(l11.longValue(), Locale.getDefault()), getMonthDay(l12.longValue(), Locale.getDefault())) : Pair.create(getMonthDay(l11.longValue(), Locale.getDefault()), getYearMonthDay(l12.longValue(), Locale.getDefault()));
        }
        return Pair.create(getYearMonthDay(l11.longValue(), Locale.getDefault()), getYearMonthDay(l12.longValue(), Locale.getDefault()));
    }

    public static String getDateString(long j11, @Nullable SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j11));
        }
        return isDateWithinCurrentYear(j11) ? getMonthDay(j11) : getYearMonthDay(j11);
    }

    public static String getMonthDay(long j11, Locale locale) {
        return UtcDates.getAbbrMonthDayFormat(locale).format(new Date(j11));
    }

    public static String getMonthDayOfWeekDay(long j11, Locale locale) {
        return UtcDates.getMonthWeekdayDayFormat(locale).format(new Date(j11));
    }

    public static String getYearMonthDay(long j11, Locale locale) {
        return UtcDates.getYearAbbrMonthDayFormat(locale).format(new Date(j11));
    }

    public static String getYearMonthDayOfWeekDay(long j11, Locale locale) {
        return UtcDates.getYearMonthWeekdayDayFormat(locale).format(new Date(j11));
    }

    private DateStrings() {
    }

    public static String getDayContentDescription(Context context, long j11, boolean z11, boolean z12, boolean z13) {
        String optionalYearMonthDayOfWeekDay = getOptionalYearMonthDayOfWeekDay(j11);
        if (z11) {
            optionalYearMonthDayOfWeekDay = String.format(context.getString(C7090R.string.mtrl_picker_today_description), optionalYearMonthDayOfWeekDay);
        }
        if (z12) {
            return String.format(context.getString(C7090R.string.mtrl_picker_start_date_description), optionalYearMonthDayOfWeekDay);
        }
        if (z13) {
            return String.format(context.getString(C7090R.string.mtrl_picker_end_date_description), optionalYearMonthDayOfWeekDay);
        }
        return optionalYearMonthDayOfWeekDay;
    }

    public static String getOptionalYearMonthDayOfWeekDay(long j11) {
        if (isDateWithinCurrentYear(j11)) {
            return getMonthDayOfWeekDay(j11);
        }
        return getYearMonthDayOfWeekDay(j11);
    }

    public static String getYearContentDescription(Context context, int i11) {
        if (UtcDates.getTodayCalendar().get(1) == i11) {
            return String.format(context.getString(C7090R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i11));
        }
        return String.format(context.getString(C7090R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i11));
    }

    public static String getYearMonth(long j11) {
        return UtcDates.getYearMonthFormat(Locale.getDefault()).format(new Date(j11));
    }

    private static boolean isDateWithinCurrentYear(long j11) {
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(j11);
        if (todayCalendar.get(1) == utcCalendar.get(1)) {
            return true;
        }
        return false;
    }
}
