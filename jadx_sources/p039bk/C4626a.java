package p039bk;

import android.system.ErrnoException;
import androidx.media3.exoplayer.upstream.CmcdData;
import ck.C4989a;
import com.kubi.httpdns.interpret.NoServerException;
import com.kubi.httpdns.track.C15208b;
import com.kubi.httpdns.track.ILookupTrack;
import dk.C36724a;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Dns;
import org.jetbrains.annotations.NotNull;
import p016ak.C0376a;
import p345ik.C38654b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: bk.a */
/* JADX INFO: compiled from: OkHttpDns.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lbk/a;", "Lokhttp3/Dns;", "system", "Lcom/kubi/httpdns/track/ILookupTrack$a;", "factory", "<init>", "(Lokhttp3/Dns;Lcom/kubi/httpdns/track/ILookupTrack$a;)V", "", "hostname", "", "Ljava/net/InetAddress;", "lookup", "(Ljava/lang/String;)Ljava/util/List;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lokhttp3/Dns;", "b", "Lcom/kubi/httpdns/track/ILookupTrack$a;", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOkHttpDns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpDns.kt\ncom/kubi/httpdns/adapter/OkHttpDns\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 DnsIssueException.kt\ncom/kubi/httpdns/exception/DnsIssueExceptionKt\n*L\n1#1,64:1\n11335#2:65\n11670#2,3:66\n36#3,14:69\n*S KotlinDebug\n*F\n+ 1 OkHttpDns.kt\ncom/kubi/httpdns/adapter/OkHttpDns\n*L\n51#1:65\n51#1:66,3\n58#1:69,14\n*E\n"})
public final class C4626a implements Dns {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Dns system;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ILookupTrack.InterfaceC15206a factory;

    public C4626a(@NotNull Dns system, @NotNull ILookupTrack.InterfaceC15206a factory) {
        Intrinsics.checkNotNullParameter(system, "system");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.system = system;
        this.factory = factory;
    }

    @Override // okhttp3.Dns
    @NotNull
    public List<InetAddress> lookup(@NotNull String hostname) throws UnknownHostException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        ILookupTrack iLookupTrackMo31514a = this.factory.mo31514a(hostname);
        iLookupTrackMo31514a.mo31506b();
        iLookupTrackMo31514a.mo31509e();
        C4989a c4989aMo1477a = C0376a.f1119a.mo1477a(hostname);
        if (c4989aMo1477a == null) {
            iLookupTrackMo31514a.mo31513i(new UnknownHostException("request host[" + hostname + "] not found return null"));
        } else {
            iLookupTrackMo31514a.mo31511g(c4989aMo1477a);
        }
        try {
            iLookupTrackMo31514a.mo31508d();
            List<InetAddress> listLookup = this.system.lookup(hostname);
            iLookupTrackMo31514a.mo31512h(listLookup);
            iLookupTrackMo31514a.mo31510f(listLookup, true);
            return listLookup;
        } catch (Throwable th2) {
            iLookupTrackMo31514a.mo31507c(th2);
            try {
                if (c4989aMo1477a == null) {
                    throw new UnknownHostException("Both system and httpDns failed for host: " + hostname);
                }
                String[] ips = c4989aMo1477a.getIps();
                ArrayList arrayList = new ArrayList(ips.length);
                for (String str : ips) {
                    arrayList.add(InetAddress.getByName(str));
                }
                iLookupTrackMo31514a.mo31510f(arrayList, false);
                return arrayList;
            } catch (Throwable th3) {
                String strM87381b = C38654b.f86659a.m87381b();
                if ((th3 instanceof SocketException) || (th3 instanceof NoServerException) || (th3 instanceof SocketTimeoutException) || (th3 instanceof ErrnoException)) {
                    C44128b.m97263g(strM87381b, th3);
                } else {
                    C36724a.m82299b(th3, strM87381b);
                }
                iLookupTrackMo31514a.mo31505a(th3);
                throw th3;
            }
        }
    }

    public /* synthetic */ C4626a(Dns dns, ILookupTrack.InterfaceC15206a interfaceC15206a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Dns.SYSTEM : dns, (i11 & 2) != 0 ? new C15208b() : interfaceC15206a);
    }
}
