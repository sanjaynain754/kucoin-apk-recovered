package jumio.core;

import com.jumio.commons.camera.renderer.executor.DirectExecutor$Companion;
import java.util.concurrent.Executor;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.U0 */
/* JADX INFO: loaded from: classes61.dex */
public final class ExecutorC40601U0 implements Executor {

    /* JADX INFO: renamed from: a */
    public static final DirectExecutor$Companion f90129a = new DirectExecutor$Companion(null);

    /* JADX INFO: renamed from: b */
    public static volatile ExecutorC40601U0 f90130b;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        command.run();
    }
}
