package com.kubi.sdk.thread.impl;

import android.os.Handler;
import android.os.Looper;
import com.kubi.sdk.thread.IKExecutor;
import com.kubi.sdk.thread.KThreadException;
import com.kubi.sdk.thread.impl.KMainExecutor;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import q00.C43576e;
import q00.InterfaceC43574c;

/* JADX INFO: compiled from: KMainExecutor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/sdk/thread/impl/KMainExecutor;", "Ljava/util/concurrent/Executor;", "Lcom/kubi/sdk/thread/IKExecutor;", "<init>", "()V", "Ljava/lang/Runnable;", "command", "", "execute", "(Ljava/lang/Runnable;)V", "", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "Lq00/c;", "c", "Lq00/c;", "monitor", "Landroid/os/Handler;", "d", "Landroid/os/Handler;", "mainHandler", "MainThreadException", "ThreadPool_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class KMainExecutor implements Executor, IKExecutor {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String name = IKExecutor.Companion.MAIN_NAME;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC43574c monitor = C43576e.f96132a.m95855a(this);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Handler mainHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: KMainExecutor.kt */
    /* JADX INFO: loaded from: classes45.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/sdk/thread/impl/KMainExecutor$MainThreadException;", "Lcom/kubi/sdk/thread/KThreadException;", "e", "", "(Ljava/lang/Throwable;)V", "ThreadPool_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class MainThreadException extends KThreadException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MainThreadException(@NotNull Throwable e11) {
            super("main thread uncatched err", e11);
            Intrinsics.checkNotNullParameter(e11, "e");
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m58215b(KMainExecutor this$0, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.monitor.mo58236b(runnable);
        try {
            runnable.run();
            this$0.monitor.mo58235a(runnable, null);
        } catch (Throwable th2) {
            try {
                C43576e.f96132a.m95856b(new MainThreadException(th2));
            } finally {
                this$0.monitor.mo58235a(runnable, th2);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@Nullable final Runnable command) {
        if (command == null) {
            return;
        }
        InterfaceC43574c interfaceC43574c = this.monitor;
        if (interfaceC43574c == null) {
            this.mainHandler.post(command);
        } else {
            interfaceC43574c.mo58237c(command);
            this.mainHandler.post(new Runnable() { // from class: p00.a
                @Override // java.lang.Runnable
                public final void run() {
                    KMainExecutor.m58215b(this.f95694b, command);
                }
            });
        }
    }

    @Override // com.kubi.sdk.thread.IKExecutor
    @NotNull
    public String getName() {
        return this.name;
    }
}
