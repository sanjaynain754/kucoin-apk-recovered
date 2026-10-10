package androidx.media3.common.util;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class Size {
    public static final Size UNKNOWN = new Size(-1, -1);
    public static final Size ZERO = new Size(0, 0);
    private final int height;
    private final int width;

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.width == size.width && this.height == size.height) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i11 = this.height;
        int i12 = this.width;
        return i11 ^ ((i12 >>> 16) | (i12 << 16));
    }

    public String toString() {
        return this.width + "x" + this.height;
    }

    public Size(int i11, int i12) {
        boolean z11;
        if ((i11 != -1 && i11 < 0) || (i12 != -1 && i12 < 0)) {
            z11 = false;
        } else {
            z11 = true;
        }
        Assertions.checkArgument(z11);
        this.width = i11;
        this.height = i12;
    }
}
