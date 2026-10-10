package com.tencent.rmonitor.common.util;

import com.tencent.rmonitor.common.logger.Logger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0007J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\n¨\u0006\u001c"}, m90084d2 = {"Lcom/tencent/rmonitor/common/util/TimeUtil;", "", "()V", "DEFAULT_DATE_FORMAT", "", "DEFAULT_TIMESTAMP_FORMAT", "TAG", "formatDateByUtc", "getFormatDateByUtc$annotations", "getFormatDateByUtc", "()Ljava/lang/String;", "formatDateByZone", "getFormatDateByZone$annotations", "getFormatDateByZone", "formatDateMs", "getFormatDateMs$annotations", "getFormatDateMs", "beforeTime", "", "firstTime", "secondTime", "getForwardHour", "what", "", "getForwardMinute", "getUtcDateFormat", "date", "Ljava/util/Date;", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class TimeUtil {

    @NotNull
    private static final String DEFAULT_DATE_FORMAT = "yyyyMMddHHmm";

    @NotNull
    private static final String DEFAULT_TIMESTAMP_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    @NotNull
    public static final TimeUtil INSTANCE = new TimeUtil();

    @NotNull
    private static final String TAG = "RMonitor_common_TimeUtil";

    @JvmStatic
    public static final boolean beforeTime(@NotNull String firstTime, @NotNull String secondTime) {
        Intrinsics.checkNotNullParameter(firstTime, "firstTime");
        Intrinsics.checkNotNullParameter(secondTime, "secondTime");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DEFAULT_DATE_FORMAT, Locale.US);
        try {
            return simpleDateFormat.parse(firstTime).before(simpleDateFormat.parse(secondTime));
        } catch (ParseException e11) {
            Logger.INSTANCE.exception(TAG, e11);
            return false;
        }
    }

    @NotNull
    public static final String getFormatDateByUtc() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DEFAULT_TIMESTAMP_FORMAT, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "dateFormat.format(Date())");
        return str;
    }

    @NotNull
    public static final String getFormatDateByZone() {
        String str = new SimpleDateFormat(DEFAULT_TIMESTAMP_FORMAT, Locale.US).format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "SimpleDateFormat(DEFAULT…Locale.US).format(Date())");
        return str;
    }

    @NotNull
    public static final String getFormatDateMs() {
        String str = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss.ms", Locale.US).format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "SimpleDateFormat(\"yyyy-M…Locale.US).format(Date())");
        return str;
    }

    @JvmStatic
    @NotNull
    public static final String getForwardHour(int what) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DEFAULT_DATE_FORMAT, Locale.US);
        Calendar calendar = Calendar.getInstance();
        calendar.add(10, what);
        String str = simpleDateFormat.format(calendar.getTime());
        Intrinsics.checkNotNullExpressionValue(str, "dateFormat.format(dateFrom)");
        return str;
    }

    @JvmStatic
    @NotNull
    public static final String getForwardMinute(int what) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DEFAULT_DATE_FORMAT, Locale.US);
        Calendar calendar = Calendar.getInstance();
        calendar.add(12, what);
        String str = simpleDateFormat.format(calendar.getTime());
        Intrinsics.checkNotNullExpressionValue(str, "dateFormat.format(dateFrom)");
        return str;
    }

    @JvmStatic
    @NotNull
    public static final String getUtcDateFormat(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DEFAULT_TIMESTAMP_FORMAT, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(str, "dateFormat.format(date)");
        return str;
    }

    private TimeUtil() {
    }

    @JvmStatic
    public static /* synthetic */ void getFormatDateByUtc$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getFormatDateByZone$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getFormatDateMs$annotations() {
    }
}
