package com.kubi.margin.trade;

import com.kubi.core.spot.entity.OrderBookCenterEntity;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.margin.trade.c3, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IMarginBehavior.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0012\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0013H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0013H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0013H&J\b\u0010\u001a\u001a\u00020\u0003H&J\b\u0010\u001b\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/margin/trade/IMarginChildBehavior;", "", "updateExtValue", "", "value", "Ljava/math/BigDecimal;", "onCurrencyChanged", "onAssetGet", "reloadSymbols", "onlyResetUI", "", "onBboDataGet", "data", "Lcom/kubi/core/spot/entity/OrderBookCenterEntity;", "refreshButtonStatus", "tradeModeChanged", "labelStr", "", "adapterPosition", "", "onClickPriceChange", "onOrderModeChange", "mode", "hideDialogInType", "type", "showDialogInType", "onCouponsDataGet", "updateLeverageSettingBar", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IMarginChildBehavior {
    /* JADX INFO: renamed from: S */
    void m40005S();

    /* JADX INFO: renamed from: U */
    void m40006U();

    /* JADX INFO: renamed from: a */
    void m40007a(@NotNull BigDecimal bigDecimal);

    /* JADX INFO: renamed from: b */
    void m40008b(int i11);

    /* JADX INFO: renamed from: b0 */
    void m40009b0(boolean z11);

    /* JADX INFO: renamed from: c */
    void m40010c(int i11);

    /* JADX INFO: renamed from: d0 */
    void m40011d0(@NotNull String str, int i11);

    /* JADX INFO: renamed from: h0 */
    void m40012h0(@NotNull OrderBookCenterEntity orderBookCenterEntity);

    /* JADX INFO: renamed from: j1 */
    void m40013j1();

    /* JADX INFO: renamed from: m0 */
    void m40014m0(@Nullable BigDecimal bigDecimal);

    /* JADX INFO: renamed from: u0 */
    void m40015u0();

    /* JADX INFO: renamed from: y1 */
    void m40016y1(int i11);

    /* JADX INFO: renamed from: J0 */
    static /* synthetic */ void m40004J0(IMarginChildBehavior iMarginChildBehavior, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reloadSymbols");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        iMarginChildBehavior.m40009b0(z11);
    }
}
