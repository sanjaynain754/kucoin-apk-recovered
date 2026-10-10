package p852kotlin.reflect.jvm.internal.impl.types.checker;

import org.jetbrains.annotations.NotNull;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* JADX INFO: loaded from: classes61.dex */
public interface TypeCheckingProcedureCallbacks {
    boolean assertEqualTypeConstructors(@NotNull TypeConstructor typeConstructor, @NotNull TypeConstructor typeConstructor2);
}
