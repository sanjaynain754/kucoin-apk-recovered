package p852kotlin.ranges;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.ExperimentalStdlibApi;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.WasExperimental;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PrimitiveRanges.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001bB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\u0013\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\f\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\n¨\u0006\u001c"}, m90084d2 = {"Lkotlin/ranges/CharRange;", "Lkotlin/ranges/CharProgression;", "Lkotlin/ranges/ClosedRange;", "", "Lkotlin/ranges/OpenEndRange;", "start", "endInclusive", "<init>", "(CC)V", "getStart", "()Ljava/lang/Character;", "getEndInclusive", "endExclusive", "getEndExclusive$annotations", "()V", "getEndExclusive", "contains", "", "value", "isEmpty", "equals", "other", "", "hashCode", "", "toString", "", "Companion", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CharRange extends CharProgression implements ClosedRange<Character>, OpenEndRange<Character> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final CharRange EMPTY = new CharRange(1, 0);

    /* JADX INFO: compiled from: PrimitiveRanges.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lkotlin/ranges/CharRange$Companion;", "", "<init>", "()V", "EMPTY", "Lkotlin/ranges/CharRange;", "getEMPTY", "()Lkotlin/ranges/CharRange;", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final CharRange getEMPTY() {
            return CharRange.EMPTY;
        }
    }

    public CharRange(char c11, char c12) {
        super(c11, c12, 1);
    }

    @Override // p852kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Character) comparable).charValue());
    }

    public boolean contains(char value) {
        return Intrinsics.compare((int) getFirst(), (int) value) <= 0 && Intrinsics.compare((int) value, (int) getLast()) <= 0;
    }

    @Override // p852kotlin.ranges.CharProgression
    public boolean equals(@Nullable Object other) {
        if (!(other instanceof CharRange)) {
            return false;
        }
        if (isEmpty() && ((CharRange) other).isEmpty()) {
            return true;
        }
        CharRange charRange = (CharRange) other;
        return getFirst() == charRange.getFirst() && getLast() == charRange.getLast();
    }

    @Override // p852kotlin.ranges.OpenEndRange
    @NotNull
    public Character getEndExclusive() {
        if (getLast() != 65535) {
            return Character.valueOf((char) (getLast() + 1));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    @Override // p852kotlin.ranges.ClosedRange
    @NotNull
    public Character getEndInclusive() {
        return Character.valueOf(getLast());
    }

    @Override // p852kotlin.ranges.ClosedRange
    @NotNull
    public Character getStart() {
        return Character.valueOf(getFirst());
    }

    @Override // p852kotlin.ranges.CharProgression
    @NotNull
    public String toString() {
        return getFirst() + ".." + getLast();
    }

    @Override // p852kotlin.ranges.CharProgression
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getFirst() * 31) + getLast();
    }

    @Override // p852kotlin.ranges.CharProgression, p852kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        if (Intrinsics.compare((int) getFirst(), (int) getLast()) > 0) {
            return true;
        }
        return false;
    }

    @Deprecated(message = "Can throw an exception when it's impossible to represent the value with Char type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static /* synthetic */ void getEndExclusive$annotations() {
    }
}
