package androidx.media3.exoplayer.upstream;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface LoadErrorHandlingPolicy {
    public static final int FALLBACK_TYPE_LOCATION = 1;
    public static final int FALLBACK_TYPE_TRACK = 2;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FallbackType {
    }

    @Nullable
    FallbackSelection getFallbackSelectionFor(FallbackOptions fallbackOptions, LoadErrorInfo loadErrorInfo);

    int getMinimumLoadableRetryCount(int i11);

    long getRetryDelayMsFor(LoadErrorInfo loadErrorInfo);

    public static final class FallbackOptions {
        public final int numberOfExcludedLocations;
        public final int numberOfExcludedTracks;
        public final int numberOfLocations;
        public final int numberOfTracks;

        public boolean isFallbackAvailable(int i11) {
            if (i11 == 1) {
                return this.numberOfLocations - this.numberOfExcludedLocations > 1;
            }
            return this.numberOfTracks - this.numberOfExcludedTracks > 1;
        }

        public FallbackOptions(int i11, int i12, int i13, int i14) {
            this.numberOfLocations = i11;
            this.numberOfExcludedLocations = i12;
            this.numberOfTracks = i13;
            this.numberOfExcludedTracks = i14;
        }
    }

    public static final class FallbackSelection {
        public final long exclusionDurationMs;
        public final int type;

        public FallbackSelection(int i11, long j11) {
            boolean z11;
            if (j11 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Assertions.checkArgument(z11);
            this.type = i11;
            this.exclusionDurationMs = j11;
        }
    }

    public static final class LoadErrorInfo {
        public final int errorCount;
        public final IOException exception;
        public final LoadEventInfo loadEventInfo;
        public final MediaLoadData mediaLoadData;

        public LoadErrorInfo(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, int i11) {
            this.loadEventInfo = loadEventInfo;
            this.mediaLoadData = mediaLoadData;
            this.exception = iOException;
            this.errorCount = i11;
        }
    }

    default void onLoadTaskConcluded(long j11) {
    }
}
