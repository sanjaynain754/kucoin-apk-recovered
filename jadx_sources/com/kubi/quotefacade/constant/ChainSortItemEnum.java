package com.kubi.quotefacade.constant;

import com.kubi.quotefacade.R$string;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ChainSortItemEnum.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/quotefacade/constant/ChainSortItemEnum;", "", "constSortType", "", "resourceId", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getConstSortType", "()Ljava/lang/String;", "getResourceId", "()I", "CHAIN_SORT_TYPE_VOLUME", "CHAIN_SORT_TYPE_PRICE", "CHAIN_SORT_TYPE_CHANGE", "CHAIN_SORT_TYPE_TXCOUNT", "CHAIN_SORT_TYPE_MAKERS", "CHAIN_SORT_TYPE_HOLDERS", "CHAIN_SORT_TYPE_MARKET_CAP", "CHAIN_SORT_TYPE_FDV", "CHAIN_SORT_TYPE_TVL", "CHAIN_SORT_TYPE_CREATE_TIME", "CHAIN_SORT_TYPE_SAFELY", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum ChainSortItemEnum {
    CHAIN_SORT_TYPE_VOLUME("orderByVolume24h", R$string.quote_chain_filter_vol),
    CHAIN_SORT_TYPE_PRICE("orderByTokenPriceU", R$string.price),
    CHAIN_SORT_TYPE_CHANGE("orderByPriceChange24h", R$string.quote_chain_sort_change),
    CHAIN_SORT_TYPE_TXCOUNT("orderByTxCount24h", R$string.quote_chain_filter_trade),
    CHAIN_SORT_TYPE_MAKERS("orderByMakers24h", R$string.quote_chain_filter_trade_adr),
    CHAIN_SORT_TYPE_HOLDERS("orderByHolders", R$string.quote_chain_filter_hold_adr),
    CHAIN_SORT_TYPE_MARKET_CAP("orderByMarketCap", R$string.quote_chain_filter_marmarket_value),
    CHAIN_SORT_TYPE_FDV("orderByFdv", R$string.quote_chain_filter_fdv_dilution),
    CHAIN_SORT_TYPE_TVL("orderByTvl", R$string.quote_chain_filter_mobility),
    CHAIN_SORT_TYPE_CREATE_TIME("orderCreatedAt", R$string.quote_chain_filter_create_time),
    CHAIN_SORT_TYPE_SAFELY("safely", R$string.quote_chain_filter_safe);


    @NotNull
    private final String constSortType;
    private final int resourceId;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f41649c = EnumEntriesKt.enumEntries(m51045a());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: ChainSortItemEnum.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/constant/ChainSortItemEnum$Companion;", "", "<init>", "()V", "findEnumBySortType", "Lcom/kubi/quotefacade/constant/ChainSortItemEnum;", "constType", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nChainSortItemEnum.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainSortItemEnum.kt\ncom/kubi/quotefacade/constant/ChainSortItemEnum$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Nullable
        public final ChainSortItemEnum findEnumBySortType(@NotNull String constType) {
            ChainSortItemEnum next;
            Intrinsics.checkNotNullParameter(constType, "constType");
            Iterator<ChainSortItemEnum> it = ChainSortItemEnum.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.areEqual(next.getConstSortType(), constType)) {
                    return next;
                }
            }
            next = null;
            return next;
        }
    }

    @NotNull
    public static EnumEntries<ChainSortItemEnum> getEntries() {
        return f41649c;
    }

    @NotNull
    public final String getConstSortType() {
        return this.constSortType;
    }

    public final int getResourceId() {
        return this.resourceId;
    }

    ChainSortItemEnum(String str, int i11) {
        this.constSortType = str;
        this.resourceId = i11;
    }
}
