package com.kubi.httpdns.track;

import android.system.ErrnoException;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import ck.C4989a;
import com.google.firebase.messaging.Constants;
import com.kubi.httpdns.interpret.NoServerException;
import com.kubi.httpdns.utils.InstallUtil;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.sdk.constant.monitor.KunlunEventNameEnum;
import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import com.kubi.utils.C27099x;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import dk.C36724a;
import hk.C38224c;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p345ik.C38654b;
import p345ik.C38655c;
import p345ik.C38657e;
import p345ik.SuccessRateStats;
import p569qq.C43847h;
import p569qq.C43848i;
import p604rq.InterfaceC44169a;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.random.Random;
import ro.C44128b;

/* JADX INFO: compiled from: LookupTrack.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\bJ\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\fJ\u001d\u0010\u001a\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010 \u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010\u0013J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010\fJ9\u0010$\u001a\u00020\u00062\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010(R\u0016\u0010+\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010(R\u0016\u0010,\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010(R\u0016\u0010-\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010(R\u0016\u0010.\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010(R\u001a\u00102\u001a\u00060/j\u0002`08\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00101¨\u00064"}, m90084d2 = {"Lcom/kubi/httpdns/track/LookupTrack;", "Lcom/kubi/httpdns/track/ILookupTrack;", "", "host", "<init>", "(Ljava/lang/String;)V", "", "b", "()V", "", "e", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;)V", "", "Ljava/net/InetAddress;", DbParams.KEY_CHANNEL_RESULT, "", "fromSystem", "f", "(Ljava/util/List;Z)V", "i", "Lck/a;", "g", "(Lck/a;)V", "d", "c", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/util/List;)V", "callName", "isEnd", "k", "(Ljava/lang/String;Z)V", "m", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "n", "response", "o", "(Ljava/util/List;Ljava/lang/Throwable;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "", "J", "callStart", "callEnd", "httpDnsStart", "httpDnsEnd", "systemDnsStart", "systemDnsEnd", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "callChain", "Companion", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLookupTrack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookupTrack.kt\ncom/kubi/httpdns/track/LookupTrack\n+ 2 IRequestTrack.kt\ncom/kubi/httpdns/track/IRequestTrackKt\n+ 3 DnsIssueException.kt\ncom/kubi/httpdns/exception/DnsIssueExceptionKt\n+ 4 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 5 KunlunEvent.kt\ncom/kubi/monitor/KunlunEvent\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n*L\n1#1,198:1\n46#2:199\n46#2:200\n46#2:201\n46#2:202\n46#2:203\n46#2:204\n46#2:205\n46#2:206\n46#2:207\n46#2:208\n36#3,14:209\n36#3,14:223\n71#4,4:237\n74#5,12:241\n74#5,12:253\n1#6:265\n1549#7:266\n1620#7,3:267\n35#8,3:270\n*S KotlinDebug\n*F\n+ 1 LookupTrack.kt\ncom/kubi/httpdns/track/LookupTrack\n*L\n34#1:199\n39#1:200\n45#1:201\n51#1:202\n56#1:203\n61#1:204\n66#1:205\n71#1:206\n76#1:207\n81#1:208\n91#1:209,14\n102#1:223,14\n123#1:237,4\n134#1:241,12\n139#1:253,12\n161#1:266\n161#1:267,3\n161#1:270,3\n*E\n"})
public final class LookupTrack implements ILookupTrack {

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final C38657e f27207j = new C38657e(0, 1, null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String host;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long callStart;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public long callEnd;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long httpDnsStart;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public long httpDnsEnd;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long systemDnsStart;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long systemDnsEnd;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public StringBuilder callChain;

    /* JADX INFO: renamed from: p */
    public static final String m31517p(int i11, LookupTrack lookupTrack, long j11, long j12, long j13, Boolean bool, List<? extends InetAddress> list, Throwable th2) {
        String string = "code = " + i11 + ",host = " + lookupTrack.host + ",networkType = " + C38655c.m87384a() + ",networkCarrier = " + C38655c.m87385b() + ",isProxy = " + C38655c.m87389f() + ",isVPN = " + C38655c.m87390g() + ",isNewInstall = " + InstallUtil.f27221a.m31535b() + ",duration = " + j11 + ",httpDnsDuration = " + j12 + ",systemDnsDuration = " + j13 + ",callChain = " + ((Object) lookupTrack.callChain);
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(", strategy = ");
            sb2.append(zBooleanValue ? "system" : "doh");
            string = sb2.toString();
        }
        if (list != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            sb3.append(", ips = ");
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InetAddress) it.next()).getHostAddress());
            }
            String strM66919i = C27099x.m66919i(arrayList, false, 2, null);
            if (strM66919i == null) {
                strM66919i = "";
            }
            sb3.append(strM66919i);
            string = sb3.toString();
        }
        if (th2 == null) {
            return string;
        }
        return string + ", exception_type = " + th2.getClass().getCanonicalName() + ", exception_message = " + th2.getMessage();
    }

    /* JADX INFO: renamed from: o */
    public final void m31522o(List<? extends InetAddress> response, Throwable error, Boolean fromSystem) {
        int i11 = fromSystem == null ? AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH : fromSystem.booleanValue() ? 0 : 10000;
        long jM86289a = C38224c.m86289a(this.callEnd, this.callStart);
        long jM86289a2 = C38224c.m86289a(this.httpDnsEnd, this.httpDnsStart);
        long jM86289a3 = C38224c.m86289a(this.systemDnsEnd, this.systemDnsStart);
        TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
        TechnologyEvent.EventParametersBuilder.Companion companion = TechnologyEvent.EventParametersBuilder.INSTANCE;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = companion.acquire();
        eventParametersBuilderAcquire.m42391b("code", i11);
        eventParametersBuilderAcquire.m42393d("host", this.host);
        eventParametersBuilderAcquire.m42396g(TypedValues.TransitionType.S_DURATION, jM86289a);
        eventParametersBuilderAcquire.m42396g("duration1", jM86289a2);
        eventParametersBuilderAcquire.m42396g("duration2", jM86289a3);
        TechnologyEvent.C19216a.m42397b(eventParametersBuilderAcquire);
        TechnologyEvent.m42388d("httpdns_lookup", eventParametersBuilderAcquire);
        C43847h.m96575d(KunlunTechEventEnum.CATE_DNS, i11);
        KunlunEventNameEnum kunlunEventNameEnum = KunlunEventNameEnum.FRONTEND_HTTPDNS_API_COUNT;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire2 = companion.acquire();
        eventParametersBuilderAcquire2.m42391b("code", i11);
        eventParametersBuilderAcquire2.m42393d("domain", this.host);
        eventParametersBuilderAcquire2.m42393d("category", "lookup");
        TechnologyEvent.C19216a c19216a = TechnologyEvent.C19216a.f35485a;
        Map<String, Object> mapM42399c = c19216a.m42399c(eventParametersBuilderAcquire2);
        Map<String, Number> mapM42398a = c19216a.m42398a(eventParametersBuilderAcquire2);
        for (InterfaceC44169a interfaceC44169a : C43848i.f96913a.m96586e().mo32841c()) {
            long j11 = jM86289a2;
            if (mapM42398a.isEmpty()) {
                interfaceC44169a.mo94079b(kunlunEventNameEnum.getEventName(), mapM42399c);
            } else {
                interfaceC44169a.mo94078a(kunlunEventNameEnum.getEventName(), mapM42398a, mapM42399c);
            }
            jM86289a2 = j11;
        }
        long j12 = jM86289a2;
        KunlunEventNameEnum kunlunEventNameEnum2 = KunlunEventNameEnum.FRONTEND_HTTPDNS_API_COST_MILLISECONDS;
        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire3 = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
        eventParametersBuilderAcquire3.m42391b("code", i11);
        eventParametersBuilderAcquire3.m42393d("domain", this.host);
        eventParametersBuilderAcquire3.m42393d("category", "lookup");
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
        if (i11 > 0) {
            C44128b.m97261e(C38654b.f86659a.m87381b(), "request lookup_error: " + m31517p(i11, this, jM86289a, j12, jM86289a3, fromSystem, response, error));
        } else if (jM86289a > 5000) {
            C44128b.m97261e(C38654b.f86659a.m87381b(), "request lookup_slow: " + m31517p(i11, this, jM86289a, j12, jM86289a3, fromSystem, response, error));
        } else if (Random.INSTANCE.nextInt(100) == 1) {
            C44128b.m97261e(C38654b.f86659a.m87381b(), "request lookup_success: " + m31517p(i11, this, jM86289a, j12, jM86289a3, fromSystem, response, error));
        } else {
            C44128b.m97266j(C38654b.f86659a.m87381b(), "request lookup_success: " + m31517p(i11, this, jM86289a, j12, jM86289a3, fromSystem, response, error));
        }
        SuccessRateStats successRateStatsM87393a = f27207j.m87393a(i11 != 20000);
        if (successRateStatsM87393a != null) {
            C44128b.m97261e(C38654b.f86659a.m87381b(), "request lookup_success_rate: windowSuccessRate = " + successRateStatsM87393a.getWindowSuccessRate() + ", totalSuccessRate = " + successRateStatsM87393a.getTotalSuccessRate());
        }
    }

    public LookupTrack(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.host = host;
        this.callChain = new StringBuilder();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m31516l(LookupTrack lookupTrack, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        lookupTrack.m31519k(str, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m31518q(LookupTrack lookupTrack, List list, Throwable th2, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = null;
        }
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        if ((i11 & 4) != 0) {
            bool = null;
        }
        lookupTrack.m31522o(list, th2, bool);
    }

    @Override // com.kubi.httpdns.track.ILookupTrack
    /* JADX INFO: renamed from: a */
    public void mo31505a(@NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        this.callEnd = System.currentTimeMillis();
        m31519k("callFail", true);
        m31521n(e11);
    }

    @Override // com.kubi.httpdns.track.ILookupTrack
    /* JADX INFO: renamed from: c */
    public void mo31507c(@NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        this.systemDnsEnd = System.currentTimeMillis();
        m31516l(this, "systemsDnsFail", false, 2, null);
    }

    @Override // com.kubi.httpdns.track.ILookupTrack
    /* JADX INFO: renamed from: f */
    public void mo31510f(@NotNull List<? extends InetAddress> result, boolean fromSystem) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.callEnd = System.currentTimeMillis();
        m31519k("callEnd", true);
        m31520m(result, fromSystem);
    }

    @Override // com.kubi.httpdns.track.ILookupTrack
    /* JADX INFO: renamed from: g */
    public void mo31511g(@NotNull C4989a result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.httpDnsEnd = System.currentTimeMillis();
        m31516l(this, "httpDnsEnd", false, 2, null);
    }

    @Override // com.kubi.httpdns.track.ILookupTrack
    /* JADX INFO: renamed from: h */
    public void mo31512h(@NotNull List<? extends InetAddress> result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.systemDnsEnd = System.currentTimeMillis();
        m31516l(this, "systemDnsEnd", false, 2, null);
    }

    @Override // com.kubi.httpdns.track.ILookupTrack
    /* JADX INFO: renamed from: i */
    public void mo31513i(@NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        this.httpDnsEnd = System.currentTimeMillis();
        m31516l(this, "httpDnsFail", false, 2, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m31519k(String callName, boolean isEnd) {
        this.callChain.append(callName + '[' + (System.currentTimeMillis() - this.callStart) + ']');
        if (isEnd) {
            return;
        }
        this.callChain.append("->");
    }

    @Override // com.kubi.httpdns.track.ILookupTrack
    /* JADX INFO: renamed from: b */
    public void mo31506b() {
        this.callStart = System.currentTimeMillis();
        m31516l(this, "callStart", false, 2, null);
    }

    @Override // com.kubi.httpdns.track.ILookupTrack
    /* JADX INFO: renamed from: d */
    public void mo31508d() {
        this.systemDnsStart = System.currentTimeMillis();
        m31516l(this, "systemDnsStart", false, 2, null);
    }

    @Override // com.kubi.httpdns.track.ILookupTrack
    /* JADX INFO: renamed from: e */
    public void mo31509e() {
        this.httpDnsStart = System.currentTimeMillis();
        m31516l(this, "httpDnsStart", false, 2, null);
    }

    /* JADX INFO: renamed from: m */
    public final void m31520m(List<? extends InetAddress> result, boolean fromSystem) {
        try {
            m31518q(this, result, null, Boolean.valueOf(fromSystem), 2, null);
        } catch (Throwable th2) {
            String strM87381b = C38654b.f86659a.m87381b();
            if (!(th2 instanceof SocketException) && !(th2 instanceof NoServerException) && !(th2 instanceof SocketTimeoutException) && !(th2 instanceof ErrnoException)) {
                C36724a.m82299b(th2, strM87381b);
            } else {
                C44128b.m97263g(strM87381b, th2);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m31521n(Throwable error) {
        try {
            if (C38655c.m87386c()) {
                m31518q(this, null, error, null, 5, null);
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
