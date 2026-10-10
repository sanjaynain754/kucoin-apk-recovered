package com.kubi.spot.kline.lite;

import com.kubi.flutter.widget.kline.KLineCdnRange;
import com.kubi.flutter.widget.kline.KLineType;
import com.tencent.thumbplayer.tcmedia.api.TPErrorCode;
import java.util.Calendar;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.spot.kline.lite.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: LiteKLineType.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000f\u001a\u00020\u0010*\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\tH\u0002J\u0011\u0010-\u001a\u00020.*\u00020\u0010H\u0000¢\u0006\u0002\b/J\u0018\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u0005H\u0002J \u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u00052\u0006\u00104\u001a\u000201H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u001b\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\u001d\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u001f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010!\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014R\u0011\u0010#\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0014R\u0011\u0010%\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0014R\u0011\u0010'\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0014R\u0011\u0010)\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0014R\u0011\u0010+\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0014¨\u00065"}, m90084d2 = {"Lcom/kubi/spot/kline/lite/LiteKLineType;", "", "<init>", "()V", "MINUTE", "", "HOUR", "DAY", "LITE_ONE_HOUR_NAME", "", "LITE_ONE_DAY_NAME", "LITE_ONE_WEEK_NAME", "LITE_ONE_MONTH_NAME", "LITE_ONE_YEAR_NAME", "LITE_THREE_YEAR_NAME", "toNewKLineType", "Lcom/kubi/flutter/widget/kline/KLineType;", "newName", "LITE_ONE_HOUR", "getLITE_ONE_HOUR", "()Lcom/kubi/flutter/widget/kline/KLineType;", "LITE_ONE_DAY", "getLITE_ONE_DAY", "LITE_ONE_WEEK", "getLITE_ONE_WEEK", "LITE_ONE_MONTH", "getLITE_ONE_MONTH", "LITE_ONE_YEAR", "getLITE_ONE_YEAR", "LITE_THREE_YEAR", "getLITE_THREE_YEAR", "CANDLE_ONE_MINUTE", "getCANDLE_ONE_MINUTE", "CANDLE_FIVE_MINUTE", "getCANDLE_FIVE_MINUTE", "CANDLE_FIFTEEN_MINUTE", "getCANDLE_FIFTEEN_MINUTE", "CANDLE_ONE_HOUR", "getCANDLE_ONE_HOUR", "CANDLE_EIGHT_HOUR", "getCANDLE_EIGHT_HOUR", "CANDLE_ONE_DAY", "getCANDLE_ONE_DAY", "CANDLE_ONE_WEEK", "getCANDLE_ONE_WEEK", "getLiteRange", "Lcom/kubi/flutter/widget/kline/KLineCdnRange;", "getLiteRange$SpotLib_googleRelease", "getMillSecBefore", "", "num", "field", "time", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LiteKLineType {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final LiteKLineType f50733a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final KLineType f50734b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final KLineType f50735c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final KLineType f50736d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final KLineType f50737e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final KLineType f50738f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final KLineType f50739g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final KLineType f50740h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final KLineType f50741i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final KLineType f50742j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final KLineType f50743k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final KLineType f50744l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final KLineType f50745m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final KLineType f50746n;

    static {
        LiteKLineType liteKLineType = new LiteKLineType();
        f50733a = liteKLineType;
        KLineType.Companion companion = KLineType.f22375e;
        f50734b = liteKLineType.m62149p(companion.getONE_MINUTE(), "1hour");
        f50735c = liteKLineType.m62149p(companion.getFIVE_MINUTE(), "1day");
        f50736d = liteKLineType.m62149p(companion.getTHIRTY_MINUTE(), "1week");
        f50737e = liteKLineType.m62149p(companion.getONE_HOUR(), "1month");
        f50738f = liteKLineType.m62149p(companion.getONE_DAY(), "1year");
        f50739g = liteKLineType.m62149p(companion.getONE_DAY(), "3year");
        f50740h = m62133q(liteKLineType, companion.getONE_MINUTE(), null, 1, null);
        f50741i = m62133q(liteKLineType, companion.getFIVE_MINUTE(), null, 1, null);
        f50742j = m62133q(liteKLineType, companion.getFIFTEEN_MINUTE(), null, 1, null);
        f50743k = m62133q(liteKLineType, companion.getONE_HOUR(), null, 1, null);
        f50744l = m62133q(liteKLineType, companion.getEIGHT_HOUR(), null, 1, null);
        f50745m = m62133q(liteKLineType, companion.getONE_DAY(), null, 1, null);
        f50746n = m62133q(liteKLineType, companion.getONE_WEEK(), null, 1, null);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ KLineType m62133q(LiteKLineType liteKLineType, KLineType kLineType, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        return liteKLineType.m62149p(kLineType, str);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final KLineType m62134a() {
        return f50744l;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final KLineType m62135b() {
        return f50742j;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final KLineType m62136c() {
        return f50741i;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final KLineType m62137d() {
        return f50745m;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final KLineType m62138e() {
        return f50743k;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final KLineType m62139f() {
        return f50740h;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final KLineType m62140g() {
        return f50746n;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final KLineType m62141h() {
        return f50735c;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final KLineType m62142i() {
        return f50734b;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final KLineType m62143j() {
        return f50737e;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final KLineType m62144k() {
        return f50736d;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final KLineType m62145l() {
        return f50738f;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final KLineType m62146m() {
        return f50739g;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final KLineCdnRange m62147n(@NotNull KLineType kLineType) {
        long jM62148o;
        Intrinsics.checkNotNullParameter(kLineType, "<this>");
        if (Intrinsics.areEqual(kLineType, f50734b)) {
            jM62148o = m62148o(1, 11);
        } else if (Intrinsics.areEqual(kLineType, f50735c)) {
            jM62148o = m62148o(1, 6);
        } else if (Intrinsics.areEqual(kLineType, f50736d)) {
            jM62148o = m62148o(7, 6);
        } else if (Intrinsics.areEqual(kLineType, f50737e)) {
            jM62148o = m62148o(30, 6);
        } else if (Intrinsics.areEqual(kLineType, f50738f)) {
            jM62148o = m62148o(1, 1);
        } else if (Intrinsics.areEqual(kLineType, f50739g)) {
            jM62148o = m62148o(3, 1);
        } else if (Intrinsics.areEqual(kLineType, f50740h)) {
            jM62148o = m62148o(1000, 12);
        } else if (Intrinsics.areEqual(kLineType, f50741i)) {
            jM62148o = m62148o(5000, 12);
        } else if (Intrinsics.areEqual(kLineType, f50742j)) {
            jM62148o = m62148o(15000, 12);
        } else if (Intrinsics.areEqual(kLineType, f50743k)) {
            jM62148o = m62148o(500, 11);
        } else if (Intrinsics.areEqual(kLineType, f50744l)) {
            jM62148o = m62148o(TPErrorCode.TP_ERROR_TYPE_DOWNLOAD_PROXY, 11);
        } else if (Intrinsics.areEqual(kLineType, f50745m)) {
            jM62148o = m62148o(500, 6);
        } else {
            jM62148o = Intrinsics.areEqual(kLineType, f50746n) ? m62148o(100, 3) : 0L;
        }
        long j11 = 1000;
        return new KLineCdnRange(jM62148o / j11, System.currentTimeMillis() / j11);
    }

    /* JADX INFO: renamed from: p */
    public final KLineType m62149p(KLineType kLineType, String str) {
        return new KLineType(kLineType.getType(), str, kLineType.getPeriod(), kLineType.getPageSize());
    }

    /* JADX INFO: renamed from: o */
    public final long m62148o(int i11, int i12) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(i12, -i11);
        return calendar.getTimeInMillis();
    }
}
