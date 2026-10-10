package com.kubi.assets.history;

import android.content.Context;
import com.kubi.assets.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.DowngradeExKt;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.kubi.assets.history.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FilterTimeHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/assets/history/FilterTimeHelper;", "", "<init>", "()V", "getNormalTimeTypeMap", "Ljava/util/LinkedHashMap;", "", "context", "Landroid/content/Context;", "getTransferTimeTypeMap", "getStart", "time", "beforeGet", "Lcom/kubi/utils/TimeUtils$BeforeGet;", "formatTime", "hourUnit", "hours", "", "minUnit", "it", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FilterTimeHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FilterTimeHelper f17645a = new FilterTimeHelper();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m17310a(@NotNull String time) {
        Long lM66547q;
        Intrinsics.checkNotNullParameter(time, "time");
        if (time.length() == 0 || (lM66547q = DowngradeExKt.m66547q(time)) == null) {
            return "";
        }
        long jLongValue = lM66547q.longValue();
        if (jLongValue == 0) {
            return "";
        }
        if (jLongValue < 60) {
            return " ≈ " + f17645a.m17315f(jLongValue, time);
        }
        long j11 = jLongValue / ((long) 60);
        int iCeil = (int) Math.ceil(jLongValue % 60.0d);
        StringBuilder sb2 = new StringBuilder();
        FilterTimeHelper filterTimeHelper = f17645a;
        sb2.append(filterTimeHelper.m17314e(j11));
        sb2.append(' ');
        sb2.append(filterTimeHelper.m17315f(iCeil, String.valueOf(iCeil)));
        return " ≈ " + sb2.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final LinkedHashMap<String, String> m17311b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("ONE_WEEK", context.getString(R$string.one_week));
        linkedHashMap.put("ONE_MONTH", context.getString(R$string.one_month));
        linkedHashMap.put("THREE_MONTH", context.getString(R$string.three_month));
        linkedHashMap.put("HALF_YEAR", context.getString(R$string.half_year));
        linkedHashMap.put("ONE_YEAR", context.getString(R$string.one_year));
        return linkedHashMap;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m17312c(@NotNull String time, @NotNull TimeUtils.C27004b beforeGet) {
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(beforeGet, "beforeGet");
        switch (time.hashCode()) {
            case -1480287667:
                return !time.equals("ONE_WEEK") ? "" : String.valueOf(beforeGet.m66434a(7, 6));
            case -1480228202:
                return !time.equals("ONE_YEAR") ? "" : String.valueOf(beforeGet.m66434a(365, 6));
            case -601958909:
                return time.equals("ONE_DAY") ? String.valueOf(beforeGet.m66434a(1, 6)) : "";
            case -170154913:
                return !time.equals("THREE_MONTH") ? "" : String.valueOf(beforeGet.m66434a(90, 6));
            case 1151117513:
                return !time.equals("HALF_YEAR") ? "" : String.valueOf(beforeGet.m66434a(180, 6));
            case 1346794279:
                return !time.equals("ONE_MONTH") ? "" : String.valueOf(beforeGet.m66434a(30, 6));
            default:
                return "";
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final LinkedHashMap<String, String> m17313d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("ONE_DAY", context.getString(R$string.one_day));
        linkedHashMap.put("ONE_WEEK", context.getString(R$string.one_week));
        linkedHashMap.put("ONE_MONTH", context.getString(R$string.one_month));
        linkedHashMap.put("THREE_MONTH", context.getString(R$string.three_month));
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: e */
    public final String m17314e(long j11) {
        if (j11 == 1) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.ENGLISH, C27017c.f54310a.m66516f(R$string.withdrawl_time_hour, new Object[0]), Arrays.copyOf(new Object[]{Long.valueOf(j11)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(Locale.ENGLISH, C27017c.f54310a.m66516f(R$string.withdrawl_time_hours, new Object[0]), Arrays.copyOf(new Object[]{Long.valueOf(j11)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    /* JADX INFO: renamed from: f */
    public final String m17315f(long j11, String str) {
        if (j11 == 1) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format(Locale.ENGLISH, C27017c.f54310a.m66516f(R$string.withdrawl_time_min, new Object[0]), Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return str2;
        }
        if (j11 == 0) {
            return "";
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str3 = String.format(Locale.ENGLISH, C27017c.f54310a.m66516f(R$string.withdrawl_time_mins, new Object[0]), Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        return str3;
    }
}
