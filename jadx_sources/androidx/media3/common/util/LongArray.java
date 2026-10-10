package androidx.media3.common.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class LongArray {
    private static final int DEFAULT_INITIAL_CAPACITY = 32;
    private int size;
    private long[] values;

    public LongArray() {
        this(32);
    }

    public LongArray(int i11) {
        this.values = new long[i11];
    }

    public void add(long j11) {
        int i11 = this.size;
        long[] jArr = this.values;
        if (i11 == jArr.length) {
            this.values = Arrays.copyOf(jArr, i11 * 2);
        }
        long[] jArr2 = this.values;
        int i12 = this.size;
        this.size = i12 + 1;
        jArr2[i12] = j11;
    }

    public void addAll(long[] jArr) {
        int length = this.size + jArr.length;
        long[] jArr2 = this.values;
        if (length > jArr2.length) {
            this.values = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.values, this.size, jArr.length);
        this.size = length;
    }

    public long get(int i11) {
        if (i11 >= 0 && i11 < this.size) {
            return this.values[i11];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i11 + ", size is " + this.size);
    }

    public int size() {
        return this.size;
    }

    public long[] toArray() {
        return Arrays.copyOf(this.values, this.size);
    }
}
