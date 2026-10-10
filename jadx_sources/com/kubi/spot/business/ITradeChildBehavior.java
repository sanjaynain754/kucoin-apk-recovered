package com.kubi.spot.business;

import com.kubi.core.spot.entity.OrderBookCenterEntity;
import com.kubi.data.entity.OrderBookEntity;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.spot.business.a2, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ITradeBehavior.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\u0012\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0003H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0014H&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0014H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/spot/business/ITradeChildBehavior;", "", "updateExtValue", "", "value", "Ljava/math/BigDecimal;", "onCurrencyChanged", "notifyOrderBookAdapter", "onAssetGet", "reloadSymbols", "onlyResetUI", "", "onBboDataGet", "data", "Lcom/kubi/core/spot/entity/OrderBookCenterEntity;", "onOrderBookDataGet", "Lcom/kubi/data/entity/OrderBookEntity;", "refreshButtonStatus", "showOrderBookAmountType", "adapterPosition", "", "tradeModeChanged", "labelStr", "", "onOrderBookPrecisionChanged", "precision", "onClickPriceChange", "hideDialogInType", "type", "showDialogInType", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ITradeChildBehavior {
    /* JADX INFO: renamed from: F0 */
    void mo60290F0(@NotNull OrderBookEntity orderBookEntity);

    /* JADX INFO: renamed from: R0 */
    void mo60291R0(int i11);

    /* JADX INFO: renamed from: S */
    void mo60292S();

    /* JADX INFO: renamed from: U */
    void mo60293U();

    /* JADX INFO: renamed from: a */
    void mo60294a(@NotNull BigDecimal bigDecimal);

    /* JADX INFO: renamed from: b */
    void mo60295b(int i11);

    /* JADX INFO: renamed from: b0 */
    void mo60296b0(boolean z11);

    /* JADX INFO: renamed from: c */
    void mo60297c(int i11);

    /* JADX INFO: renamed from: c0 */
    void mo60298c0();

    /* JADX INFO: renamed from: d */
    void mo60299d(@NotNull String str, int i11);

    /* JADX INFO: renamed from: d0 */
    void mo60300d0(@NotNull String str, int i11);

    /* JADX INFO: renamed from: f0 */
    void mo60301f0();

    /* JADX INFO: renamed from: h0 */
    void mo60302h0(@NotNull OrderBookCenterEntity orderBookCenterEntity);

    /* JADX INFO: renamed from: m0 */
    void mo60303m0(@Nullable BigDecimal bigDecimal);

    /* JADX INFO: renamed from: F1 */
    static /* synthetic */ void m60289F1(ITradeChildBehavior iTradeChildBehavior, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reloadSymbols");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        iTradeChildBehavior.mo60296b0(z11);
    }
}
