package p852kotlin.ranges;

import androidx.exifinterface.media.ExifInterface;
import java.lang.Comparable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0012\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0016\u0010\u0004\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\t¨\u0006\u0014"}, m90084d2 = {"Lkotlin/ranges/ComparableOpenEndRange;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/ranges/OpenEndRange;", "start", "endExclusive", "<init>", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)V", "getStart", "()Ljava/lang/Comparable;", "Ljava/lang/Comparable;", "getEndExclusive", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
class ComparableOpenEndRange<T extends Comparable<? super T>> implements OpenEndRange<T> {

    @NotNull
    private final T endExclusive;

    @NotNull
    private final T start;

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof ComparableOpenEndRange)) {
            return false;
        }
        if (isEmpty() && ((ComparableOpenEndRange) other).isEmpty()) {
            return true;
        }
        ComparableOpenEndRange comparableOpenEndRange = (ComparableOpenEndRange) other;
        return Intrinsics.areEqual(getStart(), comparableOpenEndRange.getStart()) && Intrinsics.areEqual(getEndExclusive(), comparableOpenEndRange.getEndExclusive());
    }

    @Override // p852kotlin.ranges.OpenEndRange
    @NotNull
    public T getEndExclusive() {
        return this.endExclusive;
    }

    @Override // p852kotlin.ranges.OpenEndRange
    @NotNull
    public T getStart() {
        return this.start;
    }

    @NotNull
    public String toString() {
        return getStart() + "..<" + getEndExclusive();
    }

    public ComparableOpenEndRange(@NotNull T start, @NotNull T endExclusive) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(endExclusive, "endExclusive");
        this.start = start;
        this.endExclusive = endExclusive;
    }

    @Override // p852kotlin.ranges.OpenEndRange
    public boolean contains(@NotNull T t11) {
        return OpenEndRange.DefaultImpls.contains(this, t11);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getStart().hashCode() * 31) + getEndExclusive().hashCode();
    }

    @Override // p852kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        return OpenEndRange.DefaultImpls.isEmpty(this);
    }
}
