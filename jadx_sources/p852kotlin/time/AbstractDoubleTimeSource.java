package p852kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TimeSources.kt */
/* JADX INFO: loaded from: classes61.dex */
@SinceKotlin(version = "1.3")
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH$J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m90084d2 = {"Lkotlin/time/AbstractDoubleTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "unit", "Lkotlin/time/DurationUnit;", "<init>", "(Lkotlin/time/DurationUnit;)V", "getUnit", "()Lkotlin/time/DurationUnit;", "read", "", "markNow", "Lkotlin/time/ComparableTimeMark;", "DoubleTimeMark", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@Deprecated(level = DeprecationLevel.ERROR, message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
@ExperimentalTime
public abstract class AbstractDoubleTimeSource implements TimeSource.WithComparableMarks {

    @NotNull
    private final DurationUnit unit;

    /* JADX INFO: compiled from: TimeSources.kt */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u001d"}, m90084d2 = {"Lkotlin/time/AbstractDoubleTimeSource$DoubleTimeMark;", "Lkotlin/time/ComparableTimeMark;", "startedAt", "", "timeSource", "Lkotlin/time/AbstractDoubleTimeSource;", TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlin/time/Duration;", "<init>", "(DLkotlin/time/AbstractDoubleTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "elapsedNow", "elapsedNow-UwyO8pc", "()J", "plus", TypedValues.TransitionType.S_DURATION, "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "minus", "other", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "equals", "", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class DoubleTimeMark implements ComparableTimeMark {
        private final long offset;
        private final double startedAt;

        @NotNull
        private final AbstractDoubleTimeSource timeSource;

        public /* synthetic */ DoubleTimeMark(double d11, AbstractDoubleTimeSource abstractDoubleTimeSource, long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this(d11, abstractDoubleTimeSource, j11);
        }

        @Override // p852kotlin.time.TimeMark
        @NotNull
        /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
        public ComparableTimeMark mo105178minusLRDsOJo(long j11) {
            return ComparableTimeMark.DefaultImpls.m105182minusLRDsOJo(this, j11);
        }

        private DoubleTimeMark(double d11, AbstractDoubleTimeSource timeSource, long j11) {
            Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.startedAt = d11;
            this.timeSource = timeSource;
            this.offset = j11;
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
        }

        @Override // p852kotlin.time.TimeMark
        /* JADX INFO: renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
        public long mo105177elapsedNowUwyO8pc() {
            return Duration.m105215minusLRDsOJo(DurationKt.toDuration(this.timeSource.read() - this.startedAt, this.timeSource.getUnit()), this.offset);
        }

        @Override // p852kotlin.time.ComparableTimeMark
        public boolean equals(@Nullable Object other) {
            return (other instanceof DoubleTimeMark) && Intrinsics.areEqual(this.timeSource, ((DoubleTimeMark) other).timeSource) && Duration.m105192equalsimpl0(mo105179minusUwyO8pc((ComparableTimeMark) other), Duration.INSTANCE.m105278getZEROUwyO8pc());
        }

        @Override // p852kotlin.time.ComparableTimeMark
        public int hashCode() {
            return Duration.m105208hashCodeimpl(Duration.m105216plusLRDsOJo(DurationKt.toDuration(this.startedAt, this.timeSource.getUnit()), this.offset));
        }

        @Override // p852kotlin.time.ComparableTimeMark
        /* JADX INFO: renamed from: minus-UwyO8pc, reason: not valid java name */
        public long mo105179minusUwyO8pc(@NotNull ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof DoubleTimeMark) {
                DoubleTimeMark doubleTimeMark = (DoubleTimeMark) other;
                if (Intrinsics.areEqual(this.timeSource, doubleTimeMark.timeSource)) {
                    if (Duration.m105192equalsimpl0(this.offset, doubleTimeMark.offset) && Duration.m105212isInfiniteimpl(this.offset)) {
                        return Duration.INSTANCE.m105278getZEROUwyO8pc();
                    }
                    long jM105215minusLRDsOJo = Duration.m105215minusLRDsOJo(this.offset, doubleTimeMark.offset);
                    long duration = DurationKt.toDuration(this.startedAt - doubleTimeMark.startedAt, this.timeSource.getUnit());
                    return Duration.m105192equalsimpl0(duration, Duration.m105231unaryMinusUwyO8pc(jM105215minusLRDsOJo)) ? Duration.INSTANCE.m105278getZEROUwyO8pc() : Duration.m105216plusLRDsOJo(duration, jM105215minusLRDsOJo);
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @Override // p852kotlin.time.TimeMark
        @NotNull
        /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
        public ComparableTimeMark mo105180plusLRDsOJo(long duration) {
            return new DoubleTimeMark(this.startedAt, this.timeSource, Duration.m105216plusLRDsOJo(this.offset, duration), null);
        }

        @NotNull
        public String toString() {
            return "DoubleTimeMark(" + this.startedAt + DurationUnitKt__DurationUnitKt.shortName(this.timeSource.getUnit()) + " + " + ((Object) Duration.m105227toStringimpl(this.offset)) + ", " + this.timeSource + ')';
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

    public abstract double read();

    @NotNull
    public final DurationUnit getUnit() {
        return this.unit;
    }

    @Override // p852kotlin.time.TimeSource
    @NotNull
    public ComparableTimeMark markNow() {
        return new DoubleTimeMark(read(), this, Duration.INSTANCE.m105278getZEROUwyO8pc(), null);
    }

    public AbstractDoubleTimeSource(@NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.unit = unit;
    }
}
