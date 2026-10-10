package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes56.dex */
@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class Interners {

    public static class InternerBuilder {
        private final MapMaker mapMaker;
        private boolean strong;

        public InternerBuilder strong() {
            this.strong = true;
            return this;
        }

        @GwtIncompatible("java.lang.ref.WeakReference")
        public InternerBuilder weak() {
            this.strong = false;
            return this;
        }

        private InternerBuilder() {
            this.mapMaker = new MapMaker();
            this.strong = true;
        }

        public <E> Interner<E> build() {
            if (!this.strong) {
                this.mapMaker.weakKeys();
            }
            return new InternerImpl(this.mapMaker);
        }

        public InternerBuilder concurrencyLevel(int i11) {
            this.mapMaker.concurrencyLevel(i11);
            return this;
        }
    }

    public static class InternerFunction<E> implements Function<E, E> {
        private final Interner<E> interner;

        @Override // com.google.common.base.Function
        public E apply(E e11) {
            return this.interner.intern(e11);
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof InternerFunction) {
                return this.interner.equals(((InternerFunction) obj).interner);
            }
            return false;
        }

        public int hashCode() {
            return this.interner.hashCode();
        }

        public InternerFunction(Interner<E> interner) {
            this.interner = interner;
        }
    }

    @VisibleForTesting
    public static final class InternerImpl<E> implements Interner<E> {

        @VisibleForTesting
        final MapMakerInternalMap<E, MapMaker.Dummy, ?, ?> map;

        private InternerImpl(MapMaker mapMaker) {
            this.map = MapMakerInternalMap.createWithDummyValues(mapMaker.keyEquivalence(Equivalence.equals()));
        }

        @Override // com.google.common.collect.Interner
        public E intern(E e11) {
            E e12;
            do {
                MapMakerInternalMap.InternalEntry entry = this.map.getEntry(e11);
                if (entry != null && (e12 = (E) entry.getKey()) != null) {
                    return e12;
                }
            } while (this.map.putIfAbsent(e11, MapMaker.Dummy.VALUE) != null);
            return e11;
        }
    }

    public static <E> Function<E, E> asFunction(Interner<E> interner) {
        return new InternerFunction((Interner) Preconditions.checkNotNull(interner));
    }

    public static InternerBuilder newBuilder() {
        return new InternerBuilder();
    }

    private Interners() {
    }

    public static <E> Interner<E> newStrongInterner() {
        return newBuilder().strong().build();
    }

    @GwtIncompatible("java.lang.ref.WeakReference")
    public static <E> Interner<E> newWeakInterner() {
        return newBuilder().weak().build();
    }
}
