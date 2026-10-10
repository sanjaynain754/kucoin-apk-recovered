package com.kubi.core.spot.business.holder;

import android.content.Context;
import com.kubi.advert.api.IAdvertService;
import com.kubi.core.base.TradeAccountType;
import com.kubi.core.spot.business.businessTrack.DurationTrackManager;
import com.kubi.core.spot.business.businessTrack.SpotBusinessTracker;
import com.kubi.core.utils.C12462a;
import com.kubi.monitor.EventParametersBuilder;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p569qq.C43852m;
import p671uq.C45290a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import ve.C45518a;

/* JADX INFO: renamed from: com.kubi.core.spot.business.holder.e3, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SpotHolderTrack.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000fH\u0016J(\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016J\b\u0010 \u001a\u00020\u0005H\u0016¨\u0006!"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/SpotHolderTrack;", "Lcom/kubi/core/spot/business/holder/IHolderTrackDefine;", "<init>", "()V", "trackSubmitOrderStartClick", "", "tradeAccountType", "Lcom/kubi/core/base/TradeAccountType;", "parentBehavior", "Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "isBuyHolder", "", "orderType", "", ReportDataTable.COLUMN_PARAMS, "", "trackSubmitOrderRealClick", "context", "Landroid/content/Context;", "trackInsufficientTransferClick", "trackInsufficientDepositClick", "trackInsufficientBuyClick", "trackInsufficientCancelClick", "trackInsufficientAlertClick", "trackDealAmountClick", "trackPriceZero", "trackTriggerPriceZero", "trackPriceRange", "trackAmountRange", "trackVolumeRange", "trackTrailingPercentRang", "trackTrailingPriceRange", "trackPriceProtectRange", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotHolderTrack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotHolderTrack.kt\ncom/kubi/core/spot/business/holder/SpotHolderTrack\n+ 2 DurationTracker.kt\ncom/kubi/monitor/DurationTrackerKt\n*L\n1#1,231:1\n52#2,8:232\n*S KotlinDebug\n*F\n+ 1 SpotHolderTrack.kt\ncom/kubi/core/spot/business/holder/SpotHolderTrack\n*L\n128#1:232,8\n*E\n"})
public final class SpotHolderTrack implements IHolderTrackDefine {
    @Override // com.kubi.core.spot.business.holder.IHolderTrackDefine
    /* JADX INFO: renamed from: e */
    public void mo23265e() throws JSONException {
        SpotBusinessTracker.f21010a.trackSpotOrderFail(SpotBusinessTracker.SpotCategory.CHECK_BALANCE, SpotBusinessTracker.SpotFailReason.BALANCE_INSUFFICIENT);
        C43852m.m96591c(C12462a.m23402a(), "fundsShortageAlert", null, null, 12, null);
    }

    @Override // com.kubi.core.spot.business.holder.IHolderTrackDefine
    /* JADX INFO: renamed from: f */
    public void mo23266f() throws JSONException {
        SpotBusinessTracker.f21010a.trackSpotOrderFail(SpotBusinessTracker.SpotCategory.CHECK_TRADINGSTOP_PRICE_RANGE, SpotBusinessTracker.SpotFailReason.PRICE_PROTECT_CANCEL);
    }

    @Override // com.kubi.core.spot.business.holder.IHolderTrackDefine
    /* JADX INFO: renamed from: h */
    public void mo23268h(@NotNull Context context, @NotNull ITradeHolderDependDelegate parentBehavior, boolean z11, @NotNull String orderType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parentBehavior, "parentBehavior");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        DurationTrackManager.Companion companion = DurationTrackManager.f21006c;
        companion.getInstance().m22857d();
        String strM23402a = C12462a.m23402a();
        String str = z11 ? "buyButton" : "sellButton";
        String symbol = parentBehavior.mo22365N().getSymbol();
        if (symbol == null) {
            symbol = "";
        }
        Pair pairM90091to = TuplesKt.m90091to("symbol", symbol);
        Pair pairM90091to2 = TuplesKt.m90091to("orderType", orderType);
        Pair pairM90091to3 = TuplesKt.m90091to("norm_version", "1");
        String baseCurrency = parentBehavior.mo22365N().getBaseCurrency();
        C43852m.m96590b(strM23402a, str, "1", pairM90091to, pairM90091to2, pairM90091to3, TuplesKt.m90091to("coin", baseCurrency != null ? baseCurrency : ""));
        String f21009b = companion.getInstance().getF21009b();
        if ("unified_click_submit_spot_order".length() == 0 || "click_start_btn".length() == 0) {
            C44128b.m97270n("Monitor", "eventName(unified_click_submit_spot_order) or pointName(click_start_btn) is null");
        } else {
            EventParametersBuilder eventParametersBuilderAcquire = EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire.m42382c("orderType", orderType);
            C45290a.f101823a.m100101b("unified_click_submit_spot_order", "click_start_btn", f21009b, eventParametersBuilderAcquire.m42380a());
        }
        IAdvertService.m14758l(IAdvertService.f15070a.get(), "click_spot_trade", null, 2, null);
    }

    @Override // com.kubi.core.spot.business.holder.IHolderTrackDefine
    /* JADX INFO: renamed from: i */
    public void mo23269i(@NotNull TradeAccountType tradeAccountType, @NotNull ITradeHolderDependDelegate parentBehavior, boolean z11, @NotNull String orderType, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(tradeAccountType, "tradeAccountType");
        Intrinsics.checkNotNullParameter(parentBehavior, "parentBehavior");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(params, "params");
        C45518a.m100507a("用户点击了下单按钮", "BaseOrderHolder");
        SpotBusinessTracker.Companion companion = SpotBusinessTracker.f21010a;
        String symbol = parentBehavior.mo22365N().getSymbol();
        String str = symbol == null ? "" : symbol;
        String baseCurrency = parentBehavior.mo22365N().getBaseCurrency();
        companion.updateOrderInfo(tradeAccountType, str, baseCurrency == null ? "" : baseCurrency, z11, orderType, params);
    }

    @Override // com.kubi.core.spot.business.holder.IHolderTrackDefine
    /* JADX INFO: renamed from: a */
    public void mo23261a() {
        C43852m.m96590b(C12462a.m23402a(), "fundsShortageDeposit", "1", TuplesKt.m90091to("norm_version", "1"));
    }

    @Override // com.kubi.core.spot.business.holder.IHolderTrackDefine
    /* JADX INFO: renamed from: b */
    public void mo23262b() {
        C43852m.m96591c(C12462a.m23402a(), "orderVolumeClick", null, null, 12, null);
    }

    @Override // com.kubi.core.spot.business.holder.IHolderTrackDefine
    /* JADX INFO: renamed from: c */
    public void mo23263c() {
        C43852m.m96591c(C12462a.m23402a(), "fundsShortageCancel", null, null, 12, null);
    }

    @Override // com.kubi.core.spot.business.holder.IHolderTrackDefine
    /* JADX INFO: renamed from: d */
    public void mo23264d() {
        C43852m.m96590b(C12462a.m23402a(), "fundsShortageOtcBuy", "1", TuplesKt.m90091to("norm_version", "1"));
    }

    @Override // com.kubi.core.spot.business.holder.IHolderTrackDefine
    /* JADX INFO: renamed from: g */
    public void mo23267g() {
        C43852m.m96591c(C12462a.m23402a(), "fundsShortageTransfer", null, null, 12, null);
    }
}
