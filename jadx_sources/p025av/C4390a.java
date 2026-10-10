package p025av;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.quotefacade.constant.ChainSortItemEnum;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: av.a */
/* JADX INFO: compiled from: ChainSortItemEnum.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, m90084d2 = {"toAlphaOrderByName", "", "chainName", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4390a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m4002a(@NotNull String chainName) {
        Intrinsics.checkNotNullParameter(chainName, "chainName");
        if (Intrinsics.areEqual(chainName, ChainSortItemEnum.CHAIN_SORT_TYPE_VOLUME.getConstSortType())) {
            return "tradingVolume";
        }
        if (Intrinsics.areEqual(chainName, ChainSortItemEnum.CHAIN_SORT_TYPE_PRICE.getConstSortType())) {
            return FirebaseAnalytics.Param.PRICE;
        }
        if (Intrinsics.areEqual(chainName, ChainSortItemEnum.CHAIN_SORT_TYPE_CHANGE.getConstSortType())) {
            return "priceRate";
        }
        if (Intrinsics.areEqual(chainName, ChainSortItemEnum.CHAIN_SORT_TYPE_TXCOUNT.getConstSortType())) {
            return "txCount";
        }
        if (Intrinsics.areEqual(chainName, ChainSortItemEnum.CHAIN_SORT_TYPE_MAKERS.getConstSortType())) {
            return "tradingAddressCount";
        }
        if (Intrinsics.areEqual(chainName, ChainSortItemEnum.CHAIN_SORT_TYPE_HOLDERS.getConstSortType())) {
            return "tokenHolderCount";
        }
        if (Intrinsics.areEqual(chainName, ChainSortItemEnum.CHAIN_SORT_TYPE_MARKET_CAP.getConstSortType())) {
            return "marketCap";
        }
        if (Intrinsics.areEqual(chainName, ChainSortItemEnum.CHAIN_SORT_TYPE_FDV.getConstSortType())) {
            return "fdv";
        }
        return Intrinsics.areEqual(chainName, ChainSortItemEnum.CHAIN_SORT_TYPE_TVL.getConstSortType()) ? "tokenLiquidity" : "";
    }
}
