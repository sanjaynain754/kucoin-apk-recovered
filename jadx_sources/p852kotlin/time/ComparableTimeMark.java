package p852kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.WasExperimental;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes61.dex */
@SinceKotlin(version = "1.9")
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0000H¦\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\u0011H¦\u0002J\b\u0010\u0012\u001a\u00020\u000eH&¨\u0006\u0013"}, m90084d2 = {"Lkotlin/time/ComparableTimeMark;", "Lkotlin/time/TimeMark;", "", "plus", TypedValues.TransitionType.S_DURATION, "Lkotlin/time/Duration;", "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "minus", "minus-LRDsOJo", "other", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "compareTo", "", "equals", "", "", "hashCode", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
public interface ComparableTimeMark extends TimeMark, Comparable<ComparableTimeMark> {

    /* JADX INFO: compiled from: TimeSource.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class DefaultImpls {
        public static int compareTo(@NotNull ComparableTimeMark comparableTimeMark, @NotNull ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return Duration.m105186compareToLRDsOJo(comparableTimeMark.mo105179minusUwyO8pc(other), Duration.INSTANCE.m105278getZEROUwyO8pc());
        }

        public static boolean hasNotPassedNow(@NotNull ComparableTimeMark comparableTimeMark) {
            return TimeMark.DefaultImpls.hasNotPassedNow(comparableTimeMark);
        }

        public static boolean hasPassedNow(@NotNull ComparableTimeMark comparableTimeMark) {
            return TimeMark.DefaultImpls.hasPassedNow(comparableTimeMark);
        }

        @NotNull
        /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
        public static ComparableTimeMark m105182minusLRDsOJo(@NotNull ComparableTimeMark comparableTimeMark, long j11) {
            return comparableTimeMark.mo105180plusLRDsOJo(Duration.m105231unaryMinusUwyO8pc(j11));
        }
    }

    int compareTo(@NotNull ComparableTimeMark other);

    boolean equals(@Nullable Object other);

    int hashCode();

    @Override // p852kotlin.time.TimeMark
    @NotNull
    /* JADX INFO: renamed from: minus-LRDsOJo */
    ComparableTimeMark mo105178minusLRDsOJo(long duration);

    /* JADX INFO: renamed from: minus-UwyO8pc */
    long mo105179minusUwyO8pc(@NotNull ComparableTimeMark other);

    @Override // p852kotlin.time.TimeMark
    @NotNull
    /* JADX INFO: renamed from: plus-LRDsOJo */
    ComparableTimeMark mo105180plusLRDsOJo(long duration);
}
