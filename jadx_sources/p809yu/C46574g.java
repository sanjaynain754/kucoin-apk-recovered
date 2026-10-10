package p809yu;

import com.kubi.quotefacade.constant.ChainSortItemEnum;
import com.kubi.quotefacade.entity.ChainItemEntity;
import com.kubi.quotefacade.helper.ChainFavCacheManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yu.g */
/* JADX INFO: compiled from: ChainFavListAdapterEx.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0003¨\u0006\t"}, m90084d2 = {"getChainTypeItemView", "Lcom/kubi/quotefacade/adapter/IChainListItemView;", "item", "Lcom/kubi/quotefacade/entity/ChainItemEntity;", "filterItemType", "", "isfavor", "", "mChainBean", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46574g {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC46592y m102731a(@NotNull ChainItemEntity item, @NotNull String filterItemType) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(filterItemType, "filterItemType");
        if (Intrinsics.areEqual(filterItemType, ChainSortItemEnum.CHAIN_SORT_TYPE_CHANGE.getConstSortType())) {
            return new C46571d();
        }
        if (Intrinsics.areEqual(filterItemType, ChainSortItemEnum.CHAIN_SORT_TYPE_TXCOUNT.getConstSortType())) {
            return new C46585r();
        }
        if (Intrinsics.areEqual(filterItemType, ChainSortItemEnum.CHAIN_SORT_TYPE_MAKERS.getConstSortType())) {
            return new C46578k();
        }
        if (Intrinsics.areEqual(filterItemType, ChainSortItemEnum.CHAIN_SORT_TYPE_HOLDERS.getConstSortType())) {
            return new C46576i();
        }
        if (Intrinsics.areEqual(filterItemType, ChainSortItemEnum.CHAIN_SORT_TYPE_MARKET_CAP.getConstSortType())) {
            return new C46579l();
        }
        if (Intrinsics.areEqual(filterItemType, ChainSortItemEnum.CHAIN_SORT_TYPE_FDV.getConstSortType())) {
            return new C46575h();
        }
        if (Intrinsics.areEqual(filterItemType, ChainSortItemEnum.CHAIN_SORT_TYPE_TVL.getConstSortType())) {
            return new C46586s();
        }
        if (Intrinsics.areEqual(filterItemType, ChainSortItemEnum.CHAIN_SORT_TYPE_CREATE_TIME.getConstSortType())) {
            return new C46573f();
        }
        return Intrinsics.areEqual(filterItemType, ChainSortItemEnum.CHAIN_SORT_TYPE_SAFELY.getConstSortType()) ? new C46583p() : new C46571d();
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m102732b(@NotNull ChainItemEntity chainItemEntity, @Nullable ChainItemEntity chainItemEntity2) {
        Intrinsics.checkNotNullParameter(chainItemEntity, "<this>");
        return ChainFavCacheManager.f41922a.m51777k(chainItemEntity2);
    }
}
