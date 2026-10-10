package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.Objects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class LoadingInfo {
    public final long lastRebufferRealtimeMs;
    public final long playbackPositionUs;
    public final float playbackSpeed;

    public static final class Builder {
        private long lastRebufferRealtimeMs;
        private long playbackPositionUs;
        private float playbackSpeed;

        @CanIgnoreReturnValue
        public Builder setPlaybackSpeed(float f11) {
            Assertions.checkArgument(f11 > 0.0f || f11 == -3.4028235E38f);
            this.playbackSpeed = f11;
            return this;
        }

        public Builder() {
            this.playbackPositionUs = C2711C.TIME_UNSET;
            this.playbackSpeed = -3.4028235E38f;
            this.lastRebufferRealtimeMs = C2711C.TIME_UNSET;
        }

        public LoadingInfo build() {
            return new LoadingInfo(this);
        }

        @CanIgnoreReturnValue
        public Builder setLastRebufferRealtimeMs(long j11) {
            Assertions.checkArgument(j11 >= 0 || j11 == C2711C.TIME_UNSET);
            this.lastRebufferRealtimeMs = j11;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPlaybackPositionUs(long j11) {
            this.playbackPositionUs = j11;
            return this;
        }

        private Builder(LoadingInfo loadingInfo) {
            this.playbackPositionUs = loadingInfo.playbackPositionUs;
            this.playbackSpeed = loadingInfo.playbackSpeed;
            this.lastRebufferRealtimeMs = loadingInfo.lastRebufferRealtimeMs;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadingInfo)) {
            return false;
        }
        LoadingInfo loadingInfo = (LoadingInfo) obj;
        return this.playbackPositionUs == loadingInfo.playbackPositionUs && this.playbackSpeed == loadingInfo.playbackSpeed && this.lastRebufferRealtimeMs == loadingInfo.lastRebufferRealtimeMs;
    }

    private LoadingInfo(Builder builder) {
        this.playbackPositionUs = builder.playbackPositionUs;
        this.playbackSpeed = builder.playbackSpeed;
        this.lastRebufferRealtimeMs = builder.lastRebufferRealtimeMs;
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.playbackPositionUs), Float.valueOf(this.playbackSpeed), Long.valueOf(this.lastRebufferRealtimeMs));
    }

    public boolean rebufferedSince(long j11) {
        long j12 = this.lastRebufferRealtimeMs;
        return (j12 == C2711C.TIME_UNSET || j11 == C2711C.TIME_UNSET || j12 < j11) ? false : true;
    }
}
