package androidx.camera.video;

import android.location.Location;
import androidx.annotation.IntRange;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: classes23.dex */
public abstract class OutputOptions {
    public static final int DURATION_UNLIMITED = 0;
    public static final int FILE_SIZE_UNLIMITED = 0;
    private final OutputOptionsInternal mOutputOptionsInternal;

    public static abstract class Builder<T extends OutputOptions, B> {
        final OutputOptionsInternal.Builder<?> mRootInternalBuilder;

        public abstract T build();

        /* JADX WARN: Multi-variable type inference failed */
        public B setDurationLimitMillis(@IntRange(from = 0) long j11) {
            Preconditions.checkArgument(j11 >= 0, "The specified duration limit can't be negative.");
            this.mRootInternalBuilder.setDurationLimitMillis(j11);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public B setFileSizeLimit(@IntRange(from = 0) long j11) {
            Preconditions.checkArgument(j11 >= 0, "The specified file size limit can't be negative.");
            this.mRootInternalBuilder.setFileSizeLimit(j11);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public B setLocation(Location location) {
            if (location != null) {
                boolean z11 = false;
                Preconditions.checkArgument(location.getLatitude() >= -90.0d && location.getLatitude() <= 90.0d, "Latitude must be in the range [-90, 90]");
                if (location.getLongitude() >= -180.0d && location.getLongitude() <= 180.0d) {
                    z11 = true;
                }
                Preconditions.checkArgument(z11, "Longitude must be in the range [-180, 180]");
            }
            this.mRootInternalBuilder.setLocation(location);
            return this;
        }

        public Builder(OutputOptionsInternal.Builder<?> builder) {
            this.mRootInternalBuilder = builder;
            builder.setFileSizeLimit(0L);
            builder.setDurationLimitMillis(0L);
        }
    }

    public static abstract class OutputOptionsInternal {

        public static abstract class Builder<B> {
            public abstract OutputOptionsInternal build();

            public abstract B setDurationLimitMillis(@IntRange(from = 0) long j11);

            public abstract B setFileSizeLimit(@IntRange(from = 0) long j11);

            public abstract B setLocation(Location location);
        }

        @IntRange(from = 0)
        public abstract long getDurationLimitMillis();

        @IntRange(from = 0)
        public abstract long getFileSizeLimit();

        public abstract Location getLocation();
    }

    @IntRange(from = 0)
    public long getDurationLimitMillis() {
        return this.mOutputOptionsInternal.getDurationLimitMillis();
    }

    @IntRange(from = 0)
    public long getFileSizeLimit() {
        return this.mOutputOptionsInternal.getFileSizeLimit();
    }

    public Location getLocation() {
        return this.mOutputOptionsInternal.getLocation();
    }

    public OutputOptions(OutputOptionsInternal outputOptionsInternal) {
        this.mOutputOptionsInternal = outputOptionsInternal;
    }
}
