package com.kubi.quotefacade.favorites.all;

import com.google.firebase.messaging.Constants;
import com.kubi.mvi.state.InterfaceC19284f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.quotefacade.favorites.all.FavAllContract$UIState, reason: from toString */
/* JADX INFO: compiled from: FavAllContract.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;", "Lcom/kubi/mvi/state/IState;", "empty", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "pinItemTopSuccess", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getEmpty", "()Ljava/lang/Object;", "getError", "getPinItemTopSuccess", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UIState implements InterfaceC19284f {

    @Nullable
    private final Object empty;

    @Nullable
    private final Object error;

    @Nullable
    private final Object pinItemTopSuccess;

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
        return Intrinsics.areEqual(this.empty, uIState.empty) && Intrinsics.areEqual(this.error, uIState.error) && Intrinsics.areEqual(this.pinItemTopSuccess, uIState.pinItemTopSuccess);
    }

    public UIState(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3) {
        this.empty = obj;
        this.error = obj2;
        this.pinItemTopSuccess = obj3;
    }

    public static /* synthetic */ UIState copy$default(UIState uIState, Object obj, Object obj2, Object obj3, int i11, Object obj4) {
        if ((i11 & 1) != 0) {
            obj = uIState.empty;
        }
        if ((i11 & 2) != 0) {
            obj2 = uIState.error;
        }
        if ((i11 & 4) != 0) {
            obj3 = uIState.pinItemTopSuccess;
        }
        return uIState.copy(obj, obj2, obj3);
    }

    @NotNull
    public final UIState copy(@Nullable Object empty, @Nullable Object error, @Nullable Object pinItemTopSuccess) {
        return new UIState(empty, error, pinItemTopSuccess);
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
    public final Object getPinItemTopSuccess() {
        return this.pinItemTopSuccess;
    }

    public int hashCode() {
        Object obj = this.empty;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.error;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.pinItemTopSuccess;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UIState(empty=" + this.empty + ", error=" + this.error + ", pinItemTopSuccess=" + this.pinItemTopSuccess + ')';
    }

    public /* synthetic */ UIState(Object obj, Object obj2, Object obj3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : obj, (i11 & 2) != 0 ? null : obj2, (i11 & 4) != 0 ? null : obj3);
    }
}
