package kotlinx.coroutines;

import java.util.concurrent.Executor;
import og0.C43060i;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.coroutines.EmptyCoroutineContext;
import p852kotlin.jvm.JvmField;

/* JADX INFO: renamed from: kotlinx.coroutines.y0 */
/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lkotlinx/coroutines/y0;", "Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/j0;", "dispatcher", "<init>", "(Lkotlinx/coroutines/j0;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "execute", "(Ljava/lang/Runnable;)V", "", "toString", "()Ljava/lang/String;", "b", "Lkotlinx/coroutines/j0;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class ExecutorC41778y0 implements Executor {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final AbstractC41697j0 dispatcher;

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable block) {
        AbstractC41697j0 abstractC41697j0 = this.dispatcher;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        if (C43060i.m94594d(abstractC41697j0, emptyCoroutineContext)) {
            C43060i.m94593c(this.dispatcher, emptyCoroutineContext, block);
        } else {
            block.run();
        }
    }

    @NotNull
    public String toString() {
        return this.dispatcher.getName();
    }

    public ExecutorC41778y0(@NotNull AbstractC41697j0 abstractC41697j0) {
        this.dispatcher = abstractC41697j0;
    }
}
