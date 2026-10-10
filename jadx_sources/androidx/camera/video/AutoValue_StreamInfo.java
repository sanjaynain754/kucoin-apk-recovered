package androidx.camera.video;

import androidx.camera.core.SurfaceRequest;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_StreamInfo extends StreamInfo {

    /* JADX INFO: renamed from: id */
    private final int f1929id;
    private final SurfaceRequest.TransformationInfo inProgressTransformationInfo;
    private final StreamInfo.StreamState streamState;

    public boolean equals(Object obj) {
        SurfaceRequest.TransformationInfo transformationInfo;
        if (obj == this) {
            return true;
        }
        if (obj instanceof StreamInfo) {
            StreamInfo streamInfo = (StreamInfo) obj;
            if (this.f1929id == streamInfo.getId() && this.streamState.equals(streamInfo.getStreamState()) && ((transformationInfo = this.inProgressTransformationInfo) != null ? transformationInfo.equals(streamInfo.getInProgressTransformationInfo()) : streamInfo.getInProgressTransformationInfo() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.StreamInfo
    public int getId() {
        return this.f1929id;
    }

    @Override // androidx.camera.video.StreamInfo
    public SurfaceRequest.TransformationInfo getInProgressTransformationInfo() {
        return this.inProgressTransformationInfo;
    }

    @Override // androidx.camera.video.StreamInfo
    public StreamInfo.StreamState getStreamState() {
        return this.streamState;
    }

    public int hashCode() {
        int iHashCode = (((this.f1929id ^ 1000003) * 1000003) ^ this.streamState.hashCode()) * 1000003;
        SurfaceRequest.TransformationInfo transformationInfo = this.inProgressTransformationInfo;
        return iHashCode ^ (transformationInfo == null ? 0 : transformationInfo.hashCode());
    }

    public String toString() {
        return "StreamInfo{id=" + this.f1929id + ", streamState=" + this.streamState + ", inProgressTransformationInfo=" + this.inProgressTransformationInfo + "}";
    }

    public AutoValue_StreamInfo(int i11, StreamInfo.StreamState streamState, SurfaceRequest.TransformationInfo transformationInfo) {
        this.f1929id = i11;
        if (streamState != null) {
            this.streamState = streamState;
            this.inProgressTransformationInfo = transformationInfo;
            return;
        }
        throw new NullPointerException("Null streamState");
    }
}
