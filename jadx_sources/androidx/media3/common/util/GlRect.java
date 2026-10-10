package androidx.media3.common.util;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class GlRect {
    public int bottom;
    public int left;
    public int right;
    public int top;

    public GlRect(int i11, int i12) {
        this(0, 0, i11, i12);
    }

    public GlRect(int i11, int i12, int i13, int i14) {
        Assertions.checkArgument(i11 <= i13 && i12 <= i14);
        this.left = i11;
        this.bottom = i12;
        this.right = i13;
        this.top = i14;
    }
}
