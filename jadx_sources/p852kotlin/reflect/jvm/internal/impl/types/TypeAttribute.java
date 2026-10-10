package p852kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.jvm.internal.impl.types.TypeAttribute;

/* JADX INFO: compiled from: TypeAttributes.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class TypeAttribute<T extends TypeAttribute<? extends T>> {
    @NotNull
    public abstract T add(@Nullable T t11);

    @NotNull
    public abstract KClass<? extends T> getKey();

    @Nullable
    public abstract T intersect(@Nullable T t11);
}
