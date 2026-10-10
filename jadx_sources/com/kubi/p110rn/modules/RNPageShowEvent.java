package com.kubi.p110rn.modules;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RNPublishSubject.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/rn/modules/RNPageShowEvent;", "", "containerId", "", "fromBackground", "", "<init>", "(Ljava/lang/String;Z)V", "getContainerId", "()Ljava/lang/String;", "getFromBackground", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RNPageShowEvent {

    @Nullable
    private final String containerId;
    private final boolean fromBackground;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RNPageShowEvent)) {
            return false;
        }
        RNPageShowEvent rNPageShowEvent = (RNPageShowEvent) other;
        return Intrinsics.areEqual(this.containerId, rNPageShowEvent.containerId) && this.fromBackground == rNPageShowEvent.fromBackground;
    }

    public static /* synthetic */ RNPageShowEvent copy$default(RNPageShowEvent rNPageShowEvent, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rNPageShowEvent.containerId;
        }
        if ((i11 & 2) != 0) {
            z11 = rNPageShowEvent.fromBackground;
        }
        return rNPageShowEvent.copy(str, z11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContainerId() {
        return this.containerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getFromBackground() {
        return this.fromBackground;
    }

    @NotNull
    public final RNPageShowEvent copy(@Nullable String containerId, boolean fromBackground) {
        return new RNPageShowEvent(containerId, fromBackground);
    }

    @Nullable
    public final String getContainerId() {
        return this.containerId;
    }

    public final boolean getFromBackground() {
        return this.fromBackground;
    }

    public int hashCode() {
        String str = this.containerId;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.fromBackground);
    }

    @NotNull
    public String toString() {
        return "RNPageShowEvent(containerId=" + this.containerId + ", fromBackground=" + this.fromBackground + ')';
    }

    public RNPageShowEvent(@Nullable String str, boolean z11) {
        this.containerId = str;
        this.fromBackground = z11;
    }
}
