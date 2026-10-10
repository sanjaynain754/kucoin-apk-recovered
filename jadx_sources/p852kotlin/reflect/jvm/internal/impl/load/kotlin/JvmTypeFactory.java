package p852kotlin.reflect.jvm.internal.impl.load.kotlin;

import org.jetbrains.annotations.NotNull;
import p852kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

/* JADX INFO: compiled from: typeSignatureMapping.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface JvmTypeFactory<T> {
    @NotNull
    T boxType(@NotNull T t11);

    @NotNull
    T createFromString(@NotNull String str);

    @NotNull
    T createObjectType(@NotNull String str);

    @NotNull
    T createPrimitiveType(@NotNull PrimitiveType primitiveType);

    @NotNull
    T getJavaLangClassType();

    @NotNull
    String toString(@NotNull T t11);
}
