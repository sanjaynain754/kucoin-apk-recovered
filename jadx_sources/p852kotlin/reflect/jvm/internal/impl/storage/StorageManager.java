package p852kotlin.reflect.jvm.internal.impl.storage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: StorageManager.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface StorageManager {
    <T> T compute(@NotNull Function0<? extends T> function0);

    @NotNull
    <K, V> CacheWithNotNullValues<K, V> createCacheWithNotNullValues();

    @NotNull
    <K, V> CacheWithNullableValues<K, V> createCacheWithNullableValues();

    @NotNull
    <T> NotNullLazyValue<T> createLazyValue(@NotNull Function0<? extends T> function0);

    @NotNull
    <T> NotNullLazyValue<T> createLazyValueWithPostCompute(@NotNull Function0<? extends T> function0, @Nullable Function1<? super Boolean, ? extends T> function1, @NotNull Function1<? super T, Unit> function2);

    @NotNull
    <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(@NotNull Function1<? super K, ? extends V> function1);

    @NotNull
    <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(@NotNull Function1<? super K, ? extends V> function1);

    @NotNull
    <T> NullableLazyValue<T> createNullableLazyValue(@NotNull Function0<? extends T> function0);

    @NotNull
    <T> NotNullLazyValue<T> createRecursionTolerantLazyValue(@NotNull Function0<? extends T> function0, @NotNull T t11);
}
