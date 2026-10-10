package p852kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: longSaturatedMath.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\b\u001a\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0001H\u0080\b¨\u0006\u001d"}, m90084d2 = {"saturatingAdd", "", "value", "unit", "Lkotlin/time/DurationUnit;", TypedValues.TransitionType.S_DURATION, "Lkotlin/time/Duration;", "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "checkInfiniteSumDefined", "durationInUnit", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "saturatingAddInHalves", "saturatingAddInHalves-NuflL3o", "infinityOfSign", "(J)J", "saturatingDiff", "valueNs", "origin", "(JJLkotlin/time/DurationUnit;)J", "saturatingOriginsDiff", "origin1", "origin2", "saturatingFiniteDiff", "value1", "value2", "isSaturated", "", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
public final class LongSaturatedMathKt {
    /* JADX INFO: renamed from: saturatingAddInHalves-NuflL3o, reason: not valid java name */
    private static final long m105290saturatingAddInHalvesNuflL3o(long j11, DurationUnit durationUnit, long j12) {
        long jM105190divUwyO8pc = Duration.m105190divUwyO8pc(j12, 2);
        long jM105226toLongimpl = Duration.m105226toLongimpl(jM105190divUwyO8pc, durationUnit);
        return (1 | (jM105226toLongimpl - 1)) == Long.MAX_VALUE ? jM105226toLongimpl : m105289saturatingAddNuflL3o(m105289saturatingAddNuflL3o(j11, durationUnit, jM105190divUwyO8pc), durationUnit, Duration.m105215minusLRDsOJo(j12, jM105190divUwyO8pc));
    }

    private static final long infinityOfSign(long j11) {
        return j11 < 0 ? Duration.INSTANCE.m105277getNEG_INFINITEUwyO8pc$kotlin_stdlib() : Duration.INSTANCE.m105276getINFINITEUwyO8pc();
    }

    public static final boolean isSaturated(long j11) {
        return ((j11 - 1) | 1) == Long.MAX_VALUE;
    }

    private static final long saturatingFiniteDiff(long j11, long j12, DurationUnit durationUnit) {
        long j13 = j11 - j12;
        if (((j13 ^ j11) & (~(j13 ^ j12))) >= 0) {
            return DurationKt.toDuration(j13, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return Duration.m105231unaryMinusUwyO8pc(infinityOfSign(j13));
        }
        long jConvertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, durationUnit2, durationUnit);
        long j14 = (j11 / jConvertDurationUnit) - (j12 / jConvertDurationUnit);
        long j15 = (j11 % jConvertDurationUnit) - (j12 % jConvertDurationUnit);
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m105216plusLRDsOJo(DurationKt.toDuration(j14, durationUnit2), DurationKt.toDuration(j15, durationUnit));
    }

    /* JADX INFO: renamed from: checkInfiniteSumDefined-PjuGub4, reason: not valid java name */
    private static final long m105288checkInfiniteSumDefinedPjuGub4(long j11, long j12, long j13) {
        if (Duration.m105212isInfiniteimpl(j12) && (j11 ^ j13) < 0) {
            throw new IllegalArgumentException("Summing infinities of different signs");
        }
        return j11;
    }

    /* JADX INFO: renamed from: saturatingAdd-NuflL3o, reason: not valid java name */
    public static final long m105289saturatingAddNuflL3o(long j11, @NotNull DurationUnit unit, long j12) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        long jM105226toLongimpl = Duration.m105226toLongimpl(j12, unit);
        if (((j11 - 1) | 1) == Long.MAX_VALUE) {
            return m105288checkInfiniteSumDefinedPjuGub4(j11, j12, jM105226toLongimpl);
        }
        if (((jM105226toLongimpl - 1) | 1) == Long.MAX_VALUE) {
            return m105290saturatingAddInHalvesNuflL3o(j11, unit, j12);
        }
        long j13 = j11 + jM105226toLongimpl;
        if (((j11 ^ j13) & (jM105226toLongimpl ^ j13)) < 0) {
            if (j11 >= 0) {
                return Long.MAX_VALUE;
            }
            return Long.MIN_VALUE;
        }
        return j13;
    }

    public static final long saturatingDiff(long j11, long j12, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if ((1 | (j12 - 1)) == Long.MAX_VALUE) {
            return Duration.m105231unaryMinusUwyO8pc(infinityOfSign(j12));
        }
        return saturatingFiniteDiff(j11, j12, unit);
    }

    public static final long saturatingOriginsDiff(long j11, long j12, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (((j12 - 1) | 1) == Long.MAX_VALUE) {
            if (j11 == j12) {
                return Duration.INSTANCE.m105278getZEROUwyO8pc();
            }
            return Duration.m105231unaryMinusUwyO8pc(infinityOfSign(j12));
        }
        if ((1 | (j11 - 1)) == Long.MAX_VALUE) {
            return infinityOfSign(j11);
        }
        return saturatingFiniteDiff(j11, j12, unit);
    }
}
