package p852kotlin.sequences;

import androidx.exifinterface.media.ExifInterface;
import cn.jiguang.privates.push.constants.JPushConstants;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0096\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lkotlin/sequences/DropSequence;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", JPushConstants.Operation.KEY_SEQUENCE, "count", "", "<init>", "(Lkotlin/sequences/Sequence;I)V", "drop", "n", "take", "iterator", "", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/DropSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,731:1\n1#2:732\n*E\n"})
public final class DropSequence<T> implements Sequence<T>, DropTakeSequence<T> {
    private final int count;

    @NotNull
    private final Sequence<T> sequence;

    /* JADX INFO: renamed from: kotlin.sequences.DropSequence$iterator$1 */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0010H\u0096\u0002R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, m90084d2 = {"kotlin/sequences/DropSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "left", "", "getLeft", "()I", "setLeft", "(I)V", "drop", "", "next", "()Ljava/lang/Object;", "hasNext", "", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C414541 implements Iterator<T>, KMappedMarker {
        private final Iterator<T> iterator;
        private int left;

        private final void drop() {
            while (this.left > 0 && this.iterator.hasNext()) {
                this.iterator.next();
                this.left--;
            }
        }

        public final Iterator<T> getIterator() {
            return this.iterator;
        }

        public final int getLeft() {
            return this.left;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setLeft(int i11) {
            this.left = i11;
        }

        public C414541(DropSequence<T> dropSequence) {
            this.iterator = ((DropSequence) dropSequence).sequence.iterator();
            this.left = ((DropSequence) dropSequence).count;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            drop();
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            drop();
            return this.iterator.next();
        }
    }

    @Override // p852kotlin.sequences.DropTakeSequence
    @NotNull
    public Sequence<T> drop(int n11) {
        int i11 = this.count + n11;
        return i11 < 0 ? new DropSequence(this, n11) : new DropSequence(this.sequence, i11);
    }

    @Override // p852kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new C414541(this);
    }

    @Override // p852kotlin.sequences.DropTakeSequence
    @NotNull
    public Sequence<T> take(int n11) {
        int i11 = this.count;
        int i12 = i11 + n11;
        return i12 < 0 ? new TakeSequence(this, n11) : new SubSequence(this.sequence, i11, i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DropSequence(@NotNull Sequence<? extends T> sequence, int i11) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.sequence = sequence;
        this.count = i11;
        if (i11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i11 + '.').toString());
    }
}
