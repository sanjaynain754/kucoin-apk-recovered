package p00;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.thread.IKExecutor;
import com.kubi.sdk.thread.KThreadException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import q00.C43576e;
import q00.InterfaceC43574c;

/* JADX INFO: renamed from: p00.c */
/* JADX INFO: compiled from: KThreadPoolExecutor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m90084d2 = {"Lp00/c;", "Ljava/util/concurrent/ThreadPoolExecutor;", "Lcom/kubi/sdk/thread/IKExecutor;", "Lp00/c$a;", "dsl", "<init>", "(Lp00/c$a;)V", "Ljava/lang/Runnable;", "command", "", "execute", "(Ljava/lang/Runnable;)V", "Ljava/lang/Thread;", "t", "r", "beforeExecute", "(Ljava/lang/Thread;Ljava/lang/Runnable;)V", "", "afterExecute", "(Ljava/lang/Runnable;Ljava/lang/Throwable;)V", "", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "Lq00/c;", "c", "Lq00/c;", "monitor", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "ThreadPool_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C43347c extends ThreadPoolExecutor implements IKExecutor {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC43574c monitor;

    /* JADX INFO: renamed from: p00.c$a */
    /* JADX INFO: compiled from: KThreadPoolExecutor.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\"\u0010\u0018\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR*\u0010#\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0005\u0010 \"\u0004\b!\u0010\"R$\u0010)\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010%\u001a\u0004\b\u001e\u0010&\"\u0004\b'\u0010(¨\u0006*"}, m90084d2 = {"Lp00/c$a;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "b", "()I", "i", "(I)V", "corePoolSize", "d", "k", "maximumPoolSize", "c", "j", "keepAliveTimeSeconds", "", "Ljava/lang/String;", "e", "()Ljava/lang/String;", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/String;)V", "namePrefix", "g", "n", "priority", "Ljava/util/concurrent/BlockingQueue;", "Ljava/lang/Runnable;", "f", "Ljava/util/concurrent/BlockingQueue;", "()Ljava/util/concurrent/BlockingQueue;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/util/concurrent/BlockingQueue;)V", "blockingQueue", "Ljava/util/concurrent/RejectedExecutionHandler;", "Ljava/util/concurrent/RejectedExecutionHandler;", "()Ljava/util/concurrent/RejectedExecutionHandler;", "m", "(Ljava/util/concurrent/RejectedExecutionHandler;)V", "policy", "ThreadPool_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public int corePoolSize;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int maximumPoolSize;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public int keepAliveTimeSeconds;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public String namePrefix = "kPool";

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public int priority = 5;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public BlockingQueue<Runnable> blockingQueue;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public RejectedExecutionHandler policy;

        @Nullable
        /* JADX INFO: renamed from: a */
        public final BlockingQueue<Runnable> m95436a() {
            return this.blockingQueue;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getCorePoolSize() {
            return this.corePoolSize;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getKeepAliveTimeSeconds() {
            return this.keepAliveTimeSeconds;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getMaximumPoolSize() {
            return this.maximumPoolSize;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getNamePrefix() {
            return this.namePrefix;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final RejectedExecutionHandler getPolicy() {
            return this.policy;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getPriority() {
            return this.priority;
        }

        /* JADX INFO: renamed from: h */
        public final void m95443h(@Nullable BlockingQueue<Runnable> blockingQueue) {
            this.blockingQueue = blockingQueue;
        }

        /* JADX INFO: renamed from: i */
        public final void m95444i(int i11) {
            this.corePoolSize = i11;
        }

        /* JADX INFO: renamed from: j */
        public final void m95445j(int i11) {
            this.keepAliveTimeSeconds = i11;
        }

        /* JADX INFO: renamed from: k */
        public final void m95446k(int i11) {
            this.maximumPoolSize = i11;
        }

        /* JADX INFO: renamed from: l */
        public final void m95447l(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.namePrefix = str;
        }

        /* JADX INFO: renamed from: m */
        public final void m95448m(@Nullable RejectedExecutionHandler rejectedExecutionHandler) {
            this.policy = rejectedExecutionHandler;
        }

        /* JADX INFO: renamed from: n */
        public final void m95449n(int i11) {
            this.priority = i11;
        }
    }

    public C43347c(@NotNull a dsl) {
        Intrinsics.checkNotNullParameter(dsl, "dsl");
        int corePoolSize = dsl.getCorePoolSize();
        int maximumPoolSize = dsl.getMaximumPoolSize();
        long keepAliveTimeSeconds = dsl.getKeepAliveTimeSeconds();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        BlockingQueue<Runnable> blockingQueueM95436a = dsl.m95436a();
        BlockingQueue<Runnable> linkedBlockingQueue = blockingQueueM95436a == null ? new LinkedBlockingQueue<>() : blockingQueueM95436a;
        ThreadFactoryC43346b threadFactoryC43346b = new ThreadFactoryC43346b(dsl.getNamePrefix(), dsl.getPriority());
        RejectedExecutionHandler policy = dsl.getPolicy();
        super(corePoolSize, maximumPoolSize, keepAliveTimeSeconds, timeUnit, linkedBlockingQueue, threadFactoryC43346b, policy == null ? new ThreadPoolExecutor.AbortPolicy() : policy);
        this.name = dsl.getNamePrefix();
        this.monitor = C43576e.f96132a.m95855a(this);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(@Nullable Runnable r11, @Nullable Throwable t11) {
        if (r11 == null) {
            return;
        }
        InterfaceC43574c interfaceC43574c = this.monitor;
        if (interfaceC43574c != null) {
            interfaceC43574c.mo58235a(r11, t11);
        }
        if (t11 != null) {
            C43576e.f96132a.m95856b(new KThreadException(Intrinsics.stringPlus(getName(), " uncatched error"), t11));
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(@Nullable Thread t11, @Nullable Runnable r11) {
        InterfaceC43574c interfaceC43574c;
        if (r11 == null || (interfaceC43574c = this.monitor) == null) {
            return;
        }
        interfaceC43574c.mo58236b(r11);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(@Nullable Runnable command) {
        InterfaceC43574c interfaceC43574c = this.monitor;
        if (interfaceC43574c != null && command != null) {
            interfaceC43574c.mo58237c(command);
        }
        super.execute(command);
    }

    @Override // com.kubi.sdk.thread.IKExecutor
    @NotNull
    public String getName() {
        return this.name;
    }
}
