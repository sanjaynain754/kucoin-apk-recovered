package com.kubi.mvi.state;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Status.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/mvi/state/StatusState;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/mvi/state/f;", "data", "Lcom/kubi/mvi/state/MVIStatus;", "status", "<init>", "(Ljava/lang/Object;Lcom/kubi/mvi/state/MVIStatus;)V", "copy", "(Ljava/lang/Object;Lcom/kubi/mvi/state/MVIStatus;)Lcom/kubi/mvi/state/StatusState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "Lcom/kubi/mvi/state/MVIStatus;", "getStatus", "()Lcom/kubi/mvi/state/MVIStatus;", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class StatusState<T> implements InterfaceC19284f {
    private final T data;

    @NotNull
    private final MVIStatus status;

    public StatusState(T t11, @NotNull MVIStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.data = t11;
        this.status = status;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusState)) {
            return false;
        }
        StatusState statusState = (StatusState) other;
        return Intrinsics.areEqual(this.data, statusState.data) && Intrinsics.areEqual(this.status, statusState.status);
    }

    public /* synthetic */ StatusState(Object obj, MVIStatus mVIStatus, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i11 & 2) != 0 ? MVIStatus.Success.INSTANCE : mVIStatus);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StatusState copy$default(StatusState statusState, Object obj, MVIStatus mVIStatus, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = statusState.data;
        }
        if ((i11 & 2) != 0) {
            mVIStatus = statusState.status;
        }
        return statusState.copy(obj, mVIStatus);
    }

    @NotNull
    public final StatusState<T> copy(T data, @NotNull MVIStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new StatusState<>(data, status);
    }

    public final T getData() {
        return this.data;
    }

    @NotNull
    public final MVIStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        T t11 = this.data;
        return ((t11 == null ? 0 : t11.hashCode()) * 31) + this.status.hashCode();
    }

    @NotNull
    public String toString() {
        return "StatusState(data=" + this.data + ", status=" + this.status + ')';
    }
}
