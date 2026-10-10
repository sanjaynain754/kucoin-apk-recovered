package p852kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import p852kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import p852kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;

/* JADX INFO: compiled from: JavaNullabilityAnnotationSettings.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class NullabilityAnnotationStatesImpl<T> implements NullabilityAnnotationStates<T> {

    @NotNull
    private final MemoizedFunctionToNullable<FqName, T> cache;

    @NotNull
    private final Map<FqName, T> states;

    @NotNull
    private final LockBasedStorageManager storageManager;

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStates
    @Nullable
    public T get(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return this.cache.invoke(fqName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NullabilityAnnotationStatesImpl(@NotNull Map<FqName, ? extends T> states) {
        Intrinsics.checkNotNullParameter(states, "states");
        this.states = states;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Java nullability annotation states");
        this.storageManager = lockBasedStorageManager;
        MemoizedFunctionToNullable<FqName, T> memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues = lockBasedStorageManager.createMemoizedFunctionWithNullableValues(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStatesImpl$$Lambda$0
            private final NullabilityAnnotationStatesImpl arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return NullabilityAnnotationStatesImpl.cache$lambda$0(this.arg$0, (FqName) obj);
            }

            {
                this.arg$0 = this;
            }
        });
        Intrinsics.checkNotNullExpressionValue(memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues, "createMemoizedFunctionWithNullableValues(...)");
        this.cache = memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object cache$lambda$0(NullabilityAnnotationStatesImpl nullabilityAnnotationStatesImpl, FqName fqName) {
        Intrinsics.checkNotNull(fqName);
        return FqNamesUtilKt.findValueForMostSpecificFqname(fqName, nullabilityAnnotationStatesImpl.states);
    }
}
