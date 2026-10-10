package com.kubi.assets.search.depositandwithdraw;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.entity.SearchCoinEntity;
import com.kubi.mvi.state.InterfaceC19282d;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchCoinContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "GetCacheData", "GetHeaderIndexList", "GetPositionForSection", "RemoveHistoryList", "SearchCoinIntent", "AddHistoryIntent", "FindCoinInfo", "StartSearchMode", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$AddHistoryIntent;", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$FindCoinInfo;", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$GetCacheData;", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$GetHeaderIndexList;", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$GetPositionForSection;", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$RemoveHistoryList;", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$SearchCoinIntent;", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$StartSearchMode;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class SearchCoinContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: SearchCoinContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$AddHistoryIntent;", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent;", "item", "", "<init>", "(Ljava/lang/String;)V", "getItem", "()Ljava/lang/String;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class AddHistoryIntent extends SearchCoinContract$UiIntent {

        @NotNull
        private final String item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddHistoryIntent(@NotNull String item) {
            super(null);
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
        }

        @NotNull
        public final String getItem() {
            return this.item;
        }
    }

    /* JADX INFO: compiled from: SearchCoinContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$FindCoinInfo;", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent;", FirebaseAnalytics.Param.CURRENCY, "", "<init>", "(Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class FindCoinInfo extends SearchCoinContract$UiIntent {

        @NotNull
        private final String currency;

        @NotNull
        public final String getCurrency() {
            return this.currency;
        }
    }

    /* JADX INFO: compiled from: SearchCoinContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$GetCacheData;", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent;", "<init>", "()V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class GetCacheData extends SearchCoinContract$UiIntent {

        @NotNull
        public static final GetCacheData INSTANCE = new GetCacheData();

        private GetCacheData() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: SearchCoinContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$GetHeaderIndexList;", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent;", "<init>", "()V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class GetHeaderIndexList extends SearchCoinContract$UiIntent {

        @NotNull
        public static final GetHeaderIndexList INSTANCE = new GetHeaderIndexList();

        private GetHeaderIndexList() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: SearchCoinContract.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$GetPositionForSection;", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent;", "coinList", "", "Lcom/kubi/assets/entity/SearchCoinEntity;", "sectionString", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getCoinList", "()Ljava/util/List;", "getSectionString", "()Ljava/lang/String;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class GetPositionForSection extends SearchCoinContract$UiIntent {

        @Nullable
        private final List<SearchCoinEntity> coinList;

        @NotNull
        private final String sectionString;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetPositionForSection(@Nullable List<SearchCoinEntity> list, @NotNull String sectionString) {
            super(null);
            Intrinsics.checkNotNullParameter(sectionString, "sectionString");
            this.coinList = list;
            this.sectionString = sectionString;
        }

        @Nullable
        public final List<SearchCoinEntity> getCoinList() {
            return this.coinList;
        }

        @NotNull
        public final String getSectionString() {
            return this.sectionString;
        }
    }

    /* JADX INFO: compiled from: SearchCoinContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$RemoveHistoryList;", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent;", "<init>", "()V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class RemoveHistoryList extends SearchCoinContract$UiIntent {

        @NotNull
        public static final RemoveHistoryList INSTANCE = new RemoveHistoryList();

        private RemoveHistoryList() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: SearchCoinContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$SearchCoinIntent;", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent;", "matchStr", "", "<init>", "(Ljava/lang/String;)V", "getMatchStr", "()Ljava/lang/String;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class SearchCoinIntent extends SearchCoinContract$UiIntent {

        @NotNull
        private final String matchStr;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchCoinIntent(@NotNull String matchStr) {
            super(null);
            Intrinsics.checkNotNullParameter(matchStr, "matchStr");
            this.matchStr = matchStr;
        }

        @NotNull
        public final String getMatchStr() {
            return this.matchStr;
        }
    }

    /* JADX INFO: compiled from: SearchCoinContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$StartSearchMode;", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent;", "searchMode", "", "<init>", "(Z)V", "getSearchMode", "()Z", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class StartSearchMode extends SearchCoinContract$UiIntent {
        private final boolean searchMode;

        public StartSearchMode(boolean z11) {
            super(null);
            this.searchMode = z11;
        }

        public final boolean getSearchMode() {
            return this.searchMode;
        }
    }

    public /* synthetic */ SearchCoinContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SearchCoinContract$UiIntent() {
    }
}
