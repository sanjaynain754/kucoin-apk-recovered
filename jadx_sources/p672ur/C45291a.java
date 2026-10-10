package p672ur;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.network.socket.utils.C19388d;
import com.kubi.network.socket.utils.C19391g;
import com.kubi.network.socket.utils.C19393i;
import com.kubi.network.socket.utils.SuccessRateStats;
import com.kubi.sdk.constant.monitor.KunlunEventNameEnum;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43848i;
import p604rq.InterfaceC44169a;
import p605rr.C44170a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: ur.a */
/* JADX INFO: compiled from: ActiveTrack.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m90084d2 = {"Lur/a;", "Lur/d;", "", "linkType", "", "activePeriod", "<init>", "(Ljava/lang/String;J)V", "", "start", "()V", InterfaceC33730j9.f70350a, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "isSuccess", "f", "(Z)V", "Ljava/lang/String;", "b", "J", "c", "activeTime", "Ljava/util/Timer;", "d", "Ljava/util/Timer;", "activeTimer", "Lcom/kubi/network/socket/utils/i;", "e", "Lcom/kubi/network/socket/utils/i;", "evaluator", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nActiveTrack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActiveTrack.kt\ncom/kubi/network/socket/track/ActiveTrack\n+ 2 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 3 KunlunEvent.kt\ncom/kubi/monitor/KunlunEvent\n*L\n1#1,87:1\n71#2,4:88\n74#3,12:92\n*S KotlinDebug\n*F\n+ 1 ActiveTrack.kt\ncom/kubi/network/socket/track/ActiveTrack\n*L\n63#1:88,4\n70#1:92,12\n*E\n"})
public final class C45291a implements InterfaceC45294d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String linkType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long activePeriod;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public long activeTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Timer activeTimer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C19393i evaluator;

    /* JADX INFO: renamed from: ur.a$a */
    /* JADX INFO: compiled from: ActiveTrack.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"ur/a$a", "Ljava/util/TimerTask;", "", "run", "()V", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nActiveTrack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActiveTrack.kt\ncom/kubi/network/socket/track/ActiveTrack$start$1\n+ 2 NetCoreSocketIssue.kt\ncom/kubi/network/socket/exception/NetCoreSocketIssueKt\n*L\n1#1,87:1\n52#2,33:88\n*S KotlinDebug\n*F\n+ 1 ActiveTrack.kt\ncom/kubi/network/socket/track/ActiveTrack$start$1\n*L\n38#1:88,33\n*E\n"})
    public static final class a extends TimerTask {
        /* JADX WARN: Code duplicated, block: B:12:0x0025  */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            String message;
            boolean zStartsWith$default = false;
            try {
                C45291a.this.m100108f(System.currentTimeMillis() - C45291a.this.activeTime < C45291a.this.activePeriod);
            } catch (Throwable th2) {
                if ((th2 instanceof UnknownHostException) || (th2 instanceof SocketException) || (th2 instanceof SocketTimeoutException) || (th2 instanceof SSLException) || (th2 instanceof SSLProtocolException) || (th2 instanceof SSLPeerUnverifiedException) || (th2 instanceof ConnectionShutdownException)) {
                    zStartsWith$default = true;
                } else if (th2 instanceof SecurityException) {
                    String message2 = th2.getMessage();
                    if (message2 != null) {
                        zStartsWith$default = StringsKt.startsWith$default(message2, "Package android does not belong to", false, 2, (Object) null);
                    }
                } else if ((th2 instanceof IOException) && (message = th2.getMessage()) != null && (StringsKt.startsWith$default(message, "Required SETTINGS preface not received", false, 2, (Object) null) || StringsKt.startsWith$default(message, "Unexpected response code for CONNECT", false, 2, (Object) null) || StringsKt.startsWith$default(message, "exhausted all routes", false, 2, (Object) null) || StringsKt.startsWith$default(message, "unexpected end of stream", false, 2, (Object) null) || StringsKt.startsWith$default(message, "stream was reset: CANCEL", false, 2, (Object) null) || StringsKt.startsWith$default(message, "Software caused connection abort", false, 2, (Object) null) || message.equals("closed"))) {
                    zStartsWith$default = true;
                }
                if (zStartsWith$default) {
                    C44128b.m97263g("ActiveTrack", th2);
                } else {
                    C44170a.m97380b(th2, "ActiveTrack");
                }
            }
        }

        public a() {
        }
    }

    public C45291a(@NotNull String linkType, long j11) {
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        this.linkType = linkType;
        this.activePeriod = j11;
        this.activeTime = System.currentTimeMillis();
        this.evaluator = new C19393i(10L);
    }

    /* JADX INFO: renamed from: f */
    public final void m100108f(boolean isSuccess) {
        if (C19388d.f36150a.m43053b() && C19391g.f36153a.m43065h()) {
            int i11 = !isSuccess ? 1 : 0;
            TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
            TechnologyEvent.EventParametersBuilder.Companion companion = TechnologyEvent.EventParametersBuilder.INSTANCE;
            TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = companion.acquire();
            eventParametersBuilderAcquire.m42391b("code", i11);
            eventParametersBuilderAcquire.m42393d("link_type", this.linkType);
            TechnologyEvent.C19216a.m42397b(eventParametersBuilderAcquire);
            TechnologyEvent.m42388d("socket_active", eventParametersBuilderAcquire);
            KunlunEventNameEnum kunlunEventNameEnum = KunlunEventNameEnum.FRONTEND_CONNECT_WS_ACTIVE;
            TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire2 = companion.acquire();
            eventParametersBuilderAcquire2.m42391b("status_code", i11);
            eventParametersBuilderAcquire2.m42393d("link_type", this.linkType);
            TechnologyEvent.C19216a c19216a = TechnologyEvent.C19216a.f35485a;
            Map<String, Object> mapM42399c = c19216a.m42399c(eventParametersBuilderAcquire2);
            Map<String, Number> mapM42398a = c19216a.m42398a(eventParametersBuilderAcquire2);
            for (InterfaceC44169a interfaceC44169a : C43848i.f96913a.m96586e().mo32841c()) {
                if (mapM42398a.isEmpty()) {
                    interfaceC44169a.mo94079b(kunlunEventNameEnum.getEventName(), mapM42399c);
                } else {
                    interfaceC44169a.mo94078a(kunlunEventNameEnum.getEventName(), mapM42398a, mapM42399c);
                }
            }
            SuccessRateStats successRateStatsM43070a = this.evaluator.m43070a(isSuccess);
            if (successRateStatsM43070a != null) {
                C44128b.m97261e("NetworkChain:Ws", "request ws_connect_active_rate: windowSuccessRate = " + successRateStatsM43070a.getWindowSuccessRate() + ", totalSuccessRate = " + successRateStatsM43070a.getTotalSuccessRate());
            }
        }
    }

    @Override // p672ur.InterfaceC45294d
    /* JADX INFO: renamed from: a */
    public void mo100107a() {
        this.activeTime = System.currentTimeMillis();
    }

    @Override // p672ur.InterfaceC45294d
    public void start() {
        stop();
        Timer timer = new Timer("ActiveTrack", true);
        this.activeTimer = timer;
        timer.schedule(new a(), 0L, this.activePeriod);
    }

    @Override // p672ur.InterfaceC45294d
    public void stop() {
        this.activeTime = System.currentTimeMillis();
        Timer timer = this.activeTimer;
        if (timer != null) {
            timer.cancel();
        }
        this.activeTimer = null;
    }

    public /* synthetic */ C45291a(String str, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "push" : str, (i11 & 2) != 0 ? 60000L : j11);
    }
}
