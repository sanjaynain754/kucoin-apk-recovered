package p852kotlin.time;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.internal.PlatformImplementationsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InstantJvm.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\b\u0010\u0004\u001a\u00020\u0005H\u0001\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0001\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006\t"}, m90084d2 = {"systemClock", "Lkotlin/time/Clock;", "getSystemClock$annotations", "()V", "systemClockNow", "Lkotlin/time/Instant;", "serializedInstant", "", "instant", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class InstantJvmKt {

    @NotNull
    private static final Clock systemClock = PlatformImplementationsKt.IMPLEMENTATIONS.getSystemClock();

    @ExperimentalTime
    @NotNull
    public static final Object serializedInstant(@NotNull Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "instant");
        return new InstantSerialized(instant.getEpochSeconds(), instant.getNanosecondsOfSecond());
    }

    @ExperimentalTime
    @NotNull
    public static final Instant systemClockNow() {
        return systemClock.now();
    }

    @ExperimentalTime
    private static /* synthetic */ void getSystemClock$annotations() {
    }
}
