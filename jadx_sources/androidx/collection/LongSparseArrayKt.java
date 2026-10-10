package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Arrays;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.LongIterator;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: LongSparseArray.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0000\u001a.\u0010\n\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010\u0010\u001a\u0019\u0010\u0011\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u0005H\u0080\b\u001a!\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0080\b\u001a&\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\u000f\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u0005H\u0080\b\u001a(\u0010\u0017\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0080\b¢\u0006\u0002\u0010\u0018\u001a.\u0010\u0017\u001a\u0002H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010\u001a\u001a:\u0010\u001b\u001a\u0002H\u0004\"\n\b\u0000\u0010\u0004*\u0004\u0018\u0001H\f\"\u0004\b\u0001\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u0002H\u0004H\u0080\b¢\u0006\u0002\u0010\u001a\u001a!\u0010\u001c\u001a\u00020\u0003\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0080\b\u001a&\u0010\u001d\u001a\u00020\u0003\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\u000f\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010\u001e\u001a\u0019\u0010\u001f\u001a\u00020\u0013\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u0005H\u0080\b\u001a!\u0010 \u001a\u00020\u000e\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010!\u001a\u00020\u0003H\u0080\b\u001a.\u0010\"\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010\u0010\u001a)\u0010#\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u000e\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\f0\u0005H\u0080\b\u001a0\u0010%\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010\u001a\u001a!\u0010&\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0080\b\u001a.\u0010&\u001a\u00020\u0013\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010'\u001a!\u0010(\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010!\u001a\u00020\u0003H\u0080\b\u001a0\u0010)\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010\u001a\u001a6\u0010)\u001a\u00020\u0013\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010*\u001a\u0002H\f2\u0006\u0010+\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010,\u001a.\u0010-\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u0002H\fH\u0080\b¢\u0006\u0002\u0010.\u001a\u0019\u0010/\u001a\u00020\u0003\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u0005H\u0080\b\u001a\u0019\u00100\u001a\u000201\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u0005H\u0080\b\u001a&\u00102\u001a\u0002H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010!\u001a\u00020\u0003H\u0080\b¢\u0006\u0002\u00103\u001a!\u00104\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0086\n\u001aT\u00105\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u000526\u00106\u001a2\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(\r\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u000b07H\u0086\bø\u0001\u0000\u001a.\u0010:\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u0002H\u0004H\u0086\b¢\u0006\u0002\u0010\u001a\u001a7\u0010;\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00040<H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010=\u001a\u0019\u0010>\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0086\b\u001a\u0016\u0010?\u001a\u00020@\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005\u001a-\u0010A\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0005\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0086\u0002\u001a-\u0010B\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\u0004H\u0007¢\u0006\u0002\u0010'\u001a.\u0010C\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\u0004H\u0086\n¢\u0006\u0002\u0010\u0010\u001a\u001c\u0010D\u001a\b\u0012\u0004\u0012\u0002H\u00040E\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"(\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00058Æ\u0002¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006F"}, m90084d2 = {"DELETED", "", "size", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/collection/LongSparseArray;", "getSize$annotations", "(Landroidx/collection/LongSparseArray;)V", "getSize", "(Landroidx/collection/LongSparseArray;)I", "commonAppend", "", ExifInterface.LONGITUDE_EAST, "key", "", "value", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)V", "commonClear", "commonContainsKey", "", "commonContainsValue", "(Landroidx/collection/LongSparseArray;Ljava/lang/Object;)Z", "commonGc", "commonGet", "(Landroidx/collection/LongSparseArray;J)Ljava/lang/Object;", "defaultValue", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)Ljava/lang/Object;", "commonGetInternal", "commonIndexOfKey", "commonIndexOfValue", "(Landroidx/collection/LongSparseArray;Ljava/lang/Object;)I", "commonIsEmpty", "commonKeyAt", "index", "commonPut", "commonPutAll", "other", "commonPutIfAbsent", "commonRemove", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)Z", "commonRemoveAt", "commonReplace", "oldValue", "newValue", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;Ljava/lang/Object;)Z", "commonSetValueAt", "(Landroidx/collection/LongSparseArray;ILjava/lang/Object;)V", "commonSize", "commonToString", "", "commonValueAt", "(Landroidx/collection/LongSparseArray;I)Ljava/lang/Object;", "contains", "forEach", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "getOrDefault", "getOrElse", "Lkotlin/Function0;", "(Landroidx/collection/LongSparseArray;JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNotEmpty", "keyIterator", "Lkotlin/collections/LongIterator;", "plus", "remove", "set", "valueIterator", "", "collection"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLongSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n1#1,606:1\n256#1,6:607\n256#1,6:613\n328#1,18:619\n328#1,18:637\n328#1,18:655\n328#1,18:673\n328#1,18:691\n328#1,18:709\n328#1,18:727\n328#1,18:745\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n243#1:607,6\n248#1:613,6\n360#1:619,18\n410#1:637,18\n425#1:655,18\n437#1:673,18\n451#1:691,18\n459#1:709,18\n467#1:727,18\n505#1:745,18\n*E\n"})
public final class LongSparseArrayKt {

