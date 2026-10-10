package p852kotlin.ranges;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u0011\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0012\u001a\u00020\rH\u0016J\u0013\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0007\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n¨\u0006\u001a"}, m90084d2 = {"Lkotlin/ranges/OpenEndFloatRange;", "Lkotlin/ranges/OpenEndRange;", "", "start", "endExclusive", "<init>", "(FF)V", "_start", "_endExclusive", "getStart", "()Ljava/lang/Float;", "getEndExclusive", "lessThanOrEquals", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "contains", "value", "isEmpty", "equals", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
final class OpenEndFloatRange implements OpenEndRange<Float> {
    private final float _endExclusive;
    private final float _start;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).floatValue());
    }

    private final boolean lessThanOrEquals(float a11, float b11) {
        return a11 <= b11;
    }

    public boolean contains(float value) {
        return value >= this._start && value < this._endExclusive;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof OpenEndFloatRange)) {
            return false;
        }
        if (isEmpty() && ((OpenEndFloatRange) other).isEmpty()) {
            return true;
        }
        OpenEndFloatRange openEndFloatRange = (OpenEndFloatRange) other;
        return this._start == openEndFloatRange._start && this._endExclusive == openEndFloatRange._endExclusive;
    }

    @Override // p852kotlin.ranges.OpenEndRange
    @NotNull
    public Float getEndExclusive() {
        return Float.valueOf(this._endExclusive);
    }

    @Override // p852kotlin.ranges.OpenEndRange
    @NotNull
    public Float getStart() {
        return Float.valueOf(this._start);
    }

    @Override // p852kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        return this._start >= this._endExclusive;
    }

    @NotNull
    public String toString() {
        return this._start + "..<" + this._endExclusive;
    }

    public OpenEndFloatRange(float f11, float f12) {
        this._start = f11;
        this._endExclusive = f12;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this._start) * 31) + Float.hashCode(this._endExclusive);
    }
}
