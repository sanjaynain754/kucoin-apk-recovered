package p852kotlin.sequences;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.uimanager.ViewProps;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004B=\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\fH\u0096\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lkotlin/sequences/MergingSequence;", "T1", "T2", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/sequences/Sequence;", "sequence1", "sequence2", ViewProps.TRANSFORM, "Lkotlin/Function2;", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MergingSequence<T1, T2, V> implements Sequence<V> {

    @NotNull
    private final Sequence<T1> sequence1;

    @NotNull
    private final Sequence<T2> sequence2;

    @NotNull
    private final Function2<T1, T2, V> transform;

    /* JADX INFO: renamed from: kotlin.sequences.MergingSequence$iterator$1 */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0010(\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000e\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\bJ\t\u0010\t\u001a\u00020\nH\u0096\u0002R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u000b"}, m90084d2 = {"kotlin/sequences/MergingSequence$iterator$1", "", "iterator1", "getIterator1", "()Ljava/util/Iterator;", "iterator2", "getIterator2", "next", "()Ljava/lang/Object;", "hasNext", "", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C414601 implements Iterator<V>, KMappedMarker {
        private final Iterator<T1> iterator1;
        private final Iterator<T2> iterator2;
        final /* synthetic */ MergingSequence<T1, T2, V> this$0;

        public C414601(MergingSequence<T1, T2, V> mergingSequence) {
            this.this$0 = mergingSequence;
            this.iterator1 = ((MergingSequence) mergingSequence).sequence1.iterator();
            this.iterator2 = ((MergingSequence) mergingSequence).sequence2.iterator();
        }

        public final Iterator<T1> getIterator1() {
            return this.iterator1;
        }

        public final Iterator<T2> getIterator2() {
            return this.iterator2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator1.hasNext() && this.iterator2.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return (V) ((MergingSequence) this.this$0).transform.invoke(this.iterator1.next(), this.iterator2.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MergingSequence(@NotNull Sequence<? extends T1> sequence1, @NotNull Sequence<? extends T2> sequence2, @NotNull Function2<? super T1, ? super T2, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(sequence1, "sequence1");
        Intrinsics.checkNotNullParameter(sequence2, "sequence2");
        Intrinsics.checkNotNullParameter(transform, "transform");
        this.sequence1 = sequence1;
        this.sequence2 = sequence2;
        this.transform = transform;
    }

    @Override // p852kotlin.sequences.Sequence
    @NotNull
    public Iterator<V> iterator() {
        return new C414601(this);
    }
}
