package p852kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: ArrayMap.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class OneElementArrayMap<T> extends ArrayMap<T> {
    private final int index;

    @NotNull
    private final T value;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.OneElementArrayMap$iterator$1 */
    /* JADX INFO: compiled from: ArrayMap.kt */
    public static final class C414501 implements Iterator<T>, KMappedMarker {
        private boolean notVisited = true;
        final /* synthetic */ OneElementArrayMap<T> this$0;

        public C414501(OneElementArrayMap<T> oneElementArrayMap) {
            this.this$0 = oneElementArrayMap;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.notVisited;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.notVisited) {
                throw new NoSuchElementException();
            }
            this.notVisited = false;
            return this.this$0.getValue();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int getSize() {
        return 1;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.util.ArrayMap
    @Nullable
    public T get(int i11) {
        if (i11 == this.index) {
            return this.value;
        }
        return null;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final T getValue() {
        return this.value;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new C414501(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneElementArrayMap(@NotNull T value, int i11) {
        super(null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        this.index = i11;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void set(int i11, @NotNull T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new IllegalStateException();
    }
}
