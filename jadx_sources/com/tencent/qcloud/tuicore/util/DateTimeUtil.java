package com.tencent.qcloud.tuicore.util;

import android.content.Context;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.qcloud.tuicore.C35071R;
import com.tencent.qcloud.tuicore.TUIConfig;
import com.tencent.qcloud.tuicore.TUIThemeManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes56.dex */
public class DateTimeUtil {
    private static final long day = 86400000;
    private static final long hour = 3600000;
    private static final long minute = 60000;
    private static final long month = 2678400000L;
    private static final long week = 604800000;
    private static final long year = 32140800000L;

    public static String formatSeconds(long j11) {
        Context appContext = TUIConfig.getAppContext();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j11);
        int i11 = C35071R.string.date_second_short;
        sb2.append(appContext.getString(i11));
        String string = sb2.toString();
        if (j11 > 60) {
            long j12 = j11 % 60;
            long j13 = j11 / 60;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(j13);
            int i12 = C35071R.string.date_minute_short;
            sb3.append(appContext.getString(i12));
            sb3.append(j12);
            sb3.append(appContext.getString(i11));
            string = sb3.toString();
            if (j13 > 60) {
                long j14 = j13 % 60;
                long j15 = j13 / 60;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(j15);
                int i13 = C35071R.string.date_hour_short;
                sb4.append(appContext.getString(i13));
                sb4.append(j14);
                sb4.append(appContext.getString(i12));
                sb4.append(j12);
                sb4.append(appContext.getString(i11));
                string = sb4.toString();
                long j16 = j15 % 24;
                if (j16 == 0) {
                    return (j15 / 24) + appContext.getString(C35071R.string.date_day_short);
                }
                if (j15 > 24) {
                    return (j15 / 24) + appContext.getString(C35071R.string.date_day_short) + j16 + appContext.getString(i13) + j14 + appContext.getString(i12) + j12 + appContext.getString(i11);
                }
            }
        }
        return string;
    }

    public static String formatSecondsTo00(int i11) {
        String str;
        StringBuilder sb2;
        String str2;
        StringBuilder sb3;
        StringBuilder sb4;
        StringBuilder sb5;
        int i12 = i11 % 60;
        int i13 = i11 / 60;
        if (i13 <= 0) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("00:");
            if (i12 >= 10) {
                str = i12 + "";
            } else {
                str = "0" + i12;
            }
            sb6.append(str);
            return sb6.toString();
        }
        int i14 = i13 % 60;
        int i15 = i13 / 60;
        if (i15 <= 0) {
            StringBuilder sb7 = new StringBuilder();
            if (i14 >= 10) {
                sb2 = new StringBuilder();
                sb2.append(i14);
                sb2.append("");
            } else {
                sb2 = new StringBuilder();
                sb2.append("0");
                sb2.append(i14);
            }
            sb7.append(sb2.toString());
            sb7.append(C33844oi.f71346o);
            if (i12 >= 10) {
                str2 = i12 + "";
            } else {
                str2 = "0" + i12;
            }
            sb7.append(str2);
            return sb7.toString();
        }
        StringBuilder sb8 = new StringBuilder();
        if (i15 >= 10) {
            sb3 = new StringBuilder();
            sb3.append(i15);
            sb3.append("");
        } else {
            sb3 = new StringBuilder();
            sb3.append("0");
            sb3.append(i15);
        }
        sb8.append(sb3.toString());
        sb8.append(C33844oi.f71346o);
        if (i14 >= 10) {
            sb4 = new StringBuilder();
            sb4.append(i14);
            sb4.append("");
        } else {
            sb4 = new StringBuilder();
            sb4.append("0");
            sb4.append(i14);
        }
        sb8.append(sb4.toString());
        sb8.append(C33844oi.f71346o);
        if (i12 >= 10) {
            sb5 = new StringBuilder();
            sb5.append(i12);
            sb5.append("");
        } else {
            sb5 = new StringBuilder();
            sb5.append("0");
            sb5.append(i12);
        }
        sb8.append(sb5.toString());
        return sb8.toString();
    }

    public static String getHMTimeString(Date date) {
        if (date == null) {
            return "";
        }
        Context appContext = TUIConfig.getAppContext();
        return String.format(appContext == null ? Locale.getDefault() : TUIThemeManager.getInstance().getLocale(appContext), "%tR", date);
    }

    public static long getStringToDate(String str, String str2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        Date date = new Date();
        try {
            date = simpleDateFormat.parse(str);
        } catch (ParseException e11) {
            e11.printStackTrace();
        }
        return date.getTime();
    }

    public static String getTimeFormatText(Date date) {
        if (date == null) {
            return "";
        }
        Context appContext = TUIConfig.getAppContext();
        Locale locale = appContext == null ? Locale.getDefault() : TUIThemeManager.getInstance().getLocale(appContext);
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setFirstDayOfWeek(1);
        calendar2.set(7, 1);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(6, 1);
        calendar3.set(11, 0);
        calendar3.set(12, 0);
        calendar3.set(13, 0);
        calendar3.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        long timeInMillis2 = calendar2.getTimeInMillis();
        long timeInMillis3 = calendar3.getTimeInMillis();
        long time = date.getTime();
        if (time < timeInMillis3) {
            return String.format(Locale.US, "%tD", date);
        }
        if (time < timeInMillis2) {
            return String.format(Locale.US, "%1$tm/%1$td", date);
        }
        return time < timeInMillis ? String.format(locale, "%tA", date) : String.format(Locale.US, "%tR", date);
    }

    public static String getTimeStringFromDate(Date date, String str) {
        return new SimpleDateFormat(str).format(date);
    }
}
