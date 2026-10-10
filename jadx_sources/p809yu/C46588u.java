package p809yu;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.quotefacade.helper.FavFutureCacheManager;
import com.kubi.user.api.IUserService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yu.u */
/* JADX INFO: compiled from: FavTradeListAdapterExt.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0003\u001a\n\u0010\u0007\u001a\u00020\u0005*\u00020\u0003¨\u0006\b"}, m90084d2 = {"getTradeTypeItemView", "Lcom/kubi/quotefacade/adapter/ITradeListItemView;", "item", "Lcom/kubi/data/entity/TradeItemBean;", "isHomeRank", "", "isFavorEx", "isFutureFavorEx", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46588u {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC46593z m102742a(@NotNull TradeItemBean item, boolean z11) {
        Intrinsics.checkNotNullParameter(item, "item");
        C46569c c46569c = C46569c.f104325a;
        if (c46569c.m102726c() && c46569c.m102728e(item, false)) {
            return new C46565a();
        }
        return z11 ? new C46591x() : new C46568b0();
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m102743b(@NotNull TradeItemBean tradeItemBean) {
        Intrinsics.checkNotNullParameter(tradeItemBean, "<this>");
        if (IUserService.a.get().c()) {
            return tradeItemBean.isFavor();
        }
        IQuoteFacadeService iQuoteFacadeService = IQuoteFacadeService.f41383a.get();
        String symbol = tradeItemBean.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        return iQuoteFacadeService.mo50716u(symbol);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m102744c(@NotNull TradeItemBean tradeItemBean) {
        Intrinsics.checkNotNullParameter(tradeItemBean, "<this>");
        if (IUserService.a.get().c()) {
            return tradeItemBean.isFavor();
        }
        FavFutureCacheManager favFutureCacheManager = FavFutureCacheManager.f41975a;
        String symbol = tradeItemBean.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        return favFutureCacheManager.m51911k(symbol);
    }
}
