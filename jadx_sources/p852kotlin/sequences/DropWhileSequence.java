package p852kotlin.sequences;

import androidx.exifinterface.media.ExifInterface;
import cn.jiguang.privates.push.constants.JPushConstants;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B)\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lkotlin/sequences/DropWhileSequence;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/sequences/Sequence;", JPushConstants.Operation.KEY_SEQUENCE, "predicate", "Lkotlin/Function1;", "", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DropWhileSequence<T> implements Sequence<T> {

    @NotNull
    private final Function1<T, Boolean> predicate;

    @NotNull
    private final Sequence<T> sequence;

    /* JADX INFO: renamed from: kotlin.sequences.DropWhileSequence$iterator$1 */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\rJ\t\u0010\u0014\u001a\u00020\u0015H\u0096\u0002R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, m90084d2 = {"kotlin/sequences/DropWhileSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "dropState", "", "getDropState", "()I", "setDropState", "(I)V", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "drop", "", "next", "hasNext", "", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C414551 implements Iterator<T>, KMappedMarker {
        private int dropState = -1;
        private final Iterator<T> iterator;
        private T nextItem;
        final /* synthetic */ DropWhileSequence<T> this$0;

        public C414551(DropWhileSequence<T> dropWhileSequence) {
            this.this$0 = dropWhileSequence;
            this.iterator = ((DropWhileSequence) dropWhileSequence).sequence.iterator();
        }

        private final void drop() {
            while (this.iterator.hasNext()) {
                T next = this.iterator.next();
                if (!((Boolean) ((DropWhileSequence) this.this$0).predicate.invoke(next)).booleanValue()) {
                    this.nextItem = next;
                    this.dropState = 1;
                    return;
                }
            }
            this.dropState = 0;
        }

        public final int getDropState() {
            return this.dropState;
        }

        public final Iterator<T> getIterator() {
            return this.iterator;
        }

        public final T getNextItem() {
            return this.nextItem;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.dropState == -1) {
                drop();
            }
            return this.dropState == 1 || this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.dropState == -1) {
                drop();
            }
            if (this.dropState != 1) {
                return this.iterator.next();
            }
            T t11 = this.nextItem;
            this.nextItem = null;
            this.dropState = 0;
            return t11;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setDropState(int i11) {
            this.dropState = i11;
        }

        public final void setNextItem(T t11) {
            this.nextItem = t11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DropWhileSequence(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.sequence = sequence;
        this.predicate = predicate;
    }

    @Override // p852kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new C414551(this);
    }
}
