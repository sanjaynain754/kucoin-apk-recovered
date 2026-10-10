package com.kubi.quotefacade.alpha.list;

import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.quotefacade.alpha.AlphaCurrent;
import com.kubi.quotefacade.constant.AlphaMenu;
import com.kubi.quotefacade.entity.AlphaItemEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AlphaListContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "FetchDataList", "LoadMoreDataList", "FetchWsDataList", "CollectOrCancelChain", "Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$CollectOrCancelChain;", "Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$FetchDataList;", "Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$FetchWsDataList;", "Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$LoadMoreDataList;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AlphaListContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: AlphaListContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$CollectOrCancelChain;", "Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent;", "alphaItem", "Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "itemPosition", "", "<init>", "(Lcom/kubi/quotefacade/entity/AlphaItemEntity;I)V", "getAlphaItem", "()Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "getItemPosition", "()I", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CollectOrCancelChain extends AlphaListContract$UiIntent {

        @Nullable
        private final AlphaItemEntity alphaItem;
        private final int itemPosition;

        @Nullable
        public final AlphaItemEntity getAlphaItem() {
            return this.alphaItem;
        }

        public final int getItemPosition() {
            return this.itemPosition;
        }
    }

    /* JADX INFO: compiled from: AlphaListContract.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$FetchDataList;", "Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent;", "resetRefresh", "", "alphaType", "", "menu", "Lcom/kubi/quotefacade/constant/AlphaMenu;", "param", "Lcom/kubi/quotefacade/alpha/AlphaCurrent$AlphaCurrentParams;", "<init>", "(ZLjava/lang/String;Lcom/kubi/quotefacade/constant/AlphaMenu;Lcom/kubi/quotefacade/alpha/AlphaCurrent$AlphaCurrentParams;)V", "getResetRefresh", "()Z", "getAlphaType", "()Ljava/lang/String;", "getMenu", "()Lcom/kubi/quotefacade/constant/AlphaMenu;", "getParam", "()Lcom/kubi/quotefacade/alpha/AlphaCurrent$AlphaCurrentParams;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class FetchDataList extends AlphaListContract$UiIntent {

        @NotNull
        private final String alphaType;

        @NotNull
        private final AlphaMenu menu;

        @NotNull
        private final AlphaCurrent.a param;
        private final boolean resetRefresh;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FetchDataList)) {
                return false;
            }
            FetchDataList fetchDataList = (FetchDataList) other;
            return this.resetRefresh == fetchDataList.resetRefresh && Intrinsics.areEqual(this.alphaType, fetchDataList.alphaType) && this.menu == fetchDataList.menu && Intrinsics.areEqual(this.param, fetchDataList.param);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchDataList(boolean z11, @NotNull String alphaType, @NotNull AlphaMenu menu, @NotNull AlphaCurrent.a param) {
            super(null);
            Intrinsics.checkNotNullParameter(alphaType, "alphaType");
            Intrinsics.checkNotNullParameter(menu, "menu");
            Intrinsics.checkNotNullParameter(param, "param");
            this.resetRefresh = z11;
            this.alphaType = alphaType;
            this.menu = menu;
            this.param = param;
        }

        @NotNull
        public final String getAlphaType() {
            return this.alphaType;
        }

        @NotNull
        public final AlphaMenu getMenu() {
            return this.menu;
        }

        @NotNull
        public final AlphaCurrent.a getParam() {
            return this.param;
        }

        public final boolean getResetRefresh() {
            return this.resetRefresh;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.resetRefresh) * 31) + this.alphaType.hashCode()) * 31) + this.menu.hashCode()) * 31) + this.param.hashCode();
        }

        @NotNull
        public String toString() {
            return "FetchDataList(resetRefresh=" + this.resetRefresh + ", alphaType=" + this.alphaType + ", menu=" + this.menu + ", param=" + this.param + ')';
        }
    }

    /* JADX INFO: compiled from: AlphaListContract.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$FetchWsDataList;", "Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent;", "symbols", "", "", "<init>", "(Ljava/util/List;)V", "getSymbols", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class FetchWsDataList extends AlphaListContract$UiIntent {

        @NotNull
        private final List<String> symbols;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FetchWsDataList) && Intrinsics.areEqual(this.symbols, ((FetchWsDataList) other).symbols);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchWsDataList(@NotNull List<String> symbols) {
            super(null);
            Intrinsics.checkNotNullParameter(symbols, "symbols");
            this.symbols = symbols;
        }

        @NotNull
        public final List<String> getSymbols() {
            return this.symbols;
        }

        public int hashCode() {
            return this.symbols.hashCode();
        }

        @NotNull
        public String toString() {
            return "FetchWsDataList(symbols=" + this.symbols + ')';
        }
    }

    /* JADX INFO: compiled from: AlphaListContract.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent$LoadMoreDataList;", "Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UiIntent;", "alphaType", "", "menu", "Lcom/kubi/quotefacade/constant/AlphaMenu;", "param", "Lcom/kubi/quotefacade/alpha/AlphaCurrent$AlphaCurrentParams;", "<init>", "(Ljava/lang/String;Lcom/kubi/quotefacade/constant/AlphaMenu;Lcom/kubi/quotefacade/alpha/AlphaCurrent$AlphaCurrentParams;)V", "getAlphaType", "()Ljava/lang/String;", "getMenu", "()Lcom/kubi/quotefacade/constant/AlphaMenu;", "getParam", "()Lcom/kubi/quotefacade/alpha/AlphaCurrent$AlphaCurrentParams;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class LoadMoreDataList extends AlphaListContract$UiIntent {

        @NotNull
        private final String alphaType;

        @NotNull
        private final AlphaMenu menu;

        @NotNull
        private final AlphaCurrent.a param;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadMoreDataList)) {
                return false;
            }
            LoadMoreDataList loadMoreDataList = (LoadMoreDataList) other;
            return Intrinsics.areEqual(this.alphaType, loadMoreDataList.alphaType) && this.menu == loadMoreDataList.menu && Intrinsics.areEqual(this.param, loadMoreDataList.param);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadMoreDataList(@NotNull String alphaType, @NotNull AlphaMenu menu, @NotNull AlphaCurrent.a param) {
            super(null);
            Intrinsics.checkNotNullParameter(alphaType, "alphaType");
            Intrinsics.checkNotNullParameter(menu, "menu");
            Intrinsics.checkNotNullParameter(param, "param");
            this.alphaType = alphaType;
            this.menu = menu;
            this.param = param;
        }

        @NotNull
        public final String getAlphaType() {
            return this.alphaType;
        }

        @NotNull
        public final AlphaMenu getMenu() {
            return this.menu;
        }

        @NotNull
        public final AlphaCurrent.a getParam() {
            return this.param;
        }

        public int hashCode() {
            return (((this.alphaType.hashCode() * 31) + this.menu.hashCode()) * 31) + this.param.hashCode();
        }

        @NotNull
        public String toString() {
            return "LoadMoreDataList(alphaType=" + this.alphaType + ", menu=" + this.menu + ", param=" + this.param + ')';
        }
    }

    public /* synthetic */ AlphaListContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AlphaListContract$UiIntent() {
    }
}
