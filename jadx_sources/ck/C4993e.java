package ck;

import android.system.ErrnoException;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.blankj.utilcode.util.NetworkUtils;
import com.kubi.httpdns.HttpDnsConfig;
import com.kubi.httpdns.cache.CacheServiceImpl;
import com.kubi.httpdns.cache.HostRecord;
import com.kubi.httpdns.cache.InterfaceC15195a;
import com.kubi.httpdns.exception.CacheException;
import com.kubi.httpdns.exception.ExpiredResultException;
import com.kubi.httpdns.exception.InterpretException;
import com.kubi.httpdns.exception.NoResultException;
import com.kubi.httpdns.exception.ProbeException;
import com.kubi.httpdns.exception.UnknownException;
import com.kubi.httpdns.interpret.IpInfo;
import com.kubi.httpdns.interpret.NoServerException;
import com.kubi.httpdns.network.NetworkServiceImpl;
import com.kubi.httpdns.track.IInterpretTrack;
import dk.C36724a;
import fk.InterfaceC37559a;
import fk.InterfaceC37560b;
import hk.InterfaceC38223b;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p234ek.C37207e;
import p234ek.C37208f;
import p234ek.C37209g;
import p234ek.InterfaceC37206d;
import p290gk.C37969b;
import p290gk.C37970c;
import p290gk.InterfaceC37968a;
import p345ik.C38653a;
import p345ik.C38654b;
import p345ik.C38656d;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: ck.e */
/* JADX INFO: compiled from: HttpDnsServiceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J!\u0010\u001b\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, m90084d2 = {"Lck/e;", "Lck/f;", "Lfk/a;", "Lcom/kubi/httpdns/HttpDnsConfig;", "config", "Lcom/kubi/httpdns/cache/a;", "cacheService", "Lgk/a;", "probeService", "Lek/d;", "interpretService", "Lfk/b;", "networkService", "<init>", "(Lcom/kubi/httpdns/HttpDnsConfig;Lcom/kubi/httpdns/cache/a;Lgk/a;Lek/d;Lfk/b;)V", "", "host", "Lck/a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Lck/a;", "", "b", "()V", "k", "f", "", "interpret", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;Z)Lck/a;", "i", "(Ljava/lang/String;)V", "Lcom/kubi/httpdns/HttpDnsConfig;", "Lcom/kubi/httpdns/cache/a;", "c", "Lgk/a;", "d", "Lek/d;", "e", "Lfk/b;", "Ljava/lang/String;", "TAG", "Lik/d;", "g", "Lik/d;", "handleRecorder", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHttpDnsServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpDnsServiceImpl.kt\ncom/kubi/httpdns/core/HttpDnsServiceImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 DnsIssueException.kt\ncom/kubi/httpdns/exception/DnsIssueExceptionKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1855#2,2:211\n1855#2,2:213\n1549#2:229\n1620#2,3:230\n1549#2:235\n1620#2,3:236\n1549#2:240\n1620#2,3:241\n36#3,14:215\n36#3,14:244\n36#3,14:258\n36#3,14:272\n36#3,14:286\n37#4,2:233\n1#5:239\n*S KotlinDebug\n*F\n+ 1 HttpDnsServiceImpl.kt\ncom/kubi/httpdns/core/HttpDnsServiceImpl\n*L\n55#1:211,2\n62#1:213,2\n160#1:229\n160#1:230,3\n168#1:235\n168#1:236,3\n175#1:240\n175#1:241,3\n64#1:215,14\n183#1:244,14\n187#1:258,14\n191#1:272,14\n195#1:286,14\n160#1:233,2\n*E\n"})
public final class C4993e implements InterfaceC4994f, InterfaceC37559a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final HttpDnsConfig config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC15195a cacheService;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC37968a probeService;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC37206d interpretService;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC37560b networkService;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C38656d handleRecorder;

    public C4993e(@NotNull HttpDnsConfig config, @NotNull InterfaceC15195a cacheService, @NotNull InterfaceC37968a probeService, @NotNull InterfaceC37206d interpretService, @NotNull InterfaceC37560b networkService) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(cacheService, "cacheService");
        Intrinsics.checkNotNullParameter(probeService, "probeService");
        Intrinsics.checkNotNullParameter(interpretService, "interpretService");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        this.config = config;
        this.cacheService = cacheService;
        this.probeService = probeService;
        this.interpretService = interpretService;
        this.networkService = networkService;
        this.TAG = "HttpDnsServiceImpl";
        this.handleRecorder = new C38656d();
        m5305k();
        networkService.mo31476a(this);
    }

    /* JADX INFO: renamed from: g */
    public static final void m5298g(C4993e this$0) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Result.Companion companion = Result.INSTANCE;
            Iterator<T> it = this$0.cacheService.mo31463a().iterator();
            while (it.hasNext()) {
                this$0.m5303h(((C4989a) it.next()).getHost(), true);
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            String strM87381b = C38654b.f86659a.m87381b();
            if ((thM103847exceptionOrNullimpl instanceof SocketException) || (thM103847exceptionOrNullimpl instanceof NoServerException) || (thM103847exceptionOrNullimpl instanceof SocketTimeoutException) || (thM103847exceptionOrNullimpl instanceof ErrnoException)) {
                C44128b.m97263g(strM87381b, thM103847exceptionOrNullimpl);
            } else {
                C36724a.m82299b(thM103847exceptionOrNullimpl, strM87381b);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m5299j(C4993e this$0, String str) {
        String host = str;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(host, "$host");
        if (!NetworkUtils.m6063k()) {
            return;
        }
        if (!this$0.handleRecorder.m87391a(host)) {
            C44128b.m97265i("request host[" + host + "] running");
            return;
        }
        IInterpretTrack iInterpretTrackMo31504a = this$0.config.getInterpretTrackFactory().mo31504a(host);
        iInterpretTrackMo31504a.mo31487b();
        try {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C37207e c37207e = new C37207e(host);
                c37207e.m83246c(IInterpretTrack.Companion.TAG, iInterpretTrackMo31504a);
                iInterpretTrackMo31504a.mo31491g();
                C37208f c37208fMo83243a = this$0.interpretService.mo83243a(c37207e);
                iInterpretTrackMo31504a.mo31495k(c37208fMo83243a);
                iInterpretTrackMo31504a.mo31496l();
                InterfaceC37968a interfaceC37968a = this$0.probeService;
                List<IpInfo> listM83247a = c37208fMo83243a.m83247a();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM83247a, 10));
                Iterator<T> it = listM83247a.iterator();
                while (it.hasNext()) {
                    arrayList.add(((IpInfo) it.next()).getIp());
                }
                C37969b c37969bMo85810a = interfaceC37968a.mo85810a(c37207e, (String[]) arrayList.toArray(new String[0]));
                iInterpretTrackMo31504a.mo31492h(c37969bMo85810a);
                iInterpretTrackMo31504a.mo31490f();
                String[] ips = c37969bMo85810a.getIps();
                List<IpInfo> listM83247a2 = c37208fMo83243a.m83247a();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM83247a2, 10));
                Iterator<T> it2 = listM83247a2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(((IpInfo) it2.next()).getTtl()));
                }
                Iterator it3 = arrayList2.iterator();
                if (!it3.hasNext()) {
                    throw new NoSuchElementException();
                }
                int iIntValue = ((Number) it3.next()).intValue();
                while (it3.hasNext()) {
                    int iIntValue2 = ((Number) it3.next()).intValue();
                    if (iIntValue > iIntValue2) {
                        iIntValue = iIntValue2;
                    }
                }
                HostRecord hostRecord = new HostRecord(host, ips, iIntValue, jCurrentTimeMillis);
                try {
                    InterfaceC15195a interfaceC15195a = this$0.cacheService;
                    String[] ips2 = c37969bMo85810a.getIps();
                    List<IpInfo> listM83247a3 = c37208fMo83243a.m83247a();
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM83247a3, 10));
                    Iterator<T> it4 = listM83247a3.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(Integer.valueOf(((IpInfo) it4.next()).getTtl()));
                    }
                    Iterator it5 = arrayList3.iterator();
                    if (!it5.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    int iIntValue3 = ((Number) it5.next()).intValue();
                    while (it5.hasNext()) {
                        int iIntValue4 = ((Number) it5.next()).intValue();
                        if (iIntValue3 > iIntValue4) {
                            iIntValue3 = iIntValue4;
                        }
                    }
                    InterfaceC15195a.a.m31468a(interfaceC15195a, new HostRecord(str, ips2, iIntValue3, jCurrentTimeMillis), 0, false, 6, null);
                    iInterpretTrackMo31504a.mo31503s(hostRecord);
                    iInterpretTrackMo31504a.mo31497m(hostRecord);
                    this$0.handleRecorder.m87392b(str);
                } catch (CacheException e11) {
                    e = e11;
                    host = str;
                    C36724a.m82299b(e, C38654b.f86659a.m87381b());
                    iInterpretTrackMo31504a.mo31489e(e);
                    iInterpretTrackMo31504a.mo31486a(e);
                    this$0.handleRecorder.m87392b(host);
                } catch (InterpretException e12) {
                    e = e12;
                    host = str;
                    C36724a.m82299b(e, C38654b.f86659a.m87381b());
                    iInterpretTrackMo31504a.mo31488d(e);
                    iInterpretTrackMo31504a.mo31486a(e);
                    this$0.handleRecorder.m87392b(host);
                } catch (ProbeException e13) {
                    e = e13;
                    host = str;
                    C36724a.m82299b(e, C38654b.f86659a.m87381b());
                    iInterpretTrackMo31504a.mo31498n(e);
                    iInterpretTrackMo31504a.mo31486a(e);
                    this$0.handleRecorder.m87392b(host);
                } catch (Throwable th2) {
                    th = th2;
                    host = str;
                    String strM87381b = C38654b.f86659a.m87381b();
                    if ((th instanceof SocketException) || (th instanceof NoServerException) || (th instanceof SocketTimeoutException) || (th instanceof ErrnoException)) {
                        C44128b.m97263g(strM87381b, th);
                    } else {
                        C36724a.m82299b(th, strM87381b);
                    }
                    iInterpretTrackMo31504a.mo31486a(new UnknownException(th));
                    this$0.handleRecorder.m87392b(host);
                }
            } catch (Throwable th3) {
                this$0.handleRecorder.m87392b(host);
                throw th3;
            }
        } catch (CacheException e14) {
            e = e14;
        } catch (InterpretException e15) {
            e = e15;
        } catch (ProbeException e16) {
            e = e16;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m5300l(C4993e this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<T> it = this$0.config.getPreFetchHost().iterator();
        while (it.hasNext()) {
            this$0.m5303h((String) it.next(), true);
        }
    }

    @Override // ck.InterfaceC4994f
    @Nullable
    /* JADX INFO: renamed from: a */
    public C4989a mo1477a(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return m5303h(host, false);
    }

    /* JADX INFO: renamed from: h */
    public final C4989a m5303h(String host, boolean interpret) {
        if (!this.config.getDnsEnable()) {
            C44128b.m97265i("service is disabled");
            return null;
        }
        C38653a c38653a = C38653a.f86655a;
        if (!c38653a.m87377c(host)) {
            C44128b.m97269m(host + " is invalid. ");
            return null;
        }
        if (c38653a.m87378d(host)) {
            C44128b.m97269m(host + " is ip. ");
            return null;
        }
        InterfaceC38223b interfaceC38223bMo86287a = this.config.getRequestTrackFactory().mo86287a(host);
        interfaceC38223bMo86287a.mo31527b();
        try {
            C4989a c4989aQuery = this.cacheService.query(host);
            if (interpret || c4989aQuery == null || c4989aQuery.getFromDisk() || c4989aQuery.m5294e()) {
                m5304i(host);
            }
            if (c4989aQuery == null) {
                throw new NoResultException("request host[" + host + "] not found return null");
            }
            if (!this.config.getAllowExpiredIp() && c4989aQuery.m5294e()) {
                throw new ExpiredResultException("request host[" + host + "] expired return null");
            }
            interfaceC38223bMo86287a.mo31528c(c4989aQuery);
            return c4989aQuery;
        } catch (Exception e11) {
            interfaceC38223bMo86287a.mo31526a(e11);
            return null;
        }
    }

    @Override // fk.InterfaceC37559a
    /* JADX INFO: renamed from: b */
    public void mo5301b() {
        m5302f();
    }

    /* JADX INFO: renamed from: f */
    public final void m5302f() {
        C42917g.m94137c().execute(new Runnable() { // from class: ck.d
            @Override // java.lang.Runnable
            public final void run() {
                C4993e.m5298g(this.f5569b);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m5304i(final String host) {
        C42917g.m94138d().execute(new Runnable() { // from class: ck.c
            @Override // java.lang.Runnable
            public final void run() {
                C4993e.m5299j(this.f5567b, host);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m5305k() {
        C42917g.m94137c().execute(new Runnable() { // from class: ck.b
            @Override // java.lang.Runnable
            public final void run() {
                C4993e.m5300l(this.f5566b);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C4993e(HttpDnsConfig httpDnsConfig, InterfaceC15195a interfaceC15195a, InterfaceC37968a interfaceC37968a, InterfaceC37206d interfaceC37206d, InterfaceC37560b interfaceC37560b, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(httpDnsConfig, (i11 & 2) != 0 ? new CacheServiceImpl(httpDnsConfig) : interfaceC15195a, (i11 & 4) != 0 ? new C37970c(httpDnsConfig) : interfaceC37968a, (i11 & 8) != 0 ? new C37209g(httpDnsConfig, null, 2, 0 == true ? 1 : 0) : interfaceC37206d, (i11 & 16) != 0 ? new NetworkServiceImpl(httpDnsConfig) : interfaceC37560b);
    }
}
