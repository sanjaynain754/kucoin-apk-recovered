package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.tencent.bugly.proguard.C33844oi;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
final class GeneralRange<T> implements Serializable {
    private final Comparator<? super T> comparator;
    private final boolean hasLowerBound;
    private final boolean hasUpperBound;
    private final BoundType lowerBoundType;
    private final T lowerEndpoint;

    @LazyInit
    private transient GeneralRange<T> reverse;
    private final BoundType upperBoundType;
    private final T upperEndpoint;

    public static <T> GeneralRange<T> all(Comparator<? super T> comparator) {
        BoundType boundType = BoundType.OPEN;
        return new GeneralRange<>(comparator, false, null, boundType, false, null, boundType);
    }

    public static <T> GeneralRange<T> downTo(Comparator<? super T> comparator, @ParametricNullness T t11, BoundType boundType) {
        return new GeneralRange<>(comparator, true, t11, boundType, false, null, BoundType.OPEN);
    }

    public static <T> GeneralRange<T> range(Comparator<? super T> comparator, @ParametricNullness T t11, BoundType boundType, @ParametricNullness T t12, BoundType boundType2) {
        return new GeneralRange<>(comparator, true, t11, boundType, true, t12, boundType2);
    }

    public static <T> GeneralRange<T> upTo(Comparator<? super T> comparator, @ParametricNullness T t11, BoundType boundType) {
        return new GeneralRange<>(comparator, false, null, BoundType.OPEN, true, t11, boundType);
    }

