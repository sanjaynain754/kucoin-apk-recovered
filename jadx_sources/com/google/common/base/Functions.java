package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Functions {

    public static class ConstantFunction<E> implements Function<Object, E>, Serializable {
        private static final long serialVersionUID = 0;

        @ParametricNullness
        private final E value;

        @Override // com.google.common.base.Function
        @ParametricNullness
        public E apply(Object obj) {
            return this.value;
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof ConstantFunction) {
                return Objects.equal(this.value, ((ConstantFunction) obj).value);
            }
            return false;
        }

        public int hashCode() {
            E e11 = this.value;
            if (e11 == null) {
                return 0;
            }
            return e11.hashCode();
        }

        public String toString() {
            return "Functions.constant(" + this.value + ")";
        }

        public ConstantFunction(@ParametricNullness E e11) {
            this.value = e11;
        }
    }

    public static class ForMapWithDefault<K, V> implements Function<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        @ParametricNullness
        final V defaultValue;
        final Map<K, ? extends V> map;

        @Override // com.google.common.base.Function
        @ParametricNullness
        public V apply(@ParametricNullness K k11) {
            V v11 = this.map.get(k11);
            return (v11 != null || this.map.containsKey(k11)) ? (V) NullnessCasts.uncheckedCastNullableTToT(v11) : this.defaultValue;
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof ForMapWithDefault) {
                ForMapWithDefault forMapWithDefault = (ForMapWithDefault) obj;
                if (this.map.equals(forMapWithDefault.map) && Objects.equal(this.defaultValue, forMapWithDefault.defaultValue)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.map, this.defaultValue);
        }

        public String toString() {
            return "Functions.forMap(" + this.map + ", defaultValue=" + this.defaultValue + ")";
        }

        public ForMapWithDefault(Map<K, ? extends V> map, @ParametricNullness V v11) {
            this.map = (Map) Preconditions.checkNotNull(map);
            this.defaultValue = v11;
        }
    }

    public static class FunctionComposition<A, B, C> implements Function<A, C>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: f */
        private final Function<A, ? extends B> f12219f;

        /* JADX INFO: renamed from: g */
        private final Function<B, C> f12220g;

        @Override // com.google.common.base.Function
        @ParametricNullness
        public C apply(@ParametricNullness A a11) {
            return (C) this.f12220g.apply(this.f12219f.apply(a11));
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof FunctionComposition) {
                FunctionComposition functionComposition = (FunctionComposition) obj;
                if (this.f12219f.equals(functionComposition.f12219f) && this.f12220g.equals(functionComposition.f12220g)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f12219f.hashCode() ^ this.f12220g.hashCode();
        }

        public String toString() {
            return this.f12220g + "(" + this.f12219f + ")";
        }

        public FunctionComposition(Function<B, C> function, Function<A, ? extends B> function2) {
            this.f12220g = (Function) Preconditions.checkNotNull(function);
            this.f12219f = (Function) Preconditions.checkNotNull(function2);
        }
    }

    public static class FunctionForMapNoDefault<K, V> implements Function<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        final Map<K, V> map;

        @Override // com.google.common.base.Function
        @ParametricNullness
        public V apply(@ParametricNullness K k11) {
            V v11 = this.map.get(k11);
            Preconditions.checkArgument(v11 != null || this.map.containsKey(k11), "Key '%s' not present in map", k11);
            return (V) NullnessCasts.uncheckedCastNullableTToT(v11);
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof FunctionForMapNoDefault) {
                return this.map.equals(((FunctionForMapNoDefault) obj).map);
            }
            return false;
        }

        public int hashCode() {
            return this.map.hashCode();
        }

        public String toString() {
            return "Functions.forMap(" + this.map + ")";
        }

        public FunctionForMapNoDefault(Map<K, V> map) {
            this.map = (Map) Preconditions.checkNotNull(map);
        }
    }

    public enum IdentityFunction implements Function<Object, Object> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.identity()";
        }

        @Override // com.google.common.base.Function
        public Object apply(Object obj) {
            return obj;
        }
    }

    public static class PredicateFunction<T> implements Function<T, Boolean>, Serializable {
        private static final long serialVersionUID = 0;
        private final Predicate<T> predicate;

        private PredicateFunction(Predicate<T> predicate) {
            this.predicate = (Predicate) Preconditions.checkNotNull(predicate);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.Function
        public Boolean apply(@ParametricNullness T t11) {
            return Boolean.valueOf(this.predicate.apply(t11));
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof PredicateFunction) {
                return this.predicate.equals(((PredicateFunction) obj).predicate);
            }
            return false;
        }

        public int hashCode() {
            return this.predicate.hashCode();
        }

        public String toString() {
            return "Functions.forPredicate(" + this.predicate + ")";
        }
    }

    public static class SupplierFunction<F, T> implements Function<F, T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Supplier<T> supplier;

        private SupplierFunction(Supplier<T> supplier) {
            this.supplier = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Function
        @ParametricNullness
        public T apply(@ParametricNullness F f11) {
            return this.supplier.get();
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof SupplierFunction) {
                return this.supplier.equals(((SupplierFunction) obj).supplier);
            }
            return false;
        }

        public int hashCode() {
            return this.supplier.hashCode();
        }

        public String toString() {
            return "Functions.forSupplier(" + this.supplier + ")";
        }
    }

    public enum ToStringFunction implements Function<Object, String> {
        INSTANCE;

        @Override // com.google.common.base.Function
        public String apply(Object obj) {
            Preconditions.checkNotNull(obj);
            return obj.toString();
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.toStringFunction()";
        }
    }

    public static <K, V> Function<K, V> forMap(Map<K, V> map) {
        return new FunctionForMapNoDefault(map);
    }

    public static <A, B, C> Function<A, C> compose(Function<B, C> function, Function<A, ? extends B> function2) {
        return new FunctionComposition(function, function2);
    }

    public static <E> Function<Object, E> constant(@ParametricNullness E e11) {
        return new ConstantFunction(e11);
    }

    public static <K, V> Function<K, V> forMap(Map<K, ? extends V> map, @ParametricNullness V v11) {
        return new ForMapWithDefault(map, v11);
    }

    public static <T> Function<T, Boolean> forPredicate(Predicate<T> predicate) {
        return new PredicateFunction(predicate);
    }

    public static <F, T> Function<F, T> forSupplier(Supplier<T> supplier) {
        return new SupplierFunction(supplier);
    }

    public static <E> Function<E, E> identity() {
        return IdentityFunction.INSTANCE;
    }

    public static Function<Object, String> toStringFunction() {
        return ToStringFunction.INSTANCE;
    }

    private Functions() {
    }
}
