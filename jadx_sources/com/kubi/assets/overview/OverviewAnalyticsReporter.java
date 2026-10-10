package com.kubi.assets.overview;

import androidx.media3.extractor.text.ttml.TtmlNode;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.entity.AssetTrackEntity;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.EarnBalance;
import com.kubi.assets.entity.EquityEntity;
import com.kubi.assets.entity.ProfitEventPoint;
import com.kubi.data.entity.AssetSingleEntity;
import com.kubi.data.entity.SubAssetEntity;
import com.kubi.margin.api.entity.IsolateMarginPosition;
import com.kubi.margin.api.entity.LeverBalance;
import com.kubi.profit.loss.analysis.api.AssetsProfitLossAnalysisManager;
import com.kubi.utils.extensions.C27041f;
import com.trtc.uikit.livekit.p180kc.data.entity.ClickCardReport;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p402kf.C41014a;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.assets.overview.b1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: OverviewAnalyticsReporter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0016\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bJ\u001e\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001aJ\u0016\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001aJ \u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u001aJ \u0010 \u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u001aJ%\u0010!\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0002\u0010\"J%\u0010#\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0002\u0010\"J'\u0010$\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00052\b\u0010%\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010&J\u0018\u0010'\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005J*\u0010(\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00052\b\u0010)\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u001aJ*\u0010*\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00052\b\u0010)\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u001aJ\u0010\u0010+\u001a\u00020\u00052\b\u0010,\u001a\u0004\u0018\u00010-J\u0016\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u0005J\u0016\u00101\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u0005J\u000e\u00102\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u00063"}, m90084d2 = {"Lcom/kubi/assets/overview/OverviewAnalyticsReporter;", "", "<init>", "()V", "pageId", "", "reportEvent", "", "eventName", "reportCoinListCount", "count", "", "reportAssetData", "asset", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "reportTabBtn", ViewProps.POSITION, "exposeTabBtn", "exposeRecommendationPage", "jumpRecommendationPage", "changeRecommendationPage", "size", "newSize", "cardTypeAndNum", "num", "hasMore", "", "exposeCrossMarginCard", "pnl", "clickCrossMarginCard", "exposeIsolatedMarginCard", "tag", "clickIsolatedMarginCard", "exposeBotCardCard", "(ILjava/lang/Integer;Z)V", "clickBotCardCard", "exposeEarnCard", "productNo", "(ILjava/lang/String;Ljava/lang/Integer;)V", "clickEarnCard", "exposeFutureCard", "marginMode", "clickFutureCard", "hasBalance", "totalBalance", "Ljava/math/BigDecimal;", "exposeDynamicsBar", "type", TtmlNode.TAG_STYLE, "clickDynamicsBar", "exposeOverviewPnl", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOverviewAnalyticsReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverviewAnalyticsReporter.kt\ncom/kubi/assets/overview/OverviewAnalyticsReporter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,362:1\n1999#2,14:363\n774#2:377\n865#2,2:378\n*S KotlinDebug\n*F\n+ 1 OverviewAnalyticsReporter.kt\ncom/kubi/assets/overview/OverviewAnalyticsReporter\n*L\n65#1:363,14\n71#1:377\n71#1:378,2\n*E\n"})
public final class OverviewAnalyticsReporter {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final OverviewAnalyticsReporter f18247a = new OverviewAnalyticsReporter();

    @NotNull
    /* JADX INFO: renamed from: s */
    public final String m18421s(@Nullable BigDecimal bigDecimal) {
        return C41014a.m89922G(bigDecimal, null, 1, null).compareTo(BigDecimal.ZERO) > 0 ? "1" : "0";
    }

    /* JADX INFO: renamed from: v */
    public static final CharSequence m18403v(AssetTrackEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getAccount();
    }

    /* JADX INFO: renamed from: b */
    public final void m18404b(@NotNull String eventName, int i11, boolean z11) throws JSONException {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bizNo", String.valueOf(i11));
        if (z11) {
            jSONObject.put("viewmore", "1");
        }
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("B1overview", "ongoingArea", eventName, jSONObject);
    }

    /* JADX INFO: renamed from: c */
    public final void m18405c(int i11, int i12) {
        if (i12 != i11) {
            C43852m.m96595g("B1overview", "ongoingArea", i12 > i11 ? "addCard" : "reduceCard", null, 8, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m18406d(int i11, @Nullable Integer num, boolean z11) throws JSONException {
        String str = "botCard" + (i11 + 1);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("object", String.valueOf(num));
        jSONObject.put("pnlDirection", z11 ? "loss" : "profit");
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B1overview", "ongoingArea", str, jSONObject);
    }

    /* JADX INFO: renamed from: e */
    public final void m18407e(int i11, boolean z11) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("amount", String.valueOf(i11));
        jSONObject.put("pnlDirection", z11 ? "loss" : "profit");
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B1overview", "ongoingArea", "crossMarginCard", jSONObject);
    }

    /* JADX INFO: renamed from: f */
    public final void m18408f(int i11, @NotNull String style) {
        String str;
        Intrinsics.checkNotNullParameter(style, "style");
        if (Intrinsics.areEqual(style, "card")) {
            str = "autoEarn";
        } else if (i11 == 0) {
            str = "depositRecord";
        } else if (i11 != 1) {
            str = i11 != 2 ? "" : "subscrip";
        } else {
            str = "withdrawRecord";
        }
        C43852m.m96591c("B1overview", "activeBar", str, null, 8, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m18409g(int i11, @Nullable String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("object", String.valueOf(str));
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B1overview", "ongoingArea", "earnCard" + (i11 + 1), jSONObject);
    }

    /* JADX INFO: renamed from: h */
    public final void m18410h(int i11, @Nullable String str, @Nullable String str2, boolean z11) throws JSONException {
        String str3 = "futureCard" + (i11 + 1);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("object", str);
        jSONObject.put(ViewProps.POSITION, str2);
        jSONObject.put("pnlDirection", z11 ? "loss" : "profit");
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B1overview", "ongoingArea", str3, jSONObject);
    }

    /* JADX INFO: renamed from: i */
    public final void m18411i(int i11, @Nullable String str, boolean z11) throws JSONException {
        String str2 = "isolatedMarginCard" + (i11 + 1);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("object", str);
        jSONObject.put("pnlDirection", z11 ? "loss" : "profit");
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B1overview", "ongoingArea", str2, jSONObject);
    }

    /* JADX INFO: renamed from: j */
    public final void m18412j(int i11, @Nullable Integer num, boolean z11) throws JSONException {
        String str = "botCard" + (i11 + 1);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("object", String.valueOf(num));
        jSONObject.put("pnlDirection", z11 ? "loss" : "profit");
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("B1overview", "ongoingArea", str, jSONObject);
    }

    /* JADX INFO: renamed from: k */
    public final void m18413k(int i11, boolean z11) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("amount", String.valueOf(i11));
        jSONObject.put("pnlDirection", z11 ? "loss" : "profit");
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("B1overview", "ongoingArea", "crossMarginCard", jSONObject);
    }

    /* JADX INFO: renamed from: l */
    public final void m18414l(int i11, @NotNull String style) {
        String str;
        Intrinsics.checkNotNullParameter(style, "style");
        if (Intrinsics.areEqual(style, "card")) {
            str = "autoEarn";
        } else if (i11 == 0) {
            str = "depositRecord";
        } else if (i11 != 1) {
            str = i11 != 2 ? "" : "subscrip";
        } else {
            str = "withdrawRecord";
        }
        C43852m.m96595g("B1overview", "activeBar", str, null, 8, null);
    }

    /* JADX INFO: renamed from: m */
    public final void m18415m(int i11, @Nullable String str, @Nullable Integer num) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("object", String.valueOf(str));
        jSONObject.put("productNo", num);
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("B1overview", "ongoingArea", "earnCard" + (i11 + 1), jSONObject);
    }

    /* JADX INFO: renamed from: n */
    public final void m18416n(int i11, @Nullable String str, @Nullable String str2, boolean z11) throws JSONException {
        String str3 = "futureCard" + (i11 + 1);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("object", str);
        jSONObject.put(ViewProps.POSITION, str2);
        jSONObject.put("pnlDirection", z11 ? "loss" : "profit");
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("B1overview", "ongoingArea", str3, jSONObject);
    }

    /* JADX INFO: renamed from: o */
    public final void m18417o(int i11, @Nullable String str, boolean z11) throws JSONException {
        String str2 = "isolatedMarginCard" + (i11 + 1);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("object", str);
        jSONObject.put("pnlDirection", z11 ? "loss" : "profit");
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("B1overview", "ongoingArea", str2, jSONObject);
    }

    /* JADX INFO: renamed from: p */
    public final void m18418p(int i11) {
        String str;
        if (i11 == ProfitEventPoint.PNL1D.getValue()) {
            str = "PnL1D";
        } else if (i11 == ProfitEventPoint.PnL7D.getValue()) {
            str = "PnL7D";
        } else if (i11 == ProfitEventPoint.PnL30D.getValue()) {
            str = "PnL30D";
        } else if (i11 == ProfitEventPoint.PnL3M.getValue()) {
            str = "PnL3M";
        } else if (i11 == ProfitEventPoint.PnL6M.getValue()) {
            str = "PnL6M";
        } else if (i11 == ProfitEventPoint.PnLUpdating.getValue()) {
            str = "PnLUpdating";
        } else if (i11 == ProfitEventPoint.Profit.getValue()) {
            str = "profit";
        } else if (i11 == ProfitEventPoint.Loss.getValue()) {
            str = "loss";
        } else {
            str = i11 == ProfitEventPoint.DescriptionHover.getValue() ? "descriptionHover" : "";
        }
        C43852m.m96595g("B1overview", "assetTrendNew", str, null, 8, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m18419q(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        C43852m.m96595g("B1overview", "ongoingArea", eventName, null, 8, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m18420r(int i11) {
        String str;
        if (i11 != 0) {
            str = i11 != 1 ? "ongoing" : JAnalysisConstants.Account.KEY_ACCOUNT;
        } else {
            str = "coin";
        }
        C43852m.m96595g("B1overview", "TabBtn", str, null, 8, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m18422t(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        C43852m.m96591c("B1overview", "ongoingArea", eventName, null, 8, null);
    }

    /* JADX INFO: renamed from: u */
    public final void m18423u(@NotNull AssetV2OverviewEntity asset) throws JSONException {
        Object next;
        Intrinsics.checkNotNullParameter(asset, "asset");
        AssetSingleEntity mainAsset = asset.getMainAsset();
        BigDecimal totalBalance = mainAsset != null ? mainAsset.getTotalBalance() : null;
        AssetSingleEntity spotAsset = asset.getSpotAsset();
        BigDecimal totalBalance2 = spotAsset != null ? spotAsset.getTotalBalance() : null;
        LeverBalance crossMarginAsset = asset.getCrossMarginAsset();
        BigDecimal bigDecimalM89922G = C41014a.m89922G(crossMarginAsset != null ? crossMarginAsset.getTotalBalance() : null, null, 1, null);
        IsolateMarginPosition isolatedMarginAsset = asset.getIsolatedMarginAsset();
        BigDecimal bigDecimalAdd = bigDecimalM89922G.add(C41014a.m89922G(isolatedMarginAsset != null ? isolatedMarginAsset.getTotalBalance() : null, null, 1, null));
        EquityEntity futureAsset = asset.getFutureAsset();
        BigDecimal totalEquity = futureAsset != null ? futureAsset.getTotalEquity() : null;
        SubAssetEntity robotAsset = asset.getRobotAsset();
        BigDecimal totalBalance3 = robotAsset != null ? robotAsset.getTotalBalance() : null;
        EarnBalance financeAsset = asset.getFinanceAsset();
        BigDecimal totalValue = financeAsset != null ? financeAsset.getTotalValue() : null;
        List listListOf = CollectionsKt.listOf((Object[]) new AssetTrackEntity[]{new AssetTrackEntity(totalBalance, "main"), new AssetTrackEntity(totalBalance2, "trade"), new AssetTrackEntity(bigDecimalAdd, ViewProps.MARGIN), new AssetTrackEntity(totalEquity, ClickCardReport.ReportData.CARD_TYPE_FUTURE), new AssetTrackEntity(totalBalance3, "robot"), new AssetTrackEntity(totalValue, "finance")});
        Iterator it = listListOf.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                BigDecimal balance = ((AssetTrackEntity) next).getBalance();
                if (balance == null) {
                    balance = BigDecimal.ZERO;
                }
                do {
                    Object next2 = it.next();
                    BigDecimal balance2 = ((AssetTrackEntity) next2).getBalance();
                    if (balance2 == null) {
                        balance2 = BigDecimal.ZERO;
                    }
                    if (balance.compareTo(balance2) < 0) {
                        next = next2;
                        balance = balance2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        AssetTrackEntity assetTrackEntity = (AssetTrackEntity) next;
        String strJoinToString$default = "None";
        if (C41014a.m89922G(assetTrackEntity != null ? assetTrackEntity.getBalance() : null, null, 1, null).compareTo(BigDecimal.ZERO) != 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listListOf) {
                if (C41014a.m89922G(((AssetTrackEntity) obj).getBalance(), null, 1, null).compareTo(C41014a.m89922G(assetTrackEntity != null ? assetTrackEntity.getBalance() : null, null, 1, null)) == 0) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                strJoinToString$default = CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new Function1() { // from class: com.kubi.assets.overview.a1
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OverviewAnalyticsReporter.m18403v((AssetTrackEntity) obj2);
                    }
                }, 30, null);
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("totalAssetUnit", C27041f.m66668h(asset.getBaseCurrency()));
        OverviewAnalyticsReporter overviewAnalyticsReporter = f18247a;
        jSONObject.put("accountM", overviewAnalyticsReporter.m18421s(totalBalance));
        jSONObject.put("accountT", overviewAnalyticsReporter.m18421s(totalBalance2));
        jSONObject.put("accountMA", overviewAnalyticsReporter.m18421s(bigDecimalAdd));
        jSONObject.put("accountF", overviewAnalyticsReporter.m18421s(totalEquity));
        jSONObject.put("accountR", overviewAnalyticsReporter.m18421s(totalBalance3));
        jSONObject.put("accountFI", overviewAnalyticsReporter.m18421s(totalValue));
        jSONObject.put("maxAssetAccount", strJoinToString$default);
        AssetsProfitLossAnalysisManager assetsProfitLossAnalysisManager = AssetsProfitLossAnalysisManager.f40608a;
        if (!Intrinsics.areEqual(assetsProfitLossAnalysisManager.m49941c(), "-2")) {
            jSONObject.put("amountChange", assetsProfitLossAnalysisManager.m49941c());
        }
        C43852m.m96593e("B1overview", "asset", "1", jSONObject);
    }

    /* JADX INFO: renamed from: x */
    public final void m18425x(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        C43852m.m96591c("B1overview", "tab", eventName, null, 8, null);
    }

    /* JADX INFO: renamed from: y */
    public final void m18426y(int i11) {
        String str;
        if (i11 != 0) {
            str = i11 != 1 ? "ongoing" : JAnalysisConstants.Account.KEY_ACCOUNT;
        } else {
            str = "coin";
        }
        C43852m.m96591c("B1overview", "TabBtn", str, null, 8, null);
    }

    /* JADX INFO: renamed from: w */
    public final void m18424w(int i11) {
        C43852m.m96595g("B1overview", "coinList", String.valueOf(i11), null, 8, null);
    }
}
