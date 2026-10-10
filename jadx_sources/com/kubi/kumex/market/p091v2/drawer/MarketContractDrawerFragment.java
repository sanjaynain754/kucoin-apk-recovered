package com.kubi.kumex.market.p091v2.drawer;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kubi.kumex.R$color;
import com.kubi.kumex.data.market.model.AvailableTradeAreaEntity;
import com.kubi.kumex.market.p091v2.drawer.MarketContractDrawerFragment;
import com.kubi.kumex.market.tradingArea.ContractDrawerFragment;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p473nm.InterfaceC42854c;
import p801yl.C46527h0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketContractDrawerFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\u0006H\u0007J\b\u0010\f\u001a\u00020\rH\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/drawer/MarketContractDrawerFragment;", "Lcom/kubi/kumex/market/tradingArea/ContractDrawerFragment;", "Lcom/kubi/kumex/market/v2/drawer/MarketSymbolProvider;", "<init>", "()V", "searchFragment", "Lcom/kubi/kumex/market/v2/drawer/MarketSearchDrawerFragment;", "getSearchFragment", "()Lcom/kubi/kumex/market/v2/drawer/MarketSearchDrawerFragment;", "searchFragment$delegate", "Lkotlin/Lazy;", "searchFragmentInstance", "getFavoriteFragment", "Landroidx/fragment/app/Fragment;", "getChildFragment", "type", "", "tradingArea", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/market/model/AvailableTradeAreaEntity;", "sectionPosition", "getCurrentDisplayedMarketSymbol", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarketContractDrawerFragment extends ContractDrawerFragment implements InterfaceC42854c {

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public static final Companion f29771j0 = new Companion(null);

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final Lazy f29772i0 = LazyKt.lazy(new Function0() { // from class: nm.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketContractDrawerFragment.m35111a4();
        }
    });

    /* JADX INFO: compiled from: MarketContractDrawerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/drawer/MarketContractDrawerFragment$Companion;", "", "<init>", "()V", "KEY_MARKET_CURRENT_SYMBOL", "", "newInstance", "Lcom/kubi/kumex/market/v2/drawer/MarketContractDrawerFragment;", "symbolFromMarket", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final MarketContractDrawerFragment newInstance(@NotNull String symbolFromMarket) {
            Intrinsics.checkNotNullParameter(symbolFromMarket, "symbolFromMarket");
            MarketContractDrawerFragment marketContractDrawerFragment = new MarketContractDrawerFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(BaseFragment.FRAGMENT_BACK, R$color.color_fff_1c222b);
            bundle.putString("key_market_current_symbol", symbolFromMarket);
            marketContractDrawerFragment.setArguments(bundle);
            return marketContractDrawerFragment;
        }
    }

    /* JADX INFO: renamed from: a4 */
    public static final MarketSearchDrawerFragment m35111a4() {
        return new MarketSearchDrawerFragment();
    }

    @Override // com.kubi.kumex.market.tradingArea.ContractDrawerFragment
    @NotNull
    /* JADX INFO: renamed from: Z3, reason: merged with bridge method [inline-methods] */
    public MarketSearchDrawerFragment mo33753S3() {
        return (MarketSearchDrawerFragment) this.f29772i0.getValue();
    }

    @Override // com.kubi.kumex.market.tradingArea.ContractDrawerFragment, com.kubi.kumex.market.tradingArea.BaseTradingAreaFragment
    @NotNull
    /* JADX INFO: renamed from: v3 */
    public Fragment mo33755v3(int i11, @NotNull String tradingArea, @NotNull AvailableTradeAreaEntity entity, int i12) {
        Intrinsics.checkNotNullParameter(tradingArea, "tradingArea");
        Intrinsics.checkNotNullParameter(entity, "entity");
        return MarketDrawerListFragment.f29773f0.newInstance(i11, tradingArea, entity, getF29467U(), getF29468V(), i12);
    }

    @Override // com.kubi.kumex.market.tradingArea.ContractDrawerFragment, com.kubi.kumex.market.tradingArea.BaseTradingAreaFragment
    @NotNull
    /* JADX INFO: renamed from: w3 */
    public Fragment mo33756w3() {
        return MarketFavoriteDrawerFragment.f29774j0.newInstance(0, "favor", getF29467U(), getF29468V());
    }

    @Override // p473nm.InterfaceC42854c
    @NotNull
    /* JADX INFO: renamed from: R2 */
    public String mo35112R2() {
        String strM56285z;
        Bundle arguments = getArguments();
        if (arguments != null && (strM56285z = RouteExKt.m56285z(arguments, "key_market_current_symbol", C46527h0.f104291a.m102677L())) != null) {
            return strM56285z;
        }
        return C46527h0.f104291a.m102677L();
    }
}
