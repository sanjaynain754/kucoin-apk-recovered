package p852kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.WasExperimental;
import p852kotlin.jvm.JvmInline;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes61.dex */
@SinceKotlin(version = "1.9")
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0007"}, m90084d2 = {"Lkotlin/time/TimeSource;", "", "markNow", "Lkotlin/time/TimeMark;", "WithComparableMarks", "Monotonic", "Companion", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
public interface TimeSource {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: TimeSource.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, m90084d2 = {"Lkotlin/time/TimeSource$Monotonic;", "Lkotlin/time/TimeSource$WithComparableMarks;", "<init>", "()V", "markNow", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "markNow-z9LOYto", "()J", "toString", "", "ValueTimeMark", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Monotonic implements WithComparableMarks {

        @NotNull
        public static final Monotonic INSTANCE = new Monotonic();

        /* JADX INFO: compiled from: TimeSource.kt */
        @SinceKotlin(version = "1.9")
        @Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u000eJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0014\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0080\u0004¢\u0006\u0004\n\u0002\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004¨\u0006$"}, m90084d2 = {"Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "Lkotlin/time/ComparableTimeMark;", "reading", "", "Lkotlin/time/ValueTimeMarkReading;", "constructor-impl", "(J)J", "J", "elapsedNow", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "plus", TypedValues.TransitionType.S_DURATION, "plus-LRDsOJo", "(JJ)J", "minus", "minus-LRDsOJo", "hasPassedNow", "", "hasPassedNow-impl", "(J)Z", "hasNotPassedNow", "hasNotPassedNow-impl", "other", "minus-UwyO8pc", "(JLkotlin/time/ComparableTimeMark;)J", "minus-6eNON_k", "compareTo", "", "compareTo-6eNON_k", "(JJ)I", "equals", "", "hashCode", "toString", "", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @JvmInline
        @WasExperimental(markerClass = {ExperimentalTime.class})
        public static final class ValueTimeMark implements ComparableTimeMark {
            private final long reading;

            @Override // p852kotlin.time.TimeMark
            /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
            public long mo105177elapsedNowUwyO8pc() {
                return m105304elapsedNowUwyO8pc(this.reading);
            }

            @Override // p852kotlin.time.ComparableTimeMark, p852kotlin.time.TimeMark
            /* JADX INFO: renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ ComparableTimeMark mo105178minusLRDsOJo(long j11) {
                return m105300boximpl(m105315minusLRDsOJo(j11));
            }

            @Override // p852kotlin.time.ComparableTimeMark
            /* JADX INFO: renamed from: minus-UwyO8pc */
            public long mo105179minusUwyO8pc(@NotNull ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return m105312minusUwyO8pc(this.reading, other);
            }

            @Override // p852kotlin.time.ComparableTimeMark, p852kotlin.time.TimeMark
            /* JADX INFO: renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ ComparableTimeMark mo105180plusLRDsOJo(long j11) {
                return m105300boximpl(m105316plusLRDsOJo(j11));
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ ValueTimeMark m105300boximpl(long j11) {
                return new ValueTimeMark(j11);
            }

            /* JADX INFO: renamed from: compareTo-impl, reason: not valid java name */
            public static int m105302compareToimpl(long j11, @NotNull ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return m105300boximpl(j11).compareTo(other);
            }

            /* JADX INFO: renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
            public static long m105304elapsedNowUwyO8pc(long j11) {
                return MonotonicTimeSource.INSTANCE.m105293elapsedFrom6eNON_k(j11);
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m105305equalsimpl(long j11, Object obj) {
                return (obj instanceof ValueTimeMark) && j11 == ((ValueTimeMark) obj).getReading();
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m105306equalsimpl0(long j11, long j12) {
                return j11 == j12;
            }

            /* JADX INFO: renamed from: minus-6eNON_k, reason: not valid java name */
            public static final long m105310minus6eNON_k(long j11, long j12) {
                return MonotonicTimeSource.INSTANCE.m105292differenceBetweenfRLX17w(j11, j12);
            }

            /* JADX INFO: renamed from: minus-UwyO8pc, reason: not valid java name */
            public static long m105312minusUwyO8pc(long j11, @NotNull ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                if (other instanceof ValueTimeMark) {
                    return m105310minus6eNON_k(j11, ((ValueTimeMark) other).getReading());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) m105314toStringimpl(j11)) + " and " + other);
            }

            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m105314toStringimpl(long j11) {
                return "ValueTimeMark(reading=" + j11 + ')';
            }

