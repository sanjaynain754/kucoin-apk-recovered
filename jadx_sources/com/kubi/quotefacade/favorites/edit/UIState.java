package com.kubi.quotefacade.favorites.edit;

import com.google.firebase.messaging.Constants;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.quotefacade.entity.FavEditChildEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.quotefacade.favorites.edit.FavEditChildContract$UIState, reason: from toString */
/* JADX INFO: compiled from: FavEditChildContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/edit/FavEditChildContract$UIState;", "Lcom/kubi/mvi/state/IState;", "favoriteList", "", "Lcom/kubi/quotefacade/entity/FavEditChildEntity;", "empty", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V", "getFavoriteList", "()Ljava/util/List;", "getEmpty", "()Ljava/lang/Object;", "getError", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UIState implements InterfaceC19284f {

    @Nullable
    private final Object empty;

    @Nullable
    private final Object error;

    @Nullable
    private final List<FavEditChildEntity> favoriteList;

    public UIState() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return Intrinsics.areEqual(this.favoriteList, uIState.favoriteList) && Intrinsics.areEqual(this.empty, uIState.empty) && Intrinsics.areEqual(this.error, uIState.error);
    }

    public UIState(@Nullable List<FavEditChildEntity> list, @Nullable Object obj, @Nullable Object obj2) {
        this.favoriteList = list;
        this.empty = obj;
        this.error = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UIState copy$default(UIState uIState, List list, Object obj, Object obj2, int i11, Object obj3) {
        if ((i11 & 1) != 0) {
            list = uIState.favoriteList;
        }
        if ((i11 & 2) != 0) {
            obj = uIState.empty;
        }
        if ((i11 & 4) != 0) {
            obj2 = uIState.error;
        }
        return uIState.copy(list, obj, obj2);
    }

    @NotNull
    public final UIState copy(@Nullable List<FavEditChildEntity> favoriteList, @Nullable Object empty, @Nullable Object error) {
        return new UIState(favoriteList, empty, error);
    }

    @Nullable
    public final Object getEmpty() {
        return this.empty;
    }

    @Nullable
    public final Object getError() {
        return this.error;
    }

    @Nullable
    public final List<FavEditChildEntity> getFavoriteList() {
        return this.favoriteList;
    }

    public int hashCode() {
        List<FavEditChildEntity> list = this.favoriteList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Object obj = this.empty;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.error;
        return iHashCode2 + (obj2 != null ? obj2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UIState(favoriteList=" + this.favoriteList + ", empty=" + this.empty + ", error=" + this.error + ')';
    }

    public /* synthetic */ UIState(List list, Object obj, Object obj2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : obj, (i11 & 4) != 0 ? null : obj2);
    }
}
