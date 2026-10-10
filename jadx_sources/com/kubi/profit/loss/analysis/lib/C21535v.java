package com.kubi.profit.loss.analysis.lib;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p402kf.C41014a;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.profit.loss.analysis.lib.v */
/* JADX INFO: compiled from: AssetsProfitLossAnalysisUtils.kt */
/* JADX INFO: loaded from: classes35.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0001H\u0000\u001a\f\u0010\n\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u001c\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u000fH\u0000\u001a4\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0000\u001a4\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0000\u001a\u0016\u0010\u0018\u001a\u00020\f*\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u0001H\u0000\u001a\u0012\u0010\u001a\u001a\u00020\f*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d\u001a\u000e\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0001\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006 "}, m90084d2 = {"getValueSymbol", "", "Ljava/math/BigDecimal;", "getRealPrice", "getRealAbsPrice", FirebaseAnalytics.Param.PRICE, "", "getPrice", "(D)D", FirebaseAnalytics.Param.CURRENCY, "getValueSymbolPrice", "safeCall", "", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function0;", "profitLossExpose", "pageId", "blockId", "locationId", ReportDataTable.COLUMN_PARAMS, "Lorg/json/JSONObject;", "profitLossClick", "HOME_DEFAULT_LOG_TAG", "log", "tag", "visibleOrGone", "Landroid/view/View;", "isShow", "", "exposeOverviewPnl", "type", "ProfitLossAnalysisLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetsProfitLossAnalysisUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetsProfitLossAnalysisUtils.kt\ncom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisUtilsKt\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ProfitLossAnalysisIssue.kt\ncom/kubi/profit/loss/analysis/exception/ProfitLossAnalysisIssueKt\n*L\n1#1,160:1\n50#2,17:161\n1#3:178\n44#4,2:179\n*S KotlinDebug\n*F\n+ 1 AssetsProfitLossAnalysisUtils.kt\ncom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisUtilsKt\n*L\n73#1:161,17\n75#1:179,2\n*E\n"})
public final class C21535v {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX INFO: renamed from: a */
    public static final void m50063a(@NotNull String type) {
        String str;
        Intrinsics.checkNotNullParameter(type, "type");
        switch (type) {
            case "LAST_90_DAYS":
                str = "move3M";
                break;
            case "LAST_1_DAY":
                str = "move1D";
                break;
            case "LAST_180_DAYS":
                str = "move6M";
                break;
            case "LAST_30_DAYS":
                str = "move30D";
                break;
            case "LAST_7_DAYS":
                str = "move7D";
                break;
            default:
                str = "";
                break;
        }
        C43852m.m96595g("B1overview", "assetTrendNew", str, null, 8, null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m50064b(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m50067e(bigDecimal));
        BigDecimal bigDecimalAbs = bigDecimal.abs();
        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
        sb2.append(C27041f.m66669i(C41014a.m89950x(C41014a.m89940n(bigDecimalAbs, "USDT"), null, null, 0, false, false, false, true, 47, null), "--"));
        return sb2.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m50065c(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        BigDecimal bigDecimalAbs = new BigDecimal(str).abs();
        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
        return C27041f.m66669i(C41014a.m89950x(C41014a.m89940n(bigDecimalAbs, "USDT"), null, null, 0, false, false, false, true, 47, null), "--");
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m50066d(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return C27041f.m66669i(C41014a.m89950x(C41014a.m89940n(bigDecimal, "USDT"), null, null, 0, false, false, false, true, 47, null), "--");
    }

    /* JADX INFO: renamed from: e */
    public static final String m50067e(BigDecimal bigDecimal) {
        int iCompareTo = bigDecimal.compareTo(BigDecimal.ZERO);
        if (iCompareTo != -1) {
            return iCompareTo != 1 ? "" : "+ ";
        }
        return "- ";
    }

    /* JADX INFO: renamed from: f */
    public static final void m50068f(@NotNull String str, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        C44128b.m97259c(tag, str);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m50069g(String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str2 = "ProfitLoss";
        }
        m50068f(str, str2);
    }

    /* JADX INFO: renamed from: h */
    public static final void m50070h(@NotNull String pageId, @Nullable String str, @NotNull String locationId, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        m50069g("【盈亏分析点击埋点】-> pageId:" + pageId + " blockId:" + str + " locationId:" + locationId + " params:" + jSONObject, null, 1, null);
        C43852m.m96589a(pageId, C27041f.m66668h(str), locationId, jSONObject);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m50071i(String str, String str2, String str3, JSONObject jSONObject, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "B1assets";
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            str3 = "1";
        }
        if ((i11 & 8) != 0) {
            jSONObject = null;
        }
        m50070h(str, str2, str3, jSONObject);
    }

    /* JADX INFO: renamed from: j */
    public static final void m50072j(@NotNull String pageId, @Nullable String str, @NotNull String locationId, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        m50069g("【盈亏分析曝光埋点】-> pageId:" + pageId + " blockId:" + str + " locationId:" + locationId + " params:" + jSONObject, null, 1, null);
        C43852m.m96593e(pageId, C27041f.m66668h(str), locationId, jSONObject);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m50073k(String str, String str2, String str3, JSONObject jSONObject, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "B1assets";
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            str3 = "1";
        }
        if ((i11 & 8) != 0) {
            jSONObject = null;
        }
        m50072j(str, str2, str3, jSONObject);
    }

    /* JADX INFO: renamed from: l */
    public static final void m50074l(@NotNull View view, boolean z11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z11) {
            ViewExtKt.m66594y(view);
        } else {
            ViewExtKt.m66577h(view);
        }
    }
}
