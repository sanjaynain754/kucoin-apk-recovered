package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import p852kotlin.text.Typography;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
@IgnoreJRERequirement
public final class MoreCollectors {
    private static final Object NULL_PLACEHOLDER;
    private static final Collector<Object, ?, Object> ONLY_ELEMENT;
    private static final Collector<Object, ?, Optional<Object>> TO_OPTIONAL;

    public static final class ToOptionalState {
        static final int MAX_EXTRAS = 4;
        Object element = null;
        List<Object> extras = Collections.EMPTY_LIST;

        public ToOptionalState combine(ToOptionalState toOptionalState) {
            if (this.element == null) {
                return toOptionalState;
            }
            if (toOptionalState.element != null) {
                if (this.extras.isEmpty()) {
                    this.extras = new ArrayList();
                }
                this.extras.add(toOptionalState.element);
                this.extras.addAll(toOptionalState.extras);
                if (this.extras.size() > 4) {
                    List<Object> list = this.extras;
                    list.subList(4, list.size()).clear();
                    throw multiples(true);
                }
            }
            return this;
        }

        public Object getElement() {
            if (this.element == null) {
                throw new NoSuchElementException();
            }
            if (this.extras.isEmpty()) {
                return this.element;
            }
            throw multiples(false);
        }

        @IgnoreJRERequirement
        public Optional<Object> getOptional() {
            if (this.extras.isEmpty()) {
                return Optional.ofNullable(this.element);
            }
            throw multiples(false);
        }

        public IllegalArgumentException multiples(boolean z11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("expected one element but was: <");
            sb2.append(this.element);
            for (Object obj : this.extras) {
                sb2.append(", ");
                sb2.append(obj);
            }
            if (z11) {
                sb2.append(", ...");
            }
            sb2.append(Typography.greater);
            throw new IllegalArgumentException(sb2.toString());
        }

        public void add(Object obj) {
            Preconditions.checkNotNull(obj);
            if (this.element == null) {
                this.element = obj;
                return;
            }
            if (this.extras.isEmpty()) {
                ArrayList arrayList = new ArrayList(4);
                this.extras = arrayList;
                arrayList.add(obj);
            } else {
                if (this.extras.size() < 4) {
                    this.extras.add(obj);
                    return;
                }
                throw multiples(true);
            }
        }
    }

    static {
        Supplier supplier = new Supplier() { // from class: com.google.common.collect.o2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new MoreCollectors.ToOptionalState();
            }
        };
        BiConsumer biConsumer = new BiConsumer() { // from class: com.google.common.collect.p2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((MoreCollectors.ToOptionalState) obj).add(obj2);
            }
        };
        BinaryOperator binaryOperator = new BinaryOperator() { // from class: com.google.common.collect.q2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((MoreCollectors.ToOptionalState) obj).combine((MoreCollectors.ToOptionalState) obj2);
            }
        };
        Function function = new Function() { // from class: com.google.common.collect.r2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((MoreCollectors.ToOptionalState) obj).getOptional();
            }
        };
        Collector.Characteristics characteristics = Collector.Characteristics.UNORDERED;
        TO_OPTIONAL = Collector.of(supplier, biConsumer, binaryOperator, function, characteristics);
        NULL_PLACEHOLDER = new Object();
        ONLY_ELEMENT = Collector.of(new Supplier() { // from class: com.google.common.collect.o2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new MoreCollectors.ToOptionalState();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.s2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                MoreCollectors.m13557a((MoreCollectors.ToOptionalState) obj, obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.q2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((MoreCollectors.ToOptionalState) obj).combine((MoreCollectors.ToOptionalState) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.t2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MoreCollectors.m13558b((MoreCollectors.ToOptionalState) obj);
            }
        }, characteristics);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13557a(ToOptionalState toOptionalState, Object obj) {
        if (obj == null) {
            obj = NULL_PLACEHOLDER;
        }
        toOptionalState.add(obj);
    }

    public static <T> Collector<T, ?, T> onlyElement() {
        return (Collector<T, ?, T>) ONLY_ELEMENT;
    }

    public static <T> Collector<T, ?, Optional<T>> toOptional() {
        return (Collector<T, ?, Optional<T>>) TO_OPTIONAL;
    }

    private MoreCollectors() {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m13558b(ToOptionalState toOptionalState) {
        Object element = toOptionalState.getElement();
        if (element == NULL_PLACEHOLDER) {
            return null;
        }
        return element;
    }
}
