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
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ArraySet.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004H\u0086\b\u001a+\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00040\u0006\"\u0002H\u0004¢\u0006\u0002\u0010\u0007\u001a)\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0003H\u0080\b\u001a'\u0010\b\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000eH\u0080\b\u001a&\u0010\u000f\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010\u0010\u001a\u0002H\nH\u0080\b¢\u0006\u0002\u0010\u0011\u001a \u0010\u0012\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010\u0013\u001a\u00020\u0001H\u0000\u001a \u0010\u0014\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010\u0015\u001a\u00020\u0001H\u0000\u001a\u0019\u0010\u0016\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u0003H\u0080\b\u001a'\u0010\u0017\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000eH\u0080\b\u001a&\u0010\u0018\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010\u0010\u001a\u0002H\nH\u0080\b¢\u0006\u0002\u0010\u0011\u001a!\u0010\u0019\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010\u001a\u001a\u00020\u0001H\u0080\b\u001a#\u0010\u001b\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0080\b\u001a\u0019\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u0003H\u0080\b\u001a*\u0010\u001f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\b\u0010 \u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0015\u001a\u00020\u0001H\u0000\u001a#\u0010!\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\b\u0010 \u001a\u0004\u0018\u00010\u001dH\u0080\b\u001a\u0018\u0010\"\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u0003H\u0000\u001a\u0019\u0010#\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u0003H\u0080\b\u001a)\u0010$\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0003H\u0080\b\u001a'\u0010$\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000eH\u0080\b\u001a&\u0010%\u001a\u0002H\n\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010&\u001a\u00020\u0001H\u0080\b¢\u0006\u0002\u0010'\u001a&\u0010(\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010\u0010\u001a\u0002H\nH\u0080\b¢\u0006\u0002\u0010\u0011\u001a'\u0010)\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000eH\u0080\b\u001a\u0019\u0010*\u001a\u00020+\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u0003H\u0080\b\u001a&\u0010,\u001a\u0002H\n\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010&\u001a\u00020\u0001H\u0080\b¢\u0006\u0002\u0010'\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006-"}, m90084d2 = {"ARRAY_SET_BASE_SIZE", "", "arraySetOf", "Landroidx/collection/ArraySet;", ExifInterface.GPS_DIRECTION_TRUE, "values", "", "([Ljava/lang/Object;)Landroidx/collection/ArraySet;", "addAllInternal", "", ExifInterface.LONGITUDE_EAST, "array", "", "elements", "", "addInternal", "element", "(Landroidx/collection/ArraySet;Ljava/lang/Object;)Z", "allocArrays", "size", "binarySearchInternal", "hash", "clearInternal", "containsAllInternal", "containsInternal", "ensureCapacityInternal", "minimumCapacity", "equalsInternal", "other", "", "hashCodeInternal", "indexOf", "key", "indexOfInternal", "indexOfNull", "isEmptyInternal", "removeAllInternal", "removeAtInternal", "index", "(Landroidx/collection/ArraySet;I)Ljava/lang/Object;", "removeInternal", "retainAllInternal", "toStringInternal", "", "valueAtInternal", "collection"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ArraySetKt {
    public static final int ARRAY_SET_BASE_SIZE = 4;

    public static final <E> void addAllInternal(@NotNull ArraySet<E> arraySet, @NotNull ArraySet<? extends E> array) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        int i11 = array.get_size$collection();
        arraySet.ensureCapacity(arraySet.get_size$collection() + i11);
        if (arraySet.get_size$collection() != 0) {
            for (int i12 = 0; i12 < i11; i12++) {
                arraySet.add(array.valueAt(i12));
            }
            return;
        }
        if (i11 > 0) {
            ArraysKt.copyInto$default(array.getHashes(), arraySet.getHashes(), 0, 0, i11, 6, (Object) null);
            ArraysKt.copyInto$default(array.getArray(), arraySet.getArray(), 0, 0, i11, 6, (Object) null);
            if (arraySet.get_size$collection() != 0) {
                throw new ConcurrentModificationException();
            }
            arraySet.set_size$collection(i11);
        }
    }

    @NotNull
    public static final <T> ArraySet<T> arraySetOf() {
        return new ArraySet<>(0, 1, null);
    }

    public static final <E> boolean removeAllInternal(@NotNull ArraySet<E> arraySet, @NotNull ArraySet<? extends E> array) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        int i11 = array.get_size$collection();
        int i12 = arraySet.get_size$collection();
        for (int i13 = 0; i13 < i11; i13++) {
            arraySet.remove(array.valueAt(i13));
        }
        return i12 != arraySet.get_size$collection();
    }

    public static final <E> boolean addInternal(@NotNull ArraySet<E> arraySet, E e11) {
        int i11;
        int iIndexOf;
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        int i12 = arraySet.get_size$collection();
        if (e11 == null) {
            iIndexOf = indexOfNull(arraySet);
            i11 = 0;
        } else {
            int iHashCode = e11.hashCode();
            i11 = iHashCode;
            iIndexOf = indexOf(arraySet, e11, iHashCode);
        }
        if (iIndexOf >= 0) {
            return false;
        }
        int i13 = ~iIndexOf;
        if (i12 >= arraySet.getHashes().length) {
            int i14 = 8;
            if (i12 >= 8) {
                i14 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i14 = 4;
            }
            int[] hashes = arraySet.getHashes();
            Object[] array = arraySet.getArray();
            allocArrays(arraySet, i14);
            if (i12 != arraySet.get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            if (!(arraySet.getHashes().length == 0)) {
                ArraysKt.copyInto$default(hashes, arraySet.getHashes(), 0, 0, hashes.length, 6, (Object) null);
                ArraysKt.copyInto$default(array, arraySet.getArray(), 0, 0, array.length, 6, (Object) null);
            }
        }
        if (i13 < i12) {
            int i15 = i13 + 1;
            ArraysKt.copyInto(arraySet.getHashes(), arraySet.getHashes(), i15, i13, i12);
            ArraysKt.copyInto(arraySet.getArray(), arraySet.getArray(), i15, i13, i12);
        }
        if (i12 != arraySet.get_size$collection() || i13 >= arraySet.getHashes().length) {
            throw new ConcurrentModificationException();
        }
        arraySet.getHashes()[i13] = i11;
        arraySet.getArray()[i13] = e11;
        arraySet.set_size$collection(arraySet.get_size$collection() + 1);
        return true;
    }

    public static final <E> void allocArrays(@NotNull ArraySet<E> arraySet, int i11) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        arraySet.setHashes$collection(new int[i11]);
        arraySet.setArray$collection(new Object[i11]);
    }

    @NotNull
    public static final <T> ArraySet<T> arraySetOf(@NotNull T... values) {
        Intrinsics.checkNotNullParameter(values, "values");
        ArraySet<T> arraySet = new ArraySet<>(values.length);
        for (T t11 : values) {
            arraySet.add(t11);
        }
        return arraySet;
    }

    public static final <E> int binarySearchInternal(@NotNull ArraySet<E> arraySet, int i11) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        try {
            return ContainerHelpersKt.binarySearch(arraySet.getHashes(), arraySet.get_size$collection(), i11);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> void clearInternal(@NotNull ArraySet<E> arraySet) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        if (arraySet.get_size$collection() != 0) {
            arraySet.setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
            arraySet.setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
            arraySet.set_size$collection(0);
        }
        if (arraySet.get_size$collection() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean containsAllInternal(@NotNull ArraySet<E> arraySet, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!arraySet.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final <E> boolean containsInternal(@NotNull ArraySet<E> arraySet, E e11) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        return arraySet.indexOf(e11) >= 0;
    }

    public static final <E> void ensureCapacityInternal(@NotNull ArraySet<E> arraySet, int i11) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        int i12 = arraySet.get_size$collection();
        if (arraySet.getHashes().length < i11) {
            int[] hashes = arraySet.getHashes();
            Object[] array = arraySet.getArray();
            allocArrays(arraySet, i11);
            if (arraySet.get_size$collection() > 0) {
                ArraysKt.copyInto$default(hashes, arraySet.getHashes(), 0, 0, arraySet.get_size$collection(), 6, (Object) null);
                ArraysKt.copyInto$default(array, arraySet.getArray(), 0, 0, arraySet.get_size$collection(), 6, (Object) null);
            }
        }
        if (arraySet.get_size$collection() != i12) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean equalsInternal(@NotNull ArraySet<E> arraySet, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        if (arraySet == obj) {
            return true;
        }
        if (!(obj instanceof Set) || arraySet.size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int i11 = arraySet.get_size$collection();
            for (int i12 = 0; i12 < i11; i12++) {
                if (!((Set) obj).contains(arraySet.valueAt(i12))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static final <E> int hashCodeInternal(@NotNull ArraySet<E> arraySet) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        int[] hashes = arraySet.getHashes();
        int i11 = arraySet.get_size$collection();
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += hashes[i13];
        }
        return i12;
    }

    public static final <E> int indexOf(@NotNull ArraySet<E> arraySet, @Nullable Object obj, int i11) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        int i12 = arraySet.get_size$collection();
        if (i12 == 0) {
            return -1;
        }
        int iBinarySearchInternal = binarySearchInternal(arraySet, i11);
        if (iBinarySearchInternal < 0 || Intrinsics.areEqual(obj, arraySet.getArray()[iBinarySearchInternal])) {
            return iBinarySearchInternal;
        }
        int i13 = iBinarySearchInternal + 1;
        while (i13 < i12 && arraySet.getHashes()[i13] == i11) {
            if (Intrinsics.areEqual(obj, arraySet.getArray()[i13])) {
                return i13;
            }
            i13++;
        }
        for (int i14 = iBinarySearchInternal - 1; i14 >= 0 && arraySet.getHashes()[i14] == i11; i14--) {
            if (Intrinsics.areEqual(obj, arraySet.getArray()[i14])) {
                return i14;
            }
        }
        return ~i13;
    }

    public static final <E> int indexOfInternal(@NotNull ArraySet<E> arraySet, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        return obj == null ? indexOfNull(arraySet) : indexOf(arraySet, obj, obj.hashCode());
    }

    public static final <E> int indexOfNull(@NotNull ArraySet<E> arraySet) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        return indexOf(arraySet, null, 0);
    }

    public static final <E> boolean isEmptyInternal(@NotNull ArraySet<E> arraySet) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        return arraySet.get_size$collection() <= 0;
    }

    public static final <E> E removeAtInternal(@NotNull ArraySet<E> arraySet, int i11) {
        int i12;
        Object[] objArr;
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        int i13 = arraySet.get_size$collection();
        E e11 = (E) arraySet.getArray()[i11];
        if (i13 <= 1) {
            arraySet.clear();
            return e11;
        }
        int i14 = i13 - 1;
        if (arraySet.getHashes().length <= 8 || arraySet.get_size$collection() >= arraySet.getHashes().length / 3) {
            if (i11 < i14) {
                int i15 = i11 + 1;
                ArraysKt.copyInto(arraySet.getHashes(), arraySet.getHashes(), i11, i15, i13);
                ArraysKt.copyInto(arraySet.getArray(), arraySet.getArray(), i11, i15, i13);
            }
            arraySet.getArray()[i14] = null;
        } else {
            int i16 = arraySet.get_size$collection() > 8 ? arraySet.get_size$collection() + (arraySet.get_size$collection() >> 1) : 8;
            int[] hashes = arraySet.getHashes();
            Object[] array = arraySet.getArray();
            allocArrays(arraySet, i16);
            if (i11 > 0) {
                ArraysKt.copyInto$default(hashes, arraySet.getHashes(), 0, 0, i11, 6, (Object) null);
                objArr = array;
                ArraysKt.copyInto$default(objArr, arraySet.getArray(), 0, 0, i11, 6, (Object) null);
                i12 = i11;
            } else {
                i12 = i11;
                objArr = array;
            }
            if (i12 < i14) {
                int i17 = i12 + 1;
                ArraysKt.copyInto(hashes, arraySet.getHashes(), i12, i17, i13);
                ArraysKt.copyInto(objArr, arraySet.getArray(), i12, i17, i13);
            }
        }
        if (i13 != arraySet.get_size$collection()) {
            throw new ConcurrentModificationException();
        }
        arraySet.set_size$collection(i14);
        return e11;
    }

    public static final <E> boolean removeInternal(@NotNull ArraySet<E> arraySet, E e11) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        int iIndexOf = arraySet.indexOf(e11);
        if (iIndexOf < 0) {
            return false;
        }
        arraySet.removeAt(iIndexOf);
        return true;
    }

    public static final <E> boolean retainAllInternal(@NotNull ArraySet<E> arraySet, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z11 = false;
        for (int i11 = arraySet.get_size$collection() - 1; -1 < i11; i11--) {
            if (!CollectionsKt.contains(elements, arraySet.getArray()[i11])) {
                arraySet.removeAt(i11);
                z11 = true;
            }
        }
        return z11;
    }

    @NotNull
    public static final <E> String toStringInternal(@NotNull ArraySet<E> arraySet) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        if (arraySet.isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(arraySet.get_size$collection() * 14);
        sb2.append('{');
        int i11 = arraySet.get_size$collection();
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            E eValueAt = arraySet.valueAt(i12);
            if (eValueAt != arraySet) {
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

    public static final <E> E valueAtInternal(@NotNull ArraySet<E> arraySet, int i11) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        return (E) arraySet.getArray()[i11];
    }

    public static final <E> boolean removeAllInternal(@NotNull ArraySet<E> arraySet, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= arraySet.remove(it.next());
        }
        return zRemove;
    }

    public static final <E> boolean addAllInternal(@NotNull ArraySet<E> arraySet, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        arraySet.ensureCapacity(arraySet.get_size$collection() + elements.size());
        Iterator<? extends E> it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= arraySet.add(it.next());
        }
        return zAdd;
    }
}
