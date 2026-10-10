package p290gk;

import android.system.ErrnoException;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.httpdns.HttpDnsConfig;
import com.kubi.httpdns.ProbeConfig;
import com.kubi.httpdns.exception.ProbeException;
import com.kubi.httpdns.interpret.NoServerException;
import com.kubi.httpdns.probe.ProbeExistException;
import com.kubi.httpdns.track.IInterpretTrack;
import dk.C36724a;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.Comparator;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p234ek.C37207e;
import p345ik.C38653a;
import p345ik.C38656d;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.CloseableKt;
import ro.C44128b;

/* JADX INFO: renamed from: gk.c */
/* JADX INFO: compiled from: ProbeServiceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0012\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019¨\u0006\u001b"}, m90084d2 = {"Lgk/c;", "Lgk/a;", "Lcom/kubi/httpdns/HttpDnsConfig;", "config", "<init>", "(Lcom/kubi/httpdns/HttpDnsConfig;)V", "Lek/e;", "request", "", "", "ips", "Lgk/b;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lek/e;[Ljava/lang/String;)Lgk/b;", "", "port", "Lcom/kubi/httpdns/track/IInterpretTrack;", "track", "b", "([Ljava/lang/String;ILcom/kubi/httpdns/track/IInterpretTrack;)Lgk/b;", "ip", "c", "(Ljava/lang/String;ILcom/kubi/httpdns/track/IInterpretTrack;)I", "Lcom/kubi/httpdns/HttpDnsConfig;", "Lik/d;", "Lik/d;", "probeRecorder", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nProbeServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProbeServiceImpl.kt\ncom/kubi/httpdns/probe/ProbeServiceImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 DnsIssueException.kt\ncom/kubi/httpdns/exception/DnsIssueExceptionKt\n*L\n1#1,69:1\n288#2,2:70\n6469#3:72\n37#4,2:73\n1#5:75\n36#6,14:76\n*S KotlinDebug\n*F\n+ 1 ProbeServiceImpl.kt\ncom/kubi/httpdns/probe/ProbeServiceImpl\n*L\n29#1:70,2\n49#1:72\n49#1:73,2\n63#1:76,14\n*E\n"})
public final class C37970c implements InterfaceC37968a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final HttpDnsConfig config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C38656d probeRecorder;

    /* JADX INFO: renamed from: gk.c$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    /* JADX INFO: loaded from: classes16.dex */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ProbeServiceImpl.kt\ncom/kubi/httpdns/probe/ProbeServiceImpl\n*L\n1#1,328:1\n49#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Integer.valueOf(((Number) t11).intValue()), Integer.valueOf(((Number) t12).intValue()));
        }
    }

    /* JADX INFO: renamed from: b */
    public final C37969b m85813b(String[] ips, int port, IInterpretTrack track) {
        int[] iArr = new int[ips.length];
        int length = ips.length;
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = m85814c(ips[i11], port, track);
        }
        return new C37969b(C38653a.f86655a.m87379e(ips, iArr), (Integer[]) ArraysKt.sortedWith(iArr, (Comparator<? super Integer>) new a()).toArray(new Integer[0]));
    }

    public C37970c(@NotNull HttpDnsConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.probeRecorder = new C38656d();
    }

    @Override // p290gk.InterfaceC37968a
    @NotNull
    /* JADX INFO: renamed from: a */
    public C37969b mo85810a(@NotNull C37207e request, @NotNull String[] ips) throws ProbeException {
        Object next;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(ips, "ips");
        try {
            String host = request.getHost();
            Iterator<T> it = this.config.getProbeConfig().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((ProbeConfig) next).getHost(), host));
            ProbeConfig probeConfig = (ProbeConfig) next;
            if (probeConfig == null) {
                return new C37969b(ips, null, 2, null);
            }
            int port = probeConfig.getPort();
            if (!this.probeRecorder.m87391a(host)) {
                throw new ProbeExistException();
            }
            try {
                return m85813b(ips, port, (IInterpretTrack) request.m83245b(IInterpretTrack.Companion.TAG));
            } finally {
                this.probeRecorder.m87392b(host);
            }
        } catch (Throwable th2) {
            throw new ProbeException(th2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m85814c(String ip2, int port, IInterpretTrack track) {
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (track != null) {
            try {
                track.mo31499o(ip2);
            } catch (Throwable th2) {
                if (track != null) {
                    track.mo31501q(th2);
                }
                if (!(th2 instanceof SocketException) && !(th2 instanceof NoServerException) && !(th2 instanceof SocketTimeoutException) && !(th2 instanceof ErrnoException)) {
                    C36724a.m82299b(th2, "ProbeServiceImpl");
                } else {
                    C44128b.m97263g("ProbeServiceImpl", th2);
                }
                jCurrentTimeMillis = Long.MAX_VALUE;
            }
        }
        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress(ip2, port), 5000);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(socket, null);
            if (track != null) {
                track.mo31493i();
            }
            jCurrentTimeMillis = System.currentTimeMillis();
            return (int) (jCurrentTimeMillis - jCurrentTimeMillis2);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.closeFinally(socket, th3);
                throw th4;
            }
        }
    }
}
