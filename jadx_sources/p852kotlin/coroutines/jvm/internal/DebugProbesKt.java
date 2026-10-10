package p852kotlin.coroutines.jvm.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  classes23.dex
  kucoin.apk:DebugProbesKt.bin
 */
/* JADX INFO: compiled from: DebugProbes.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0001\u001a\u0014\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0001\u001a\u0014\u0010\u0007\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0001¨\u0006\b"}, m90084d2 = {"probeCoroutineCreated", "Lkotlin/coroutines/Continuation;", ExifInterface.GPS_DIRECTION_TRUE, "completion", "probeCoroutineResumed", "", TypedValues.AttributesType.S_FRAME, "probeCoroutineSuspended", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DebugProbesKt {
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <T> Continuation<T> probeCoroutineCreated(@NotNull Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        return completion;
    }

    @SinceKotlin(version = "1.3")
    public static final void probeCoroutineResumed(@NotNull Continuation<?> frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
    }

    @SinceKotlin(version = "1.3")
    public static final void probeCoroutineSuspended(@NotNull Continuation<?> frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
    }
}
