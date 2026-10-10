package com.kubi.core.spot.business.holder;

import android.view.View;
import com.kubi.core.spot.entity.OrderBookCenterEntity;
import com.kubi.core.spot.helper.ITradeTypeRequestOrder;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.sdk.BaseFragment;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p756xc.BalanceData;
import p827zc.AbstractC46753c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.kubi.core.spot.business.holder.f0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ITradeHolderDependDelegate.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00030\nH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000bH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0014H&J\b\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0018H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u000bH&J\b\u0010\u001b\u001a\u00020\u000bH&J\b\u0010\u001c\u001a\u00020\u000bH&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u000bH&J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u000bH&J\n\u0010 \u001a\u0004\u0018\u00010!H&J\n\u0010\"\u001a\u0004\u0018\u00010#H&J\b\u0010$\u001a\u00020\u000bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "", "requestOrder", "", "marketOderParams", "", "", "tradeTypeRequestOrder", "Lcom/kubi/core/spot/helper/ITradeTypeRequestOrder;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "isMaintenance", "currentSymbol", "Lcom/kubi/data/entity/TradeItemBean;", "currentSymbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "getBaseBalance", "Lcom/kubi/core/base/arch/api/data/BalanceData;", "getQuoteBalance", "fetchSymbolBalance", "bboData", "Lcom/kubi/core/spot/entity/OrderBookCenterEntity;", "setLimitStopPriceFocused", "hasFocus", "isLimitStopPriceFocused", "isOcoStopLimitPriceFocused", "setOcoStopLimitPriceFocused", "setIsBuy", "isBuy", "getTradeCoreDataRepoProvider", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "getContainerView", "Landroid/view/View;", "isSupportBorrow", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ITradeHolderDependDelegate {
    /* JADX INFO: renamed from: C0 */
    boolean mo22354C0();

    @NotNull
    /* JADX INFO: renamed from: G */
    OrderBookCenterEntity mo22356G();

    @NotNull
    /* JADX INFO: renamed from: H */
    BaseFragment mo22357H();

    @NotNull
    /* JADX INFO: renamed from: I */
    BalanceData mo22358I();

    @NotNull
    /* JADX INFO: renamed from: J */
    TradeItemBean mo22359J();

    /* JADX INFO: renamed from: K */
    void mo22360K();

    /* JADX INFO: renamed from: M */
    boolean mo22363M();

    @NotNull
    /* JADX INFO: renamed from: N */
    SymbolInfoEntity mo22365N();

    @NotNull
    /* JADX INFO: renamed from: O */
    BalanceData mo22366O();

    @Nullable
    /* JADX INFO: renamed from: b2 */
    AbstractC46753c mo22375b2();

    /* JADX INFO: renamed from: i0 */
    void mo22382i0(boolean z11);

    @Nullable
    /* JADX INFO: renamed from: j0 */
    View mo22383j0();

    /* JADX INFO: renamed from: r1 */
    void mo22386r1(@NotNull Map<String, String> map, @NotNull ITradeTypeRequestOrder iTradeTypeRequestOrder, @NotNull Function2<? super Boolean, ? super String, Unit> function2);

    /* JADX INFO: renamed from: y0 */
    void mo22389y0(boolean z11);
}
