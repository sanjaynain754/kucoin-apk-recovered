package p852kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: ArrayMap.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class ArrayMap<T> implements Iterable<T>, KMappedMarker {
    public /* synthetic */ ArrayMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public abstract T get(int i11);

    public abstract int getSize();

    public abstract void set(int i11, @NotNull T t11);

    private ArrayMap() {
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
