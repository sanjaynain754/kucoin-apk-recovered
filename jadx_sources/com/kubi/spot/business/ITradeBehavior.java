package com.kubi.spot.business;

import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.sdk.BaseFragment;
import com.kubi.spot.entity.DelegationEntity;
import com.kubi.spot.helper.TradeModel;
import com.kubi.tradebase.entity.CurrencyBalance;
import g10.C37787r;
import io.reactivex.disposables.Disposable;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.spot.business.z1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ITradeBehavior.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J0\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0014H&J\b\u0010\u0016\u001a\u00020\u0017H&J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u000b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!H&J\b\u0010\"\u001a\u00020\u000bH&J\b\u0010#\u001a\u00020\u000bH\u0016J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0017H\u0016J\b\u0010'\u001a\u00020\u000bH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006(À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/spot/business/ITradeBehavior;", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "currentSymbol", "Lcom/kubi/data/entity/TradeItemBean;", "currentSymbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "tradeMode", "Lcom/kubi/spot/helper/TradeModel;", "fetchSymbolBalance", "", "notifyAvailableBalanceChange", "quoteAvailableBalance", "Ljava/math/BigDecimal;", "quoteBalanceDisplayStr", "", "baseAvailableBalance", "baseBalanceDisplayStr", "getBaseBalance", "Lcom/kubi/tradebase/entity/CurrencyBalance;", "getQuoteBalance", "isMaintenance", "", "checkIsBuyLong", "()Ljava/lang/Boolean;", "onTodoOrdersCallBack", "data", "", "Lcom/kubi/spot/entity/DelegationEntity;", "extValueWsDisposable", "Lio/reactivex/disposables/Disposable;", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "fetchExtValue", "showExtValueTips", "extValueLabel", "", "needShowExtValue", "fetchDelegation", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ITradeBehavior {
    @NotNull
    /* JADX INFO: renamed from: H */
    BaseFragment mo60178H();

    @NotNull
    /* JADX INFO: renamed from: I */
    CurrencyBalance mo60179I();

    @NotNull
    /* JADX INFO: renamed from: J */
    TradeItemBean mo60180J();

    /* JADX INFO: renamed from: K */
    void mo60183K();

    /* JADX INFO: renamed from: M */
    boolean mo60188M();

    @NotNull
    /* JADX INFO: renamed from: N */
    SymbolInfoEntity mo60189N();

    @NotNull
    /* JADX INFO: renamed from: O */
    CurrencyBalance mo60190O();

    /* JADX INFO: renamed from: P1 */
    default boolean mo60283P1() {
        return false;
    }

    /* JADX INFO: renamed from: W */
    void mo60285W();

    @NotNull
    /* JADX INFO: renamed from: o0 */
    TradeModel mo60203o0();

    @Nullable
    /* JADX INFO: renamed from: q0 */
    Disposable mo60288q0(@NotNull C37787r c37787r);

    /* JADX INFO: renamed from: w0 */
    void mo60218w0(@Nullable BigDecimal bigDecimal, @Nullable CharSequence charSequence, @Nullable BigDecimal bigDecimal2, @Nullable CharSequence charSequence2);

    /* JADX INFO: renamed from: C2 */
    default void mo61540C2(@NotNull List<DelegationEntity> data) {
        Intrinsics.checkNotNullParameter(data, "data");
    }

    /* JADX INFO: renamed from: m2 */
    default void mo60199m2() {
    }

    /* JADX INFO: renamed from: n0 */
    default void mo60287n0() {
    }
}
