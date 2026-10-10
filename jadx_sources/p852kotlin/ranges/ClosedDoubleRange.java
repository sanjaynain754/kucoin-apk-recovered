package p852kotlin.ranges;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0011\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0012\u001a\u00020\rH\u0016J\u0013\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0007\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n¨\u0006\u001a"}, m90084d2 = {"Lkotlin/ranges/ClosedDoubleRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "start", "endInclusive", "<init>", "(DD)V", "_start", "_endInclusive", "getStart", "()Ljava/lang/Double;", "getEndInclusive", "lessThanOrEquals", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "contains", "value", "isEmpty", "equals", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
final class ClosedDoubleRange implements ClosedFloatingPointRange<Double> {
    private final double _endInclusive;
    private final double _start;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.ranges.ClosedFloatingPointRange, p852kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).doubleValue());
    }

    public boolean lessThanOrEquals(double a11, double b11) {
        return a11 <= b11;
    }

    public boolean contains(double value) {
        return value >= this._start && value <= this._endInclusive;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof ClosedDoubleRange)) {
            return false;
        }
        if (isEmpty() && ((ClosedDoubleRange) other).isEmpty()) {
            return true;
        }
        ClosedDoubleRange closedDoubleRange = (ClosedDoubleRange) other;
        return this._start == closedDoubleRange._start && this._endInclusive == closedDoubleRange._endInclusive;
    }

    @Override // p852kotlin.ranges.ClosedRange
    @NotNull
    public Double getEndInclusive() {
        return Double.valueOf(this._endInclusive);
    }

    @Override // p852kotlin.ranges.ClosedRange
    @NotNull
    public Double getStart() {
        return Double.valueOf(this._start);
    }

    @Override // p852kotlin.ranges.ClosedFloatingPointRange, p852kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return this._start > this._endInclusive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.ranges.ClosedFloatingPointRange
    public /* bridge */ /* synthetic */ boolean lessThanOrEquals(Comparable comparable, Comparable comparable2) {
        return lessThanOrEquals(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }

    @NotNull
    public String toString() {
        return this._start + ".." + this._endInclusive;
    }

    public ClosedDoubleRange(double d11, double d12) {
        this._start = d11;
        this._endInclusive = d12;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this._start) * 31) + Double.hashCode(this._endInclusive);
    }
}
