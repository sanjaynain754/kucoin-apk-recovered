package hk;

import android.system.ErrnoException;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.messaging.Constants;
import com.kubi.httpdns.cache.HostRecord;
import com.kubi.httpdns.exception.HttpDnsException;
import com.kubi.httpdns.exception.UnknownException;
import com.kubi.httpdns.interpret.NoServerException;
import com.kubi.httpdns.track.IInterpretTrack;
import com.kubi.httpdns.utils.InstallUtil;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.sdk.constant.monitor.KunlunEventNameEnum;
import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27039d;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import dk.C36724a;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p234ek.C37208f;
import p290gk.C37969b;
import p345ik.C38654b;
import p345ik.C38655c;
import p569qq.C43847h;
import p569qq.C43848i;
import p604rq.InterfaceC44169a;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.random.Random;
import ro.C44128b;

/* JADX INFO: renamed from: hk.d */
/* JADX INFO: compiled from: InterpretTrack.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0005J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\fJ\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\bJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\fJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010\u0005J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010\fJ\u000f\u0010$\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010\bJ\u000f\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b%\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\fJ\u0017\u0010&\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010\u0010J!\u0010*\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b,\u0010\u0010J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010\fJ'\u0010/\u001a\u00020\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00103R\u0016\u00106\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00103R\u0016\u00107\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00103R\u0016\u00108\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00103R\u0016\u00109\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00103R\u0016\u0010:\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00103R\u0016\u0010;\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00103R\u0016\u0010<\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00103R\u0016\u0010=\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00103R\u001a\u0010A\u001a\u00060>j\u0002`?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010@¨\u0006B"}, m90084d2 = {"Lhk/d;", "Lcom/kubi/httpdns/track/IInterpretTrack;", "", "host", "<init>", "(Ljava/lang/String;)V", "", "b", "()V", "", "e", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;)V", "Lcom/kubi/httpdns/cache/HostRecord;", "record", "m", "(Lcom/kubi/httpdns/cache/HostRecord;)V", "g", "d", "Lek/f;", "response", "k", "(Lek/f;)V", "name", "r", "p", "j", CmcdData.Factory.STREAM_TYPE_LIVE, "n", "Lgk/b;", DbParams.KEY_CHANNEL_RESULT, CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lgk/b;)V", "ip", "o", "q", "i", "f", CmcdData.Factory.STREAMING_FORMAT_SS, "callName", "", "isEnd", "u", "(Ljava/lang/String;Z)V", "w", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "x", "y", "(Lcom/kubi/httpdns/cache/HostRecord;Ljava/lang/Throwable;)V", "Ljava/lang/String;", "", "J", "callStart", "c", "callEnd", "interpretStart", "interpretEnd", "probeStart", "probeEnd", "saveStart", "saveEnd", "probeSpeed", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "callChain", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nInterpretTrack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterpretTrack.kt\ncom/kubi/httpdns/track/InterpretTrack\n+ 2 IRequestTrack.kt\ncom/kubi/httpdns/track/IRequestTrackKt\n+ 3 DnsIssueException.kt\ncom/kubi/httpdns/exception/DnsIssueExceptionKt\n+ 4 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 5 KunlunEvent.kt\ncom/kubi/monitor/KunlunEvent\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n*L\n1#1,231:1\n46#2:232\n46#2:233\n46#2:234\n46#2:235\n46#2:236\n46#2:237\n46#2:238\n46#2:239\n46#2:240\n46#2:241\n46#2:242\n46#2:243\n46#2:244\n36#3,14:245\n36#3,14:259\n71#4,4:273\n74#5,12:277\n74#5,12:289\n74#5,12:301\n1#6:313\n35#7,3:314\n*S KotlinDebug\n*F\n+ 1 InterpretTrack.kt\ncom/kubi/httpdns/track/InterpretTrack\n*L\n44#1:232\n49#1:233\n55#1:234\n61#1:235\n66#1:236\n71#1:237\n88#1:238\n93#1:239\n99#1:240\n116#1:241\n121#1:242\n126#1:243\n131#1:244\n141#1:245,14\n152#1:259,14\n168#1:273,4\n179#1:277,12\n184#1:289,12\n191#1:301,12\n213#1:314,3\n*E\n"})
public final class C38225d implements IInterpretTrack {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String host;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long callStart;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public long callEnd;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long interpretStart;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public long interpretEnd;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long probeStart;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long probeEnd;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public long saveStart;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public long saveEnd;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public long probeSpeed;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public StringBuilder callChain;

    /* JADX INFO: renamed from: z */
    public static final String m86294z(int i11, C38225d c38225d, long j11, long j12, long j13, long j14, HostRecord hostRecord, Throwable th2) {
        String strM66919i;
        String string = "code = " + i11 + ",host = " + c38225d.host + ",networkType = " + C38655c.m87384a() + ",networkCarrier = " + C38655c.m87385b() + ",isProxy = " + C38655c.m87389f() + ",isVPN = " + C38655c.m87390g() + ",isNewInstall = " + InstallUtil.f27221a.m31535b() + ", ";
        if (hostRecord != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(", ips = ");
            String[] ips = hostRecord.getIps();
            String str = "";
            if (ips != null && (strM66919i = C27099x.m66919i(ips, false, 2, null)) != null) {
                str = strM66919i;
            }
            sb2.append(str);
            string = sb2.toString();
        }
        if (th2 == null) {
            return string;
        }
        return string + ", exception_type = " + th2.getClass().getCanonicalName() + ", exception_message = " + th2.getMessage();
    }

    @Override // com.kubi.httpdns.track.IInterpretTrack
    /* JADX INFO: renamed from: i */
    public void mo31493i() {
        m86293v(this, "speedEnd", false, 2, null);
    }

    @Override // com.kubi.httpdns.track.IInterpretTrack
    /* JADX INFO: renamed from: j */
    public void mo31494j() {
        m86293v(this, "dnsEnd", false, 2, null);
    }

    /* JADX INFO: renamed from: w */
    public final void m86296w(HostRecord result) {
        try {
            m86290A(this, result, null, 2, null);
        } catch (Throwable th2) {
            String strM87381b = C38654b.f86659a.m87381b();
            if ((th2 instanceof SocketException) || (th2 instanceof NoServerException) || (th2 instanceof SocketTimeoutException) || (th2 instanceof ErrnoException)) {
                C44128b.m97263g(strM87381b, th2);
            } else {
                C36724a.m82299b(th2, strM87381b);
            }
        }
    }

    public C38225d(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.host = host;
        this.callChain = new StringBuilder();
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m86290A(C38225d c38225d, HostRecord hostRecord, Throwable th2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hostRecord = null;
        }
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        c38225d.m86298y(hostRecord, th2);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m86293v(C38225d c38225d, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        c38225d.m86295u(str, z11);
    }

    @Override // com.kubi.httpdns.track.IInterpretTrack
    /* JADX INFO: renamed from: a */
    public void mo31486a(@NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        this.callEnd = System.currentTimeMillis();
        m86295u("callFail", true);
        m86297x(e11);
    }

    @Override // com.kubi.httpdns.track.IInterpretTrack
    /* JADX INFO: renamed from: d */
    public void mo31488d(@NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        this.interpretEnd = System.currentTimeMillis();
        m86293v(this, "interpretFail", false, 2, null);
    }

    @Override // com.kubi.httpdns.track.IInterpretTrack
    /* JADX INFO: renamed from: e */
    public void mo31489e(@NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        this.saveEnd = System.currentTimeMillis();
        m86293v(this, "saveFail", false, 2, null);
    }

    @Override // com.kubi.httpdns.track.IInterpretTrack
    /* JADX INFO: renamed from: h */
    public void mo31492h(@NotNull C37969b result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Integer num = (Integer) ArraysKt.firstOrNull(result.getSpeeds());
        this.probeSpeed = C27039d.m66653m(num != null ? Long.valueOf(num.intValue()) : null, 0L);
        this.probeEnd = System.currentTimeMillis();
        m86293v(this, "probeEnd", false, 2, null);
    }

    @Override // com.kubi.httpdns.track.IInterpretTrack
    /* JADX INFO: renamed from: k */
    public void mo31495k(@NotNull C37208f response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.interpretEnd = System.currentTimeMillis();
        m86293v(this, "interpretEnd", false, 2, null);
    }

    @Override // com.kubi.httpdns.track.IInterpretTrack
    /* JADX INFO: renamed from: m */
    public void mo31497m(@NotNull HostRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        this.callEnd = System.currentTimeMillis();
        m86295u("callEnd", true);
        m86296w(record);
    }

    @Override // com.kubi.httpdns.track.IInterpretTrack
    /* JADX INFO: renamed from: n */
    public void mo31498n(@NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        this.probeEnd = System.currentTimeMillis();
        m86293v(this, "probeFail", false, 2, null);
    }

    @Override // com.kubi.httpdns.track.IInterpretTrack
    /* JADX INFO: renamed from: o */
    public void mo31499o(@NotNull String ip2) {
        Intrinsics.checkNotNullParameter(ip2, "ip");
        m86293v(this, "speedStart(" + ip2 + ')', false, 2, null);
    }

    @Override // com.kubi.httpdns.track.IInterpretTrack
    /* JADX INFO: renamed from: p */
    public void mo31500p(@NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        m86293v(this, "dnsFail", false, 2, null);
    }

    @Override // com.kubi.httpdns.track.IInterpretTrack
    /* JADX INFO: renamed from: q */
    public void mo31501q(@NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        m86293v(this, "speedFail", false, 2, null);
    }

    @Override // com.kubi.httpdns.track.IInterpretTrack
    /* JADX INFO: renamed from: r */
    public void mo31502r(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        m86293v(this, "dnsStart(" + name + ')', false, 2, null);
    }

    @Override // com.kubi.httpdns.track.IInterpretTrack
    /* JADX INFO: renamed from: s */
    public void mo31503s(@NotNull HostRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        this.saveEnd = System.currentTimeMillis();
        m86293v(this, "saveEnd", false, 2, null);
    }

    /* JADX INFO: renamed from: u */
    public final void m86295u(String callName, boolean isEnd) {
        this.callChain.append(callName + '[' + (System.currentTimeMillis() - this.callStart) + ']');
        if (isEnd) {
            return;
        }
        this.callChain.append("->");
    }

    /* JADX INFO: renamed from: y */
    public final void m86298y(HostRecord result, Throwable error) {
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
        long jM86289a2 = C38224c.m86289a(this.interpretEnd, this.interpretStart);
        long jM86289a3 = C38224c.m86289a(this.probeEnd, this.probeStart);
        long jM86289a4 = C38224c.m86289a(this.saveEnd, this.saveStart);
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder.Companion companion = TechnologyEvent.EventParametersBuilder.INSTANCE;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = companion.acquire();
        eventParametersBuilderAcquire.m42391b("code", code);
        eventParametersBuilderAcquire.m42393d("host", this.host);
        eventParametersBuilderAcquire.m42396g(TypedValues.TransitionType.S_DURATION, jM86289a);
        eventParametersBuilderAcquire.m42396g("duration0", jM86289a2);
        eventParametersBuilderAcquire.m42396g("duration1", jM86289a3);
        eventParametersBuilderAcquire.m42396g("duration2", jM86289a4);
        TechnologyEvent.m42388d("httpdns_query", eventParametersBuilderAcquire);
        C43847h.m96575d(KunlunTechEventEnum.CATE_DNS, code);
        KunlunEventNameEnum kunlunEventNameEnum = KunlunEventNameEnum.FRONTEND_HTTPDNS_API_COUNT;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire2 = companion.acquire();
        eventParametersBuilderAcquire2.m42391b("code", code);
        eventParametersBuilderAcquire2.m42393d("domain", this.host);
        eventParametersBuilderAcquire2.m42393d("category", SearchIntents.EXTRA_QUERY);
        TechnologyEvent.C19216a c19216a = TechnologyEvent.C19216a.f35485a;
        Map<String, Object> mapM42399c = c19216a.m42399c(eventParametersBuilderAcquire2);
        Map<String, Number> mapM42398a = c19216a.m42398a(eventParametersBuilderAcquire2);
        for (Iterator<InterfaceC44169a> it = C43848i.f96913a.m96586e().mo32841c().iterator(); it.hasNext(); it = it) {
            InterfaceC44169a next = it.next();
            if (mapM42398a.isEmpty()) {
                next.mo94079b(kunlunEventNameEnum.getEventName(), mapM42399c);
            } else {
                next.mo94078a(kunlunEventNameEnum.getEventName(), mapM42398a, mapM42399c);
            }
        }
        KunlunEventNameEnum kunlunEventNameEnum2 = KunlunEventNameEnum.FRONTEND_HTTPDNS_API_COST_MILLISECONDS;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire3 = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire3.m42391b("code", code);
        eventParametersBuilderAcquire3.m42393d("domain", this.host);
        eventParametersBuilderAcquire3.m42393d("category", SearchIntents.EXTRA_QUERY);
        eventParametersBuilderAcquire3.m42396g(TypedValues.TransitionType.S_DURATION, jM86289a2);
        TechnologyEvent.C19216a c19216a2 = TechnologyEvent.C19216a.f35485a;
        Map<String, Object> mapM42399c2 = c19216a2.m42399c(eventParametersBuilderAcquire3);
        Map<String, Number> mapM42398a2 = c19216a2.m42398a(eventParametersBuilderAcquire3);
        for (InterfaceC44169a interfaceC44169a : C43848i.f96913a.m96586e().mo32841c()) {
            if (mapM42398a2.isEmpty()) {
                interfaceC44169a.mo94079b(kunlunEventNameEnum2.getEventName(), mapM42399c2);
            } else {
                interfaceC44169a.mo94078a(kunlunEventNameEnum2.getEventName(), mapM42398a2, mapM42399c2);
            }
        }
        KunlunEventNameEnum kunlunEventNameEnum3 = KunlunEventNameEnum.FRONTEND_HTTPDNS_API_COST_MILLISECONDS;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire4 = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire4.m42391b("code", code);
        eventParametersBuilderAcquire4.m42393d("domain", this.host);
        eventParametersBuilderAcquire4.m42393d("category", "testSpeed");
        eventParametersBuilderAcquire4.m42396g(TypedValues.TransitionType.S_DURATION, this.probeSpeed);
        TechnologyEvent.C19216a c19216a3 = TechnologyEvent.C19216a.f35485a;
        Map<String, Object> mapM42399c3 = c19216a3.m42399c(eventParametersBuilderAcquire4);
        Map<String, Number> mapM42398a3 = c19216a3.m42398a(eventParametersBuilderAcquire4);
        for (InterfaceC44169a interfaceC44169a2 : C43848i.f96913a.m96586e().mo32841c()) {
            if (mapM42398a3.isEmpty()) {
                interfaceC44169a2.mo94079b(kunlunEventNameEnum3.getEventName(), mapM42399c3);
            } else {
                interfaceC44169a2.mo94078a(kunlunEventNameEnum3.getEventName(), mapM42398a3, mapM42399c3);
            }
        }
        if (code > 0) {
            C44128b.m97261e(C38654b.f86659a.m87381b(), "request doh_error: " + m86294z(code, this, jM86289a, jM86289a2, jM86289a3, jM86289a4, result, error));
            return;
        }
        if (this.probeSpeed + jM86289a2 > 5000) {
            C44128b.m97261e(C38654b.f86659a.m87381b(), "request doh_slow: " + m86294z(code, this, jM86289a, jM86289a2, jM86289a3, jM86289a4, result, error));
            return;
        }
        if (Random.INSTANCE.nextInt(100) == 1) {
            C44128b.m97261e(C38654b.f86659a.m87381b(), "request doh_success: " + m86294z(code, this, jM86289a, jM86289a2, jM86289a3, jM86289a4, result, error));
            return;
        }
        C44128b.m97266j(C38654b.f86659a.m87381b(), "request doh_success: " + m86294z(code, this, jM86289a, jM86289a2, jM86289a3, jM86289a4, result, error));
    }

    @Override // com.kubi.httpdns.track.IInterpretTrack
    /* JADX INFO: renamed from: b */
    public void mo31487b() {
        this.callStart = System.currentTimeMillis();
        m86293v(this, "callStart", false, 2, null);
    }

    @Override // com.kubi.httpdns.track.IInterpretTrack
    /* JADX INFO: renamed from: f */
    public void mo31490f() {
        this.saveStart = System.currentTimeMillis();
        m86293v(this, "saveStart", false, 2, null);
    }

    @Override // com.kubi.httpdns.track.IInterpretTrack
    /* JADX INFO: renamed from: g */
    public void mo31491g() {
        this.interpretStart = System.currentTimeMillis();
        m86293v(this, "interpretStart", false, 2, null);
    }

    @Override // com.kubi.httpdns.track.IInterpretTrack
    /* JADX INFO: renamed from: l */
    public void mo31496l() {
        this.probeStart = System.currentTimeMillis();
        m86293v(this, "probeStart", false, 2, null);
    }

    /* JADX INFO: renamed from: x */
    public final void m86297x(Throwable error) {
        try {
            if (C38655c.m87386c()) {
                m86290A(this, null, error, 1, null);
            }
        } catch (Throwable th2) {
            String strM87381b = C38654b.f86659a.m87381b();
            if (!(th2 instanceof SocketException) && !(th2 instanceof NoServerException) && !(th2 instanceof SocketTimeoutException) && !(th2 instanceof ErrnoException)) {
                C36724a.m82299b(th2, strM87381b);
            } else {
                C44128b.m97263g(strM87381b, th2);
            }
        }
    }
}
