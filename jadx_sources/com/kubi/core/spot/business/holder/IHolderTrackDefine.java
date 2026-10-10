package com.kubi.core.spot.business.holder;

import android.content.Context;
import com.kubi.core.base.TradeAccountType;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.core.spot.business.holder.d0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SpotHolderTrack.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\rH&J(\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0003H&J\b\u0010\u0018\u001a\u00020\u0003H&J\b\u0010\u0019\u001a\u00020\u0003H&J\b\u0010\u001a\u001a\u00020\u0003H&J\b\u0010\u001b\u001a\u00020\u0003H&J\b\u0010\u001c\u001a\u00020\u0003H&J\b\u0010\u001d\u001a\u00020\u0003H&J\b\u0010\u001e\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/IHolderTrackDefine;", "", "trackSubmitOrderStartClick", "", "tradeAccountType", "Lcom/kubi/core/base/TradeAccountType;", "parentBehavior", "Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "isBuyHolder", "", "orderType", "", ReportDataTable.COLUMN_PARAMS, "", "trackSubmitOrderRealClick", "context", "Landroid/content/Context;", "trackInsufficientTransferClick", "trackInsufficientDepositClick", "trackInsufficientBuyClick", "trackInsufficientCancelClick", "trackInsufficientAlertClick", "trackDealAmountClick", "trackPriceZero", "trackTriggerPriceZero", "trackPriceRange", "trackAmountRange", "trackVolumeRange", "trackTrailingPercentRang", "trackTrailingPriceRange", "trackPriceProtectRange", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IHolderTrackDefine {
    /* JADX INFO: renamed from: a */
    void mo23261a();

    /* JADX INFO: renamed from: b */
    void mo23262b();

    /* JADX INFO: renamed from: c */
    void mo23263c();

    /* JADX INFO: renamed from: d */
    void mo23264d();

    /* JADX INFO: renamed from: e */
    void mo23265e();

    /* JADX INFO: renamed from: f */
    void mo23266f();

    /* JADX INFO: renamed from: g */
    void mo23267g();

    /* JADX INFO: renamed from: h */
    void mo23268h(@NotNull Context context, @NotNull ITradeHolderDependDelegate iTradeHolderDependDelegate, boolean z11, @NotNull String str);

    /* JADX INFO: renamed from: i */
    void mo23269i(@NotNull TradeAccountType tradeAccountType, @NotNull ITradeHolderDependDelegate iTradeHolderDependDelegate, boolean z11, @NotNull String str, @NotNull Map<String, String> map);
}
