package com.kubi.margin.trade;

import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.margin.api.entity.CouponsOverview;
import com.kubi.sdk.BaseFragment;
import com.kubi.tradebase.entity.CurrencyBalance;
import g10.C37787r;
import io.reactivex.disposables.Disposable;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p568qp.C43839s;
import p852kotlin.Metadata;
import p852kotlin.Pair;

/* JADX INFO: renamed from: com.kubi.margin.trade.b3, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IMarginBehavior.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u000fH&J\u0016\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H&J\b\u0010\u0014\u001a\u00020\u0015H&J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\rH&J\b\u0010\u001d\u001a\u00020\rH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u000fH\u0016J\u0010\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u000fH\u0016J\b\u0010#\u001a\u00020\rH\u0016J\b\u0010$\u001a\u00020\u001fH\u0016J\b\u0010%\u001a\u00020\rH&J0\u0010&\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010(2\b\u0010,\u001a\u0004\u0018\u00010*H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006-À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/margin/trade/IMarginBehavior;", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "tradeType", "", "currentSymbol", "Lcom/kubi/data/entity/TradeItemBean;", "currentSymbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "tradeMode", "Lcom/kubi/margin/trade/helper/MarginTradeModel;", "fetchSymbolBalance", "", "getBaseBalance", "Lcom/kubi/tradebase/entity/CurrencyBalance;", "getQuoteBalance", "getCouponsData", "Lkotlin/Pair;", "Lcom/kubi/margin/api/entity/CouponsOverview;", "isMaintenance", "", "checkIsBuyLong", "()Ljava/lang/Boolean;", "extValueWsDisposable", "Lio/reactivex/disposables/Disposable;", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "fetchExtValue", "showExtValueTips", "extValueLabel", "", "setBaseBalance", "balance", "setQuoteBalance", "refreshButtonStatus", "getTrackPageId", "fetchMarginCoupons", "notifyAvailableBalanceChange", "quoteAvailableBalance", "Ljava/math/BigDecimal;", "quoteBalanceDisplayStr", "", "baseAvailableBalance", "baseBalanceDisplayStr", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IMarginBehavior {
    /* JADX INFO: renamed from: A0 */
    int mo39705A0();

    @NotNull
    /* JADX INFO: renamed from: H */
    BaseFragment mo39715H();

    @NotNull
    /* JADX INFO: renamed from: I */
    CurrencyBalance mo39716I();

    @NotNull
    /* JADX INFO: renamed from: J */
    TradeItemBean mo39717J();

    /* JADX INFO: renamed from: K */
    void mo39718K();

    /* JADX INFO: renamed from: M */
    boolean mo39721M();

    @NotNull
    /* JADX INFO: renamed from: N */
    SymbolInfoEntity mo39722N();

    @NotNull
    /* JADX INFO: renamed from: O */
    CurrencyBalance mo39723O();

    @Nullable
    /* JADX INFO: renamed from: O2 */
    default Boolean mo39906O2() {
        return null;
    }

    /* JADX INFO: renamed from: U1 */
    void mo39732U1();

    /* JADX INFO: renamed from: W */
    void mo39735W();

    @Nullable
    /* JADX INFO: renamed from: b1 */
    Pair<CouponsOverview, CouponsOverview> mo39736b1();

    @NotNull
    /* JADX INFO: renamed from: o0 */
    C43839s mo39742o0();

    @Nullable
    /* JADX INFO: renamed from: q0 */
    Disposable mo39743q0(@NotNull C37787r c37787r);

    /* JADX INFO: renamed from: w0 */
    void mo39747w0(@Nullable BigDecimal bigDecimal, @Nullable CharSequence charSequence, @Nullable BigDecimal bigDecimal2, @Nullable CharSequence charSequence2);

    @NotNull
    /* JADX INFO: renamed from: P0 */
    default String mo39907P0() {
        return "";
    }

    /* JADX INFO: renamed from: n0 */
    default void mo39741n0() {
    }
}
