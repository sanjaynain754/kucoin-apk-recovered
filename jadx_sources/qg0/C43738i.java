package qg0;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.TimeUnit;
import og0.C43047b0;
import og0.C43051d0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: qg0.i */
/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u000b\u001a\u00020\n*\u00060\u0006j\u0002`\u00072\u0006\u0010\t\u001a\u00020\b2\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u000f\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u00128\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00128\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013\"\u0014\u0010\u0018\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010\"\u0016\u0010\u001c\u001a\u00020\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b*\f\b\u0000\u0010\u001d\"\u00020\u00002\u00020\u0000¨\u0006\u001e"}, m90084d2 = {"", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "", "c", "(Z)Ljava/lang/String;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "submissionTime", "Lqg0/g;", "b", "(Ljava/lang/Runnable;JZ)Lqg0/g;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "DEFAULT_SCHEDULER_NAME", "J", "WORK_STEALING_TIME_RESOLUTION_NS", "", "I", "CORE_POOL_SIZE", "d", "MAX_POOL_SIZE", "e", "IDLE_WORKER_KEEP_ALIVE_NS", "Lqg0/f;", "f", "Lqg0/f;", "schedulerTimeSource", "TaskContext", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C43738i {

    /* JADX INFO: renamed from: a */
    @JvmField
    @NotNull
    public static final String f96691a = C43047b0.m94542e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* JADX INFO: renamed from: b */
    @JvmField
    public static final long f96692b = C43051d0.m94569f("kotlinx.coroutines.scheduler.resolution.ns", SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, 0, 0, 12, null);

    /* JADX INFO: renamed from: c */
    @JvmField
    public static final int f96693c = C43051d0.m94568e("kotlinx.coroutines.scheduler.core.pool.size", RangesKt.coerceAtLeast(C43047b0.m94538a(), 2), 1, 0, 8, null);

    /* JADX INFO: renamed from: d */
    @JvmField
    public static final int f96694d = C43051d0.m94568e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);

    /* JADX INFO: renamed from: e */
    @JvmField
    public static final long f96695e = TimeUnit.SECONDS.toNanos(C43051d0.m94569f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* JADX INFO: renamed from: f */
    @JvmField
    @NotNull
    public static AbstractC43735f f96696f = C43733d.f96682a;

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final AbstractRunnableC43736g m96345b(@NotNull Runnable runnable, long j11, boolean z11) {
        return new C43737h(runnable, j11, z11);
    }

    /* JADX INFO: renamed from: c */
    public static final String m96346c(boolean z11) {
        return z11 ? "Blocking" : "Non-blocking";
    }
}
