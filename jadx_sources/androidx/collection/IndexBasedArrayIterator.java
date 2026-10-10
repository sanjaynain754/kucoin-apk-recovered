package androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: compiled from: IndexBasedArrayIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\n\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0004H$¢\u0006\u0002\u0010\u000bJ\t\u0010\f\u001a\u00020\u0007H\u0096\u0002J\u000e\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0004H$R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Landroidx/collection/IndexBasedArrayIterator;", ExifInterface.GPS_DIRECTION_TRUE, "", "startingSize", "", "(I)V", "canRemove", "", "index", "size", "elementAt", "(I)Ljava/lang/Object;", "hasNext", "next", "()Ljava/lang/Object;", "remove", "", "removeAt", "collection"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIndexBasedArrayIterator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndexBasedArrayIterator.kt\nandroidx/collection/IndexBasedArrayIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
public abstract class IndexBasedArrayIterator<T> implements Iterator<T>, KMutableIterator {
    private boolean canRemove;
    private int index;
    private int size;

    public abstract T elementAt(int index);

    public abstract void removeAt(int index);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.size;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.canRemove) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i11 = this.index - 1;
        this.index = i11;
        removeAt(i11);
        this.size--;
        this.canRemove = false;
    }

    public IndexBasedArrayIterator(int i11) {
        this.size = i11;
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            T tElementAt = elementAt(this.index);
            this.index++;
            this.canRemove = true;
            return tElementAt;
        }
        throw new NoSuchElementException();
    }
}
