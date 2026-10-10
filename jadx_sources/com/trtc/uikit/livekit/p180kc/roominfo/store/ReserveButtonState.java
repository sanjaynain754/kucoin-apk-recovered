package com.trtc.uikit.livekit.p180kc.roominfo.store;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: KCRoomInfoState.kt */
/* JADX INFO: loaded from: classes60.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/roominfo/store/ReserveButtonState;", "", "isReserved", "", "isButtonEnabled", "<init>", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ReserveButtonState {
    private final boolean isButtonEnabled;
    private final boolean isReserved;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReserveButtonState)) {
            return false;
        }
        ReserveButtonState reserveButtonState = (ReserveButtonState) other;
        return this.isReserved == reserveButtonState.isReserved && this.isButtonEnabled == reserveButtonState.isButtonEnabled;
    }

    public static /* synthetic */ ReserveButtonState copy$default(ReserveButtonState reserveButtonState, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = reserveButtonState.isReserved;
        }
        if ((i11 & 2) != 0) {
            z12 = reserveButtonState.isButtonEnabled;
        }
        return reserveButtonState.copy(z11, z12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsReserved() {
        return this.isReserved;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsButtonEnabled() {
        return this.isButtonEnabled;
    }

    @NotNull
    public final ReserveButtonState copy(boolean isReserved, boolean isButtonEnabled) {
        return new ReserveButtonState(isReserved, isButtonEnabled);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isReserved) * 31) + Boolean.hashCode(this.isButtonEnabled);
    }

    public final boolean isButtonEnabled() {
        return this.isButtonEnabled;
    }

    public final boolean isReserved() {
        return this.isReserved;
    }

    @NotNull
    public String toString() {
        return "ReserveButtonState(isReserved=" + this.isReserved + ", isButtonEnabled=" + this.isButtonEnabled + ')';
    }

    public ReserveButtonState(boolean z11, boolean z12) {
        this.isReserved = z11;
        this.isButtonEnabled = z12;
    }
}
