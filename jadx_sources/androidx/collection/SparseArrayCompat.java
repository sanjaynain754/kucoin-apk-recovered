package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SparseArrayCompat.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001d\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J\u0015\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0017J\u0018\u0010\u001d\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0014\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0002\u0010\u001eJ\u001d\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010#J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0016J\u001d\u0010&\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u0018\u0010'\u001a\u00020\u00132\u000e\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000H\u0016J\u001f\u0010)\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010 J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J\u001a\u0010*\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010+\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u0004H\u0016J\u0018\u0010,\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u001f\u0010-\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010 J%\u0010-\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010.\u001a\u00028\u00002\u0006\u0010/\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00100J\u001d\u00101\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u00102\u001a\u000203H\u0016J\u0015\u00104\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010\u001eR\u0012\u0010\u0006\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0004\n\u0002\u0010\u0011¨\u00065"}, m90084d2 = {"Landroidx/collection/SparseArrayCompat;", ExifInterface.LONGITUDE_EAST, "", "initialCapacity", "", "(I)V", "garbage", "", "isEmpty", "getIsEmpty", "()Z", "keys", "", "size", "values", "", "", "[Ljava/lang/Object;", "append", "", "key", "value", "(ILjava/lang/Object;)V", "clear", "clone", "containsKey", "containsValue", "(Ljava/lang/Object;)Z", "delete", "get", "(I)Ljava/lang/Object;", "defaultValue", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOfKey", "indexOfValue", "(Ljava/lang/Object;)I", "keyAt", "index", "put", "putAll", "other", "putIfAbsent", "remove", "removeAt", "removeAtRange", "replace", "oldValue", "newValue", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "setValueAt", "toString", "", "valueAt", "collection"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSparseArrayCompat.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n+ 2 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n1#1,273:1\n275#2,9:274\n288#2,5:283\n296#2,5:288\n304#2,8:293\n320#2,9:301\n353#2,40:310\n396#2,2:350\n353#2,47:352\n403#2,3:399\n353#2,40:402\n407#2:442\n412#2,4:443\n419#2:447\n423#2,4:448\n431#2,8:452\n443#2,5:460\n451#2,4:465\n459#2,9:469\n472#2:478\n477#2:479\n459#2,9:480\n482#2,8:489\n493#2,17:497\n513#2,21:514\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n*L\n130#1:274,9\n135#1:283,5\n144#1:288,5\n152#1:293,8\n163#1:301,9\n169#1:310,40\n176#1:350,2\n176#1:352,47\n186#1:399,3\n186#1:402,40\n186#1:442\n191#1:443,4\n205#1:447\n212#1:448,4\n218#1:452,8\n224#1:460,5\n234#1:465,4\n246#1:469,9\n249#1:478\n252#1:479\n252#1:480,9\n257#1:489,8\n263#1:497,17\n271#1:514,21\n*E\n"})
public class SparseArrayCompat<E> implements Cloneable {

    @JvmField
    public /* synthetic */ boolean garbage;

    @JvmField
    public /* synthetic */ int[] keys;

    @JvmField
    public /* synthetic */ int size;

    @JvmField
    public /* synthetic */ Object[] values;

    @JvmOverloads
    public SparseArrayCompat() {
        this(0, 1, null);
    }

    @Nullable
    public E get(int key) {
        return (E) SparseArrayCompatKt.commonGet(this, key);
    }

    public void remove(int key) {
        SparseArrayCompatKt.commonRemove(this, key);
    }

    @Nullable
    public E replace(int key, E value) {
        int iIndexOfKey = indexOfKey(key);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.values;
        E e11 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = value;
        return e11;
    }

