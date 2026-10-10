package p852kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: ArrayMap.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class EmptyArrayMap extends ArrayMap {

    @NotNull
    public static final EmptyArrayMap INSTANCE = new EmptyArrayMap();

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.EmptyArrayMap$iterator$1 */
    /* JADX INFO: compiled from: ArrayMap.kt */
    public static final class C414491 implements Iterator, KMappedMarker {
        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Void next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private EmptyArrayMap() {
        super(null);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.util.ArrayMap
    @Nullable
    public Void get(int i11) {
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int getSize() {
        return 0;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    @NotNull
    public Iterator iterator() {
        return new C414491();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void set(int i11, @NotNull Void value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new IllegalStateException();
    }
}
