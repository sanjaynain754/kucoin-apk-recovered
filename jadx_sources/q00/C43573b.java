package q00;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.thread.IKExecutor;
import com.kubi.sdk.thread.monitor.ExecutorTimerMonitor;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: q00.b */
/* JADX INFO: compiled from: ExecutorMonitorFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lq00/b;", "Lq00/d;", "", "enableWaitTime", "<init>", "(Z)V", "Lcom/kubi/sdk/thread/IKExecutor;", "executor", "Lq00/c;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/sdk/thread/IKExecutor;)Lq00/c;", "Z", "ThreadPoolMonitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C43573b implements InterfaceC43575d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean enableWaitTime;

    public C43573b(boolean z11) {
        this.enableWaitTime = z11;
    }

    public /* synthetic */ C43573b(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11);
    }

    @Override // q00.InterfaceC43575d
    @NotNull
    /* JADX INFO: renamed from: a */
    public InterfaceC43574c mo95852a(@NotNull IKExecutor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        ExecutorTimerMonitor executorTimerMonitor = new ExecutorTimerMonitor(executor, Intrinsics.areEqual(executor.getName(), IKExecutor.Companion.MAIN_NAME) ? 80L : 700L, this.enableWaitTime);
        C43572a.f96129a.m95848a(executor.getName(), executorTimerMonitor);
        return executorTimerMonitor;
    }
}
