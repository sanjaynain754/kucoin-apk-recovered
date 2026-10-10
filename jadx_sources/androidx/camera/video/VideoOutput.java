package androidx.camera.video;

import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.ConstantObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.Timebase;

/* JADX INFO: loaded from: classes23.dex */
public interface VideoOutput {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public enum SourceState {
        ACTIVE_STREAMING,
        ACTIVE_NON_STREAMING,
        INACTIVE
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    default Observable<MediaSpec> getMediaSpec() {
        return ConstantObservable.withValue(null);
    }

    void onSurfaceRequested(SurfaceRequest surfaceRequest);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    default void onSurfaceRequested(SurfaceRequest surfaceRequest, Timebase timebase, boolean z11) {
        onSurfaceRequested(surfaceRequest);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    default VideoCapabilities getMediaCapabilities(CameraInfo cameraInfo, int i11) {
        return VideoCapabilities.EMPTY;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    default Observable<StreamInfo> getStreamInfo() {
        return StreamInfo.ALWAYS_ACTIVE_OBSERVABLE;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    default Observable<Boolean> isSourceStreamRequired() {
        return ConstantObservable.withValue(Boolean.FALSE);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    default void onSourceStateChanged(SourceState sourceState) {
    }
}