    @JvmOverloads
    public SparseArrayCompat(int i11) {
        if (i11 == 0) {
            this.keys = ContainerHelpersKt.EMPTY_INTS;
            this.values = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i11);
            this.keys = new int[iIdealIntArraySize];
            this.values = new Object[iIdealIntArraySize];
        }
    }

    public void append(int key, E value) {
        int i11 = this.size;
        if (i11 != 0 && key <= this.keys[i11 - 1]) {
            put(key, value);
            return;
        }
        if (this.garbage && i11 >= this.keys.length) {
            SparseArrayCompatKt.m2258gc(this);
        }
        int i12 = this.size;
        if (i12 >= this.keys.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.keys, iIdealIntArraySize);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.values = objArrCopyOf;
        }
        this.keys[i12] = key;
        this.values[i12] = value;
        this.size = i12 + 1;
    }

    public void clear() {
        int i11 = this.size;
        Object[] objArr = this.values;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    @NotNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SparseArrayCompat<E> m103470clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        SparseArrayCompat<E> sparseArrayCompat = (SparseArrayCompat) objClone;
        sparseArrayCompat.keys = (int[]) this.keys.clone();
        sparseArrayCompat.values = (Object[]) this.values.clone();
        return sparseArrayCompat;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x001c A[RETURN] */
    public boolean containsValue(E value) {
        if (this.garbage) {
            SparseArrayCompatKt.m2258gc(this);
        }
        int i11 = this.size;
        int i12 = 0;
        while (i12 < i11) {
            if (this.values[i12] == value) {
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

    public E get(int key, E defaultValue) {
        return (E) SparseArrayCompatKt.commonGet(this, key, defaultValue);
    }

    public int indexOfKey(int key) {
        if (this.garbage) {
            SparseArrayCompatKt.m2258gc(this);
        }
        return ContainerHelpersKt.binarySearch(this.keys, this.size, key);
    }

    public int indexOfValue(E value) {
        if (this.garbage) {
            SparseArrayCompatKt.m2258gc(this);
        }
        int i11 = this.size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.values[i12] == value) {
                return i12;
            }
        }
        return -1;
    }

    public int keyAt(int index) {
        if (this.garbage) {
            SparseArrayCompatKt.m2258gc(this);
        }
        return this.keys[index];
    }

    public void put(int key, E value) {
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, key);
        if (iBinarySearch >= 0) {
            this.values[iBinarySearch] = value;
            return;
        }
        int i11 = ~iBinarySearch;
        if (i11 < this.size && this.values[i11] == SparseArrayCompatKt.DELETED) {
            this.keys[i11] = key;
            this.values[i11] = value;
            return;
        }
        if (this.garbage && this.size >= this.keys.length) {
            SparseArrayCompatKt.m2258gc(this);
            i11 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, key);
        }
        int i12 = this.size;
        if (i12 >= this.keys.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.keys, iIdealIntArraySize);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.values = objArrCopyOf;
        }
        int i13 = this.size;
        if (i13 - i11 != 0) {
            int[] iArr = this.keys;
            int i14 = i11 + 1;
            ArraysKt.copyInto(iArr, iArr, i14, i11, i13);
            Object[] objArr = this.values;
            ArraysKt.copyInto(objArr, objArr, i14, i11, this.size);
        }
        this.keys[i11] = key;
        this.values[i11] = value;
        this.size++;
    }

    public void putAll(@NotNull SparseArrayCompat<? extends E> other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int size = other.size();
        for (int i11 = 0; i11 < size; i11++) {
            int iKeyAt = other.keyAt(i11);
            E eValueAt = other.valueAt(i11);
            int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, iKeyAt);
            if (iBinarySearch >= 0) {
                this.values[iBinarySearch] = eValueAt;
            } else {
                int i12 = ~iBinarySearch;
                if (i12 >= this.size || this.values[i12] != SparseArrayCompatKt.DELETED) {
                    if (this.garbage && this.size >= this.keys.length) {
                        SparseArrayCompatKt.m2258gc(this);
                        i12 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, iKeyAt);
                    }
                    int i13 = this.size;
                    if (i13 >= this.keys.length) {
                        int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i13 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(this.keys, iIdealIntArraySize);
                        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
                        this.keys = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                        this.values = objArrCopyOf;
                    }
                    int i14 = this.size;
                    if (i14 - i12 != 0) {
                        int[] iArr = this.keys;
                        int i15 = i12 + 1;
                        ArraysKt.copyInto(iArr, iArr, i15, i12, i14);
                        Object[] objArr = this.values;
                        ArraysKt.copyInto(objArr, objArr, i15, i12, this.size);
                    }
                    this.keys[i12] = iKeyAt;
                    this.values[i12] = eValueAt;
                    this.size++;
                } else {
                    this.keys[i12] = iKeyAt;
                    this.values[i12] = eValueAt;
                }
            }
        }
    }

    public boolean remove(int key, @Nullable Object value) {
        int iIndexOfKey = indexOfKey(key);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(value, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public void removeAt(int index) {
        if (this.values[index] != SparseArrayCompatKt.DELETED) {
            this.values[index] = SparseArrayCompatKt.DELETED;
            this.garbage = true;
        }
    }

    public void removeAtRange(int index, int size) {
        int iMin = Math.min(size, index + size);
        while (index < iMin) {
            removeAt(index);
            index++;
        }
    }

    public void setValueAt(int index, E value) {
        if (this.garbage) {
            SparseArrayCompatKt.m2258gc(this);
        }
        this.values[index] = value;
    }

    public int size() {
        if (this.garbage) {
            SparseArrayCompatKt.m2258gc(this);
        }
        return this.size;
    }

    public E valueAt(int index) {
        if (this.garbage) {
            SparseArrayCompatKt.m2258gc(this);
        }
        return (E) this.values[index];
    }

    public boolean containsKey(int key) {
        if (indexOfKey(key) >= 0) {
            return true;
        }
        return false;
    }

    @Deprecated(message = "Alias for remove(int).", replaceWith = @ReplaceWith(expression = "remove(key)", imports = {}))
    public void delete(int key) {
        remove(key);
    }

    @JvmName(name = "getIsEmpty")
    public final boolean getIsEmpty() {
        return isEmpty();
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Nullable
    public E putIfAbsent(int key, E value) {
        E e11 = (E) SparseArrayCompatKt.commonGet(this, key);
        if (e11 == null) {
            int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, key);
            if (iBinarySearch >= 0) {
                this.values[iBinarySearch] = value;
                return e11;
            }
            int i11 = ~iBinarySearch;
            if (i11 < this.size && this.values[i11] == SparseArrayCompatKt.DELETED) {
                this.keys[i11] = key;
                this.values[i11] = value;
                return e11;
            }
            if (this.garbage && this.size >= this.keys.length) {
                SparseArrayCompatKt.m2258gc(this);
                i11 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, key);
            }
            int i12 = this.size;
            if (i12 >= this.keys.length) {
                int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i12 + 1);
                int[] iArrCopyOf = Arrays.copyOf(this.keys, iIdealIntArraySize);
                Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
                this.keys = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                this.values = objArrCopyOf;
            }
            int i13 = this.size;
            if (i13 - i11 != 0) {
                int[] iArr = this.keys;
                int i14 = i11 + 1;
                ArraysKt.copyInto(iArr, iArr, i14, i11, i13);
                Object[] objArr = this.values;
                ArraysKt.copyInto(objArr, objArr, i14, i11, this.size);
            }
            this.keys[i11] = key;
            this.values[i11] = value;
            this.size++;
        }
        return e11;
    }

    @NotNull
    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.size * 28);
        sb2.append('{');
        int i11 = this.size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(keyAt(i12));
            sb2.append('=');
            E eValueAt = valueAt(i12);
            if (eValueAt != this) {
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

    public boolean replace(int key, E oldValue, E newValue) {
        int iIndexOfKey = indexOfKey(key);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(this.values[iIndexOfKey], oldValue)) {
            return false;
        }
        this.values[iIndexOfKey] = newValue;
        return true;
    }

    public /* synthetic */ SparseArrayCompat(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 10 : i11);
    }
}
