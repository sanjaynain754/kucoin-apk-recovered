package p852kotlin.ranges;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.internal.ProgressionUtilKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Progressions.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\t\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m90084d2 = {"Lkotlin/ranges/CharProgression;", "", "", "start", "endInclusive", "step", "", "<init>", "(CCI)V", "first", "getFirst", "()C", "last", "getLast", "getStep", "()I", "iterator", "Lkotlin/collections/CharIterator;", "isEmpty", "", "equals", "other", "", "hashCode", "toString", "", "Companion", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class CharProgression implements Iterable<Character>, KMappedMarker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final char first;
    private final char last;
    private final int step;

    /* JADX INFO: compiled from: Progressions.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m90084d2 = {"Lkotlin/ranges/CharProgression$Companion;", "", "<init>", "()V", "fromClosedRange", "Lkotlin/ranges/CharProgression;", "rangeStart", "", "rangeEnd", "step", "", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final CharProgression fromClosedRange(char rangeStart, char rangeEnd, int step) {
            return new CharProgression(rangeStart, rangeEnd, step);
        }
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof CharProgression)) {
            return false;
        }
        if (isEmpty() && ((CharProgression) other).isEmpty()) {
            return true;
        }
        CharProgression charProgression = (CharProgression) other;
        return this.first == charProgression.first && this.last == charProgression.last && this.step == charProgression.step;
    }

    public final char getFirst() {
        return this.first;
    }

    public final char getLast() {
        return this.last;
    }

    public final int getStep() {
        return this.step;
    }

    public boolean isEmpty() {
        if (this.step > 0) {
            return Intrinsics.compare((int) this.first, (int) this.last) > 0;
        }
        return Intrinsics.compare((int) this.first, (int) this.last) < 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Character> iterator() {
        return new CharProgressionIterator(this.first, this.last, this.step);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2;
        int i11;
        if (this.step > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.first);
            sb2.append("..");
            sb2.append(this.last);
            sb2.append(" step ");
            i11 = this.step;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.first);
            sb2.append(" downTo ");
            sb2.append(this.last);
            sb2.append(" step ");
            i11 = -this.step;
        }
        sb2.append(i11);
        return sb2.toString();
    }

    public CharProgression(char c11, char c12, int i11) {
        if (i11 != 0) {
            if (i11 != Integer.MIN_VALUE) {
                this.first = c11;
                this.last = (char) ProgressionUtilKt.getProgressionLastElement((int) c11, (int) c12, i11);
                this.step = i11;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.first * 31) + this.last) * 31) + this.step;
    }
}
