package com.sensorsdata.analytics.android.sdk.util;

import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class TimeUtils {
    public static final String YYYY_MM_DD = "yyyy-MM-dd";
    private static final String YYYY_MM_DD_HH_MM_SS_SSS = "yyyy-MM-dd HH:mm:ss.SSS";
    private static Map<String, ThreadLocal<SimpleDateFormat>> formatMaps = new HashMap();

    public static double duration(long j11, long j12) {
        long j13 = j12 - j11;
        if (j13 >= 0 && j13 <= 86400000) {
            try {
                return Double.parseDouble(String.format(Locale.CHINA, "%.3f", Float.valueOf(j13 / 1000.0f)));
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        }
        return 0.0d;
    }

    public static String formatDate(Date date) {
        return formatDate(date, YYYY_MM_DD_HH_MM_SS_SSS);
    }

    public static boolean isDateValid(Date date) {
        try {
            return date.after(getDateFormat(YYYY_MM_DD_HH_MM_SS_SSS, Locale.getDefault()).parse("2015-05-15 10:24:00.000"));
        } catch (ParseException e11) {
            SALog.printStackTrace(e11);
            return false;
        }
    }

    public static String formatDate(Date date, String str) {
        return formatDate(date, str, Locale.getDefault());
    }

    private static synchronized SimpleDateFormat getDateFormat(final String str, final Locale locale) {
        ThreadLocal<SimpleDateFormat> threadLocal;
        try {
            threadLocal = formatMaps.get(str);
            if (threadLocal == null) {
                threadLocal = new ThreadLocal<SimpleDateFormat>() { // from class: com.sensorsdata.analytics.android.sdk.util.TimeUtils.1
                    @Override // java.lang.ThreadLocal
                    public SimpleDateFormat initialValue() {
                        try {
                            return locale == null ? new SimpleDateFormat(str, Locale.getDefault()) : new SimpleDateFormat(str, locale);
                        } catch (Exception e11) {
                            SALog.printStackTrace(e11);
                            return null;
                        }
                    }
                };
                if (threadLocal.get() != null) {
                    formatMaps.put(str, threadLocal);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return threadLocal.get();
    }

    public static String formatDate(Date date, Locale locale) {
        return formatDate(date, YYYY_MM_DD_HH_MM_SS_SSS, locale);
    }

    public static String formatTime(long j11, String str) {
        if (TextUtils.isEmpty(str)) {
            str = YYYY_MM_DD_HH_MM_SS_SSS;
        }
        SimpleDateFormat dateFormat = getDateFormat(str, Locale.getDefault());
        if (dateFormat != null) {
            try {
                return dateFormat.format(Long.valueOf(j11));
            } catch (IllegalArgumentException e11) {
                SALog.printStackTrace(e11);
                return "";
            }
        }
        return "";
    }

    public static Integer getZoneOffset() {
        try {
            Calendar calendar = Calendar.getInstance(Locale.getDefault());
            return Integer.valueOf((-(calendar.get(15) + calendar.get(16))) / 60000);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return null;
        }
    }

    public static String formatDate(Date date, String str, Locale locale) {
        if (TextUtils.isEmpty(str)) {
            str = YYYY_MM_DD_HH_MM_SS_SSS;
        }
        SimpleDateFormat dateFormat = getDateFormat(str, locale);
        if (dateFormat != null) {
            try {
                return dateFormat.format(date);
            } catch (IllegalArgumentException e11) {
                SALog.printStackTrace(e11);
                return "";
            }
        }
        return "";
    }

    public static boolean isDateValid(long j11) {
        try {
            Date date = getDateFormat(YYYY_MM_DD_HH_MM_SS_SSS, Locale.getDefault()).parse("2015-05-15 10:24:00.000");
            return date != null && date.getTime() < j11;
        } catch (ParseException e11) {
            SALog.printStackTrace(e11);
            return false;
        }
    }

    public static JSONObject formatDate(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof Date) {
                    jSONObject.put(next, formatDate((Date) obj, Locale.CHINA));
                }
            }
        } catch (JSONException e11) {
            SALog.printStackTrace(e11);
        }
        return jSONObject;
    }
}
