package com.kubi.kyc.ui.kycv2.camera;

import com.kubi.mvi.state.InterfaceC19284f;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kyc.ui.kycv2.camera.KycCameraContract$UIState, reason: from toString */
/* JADX INFO: compiled from: KycCameraContract.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/kyc/ui/kycv2/camera/KycCameraContract$UIState;", "Lcom/kubi/mvi/state/IState;", "cameraState", "Lcom/kubi/kyc/ui/kycv2/camera/CameraState;", "path", "", "availableCameraLens", "", "", "cameraLens", "<init>", "(Lcom/kubi/kyc/ui/kycv2/camera/CameraState;Ljava/lang/String;Ljava/util/List;I)V", "getCameraState", "()Lcom/kubi/kyc/ui/kycv2/camera/CameraState;", "getPath", "()Ljava/lang/String;", "getAvailableCameraLens", "()Ljava/util/List;", "getCameraLens", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UIState implements InterfaceC19284f {

    @NotNull
    private final List<Integer> availableCameraLens;
    private final int cameraLens;

    @NotNull
    private final CameraState cameraState;

    @Nullable
    private final String path;

    public UIState() {
        this(null, null, null, 0, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return this.cameraState == uIState.cameraState && Intrinsics.areEqual(this.path, uIState.path) && Intrinsics.areEqual(this.availableCameraLens, uIState.availableCameraLens) && this.cameraLens == uIState.cameraLens;
    }

    public UIState(@NotNull CameraState cameraState, @Nullable String str, @NotNull List<Integer> availableCameraLens, int i11) {
        Intrinsics.checkNotNullParameter(cameraState, "cameraState");
        Intrinsics.checkNotNullParameter(availableCameraLens, "availableCameraLens");
        this.cameraState = cameraState;
        this.path = str;
        this.availableCameraLens = availableCameraLens;
        this.cameraLens = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UIState copy$default(UIState uIState, CameraState cameraState, String str, List list, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            cameraState = uIState.cameraState;
        }
        if ((i12 & 2) != 0) {
            str = uIState.path;
        }
        if ((i12 & 4) != 0) {
            list = uIState.availableCameraLens;
        }
        if ((i12 & 8) != 0) {
            i11 = uIState.cameraLens;
        }
        return uIState.copy(cameraState, str, list, i11);
    }

    @NotNull
    public final UIState copy(@NotNull CameraState cameraState, @Nullable String path, @NotNull List<Integer> availableCameraLens, int cameraLens) {
        Intrinsics.checkNotNullParameter(cameraState, "cameraState");
        Intrinsics.checkNotNullParameter(availableCameraLens, "availableCameraLens");
        return new UIState(cameraState, path, availableCameraLens, cameraLens);
    }

    @NotNull
    public final List<Integer> getAvailableCameraLens() {
        return this.availableCameraLens;
    }

    public final int getCameraLens() {
        return this.cameraLens;
    }

    @NotNull
    public final CameraState getCameraState() {
        return this.cameraState;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        int iHashCode = this.cameraState.hashCode() * 31;
        String str = this.path;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.availableCameraLens.hashCode()) * 31) + Integer.hashCode(this.cameraLens);
    }

    @NotNull
    public String toString() {
        return "UIState(cameraState=" + this.cameraState + ", path=" + this.path + ", availableCameraLens=" + this.availableCameraLens + ", cameraLens=" + this.cameraLens + ')';
    }

    public /* synthetic */ UIState(CameraState cameraState, String str, List list, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? CameraState.NULL : cameraState, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? CollectionsKt.listOf(1) : list, (i12 & 8) != 0 ? 1 : i11);
    }
}
