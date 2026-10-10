package com.kubi.quotefacade.rank.list;

import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.quotefacade.rank.config.RankSubTabItemConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RankListContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/list/RankListContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "FetchDataList", "FetchWsDataList", "Lcom/kubi/quotefacade/rank/list/RankListContract$UiIntent$FetchDataList;", "Lcom/kubi/quotefacade/rank/list/RankListContract$UiIntent$FetchWsDataList;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class RankListContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: RankListContract.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/list/RankListContract$UiIntent$FetchDataList;", "Lcom/kubi/quotefacade/rank/list/RankListContract$UiIntent;", "rankType", "", "subConfig", "Lcom/kubi/quotefacade/rank/config/RankSubTabItemConfig;", "from", "market", "<init>", "(Ljava/lang/String;Lcom/kubi/quotefacade/rank/config/RankSubTabItemConfig;Ljava/lang/String;Ljava/lang/String;)V", "getRankType", "()Ljava/lang/String;", "getSubConfig", "()Lcom/kubi/quotefacade/rank/config/RankSubTabItemConfig;", "getFrom", "getMarket", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class FetchDataList extends RankListContract$UiIntent {

        @NotNull
        private final String from;

        @Nullable
        private final String market;

        @NotNull
        private final String rankType;

        @NotNull
        private final RankSubTabItemConfig subConfig;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FetchDataList)) {
                return false;
            }
            FetchDataList fetchDataList = (FetchDataList) other;
            return Intrinsics.areEqual(this.rankType, fetchDataList.rankType) && Intrinsics.areEqual(this.subConfig, fetchDataList.subConfig) && Intrinsics.areEqual(this.from, fetchDataList.from) && Intrinsics.areEqual(this.market, fetchDataList.market);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchDataList(@NotNull String rankType, @NotNull RankSubTabItemConfig subConfig, @NotNull String from, @Nullable String str) {
            super(null);
            Intrinsics.checkNotNullParameter(rankType, "rankType");
            Intrinsics.checkNotNullParameter(subConfig, "subConfig");
            Intrinsics.checkNotNullParameter(from, "from");
            this.rankType = rankType;
            this.subConfig = subConfig;
            this.from = from;
            this.market = str;
        }

        @NotNull
        public final String getFrom() {
            return this.from;
        }

        @Nullable
        public final String getMarket() {
            return this.market;
        }

        @NotNull
        public final String getRankType() {
            return this.rankType;
        }

        @NotNull
        public final RankSubTabItemConfig getSubConfig() {
            return this.subConfig;
        }

        public int hashCode() {
            int iHashCode = ((((this.rankType.hashCode() * 31) + this.subConfig.hashCode()) * 31) + this.from.hashCode()) * 31;
            String str = this.market;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "FetchDataList(rankType=" + this.rankType + ", subConfig=" + this.subConfig + ", from=" + this.from + ", market=" + this.market + ')';
        }
    }

    public /* synthetic */ RankListContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RankListContract$UiIntent() {
    }
}
