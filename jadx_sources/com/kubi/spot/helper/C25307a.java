package com.kubi.spot.helper;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.user.api.IUserService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.spot.helper.a */
/* JADX INFO: compiled from: AddFavorManager.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m90084d2 = {"isFavorEx", "", "Lcom/kubi/data/entity/TradeItemBean;", "SpotLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C25307a {
    /* JADX INFO: renamed from: a */
    public static final boolean m61759a(@NotNull TradeItemBean tradeItemBean) {
        Intrinsics.checkNotNullParameter(tradeItemBean, "<this>");
        if (IUserService.a.get().c()) {
            return tradeItemBean.isFavor();
        }
        IQuoteFacadeService iQuoteFacadeService = IQuoteFacadeService.f41383a.get();
        String symbol = tradeItemBean.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        return iQuoteFacadeService.mo50716u(symbol);
    }
}