            @Override // java.lang.Comparable
            public int compareTo(@NotNull ComparableTimeMark comparableTimeMark) {
                return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
            }

            @Override // p852kotlin.time.ComparableTimeMark
            public boolean equals(Object other) {
                return m105305equalsimpl(this.reading, other);
            }

            @Override // p852kotlin.time.TimeMark
            public boolean hasNotPassedNow() {
                return m105307hasNotPassedNowimpl(this.reading);
            }

            @Override // p852kotlin.time.TimeMark
            public boolean hasPassedNow() {
                return m105308hasPassedNowimpl(this.reading);
            }

            @Override // p852kotlin.time.ComparableTimeMark
            public int hashCode() {
                return m105309hashCodeimpl(this.reading);
            }

            @Override // p852kotlin.time.TimeMark
            /* JADX INFO: renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ TimeMark mo105178minusLRDsOJo(long j11) {
                return m105300boximpl(m105315minusLRDsOJo(j11));
            }

            @Override // p852kotlin.time.TimeMark
            /* JADX INFO: renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ TimeMark mo105180plusLRDsOJo(long j11) {
                return m105300boximpl(m105316plusLRDsOJo(j11));
            }

            public String toString() {
                return m105314toStringimpl(this.reading);
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ long getReading() {
                return this.reading;
            }

            private /* synthetic */ ValueTimeMark(long j11) {
                this.reading = j11;
            }

            /* JADX INFO: renamed from: compareTo-6eNON_k, reason: not valid java name */
            public static final int m105301compareTo6eNON_k(long j11, long j12) {
                return Duration.m105186compareToLRDsOJo(m105310minus6eNON_k(j11, j12), Duration.INSTANCE.m105278getZEROUwyO8pc());
            }

            /* JADX INFO: renamed from: hasNotPassedNow-impl, reason: not valid java name */
            public static boolean m105307hasNotPassedNowimpl(long j11) {
                return Duration.m105213isNegativeimpl(m105304elapsedNowUwyO8pc(j11));
            }

            /* JADX INFO: renamed from: hasPassedNow-impl, reason: not valid java name */
            public static boolean m105308hasPassedNowimpl(long j11) {
                return !Duration.m105213isNegativeimpl(m105304elapsedNowUwyO8pc(j11));
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m105309hashCodeimpl(long j11) {
                return Long.hashCode(j11);
            }

            /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
            public long m105315minusLRDsOJo(long j11) {
                return m105311minusLRDsOJo(this.reading, j11);
            }

            /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
            public long m105316plusLRDsOJo(long j11) {
                return m105313plusLRDsOJo(this.reading, j11);
            }

            /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
            public static long m105311minusLRDsOJo(long j11, long j12) {
                return MonotonicTimeSource.INSTANCE.m105291adjustReading6QKq23U(j11, Duration.m105231unaryMinusUwyO8pc(j12));
            }

            /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
            public static long m105313plusLRDsOJo(long j11, long j12) {
                return MonotonicTimeSource.INSTANCE.m105291adjustReading6QKq23U(j11, j12);
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static long m105303constructorimpl(long j11) {
                return j11;
            }
        }

        @Override // kotlin.time.TimeSource.WithComparableMarks, p852kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ ComparableTimeMark markNow() {
            return ValueTimeMark.m105300boximpl(m105299markNowz9LOYto());
        }

        @Override // p852kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ TimeMark markNow() {
            return ValueTimeMark.m105300boximpl(m105299markNowz9LOYto());
        }

        /* JADX INFO: renamed from: markNow-z9LOYto, reason: not valid java name */
        public long m105299markNowz9LOYto() {
            return MonotonicTimeSource.INSTANCE.m105294markNowz9LOYto();
        }

        @NotNull
        public String toString() {
            return MonotonicTimeSource.INSTANCE.toString();
        }

        private Monotonic() {
        }
    }

    /* JADX INFO: compiled from: TimeSource.kt */
    @SinceKotlin(version = "1.9")
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m90084d2 = {"Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/TimeSource;", "markNow", "Lkotlin/time/ComparableTimeMark;", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public interface WithComparableMarks extends TimeSource {
        @Override // p852kotlin.time.TimeSource
        @NotNull
        ComparableTimeMark markNow();
    }

    @NotNull
    TimeMark markNow();

    /* JADX INFO: compiled from: TimeSource.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lkotlin/time/TimeSource$Companion;", "", "<init>", "()V", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
