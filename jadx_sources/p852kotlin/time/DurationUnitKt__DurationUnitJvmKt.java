package p852kotlin.time;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.SinceKotlin;
import p852kotlin.WasExperimental;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DurationUnitJvm.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0007\u001a \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0001\u001a \u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0001\u001a \u0010\u0004\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0001¨\u0006\u000b"}, m90084d2 = {"toTimeUnit", "Ljava/util/concurrent/TimeUnit;", "Lkotlin/time/DurationUnit;", "toDurationUnit", "convertDurationUnit", "", "value", "sourceUnit", "targetUnit", "convertDurationUnitOverflow", "", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/time/DurationUnitKt")
class DurationUnitKt__DurationUnitJvmKt {
    @SinceKotlin(version = "1.3")
    public static final double convertDurationUnit(double d11, @NotNull DurationUnit sourceUnit, @NotNull DurationUnit targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        long jConvert = targetUnit.getTimeUnit().convert(1L, sourceUnit.getTimeUnit());
        return jConvert > 0 ? d11 * jConvert : d11 / sourceUnit.getTimeUnit().convert(1L, targetUnit.getTimeUnit());
    }

    /* JADX INFO: compiled from: DurationUnitJvm.kt */
    /* JADX INFO: loaded from: classes61.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    @NotNull
    public static final DurationUnit toDurationUnit(@NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[timeUnit.ordinal()]) {
            case 1:
                return DurationUnit.NANOSECONDS;
            case 2:
                return DurationUnit.MICROSECONDS;
            case 3:
                return DurationUnit.MILLISECONDS;
            case 4:
                return DurationUnit.SECONDS;
            case 5:
                return DurationUnit.MINUTES;
            case 6:
                return DurationUnit.HOURS;
            case 7:
                return DurationUnit.DAYS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    @NotNull
    public static final TimeUnit toTimeUnit(@NotNull DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "<this>");
        return durationUnit.getTimeUnit();
    }

    @SinceKotlin(version = "1.5")
    public static final long convertDurationUnit(long j11, @NotNull DurationUnit sourceUnit, @NotNull DurationUnit targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit().convert(j11, sourceUnit.getTimeUnit());
    }

    @SinceKotlin(version = "1.5")
    public static final long convertDurationUnitOverflow(long j11, @NotNull DurationUnit sourceUnit, @NotNull DurationUnit targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.getTimeUnit().convert(j11, sourceUnit.getTimeUnit());
    }
}