    public Comparator<? super T> comparator() {
        return this.comparator;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GeneralRange) {
            GeneralRange generalRange = (GeneralRange) obj;
            if (this.comparator.equals(generalRange.comparator) && this.hasLowerBound == generalRange.hasLowerBound && this.hasUpperBound == generalRange.hasUpperBound && getLowerBoundType().equals(generalRange.getLowerBoundType()) && getUpperBoundType().equals(generalRange.getUpperBoundType()) && Objects.equal(getLowerEndpoint(), generalRange.getLowerEndpoint()) && Objects.equal(getUpperEndpoint(), generalRange.getUpperEndpoint())) {
                return true;
            }
        }
        return false;
    }

    public BoundType getLowerBoundType() {
        return this.lowerBoundType;
    }

    public T getLowerEndpoint() {
        return this.lowerEndpoint;
    }

    public BoundType getUpperBoundType() {
        return this.upperBoundType;
    }

    public T getUpperEndpoint() {
        return this.upperEndpoint;
    }

    public boolean hasLowerBound() {
        return this.hasLowerBound;
    }

    public boolean hasUpperBound() {
        return this.hasUpperBound;
    }

    public int hashCode() {
        return Objects.hashCode(this.comparator, getLowerEndpoint(), getLowerBoundType(), getUpperEndpoint(), getUpperBoundType());
    }

    public GeneralRange<T> reverse() {
        GeneralRange<T> generalRange = this.reverse;
        if (generalRange != null) {
            return generalRange;
        }
        GeneralRange<T> generalRange2 = new GeneralRange<>(Ordering.from(this.comparator).reverse(), this.hasUpperBound, getUpperEndpoint(), getUpperBoundType(), this.hasLowerBound, getLowerEndpoint(), getLowerBoundType());
        generalRange2.reverse = this;
        this.reverse = generalRange2;
        return generalRange2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.comparator);
        sb2.append(C33844oi.f71346o);
        BoundType boundType = this.lowerBoundType;
        BoundType boundType2 = BoundType.CLOSED;
        sb2.append(boundType == boundType2 ? '[' : '(');
        sb2.append(this.hasLowerBound ? this.lowerEndpoint : "-∞");
        sb2.append(',');
        sb2.append(this.hasUpperBound ? this.upperEndpoint : "∞");
        sb2.append(this.upperBoundType == boundType2 ? ']' : ')');
        return sb2.toString();
    }

    private GeneralRange(Comparator<? super T> comparator, boolean z11, T t11, BoundType boundType, boolean z12, T t12, BoundType boundType2) {
        boolean z13;
        this.comparator = (Comparator) Preconditions.checkNotNull(comparator);
        this.hasLowerBound = z11;
        this.hasUpperBound = z12;
        this.lowerEndpoint = t11;
        this.lowerBoundType = (BoundType) Preconditions.checkNotNull(boundType);
        this.upperEndpoint = t12;
        this.upperBoundType = (BoundType) Preconditions.checkNotNull(boundType2);
        if (z11) {
            comparator.compare((Object) NullnessCasts.uncheckedCastNullableTToT(t11), (Object) NullnessCasts.uncheckedCastNullableTToT(t11));
        }
        if (z12) {
            comparator.compare((Object) NullnessCasts.uncheckedCastNullableTToT(t12), (Object) NullnessCasts.uncheckedCastNullableTToT(t12));
        }
        if (z11 && z12) {
            int iCompare = comparator.compare((Object) NullnessCasts.uncheckedCastNullableTToT(t11), (Object) NullnessCasts.uncheckedCastNullableTToT(t12));
            if (iCompare <= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            Preconditions.checkArgument(z13, "lowerEndpoint (%s) > upperEndpoint (%s)", t11, t12);
            if (iCompare == 0) {
                BoundType boundType3 = BoundType.OPEN;
                Preconditions.checkArgument((boundType == boundType3 && boundType2 == boundType3) ? false : true);
            }
        }
    }

    public static <T extends Comparable> GeneralRange<T> from(Range<T> range) {
        Comparable comparableLowerEndpoint;
        BoundType boundTypeLowerBoundType;
        BoundType boundTypeUpperBoundType;
        Comparable comparableUpperEndpoint = null;
        if (range.hasLowerBound()) {
            comparableLowerEndpoint = range.lowerEndpoint();
        } else {
            comparableLowerEndpoint = null;
        }
        if (range.hasLowerBound()) {
            boundTypeLowerBoundType = range.lowerBoundType();
        } else {
            boundTypeLowerBoundType = BoundType.OPEN;
        }
        BoundType boundType = boundTypeLowerBoundType;
        if (range.hasUpperBound()) {
            comparableUpperEndpoint = range.upperEndpoint();
        }
        Comparable comparable = comparableUpperEndpoint;
        if (range.hasUpperBound()) {
            boundTypeUpperBoundType = range.upperBoundType();
        } else {
            boundTypeUpperBoundType = BoundType.OPEN;
        }
        return new GeneralRange<>(Ordering.natural(), range.hasLowerBound(), comparableLowerEndpoint, boundType, range.hasUpperBound(), comparable, boundTypeUpperBoundType);
    }

    public boolean contains(@ParametricNullness T t11) {
        if (!tooLow(t11) && !tooHigh(t11)) {
            return true;
        }
        return false;
    }

    public GeneralRange<T> intersect(GeneralRange<T> generalRange) {
        int iCompare;
        int iCompare2;
        T t11;
        int iCompare3;
        BoundType boundType;
        Preconditions.checkNotNull(generalRange);
        Preconditions.checkArgument(this.comparator.equals(generalRange.comparator));
        boolean z11 = this.hasLowerBound;
        T lowerEndpoint = getLowerEndpoint();
        BoundType lowerBoundType = getLowerBoundType();
        if (!hasLowerBound()) {
            z11 = generalRange.hasLowerBound;
            lowerEndpoint = generalRange.getLowerEndpoint();
            lowerBoundType = generalRange.getLowerBoundType();
        } else if (generalRange.hasLowerBound() && ((iCompare = this.comparator.compare(getLowerEndpoint(), generalRange.getLowerEndpoint())) < 0 || (iCompare == 0 && generalRange.getLowerBoundType() == BoundType.OPEN))) {
            lowerEndpoint = generalRange.getLowerEndpoint();
            lowerBoundType = generalRange.getLowerBoundType();
        }
        boolean z12 = z11;
        boolean z13 = this.hasUpperBound;
        T upperEndpoint = getUpperEndpoint();
        BoundType upperBoundType = getUpperBoundType();
        if (!hasUpperBound()) {
            z13 = generalRange.hasUpperBound;
            upperEndpoint = generalRange.getUpperEndpoint();
            upperBoundType = generalRange.getUpperBoundType();
        } else if (generalRange.hasUpperBound() && ((iCompare2 = this.comparator.compare(getUpperEndpoint(), generalRange.getUpperEndpoint())) > 0 || (iCompare2 == 0 && generalRange.getUpperBoundType() == BoundType.OPEN))) {
            upperEndpoint = generalRange.getUpperEndpoint();
            upperBoundType = generalRange.getUpperBoundType();
        }
        boolean z14 = z13;
        T t12 = upperEndpoint;
        if (z12 && z14 && ((iCompare3 = this.comparator.compare(lowerEndpoint, t12)) > 0 || (iCompare3 == 0 && lowerBoundType == (boundType = BoundType.OPEN) && upperBoundType == boundType))) {
            lowerBoundType = BoundType.OPEN;
            upperBoundType = BoundType.CLOSED;
            t11 = t12;
        } else {
            t11 = lowerEndpoint;
        }
        return new GeneralRange<>(this.comparator, z12, t11, lowerBoundType, z14, t12, upperBoundType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean isEmpty() {
        if (!hasUpperBound() || !tooLow(NullnessCasts.uncheckedCastNullableTToT(getUpperEndpoint()))) {
            if (hasLowerBound() && tooHigh(NullnessCasts.uncheckedCastNullableTToT(getLowerEndpoint()))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean tooHigh(@ParametricNullness T t11) {
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (!hasUpperBound()) {
            return false;
        }
        int iCompare = this.comparator.compare(t11, NullnessCasts.uncheckedCastNullableTToT(getUpperEndpoint()));
        if (iCompare > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (iCompare == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (getUpperBoundType() == BoundType.OPEN) {
            z13 = true;
        }
        return (z12 & z13) | z11;
    }

    public boolean tooLow(@ParametricNullness T t11) {
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (!hasLowerBound()) {
            return false;
        }
        int iCompare = this.comparator.compare(t11, NullnessCasts.uncheckedCastNullableTToT(getLowerEndpoint()));
        if (iCompare < 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (iCompare == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (getLowerBoundType() == BoundType.OPEN) {
            z13 = true;
        }
        return (z12 & z13) | z11;
    }
}
