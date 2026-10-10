package androidx.camera.video;

import androidx.annotation.RestrictTo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.ConstantObservable;
import androidx.camera.core.impl.Observable;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
@AutoValue
@RestrictTo({RestrictTo.Scope.LIBRARY})
public abstract class StreamInfo {
    static final int STREAM_ID_ANY = 0;
    static final int STREAM_ID_ERROR = -1;
    static final StreamInfo STREAM_INFO_ANY_INACTIVE = m2142of(0, StreamState.INACTIVE);
    static final Set<Integer> NON_SURFACE_STREAM_ID = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));
    static final Observable<StreamInfo> ALWAYS_ACTIVE_OBSERVABLE = ConstantObservable.withValue(m2142of(0, StreamState.ACTIVE));

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public enum StreamState {
        ACTIVE,
        INACTIVE
    }

    /* JADX INFO: renamed from: of */
    public static StreamInfo m2142of(int i11, StreamState streamState) {
        return new AutoValue_StreamInfo(i11, streamState, null);
    }

    public abstract int getId();

    public abstract SurfaceRequest.TransformationInfo getInProgressTransformationInfo();

    public abstract StreamState getStreamState();

    /* JADX INFO: renamed from: of */
    public static StreamInfo m2143of(int i11, StreamState streamState, SurfaceRequest.TransformationInfo transformationInfo) {
        return new AutoValue_StreamInfo(i11, streamState, transformationInfo);
    }
}
