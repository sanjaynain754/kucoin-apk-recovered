package p852kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: ReversedViews.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0000\n\u0002\u0010*\n\u0000\b\u0012\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\bH\u0096\u0002¢\u0006\u0002\u0010\rJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0096\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\f\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, m90084d2 = {"Lkotlin/collections/ReversedListReadOnly;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/collections/AbstractList;", "delegate", "", "<init>", "(Ljava/util/List;)V", "size", "", "getSize", "()I", "get", "index", "(I)Ljava/lang/Object;", "iterator", "", "listIterator", "", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
class ReversedListReadOnly<T> extends AbstractList<T> {

    @NotNull
    private final List<T> delegate;

    /* JADX INFO: renamed from: kotlin.collections.ReversedListReadOnly$listIterator$1 */
    /* JADX INFO: compiled from: ReversedViews.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000e\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\r\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\tJ\b\u0010\r\u001a\u00020\u000bH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000e"}, m90084d2 = {"kotlin/collections/ReversedListReadOnly$listIterator$1", "", "delegateIterator", "getDelegateIterator", "()Ljava/util/ListIterator;", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "", "previous", "previousIndex", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C411071 implements ListIterator<T>, KMappedMarker {
        private final ListIterator<T> delegateIterator;
        final /* synthetic */ ReversedListReadOnly<T> this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public C411071(ReversedListReadOnly<? extends T> reversedListReadOnly, int i11) {
            this.this$0 = reversedListReadOnly;
            this.delegateIterator = ((ReversedListReadOnly) reversedListReadOnly).delegate.listIterator(CollectionsKt__ReversedViewsKt.reversePositionIndex$CollectionsKt__ReversedViewsKt(reversedListReadOnly, i11));
        }

        @Override // java.util.ListIterator
        public void add(T t11) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final ListIterator<T> getDelegateIterator() {
            return this.delegateIterator;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.delegateIterator.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.delegateIterator.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.delegateIterator.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return CollectionsKt__ReversedViewsKt.reverseIteratorIndex$CollectionsKt__ReversedViewsKt(this.this$0, this.delegateIterator.previousIndex());
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.delegateIterator.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return CollectionsKt__ReversedViewsKt.reverseIteratorIndex$CollectionsKt__ReversedViewsKt(this.this$0, this.delegateIterator.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(T t11) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // p852kotlin.collections.AbstractList, p852kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // p852kotlin.collections.AbstractList, java.util.List
    @NotNull
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReversedListReadOnly(@NotNull List<? extends T> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // p852kotlin.collections.AbstractList, java.util.List
    public T get(int index) {
        return this.delegate.get(CollectionsKt__ReversedViewsKt.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, index));
    }

    @Override // p852kotlin.collections.AbstractList, p852kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public int get_size() {
        return this.delegate.size();
    }

    @Override // p852kotlin.collections.AbstractList, java.util.List
    @NotNull
    public ListIterator<T> listIterator(int index) {
        return new C411071(this, index);
    }
}
