package cn.jiguang.privates.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes34.dex */
public class DateUtil {
    private static final Object lock = new Object();
    private static ConcurrentHashMap<String, ThreadLocal<SimpleDateFormat>> sdfMap = new ConcurrentHashMap<>();
    public static String PATTERN_DATETIME_FILENAME = "yyyyMMdd_HHmm";

    public static class DateFormatThreadLocal extends ThreadLocal<SimpleDateFormat> {
        private String pattern;

        @Override // java.lang.ThreadLocal
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat(this.pattern, Locale.ENGLISH);
        }

        public DateFormatThreadLocal(String str) {
            this.pattern = str;
        }
    }

    public static SimpleDateFormat getSdf(String str) {
        ThreadLocal<SimpleDateFormat> dateFormatThreadLocal = sdfMap.get(str);
        if (dateFormatThreadLocal == null) {
            synchronized (lock) {
                try {
                    dateFormatThreadLocal = sdfMap.get(str);
                    if (dateFormatThreadLocal == null) {
                        dateFormatThreadLocal = new DateFormatThreadLocal(str);
                        sdfMap.put(str, dateFormatThreadLocal);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return dateFormatThreadLocal.get();
    }

    public static String getTodayDateTimeForFilename() {
        return getSdf(PATTERN_DATETIME_FILENAME).format(new Date());
    }

    public static boolean isDaysAgo(Date date, int i11) {
        if (date == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(date.getTime());
        calendar.roll(6, -i11);
        return calendar.after(calendar2);
    }

    public static Date parseDateInFilename(String str) {
        try {
            return getSdf(PATTERN_DATETIME_FILENAME).parse(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getTodayDateTime() {
        return getSdf("yyyyMMddHHmmss").format(new Date());
    }

    public static String getTodayDateTimeForReport() {
        return getSdf("yyyy-MM-dd_HH:mm:ss").format(new Date());
    }
}
