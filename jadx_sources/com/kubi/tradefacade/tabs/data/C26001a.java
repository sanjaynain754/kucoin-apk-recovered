package com.kubi.tradefacade.tabs.data;

import com.kubi.tradefacade.R$string;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.tradefacade.tabs.data.a */
/* JADX INFO: compiled from: TradeTabSortData.kt */
/* JADX INFO: loaded from: classes50.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m90084d2 = {"getTabStrRes", "", "Lcom/kubi/tradefacade/tabs/data/TabBiz;", "TradeFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C26001a {
    /* JADX INFO: renamed from: a */
    public static final int m63615a(@NotNull TabBiz tabBiz) {
        Intrinsics.checkNotNullParameter(tabBiz, "<this>");
        if (Intrinsics.areEqual(tabBiz, TabBiz.C26000f.f52008b)) {
            return R$string.spot;
        }
        if (Intrinsics.areEqual(tabBiz, TabBiz.C25999e.f52006b)) {
            return R$string.lever;
        }
        if (Intrinsics.areEqual(tabBiz, TabBiz.C25995a.f51998b)) {
            return R$string.asset_alpha_title;
        }
        if (Intrinsics.areEqual(tabBiz, TabBiz.C25996b.f52000b)) {
            return R$string.robot;
        }
        if (Intrinsics.areEqual(tabBiz, TabBiz.C25998d.f52004b)) {
            return R$string.trade_currency;
        }
        if (Intrinsics.areEqual(tabBiz, TabBiz.C25997c.f52002b)) {
            return R$string.coin_convert;
        }
        throw new NoWhenBranchMatchedException();
    }
}
