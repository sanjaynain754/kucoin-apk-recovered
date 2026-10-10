package com.facebook.bolts;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidExecutors.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0002\t\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m90084d2 = {"Lcom/facebook/bolts/AndroidExecutors;", "", "<init>", "()V", "Ljava/util/concurrent/Executor;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/concurrent/Executor;", "uiThread", "b", "Companion", "facebook-bolts_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AndroidExecutors {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final AndroidExecutors f8050c = new AndroidExecutors();

    /* JADX INFO: renamed from: d */
    public static final int f8051d;

    /* JADX INFO: renamed from: e */
    public static final int f8052e;

    /* JADX INFO: renamed from: f */
    public static final int f8053f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Executor uiThread = new ExecutorC5547a();

    /* JADX INFO: compiled from: AndroidExecutors.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/facebook/bolts/AndroidExecutors$Companion;", "", "()V", "CORE_POOL_SIZE", "", "CPU_COUNT", "INSTANCE", "Lcom/facebook/bolts/AndroidExecutors;", "KEEP_ALIVE_TIME", "", "MAX_POOL_SIZE", "newCachedThreadPool", "Ljava/util/concurrent/ExecutorService;", "uiThread", "Ljava/util/concurrent/Executor;", "facebook-bolts_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final ExecutorService newCachedThreadPool() {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(AndroidExecutors.f8052e, AndroidExecutors.f8053f, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return threadPoolExecutor;
        }

        @JvmStatic
        @NotNull
        public final Executor uiThread() {
            return AndroidExecutors.f8050c.uiThread;
        }
    }

    /* JADX INFO: renamed from: com.facebook.bolts.AndroidExecutors$a */
    /* JADX INFO: compiled from: AndroidExecutors.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/facebook/bolts/AndroidExecutors$a;", "Ljava/util/concurrent/Executor;", "<init>", "()V", "Ljava/lang/Runnable;", "command", "", "execute", "(Ljava/lang/Runnable;)V", "facebook-bolts_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class ExecutorC5547a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@NotNull Runnable command) {
            Intrinsics.checkNotNullParameter(command, "command");
            new Handler(Looper.getMainLooper()).post(command);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f8051d = iAvailableProcessors;
        f8052e = iAvailableProcessors + 1;
        f8053f = (iAvailableProcessors * 2) + 1;
    }
}
