package p560qh;

import androidx.exifinterface.media.ExifInterface;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: qh.a */
/* JADX INFO: compiled from: NothingExecutor.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001f\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u001a\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0014\"\n\b\u0000\u0010\u0015*\u0004\u0018\u00010\u00162\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u0002H\u0015\u0018\u00010\u0018H\u0016J1\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0014\"\n\b\u0000\u0010\u0015*\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0019\u001a\u0002H\u0015H\u0016¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0016J8\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u00140\n\"\n\b\u0000\u0010\u0015*\u0004\u0018\u00010\u00162\u0016\u0010\u001c\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00150\u0018\u0018\u00010\u001dH\u0016JJ\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u00140\n\"\n\b\u0000\u0010\u0015*\u0004\u0018\u00010\u00162\u0016\u0010\u001c\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00150\u0018\u0018\u00010\u001d2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J3\u0010\u001e\u001a\u0004\u0018\u0001H\u0015\"\n\b\u0000\u0010\u0015*\u0004\u0018\u00010\u00162\u0016\u0010\u001c\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00150\u0018\u0018\u00010\u001dH\u0016¢\u0006\u0002\u0010\u001fJE\u0010\u001e\u001a\u0004\u0018\u0001H\u0015\"\n\b\u0000\u0010\u0015*\u0004\u0018\u00010\u00162\u0016\u0010\u001c\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00150\u0018\u0018\u00010\u001d2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010 ¨\u0006!"}, m90084d2 = {"Lcom/kubi/futures/data/NothingExecutor;", "Ljava/util/concurrent/ExecutorService;", "<init>", "()V", "execute", "", "command", "Ljava/lang/Runnable;", "shutdown", "shutdownNow", "", "isShutdown", "", "isTerminated", "awaitTermination", "timeout", "", "unit", "Ljava/util/concurrent/TimeUnit;", "submit", "Ljava/util/concurrent/Future;", ExifInterface.GPS_DIRECTION_TRUE, "", "task", "Ljava/util/concurrent/Callable;", DbParams.KEY_CHANNEL_RESULT, "(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;", "invokeAll", "tasks", "", "invokeAny", "(Ljava/util/Collection;)Ljava/lang/Object;", "(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ExecutorServiceC43741a implements ExecutorService {
    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long timeout, @Nullable TimeUnit unit) {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    @NotNull
    public <T> List<Future<T>> invokeAll(@Nullable Collection<? extends Callable<T>> tasks) {
        return new ArrayList();
    }

    @Override // java.util.concurrent.ExecutorService
    @Nullable
    public <T> T invokeAny(@Nullable Collection<? extends Callable<T>> tasks) {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    @NotNull
    public <T> Future<T> submit(@Nullable Callable<T> task) throws Exception {
        if (task != null) {
            task.call();
        }
        return new FutureTask(task);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@Nullable Runnable command) {
        if (command != null) {
            command.run();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    @NotNull
    public <T> List<Future<T>> invokeAll(@Nullable Collection<? extends Callable<T>> tasks, long timeout, @Nullable TimeUnit unit) {
        return new ArrayList();
    }

    @Override // java.util.concurrent.ExecutorService
    @Nullable
    public <T> T invokeAny(@Nullable Collection<? extends Callable<T>> tasks, long timeout, @Nullable TimeUnit unit) {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    @NotNull
    public List<Runnable> shutdownNow() {
        return new ArrayList();
    }

    @Override // java.util.concurrent.ExecutorService
    @NotNull
    public <T> Future<T> submit(@Nullable Runnable task, T result) {
        if (task != null) {
            task.run();
        }
        return new FutureTask(task, null);
    }

    @Override // java.util.concurrent.ExecutorService
    @NotNull
    public Future<?> submit(@Nullable Runnable task) {
        if (task != null) {
            task.run();
        }
        return new FutureTask(task, null);
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
    }
}
