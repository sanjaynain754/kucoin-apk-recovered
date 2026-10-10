package qg0;

import java.util.concurrent.Executor;
import kotlinx.coroutines.AbstractC41710m1;
import kotlinx.coroutines.scheduling.CoroutineScheduler;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: qg0.e */
/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J/\u0010\u0017\u001a\u00020\u00102\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\n\u0010\f\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, m90084d2 = {"Lqg0/e;", "Lkotlinx/coroutines/m1;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatchYield", "", "Lkotlinx/coroutines/scheduling/TaskContext;", "fair", "L", "(Ljava/lang/Runnable;ZZ)V", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "q", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "c", "I", "d", "e", "J", "f", "Ljava/lang/String;", "g", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "coroutineScheduler", "Ljava/util/concurrent/Executor;", "p", "()Ljava/util/concurrent/Executor;", "executor", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public class C43734e extends AbstractC41710m1 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int corePoolSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int maxPoolSize;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final long idleWorkerKeepAliveNs;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String schedulerName;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public CoroutineScheduler coroutineScheduler = m96343q();

    /* JADX INFO: renamed from: L */
    public final void m96342L(@NotNull Runnable block, boolean context, boolean fair) {
        this.coroutineScheduler.m91232j(block, context, fair);
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    public void dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
        CoroutineScheduler.m91221k(this.coroutineScheduler, block, false, false, 6, null);
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    public void dispatchYield(@NotNull CoroutineContext context, @NotNull Runnable block) {
        CoroutineScheduler.m91221k(this.coroutineScheduler, block, false, true, 2, null);
    }

    @Override // kotlinx.coroutines.AbstractC41710m1
    @NotNull
    /* JADX INFO: renamed from: p */
    public Executor mo91122p() {
        return this.coroutineScheduler;
    }

    /* JADX INFO: renamed from: q */
    public final CoroutineScheduler m96343q() {
        return new CoroutineScheduler(this.corePoolSize, this.maxPoolSize, this.idleWorkerKeepAliveNs, this.schedulerName);
    }

    public C43734e(int i11, int i12, long j11, @NotNull String str) {
        this.corePoolSize = i11;
        this.maxPoolSize = i12;
        this.idleWorkerKeepAliveNs = j11;
        this.schedulerName = str;
    }
}
