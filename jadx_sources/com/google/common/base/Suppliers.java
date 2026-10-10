package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Suppliers {

    /* JADX INFO: loaded from: classes56.dex */
    @VisibleForTesting
    public static class ExpiringMemoizingSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Supplier<T> delegate;
        final long durationNanos;
        volatile transient long expirationNanos;
        private transient Object lock = new Object();
        volatile transient T value;

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            long j11 = this.expirationNanos;
            long jNanoTime = System.nanoTime();
            if (j11 == 0 || jNanoTime - j11 >= 0) {
                synchronized (this.lock) {
                    try {
                        if (j11 == this.expirationNanos) {
                            T t11 = this.delegate.get();
                            this.value = t11;
                            long j12 = jNanoTime + this.durationNanos;
                            if (j12 == 0) {
                                j12 = 1;
                            }
                            this.expirationNanos = j12;
                            return t11;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return (T) NullnessCasts.uncheckedCastNullableTToT(this.value);
        }

        public String toString() {
            return "Suppliers.memoizeWithExpiration(" + this.delegate + ", " + this.durationNanos + ", NANOS)";
        }

        public ExpiringMemoizingSupplier(Supplier<T> supplier, long j11) {
            this.delegate = supplier;
            this.durationNanos = j11;
        }

        @J2ktIncompatible
        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.lock = new Object();
        }
    }

    @VisibleForTesting
    public static class MemoizingSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Supplier<T> delegate;
        volatile transient boolean initialized;
        private transient Object lock = new Object();
        transient T value;

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            if (!this.initialized) {
                synchronized (this.lock) {
                    try {
                        if (!this.initialized) {
                            T t11 = this.delegate.get();
                            this.value = t11;
                            this.initialized = true;
                            return t11;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return (T) NullnessCasts.uncheckedCastNullableTToT(this.value);
        }

        public String toString() {
            Object obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (this.initialized) {
                obj = "<supplier that returned " + this.value + ">";
            } else {
                obj = this.delegate;
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }

        public MemoizingSupplier(Supplier<T> supplier) {
            this.delegate = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @J2ktIncompatible
        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.lock = new Object();
        }
    }

    @VisibleForTesting
    public static class NonSerializableMemoizingSupplier<T> implements Supplier<T> {
        private static final Supplier<Void> SUCCESSFULLY_COMPUTED = new Supplier() { // from class: com.google.common.base.d
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return Suppliers.NonSerializableMemoizingSupplier.m13383a();
            }
        };
        private volatile Supplier<T> delegate;
        private final Object lock = new Object();
        private T value;

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Void m13383a() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            Supplier<T> supplier = this.delegate;
            Supplier<T> supplier2 = (Supplier<T>) SUCCESSFULLY_COMPUTED;
            if (supplier != supplier2) {
                synchronized (this.lock) {
                    try {
                        if (this.delegate != supplier2) {
                            T t11 = this.delegate.get();
                            this.value = t11;
                            this.delegate = supplier2;
                            return t11;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return (T) NullnessCasts.uncheckedCastNullableTToT(this.value);
        }

        public String toString() {
            Object obj = this.delegate;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (obj == SUCCESSFULLY_COMPUTED) {
                obj = "<supplier that returned " + this.value + ">";
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }

        public NonSerializableMemoizingSupplier(Supplier<T> supplier) {
            this.delegate = (Supplier) Preconditions.checkNotNull(supplier);
        }
    }

    /* JADX INFO: loaded from: classes56.dex */
    public static class SupplierComposition<F, T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Function<? super F, T> function;
        final Supplier<F> supplier;

        public boolean equals(Object obj) {
            if (obj instanceof SupplierComposition) {
                SupplierComposition supplierComposition = (SupplierComposition) obj;
                if (this.function.equals(supplierComposition.function) && this.supplier.equals(supplierComposition.supplier)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            return this.function.apply(this.supplier.get());
        }

        public int hashCode() {
            return Objects.hashCode(this.function, this.supplier);
        }

        public String toString() {
            return "Suppliers.compose(" + this.function + ", " + this.supplier + ")";
        }

        public SupplierComposition(Function<? super F, T> function, Supplier<F> supplier) {
            this.function = (Function) Preconditions.checkNotNull(function);
            this.supplier = (Supplier) Preconditions.checkNotNull(supplier);
        }
    }

    /* JADX INFO: loaded from: classes56.dex */
    public interface SupplierFunction<T> extends Function<Supplier<T>, T> {
    }

    /* JADX INFO: loaded from: classes56.dex */
    public enum SupplierFunctionImpl implements SupplierFunction<Object> {
        INSTANCE;

        @Override // com.google.common.base.Function
        public Object apply(Supplier<Object> supplier) {
            return supplier.get();
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Suppliers.supplierFunction()";
        }
    }

    public static class SupplierOfInstance<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;

        @ParametricNullness
        final T instance;

        public boolean equals(Object obj) {
            if (obj instanceof SupplierOfInstance) {
                return Objects.equal(this.instance, ((SupplierOfInstance) obj).instance);
            }
            return false;
        }

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            return this.instance;
        }

        public int hashCode() {
            return Objects.hashCode(this.instance);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.instance + ")";
        }

        public SupplierOfInstance(@ParametricNullness T t11) {
            this.instance = t11;
        }
    }

    /* JADX INFO: loaded from: classes56.dex */
    @J2ktIncompatible
    public static class ThreadSafeSupplier<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Supplier<T> delegate;

        @Override // com.google.common.base.Supplier
        @ParametricNullness
        public T get() {
            T t11;
            synchronized (this.delegate) {
                t11 = this.delegate.get();
            }
            return t11;
        }

        public String toString() {
            return "Suppliers.synchronizedSupplier(" + this.delegate + ")";
        }

        public ThreadSafeSupplier(Supplier<T> supplier) {
            this.delegate = (Supplier) Preconditions.checkNotNull(supplier);
        }
    }

    public static <T> Supplier<T> memoizeWithExpiration(Supplier<T> supplier, long j11, TimeUnit timeUnit) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkArgument(j11 > 0, "duration (%s %s) must be > 0", j11, timeUnit);
        return new ExpiringMemoizingSupplier(supplier, timeUnit.toNanos(j11));
    }

    public static <F, T> Supplier<T> compose(Function<? super F, T> function, Supplier<F> supplier) {
        return new SupplierComposition(function, supplier);
    }

    public static <T> Supplier<T> memoize(Supplier<T> supplier) {
        if ((supplier instanceof NonSerializableMemoizingSupplier) || (supplier instanceof MemoizingSupplier)) {
            return supplier;
        }
        return supplier instanceof Serializable ? new MemoizingSupplier(supplier) : new NonSerializableMemoizingSupplier(supplier);
    }

    public static <T> Supplier<T> ofInstance(@ParametricNullness T t11) {
        return new SupplierOfInstance(t11);
    }

    public static <T> Function<Supplier<T>, T> supplierFunction() {
        return SupplierFunctionImpl.INSTANCE;
    }

    @J2ktIncompatible
    public static <T> Supplier<T> synchronizedSupplier(Supplier<T> supplier) {
        return new ThreadSafeSupplier(supplier);
    }

    private Suppliers() {
    }

    @J2ktIncompatible
    @GwtIncompatible
    @IgnoreJRERequirement
    public static <T> Supplier<T> memoizeWithExpiration(Supplier<T> supplier, Duration duration) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkArgument((duration.isNegative() || duration.isZero()) ? false : true, "duration (%s) must be > 0", duration);
        return new ExpiringMemoizingSupplier(supplier, Internal.toNanosSaturated(duration));
    }
}
