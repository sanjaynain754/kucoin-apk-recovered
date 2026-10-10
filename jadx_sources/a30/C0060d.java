package a30;

import com.kubi.core.biz.callauction.CallAuctionSwitch;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.spot.business.callAuction.action.CallAuctionSymbolListItemView;
import com.kubi.spot.business.newCoin.NewCoinHelper;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import r20.C43907e;

/* JADX INFO: renamed from: a30.d */
/* JADX INFO: compiled from: SymbolsListAdapterExt.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m90084d2 = {"getSymbolListItemView", "Lcom/kubi/spot/quote/market/symbolListItemView/ISymbolListItemView;", "item", "Lcom/kubi/data/entity/TradeItemBean;", "SpotLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C0060d {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC0057a m83a(@NotNull TradeItemBean item) {
        Intrinsics.checkNotNullParameter(item, "item");
        CallAuctionSwitch callAuctionSwitch = CallAuctionSwitch.f20317a;
        if (callAuctionSwitch.m21637c() && callAuctionSwitch.m21643j(item, false)) {
            return new CallAuctionSymbolListItemView();
        }
        return NewCoinHelper.f50279a.m61280c(item) ? new C43907e() : new C0058b();
    }
}
