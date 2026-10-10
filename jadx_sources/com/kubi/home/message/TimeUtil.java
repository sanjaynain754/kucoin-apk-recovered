package com.kubi.home.message;

import cn.jiguang.privates.push.constants.JPushConstants;
import com.kubi.home.R$string;
import com.kubi.kumex.data.market.model.FundingRateEntity;
import com.kubi.sdk.BaseApplication;
import java.util.Arrays;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.kubi.home.message.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TimeUtil.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/home/message/TimeUtil;", "", "<init>", "()V", "minute", "", "hour", JPushConstants.NotificationTime.KEY_DAYS, "week", "month", "year", "getTimeFormatText", "", "time", "(Ljava/lang/Long;)Ljava/lang/String;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TimeUtil {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TimeUtil f25835a = new TimeUtil();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m29508a(@Nullable Long l11) {
        if (l11 == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - l11.longValue();
        if (jCurrentTimeMillis > 32140800000L) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.getDefault();
            String string = BaseApplication.INSTANCE.get().getString(R$string.message_box_pre_years);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String str = String.format(locale, string, Arrays.copyOf(new Object[]{Long.valueOf(jCurrentTimeMillis / 32140800000L)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        if (jCurrentTimeMillis > 2678400000L) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            Locale locale2 = Locale.getDefault();
            String string2 = BaseApplication.INSTANCE.get().getString(R$string.message_box_pre_moons);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String str2 = String.format(locale2, string2, Arrays.copyOf(new Object[]{Long.valueOf(jCurrentTimeMillis / 2678400000L)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return str2;
        }
        if (jCurrentTimeMillis > 604800000) {
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            Locale locale3 = Locale.getDefault();
            String string3 = BaseApplication.INSTANCE.get().getString(R$string.message_box_pre_weeks);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String str3 = String.format(locale3, string3, Arrays.copyOf(new Object[]{Long.valueOf(jCurrentTimeMillis / 604800000)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            return str3;
        }
        if (jCurrentTimeMillis > 86400000) {
            StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
            Locale locale4 = Locale.getDefault();
            String string4 = BaseApplication.INSTANCE.get().getString(R$string.message_box_pre_days);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            String str4 = String.format(locale4, string4, Arrays.copyOf(new Object[]{Long.valueOf(jCurrentTimeMillis / 86400000)}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
            return str4;
        }
        if (jCurrentTimeMillis > FundingRateEntity.MILLIS_PER_HOUR) {
            StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
            Locale locale5 = Locale.getDefault();
            String string5 = BaseApplication.INSTANCE.get().getString(R$string.message_box_pre_hours);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            String str5 = String.format(locale5, string5, Arrays.copyOf(new Object[]{Long.valueOf(jCurrentTimeMillis / FundingRateEntity.MILLIS_PER_HOUR)}, 1));
            Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
            return str5;
        }
        if (jCurrentTimeMillis > 60000) {
            StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
            Locale locale6 = Locale.getDefault();
            String string6 = BaseApplication.INSTANCE.get().getString(R$string.message_box_pre_minutes);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            String str6 = String.format(locale6, string6, Arrays.copyOf(new Object[]{Long.valueOf(jCurrentTimeMillis / 60000)}, 1));
            Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
            return str6;
        }
        StringCompanionObject stringCompanionObject7 = StringCompanionObject.INSTANCE;
        Locale locale7 = Locale.getDefault();
        String string7 = BaseApplication.INSTANCE.get().getString(R$string.message_box_pre_minutes);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        String str7 = String.format(locale7, string7, Arrays.copyOf(new Object[]{1}, 1));
        Intrinsics.checkNotNullExpressionValue(str7, "format(...)");
        return str7;
    }
}
