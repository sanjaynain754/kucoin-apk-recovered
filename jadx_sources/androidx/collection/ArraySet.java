package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.ArrayIteratorKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.markers.KMutableCollection;
import p852kotlin.jvm.internal.markers.KMutableSet;

/* JADX INFO: compiled from: ArraySet.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010)\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001?B\u0019\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u0019\b\u0016\u0012\u0010\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0011\b\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0015\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020$2\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000J\u0016\u0010#\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\b\u0010&\u001a\u00020$H\u0016J\u0016\u0010'\u001a\u00020 2\u0006\u0010!\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\"J\u0016\u0010(\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\u000e\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020\fJ\u0013\u0010+\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010-\u001a\u00020\fH\u0016J\u0010\u0010.\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010\u0012J\b\u00100\u001a\u00020 H\u0016J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0096\u0002J\u0015\u00103\u001a\u00020 2\u0006\u0010!\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\"J\u0016\u00104\u001a\u00020 2\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000J\u0016\u00104\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\u0013\u00105\u001a\u00028\u00002\u0006\u00106\u001a\u00020\f¢\u0006\u0002\u00107J\u0016\u00108\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\u0013\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\t¢\u0006\u0002\u0010\u0014J%\u00109\u001a\b\u0012\u0004\u0012\u0002H:0\t\"\u0004\b\u0001\u0010:2\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H:0\t¢\u0006\u0002\u0010;J\b\u0010<\u001a\u00020=H\u0016J\u0013\u0010>\u001a\u00028\u00002\u0006\u00106\u001a\u00020\f¢\u0006\u0002\u00107R\u001a\u0010\u000e\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\rR$\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\tX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010¨\u0006@"}, m90084d2 = {"Landroidx/collection/ArraySet;", ExifInterface.LONGITUDE_EAST, "", "", "set", "(Landroidx/collection/ArraySet;)V", "", "(Ljava/util/Collection;)V", "array", "", "([Ljava/lang/Object;)V", "capacity", "", "(I)V", "_size", "get_size$collection", "()I", "set_size$collection", "", "getArray$collection", "()[Ljava/lang/Object;", "setArray$collection", "[Ljava/lang/Object;", "hashes", "", "getHashes$collection", "()[I", "setHashes$collection", "([I)V", "size", "getSize", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "", "elements", "clear", "contains", "containsAll", "ensureCapacity", "minimumCapacity", "equals", "other", "hashCode", "indexOf", "key", "isEmpty", "iterator", "", "remove", "removeAll", "removeAt", "index", "(I)Ljava/lang/Object;", "retainAll", "toArray", ExifInterface.GPS_DIRECTION_TRUE, "([Ljava/lang/Object;)[Ljava/lang/Object;", "toString", "", "valueAt", "ElementIterator", "collection"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nArraySet.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n+ 2 ArraySet.kt\nandroidx/collection/ArraySetKt\n*L\n1#1,300:1\n304#2,10:301\n317#2,14:311\n334#2:325\n339#2:326\n345#2:327\n350#2:328\n355#2,61:329\n420#2,17:390\n440#2,6:407\n450#2,60:413\n518#2,9:473\n531#2,22:482\n557#2,7:504\n568#2,19:511\n591#2,6:530\n601#2,6:536\n611#2,5:542\n620#2,8:547\n*S KotlinDebug\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n*L\n98#1:301,10\n108#1:311,14\n118#1:325\n128#1:326\n138#1:327\n145#1:328\n157#1:329,61\n167#1:390,17\n177#1:407,6\n188#1:413,60\n197#1:473,9\n224#1:482,22\n231#1:504,7\n240#1:511,19\n267#1:530,6\n276#1:536,6\n286#1:542,5\n297#1:547,8\n*E\n"})
public final class ArraySet<E> implements Collection<E>, Set<E>, KMutableCollection, KMutableSet {
    private int _size;

    @NotNull
    private Object[] array;

    @NotNull
    private int[] hashes;

    /* JADX INFO: compiled from: ArraySet.jvm.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\t"}, m90084d2 = {"Landroidx/collection/ArraySet$ElementIterator;", "Landroidx/collection/IndexBasedArrayIterator;", "(Landroidx/collection/ArraySet;)V", "elementAt", "index", "", "(I)Ljava/lang/Object;", "removeAt", "", "collection"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public final class ElementIterator extends IndexBasedArrayIterator<E> {
        public ElementIterator() {
            super(ArraySet.this.get_size$collection());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public E elementAt(int index) {
            return ArraySet.this.valueAt(index);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public void removeAt(int index) {
            ArraySet.this.removeAt(index);
        }
    }

    @JvmOverloads
    public ArraySet() {
        this(0, 1, null);
    }

    public final void addAll(@NotNull ArraySet<? extends E> array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i11 = array.get_size$collection();
        ensureCapacity(get_size$collection() + i11);
        if (get_size$collection() != 0) {
            for (int i12 = 0; i12 < i11; i12++) {
                add(array.valueAt(i12));
            }
            return;
        }
        if (i11 > 0) {
            ArraysKt.copyInto$default(array.getHashes(), getHashes(), 0, 0, i11, 6, (Object) null);
            ArraysKt.copyInto$default(array.getArray(), getArray(), 0, 0, i11, 6, (Object) null);
            if (get_size$collection() != 0) {
                throw new ConcurrentModificationException();
            }
            set_size$collection(i11);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Set) || size() != ((Set) other).size()) {
            return false;
        }
        try {
            int i11 = get_size$collection();
            for (int i12 = 0; i12 < i11; i12++) {
                if (!((Set) other).contains(valueAt(i12))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final boolean removeAll(@NotNull ArraySet<? extends E> array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i11 = array.get_size$collection();
        int i12 = get_size$collection();
        for (int i13 = 0; i13 < i11; i13++) {
            remove(array.valueAt(i13));
        }
        return i12 != get_size$collection();
    }

    @Override // java.util.Collection, java.util.Set
    @NotNull
    public final Object[] toArray() {
        return ArraysKt.copyOfRange(this.array, 0, this._size);
    }

    @JvmOverloads
    public ArraySet(int i11) {
        this.hashes = ContainerHelpersKt.EMPTY_INTS;
        this.array = ContainerHelpersKt.EMPTY_OBJECTS;
        if (i11 > 0) {
            ArraySetKt.allocArrays(this, i11);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E element) {
        int i11;
        int iIndexOf;
        int i12 = get_size$collection();
        if (element == null) {
            iIndexOf = ArraySetKt.indexOfNull(this);
            i11 = 0;
        } else {
            int iHashCode = element.hashCode();
            i11 = iHashCode;
            iIndexOf = ArraySetKt.indexOf(this, element, iHashCode);
        }
        if (iIndexOf >= 0) {
            return false;
        }
        int i13 = ~iIndexOf;
        if (i12 >= getHashes().length) {
            int i14 = 8;
            if (i12 >= 8) {
                i14 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i14 = 4;
            }
            int[] hashes = getHashes();
            Object[] array = getArray();
            ArraySetKt.allocArrays(this, i14);
            if (i12 != get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            if (!(getHashes().length == 0)) {
                ArraysKt.copyInto$default(hashes, getHashes(), 0, 0, hashes.length, 6, (Object) null);
                ArraysKt.copyInto$default(array, getArray(), 0, 0, array.length, 6, (Object) null);
            }
        }
        if (i13 < i12) {
            int i15 = i13 + 1;
            ArraysKt.copyInto(getHashes(), getHashes(), i15, i13, i12);
            ArraysKt.copyInto(getArray(), getArray(), i15, i13, i12);
        }
        if (i12 != get_size$collection() || i13 >= getHashes().length) {
            throw new ConcurrentModificationException();
        }
        getHashes()[i13] = i11;
        getArray()[i13] = element;
        set_size$collection(get_size$collection() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: getArray$collection, reason: from getter */
    public final Object[] getArray() {
        return this.array;
    }

    @NotNull
    /* JADX INFO: renamed from: getHashes$collection, reason: from getter */
    public final int[] getHashes() {
        return this.hashes;
    }

    /* JADX INFO: renamed from: getSize, reason: from getter */
    public int get_size() {
        return this._size;
    }

    public final int get_size$collection() {
        return this._size;
    }

    public final int indexOf(@Nullable Object key) {
        return key == null ? ArraySetKt.indexOfNull(this) : ArraySetKt.indexOf(this, key, key.hashCode());
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return new ElementIterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z11 = false;
        for (int i11 = get_size$collection() - 1; -1 < i11; i11--) {
            if (!CollectionsKt.contains(elements, getArray()[i11])) {
                removeAt(i11);
                z11 = true;
            }
        }
        return z11;
    }

    public final void setArray$collection(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.array = objArr;
    }

    public final void setHashes$collection(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.hashes = iArr;
    }

    public final void set_size$collection(int i11) {
        this._size = i11;
    }

    @Override // java.util.Collection, java.util.Set
    @NotNull
    public final <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        T[] result = (T[]) ArraySetJvmUtil.resizeForToArray(array, this._size);
        ArraysKt.copyInto(this.array, result, 0, 0, this._size);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (get_size$collection() != 0) {
            setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
            setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
            set_size$collection(0);
        }
        if (get_size$collection() == 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object element) {
        if (indexOf(element) >= 0) {
            return true;
        }
        return false;
    }

    public final void ensureCapacity(int minimumCapacity) {
        int i11 = get_size$collection();
        if (getHashes().length < minimumCapacity) {
            int[] hashes = getHashes();
            Object[] array = getArray();
            ArraySetKt.allocArrays(this, minimumCapacity);
            if (get_size$collection() > 0) {
                ArraysKt.copyInto$default(hashes, getHashes(), 0, 0, get_size$collection(), 6, (Object) null);
                ArraysKt.copyInto$default(array, getArray(), 0, 0, get_size$collection(), 6, (Object) null);
            }
        }
        if (get_size$collection() == i11) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] hashes = getHashes();
        int i11 = get_size$collection();
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += hashes[i13];
        }
        return i12;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        if (get_size$collection() <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf >= 0) {
            removeAt(iIndexOf);
            return true;
        }
        return false;
    }

    public final E removeAt(int index) {
        int i11;
        Object[] objArr;
        int i12 = get_size$collection();
        E e11 = (E) getArray()[index];
        if (i12 <= 1) {
            clear();
            return e11;
        }
        int i13 = i12 - 1;
        int i14 = 8;
        if (getHashes().length > 8 && get_size$collection() < getHashes().length / 3) {
            if (get_size$collection() > 8) {
                i14 = get_size$collection() + (get_size$collection() >> 1);
            }
            int[] hashes = getHashes();
            Object[] array = getArray();
            ArraySetKt.allocArrays(this, i14);
            if (index > 0) {
                ArraysKt.copyInto$default(hashes, getHashes(), 0, 0, index, 6, (Object) null);
                objArr = array;
                ArraysKt.copyInto$default(objArr, getArray(), 0, 0, index, 6, (Object) null);
                i11 = index;
            } else {
                i11 = index;
                objArr = array;
            }
            if (i11 < i13) {
                int i15 = i11 + 1;
                ArraysKt.copyInto(hashes, getHashes(), i11, i15, i12);
                ArraysKt.copyInto(objArr, getArray(), i11, i15, i12);
            }
        } else {
            if (index < i13) {
                int i16 = index + 1;
                ArraysKt.copyInto(getHashes(), getHashes(), index, i16, i12);
                ArraysKt.copyInto(getArray(), getArray(), index, i16, i12);
            }
            getArray()[i13] = null;
        }
        if (i12 == get_size$collection()) {
            set_size$collection(i13);
            return e11;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return get_size();
    }

    @NotNull
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(get_size$collection() * 14);
        sb2.append('{');
        int i11 = get_size$collection();
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            E eValueAt = valueAt(i12);
            if (eValueAt != this) {
                sb2.append(eValueAt);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final E valueAt(int index) {
        return (E) getArray()[index];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    public /* synthetic */ ArraySet(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11);
    }

    public ArraySet(@Nullable ArraySet<? extends E> arraySet) {
        this(0);
        if (arraySet != null) {
            addAll((ArraySet) arraySet);
        }
    }

    public ArraySet(@Nullable Collection<? extends E> collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        ensureCapacity(get_size$collection() + elements.size());
        Iterator<? extends E> it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet(@Nullable E[] eArr) {
        this(0);
        if (eArr != null) {
            Iterator it = ArrayIteratorKt.iterator(eArr);
            while (it.hasNext()) {
                add(it.next());
            }
        }
    }
}
