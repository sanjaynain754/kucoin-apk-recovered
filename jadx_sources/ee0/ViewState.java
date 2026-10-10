package ee0;

import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ee0.j, reason: from toString */
/* JADX INFO: compiled from: ViewStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003JK\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\bHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/store/ViewState;", "", "isApplyingToTakeSeat", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isOnDisplayResult", "openCameraAfterTakeSeat", "durationCountDown", "", "<init>", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;)V", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getOpenCameraAfterTakeSeat", "getDurationCountDown", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ViewState {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final InterfaceC41669n<Boolean> isApplyingToTakeSeat;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final InterfaceC41669n<Boolean> isOnDisplayResult;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final InterfaceC41669n<Boolean> openCameraAfterTakeSeat;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final InterfaceC41669n<Integer> durationCountDown;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewState)) {
            return false;
        }
        ViewState viewState = (ViewState) other;
        return Intrinsics.areEqual(this.isApplyingToTakeSeat, viewState.isApplyingToTakeSeat) && Intrinsics.areEqual(this.isOnDisplayResult, viewState.isOnDisplayResult) && Intrinsics.areEqual(this.openCameraAfterTakeSeat, viewState.openCameraAfterTakeSeat) && Intrinsics.areEqual(this.durationCountDown, viewState.durationCountDown);
    }

    public ViewState(@NotNull InterfaceC41669n<Boolean> isApplyingToTakeSeat, @NotNull InterfaceC41669n<Boolean> isOnDisplayResult, @NotNull InterfaceC41669n<Boolean> openCameraAfterTakeSeat, @NotNull InterfaceC41669n<Integer> durationCountDown) {
        Intrinsics.checkNotNullParameter(isApplyingToTakeSeat, "isApplyingToTakeSeat");
        Intrinsics.checkNotNullParameter(isOnDisplayResult, "isOnDisplayResult");
        Intrinsics.checkNotNullParameter(openCameraAfterTakeSeat, "openCameraAfterTakeSeat");
        Intrinsics.checkNotNullParameter(durationCountDown, "durationCountDown");
        this.isApplyingToTakeSeat = isApplyingToTakeSeat;
        this.isOnDisplayResult = isOnDisplayResult;
        this.openCameraAfterTakeSeat = openCameraAfterTakeSeat;
        this.durationCountDown = durationCountDown;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC41669n<Integer> m83112a() {
        return this.durationCountDown;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final InterfaceC41669n<Boolean> m83113b() {
        return this.openCameraAfterTakeSeat;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC41669n<Boolean> m83114c() {
        return this.isApplyingToTakeSeat;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC41669n<Boolean> m83115d() {
        return this.isOnDisplayResult;
    }

    public int hashCode() {
        return (((((this.isApplyingToTakeSeat.hashCode() * 31) + this.isOnDisplayResult.hashCode()) * 31) + this.openCameraAfterTakeSeat.hashCode()) * 31) + this.durationCountDown.hashCode();
    }

    @NotNull
    public String toString() {
        return "ViewState(isApplyingToTakeSeat=" + this.isApplyingToTakeSeat + ", isOnDisplayResult=" + this.isOnDisplayResult + ", openCameraAfterTakeSeat=" + this.openCameraAfterTakeSeat + ", durationCountDown=" + this.durationCountDown + ')';
    }
}
