package p852kotlin.time;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Clocks.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"asClock", "Lkotlin/time/Clock;", "Lkotlin/time/TimeSource;", "origin", "Lkotlin/time/Instant;", "fromTimeSource", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ClocksKt {
    @SinceKotlin(version = "2.2")
    @JvmName(name = "fromTimeSource")
    @NotNull
    @ExperimentalTime
    public static final Clock fromTimeSource(@NotNull final TimeSource timeSource, @NotNull final Instant origin) {
        Intrinsics.checkNotNullParameter(timeSource, "<this>");
        Intrinsics.checkNotNullParameter(origin, "origin");
        return new Clock(timeSource, origin) { // from class: kotlin.time.ClocksKt$asClock$1
            final /* synthetic */ Instant $origin;
            private final TimeMark startMark;

            {
                this.$origin = origin;
                this.startMark = timeSource.markNow();
            }

            @Override // p852kotlin.time.Clock
            public Instant now() {
                return this.$origin.m105287plusLRDsOJo(this.startMark.mo105177elapsedNowUwyO8pc());
            }
        };
    }
}
