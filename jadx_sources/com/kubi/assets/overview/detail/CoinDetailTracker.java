package com.kubi.assets.overview.detail;

import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.entity.CurrencyBusinessDistributionTypeEnum;
import com.kubi.assets.entity.CurrencyDistributionItemResponse;
import com.kubi.otc.entity.OtcAd;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.overview.detail.n0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CoinDetailTracker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0014\u0010\t\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u001a\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007J\u0016\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0007J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/assets/overview/detail/CoinDetailTracker;", "", "<init>", "()V", "clickCoinList", "", FirebaseAnalytics.Param.CURRENCY, "", "exposeTitle", "exposeAllocation", "list", "", "Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;", "exposePNL", "profitLossRate", "Ljava/math/BigDecimal;", "coin", "clickButton", "type", "clickCandle", "symbol", "clickOngoing", JAnalysisConstants.Account.KEY_ACCOUNT, "exposeAvgPrice", FirebaseAnalytics.Param.PRICE, "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CoinDetailTracker {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final CoinDetailTracker f18371a = new CoinDetailTracker();

    /* JADX INFO: renamed from: g */
    public static final CharSequence m18633g(CurrencyDistributionItemResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CurrencyBusinessDistributionTypeEnum businessType = it.getBusinessType();
        return C27041f.m66668h(businessType != null ? businessType.getTrackerName() : null);
    }

    /* JADX INFO: renamed from: b */
    public final void m18634b(@NotNull String type, @NotNull String currency) throws JSONException {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(currency, "currency");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("coin", currency);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B1overviewCoin", type, "1", jSONObject);
    }

    /* JADX INFO: renamed from: c */
    public final void m18635c(@NotNull String symbol) throws JSONException {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("symbol", symbol);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B1overviewCoin", "candle", "1", jSONObject);
    }

    /* JADX INFO: renamed from: d */
    public final void m18636d(@NotNull String currency) throws JSONException {
        Intrinsics.checkNotNullParameter(currency, "currency");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("coin", currency);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B1overview", "coinList", "1", jSONObject);
    }

    /* JADX INFO: renamed from: e */
    public final void m18637e(@NotNull String account) {
        Intrinsics.checkNotNullParameter(account, "account");
        C43852m.m96591c("B1overviewCoin", "ongoing", account, null, 8, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m18638f(@NotNull List<CurrencyDistributionItemResponse> list) throws JSONException {
        Intrinsics.checkNotNullParameter(list, "list");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("topAssetAccount", CollectionsKt.joinToString$default(list, "、", null, null, 0, null, new Function1() { // from class: com.kubi.assets.overview.detail.m0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CoinDetailTracker.m18633g((CurrencyDistributionItemResponse) obj);
            }
        }, 30, null));
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("B1overviewCoin", "title", "1", jSONObject);
    }

    /* JADX INFO: renamed from: h */
    public final void m18639h(@Nullable String str, @Nullable String str2) throws JSONException {
        if (Intrinsics.areEqual(str, "--")) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("coin", str2);
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("B1overviewCoin", "coin", "avgPrice", jSONObject);
    }

    /* JADX INFO: renamed from: i */
    public final void m18640i(@Nullable BigDecimal bigDecimal, @Nullable String str) throws JSONException {
        if (bigDecimal == null) {
            bigDecimal = BigDecimal.ZERO;
        }
        if (bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("profit", "1");
            jSONObject.put("coin", str);
            Unit unit = Unit.INSTANCE;
            C43852m.m96593e("B1overviewCoin", "PNL", "1", jSONObject);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("profit", OtcAd.KYC_NOT_PASS);
        jSONObject2.put("coin", str);
        Unit unit2 = Unit.INSTANCE;
        C43852m.m96593e("B1overviewCoin", "PNL", "1", jSONObject2);
    }

    /* JADX INFO: renamed from: j */
    public final void m18641j(@NotNull String currency) throws JSONException {
        Intrinsics.checkNotNullParameter(currency, "currency");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("coin", currency);
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("B1overviewCoin", "title", "1", jSONObject);
    }
}
