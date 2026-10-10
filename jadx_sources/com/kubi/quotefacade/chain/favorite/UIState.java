package com.kubi.quotefacade.chain.favorite;

import com.google.firebase.messaging.Constants;
import com.kubi.mvi.state.InterfaceC19284f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.quotefacade.chain.favorite.ChainFavoriteContract$UIState, reason: from toString */
/* JADX INFO: compiled from: ChainFavoriteContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/quotefacade/chain/favorite/ChainFavoriteContract$UIState;", "Lcom/kubi/mvi/state/IState;", "empty", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getEmpty", "()Ljava/lang/Object;", "getError", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UIState implements InterfaceC19284f {

    @Nullable
    private final Object empty;

    @Nullable
    private final Object error;

    /* JADX WARN: Illegal instructions before constructor call */
    public UIState() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(defaultConstructorMarker, defaultConstructorMarker, 3, defaultConstructorMarker);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return Intrinsics.areEqual(this.empty, uIState.empty) && Intrinsics.areEqual(this.error, uIState.error);
    }

    public UIState(@Nullable Object obj, @Nullable Object obj2) {
        this.empty = obj;
        this.error = obj2;
    }

    public int hashCode() {
        Object obj = this.empty;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.error;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UIState(empty=" + this.empty + ", error=" + this.error + ')';
    }

    public /* synthetic */ UIState(Object obj, Object obj2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : obj, (i11 & 2) != 0 ? null : obj2);
    }
}