    @NotNull
    private static final Object DELETED = new Object();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.collection.LongSparseArrayKt$valueIterator$1 */
    /* JADX INFO: compiled from: LongSparseArray.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\u000e\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m90084d2 = {"androidx/collection/LongSparseArrayKt$valueIterator$1", "", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "()Ljava/lang/Object;", "collection"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C14661<T> implements Iterator<T>, KMappedMarker {
        final /* synthetic */ LongSparseArray<T> $this_valueIterator;
        private int index;

        public C14661(LongSparseArray<T> longSparseArray) {
            this.$this_valueIterator = longSparseArray;
        }

        public final int getIndex() {
            return this.index;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_valueIterator.size();
        }

        @Override // java.util.Iterator
        public T next() {
            LongSparseArray<T> longSparseArray = this.$this_valueIterator;
            int i11 = this.index;
            this.index = i11 + 1;
            return longSparseArray.valueAt(i11);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i11) {
            this.index = i11;
        }
    }

    @Nullable
    public static final <E> E commonGet(@NotNull LongSparseArray<E> longSparseArray, long j11) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j11);
        if (iBinarySearch < 0 || longSparseArray.values[iBinarySearch] == DELETED) {
            return null;
        }
        return (E) longSparseArray.values[iBinarySearch];
    }

    public static final <E> void commonRemove(@NotNull LongSparseArray<E> longSparseArray, long j11) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j11);
        if (iBinarySearch < 0 || longSparseArray.values[iBinarySearch] == DELETED) {
            return;
        }
        longSparseArray.values[iBinarySearch] = DELETED;
        longSparseArray.garbage = true;
    }

    @Nullable
    public static final <E> E commonReplace(@NotNull LongSparseArray<E> longSparseArray, long j11, E e11) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        int iIndexOfKey = longSparseArray.indexOfKey(j11);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = longSparseArray.values;
        E e12 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e11;
        return e12;
    }

    public static final <E> void commonAppend(@NotNull LongSparseArray<E> longSparseArray, long j11, E e11) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        int i11 = longSparseArray.size;
        if (i11 != 0 && j11 <= longSparseArray.keys[i11 - 1]) {
            longSparseArray.put(j11, e11);
            return;
        }
        if (longSparseArray.garbage) {
            long[] jArr = longSparseArray.keys;
            if (i11 >= jArr.length) {
                Object[] objArr = longSparseArray.values;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj = objArr[i13];
                    if (obj != DELETED) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                longSparseArray.garbage = false;
                longSparseArray.size = i12;
            }
        }
        int i14 = longSparseArray.size;
        if (i14 >= longSparseArray.keys.length) {
            int iIdealLongArraySize = ContainerHelpersKt.idealLongArraySize(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(longSparseArray.keys, iIdealLongArraySize);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            longSparseArray.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(longSparseArray.values, iIdealLongArraySize);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            longSparseArray.values = objArrCopyOf;
        }
        longSparseArray.keys[i14] = j11;
        longSparseArray.values[i14] = e11;
        longSparseArray.size = i14 + 1;
    }

    public static final <E> void commonClear(@NotNull LongSparseArray<E> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        int i11 = longSparseArray.size;
        Object[] objArr = longSparseArray.values;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        longSparseArray.size = 0;
        longSparseArray.garbage = false;
    }

    public static final <E> boolean commonContainsKey(@NotNull LongSparseArray<E> longSparseArray, long j11) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        return longSparseArray.indexOfKey(j11) >= 0;
    }

    public static final <E> boolean commonContainsValue(@NotNull LongSparseArray<E> longSparseArray, E e11) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        return longSparseArray.indexOfValue(e11) >= 0;
    }

    public static final <E> void commonGc(@NotNull LongSparseArray<E> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        int i11 = longSparseArray.size;
        long[] jArr = longSparseArray.keys;
        Object[] objArr = longSparseArray.values;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
            if (obj != DELETED) {
                if (i13 != i12) {
                    jArr[i12] = jArr[i13];
                    objArr[i12] = obj;
                    objArr[i13] = null;
                }
                i12++;
            }
        }
        longSparseArray.garbage = false;
        longSparseArray.size = i12;
    }

    public static final <T extends E, E> T commonGetInternal(@NotNull LongSparseArray<E> longSparseArray, long j11, T t11) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j11);
        return (iBinarySearch < 0 || longSparseArray.values[iBinarySearch] == DELETED) ? t11 : (T) longSparseArray.values[iBinarySearch];
    }

    public static final <E> int commonIndexOfKey(@NotNull LongSparseArray<E> longSparseArray, long j11) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i11 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != DELETED) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i12;
        }
        return ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j11);
    }

    public static final <E> int commonIndexOfValue(@NotNull LongSparseArray<E> longSparseArray, E e11) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i11 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != DELETED) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i12;
        }
        int i14 = longSparseArray.size;
        for (int i15 = 0; i15 < i14; i15++) {
            if (longSparseArray.values[i15] == e11) {
                return i15;
            }
        }
        return -1;
    }

    public static final <E> boolean commonIsEmpty(@NotNull LongSparseArray<E> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        return longSparseArray.size() == 0;
    }

    public static final <E> long commonKeyAt(@NotNull LongSparseArray<E> longSparseArray, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (i11 < 0 || i11 >= (i12 = longSparseArray.size)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i11).toString());
        }
        if (longSparseArray.garbage) {
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                Object obj = objArr[i14];
                if (obj != DELETED) {
                    if (i14 != i13) {
                        jArr[i13] = jArr[i14];
                        objArr[i13] = obj;
                        objArr[i14] = null;
                    }
                    i13++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i13;
        }
        return longSparseArray.keys[i11];
    }

    public static final <E> void commonPut(@NotNull LongSparseArray<E> longSparseArray, long j11, E e11) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j11);
        if (iBinarySearch >= 0) {
            longSparseArray.values[iBinarySearch] = e11;
            return;
        }
        int i11 = ~iBinarySearch;
        if (i11 < longSparseArray.size && longSparseArray.values[i11] == DELETED) {
            longSparseArray.keys[i11] = j11;
            longSparseArray.values[i11] = e11;
            return;
        }
        if (longSparseArray.garbage) {
            int i12 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            if (i12 >= jArr.length) {
                Object[] objArr = longSparseArray.values;
                int i13 = 0;
                for (int i14 = 0; i14 < i12; i14++) {
                    Object obj = objArr[i14];
                    if (obj != DELETED) {
                        if (i14 != i13) {
                            jArr[i13] = jArr[i14];
                            objArr[i13] = obj;
                            objArr[i14] = null;
                        }
                        i13++;
                    }
                }
                longSparseArray.garbage = false;
                longSparseArray.size = i13;
                i11 = ~ContainerHelpersKt.binarySearch(longSparseArray.keys, i13, j11);
            }
        }
        int i15 = longSparseArray.size;
        if (i15 >= longSparseArray.keys.length) {
            int iIdealLongArraySize = ContainerHelpersKt.idealLongArraySize(i15 + 1);
            long[] jArrCopyOf = Arrays.copyOf(longSparseArray.keys, iIdealLongArraySize);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            longSparseArray.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(longSparseArray.values, iIdealLongArraySize);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            longSparseArray.values = objArrCopyOf;
        }
        int i16 = longSparseArray.size;
        if (i16 - i11 != 0) {
            long[] jArr2 = longSparseArray.keys;
            int i17 = i11 + 1;
            ArraysKt.copyInto(jArr2, jArr2, i17, i11, i16);
            Object[] objArr2 = longSparseArray.values;
            ArraysKt.copyInto(objArr2, objArr2, i17, i11, longSparseArray.size);
        }
        longSparseArray.keys[i11] = j11;
        longSparseArray.values[i11] = e11;
        longSparseArray.size++;
    }

    public static final <E> void commonPutAll(@NotNull LongSparseArray<E> longSparseArray, @NotNull LongSparseArray<? extends E> other) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int size = other.size();
        for (int i11 = 0; i11 < size; i11++) {
            longSparseArray.put(other.keyAt(i11), other.valueAt(i11));
        }
    }

    @Nullable
    public static final <E> E commonPutIfAbsent(@NotNull LongSparseArray<E> longSparseArray, long j11, E e11) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        E e12 = longSparseArray.get(j11);
        if (e12 == null) {
            longSparseArray.put(j11, e11);
        }
        return e12;
    }

    public static final <E> void commonRemoveAt(@NotNull LongSparseArray<E> longSparseArray, int i11) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (longSparseArray.values[i11] != DELETED) {
            longSparseArray.values[i11] = DELETED;
            longSparseArray.garbage = true;
        }
    }

    public static final <E> void commonSetValueAt(@NotNull LongSparseArray<E> longSparseArray, int i11, E e11) {
        int i12;
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (i11 < 0 || i11 >= (i12 = longSparseArray.size)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i11).toString());
        }
        if (longSparseArray.garbage) {
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                Object obj = objArr[i14];
                if (obj != DELETED) {
                    if (i14 != i13) {
                        jArr[i13] = jArr[i14];
                        objArr[i13] = obj;
                        objArr[i14] = null;
                    }
                    i13++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i13;
        }
        longSparseArray.values[i11] = e11;
    }

    public static final <E> int commonSize(@NotNull LongSparseArray<E> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (longSparseArray.garbage) {
            int i11 = longSparseArray.size;
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != DELETED) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i12;
        }
        return longSparseArray.size;
    }

    @NotNull
    public static final <E> String commonToString(@NotNull LongSparseArray<E> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (longSparseArray.size() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(longSparseArray.size * 28);
        sb2.append('{');
        int i11 = longSparseArray.size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(longSparseArray.keyAt(i12));
            sb2.append('=');
            E eValueAt = longSparseArray.valueAt(i12);
            if (eValueAt != sb2) {
                sb2.append(eValueAt);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public static final <E> E commonValueAt(@NotNull LongSparseArray<E> longSparseArray, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        if (i11 < 0 || i11 >= (i12 = longSparseArray.size)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i11).toString());
        }
        if (longSparseArray.garbage) {
            long[] jArr = longSparseArray.keys;
            Object[] objArr = longSparseArray.values;
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                Object obj = objArr[i14];
                if (obj != DELETED) {
                    if (i14 != i13) {
                        jArr[i13] = jArr[i14];
                        objArr[i13] = obj;
                        objArr[i14] = null;
                    }
                    i13++;
                }
            }
            longSparseArray.garbage = false;
            longSparseArray.size = i13;
        }
        return (E) longSparseArray.values[i11];
    }

    public static final <T> boolean contains(@NotNull LongSparseArray<T> longSparseArray, long j11) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        return longSparseArray.containsKey(j11);
    }

    public static final <T> void forEach(@NotNull LongSparseArray<T> longSparseArray, @NotNull Function2<? super Long, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int size = longSparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            action.invoke(Long.valueOf(longSparseArray.keyAt(i11)), longSparseArray.valueAt(i11));
        }
    }

    public static final <T> T getOrDefault(@NotNull LongSparseArray<T> longSparseArray, long j11, T t11) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        return longSparseArray.get(j11, t11);
    }

    public static final <T> T getOrElse(@NotNull LongSparseArray<T> longSparseArray, long j11, @NotNull Function0<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t11 = longSparseArray.get(j11);
        return t11 == null ? defaultValue.invoke() : t11;
    }

    public static final <T> int getSize(@NotNull LongSparseArray<T> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        return longSparseArray.size();
    }

    public static final <T> boolean isNotEmpty(@NotNull LongSparseArray<T> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        return !longSparseArray.isEmpty();
    }

    @NotNull
    public static final <T> LongIterator keyIterator(@NotNull final LongSparseArray<T> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        return new LongIterator() { // from class: androidx.collection.LongSparseArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < longSparseArray.size();
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // p852kotlin.collections.LongIterator
            public long nextLong() {
                LongSparseArray<T> longSparseArray2 = longSparseArray;
                int i11 = this.index;
                this.index = i11 + 1;
                return longSparseArray2.keyAt(i11);
            }

            public final void setIndex(int i11) {
                this.index = i11;
            }
        };
    }

    @NotNull
    public static final <T> LongSparseArray<T> plus(@NotNull LongSparseArray<T> longSparseArray, @NotNull LongSparseArray<T> other) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        LongSparseArray<T> longSparseArray2 = new LongSparseArray<>(longSparseArray.size() + other.size());
        longSparseArray2.putAll(longSparseArray);
        longSparseArray2.putAll(other);
        return longSparseArray2;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced with member function. Remove extension import!")
    public static final /* synthetic */ boolean remove(LongSparseArray longSparseArray, long j11, Object obj) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        return longSparseArray.remove(j11, obj);
    }

    public static final <T> void set(@NotNull LongSparseArray<T> longSparseArray, long j11, T t11) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        longSparseArray.put(j11, t11);
    }

    @NotNull
    public static final <T> Iterator<T> valueIterator(@NotNull LongSparseArray<T> longSparseArray) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        return new C14661(longSparseArray);
    }

    public static final <E> E commonGet(@NotNull LongSparseArray<E> longSparseArray, long j11, E e11) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, j11);
        return (iBinarySearch < 0 || longSparseArray.values[iBinarySearch] == DELETED) ? e11 : (E) longSparseArray.values[iBinarySearch];
    }

    public static final <E> boolean commonReplace(@NotNull LongSparseArray<E> longSparseArray, long j11, E e11, E e12) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        int iIndexOfKey = longSparseArray.indexOfKey(j11);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(longSparseArray.values[iIndexOfKey], e11)) {
            return false;
        }
        longSparseArray.values[iIndexOfKey] = e12;
        return true;
    }

    public static final <E> boolean commonRemove(@NotNull LongSparseArray<E> longSparseArray, long j11, E e11) {
        Intrinsics.checkNotNullParameter(longSparseArray, "<this>");
        int iIndexOfKey = longSparseArray.indexOfKey(j11);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(e11, longSparseArray.valueAt(iIndexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(iIndexOfKey);
        return true;
    }

    public static /* synthetic */ void getSize$annotations(LongSparseArray longSparseArray) {
    }
}
