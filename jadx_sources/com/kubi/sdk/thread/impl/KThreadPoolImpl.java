package com.kubi.sdk.thread.impl;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.thread.IKExecutor;
import com.kubi.sdk.thread.KThreadException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p00.C43347c;
import p00.ThreadFactoryC43346b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import q00.C43576e;

/* JADX INFO: compiled from: KThreadPoolImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002-.B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u0004*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0016\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0013\u0010\u0014R \u0010\u001a\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0018\u0010\u0014R \u0010 \u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u001c\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001d\u0010\u001eR \u0010$\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u0012\u0012\u0004\b#\u0010\u0003\u001a\u0004\b\"\u0010\u0014R \u0010)\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010&\u0012\u0004\b(\u0010\u0003\u001a\u0004\b!\u0010'R!\u0010,\u001a\u00020\u00108BX\u0083\u0084\u0002¢\u0006\u0012\n\u0004\b\"\u0010*\u0012\u0004\b+\u0010\u0003\u001a\u0004\b\u0017\u0010\u0014¨\u0006/"}, m90084d2 = {"Lcom/kubi/sdk/thread/impl/KThreadPoolImpl;", "", "<init>", "()V", "", "name", "Ljava/util/concurrent/ExecutorService;", "k", "(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ThreadPoolExecutor;", "j", "(Ljava/util/concurrent/ThreadPoolExecutor;)Ljava/lang/String;", "", "b", "I", "cpuCount", "Lp00/c;", "c", "Lp00/c;", "g", "()Lp00/c;", "getIO$annotations", "IO", "d", "e", "getCompute$annotations", "Compute", "Lcom/kubi/sdk/thread/impl/KMainExecutor;", "Lcom/kubi/sdk/thread/impl/KMainExecutor;", "i", "()Lcom/kubi/sdk/thread/impl/KMainExecutor;", "getMain$annotations", "Main", "f", CmcdData.Factory.STREAMING_FORMAT_HLS, "getLongTime$annotations", "LongTime", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "()Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "getDelayed$annotations", "Delayed", "Lkotlin/Lazy;", "getBackup$annotations", "backup", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "KRejectedException", "ThreadPool_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class KThreadPoolImpl {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KThreadPoolImpl f47989a = new KThreadPoolImpl();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final int cpuCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final C43347c IO;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final C43347c Compute;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final KMainExecutor Main;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final C43347c LongTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final ScheduledThreadPoolExecutor Delayed;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final Lazy backup;

    /* JADX INFO: compiled from: KThreadPoolImpl.kt */
    /* JADX INFO: loaded from: classes45.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/sdk/thread/impl/KThreadPoolImpl$KRejectedException;", "Lcom/kubi/sdk/thread/KThreadException;", "message", "", "(Ljava/lang/String;)V", "ThreadPool_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class KRejectedException extends KThreadException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KRejectedException(@NotNull String message) {
            super(message);
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.thread.impl.KThreadPoolImpl$a */
    /* JADX INFO: compiled from: KThreadPoolImpl.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/sdk/thread/impl/KThreadPoolImpl$a;", "Ljava/util/concurrent/RejectedExecutionHandler;", "<init>", "()V", "Ljava/lang/Runnable;", "r", "Ljava/util/concurrent/ThreadPoolExecutor;", "e", "", "rejectedExecution", "(Ljava/lang/Runnable;Ljava/util/concurrent/ThreadPoolExecutor;)V", "ThreadPool_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class RejectedExecutionHandlerC24198a implements RejectedExecutionHandler {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final RejectedExecutionHandlerC24198a f47997a = new RejectedExecutionHandlerC24198a();

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(@Nullable Runnable r11, @NotNull ThreadPoolExecutor e11) {
            Intrinsics.checkNotNullParameter(e11, "e");
            if (e11.isShutdown()) {
                return;
            }
            KThreadPoolImpl.m58219d().execute(r11);
            C43576e c43576e = C43576e.f96132a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("rejected in Back io:");
            KThreadPoolImpl kThreadPoolImpl = KThreadPoolImpl.f47989a;
            sb2.append(kThreadPoolImpl.m58226j(e11));
            sb2.append(" bk:");
            sb2.append(kThreadPoolImpl.m58226j(KThreadPoolImpl.m58219d()));
            c43576e.m95856b(new KRejectedException(sb2.toString()));
        }
    }

    static {
        int iAvailableProcessors;
        try {
            iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        } catch (Throwable unused) {
            iAvailableProcessors = 8;
        }
        cpuCount = iAvailableProcessors;
        C43347c.a aVar = new C43347c.a();
        aVar.m95444i(Math.min(32, Math.max(8, cpuCount * 2)));
        aVar.m95446k(64);
        aVar.m95445j(30);
        aVar.m95447l(IKExecutor.Companion.IO_NAME);
        aVar.m95449n(3);
        aVar.m95443h(new ArrayBlockingQueue(64));
        aVar.m95448m(RejectedExecutionHandlerC24198a.f47997a);
        IO = new C43347c(aVar);
        C43347c.a aVar2 = new C43347c.a();
        aVar2.m95444i(Math.max(4, cpuCount + 1));
        aVar2.m95446k(Math.max(4, aVar2.getCorePoolSize()));
        aVar2.m95447l(IKExecutor.Companion.COMPUTE_NAME);
        aVar2.m95449n(4);
        aVar2.m95443h(new LinkedBlockingQueue());
        Compute = new C43347c(aVar2);
        Main = new KMainExecutor();
        C43347c.a aVar3 = new C43347c.a();
        aVar3.m95444i(0);
        aVar3.m95446k(cpuCount * 2);
        aVar3.m95445j(30);
        aVar3.m95447l(IKExecutor.Companion.LONG_TIME_NAME);
        aVar3.m95449n(2);
        aVar3.m95443h(new LinkedBlockingQueue());
        LongTime = new C43347c(aVar3);
        Delayed = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC43346b(IKExecutor.Companion.DELAYED_NAME, 0, 2, null));
        backup = LazyKt.lazy(new Function0<C43347c>() { // from class: com.kubi.sdk.thread.impl.KThreadPoolImpl$backup$2
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final C43347c invoke() {
                C43347c.a aVar4 = new C43347c.a();
                aVar4.m95444i(0);
                aVar4.m95446k(KThreadPoolImpl.cpuCount * 2);
                aVar4.m95447l(IKExecutor.Companion.BACKUP_NAME);
                aVar4.m95449n(1);
                aVar4.m95443h(new LinkedBlockingQueue());
                return new C43347c(aVar4);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static final C43347c m58219d() {
        return (C43347c) backup.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final C43347c m58220e() {
        return Compute;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final ScheduledThreadPoolExecutor m58221f() {
        return Delayed;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final C43347c m58222g() {
        return IO;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final C43347c m58223h() {
        return LongTime;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final KMainExecutor m58224i() {
        return Main;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: k */
    public static final ExecutorService m58225k(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        C43347c.a aVar = new C43347c.a();
        aVar.m95444i(1);
        aVar.m95446k(1);
        aVar.m95447l(Intrinsics.stringPlus("kPool-single-", name));
        aVar.m95449n(2);
        aVar.m95443h(new LinkedBlockingQueue());
        return new C43347c(aVar);
    }

    /* JADX INFO: renamed from: j */
    public final String m58226j(ThreadPoolExecutor threadPoolExecutor) {
        try {
            return "a=" + threadPoolExecutor.getActiveCount() + '/' + threadPoolExecutor.getCorePoolSize() + " t=" + threadPoolExecutor.getTaskCount() + '/' + threadPoolExecutor.getCompletedTaskCount() + " q=" + threadPoolExecutor.getQueue().size() + " [" + threadPoolExecutor.getLargestPoolSize() + ']';
        } catch (Exception unused) {
            return "";
        }
    }
}
