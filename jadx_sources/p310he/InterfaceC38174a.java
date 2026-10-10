package p310he;

import com.kubi.core.spot.entity.OrderBookCenterEntity;
import com.kubi.data.entity.OrderBookEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.tradebase.tradetype.TradeType;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: he.a */
/* JADX INFO: compiled from: ITradeBehavior.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0010H&J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000bH&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0015H&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0015H&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0015H&J\b\u0010\"\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006#À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/spot/business/ITradeChildBehavior;", "", "onCurrencyChanged", "", "notifyOrderBookAdapter", "onAssetGet", "onAvailableTradeAmountChanged", "reloadSymbols", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "onlyResetUI", "", "onBboDataGet", "data", "Lcom/kubi/core/spot/entity/OrderBookCenterEntity;", "onOrderBookDataGet", "Lcom/kubi/data/entity/OrderBookEntity;", "refreshButtonStatus", "isMaintenance", "showOrderBookAmountType", "adapterPosition", "", "tradeModeChanged", "labelStr", "", "type", "Lcom/kubi/tradebase/tradetype/TradeType;", "onOrderBookPrecisionChanged", "precision", "onClickPriceChange", "value", "Ljava/math/BigDecimal;", "hideDialogInType", "showDialogInType", "isSupportBorrow", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC38174a {
    /* JADX INFO: renamed from: E */
    void mo22589E(@NotNull SymbolInfoEntity symbolInfoEntity, int i11);

    /* JADX INFO: renamed from: F0 */
    void mo22591F0(@NotNull OrderBookEntity orderBookEntity);

    /* JADX INFO: renamed from: S */
    void mo22599S();

    /* JADX INFO: renamed from: U */
    void mo22600U();

    /* JADX INFO: renamed from: a */
    void mo22601a(@NotNull BigDecimal bigDecimal);

    /* JADX INFO: renamed from: b */
    void mo22602b(int i11);

    /* JADX INFO: renamed from: c */
    void mo22603c(int i11);

    /* JADX INFO: renamed from: c0 */
    void mo22604c0();

    /* JADX INFO: renamed from: d */
    void mo22605d(@NotNull String str, int i11);

    /* JADX INFO: renamed from: f */
    void mo22606f(@NotNull String str, @NotNull TradeType tradeType);

    /* JADX INFO: renamed from: h2 */
    void mo22608h2();

    /* JADX INFO: renamed from: s */
    void mo22618s(@NotNull SymbolInfoEntity symbolInfoEntity, @NotNull OrderBookCenterEntity orderBookCenterEntity);

    /* JADX INFO: renamed from: v */
    void mo22619v(@NotNull SymbolInfoEntity symbolInfoEntity, boolean z11);

    /* JADX INFO: renamed from: S2 */
    static /* synthetic */ void m86139S2(InterfaceC38174a interfaceC38174a, SymbolInfoEntity symbolInfoEntity, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reloadSymbols");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        interfaceC38174a.mo22619v(symbolInfoEntity, z11);
    }

    /* JADX INFO: renamed from: p2 */
    default void mo22616p2() {
        mo22599S();
    }
}
