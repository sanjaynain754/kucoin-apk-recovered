package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SparseArrayCompat.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a.\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\t\u001a\u0019\u0010\n\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0080\b\u001a!\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0080\b\u001a&\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\u000e\u001a'\u0010\u000f\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\u0010\u001a-\u0010\u000f\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u0002H\u0004H\u0000¢\u0006\u0002\u0010\u0012\u001a!\u0010\u0013\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0080\b\u001a&\u0010\u0014\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0080\b\u001a!\u0010\u0017\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0018\u001a\u00020\u0007H\u0080\b\u001a.\u0010\u0019\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\t\u001a)\u0010\u001a\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00040\u0005H\u0080\b\u001a0\u0010\u001c\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\u0012\u001a \u0010\u001d\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a+\u0010\u001d\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0080\b\u001a!\u0010\u001e\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0018\u001a\u00020\u0007H\u0080\b\u001a)\u0010\u001f\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0080\b\u001a0\u0010!\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\u0012\u001a6\u0010!\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\"\u001a\u0002H\u00042\u0006\u0010#\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010$\u001a.\u0010%\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\t\u001a\u0019\u0010&\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0080\b\u001a\u0019\u0010'\u001a\u00020(\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0080\b\u001a&\u0010)\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0018\u001a\u00020\u0007H\u0080\b¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010*\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0002\u001a:\u0010+\u001a\u0002H,\"\u0004\b\u0000\u0010\u0004\"\n\b\u0001\u0010,*\u0004\u0018\u0001H\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u0002H,H\u0082\b¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m90084d2 = {"DELETED", "", "commonAppend", "", ExifInterface.LONGITUDE_EAST, "Landroidx/collection/SparseArrayCompat;", "key", "", "value", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)V", "commonClear", "commonContainsKey", "", "commonContainsValue", "(Landroidx/collection/SparseArrayCompat;Ljava/lang/Object;)Z", "commonGet", "(Landroidx/collection/SparseArrayCompat;I)Ljava/lang/Object;", "defaultValue", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Ljava/lang/Object;", "commonIndexOfKey", "commonIndexOfValue", "(Landroidx/collection/SparseArrayCompat;Ljava/lang/Object;)I", "commonIsEmpty", "commonKeyAt", "index", "commonPut", "commonPutAll", "other", "commonPutIfAbsent", "commonRemove", "commonRemoveAt", "commonRemoveAtRange", "size", "commonReplace", "oldValue", "newValue", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;Ljava/lang/Object;)Z", "commonSetValueAt", "commonSize", "commonToString", "", "commonValueAt", "gc", "internalGet", ExifInterface.GPS_DIRECTION_TRUE, "collection"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSparseArrayCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n1#1,535:1\n244#1,6:536\n244#1,6:542\n353#1,40:548\n353#1,40:588\n459#1,9:628\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n255#1:536,6\n260#1:542,6\n397#1:548,40\n405#1:588,40\n477#1:628,9\n*E\n"})
public final class SparseArrayCompatKt {

    @NotNull
    private static final Object DELETED = new Object();

