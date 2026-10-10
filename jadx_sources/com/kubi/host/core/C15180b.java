package com.kubi.host.core;

import android.app.Activity;
import com.blankj.utilcode.util.C5264d;
import com.blankj.utilcode.util.C5287o0;
import com.blankj.utilcode.util.NetworkUtils;
import com.kubi.host.HostManager;
import com.kubi.host.exception.EventCode;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.utils.extensions.C27025c;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import o00.C42917g;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p799yj.C46509a;
import p834zj.C46881a;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.TypeIntrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.host.core.b */
/* JADX INFO: compiled from: HostMonitor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003R\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/host/core/b;", "Lcom/kubi/host/core/IHostMonitor;", "<init>", "()V", "Lyj/a;", "_config", "", "c", "(Lyj/a;)V", "e", "d", "b", "Lyj/a;", "config", "Lcom/kubi/host/core/f;", "Lcom/kubi/host/core/f;", "inet4Monitor", "Lcom/kubi/host/core/h;", "Lcom/kubi/host/core/h;", "inet6Monitor", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "execute", "Host_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHostMonitor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HostMonitor.kt\ncom/kubi/host/core/HostMonitor\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,121:1\n23#2,2:122\n620#3,8:124\n620#3,8:132\n*S KotlinDebug\n*F\n+ 1 HostMonitor.kt\ncom/kubi/host/core/HostMonitor\n*L\n57#1:122,2\n78#1:124,8\n79#1:132,8\n*E\n"})
public final class C15180b implements IHostMonitor {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public C46509a config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C15184f inet4Monitor = new C15184f();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C15186h inet6Monitor = new C15186h();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean execute = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.kubi.host.core.b$a */
    /* JADX INFO: compiled from: HostMonitor.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m90084d2 = {"com/kubi/host/core/b$a", "Lcom/blankj/utilcode/util/o0$b;", "Landroid/app/Activity;", "activity", "", "onBackground", "(Landroid/app/Activity;)V", "onForeground", "Host_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a implements C5287o0.b {
        public a() {
        }

        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onForeground(@Nullable Activity activity) {
            C15180b.this.m31401e();
        }

        @Override // com.blankj.utilcode.util.C5287o0.b
        public void onBackground(@Nullable Activity activity) {
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m31397f(C15180b this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.m31398b();
            this$0.execute.set(false);
        } catch (Throwable th2) {
            try {
                C44128b.m97263g("HOST", th2);
            } finally {
                this$0.execute.set(false);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m31398b() {
        if (!NetworkUtils.m6059g()) {
            C44128b.m97266j("HOST", "网络不可用");
            return;
        }
        try {
            try {
                List<InetAddress> listLookup = Dns.SYSTEM.lookup(HttpUrl.INSTANCE.get(HostManager.a.f()).host());
                List<? extends InetAddress> listEmptyList = CollectionsKt.emptyList();
                for (Object obj : listLookup) {
                    if (((InetAddress) obj) instanceof Inet4Address) {
                        if (listEmptyList.isEmpty()) {
                            listEmptyList = new ArrayList<>();
                        }
                        TypeIntrinsics.asMutableList(listEmptyList).add(obj);
                    }
                }
                List<? extends InetAddress> listEmptyList2 = CollectionsKt.emptyList();
                for (Object obj2 : listLookup) {
                    if (((InetAddress) obj2) instanceof Inet6Address) {
                        if (listEmptyList2.isEmpty()) {
                            listEmptyList2 = new ArrayList<>();
                        }
                        TypeIntrinsics.asMutableList(listEmptyList2).add(obj2);
                    }
                }
                if (listEmptyList.isEmpty() && listEmptyList2.isEmpty()) {
                    TechnologyEvent.m42386b("net_host_fail");
                    C46881a.m103217c(EventCode.HOST_EMPTY);
                    TechnologyEvent.m42386b("net_host");
                    C46881a.m103217c(EventCode.HOST_SUCCESS);
                    return;
                }
                boolean zM31406b = this.inet4Monitor.m31406b(listEmptyList);
                boolean zM31412b = this.inet6Monitor.m31412b(listEmptyList2);
                if (!zM31406b || !zM31412b) {
                    TechnologyEvent.m42386b("net_host_fail");
                    C46881a.m103217c(EventCode.HOST_FAIL);
                }
                TechnologyEvent.m42386b("net_host");
                C46881a.m103217c(EventCode.HOST_SUCCESS);
            } catch (Throwable unused) {
                TechnologyEvent.m42386b("net_host_fail");
                C46881a.m103217c(EventCode.HOST_EXCEPTION);
            }
        } finally {
            TechnologyEvent.m42386b("net_host");
            C46881a.m103217c(EventCode.HOST_SUCCESS);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m31399c(@NotNull C46509a _config) {
        Intrinsics.checkNotNullParameter(_config, "_config");
        this.config = _config;
        this.inet4Monitor.m31408e(_config);
        this.inet6Monitor.m31414e(_config);
        m31400d();
    }

    /* JADX INFO: renamed from: d */
    public final void m31400d() {
        C5264d.registerAppStatusChangedListener(new a());
        m31401e();
    }

    /* JADX INFO: renamed from: e */
    public void m31401e() {
        C46509a c46509a = this.config;
        if (c46509a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            c46509a = null;
        }
        if (C27025c.m66567e(c46509a.getMonitorConfig().getEnable(), true) && this.execute.compareAndSet(false, true)) {
            C42917g.m94138d().execute(new Runnable() { // from class: com.kubi.host.core.a
                @Override // java.lang.Runnable
                public final void run() {
                    C15180b.m31397f(this.f27124b);
                }
            });
        }
    }
}
