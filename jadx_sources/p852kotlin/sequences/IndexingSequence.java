package p852kotlin.sequences;

import androidx.exifinterface.media.ExifInterface;
import cn.jiguang.privates.push.constants.JPushConstants;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IndexedValue;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\bH\u0096\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lkotlin/sequences/IndexingSequence;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/sequences/Sequence;", "Lkotlin/collections/IndexedValue;", JPushConstants.Operation.KEY_SEQUENCE, "<init>", "(Lkotlin/sequences/Sequence;)V", "iterator", "", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class IndexingSequence<T> implements Sequence<IndexedValue<? extends T>> {

    @NotNull
    private final Sequence<T> sequence;

    /* JADX INFO: renamed from: kotlin.sequences.IndexingSequence$iterator$1 */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002J\t\u0010\r\u001a\u00020\u000eH\u0096\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m90084d2 = {"kotlin/sequences/IndexingSequence$iterator$1", "", "Lkotlin/collections/IndexedValue;", "iterator", "getIterator", "()Ljava/util/Iterator;", "index", "", "getIndex", "()I", "setIndex", "(I)V", "next", "hasNext", "", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C414591 implements Iterator<IndexedValue<? extends T>>, KMappedMarker {
        private int index;
        private final Iterator<T> iterator;

        public final int getIndex() {
            return this.index;
        }

        public final Iterator<T> getIterator() {
            return this.iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public IndexedValue<T> next() {
            int i11 = this.index;
            this.index = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            return new IndexedValue<>(i11, this.iterator.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i11) {
            this.index = i11;
        }

        public C414591(IndexingSequence<T> indexingSequence) {
            this.iterator = ((IndexingSequence) indexingSequence).sequence.iterator();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IndexingSequence(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.sequence = sequence;
    }

    @Override // p852kotlin.sequences.Sequence
    @NotNull
    public Iterator<IndexedValue<T>> iterator() {
        return new C414591(this);
    }
}
