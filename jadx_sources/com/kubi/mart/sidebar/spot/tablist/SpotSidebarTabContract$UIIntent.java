package com.kubi.mart.sidebar.spot.tablist;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.mart.entity.SpotMenuModel;
import com.kubi.mart.sidebar.spot.helper.SortType;
import com.kubi.mvi.state.InterfaceC19282d;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SpotSidebarTabContract.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "FetchTabList", "TabChecked", "ListItemRemoved", "SortList", "Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIIntent$FetchTabList;", "Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIIntent$ListItemRemoved;", "Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIIntent$SortList;", "Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIIntent$TabChecked;", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class SpotSidebarTabContract$UIIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: SpotSidebarTabContract.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIIntent$FetchTabList;", "Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIIntent;", "sidebarType", "", "symbolCode", "menuModel", "Lcom/kubi/mart/entity/SpotMenuModel;", "sortType", "Lcom/kubi/mart/sidebar/spot/helper/SortType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/mart/entity/SpotMenuModel;Lcom/kubi/mart/sidebar/spot/helper/SortType;)V", "getSidebarType", "()Ljava/lang/String;", "getSymbolCode", "getMenuModel", "()Lcom/kubi/mart/entity/SpotMenuModel;", "getSortType", "()Lcom/kubi/mart/sidebar/spot/helper/SortType;", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class FetchTabList extends SpotSidebarTabContract$UIIntent {

        @Nullable
        private final SpotMenuModel menuModel;

        @NotNull
        private final String sidebarType;

        @NotNull
        private final SortType sortType;

        @NotNull
        private final String symbolCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchTabList(@NotNull String sidebarType, @NotNull String symbolCode, @Nullable SpotMenuModel spotMenuModel, @NotNull SortType sortType) {
            super(null);
            Intrinsics.checkNotNullParameter(sidebarType, "sidebarType");
            Intrinsics.checkNotNullParameter(symbolCode, "symbolCode");
            Intrinsics.checkNotNullParameter(sortType, "sortType");
            this.sidebarType = sidebarType;
            this.symbolCode = symbolCode;
            this.menuModel = spotMenuModel;
            this.sortType = sortType;
        }

        @Nullable
        public final SpotMenuModel getMenuModel() {
            return this.menuModel;
        }

        @NotNull
        public final String getSidebarType() {
            return this.sidebarType;
        }

        @NotNull
        public final SortType getSortType() {
            return this.sortType;
        }

        @NotNull
        public final String getSymbolCode() {
            return this.symbolCode;
        }
    }

    /* JADX INFO: compiled from: SpotSidebarTabContract.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIIntent$ListItemRemoved;", "Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIIntent;", "item", "Lcom/kubi/data/entity/TradeItemBean;", "menuModel", "Lcom/kubi/mart/entity/SpotMenuModel;", "sortType", "Lcom/kubi/mart/sidebar/spot/helper/SortType;", "<init>", "(Lcom/kubi/data/entity/TradeItemBean;Lcom/kubi/mart/entity/SpotMenuModel;Lcom/kubi/mart/sidebar/spot/helper/SortType;)V", "getItem", "()Lcom/kubi/data/entity/TradeItemBean;", "getMenuModel", "()Lcom/kubi/mart/entity/SpotMenuModel;", "getSortType", "()Lcom/kubi/mart/sidebar/spot/helper/SortType;", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ListItemRemoved extends SpotSidebarTabContract$UIIntent {

        @NotNull
        private final TradeItemBean item;

        @Nullable
        private final SpotMenuModel menuModel;

        @NotNull
        private final SortType sortType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ListItemRemoved(@NotNull TradeItemBean item, @Nullable SpotMenuModel spotMenuModel, @NotNull SortType sortType) {
            super(null);
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(sortType, "sortType");
            this.item = item;
            this.menuModel = spotMenuModel;
            this.sortType = sortType;
        }

        @NotNull
        public final TradeItemBean getItem() {
            return this.item;
        }

        @Nullable
        public final SpotMenuModel getMenuModel() {
            return this.menuModel;
        }

        @NotNull
        public final SortType getSortType() {
            return this.sortType;
        }
    }

    /* JADX INFO: compiled from: SpotSidebarTabContract.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIIntent$SortList;", "Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIIntent;", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/data/entity/TradeItemBean;", "sortType", "Lcom/kubi/mart/sidebar/spot/helper/SortType;", "<init>", "(Ljava/util/List;Lcom/kubi/mart/sidebar/spot/helper/SortType;)V", "getItems", "()Ljava/util/List;", "getSortType", "()Lcom/kubi/mart/sidebar/spot/helper/SortType;", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class SortList extends SpotSidebarTabContract$UIIntent {

        @NotNull
        private final List<TradeItemBean> items;

        @NotNull
        private final SortType sortType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SortList(@NotNull List<? extends TradeItemBean> items, @NotNull SortType sortType) {
            super(null);
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(sortType, "sortType");
            this.items = items;
            this.sortType = sortType;
        }

        @NotNull
        public final List<TradeItemBean> getItems() {
            return this.items;
        }

        @NotNull
        public final SortType getSortType() {
            return this.sortType;
        }
    }

    /* JADX INFO: compiled from: SpotSidebarTabContract.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIIntent$TabChecked;", "Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabContract$UIIntent;", "quoteCrypto", "", "menuModel", "Lcom/kubi/mart/entity/SpotMenuModel;", "sortType", "Lcom/kubi/mart/sidebar/spot/helper/SortType;", "<init>", "(Ljava/lang/String;Lcom/kubi/mart/entity/SpotMenuModel;Lcom/kubi/mart/sidebar/spot/helper/SortType;)V", "getQuoteCrypto", "()Ljava/lang/String;", "getMenuModel", "()Lcom/kubi/mart/entity/SpotMenuModel;", "getSortType", "()Lcom/kubi/mart/sidebar/spot/helper/SortType;", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class TabChecked extends SpotSidebarTabContract$UIIntent {

        @Nullable
        private final SpotMenuModel menuModel;

        @NotNull
        private final String quoteCrypto;

        @NotNull
        private final SortType sortType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TabChecked(@NotNull String quoteCrypto, @Nullable SpotMenuModel spotMenuModel, @NotNull SortType sortType) {
            super(null);
            Intrinsics.checkNotNullParameter(quoteCrypto, "quoteCrypto");
            Intrinsics.checkNotNullParameter(sortType, "sortType");
            this.quoteCrypto = quoteCrypto;
            this.menuModel = spotMenuModel;
            this.sortType = sortType;
        }

        @Nullable
        public final SpotMenuModel getMenuModel() {
            return this.menuModel;
        }

        @NotNull
        public final String getQuoteCrypto() {
            return this.quoteCrypto;
        }

        @NotNull
        public final SortType getSortType() {
            return this.sortType;
        }
    }

    public /* synthetic */ SpotSidebarTabContract$UIIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SpotSidebarTabContract$UIIntent() {
    }
}
