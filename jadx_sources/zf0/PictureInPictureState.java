package zf0;

import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zf0.a, reason: from toString */
/* JADX INFO: compiled from: PictureInPictureStore.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/pictureinpicture/PictureInPictureState;", "", "isPictureInPictureMode", "Lkotlinx/coroutines/flow/StateFlow;", "", "<init>", "(Lkotlinx/coroutines/flow/StateFlow;)V", "()Lkotlinx/coroutines/flow/StateFlow;", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PictureInPictureState {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final InterfaceC41678w<Boolean> isPictureInPictureMode;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PictureInPictureState) && Intrinsics.areEqual(this.isPictureInPictureMode, ((PictureInPictureState) other).isPictureInPictureMode);
    }

    public PictureInPictureState(@NotNull InterfaceC41678w<Boolean> isPictureInPictureMode) {
        Intrinsics.checkNotNullParameter(isPictureInPictureMode, "isPictureInPictureMode");
        this.isPictureInPictureMode = isPictureInPictureMode;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC41678w<Boolean> m103162a() {
        return this.isPictureInPictureMode;
    }

    public int hashCode() {
        return this.isPictureInPictureMode.hashCode();
    }

    @NotNull
    public String toString() {
        return "PictureInPictureState(isPictureInPictureMode=" + this.isPictureInPictureMode + ')';
    }
}
