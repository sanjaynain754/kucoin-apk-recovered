package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ComparisonChain {
    private static final ComparisonChain ACTIVE = new ComparisonChain() { // from class: com.google.common.collect.ComparisonChain.1
        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(Comparable<?> comparable, Comparable<?> comparable2) {
            return classify(comparable.compareTo(comparable2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public int result() {
            return 0;
        }

        public ComparisonChain classify(int i11) {
            if (i11 < 0) {
                return ComparisonChain.LESS;
            }
            return i11 > 0 ? ComparisonChain.GREATER : ComparisonChain.ACTIVE;
        }

        @Override // com.google.common.collect.ComparisonChain
        public <T> ComparisonChain compare(@ParametricNullness T t11, @ParametricNullness T t12, Comparator<T> comparator) {
            return classify(comparator.compare(t11, t12));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(int i11, int i12) {
            return classify(Integer.compare(i11, i12));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareFalseFirst(boolean z11, boolean z12) {
            return classify(Boolean.compare(z11, z12));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareTrueFirst(boolean z11, boolean z12) {
            return classify(Boolean.compare(z12, z11));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(long j11, long j12) {
            return classify(Long.compare(j11, j12));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(float f11, float f12) {
            return classify(Float.compare(f11, f12));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(double d11, double d12) {
            return classify(Double.compare(d11, d12));
        }
    };
    private static final ComparisonChain LESS = new InactiveComparisonChain(-1);
    private static final ComparisonChain GREATER = new InactiveComparisonChain(1);

    public static final class InactiveComparisonChain extends ComparisonChain {
        final int result;

        public InactiveComparisonChain(int i11) {
            super();
            this.result = i11;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(double d11, double d12) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(float f11, float f12) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public int result() {
            return this.result;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(int i11, int i12) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(long j11, long j12) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(Comparable<?> comparable, Comparable<?> comparable2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public <T> ComparisonChain compare(@ParametricNullness T t11, @ParametricNullness T t12, Comparator<T> comparator) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareFalseFirst(boolean z11, boolean z12) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareTrueFirst(boolean z11, boolean z12) {
            return this;
        }
    }

    public abstract ComparisonChain compare(double d11, double d12);

    public abstract ComparisonChain compare(float f11, float f12);

    public abstract ComparisonChain compare(int i11, int i12);

    public abstract ComparisonChain compare(long j11, long j12);

    @Deprecated
    public final ComparisonChain compare(Boolean bool, Boolean bool2) {
        return compareFalseFirst(bool.booleanValue(), bool2.booleanValue());
    }

    public abstract ComparisonChain compare(Comparable<?> comparable, Comparable<?> comparable2);

    public abstract <T> ComparisonChain compare(@ParametricNullness T t11, @ParametricNullness T t12, Comparator<T> comparator);

    public abstract ComparisonChain compareFalseFirst(boolean z11, boolean z12);

    public abstract ComparisonChain compareTrueFirst(boolean z11, boolean z12);

    public abstract int result();

    private ComparisonChain() {
    }

    public static ComparisonChain start() {
        return ACTIVE;
    }
}
