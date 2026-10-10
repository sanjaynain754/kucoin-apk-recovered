package qg0;

import java.util.concurrent.Executor;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.AbstractC41710m1;
import og0.C43047b0;
import og0.C43051d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.EmptyCoroutineContext;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: qg0.a */
/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0014\u001a\u00060\u0005j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0014\u001a\u00060\u0005j\u0002`\u0013H\u0017¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m90084d2 = {"Lqg0/a;", "Lkotlinx/coroutines/m1;", "Ljava/util/concurrent/Executor;", "<init>", "()V", "Ljava/lang/Runnable;", "command", "", "execute", "(Ljava/lang/Runnable;)V", "", "parallelism", "", "name", "Lkotlinx/coroutines/j0;", "limitedParallelism", "(ILjava/lang/String;)Lkotlinx/coroutines/j0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/Runnable;", "block", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatchYield", "close", "toString", "()Ljava/lang/String;", "d", "Lkotlinx/coroutines/j0;", "default", "p", "()Ljava/util/concurrent/Executor;", "executor", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class ExecutorC43730a extends AbstractC41710m1 implements Executor {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final ExecutorC43730a f96679c = new ExecutorC43730a();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final AbstractC41697j0 default = AbstractC41697j0.limitedParallelism$default(C43739j.f96697b, C43051d0.m94568e("kotlinx.coroutines.io.parallelism", RangesKt.coerceAtLeast(64, C43047b0.m94538a()), 0, 0, 12, null), null, 2, null);

    @Override // kotlinx.coroutines.AbstractC41710m1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    public void dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
        default.dispatch(context, block);
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    public void dispatchYield(@NotNull CoroutineContext context, @NotNull Runnable block) {
        default.dispatchYield(context, block);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable command) {
        dispatch(EmptyCoroutineContext.INSTANCE, command);
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    @NotNull
    public AbstractC41697j0 limitedParallelism(int parallelism, @Nullable String name) {
        return C43739j.f96697b.limitedParallelism(parallelism, name);
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    @NotNull
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return "Dispatchers.IO";
    }

    @Override // kotlinx.coroutines.AbstractC41710m1
    @NotNull
    /* JADX INFO: renamed from: p */
    public Executor getExecutor() {
        return this;
    }
}
