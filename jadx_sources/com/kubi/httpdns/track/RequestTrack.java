package com.kubi.httpdns.track;

import android.system.ErrnoException;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import ck.C4989a;
import com.google.firebase.messaging.Constants;
import com.kubi.httpdns.exception.HttpDnsException;
import com.kubi.httpdns.exception.UnknownException;
import com.kubi.httpdns.interpret.NoServerException;
import com.kubi.httpdns.utils.InstallUtil;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.sdk.constant.monitor.KunlunEventNameEnum;
import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import com.kubi.utils.C27099x;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import dk.C36724a;
import hk.C38224c;
import hk.InterfaceC38223b;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p345ik.C38654b;
import p345ik.C38657e;
import p345ik.SuccessRateStats;
import p569qq.C43847h;
import p569qq.C43848i;
import p604rq.InterfaceC44169a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.random.Random;
import ro.C44128b;

/* JADX INFO: compiled from: RequestTrack.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\n\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\fJ'\u0010\u0013\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/httpdns/track/RequestTrack;", "Lhk/b;", "", "host", "<init>", "(Ljava/lang/String;)V", "", "b", "()V", "", "e", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;)V", "Lck/a;", DbParams.KEY_CHANNEL_RESULT, "c", "(Lck/a;)V", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "f", "g", "(Lck/a;Ljava/lang/Throwable;)V", "Ljava/lang/String;", "", "J", "callStart", "callEnd", "d", "Companion", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRequestTrack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestTrack.kt\ncom/kubi/httpdns/track/RequestTrack\n+ 2 IRequestTrack.kt\ncom/kubi/httpdns/track/IRequestTrackKt\n+ 3 DnsIssueException.kt\ncom/kubi/httpdns/exception/DnsIssueExceptionKt\n+ 4 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 5 KunlunEvent.kt\ncom/kubi/monitor/KunlunEvent\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n*L\n1#1,129:1\n46#2:130\n46#2:131\n46#2:132\n36#3,14:133\n36#3,14:147\n71#4,4:161\n74#5,12:165\n74#5,12:177\n1#6:189\n35#7,3:190\n*S KotlinDebug\n*F\n+ 1 RequestTrack.kt\ncom/kubi/httpdns/track/RequestTrack\n*L\n29#1:130\n33#1:131\n38#1:132\n46#1:133,14\n55#1:147,14\n68#1:161,4\n77#1:165,12\n82#1:177,12\n96#1:190,3\n*E\n"})
public final class RequestTrack implements InterfaceC38223b {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final C38657e f27217e = new C38657e(0, 1, null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String host;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long callStart;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public long callEnd;

    /* JADX INFO: renamed from: e */
    public final void m31529e(C4989a result) {
        try {
            m31525i(this, result, null, 2, null);
        } catch (Throwable th2) {
            String strM87381b = C38654b.f86659a.m87381b();
            if ((th2 instanceof SocketException) || (th2 instanceof NoServerException) || (th2 instanceof SocketTimeoutException) || (th2 instanceof ErrnoException)) {
                C44128b.m97263g(strM87381b, th2);
            } else {
                C36724a.m82299b(th2, strM87381b);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m31530f(Throwable error) {
        try {
            m31525i(this, null, error, 1, null);
        } catch (Throwable th2) {
            String strM87381b = C38654b.f86659a.m87381b();
            if ((th2 instanceof SocketException) || (th2 instanceof NoServerException) || (th2 instanceof SocketTimeoutException) || (th2 instanceof ErrnoException)) {
                C44128b.m97263g(strM87381b, th2);
            } else {
                C36724a.m82299b(th2, strM87381b);
            }
        }
    }

    public RequestTrack(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.host = host;
    }

    /* JADX INFO: renamed from: h */
    public static final String m31524h(int i11, RequestTrack requestTrack, long j11, C4989a c4989a, Throwable th2) {
        String strM66919i;
        String string = "code = " + i11 + ",host = " + requestTrack.host + ",duration = " + j11 + ",isNewInstall = " + InstallUtil.f27221a.m31535b();
        if (c4989a != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(", ips = ");
            String[] ips = c4989a.getIps();
            String str = "";
            if (ips != null && (strM66919i = C27099x.m66919i(ips, false, 2, null)) != null) {
                str = strM66919i;
            }
            sb2.append(str);
            string = sb2.toString();
        }
        if (c4989a != null) {
            string = string + ", is_expire_ip = " + c4989a.m5294e();
        }
        if (th2 == null) {
            return string;
        }
        return string + ", exception_type = " + th2.getClass().getCanonicalName() + ", exception_message = " + th2.getMessage();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m31525i(RequestTrack requestTrack, C4989a c4989a, Throwable th2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            c4989a = null;
        }
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        requestTrack.m31531g(c4989a, th2);
    }

    @Override // hk.InterfaceC38223b
    /* JADX INFO: renamed from: a */
    public void mo31526a(@NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        this.callEnd = System.currentTimeMillis();
        m31530f(e11);
    }

    @Override // hk.InterfaceC38223b
    /* JADX INFO: renamed from: c */
    public void mo31528c(@NotNull C4989a result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.callEnd = System.currentTimeMillis();
        m31529e(result);
    }

    /* JADX INFO: renamed from: g */
    public final void m31531g(C4989a result, Throwable error) {
        int code;
        if (result == null) {
            HttpDnsException unknownException = error instanceof HttpDnsException ? (HttpDnsException) error : null;
            if (unknownException == null) {
                unknownException = new UnknownException(error);
            }
            code = unknownException.getCode();
        } else {
            code = 0;
        }
        long jM86289a = C38224c.m86289a(this.callEnd, this.callStart);
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder.Companion companion = TechnologyEvent.EventParametersBuilder.INSTANCE;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = companion.acquire();
        eventParametersBuilderAcquire.m42391b("code", code);
        eventParametersBuilderAcquire.m42393d("host", this.host);
        TechnologyEvent.C19216a.m42397b(eventParametersBuilderAcquire);
        eventParametersBuilderAcquire.m42396g(TypedValues.TransitionType.S_DURATION, jM86289a);
        TechnologyEvent.m42388d("httpdns_host2ip", eventParametersBuilderAcquire);
        C43847h.m96575d(KunlunTechEventEnum.CATE_DNS, code);
        KunlunEventNameEnum kunlunEventNameEnum = KunlunEventNameEnum.FRONTEND_HTTPDNS_API_COUNT;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire2 = companion.acquire();
        eventParametersBuilderAcquire2.m42391b("code", code);
        eventParametersBuilderAcquire2.m42393d("domain", this.host);
        eventParametersBuilderAcquire2.m42393d("category", "host2ip");
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
        KunlunEventNameEnum kunlunEventNameEnum2 = KunlunEventNameEnum.FRONTEND_HTTPDNS_API_COST_MILLISECONDS;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire3 = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire3.m42391b("code", code);
        eventParametersBuilderAcquire3.m42393d("domain", this.host);
        eventParametersBuilderAcquire3.m42393d("category", "host2ip");
        eventParametersBuilderAcquire3.m42396g(TypedValues.TransitionType.S_DURATION, jM86289a);
        TechnologyEvent.C19216a c19216a2 = TechnologyEvent.C19216a.f35485a;
        Map<String, Object> mapM42399c2 = c19216a2.m42399c(eventParametersBuilderAcquire3);
        Map<String, Number> mapM42398a2 = c19216a2.m42398a(eventParametersBuilderAcquire3);
        for (InterfaceC44169a interfaceC44169a2 : C43848i.f96913a.m96586e().mo32841c()) {
            if (mapM42398a2.isEmpty()) {
                interfaceC44169a2.mo94079b(kunlunEventNameEnum2.getEventName(), mapM42399c2);
            } else {
                interfaceC44169a2.mo94078a(kunlunEventNameEnum2.getEventName(), mapM42398a2, mapM42399c2);
            }
        }
        if (code > 0) {
            C44128b.m97261e(C38654b.f86659a.m87381b(), "request httpdns_error: " + m31524h(code, this, jM86289a, result, error));
        } else if (Random.INSTANCE.nextInt(100) == 1) {
            C44128b.m97261e(C38654b.f86659a.m87381b(), "request httpdns_success: " + m31524h(code, this, jM86289a, result, error));
        } else {
            C44128b.m97266j(C38654b.f86659a.m87381b(), "request httpdns_success: " + m31524h(code, this, jM86289a, result, error));
        }
        SuccessRateStats successRateStatsM87393a = f27217e.m87393a(code != 0);
        if (successRateStatsM87393a != null) {
            C44128b.m97261e(C38654b.f86659a.m87381b(), "request httpdns_success_rate: windowSuccessRate = " + successRateStatsM87393a.getWindowSuccessRate() + ", totalSuccessRate = " + successRateStatsM87393a.getTotalSuccessRate());
        }
    }

    @Override // hk.InterfaceC38223b
    /* JADX INFO: renamed from: b */
    public void mo31527b() {
        this.callStart = System.currentTimeMillis();
    }
}
