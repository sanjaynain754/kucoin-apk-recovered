package q00;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.thread.IKExecutor;
import com.kubi.sdk.thread.KThreadException;
import com.kubi.sdk.thread.monitor.ExecutorTimerMonitor;
import com.kubi.sdk.thread.monitor.KThreadWrapException;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: q00.a */
/* JADX INFO: compiled from: ExecutorMonitor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0003J\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0003R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, m90084d2 = {"Lq00/a;", "", "<init>", "()V", "", "name", "Lcom/kubi/sdk/thread/monitor/ExecutorTimerMonitor;", "monitor", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Lcom/kubi/sdk/thread/monitor/ExecutorTimerMonitor;)V", "Lcom/kubi/sdk/thread/KThreadException;", "e", "c", "(Lcom/kubi/sdk/thread/KThreadException;)V", "d", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "monitorMap", "ThreadPoolMonitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C43572a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43572a f96129a = new C43572a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, ExecutorTimerMonitor> monitorMap = new ConcurrentHashMap<>();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public final void m95848a(@NotNull String name, @NotNull ExecutorTimerMonitor monitor) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(monitor, "monitor");
        switch (name.hashCode()) {
            case -1423861672:
                if (!name.equals(IKExecutor.Companion.LONG_TIME_NAME)) {
                    return;
                }
                break;
            case -1228394100:
                if (!name.equals(IKExecutor.Companion.IO_NAME)) {
                    return;
                }
                break;
            case -1066141912:
                if (!name.equals(IKExecutor.Companion.BACKUP_NAME)) {
                    return;
                }
                break;
            case 574482946:
                if (!name.equals(IKExecutor.Companion.COMPUTE_NAME)) {
                    return;
                }
                break;
            case 629385375:
                if (!name.equals(IKExecutor.Companion.MAIN_NAME)) {
                    return;
                }
                break;
            default:
                return;
        }
        monitorMap.put(name, monitor);
    }

    /* JADX INFO: renamed from: b */
    public final void m95849b() {
        Collection<ExecutorTimerMonitor> collectionValues = monitorMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "monitorMap.values");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((ExecutorTimerMonitor) it.next()).m58238l();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m95850c(@NotNull KThreadException e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        C43846g.m96568c(new KThreadWrapException(e11, InterfaceC33953u5.f72225u, false, null, 12, null), null, 2, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m95851d() {
        Collection<ExecutorTimerMonitor> collectionValues = monitorMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "monitorMap.values");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((ExecutorTimerMonitor) it.next()).m58239m();
        }
    }
}
