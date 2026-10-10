package io.trtc.tuikit.atomicxcore.api.live;

import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39393c;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b¨\u0006\u0017"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/LikeState;", "", "Lkotlinx/coroutines/flow/w;", "", "totalLikeCount", "<init>", "(Lkotlinx/coroutines/flow/w;)V", "component1", "()Lkotlinx/coroutines/flow/w;", "copy", "(Lkotlinx/coroutines/flow/w;)Lio/trtc/tuikit/atomicxcore/api/live/LikeState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/w;", "getTotalLikeCount", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class LikeState {

    @NotNull
    private final InterfaceC41678w<Long> totalLikeCount;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LikeState) && Intrinsics.areEqual(this.totalLikeCount, ((LikeState) other).totalLikeCount);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LikeState copy$default(LikeState likeState, InterfaceC41678w interfaceC41678w, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC41678w = likeState.totalLikeCount;
        }
        return likeState.copy(interfaceC41678w);
    }

    @NotNull
    public final InterfaceC41678w<Long> component1() {
        return this.totalLikeCount;
    }

    @NotNull
    public final InterfaceC41678w<Long> getTotalLikeCount() {
        return this.totalLikeCount;
    }

    public int hashCode() {
        return this.totalLikeCount.hashCode();
    }

    @NotNull
    public String toString() {
        return AbstractC39393c.m88222a(new StringBuilder("LikeState(totalLikeCount="), this.totalLikeCount, ')');
    }

    public LikeState(@NotNull InterfaceC41678w<Long> totalLikeCount) {
        Intrinsics.checkNotNullParameter(totalLikeCount, "totalLikeCount");
        this.totalLikeCount = totalLikeCount;
    }

    @NotNull
    public final LikeState copy(@NotNull InterfaceC41678w<Long> totalLikeCount) {
        Intrinsics.checkNotNullParameter(totalLikeCount, "totalLikeCount");
        return new LikeState(totalLikeCount);
    }
}
