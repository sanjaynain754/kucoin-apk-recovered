package com.kubi.quotefacade.favorites.edit;

import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.quotefacade.entity.FavEditChildEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FavEditChildContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/edit/FavEditChildContract$UiIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "GetAllFavoriteList", "GetSpotFavoriteList", "GetFuturesFavoriteList", "GetEtfFavoriteList", "UpdateFavoriteList", "Lcom/kubi/quotefacade/favorites/edit/FavEditChildContract$UiIntent$GetAllFavoriteList;", "Lcom/kubi/quotefacade/favorites/edit/FavEditChildContract$UiIntent$GetEtfFavoriteList;", "Lcom/kubi/quotefacade/favorites/edit/FavEditChildContract$UiIntent$GetFuturesFavoriteList;", "Lcom/kubi/quotefacade/favorites/edit/FavEditChildContract$UiIntent$GetSpotFavoriteList;", "Lcom/kubi/quotefacade/favorites/edit/FavEditChildContract$UiIntent$UpdateFavoriteList;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class FavEditChildContract$UiIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: FavEditChildContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/edit/FavEditChildContract$UiIntent$GetAllFavoriteList;", "Lcom/kubi/quotefacade/favorites/edit/FavEditChildContract$UiIntent;", "<init>", "()V", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class GetAllFavoriteList extends FavEditChildContract$UiIntent {

        @NotNull
        public static final GetAllFavoriteList INSTANCE = new GetAllFavoriteList();

        private GetAllFavoriteList() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: FavEditChildContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/edit/FavEditChildContract$UiIntent$GetEtfFavoriteList;", "Lcom/kubi/quotefacade/favorites/edit/FavEditChildContract$UiIntent;", "<init>", "()V", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class GetEtfFavoriteList extends FavEditChildContract$UiIntent {

        @NotNull
        public static final GetEtfFavoriteList INSTANCE = new GetEtfFavoriteList();

        private GetEtfFavoriteList() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: FavEditChildContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/edit/FavEditChildContract$UiIntent$GetFuturesFavoriteList;", "Lcom/kubi/quotefacade/favorites/edit/FavEditChildContract$UiIntent;", "<init>", "()V", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class GetFuturesFavoriteList extends FavEditChildContract$UiIntent {

        @NotNull
        public static final GetFuturesFavoriteList INSTANCE = new GetFuturesFavoriteList();

        private GetFuturesFavoriteList() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: FavEditChildContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/edit/FavEditChildContract$UiIntent$GetSpotFavoriteList;", "Lcom/kubi/quotefacade/favorites/edit/FavEditChildContract$UiIntent;", "<init>", "()V", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class GetSpotFavoriteList extends FavEditChildContract$UiIntent {

        @NotNull
        public static final GetSpotFavoriteList INSTANCE = new GetSpotFavoriteList();

        private GetSpotFavoriteList() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: FavEditChildContract.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/edit/FavEditChildContract$UiIntent$UpdateFavoriteList;", "Lcom/kubi/quotefacade/favorites/edit/FavEditChildContract$UiIntent;", "type", "", "data", "", "Lcom/kubi/quotefacade/entity/FavEditChildEntity;", "isDelete", "", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Z)V", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getData", "()Ljava/util/List;", "()Z", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class UpdateFavoriteList extends FavEditChildContract$UiIntent {

        @NotNull
        private final List<FavEditChildEntity> data;
        private final boolean isDelete;

        @Nullable
        private final Integer type;

        public /* synthetic */ UpdateFavoriteList(Integer num, List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, list, (i11 & 4) != 0 ? false : z11);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateFavoriteList(@Nullable Integer num, @NotNull List<FavEditChildEntity> data, boolean z11) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.type = num;
            this.data = data;
            this.isDelete = z11;
        }

        @NotNull
        public final List<FavEditChildEntity> getData() {
            return this.data;
        }

        @Nullable
        public final Integer getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: isDelete, reason: from getter */
        public final boolean getIsDelete() {
            return this.isDelete;
        }
    }

    public /* synthetic */ FavEditChildContract$UiIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FavEditChildContract$UiIntent() {
    }
}
