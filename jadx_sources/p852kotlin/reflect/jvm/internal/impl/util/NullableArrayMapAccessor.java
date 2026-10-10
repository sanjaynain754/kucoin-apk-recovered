package p852kotlin.reflect.jvm.internal.impl.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.properties.ReadOnlyProperty;
import p852kotlin.reflect.KProperty;

/* JADX INFO: compiled from: ArrayMapOwner.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class NullableArrayMapAccessor<K, V, T extends V> extends AbstractArrayMapOwner.AbstractArrayMapAccessor<K, V, T> implements ReadOnlyProperty<AbstractArrayMapOwner<K, V>, V> {
    @Override // p852kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue((AbstractArrayMapOwner) obj, (KProperty<?>) kProperty);
    }

    @Nullable
    public T getValue(@NotNull AbstractArrayMapOwner<K, V> thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return extractValue(thisRef);
    }

    public NullableArrayMapAccessor(int i11) {
        super(i11);
    }
}
