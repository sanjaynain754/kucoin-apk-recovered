package p852kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.markers.KMappedMarker;
import p852kotlin.reflect.KClass;

/* JADX INFO: compiled from: ArrayMapOwner.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractArrayMapOwner<K, V> implements Iterable<V>, KMappedMarker {
    @NotNull
    public abstract ArrayMap<V> getArrayMap();

    @NotNull
    public abstract TypeRegistry<K, V> getTypeRegistry();

    public abstract void registerComponent(@NotNull String str, @NotNull V v11);

    public final void registerComponent(@NotNull KClass<? extends K> tClass, @NotNull V value) {
        Intrinsics.checkNotNullParameter(tClass, "tClass");
        Intrinsics.checkNotNullParameter(value, "value");
        String qualifiedName = tClass.getQualifiedName();
        Intrinsics.checkNotNull(qualifiedName);
        registerComponent(qualifiedName, value);
    }

    /* JADX INFO: compiled from: ArrayMapOwner.kt */
    public static abstract class AbstractArrayMapAccessor<K, V, T extends V> {

        /* JADX INFO: renamed from: id */
        private final int f91385id;

        public AbstractArrayMapAccessor(int i11) {
            this.f91385id = i11;
        }

        @Nullable
        public final T extractValue(@NotNull AbstractArrayMapOwner<K, V> thisRef) {
            Intrinsics.checkNotNullParameter(thisRef, "thisRef");
            return thisRef.getArrayMap().get(this.f91385id);
        }
    }

    public final boolean isEmpty() {
        if (getArrayMap().getSize() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<V> iterator() {
        return getArrayMap().iterator();
    }
}
