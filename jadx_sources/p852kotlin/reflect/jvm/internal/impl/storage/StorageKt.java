package p852kotlin.reflect.jvm.internal.impl.storage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: compiled from: storage.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class StorageKt {
    @NotNull
    public static final <T> T getValue(@NotNull NotNullLazyValue<? extends T> notNullLazyValue, @Nullable Object obj, @NotNull KProperty<?> p11) {
        Intrinsics.checkNotNullParameter(notNullLazyValue, "<this>");
        Intrinsics.checkNotNullParameter(p11, "p");
        return notNullLazyValue.invoke();
    }

    @Nullable
    public static final <T> T getValue(@NotNull NullableLazyValue<? extends T> nullableLazyValue, @Nullable Object obj, @NotNull KProperty<?> p11) {
        Intrinsics.checkNotNullParameter(nullableLazyValue, "<this>");
        Intrinsics.checkNotNullParameter(p11, "p");
        return nullableLazyValue.invoke();
    }
}
