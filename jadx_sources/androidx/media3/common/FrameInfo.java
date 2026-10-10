package androidx.media3.common;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class FrameInfo {
    public final ColorInfo colorInfo;
    public final int height;
    public final long offsetToAddUs;
    public final float pixelWidthHeightRatio;
    public final int width;

    public static final class Builder {
        private ColorInfo colorInfo;
        private int height;
        private long offsetToAddUs;
        private float pixelWidthHeightRatio;
        private int width;

        public Builder(ColorInfo colorInfo, int i11, int i12) {
            this.colorInfo = colorInfo;
            this.width = i11;
            this.height = i12;
            this.pixelWidthHeightRatio = 1.0f;
        }

        public FrameInfo build() {
            return new FrameInfo(this.colorInfo, this.width, this.height, this.pixelWidthHeightRatio, this.offsetToAddUs);
        }

        @CanIgnoreReturnValue
        public Builder setColorInfo(ColorInfo colorInfo) {
            this.colorInfo = colorInfo;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHeight(int i11) {
            this.height = i11;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setOffsetToAddUs(long j11) {
            this.offsetToAddUs = j11;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPixelWidthHeightRatio(float f11) {
            this.pixelWidthHeightRatio = f11;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setWidth(int i11) {
            this.width = i11;
            return this;
        }

        public Builder(FrameInfo frameInfo) {
            this.colorInfo = frameInfo.colorInfo;
            this.width = frameInfo.width;
            this.height = frameInfo.height;
            this.pixelWidthHeightRatio = frameInfo.pixelWidthHeightRatio;
            this.offsetToAddUs = frameInfo.offsetToAddUs;
        }
    }

    private FrameInfo(ColorInfo colorInfo, int i11, int i12, float f11, long j11) {
        Assertions.checkArgument(i11 > 0, "width must be positive, but is: " + i11);
        Assertions.checkArgument(i12 > 0, "height must be positive, but is: " + i12);
        this.colorInfo = colorInfo;
        this.width = i11;
        this.height = i12;
        this.pixelWidthHeightRatio = f11;
        this.offsetToAddUs = j11;
    }
}
