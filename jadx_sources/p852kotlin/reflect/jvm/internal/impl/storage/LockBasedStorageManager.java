package p852kotlin.reflect.jvm.internal.impl.storage;

import com.tencent.bugly.proguard.C33978va;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes61.dex */
public class LockBasedStorageManager implements StorageManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final String debugText;
    private final ExceptionHandlingStrategy exceptionHandlingStrategy;
    protected final SimpleLock lock;
    private static final String PACKAGE_NAME = StringsKt.substringBeforeLast(LockBasedStorageManager.class.getCanonicalName(), C33978va.f72339h, "");
    public static final StorageManager NO_LOCKS = new LockBasedStorageManager("NO_LOCKS", ExceptionHandlingStrategy.THROW, EmptySimpleLock.INSTANCE) { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.1
        private static /* synthetic */ void $$$reportNull$$$0(int i11) {
            String str = i11 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 1 ? 3 : 2];
            if (i11 != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i11 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i11 != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String str2 = String.format(str, objArr);
            if (i11 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager
        @NotNull
        public <K, V> RecursionDetectedResult<V> recursionDetectedDefault(@NotNull String str, K k11) {
            if (str == null) {
                $$$reportNull$$$0(0);
            }
            RecursionDetectedResult<V> recursionDetectedResultFallThrough = RecursionDetectedResult.fallThrough();
            if (recursionDetectedResultFallThrough == null) {
                $$$reportNull$$$0(1);
            }
            return recursionDetectedResultFallThrough;
        }
    };

    public static class CacheWithNotNullValuesBasedOnMemoizedFunction<K, V> extends CacheWithNullableValuesBasedOnMemoizedFunction<K, V> implements CacheWithNotNullValues<K, V> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        private static /* synthetic */ void $$$reportNull$$$0(int i11) {
            String str = i11 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 3 ? 3 : 2];
            if (i11 == 1) {
                objArr[0] = "map";
            } else if (i11 == 2) {
                objArr[0] = "computation";
            } else if (i11 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i11 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i11 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i11 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i11 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private CacheWithNotNullValuesBasedOnMemoizedFunction(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<KeyWithComputation<K, V>, Object> concurrentMap) {
            super(concurrentMap);
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (concurrentMap == null) {
                $$$reportNull$$$0(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.CacheWithNullableValuesBasedOnMemoizedFunction, p852kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues
        @NotNull
        public V computeIfAbsent(K k11, @NotNull Function0<? extends V> function0) {
            if (function0 == null) {
                $$$reportNull$$$0(2);
            }
            V v11 = (V) super.computeIfAbsent(k11, function0);
            if (v11 == null) {
                $$$reportNull$$$0(3);
            }
            return v11;
        }
    }

    public static class CacheWithNullableValuesBasedOnMemoizedFunction<K, V> extends MapBasedMemoizedFunction<KeyWithComputation<K, V>, V> implements CacheWithNullableValues<K, V> {
        private static /* synthetic */ void $$$reportNull$$$0(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "map";
            } else if (i11 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i11 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private CacheWithNullableValuesBasedOnMemoizedFunction(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<KeyWithComputation<K, V>, Object> concurrentMap) {
            super(lockBasedStorageManager, concurrentMap, new Function1<KeyWithComputation<K, V>, V>() { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.CacheWithNullableValuesBasedOnMemoizedFunction.1
                @Override // p852kotlin.jvm.functions.Function1
                public V invoke(KeyWithComputation<K, V> keyWithComputation) {
                    return (V) ((KeyWithComputation) keyWithComputation).computation.invoke();
                }
            });
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (concurrentMap == null) {
                $$$reportNull$$$0(1);
            }
        }

        @Nullable
        public V computeIfAbsent(K k11, @NotNull Function0<? extends V> function0) {
            if (function0 == null) {
                $$$reportNull$$$0(2);
            }
            return invoke(new KeyWithComputation(k11, function0));
        }
    }

    public interface ExceptionHandlingStrategy {
        public static final ExceptionHandlingStrategy THROW = new ExceptionHandlingStrategy() { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy.1
            private static /* synthetic */ void $$$reportNull$$$0(int i11) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.ExceptionHandlingStrategy
            @NotNull
            public RuntimeException handleException(@NotNull Throwable th2) {
                if (th2 == null) {
                    $$$reportNull$$$0(0);
                }
                throw ExceptionUtilsKt.rethrow(th2);
            }
        };

        @NotNull
        RuntimeException handleException(@NotNull Throwable th2);
    }

    public static class KeyWithComputation<K, V> {
        private final Function0<? extends V> computation;
        private final K key;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.key.equals(((KeyWithComputation) obj).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public KeyWithComputation(K k11, Function0<? extends V> function0) {
            this.key = k11;
            this.computation = function0;
        }
    }

    public static class LockBasedLazyValue<T> implements NullableLazyValue<T> {
        private final Function0<? extends T> computable;
        private final LockBasedStorageManager storageManager;

        @Nullable
        private volatile Object value;

        private static /* synthetic */ void $$$reportNull$$$0(int i11) {
            String str = (i11 == 2 || i11 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 2 || i11 == 3) ? 2 : 3];
            if (i11 == 1) {
                objArr[0] = "computable";
            } else if (i11 == 2 || i11 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i11 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i11 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i11 != 2 && i11 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i11 != 2 && i11 != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public LockBasedLazyValue(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (function0 == null) {
                $$$reportNull$$$0(1);
            }
            this.value = NotValue.NOT_COMPUTED;
            this.storageManager = lockBasedStorageManager;
            this.computable = function0;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003e A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:21:0x0042 A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x004d A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x0052 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        @Override // p852kotlin.jvm.functions.Function0
        public T invoke() {
            T tInvoke;
            RecursionDetectedResult<T> recursionDetectedResultRecursionDetected;
            Object obj = this.value;
            if (!(obj instanceof NotValue)) {
                return (T) WrappedValues.unescapeThrowable(obj);
            }
            this.storageManager.lock.lock();
            try {
                Object obj2 = this.value;
                if (obj2 instanceof NotValue) {
                    NotValue notValue = NotValue.COMPUTING;
                    if (obj2 == notValue) {
                        this.value = NotValue.RECURSION_WAS_DETECTED;
                        RecursionDetectedResult<T> recursionDetectedResultRecursionDetected2 = recursionDetected(true);
                        if (!recursionDetectedResultRecursionDetected2.isFallThrough()) {
                            tInvoke = recursionDetectedResultRecursionDetected2.getValue();
                        } else if (obj2 == NotValue.RECURSION_WAS_DETECTED) {
                            recursionDetectedResultRecursionDetected = recursionDetected(false);
                            if (recursionDetectedResultRecursionDetected.isFallThrough()) {
                                this.value = notValue;
                                try {
                                    tInvoke = this.computable.invoke();
                                    postCompute(tInvoke);
                                    this.value = tInvoke;
                                } catch (Throwable th2) {
                                    if (ExceptionUtilsKt.isProcessCanceledException(th2)) {
                                        this.value = NotValue.NOT_COMPUTED;
                                        throw th2;
                                    }
                                    if (this.value == NotValue.COMPUTING) {
                                        this.value = WrappedValues.escapeThrowable(th2);
                                    }
                                    throw this.storageManager.exceptionHandlingStrategy.handleException(th2);
                                }
                            } else {
                                tInvoke = recursionDetectedResultRecursionDetected.getValue();
                            }
                        } else {
                            this.value = notValue;
                            tInvoke = this.computable.invoke();
                            postCompute(tInvoke);
                            this.value = tInvoke;
                        }
                    } else if (obj2 == NotValue.RECURSION_WAS_DETECTED) {
                        recursionDetectedResultRecursionDetected = recursionDetected(false);
                        if (recursionDetectedResultRecursionDetected.isFallThrough()) {
                            tInvoke = recursionDetectedResultRecursionDetected.getValue();
                        } else {
                            this.value = notValue;
                            tInvoke = this.computable.invoke();
                            postCompute(tInvoke);
                            this.value = tInvoke;
                        }
                    } else {
                        this.value = notValue;
                        tInvoke = this.computable.invoke();
                        postCompute(tInvoke);
                        this.value = tInvoke;
                    }
                } else {
                    tInvoke = (T) WrappedValues.unescapeThrowable(obj2);
                }
                this.storageManager.lock.unlock();
                return tInvoke;
            } catch (Throwable th3) {
                this.storageManager.lock.unlock();
                throw th3;
            }
        }

        public boolean isComputed() {
            return (this.value == NotValue.NOT_COMPUTED || this.value == NotValue.COMPUTING) ? false : true;
        }

        @NotNull
        public RecursionDetectedResult<T> recursionDetected(boolean z11) {
            RecursionDetectedResult<T> recursionDetectedResultRecursionDetectedDefault = this.storageManager.recursionDetectedDefault("in a lazy value", null);
            if (recursionDetectedResultRecursionDetectedDefault == null) {
                $$$reportNull$$$0(2);
            }
            return recursionDetectedResultRecursionDetectedDefault;
        }

        public void postCompute(T t11) {
        }
    }

    public static abstract class LockBasedLazyValueWithPostCompute<T> extends LockBasedLazyValue<T> {

        @Nullable
        private volatile SingleThreadValue<T> valuePostCompute;

        private static /* synthetic */ void $$$reportNull$$$0(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public abstract void doPostCompute(T t11);

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LockBasedLazyValueWithPostCompute(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (function0 == null) {
                $$$reportNull$$$0(1);
            }
            this.valuePostCompute = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue, p852kotlin.jvm.functions.Function0
        public T invoke() {
            SingleThreadValue<T> singleThreadValue = this.valuePostCompute;
            return (singleThreadValue == null || !singleThreadValue.hasValue()) ? (T) super.invoke() : singleThreadValue.getValue();
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
        public final void postCompute(T t11) {
            this.valuePostCompute = new SingleThreadValue<>(t11);
            try {
                doPostCompute(t11);
            } finally {
                this.valuePostCompute = null;
            }
        }
    }

    public static class LockBasedNotNullLazyValue<T> extends LockBasedLazyValue<T> implements NotNullLazyValue<T> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        private static /* synthetic */ void $$$reportNull$$$0(int i11) {
            String str = i11 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 2 ? 3 : 2];
            if (i11 == 1) {
                objArr[0] = "computable";
            } else if (i11 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i11 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i11 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i11 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LockBasedNotNullLazyValue(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (function0 == null) {
                $$$reportNull$$$0(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue, p852kotlin.jvm.functions.Function0
        @NotNull
        public T invoke() {
            T t11 = (T) super.invoke();
            if (t11 == null) {
                $$$reportNull$$$0(2);
            }
            return t11;
        }
    }

    public static abstract class LockBasedNotNullLazyValueWithPostCompute<T> extends LockBasedLazyValueWithPostCompute<T> implements NotNullLazyValue<T> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        private static /* synthetic */ void $$$reportNull$$$0(int i11) {
            String str = i11 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 2 ? 3 : 2];
            if (i11 == 1) {
                objArr[0] = "computable";
            } else if (i11 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i11 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i11 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i11 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LockBasedNotNullLazyValueWithPostCompute(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull Function0<? extends T> function0) {
            super(lockBasedStorageManager, function0);
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (function0 == null) {
                $$$reportNull$$$0(1);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValueWithPostCompute, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue, p852kotlin.jvm.functions.Function0
        @NotNull
        public T invoke() {
            T t11 = (T) super.invoke();
            if (t11 == null) {
                $$$reportNull$$$0(2);
            }
            return t11;
        }
    }

    public static class MapBasedMemoizedFunction<K, V> implements MemoizedFunctionToNullable<K, V> {
        private final ConcurrentMap<K, Object> cache;
        private final Function1<? super K, ? extends V> compute;
        private final LockBasedStorageManager storageManager;

        private static /* synthetic */ void $$$reportNull$$$0(int i11) {
            String str = (i11 == 3 || i11 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 3 || i11 == 4) ? 2 : 3];
            if (i11 == 1) {
                objArr[0] = "map";
            } else if (i11 == 2) {
                objArr[0] = "compute";
            } else if (i11 == 3 || i11 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i11 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i11 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i11 != 3 && i11 != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i11 != 3 && i11 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public MapBasedMemoizedFunction(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<K, Object> concurrentMap, @NotNull Function1<? super K, ? extends V> function1) {
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (concurrentMap == null) {
                $$$reportNull$$$0(1);
            }
            if (function1 == null) {
                $$$reportNull$$$0(2);
            }
            this.storageManager = lockBasedStorageManager;
            this.cache = concurrentMap;
            this.compute = function1;
        }

        private AssertionError inconsistentComputingKey(K k11, Object obj) {
            return (AssertionError) LockBasedStorageManager.sanitizeStackTrace(new AssertionError("Inconsistent key detected. " + NotValue.COMPUTING + " is expected, was: " + obj + ", most probably race condition detected on input " + k11 + " under " + this.storageManager));
        }

        @NotNull
        private AssertionError raceCondition(K k11, Object obj) {
            AssertionError assertionError = (AssertionError) LockBasedStorageManager.sanitizeStackTrace(new AssertionError("Race condition detected on input " + k11 + ". Old value is " + obj + " under " + this.storageManager));
            if (assertionError == null) {
                $$$reportNull$$$0(4);
            }
            return assertionError;
        }

        private AssertionError unableToRemoveKey(K k11, Throwable th2) {
            return (AssertionError) LockBasedStorageManager.sanitizeStackTrace(new AssertionError("Unable to remove " + k11 + " under " + this.storageManager, th2));
        }

        public LockBasedStorageManager getStorageManager() {
            return this.storageManager;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x003e A[Catch: all -> 0x003b, PHI: r0
          0x003e: PHI (r0v8 java.lang.Object) = (r0v7 java.lang.Object), (r0v21 java.lang.Object) binds: [B:10:0x0020, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:47:0x009f, B:49:0x00ad, B:50:0x00b1, B:51:0x00b2, B:52:0x00bc, B:54:0x00c2, B:55:0x00cc, B:57:0x00ce, B:58:0x00d2, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:53:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:63:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:20:0x0042 A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:47:0x009f, B:49:0x00ad, B:50:0x00b1, B:51:0x00b2, B:52:0x00bc, B:54:0x00c2, B:55:0x00cc, B:57:0x00ce, B:58:0x00d2, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:53:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:63:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x004d A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:47:0x009f, B:49:0x00ad, B:50:0x00b1, B:51:0x00b2, B:52:0x00bc, B:54:0x00c2, B:55:0x00cc, B:57:0x00ce, B:58:0x00d2, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:53:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:63:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x0052 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:24:0x0054 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:47:0x009f, B:49:0x00ad, B:50:0x00b1, B:51:0x00b2, B:52:0x00bc, B:54:0x00c2, B:55:0x00cc, B:57:0x00ce, B:58:0x00d2, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:53:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:63:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x0059  */
        /* JADX WARN: Code duplicated, block: B:29:0x0071  */
        /* JADX WARN: Code duplicated, block: B:31:0x0079 A[Catch: all -> 0x007e, TRY_ENTER, TryCatch #3 {all -> 0x007e, blocks: (B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:66:0x005a, outer: #1 }] */
        @Override // p852kotlin.jvm.functions.Function1
        @Nullable
        public V invoke(K k11) {
            AssertionError assertionErrorRaceCondition;
            V vInvoke;
            Object objPut;
            V value;
            RecursionDetectedResult<V> recursionDetectedResultRecursionDetected;
            Object obj = this.cache.get(k11);
            if (obj != null && obj != NotValue.COMPUTING) {
                return (V) WrappedValues.unescapeExceptionOrNull(obj);
            }
            this.storageManager.lock.lock();
            try {
                Object obj2 = this.cache.get(k11);
                NotValue notValue = NotValue.COMPUTING;
                if (obj2 == notValue) {
                    obj2 = NotValue.RECURSION_WAS_DETECTED;
                    RecursionDetectedResult<V> recursionDetectedResultRecursionDetected2 = recursionDetected(k11, true);
                    if (!recursionDetectedResultRecursionDetected2.isFallThrough()) {
                        value = recursionDetectedResultRecursionDetected2.getValue();
                    } else if (obj2 == NotValue.RECURSION_WAS_DETECTED) {
                        recursionDetectedResultRecursionDetected = recursionDetected(k11, false);
                        if (!recursionDetectedResultRecursionDetected.isFallThrough()) {
                            value = recursionDetectedResultRecursionDetected.getValue();
                        } else {
                            if (obj2 != null) {
                                assertionErrorRaceCondition = null;
                                try {
                                    this.cache.put(k11, notValue);
                                    vInvoke = this.compute.invoke(k11);
                                    objPut = this.cache.put(k11, WrappedValues.escapeNull(vInvoke));
                                    if (objPut == notValue) {
                                        this.storageManager.lock.unlock();
                                        return vInvoke;
                                    }
                                    assertionErrorRaceCondition = raceCondition(k11, objPut);
                                    throw assertionErrorRaceCondition;
                                } catch (Throwable th2) {
                                    if (ExceptionUtilsKt.isProcessCanceledException(th2)) {
                                        try {
                                            Object objRemove = this.cache.remove(k11);
                                            if (objRemove != NotValue.COMPUTING) {
                                                throw inconsistentComputingKey(k11, objRemove);
                                            }
                                            throw th2;
                                        } catch (Throwable th3) {
                                            throw unableToRemoveKey(k11, th3);
                                        }
                                    }
                                    if (th2 != assertionErrorRaceCondition) {
                                        Object objPut2 = this.cache.put(k11, WrappedValues.escapeThrowable(th2));
                                        if (objPut2 != NotValue.COMPUTING) {
                                            throw raceCondition(k11, objPut2);
                                        }
                                        throw this.storageManager.exceptionHandlingStrategy.handleException(th2);
                                    }
                                    try {
                                        this.cache.remove(k11);
                                        throw this.storageManager.exceptionHandlingStrategy.handleException(th2);
                                    } catch (Throwable th4) {
                                        throw unableToRemoveKey(k11, th4);
                                    }
                                }
                                this.storageManager.lock.unlock();
                                throw th;
                            }
                            value = (V) WrappedValues.unescapeExceptionOrNull(obj2);
                        }
                    } else {
                        if (obj2 != null) {
                            assertionErrorRaceCondition = null;
                            this.cache.put(k11, notValue);
                            vInvoke = this.compute.invoke(k11);
                            objPut = this.cache.put(k11, WrappedValues.escapeNull(vInvoke));
                            if (objPut == notValue) {
                                this.storageManager.lock.unlock();
                                return vInvoke;
                            }
                            assertionErrorRaceCondition = raceCondition(k11, objPut);
                            throw assertionErrorRaceCondition;
                            this.storageManager.lock.unlock();
                            throw th;
                        }
                        value = (V) WrappedValues.unescapeExceptionOrNull(obj2);
                    }
                } else if (obj2 == NotValue.RECURSION_WAS_DETECTED) {
                    recursionDetectedResultRecursionDetected = recursionDetected(k11, false);
                    if (!recursionDetectedResultRecursionDetected.isFallThrough()) {
                        value = recursionDetectedResultRecursionDetected.getValue();
                    } else {
                        if (obj2 != null) {
                            assertionErrorRaceCondition = null;
                            this.cache.put(k11, notValue);
                            vInvoke = this.compute.invoke(k11);
                            objPut = this.cache.put(k11, WrappedValues.escapeNull(vInvoke));
                            if (objPut == notValue) {
                                this.storageManager.lock.unlock();
                                return vInvoke;
                            }
                            assertionErrorRaceCondition = raceCondition(k11, objPut);
                            throw assertionErrorRaceCondition;
                            this.storageManager.lock.unlock();
                            throw th;
                        }
                        value = (V) WrappedValues.unescapeExceptionOrNull(obj2);
                    }
                } else {
                    if (obj2 != null) {
                        assertionErrorRaceCondition = null;
                        this.cache.put(k11, notValue);
                        vInvoke = this.compute.invoke(k11);
                        objPut = this.cache.put(k11, WrappedValues.escapeNull(vInvoke));
                        if (objPut == notValue) {
                            this.storageManager.lock.unlock();
                            return vInvoke;
                        }
                        assertionErrorRaceCondition = raceCondition(k11, objPut);
                        throw assertionErrorRaceCondition;
                        this.storageManager.lock.unlock();
                        throw th;
                    }
                    value = (V) WrappedValues.unescapeExceptionOrNull(obj2);
                }
                this.storageManager.lock.unlock();
                return value;
            } catch (Throwable th5) {
                this.storageManager.lock.unlock();
                throw th5;
            }
        }

        @Override // p852kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable
        public boolean isComputed(K k11) {
            Object obj = this.cache.get(k11);
            return (obj == null || obj == NotValue.COMPUTING) ? false : true;
        }

        @NotNull
        public RecursionDetectedResult<V> recursionDetected(K k11, boolean z11) {
            RecursionDetectedResult<V> recursionDetectedResultRecursionDetectedDefault = this.storageManager.recursionDetectedDefault("", k11);
            if (recursionDetectedResultRecursionDetectedDefault == null) {
                $$$reportNull$$$0(3);
            }
            return recursionDetectedResultRecursionDetectedDefault;
        }
    }

    public static class MapBasedMemoizedFunctionToNotNull<K, V> extends MapBasedMemoizedFunction<K, V> implements MemoizedFunctionToNotNull<K, V> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        private static /* synthetic */ void $$$reportNull$$$0(int i11) {
            String str = i11 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 3 ? 3 : 2];
            if (i11 == 1) {
                objArr[0] = "map";
            } else if (i11 == 2) {
                objArr[0] = "compute";
            } else if (i11 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i11 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i11 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i11 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MapBasedMemoizedFunctionToNotNull(@NotNull LockBasedStorageManager lockBasedStorageManager, @NotNull ConcurrentMap<K, Object> concurrentMap, @NotNull Function1<? super K, ? extends V> function1) {
            super(lockBasedStorageManager, concurrentMap, function1);
            if (lockBasedStorageManager == null) {
                $$$reportNull$$$0(0);
            }
            if (concurrentMap == null) {
                $$$reportNull$$$0(1);
            }
            if (function1 == null) {
                $$$reportNull$$$0(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.MapBasedMemoizedFunction, p852kotlin.jvm.functions.Function1
        @NotNull
        public V invoke(K k11) {
            V v11 = (V) super.invoke(k11);
            if (v11 == null) {
                $$$reportNull$$$0(3);
            }
            return v11;
        }
    }

    public enum NotValue {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    public static class RecursionDetectedResult<T> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final boolean fallThrough;
        private final T value;

        @NotNull
        public static <T> RecursionDetectedResult<T> fallThrough() {
            return new RecursionDetectedResult<>(null, true);
        }

        @NotNull
        public static <T> RecursionDetectedResult<T> value(T t11) {
            return new RecursionDetectedResult<>(t11, false);
        }

        public T getValue() {
            return this.value;
        }

        public boolean isFallThrough() {
            return this.fallThrough;
        }

        private RecursionDetectedResult(T t11, boolean z11) {
            this.value = t11;
            this.fallThrough = z11;
        }

        public String toString() {
            if (isFallThrough()) {
                return "FALL_THROUGH";
            }
            return String.valueOf(this.value);
        }
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(@NotNull Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            $$$reportNull$$$0(9);
        }
        MemoizedFunctionToNotNull<K, V> memoizedFunctionToNotNullCreateMemoizedFunction = createMemoizedFunction(function1, createConcurrentHashMap());
        if (memoizedFunctionToNotNullCreateMemoizedFunction == null) {
            $$$reportNull$$$0(10);
        }
        return memoizedFunctionToNotNullCreateMemoizedFunction;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(@NotNull Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            $$$reportNull$$$0(19);
        }
        MemoizedFunctionToNullable<K, V> memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues = createMemoizedFunctionWithNullableValues(function1, createConcurrentHashMap());
        if (memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues == null) {
            $$$reportNull$$$0(20);
        }
        return memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    private static /* synthetic */ void $$$reportNull$$$0(int i11) {
        String str = (i11 == 10 || i11 == 13 || i11 == 20 || i11 == 37) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 10 || i11 == 13 || i11 == 20 || i11 == 37) ? 2 : 3];
        if (i11 == 1 || i11 == 3 || i11 == 5) {
            objArr[0] = "exceptionHandlingStrategy";
        } else if (i11 != 6) {
            switch (i11) {
                case 8:
                    objArr[0] = "exceptionHandlingStrategy";
                    break;
                case 9:
                case 11:
                case 14:
                case 16:
                case 19:
                case 21:
                    objArr[0] = "compute";
                    break;
                case 10:
                case 13:
                case 20:
                case 37:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                    break;
                case 12:
                case 17:
                case 25:
                case 27:
                    objArr[0] = "onRecursiveCall";
                    break;
                case 15:
                case 18:
                case 22:
                    objArr[0] = "map";
                    break;
                case 23:
                case 24:
                case 26:
                case 28:
                case 30:
                case 31:
                case 32:
                case 34:
                    objArr[0] = "computable";
                    break;
                case 29:
                case 33:
                    objArr[0] = "postCompute";
                    break;
                case 35:
                    objArr[0] = "source";
                    break;
                case 36:
                    objArr[0] = "throwable";
                    break;
                default:
                    objArr[0] = "debugText";
                    break;
            }
        } else {
            objArr[0] = "lock";
        }
        if (i11 == 10 || i11 == 13) {
            objArr[1] = "createMemoizedFunction";
        } else if (i11 == 20) {
            objArr[1] = "createMemoizedFunctionWithNullableValues";
        } else if (i11 != 37) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
        } else {
            objArr[1] = "sanitizeStackTrace";
        }
        switch (i11) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "<init>";
                break;
            case 7:
            case 8:
                objArr[2] = "replaceExceptionHandling";
                break;
            case 9:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createMemoizedFunction";
                break;
            case 10:
            case 13:
            case 20:
            case 37:
                break;
            case 19:
            case 21:
            case 22:
                objArr[2] = "createMemoizedFunctionWithNullableValues";
                break;
            case 23:
            case 24:
            case 25:
                objArr[2] = "createLazyValue";
                break;
            case 26:
            case 27:
                objArr[2] = "createRecursionTolerantLazyValue";
                break;
            case 28:
            case 29:
                objArr[2] = "createLazyValueWithPostCompute";
                break;
            case 30:
                objArr[2] = "createNullableLazyValue";
                break;
            case 31:
                objArr[2] = "createRecursionTolerantNullableLazyValue";
                break;
            case 32:
            case 33:
                objArr[2] = "createNullableLazyValueWithPostCompute";
                break;
            case 34:
                objArr[2] = "compute";
                break;
            case 35:
                objArr[2] = "recursionDetectedDefault";
                break;
            case 36:
                objArr[2] = "sanitizeStackTrace";
                break;
            default:
                objArr[2] = "createWithExceptionHandling";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i11 != 10 && i11 != 13 && i11 != 20 && i11 != 37) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    private LockBasedStorageManager(@NotNull String str, @NotNull ExceptionHandlingStrategy exceptionHandlingStrategy, @NotNull SimpleLock simpleLock) {
        if (str == null) {
            $$$reportNull$$$0(4);
        }
        if (exceptionHandlingStrategy == null) {
            $$$reportNull$$$0(5);
        }
        if (simpleLock == null) {
            $$$reportNull$$$0(6);
        }
        this.lock = simpleLock;
        this.exceptionHandlingStrategy = exceptionHandlingStrategy;
        this.debugText = str;
    }

    @NotNull
    private static <K> ConcurrentMap<K, Object> createConcurrentHashMap() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NotNull
    public static <T extends Throwable> T sanitizeStackTrace(@NotNull T t11) {
        if (t11 == null) {
            $$$reportNull$$$0(36);
        }
        StackTraceElement[] stackTrace = t11.getStackTrace();
        int length = stackTrace.length;
        int i11 = 0;
        while (i11 < length) {
            if (!stackTrace[i11].getClassName().startsWith(PACKAGE_NAME)) {
                List listSubList = Arrays.asList(stackTrace).subList(i11, length);
                t11.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
                return t11;
            }
            i11++;
        }
        i11 = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i11, length);
        t11.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
        return t11;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.storage.StorageManager
    public <T> T compute(@NotNull Function0<? extends T> function0) {
        if (function0 == null) {
            $$$reportNull$$$0(34);
        }
        this.lock.lock();
        try {
            T tInvoke = function0.invoke();
            this.lock.unlock();
            return tInvoke;
        } catch (Throwable th2) {
            try {
                throw this.exceptionHandlingStrategy.handleException(th2);
            } catch (Throwable th3) {
                this.lock.unlock();
                throw th3;
            }
        }
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> CacheWithNotNullValues<K, V> createCacheWithNotNullValues() {
        return new CacheWithNotNullValuesBasedOnMemoizedFunction(createConcurrentHashMap());
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <K, V> CacheWithNullableValues<K, V> createCacheWithNullableValues() {
        return new CacheWithNullableValuesBasedOnMemoizedFunction(createConcurrentHashMap());
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NotNullLazyValue<T> createLazyValue(@NotNull Function0<? extends T> function0) {
        if (function0 == null) {
            $$$reportNull$$$0(23);
        }
        return new LockBasedNotNullLazyValue(this, function0);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NotNullLazyValue<T> createLazyValueWithPostCompute(@NotNull Function0<? extends T> function0, final Function1<? super Boolean, ? extends T> function1, @NotNull final Function1<? super T, Unit> function2) {
        if (function0 == null) {
            $$$reportNull$$$0(28);
        }
        if (function2 == null) {
            $$$reportNull$$$0(29);
        }
        return new LockBasedNotNullLazyValueWithPostCompute<T>(this, function0) { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.5
            private static /* synthetic */ void $$$reportNull$$$0(int i11) {
                String str = i11 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                Object[] objArr = new Object[i11 != 2 ? 2 : 3];
                if (i11 != 2) {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
                } else {
                    objArr[0] = "value";
                }
                if (i11 != 2) {
                    objArr[1] = "recursionDetected";
                } else {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
                }
                if (i11 == 2) {
                    objArr[2] = "doPostCompute";
                }
                String str2 = String.format(str, objArr);
                if (i11 == 2) {
                    throw new IllegalArgumentException(str2);
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValueWithPostCompute
            public void doPostCompute(@NotNull T t11) {
                if (t11 == null) {
                    $$$reportNull$$$0(2);
                }
                function2.invoke(t11);
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
            @NotNull
            public RecursionDetectedResult<T> recursionDetected(boolean z11) {
                Function1 function3 = function1;
                if (function3 == null) {
                    RecursionDetectedResult<T> recursionDetectedResultRecursionDetected = super.recursionDetected(z11);
                    if (recursionDetectedResultRecursionDetected == null) {
                        $$$reportNull$$$0(0);
                    }
                    return recursionDetectedResultRecursionDetected;
                }
                RecursionDetectedResult<T> recursionDetectedResultValue = RecursionDetectedResult.value(function3.invoke(Boolean.valueOf(z11)));
                if (recursionDetectedResultValue == null) {
                    $$$reportNull$$$0(1);
                }
                return recursionDetectedResultValue;
            }
        };
    }

    @NotNull
    public <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(@NotNull Function1<? super K, ? extends V> function1, @NotNull ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            $$$reportNull$$$0(14);
        }
        if (concurrentMap == null) {
            $$$reportNull$$$0(15);
        }
        return new MapBasedMemoizedFunctionToNotNull(this, concurrentMap, function1);
    }

    @NotNull
    public <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(@NotNull Function1<? super K, ? extends V> function1, @NotNull ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            $$$reportNull$$$0(21);
        }
        if (concurrentMap == null) {
            $$$reportNull$$$0(22);
        }
        return new MapBasedMemoizedFunction(this, concurrentMap, function1);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NullableLazyValue<T> createNullableLazyValue(@NotNull Function0<? extends T> function0) {
        if (function0 == null) {
            $$$reportNull$$$0(30);
        }
        return new LockBasedLazyValue(this, function0);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.storage.StorageManager
    @NotNull
    public <T> NotNullLazyValue<T> createRecursionTolerantLazyValue(@NotNull Function0<? extends T> function0, @NotNull final T t11) {
        if (function0 == null) {
            $$$reportNull$$$0(26);
        }
        if (t11 == null) {
            $$$reportNull$$$0(27);
        }
        return new LockBasedNotNullLazyValue<T>(this, function0) { // from class: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.4
            private static /* synthetic */ void $$$reportNull$$$0(int i11) {
                throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
            @NotNull
            public RecursionDetectedResult<T> recursionDetected(boolean z11) {
                RecursionDetectedResult<T> recursionDetectedResultValue = RecursionDetectedResult.value(t11);
                if (recursionDetectedResultValue == null) {
                    $$$reportNull$$$0(0);
                }
                return recursionDetectedResultValue;
            }
        };
    }

    @NotNull
    public <K, V> RecursionDetectedResult<V> recursionDetectedDefault(@NotNull String str, K k11) {
        String str2;
        if (str == null) {
            $$$reportNull$$$0(35);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Recursion detected ");
        sb2.append(str);
        if (k11 == null) {
            str2 = "";
        } else {
            str2 = "on input: " + k11;
        }
        sb2.append(str2);
        sb2.append(" under ");
        sb2.append(this);
        throw ((AssertionError) sanitizeStackTrace(new AssertionError(sb2.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.debugText + ")";
    }

    public LockBasedStorageManager(String str) {
        this(str, (Runnable) null, (Function1<InterruptedException, Unit>) null);
    }

    public LockBasedStorageManager(String str, @Nullable Runnable runnable, @Nullable Function1<InterruptedException, Unit> function1) {
        this(str, ExceptionHandlingStrategy.THROW, SimpleLock.Companion.simpleLock(runnable, function1));
    }
}
