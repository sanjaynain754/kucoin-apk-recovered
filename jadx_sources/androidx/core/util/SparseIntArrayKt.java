package androidx.core.util;

import android.util.SparseIntArray;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SparseIntArray.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0001H\u0086\b\u001aE\u0010\u000b\u001a\u00020\f*\u00020\u000226\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\f0\u000eH\u0086\b\u001a\u001d\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0086\b\u001a#\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0086\b\u001a\r\u0010\u0015\u001a\u00020\u0006*\u00020\u0002H\u0086\b\u001a\r\u0010\u0016\u001a\u00020\u0006*\u00020\u0002H\u0086\b\u001a\n\u0010\u0017\u001a\u00020\u0018*\u00020\u0002\u001a\u0015\u0010\u0019\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0086\u0002\u001a\u0012\u0010\u001b\u001a\u00020\f*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u001a\u0010\u001c\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001\u001a\u001d\u0010\u001d\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0086\n\u001a\n\u0010\u001e\u001a\u00020\u0018*\u00020\u0002\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u001f"}, m90084d2 = {"size", "", "Landroid/util/SparseIntArray;", "getSize", "(Landroid/util/SparseIntArray;)I", "contains", "", "key", "containsKey", "containsValue", "value", "forEach", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "getOrDefault", "defaultValue", "getOrElse", "Lkotlin/Function0;", "isEmpty", "isNotEmpty", "keyIterator", "Lkotlin/collections/IntIterator;", "plus", "other", "putAll", "remove", "set", "valueIterator", "core-ktx_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSparseIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n76#1,4:102\n1#2:101\n*S KotlinDebug\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n*L\n72#1:102,4\n*E\n"})
public final class SparseIntArrayKt {
    @NotNull
    public static final IntIterator keyIterator(@NotNull final SparseIntArray sparseIntArray) {
        return new IntIterator() { // from class: androidx.core.util.SparseIntArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseIntArray.size();
            }

            @Override // p852kotlin.collections.IntIterator
            public int nextInt() {
                SparseIntArray sparseIntArray2 = sparseIntArray;
                int i11 = this.index;
                this.index = i11 + 1;
                return sparseIntArray2.keyAt(i11);
            }

            public final void setIndex(int i11) {
                this.index = i11;
            }
        };
    }

    @NotNull
    public static final SparseIntArray plus(@NotNull SparseIntArray sparseIntArray, @NotNull SparseIntArray sparseIntArray2) {
        SparseIntArray sparseIntArray3 = new SparseIntArray(sparseIntArray.size() + sparseIntArray2.size());
        putAll(sparseIntArray3, sparseIntArray);
        putAll(sparseIntArray3, sparseIntArray2);
        return sparseIntArray3;
    }

    @NotNull
    public static final IntIterator valueIterator(@NotNull final SparseIntArray sparseIntArray) {
        return new IntIterator() { // from class: androidx.core.util.SparseIntArrayKt.valueIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseIntArray.size();
            }

            @Override // p852kotlin.collections.IntIterator
            public int nextInt() {
                SparseIntArray sparseIntArray2 = sparseIntArray;
                int i11 = this.index;
                this.index = i11 + 1;
                return sparseIntArray2.valueAt(i11);
            }

            public final void setIndex(int i11) {
                this.index = i11;
            }
        };
    }

    public static final boolean contains(@NotNull SparseIntArray sparseIntArray, int i11) {
        if (sparseIntArray.indexOfKey(i11) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean containsKey(@NotNull SparseIntArray sparseIntArray, int i11) {
        if (sparseIntArray.indexOfKey(i11) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean containsValue(@NotNull SparseIntArray sparseIntArray, int i11) {
        if (sparseIntArray.indexOfValue(i11) >= 0) {
            return true;
        }
        return false;
    }

    public static final void forEach(@NotNull SparseIntArray sparseIntArray, @NotNull Function2<? super Integer, ? super Integer, Unit> function2) {
        int size = sparseIntArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            function2.invoke(Integer.valueOf(sparseIntArray.keyAt(i11)), Integer.valueOf(sparseIntArray.valueAt(i11)));
        }
    }

    public static final int getOrDefault(@NotNull SparseIntArray sparseIntArray, int i11, int i12) {
        return sparseIntArray.get(i11, i12);
    }

    public static final int getOrElse(@NotNull SparseIntArray sparseIntArray, int i11, @NotNull Function0<Integer> function0) {
        int iIndexOfKey = sparseIntArray.indexOfKey(i11);
        if (iIndexOfKey >= 0) {
            return sparseIntArray.valueAt(iIndexOfKey);
        }
        return function0.invoke().intValue();
    }

    public static final int getSize(@NotNull SparseIntArray sparseIntArray) {
        return sparseIntArray.size();
    }

    public static final boolean isEmpty(@NotNull SparseIntArray sparseIntArray) {
        if (sparseIntArray.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean isNotEmpty(@NotNull SparseIntArray sparseIntArray) {
        if (sparseIntArray.size() != 0) {
            return true;
        }
        return false;
    }

    public static final void putAll(@NotNull SparseIntArray sparseIntArray, @NotNull SparseIntArray sparseIntArray2) {
        int size = sparseIntArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i11), sparseIntArray2.valueAt(i11));
        }
    }

    public static final boolean remove(@NotNull SparseIntArray sparseIntArray, int i11, int i12) {
        int iIndexOfKey = sparseIntArray.indexOfKey(i11);
        if (iIndexOfKey >= 0 && i12 == sparseIntArray.valueAt(iIndexOfKey)) {
            sparseIntArray.removeAt(iIndexOfKey);
            return true;
        }
        return false;
    }

    public static final void set(@NotNull SparseIntArray sparseIntArray, int i11, int i12) {
        sparseIntArray.put(i11, i12);
    }
}
