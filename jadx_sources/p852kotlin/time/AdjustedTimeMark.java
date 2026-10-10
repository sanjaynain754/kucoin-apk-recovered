package p852kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\nJ\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u00020\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, m90084d2 = {"Lkotlin/time/AdjustedTimeMark;", "Lkotlin/time/TimeMark;", "mark", "adjustment", "Lkotlin/time/Duration;", "<init>", "(Lkotlin/time/TimeMark;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMark", "()Lkotlin/time/TimeMark;", "getAdjustment-UwyO8pc", "()J", "J", "elapsedNow", "elapsedNow-UwyO8pc", "plus", TypedValues.TransitionType.S_DURATION, "plus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
final class AdjustedTimeMark implements TimeMark {
    private final long adjustment;

    @NotNull
    private final TimeMark mark;

    public /* synthetic */ AdjustedTimeMark(TimeMark timeMark, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(timeMark, j11);
    }

    private AdjustedTimeMark(TimeMark mark, long j11) {
        Intrinsics.checkNotNullParameter(mark, "mark");
        this.mark = mark;
        this.adjustment = j11;
    }

    @Override // p852kotlin.time.TimeMark
    /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
    public long mo105177elapsedNowUwyO8pc() {
        return Duration.m105215minusLRDsOJo(this.mark.mo105177elapsedNowUwyO8pc(), this.adjustment);
    }

    /* JADX INFO: renamed from: getAdjustment-UwyO8pc, reason: not valid java name and from getter */
    public final long getAdjustment() {
        return this.adjustment;
    }

    @NotNull
    public final TimeMark getMark() {
        return this.mark;
    }

    @Override // p852kotlin.time.TimeMark
    @NotNull
    /* JADX INFO: renamed from: plus-LRDsOJo */
    public TimeMark mo105180plusLRDsOJo(long duration) {
        return new AdjustedTimeMark(this.mark, Duration.m105216plusLRDsOJo(this.adjustment, duration), null);
    }

    @Override // p852kotlin.time.TimeMark
    public boolean hasNotPassedNow() {
        return TimeMark.DefaultImpls.hasNotPassedNow(this);
    }

    @Override // p852kotlin.time.TimeMark
    public boolean hasPassedNow() {
        return TimeMark.DefaultImpls.hasPassedNow(this);
    }

    @Override // p852kotlin.time.TimeMark
    @NotNull
    /* JADX INFO: renamed from: minus-LRDsOJo */
    public TimeMark mo105178minusLRDsOJo(long j11) {
        return TimeMark.DefaultImpls.m105297minusLRDsOJo(this, j11);
    }
}
