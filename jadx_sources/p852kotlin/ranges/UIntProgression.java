package p852kotlin.ranges;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.UInt;
import p852kotlin.internal.UProgressionUtilKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: UIntRange.kt */
/* JADX INFO: loaded from: classes61.dex */
@SinceKotlin(version = "1.5")
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0086\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0013\u0010\t\u001a\u00020\u0002¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\r\u001a\u00020\u0002¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, m90084d2 = {"Lkotlin/ranges/UIntProgression;", "", "Lkotlin/UInt;", "start", "endInclusive", "step", "", "<init>", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "first", "getFirst-pVg5ArA", "()I", "I", "last", "getLast-pVg5ArA", "getStep", "iterator", "", "isEmpty", "", "equals", "other", "", "hashCode", "toString", "", "Companion", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class UIntProgression implements Iterable<UInt>, KMappedMarker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int first;
    private final int last;
    private final int step;

    /* JADX INFO: compiled from: UIntRange.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lkotlin/ranges/UIntProgression$Companion;", "", "<init>", "()V", "fromClosedRange", "Lkotlin/ranges/UIntProgression;", "rangeStart", "Lkotlin/UInt;", "rangeEnd", "step", "", "fromClosedRange-Nkh28Cs", "(III)Lkotlin/ranges/UIntProgression;", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        /* JADX INFO: renamed from: fromClosedRange-Nkh28Cs, reason: not valid java name */
        public final UIntProgression m105068fromClosedRangeNkh28Cs(int rangeStart, int rangeEnd, int step) {
            return new UIntProgression(rangeStart, rangeEnd, step, null);
        }
    }

    public /* synthetic */ UIntProgression(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, i13);
    }

    private UIntProgression(int i11, int i12, int i13) {
        if (i13 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i13 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = i11;
        this.last = UProgressionUtilKt.m105052getProgressionLastElementNkh28Cs(i11, i12, i13);
        this.step = i13;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof UIntProgression)) {
            return false;
        }
        if (isEmpty() && ((UIntProgression) other).isEmpty()) {
            return true;
        }
        UIntProgression uIntProgression = (UIntProgression) other;
        return this.first == uIntProgression.first && this.last == uIntProgression.last && this.step == uIntProgression.step;
    }

    /* JADX INFO: renamed from: getFirst-pVg5ArA, reason: not valid java name and from getter */
    public final int getFirst() {
        return this.first;
    }

    /* JADX INFO: renamed from: getLast-pVg5ArA, reason: not valid java name and from getter */
    public final int getLast() {
        return this.last;
    }

    public final int getStep() {
        return this.step;
    }

    public boolean isEmpty() {
        if (this.step > 0) {
            return Integer.compare(this.first ^ Integer.MIN_VALUE, this.last ^ Integer.MIN_VALUE) > 0;
        }
        return Integer.compare(this.first ^ Integer.MIN_VALUE, this.last ^ Integer.MIN_VALUE) < 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<UInt> iterator() {
        return new UIntProgressionIterator(this.first, this.last, this.step, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2;
        int i11;
        if (this.step > 0) {
            sb2 = new StringBuilder();
            sb2.append((Object) UInt.m103985toStringimpl(this.first));
            sb2.append("..");
            sb2.append((Object) UInt.m103985toStringimpl(this.last));
            sb2.append(" step ");
            i11 = this.step;
        } else {
            sb2 = new StringBuilder();
            sb2.append((Object) UInt.m103985toStringimpl(this.first));
            sb2.append(" downTo ");
            sb2.append((Object) UInt.m103985toStringimpl(this.last));
            sb2.append(" step ");
            i11 = -this.step;
        }
        sb2.append(i11);
        return sb2.toString();
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.first * 31) + this.last) * 31) + this.step;
    }
}
