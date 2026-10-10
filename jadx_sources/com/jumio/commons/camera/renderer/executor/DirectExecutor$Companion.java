package com.jumio.commons.camera.renderer.executor;

import java.util.concurrent.Executor;
import jumio.core.ExecutorC40601U0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/jumio/commons/camera/renderer/executor/DirectExecutor$Companion;", "", "<init>", "()V", "sDirectExecutor", "Lcom/jumio/commons/camera/renderer/executor/DirectExecutor;", "instance", "Ljava/util/concurrent/Executor;", "getInstance", "()Ljava/util/concurrent/Executor;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DirectExecutor$Companion {
    @NotNull
    public final Executor getInstance() {
        ExecutorC40601U0 executorC40601U0;
        ExecutorC40601U0 executorC40601U1 = ExecutorC40601U0.f90130b;
        if (executorC40601U1 != null) {
            return executorC40601U1;
        }
        synchronized (ExecutorC40601U0.class) {
            executorC40601U0 = new ExecutorC40601U0();
            ExecutorC40601U0.f90130b = executorC40601U0;
        }
        return executorC40601U0;
    }

    public DirectExecutor$Companion(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
