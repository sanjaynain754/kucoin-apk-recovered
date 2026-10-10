package io.trtc.tuikit.atomicxcore.api.device;

import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39393c;
import io.trtc.tuikit.atomicxcore.api.call.AbstractC39397b;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ@\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\n¨\u0006\u001d"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyState;", "", "Lkotlinx/coroutines/flow/w;", "", "smoothLevel", "whitenessLevel", "ruddyLevel", "<init>", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V", "component1", "()Lkotlinx/coroutines/flow/w;", "component2", "component3", "copy", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/w;", "getSmoothLevel", "getWhitenessLevel", "getRuddyLevel", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class BaseBeautyState {

    @NotNull
    private final InterfaceC41678w<Float> ruddyLevel;

    @NotNull
    private final InterfaceC41678w<Float> smoothLevel;

    @NotNull
    private final InterfaceC41678w<Float> whitenessLevel;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseBeautyState)) {
            return false;
        }
        BaseBeautyState baseBeautyState = (BaseBeautyState) other;
        return Intrinsics.areEqual(this.smoothLevel, baseBeautyState.smoothLevel) && Intrinsics.areEqual(this.whitenessLevel, baseBeautyState.whitenessLevel) && Intrinsics.areEqual(this.ruddyLevel, baseBeautyState.ruddyLevel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BaseBeautyState copy$default(BaseBeautyState baseBeautyState, InterfaceC41678w interfaceC41678w, InterfaceC41678w interfaceC41678w2, InterfaceC41678w interfaceC41678w3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC41678w = baseBeautyState.smoothLevel;
        }
        if ((i11 & 2) != 0) {
            interfaceC41678w2 = baseBeautyState.whitenessLevel;
        }
        if ((i11 & 4) != 0) {
            interfaceC41678w3 = baseBeautyState.ruddyLevel;
        }
        return baseBeautyState.copy(interfaceC41678w, interfaceC41678w2, interfaceC41678w3);
    }

    @NotNull
    public final InterfaceC41678w<Float> component1() {
        return this.smoothLevel;
    }

    @NotNull
    public final InterfaceC41678w<Float> component2() {
        return this.whitenessLevel;
    }

    @NotNull
    public final InterfaceC41678w<Float> component3() {
        return this.ruddyLevel;
    }

    @NotNull
    public final InterfaceC41678w<Float> getRuddyLevel() {
        return this.ruddyLevel;
    }

    @NotNull
    public final InterfaceC41678w<Float> getSmoothLevel() {
        return this.smoothLevel;
    }

    @NotNull
    public final InterfaceC41678w<Float> getWhitenessLevel() {
        return this.whitenessLevel;
    }

    public int hashCode() {
        return this.ruddyLevel.hashCode() + AbstractC39397b.m88226a(this.whitenessLevel, this.smoothLevel.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BaseBeautyState(smoothLevel=");
        sb2.append(this.smoothLevel);
        sb2.append(", whitenessLevel=");
        sb2.append(this.whitenessLevel);
        sb2.append(", ruddyLevel=");
        return AbstractC39393c.m88222a(sb2, this.ruddyLevel, ')');
    }

    public BaseBeautyState(@NotNull InterfaceC41678w<Float> smoothLevel, @NotNull InterfaceC41678w<Float> whitenessLevel, @NotNull InterfaceC41678w<Float> ruddyLevel) {
        Intrinsics.checkNotNullParameter(smoothLevel, "smoothLevel");
        Intrinsics.checkNotNullParameter(whitenessLevel, "whitenessLevel");
        Intrinsics.checkNotNullParameter(ruddyLevel, "ruddyLevel");
        this.smoothLevel = smoothLevel;
        this.whitenessLevel = whitenessLevel;
        this.ruddyLevel = ruddyLevel;
    }

    @NotNull
    public final BaseBeautyState copy(@NotNull InterfaceC41678w<Float> smoothLevel, @NotNull InterfaceC41678w<Float> whitenessLevel, @NotNull InterfaceC41678w<Float> ruddyLevel) {
        Intrinsics.checkNotNullParameter(smoothLevel, "smoothLevel");
        Intrinsics.checkNotNullParameter(whitenessLevel, "whitenessLevel");
        Intrinsics.checkNotNullParameter(ruddyLevel, "ruddyLevel");
        return new BaseBeautyState(smoothLevel, whitenessLevel, ruddyLevel);
    }
}
