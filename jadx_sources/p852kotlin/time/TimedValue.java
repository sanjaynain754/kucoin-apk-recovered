package p852kotlin.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.WasExperimental;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: measureTime.kt */
/* JADX INFO: loaded from: classes61.dex */
@SinceKotlin(version = "1.9")
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000e\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, m90084d2 = {"Lkotlin/time/TimedValue;", ExifInterface.GPS_DIRECTION_TRUE, "", "value", TypedValues.TransitionType.S_DURATION, "Lkotlin/time/Duration;", "<init>", "(Ljava/lang/Object;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getDuration-UwyO8pc", "()J", "J", "component1", "component2", "component2-UwyO8pc", "copy", "copy-RFiDyg4", "(Ljava/lang/Object;J)Lkotlin/time/TimedValue;", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
public final /* data */ class TimedValue<T> {
    private final long duration;
    private final T value;

    public /* synthetic */ TimedValue(Object obj, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, j11);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimedValue)) {
            return false;
        }
        TimedValue timedValue = (TimedValue) other;
        return Intrinsics.areEqual(this.value, timedValue.value) && Duration.m105192equalsimpl0(this.duration, timedValue.duration);
    }

    private TimedValue(T t11, long j11) {
        this.value = t11;
        this.duration = j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-RFiDyg4$default, reason: not valid java name */
    public static /* synthetic */ TimedValue m105318copyRFiDyg4$default(TimedValue timedValue, Object obj, long j11, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = timedValue.value;
        }
        if ((i11 & 2) != 0) {
            j11 = timedValue.duration;
        }
        return timedValue.m105320copyRFiDyg4(obj, j11);
    }

    public final T component1() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2-UwyO8pc, reason: not valid java name and from getter */
    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-RFiDyg4, reason: not valid java name */
    public final TimedValue<T> m105320copyRFiDyg4(T value, long duration) {
        return new TimedValue<>(value, duration, null);
    }

    /* JADX INFO: renamed from: getDuration-UwyO8pc, reason: not valid java name */
    public final long m105321getDurationUwyO8pc() {
        return this.duration;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        T t11 = this.value;
        return ((t11 == null ? 0 : t11.hashCode()) * 31) + Duration.m105208hashCodeimpl(this.duration);
    }

    @NotNull
    public String toString() {
        return "TimedValue(value=" + this.value + ", duration=" + ((Object) Duration.m105227toStringimpl(this.duration)) + ')';
    }
}
