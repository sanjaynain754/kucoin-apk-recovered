package androidx.camera.core;

import android.os.Process;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraFactory;
import androidx.core.util.Preconditions;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class CameraExecutor implements Executor {
    private static final int CAMERA_THREAD_JAVA_PRIORITY = 7;
    private static final int CAMERA_THREAD_PROCESS_PRIORITY = -3;
    private static final int DEFAULT_CORE_THREADS = 1;
    private static final int DEFAULT_MAX_THREADS = 1;
    private static final String TAG = "CameraExecutor";
    private static final ThreadFactory THREAD_FACTORY = new ThreadFactoryC09161();
    private final Object mExecutorLock = new Object();

    @GuardedBy("mExecutorLock")
    private ThreadPoolExecutor mThreadPoolExecutor = createExecutor();

    /* JADX INFO: renamed from: androidx.camera.core.CameraExecutor$1 */
    public class ThreadFactoryC09161 implements ThreadFactory {
        private static final String THREAD_NAME_STEM = "CameraX-core_camera_%d";
        private final AtomicInteger mThreadId = new AtomicInteger(0);

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m1842a(Runnable runnable) {
            Process.setThreadPriority(-3);
            runnable.run();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            Thread thread = new Thread(new Runnable() { // from class: androidx.camera.core.d
                @Override // java.lang.Runnable
                public final void run() {
                    CameraExecutor.ThreadFactoryC09161.m1842a(runnable);
                }
            });
            thread.setPriority(7);
            thread.setName(String.format(Locale.US, THREAD_NAME_STEM, Integer.valueOf(this.mThreadId.getAndIncrement())));
            return thread;
        }
    }

    private static ThreadPoolExecutor createExecutor() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), THREAD_FACTORY);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: androidx.camera.core.c
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                Logger.m1868e(CameraExecutor.TAG, "A rejected execution occurred in CameraExecutor!");
            }
        });
        return threadPoolExecutor;
    }

    public void deinit() {
        synchronized (this.mExecutorLock) {
            try {
                if (!this.mThreadPoolExecutor.isShutdown()) {
                    this.mThreadPoolExecutor.shutdown();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        synchronized (this.mExecutorLock) {
            this.mThreadPoolExecutor.execute(runnable);
        }
    }

    public void init(CameraFactory cameraFactory) {
        ThreadPoolExecutor threadPoolExecutor;
        Preconditions.checkNotNull(cameraFactory);
        synchronized (this.mExecutorLock) {
            try {
                if (this.mThreadPoolExecutor.isShutdown()) {
                    this.mThreadPoolExecutor = createExecutor();
                }
                threadPoolExecutor = this.mThreadPoolExecutor;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iMax = Math.max(1, cameraFactory.getAvailableCameraIds().size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }
}
