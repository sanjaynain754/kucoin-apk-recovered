package androidx.media3.exoplayer.source;

import android.util.SparseArray;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;

/* JADX INFO: loaded from: classes34.dex */
final class SpannedData<V> {
    private int memoizedReadIndex;
    private final Consumer<V> removeCallback;
    private final SparseArray<V> spans;

    public SpannedData() {
        this(new Consumer() { // from class: androidx.media3.exoplayer.source.d0
            @Override // androidx.media3.common.util.Consumer
            public final void accept(Object obj) {
                SpannedData.m3406a(obj);
            }
        });
    }

    public void clear() {
        for (int i11 = 0; i11 < this.spans.size(); i11++) {
            this.removeCallback.accept(this.spans.valueAt(i11));
        }
        this.memoizedReadIndex = -1;
        this.spans.clear();
    }

    public void discardTo(int i11) {
        int i12 = 0;
        while (i12 < this.spans.size() - 1) {
            int i13 = i12 + 1;
            if (i11 < this.spans.keyAt(i13)) {
                return;
            }
            this.removeCallback.accept(this.spans.valueAt(i12));
            this.spans.removeAt(i12);
            int i14 = this.memoizedReadIndex;
            if (i14 > 0) {
                this.memoizedReadIndex = i14 - 1;
            }
            i12 = i13;
        }
    }

    public SpannedData(Consumer<V> consumer) {
        this.spans = new SparseArray<>();
        this.removeCallback = consumer;
        this.memoizedReadIndex = -1;
    }

    public void appendSpan(int i11, V v11) {
        if (this.memoizedReadIndex == -1) {
            Assertions.checkState(this.spans.size() == 0);
            this.memoizedReadIndex = 0;
        }
        if (this.spans.size() > 0) {
            SparseArray<V> sparseArray = this.spans;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            Assertions.checkArgument(i11 >= iKeyAt);
            if (iKeyAt == i11) {
                Consumer<V> consumer = this.removeCallback;
                SparseArray<V> sparseArray2 = this.spans;
                consumer.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.spans.append(i11, v11);
    }

    public void discardFrom(int i11) {
        for (int size = this.spans.size() - 1; size >= 0 && i11 < this.spans.keyAt(size); size--) {
            this.removeCallback.accept(this.spans.valueAt(size));
            this.spans.removeAt(size);
        }
        this.memoizedReadIndex = this.spans.size() > 0 ? Math.min(this.memoizedReadIndex, this.spans.size() - 1) : -1;
    }

    public V get(int i11) {
        if (this.memoizedReadIndex == -1) {
            this.memoizedReadIndex = 0;
        }
        while (true) {
            int i12 = this.memoizedReadIndex;
            if (i12 <= 0 || i11 >= this.spans.keyAt(i12)) {
                break;
            }
            this.memoizedReadIndex--;
        }
        while (this.memoizedReadIndex < this.spans.size() - 1 && i11 >= this.spans.keyAt(this.memoizedReadIndex + 1)) {
            this.memoizedReadIndex++;
        }
        return this.spans.valueAt(this.memoizedReadIndex);
    }

    public V getEndValue() {
        SparseArray<V> sparseArray = this.spans;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean isEmpty() {
        return this.spans.size() == 0;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3406a(Object obj) {
    }
}
