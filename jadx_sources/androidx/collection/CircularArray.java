package androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CircularArray.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0016\u001a\u00020\u0012J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\u0016\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u000b\u0010\u001d\u001a\u00028\u0000¢\u0006\u0002\u0010\fJ\u000b\u0010\u001e\u001a\u00028\u0000¢\u0006\u0002\u0010\fJ\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0004J\u000e\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0004J\u0006\u0010\"\u001a\u00020\u0004R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\n\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Landroidx/collection/CircularArray;", ExifInterface.LONGITUDE_EAST, "", "minCapacity", "", "(I)V", "capacityBitmask", "elements", "", "[Ljava/lang/Object;", "first", "getFirst", "()Ljava/lang/Object;", TtmlNode.TAG_HEAD, "last", "getLast", "tail", "addFirst", "", "element", "(Ljava/lang/Object;)V", "addLast", "clear", "doubleCapacity", "get", "index", "(I)Ljava/lang/Object;", "isEmpty", "", "popFirst", "popLast", "removeFromEnd", "count", "removeFromStart", "size", "collection"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCircularArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,270:1\n1#2:271\n26#3:272\n26#3:273\n26#3:274\n26#3:275\n26#3:276\n26#3:277\n26#3:278\n*S KotlinDebug\n*F\n+ 1 CircularArray.kt\nandroidx/collection/CircularArray\n*L\n104#1:272\n122#1:273\n152#1:274\n187#1:275\n221#1:276\n235#1:277\n249#1:278\n*E\n"})
public final class CircularArray<E> {
    private int capacityBitmask;

    @NotNull
    private E[] elements;
    private int head;
    private int tail;

    @JvmOverloads
    public CircularArray() {
        this(0, 1, null);
    }

    @JvmOverloads
    public CircularArray(int i11) {
        if (i11 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i11 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i11 = Integer.bitCount(i11) != 1 ? Integer.highestOneBit(i11 - 1) << 1 : i11;
        this.capacityBitmask = i11 - 1;
        this.elements = (E[]) new Object[i11];
    }

    private final void doubleCapacity() {
        E[] eArr = this.elements;
        int length = eArr.length;
        int i11 = this.head;
        int i12 = length - i11;
        int i13 = length << 1;
        if (i13 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i13];
        ArraysKt.copyInto(eArr, eArr2, 0, i11, length);
        ArraysKt.copyInto(this.elements, eArr2, i12, 0, this.head);
        this.elements = eArr2;
        this.head = 0;
        this.tail = length;
        this.capacityBitmask = i13 - 1;
    }

    public final void addFirst(E element) {
        int i11 = (this.head - 1) & this.capacityBitmask;
        this.head = i11;
        this.elements[i11] = element;
        if (i11 == this.tail) {
            doubleCapacity();
        }
    }

    public final void addLast(E element) {
        E[] eArr = this.elements;
        int i11 = this.tail;
        eArr[i11] = element;
        int i12 = this.capacityBitmask & (i11 + 1);
        this.tail = i12;
        if (i12 == this.head) {
            doubleCapacity();
        }
    }

    public final E get(int index) {
        if (index < 0 || index >= size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e11 = this.elements[this.capacityBitmask & (this.head + index)];
        Intrinsics.checkNotNull(e11);
        return e11;
    }

    public final E getFirst() {
        int i11 = this.head;
        if (i11 == this.tail) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e11 = this.elements[i11];
        Intrinsics.checkNotNull(e11);
        return e11;
    }

    public final E getLast() {
        int i11 = this.head;
        int i12 = this.tail;
        if (i11 == i12) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e11 = this.elements[(i12 - 1) & this.capacityBitmask];
        Intrinsics.checkNotNull(e11);
        return e11;
    }

    public final boolean isEmpty() {
        return this.head == this.tail;
    }

    public final E popFirst() {
        int i11 = this.head;
        if (i11 == this.tail) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.elements;
        E e11 = eArr[i11];
        eArr[i11] = null;
        this.head = (i11 + 1) & this.capacityBitmask;
        return e11;
    }

    public final E popLast() {
        int i11 = this.head;
        int i12 = this.tail;
        if (i11 == i12) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i13 = this.capacityBitmask & (i12 - 1);
        E[] eArr = this.elements;
        E e11 = eArr[i13];
        eArr[i13] = null;
        this.tail = i13;
        return e11;
    }

    public final void removeFromEnd(int count) {
        if (count <= 0) {
            return;
        }
        if (count > size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.tail;
        int i12 = count < i11 ? i11 - count : 0;
        for (int i13 = i12; i13 < i11; i13++) {
            this.elements[i13] = null;
        }
        int i14 = this.tail;
        int i15 = i14 - i12;
        int i16 = count - i15;
        this.tail = i14 - i15;
        if (i16 > 0) {
            int length = this.elements.length;
            this.tail = length;
            int i17 = length - i16;
            for (int i18 = i17; i18 < length; i18++) {
                this.elements[i18] = null;
            }
            this.tail = i17;
        }
    }

    public final void removeFromStart(int count) {
        if (count <= 0) {
            return;
        }
        if (count > size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.elements.length;
        int i11 = this.head;
        if (count < length - i11) {
            length = i11 + count;
        }
        while (i11 < length) {
            this.elements[i11] = null;
            i11++;
        }
        int i12 = this.head;
        int i13 = length - i12;
        int i14 = count - i13;
        this.head = this.capacityBitmask & (i12 + i13);
        if (i14 > 0) {
            for (int i15 = 0; i15 < i14; i15++) {
                this.elements[i15] = null;
            }
            this.head = i14;
        }
    }

    public final int size() {
        return (this.tail - this.head) & this.capacityBitmask;
    }

    public final void clear() {
        removeFromStart(size());
    }

    public /* synthetic */ CircularArray(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 8 : i11);
    }
}
