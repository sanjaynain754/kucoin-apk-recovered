package p852kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.WasExperimental;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.math.MathKt;

/* JADX INFO: compiled from: TimeSources.kt */
/* JADX INFO: loaded from: classes61.dex */
@SinceKotlin(version = "1.9")
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH$J\b\u0010\u000f\u001a\u00020\tH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m90084d2 = {"Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "unit", "Lkotlin/time/DurationUnit;", "<init>", "(Lkotlin/time/DurationUnit;)V", "getUnit", "()Lkotlin/time/DurationUnit;", "read", "", "zero", "getZero", "()J", "zero$delegate", "Lkotlin/Lazy;", "adjustedRead", "markNow", "Lkotlin/time/ComparableTimeMark;", "LongTimeMark", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
public abstract class AbstractLongTimeSource implements TimeSource.WithComparableMarks {

    @NotNull
    private final DurationUnit unit;

    /* JADX INFO: renamed from: zero$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy zero;

    /* JADX INFO: compiled from: TimeSources.kt */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u001d"}, m90084d2 = {"Lkotlin/time/AbstractLongTimeSource$LongTimeMark;", "Lkotlin/time/ComparableTimeMark;", "startedAt", "", "timeSource", "Lkotlin/time/AbstractLongTimeSource;", TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlin/time/Duration;", "<init>", "(JLkotlin/time/AbstractLongTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "elapsedNow", "elapsedNow-UwyO8pc", "()J", "plus", TypedValues.TransitionType.S_DURATION, "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "minus", "other", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "equals", "", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,210:1\n80#2:211\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n*L\n67#1:211\n*E\n"})
    public static final class LongTimeMark implements ComparableTimeMark {
        private final long offset;
        private final long startedAt;

        @NotNull
        private final AbstractLongTimeSource timeSource;

        public /* synthetic */ LongTimeMark(long j11, AbstractLongTimeSource abstractLongTimeSource, long j12, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, abstractLongTimeSource, j12);
        }

        @Override // p852kotlin.time.TimeMark
        @NotNull
        /* JADX INFO: renamed from: minus-LRDsOJo */
        public ComparableTimeMark mo105178minusLRDsOJo(long j11) {
            return ComparableTimeMark.DefaultImpls.m105182minusLRDsOJo(this, j11);
        }

        private LongTimeMark(long j11, AbstractLongTimeSource timeSource, long j12) {
            Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.startedAt = j11;
            this.timeSource = timeSource;
            this.offset = j12;
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
        }

        @Override // p852kotlin.time.TimeMark
        /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
        public long mo105177elapsedNowUwyO8pc() {
            return Duration.m105215minusLRDsOJo(LongSaturatedMathKt.saturatingOriginsDiff(this.timeSource.adjustedRead(), this.startedAt, this.timeSource.getUnit()), this.offset);
        }

        @Override // p852kotlin.time.ComparableTimeMark
        public boolean equals(@Nullable Object other) {
            return (other instanceof LongTimeMark) && Intrinsics.areEqual(this.timeSource, ((LongTimeMark) other).timeSource) && Duration.m105192equalsimpl0(mo105179minusUwyO8pc((ComparableTimeMark) other), Duration.INSTANCE.m105278getZEROUwyO8pc());
        }

        @Override // p852kotlin.time.ComparableTimeMark
        public int hashCode() {
            return (Duration.m105208hashCodeimpl(this.offset) * 37) + Long.hashCode(this.startedAt);
        }

        @Override // p852kotlin.time.ComparableTimeMark
        /* JADX INFO: renamed from: minus-UwyO8pc */
        public long mo105179minusUwyO8pc(@NotNull ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof LongTimeMark) {
                LongTimeMark longTimeMark = (LongTimeMark) other;
                if (Intrinsics.areEqual(this.timeSource, longTimeMark.timeSource)) {
                    return Duration.m105216plusLRDsOJo(LongSaturatedMathKt.saturatingOriginsDiff(this.startedAt, longTimeMark.startedAt, this.timeSource.getUnit()), Duration.m105215minusLRDsOJo(this.offset, longTimeMark.offset));
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @Override // p852kotlin.time.TimeMark
        @NotNull
        /* JADX INFO: renamed from: plus-LRDsOJo */
        public ComparableTimeMark mo105180plusLRDsOJo(long duration) {
            DurationUnit unit = this.timeSource.getUnit();
            if (Duration.m105212isInfiniteimpl(duration)) {
                return new LongTimeMark(LongSaturatedMathKt.m105289saturatingAddNuflL3o(this.startedAt, unit, duration), this.timeSource, Duration.INSTANCE.m105278getZEROUwyO8pc(), null);
            }
            long jM105230truncateToUwyO8pc$kotlin_stdlib = Duration.m105230truncateToUwyO8pc$kotlin_stdlib(duration, unit);
            long jM105216plusLRDsOJo = Duration.m105216plusLRDsOJo(Duration.m105215minusLRDsOJo(duration, jM105230truncateToUwyO8pc$kotlin_stdlib), this.offset);
            long jM105289saturatingAddNuflL3o = LongSaturatedMathKt.m105289saturatingAddNuflL3o(this.startedAt, unit, jM105230truncateToUwyO8pc$kotlin_stdlib);
            long jM105230truncateToUwyO8pc$kotlin_stdlib2 = Duration.m105230truncateToUwyO8pc$kotlin_stdlib(jM105216plusLRDsOJo, unit);
            long jM105289saturatingAddNuflL3o2 = LongSaturatedMathKt.m105289saturatingAddNuflL3o(jM105289saturatingAddNuflL3o, unit, jM105230truncateToUwyO8pc$kotlin_stdlib2);
            long jM105215minusLRDsOJo = Duration.m105215minusLRDsOJo(jM105216plusLRDsOJo, jM105230truncateToUwyO8pc$kotlin_stdlib2);
            long jM105200getInWholeNanosecondsimpl = Duration.m105200getInWholeNanosecondsimpl(jM105215minusLRDsOJo);
            if (jM105289saturatingAddNuflL3o2 != 0 && jM105200getInWholeNanosecondsimpl != 0 && (jM105289saturatingAddNuflL3o2 ^ jM105200getInWholeNanosecondsimpl) < 0) {
                long duration2 = DurationKt.toDuration(MathKt.getSign(jM105200getInWholeNanosecondsimpl), unit);
                jM105289saturatingAddNuflL3o2 = LongSaturatedMathKt.m105289saturatingAddNuflL3o(jM105289saturatingAddNuflL3o2, unit, duration2);
                jM105215minusLRDsOJo = Duration.m105215minusLRDsOJo(jM105215minusLRDsOJo, duration2);
            }
            if ((1 | (jM105289saturatingAddNuflL3o2 - 1)) == Long.MAX_VALUE) {
                jM105215minusLRDsOJo = Duration.INSTANCE.m105278getZEROUwyO8pc();
            }
            return new LongTimeMark(jM105289saturatingAddNuflL3o2, this.timeSource, jM105215minusLRDsOJo, null);
        }

        @NotNull
        public String toString() {
            return "LongTimeMark(" + this.startedAt + DurationUnitKt__DurationUnitKt.shortName(this.timeSource.getUnit()) + " + " + ((Object) Duration.m105227toStringimpl(this.offset)) + ", " + this.timeSource + ')';
        }

        @Override // p852kotlin.time.TimeMark
        public boolean hasNotPassedNow() {
            return ComparableTimeMark.DefaultImpls.hasNotPassedNow(this);
        }

        @Override // p852kotlin.time.TimeMark
        public boolean hasPassedNow() {
            return ComparableTimeMark.DefaultImpls.hasPassedNow(this);
        }
    }

    public abstract long read();

    private final long getZero() {
        return ((Number) this.zero.getValue()).longValue();
    }

    @NotNull
    public final DurationUnit getUnit() {
        return this.unit;
    }

    @Override // p852kotlin.time.TimeSource
    @NotNull
    public ComparableTimeMark markNow() {
        return new LongTimeMark(adjustedRead(), this, Duration.INSTANCE.m105278getZEROUwyO8pc(), null);
    }

    public AbstractLongTimeSource(@NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.unit = unit;
        this.zero = LazyKt.lazy(new Function0() { // from class: kotlin.time.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(this.f91420b.read());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long adjustedRead() {
        return read() - getZero();
    }
}