    @Nullable
    public static final <E> E commonGet(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i11) {
        E e11;
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i11);
        if (iBinarySearch < 0 || (e11 = (E) sparseArrayCompat.values[iBinarySearch]) == DELETED) {
            return null;
        }
        return e11;
    }

    public static final <E> void commonRemove(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i11) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i11);
        if (iBinarySearch >= 0) {
            Object[] objArr = sparseArrayCompat.values;
            Object obj = objArr[iBinarySearch];
            Object obj2 = DELETED;
            if (obj != obj2) {
                objArr[iBinarySearch] = obj2;
                sparseArrayCompat.garbage = true;
            }
        }
    }

    @Nullable
    public static final <E> E commonReplace(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i11, E e11) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iIndexOfKey = sparseArrayCompat.indexOfKey(i11);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = sparseArrayCompat.values;
        E e12 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e11;
        return e12;
    }

    public static final <E> void commonAppend(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i11, E e11) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int i12 = sparseArrayCompat.size;
        if (i12 != 0 && i11 <= sparseArrayCompat.keys[i12 - 1]) {
            sparseArrayCompat.put(i11, e11);
            return;
        }
        if (sparseArrayCompat.garbage && i12 >= sparseArrayCompat.keys.length) {
            m2258gc(sparseArrayCompat);
        }
        int i13 = sparseArrayCompat.size;
        if (i13 >= sparseArrayCompat.keys.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i13 + 1);
            int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            sparseArrayCompat.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            sparseArrayCompat.values = objArrCopyOf;
        }
        sparseArrayCompat.keys[i13] = i11;
        sparseArrayCompat.values[i13] = e11;
        sparseArrayCompat.size = i13 + 1;
    }

    public static final <E> void commonClear(@NotNull SparseArrayCompat<E> sparseArrayCompat) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int i11 = sparseArrayCompat.size;
        Object[] objArr = sparseArrayCompat.values;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        sparseArrayCompat.size = 0;
        sparseArrayCompat.garbage = false;
    }

    public static final <E> boolean commonContainsKey(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i11) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        return sparseArrayCompat.indexOfKey(i11) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0021 A[RETURN] */
    public static final <E> boolean commonContainsValue(@NotNull SparseArrayCompat<E> sparseArrayCompat, E e11) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m2258gc(sparseArrayCompat);
        }
        int i11 = sparseArrayCompat.size;
        int i12 = 0;
        while (i12 < i11) {
            if (sparseArrayCompat.values[i12] == e11) {
                if (i12 >= 0) {
                    return true;
                }
                return false;
            }
            i12++;
        }
        i12 = -1;
        if (i12 >= 0) {
            return true;
        }
        return false;
    }

    public static final <E> int commonIndexOfKey(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i11) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m2258gc(sparseArrayCompat);
        }
        return ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i11);
    }

    public static final <E> int commonIndexOfValue(@NotNull SparseArrayCompat<E> sparseArrayCompat, E e11) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m2258gc(sparseArrayCompat);
        }
        int i11 = sparseArrayCompat.size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (sparseArrayCompat.values[i12] == e11) {
                return i12;
            }
        }
        return -1;
    }

    public static final <E> boolean commonIsEmpty(@NotNull SparseArrayCompat<E> sparseArrayCompat) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        return sparseArrayCompat.size() == 0;
    }

    public static final <E> int commonKeyAt(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i11) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m2258gc(sparseArrayCompat);
        }
        return sparseArrayCompat.keys[i11];
    }

    public static final <E> void commonPut(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i11, E e11) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i11);
        if (iBinarySearch >= 0) {
            sparseArrayCompat.values[iBinarySearch] = e11;
            return;
        }
        int i12 = ~iBinarySearch;
        if (i12 < sparseArrayCompat.size && sparseArrayCompat.values[i12] == DELETED) {
            sparseArrayCompat.keys[i12] = i11;
            sparseArrayCompat.values[i12] = e11;
            return;
        }
        if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
            m2258gc(sparseArrayCompat);
            i12 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i11);
        }
        int i13 = sparseArrayCompat.size;
        if (i13 >= sparseArrayCompat.keys.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i13 + 1);
            int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            sparseArrayCompat.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            sparseArrayCompat.values = objArrCopyOf;
        }
        int i14 = sparseArrayCompat.size;
        if (i14 - i12 != 0) {
            int[] iArr = sparseArrayCompat.keys;
            int i15 = i12 + 1;
            ArraysKt.copyInto(iArr, iArr, i15, i12, i14);
            Object[] objArr = sparseArrayCompat.values;
            ArraysKt.copyInto(objArr, objArr, i15, i12, sparseArrayCompat.size);
        }
        sparseArrayCompat.keys[i12] = i11;
        sparseArrayCompat.values[i12] = e11;
        sparseArrayCompat.size++;
    }

    public static final <E> void commonPutAll(@NotNull SparseArrayCompat<E> sparseArrayCompat, @NotNull SparseArrayCompat<? extends E> other) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int size = other.size();
        for (int i11 = 0; i11 < size; i11++) {
            int iKeyAt = other.keyAt(i11);
            E eValueAt = other.valueAt(i11);
            int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, iKeyAt);
            if (iBinarySearch >= 0) {
                sparseArrayCompat.values[iBinarySearch] = eValueAt;
            } else {
                int i12 = ~iBinarySearch;
                if (i12 >= sparseArrayCompat.size || sparseArrayCompat.values[i12] != DELETED) {
                    if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                        m2258gc(sparseArrayCompat);
                        i12 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, iKeyAt);
                    }
                    int i13 = sparseArrayCompat.size;
                    if (i13 >= sparseArrayCompat.keys.length) {
                        int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i13 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
                        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
                        sparseArrayCompat.keys = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                        sparseArrayCompat.values = objArrCopyOf;
                    }
                    int i14 = sparseArrayCompat.size;
                    if (i14 - i12 != 0) {
                        int[] iArr = sparseArrayCompat.keys;
                        int i15 = i12 + 1;
                        ArraysKt.copyInto(iArr, iArr, i15, i12, i14);
                        Object[] objArr = sparseArrayCompat.values;
                        ArraysKt.copyInto(objArr, objArr, i15, i12, sparseArrayCompat.size);
                    }
                    sparseArrayCompat.keys[i12] = iKeyAt;
                    sparseArrayCompat.values[i12] = eValueAt;
                    sparseArrayCompat.size++;
                } else {
                    sparseArrayCompat.keys[i12] = iKeyAt;
                    sparseArrayCompat.values[i12] = eValueAt;
                }
            }
        }
    }

    @Nullable
    public static final <E> E commonPutIfAbsent(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i11, E e11) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        E e12 = (E) commonGet(sparseArrayCompat, i11);
        if (e12 == null) {
            int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i11);
            if (iBinarySearch >= 0) {
                sparseArrayCompat.values[iBinarySearch] = e11;
                return e12;
            }
            int i12 = ~iBinarySearch;
            if (i12 < sparseArrayCompat.size && sparseArrayCompat.values[i12] == DELETED) {
                sparseArrayCompat.keys[i12] = i11;
                sparseArrayCompat.values[i12] = e11;
                return e12;
            }
            if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                m2258gc(sparseArrayCompat);
                i12 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i11);
            }
            int i13 = sparseArrayCompat.size;
            if (i13 >= sparseArrayCompat.keys.length) {
                int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i13 + 1);
                int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
                Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
                sparseArrayCompat.keys = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                sparseArrayCompat.values = objArrCopyOf;
            }
            int i14 = sparseArrayCompat.size;
            if (i14 - i12 != 0) {
                int[] iArr = sparseArrayCompat.keys;
                int i15 = i12 + 1;
                ArraysKt.copyInto(iArr, iArr, i15, i12, i14);
                Object[] objArr = sparseArrayCompat.values;
                ArraysKt.copyInto(objArr, objArr, i15, i12, sparseArrayCompat.size);
            }
            sparseArrayCompat.keys[i12] = i11;
            sparseArrayCompat.values[i12] = e11;
            sparseArrayCompat.size++;
        }
        return e12;
    }

    public static final <E> void commonRemoveAt(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i11) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.values[i11] != DELETED) {
            sparseArrayCompat.values[i11] = DELETED;
            sparseArrayCompat.garbage = true;
        }
    }

    public static final <E> void commonRemoveAtRange(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i11, int i12) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iMin = Math.min(i12, i11 + i12);
        while (i11 < iMin) {
            sparseArrayCompat.removeAt(i11);
            i11++;
        }
    }

    public static final <E> void commonSetValueAt(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i11, E e11) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m2258gc(sparseArrayCompat);
        }
        sparseArrayCompat.values[i11] = e11;
    }

    public static final <E> int commonSize(@NotNull SparseArrayCompat<E> sparseArrayCompat) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m2258gc(sparseArrayCompat);
        }
        return sparseArrayCompat.size;
    }

    @NotNull
    public static final <E> String commonToString(@NotNull SparseArrayCompat<E> sparseArrayCompat) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.size() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(sparseArrayCompat.size * 28);
        sb2.append('{');
        int i11 = sparseArrayCompat.size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(sparseArrayCompat.keyAt(i12));
            sb2.append('=');
            E eValueAt = sparseArrayCompat.valueAt(i12);
            if (eValueAt != sparseArrayCompat) {
                sb2.append(eValueAt);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        return string;
    }

    public static final <E> E commonValueAt(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i11) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            m2258gc(sparseArrayCompat);
        }
        return (E) sparseArrayCompat.values[i11];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: gc */
    public static final <E> void m2258gc(SparseArrayCompat<E> sparseArrayCompat) {
        int i11 = sparseArrayCompat.size;
        int[] iArr = sparseArrayCompat.keys;
        Object[] objArr = sparseArrayCompat.values;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
            if (obj != DELETED) {
                if (i13 != i12) {
                    iArr[i12] = iArr[i13];
                    objArr[i12] = obj;
                    objArr[i13] = null;
                }
                i12++;
            }
        }
        sparseArrayCompat.garbage = false;
        sparseArrayCompat.size = i12;
    }

    private static final <E, T extends E> T internalGet(SparseArrayCompat<E> sparseArrayCompat, int i11, T t11) {
        T t12;
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i11);
        return (iBinarySearch < 0 || (t12 = (T) sparseArrayCompat.values[iBinarySearch]) == DELETED) ? t11 : t12;
    }

    public static final <E> E commonGet(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i11, E e11) {
        E e12;
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i11);
        return (iBinarySearch < 0 || (e12 = (E) sparseArrayCompat.values[iBinarySearch]) == DELETED) ? e11 : e12;
    }

    public static final <E> boolean commonReplace(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i11, E e11, E e12) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iIndexOfKey = sparseArrayCompat.indexOfKey(i11);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(sparseArrayCompat.values[iIndexOfKey], e11)) {
            return false;
        }
        sparseArrayCompat.values[iIndexOfKey] = e12;
        return true;
    }

    public static final <E> boolean commonRemove(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i11, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iIndexOfKey = sparseArrayCompat.indexOfKey(i11);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(obj, sparseArrayCompat.valueAt(iIndexOfKey))) {
            return false;
        }
        sparseArrayCompat.removeAt(iIndexOfKey);
        return true;
    }
}
