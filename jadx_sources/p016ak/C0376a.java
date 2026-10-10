package p016ak;

import androidx.media3.exoplayer.upstream.CmcdData;
import ck.C4989a;
import ck.C4993e;
import ck.InterfaceC4994f;
import com.kubi.httpdns.HttpDnsConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ak.a */
/* JADX INFO: compiled from: KHttpDns.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Lak/a;", "Lck/f;", "<init>", "()V", "Lcom/kubi/httpdns/HttpDnsConfig;", "config", "", "b", "(Lcom/kubi/httpdns/HttpDnsConfig;)V", "", "host", "Lck/a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Lck/a;", "Lck/f;", "dnsService", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C0376a implements InterfaceC4994f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C0376a f1119a = new C0376a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static InterfaceC4994f dnsService;

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m1476b(@NotNull HttpDnsConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        dnsService = new C4993e(config, null, null, null, null, 30, null);
    }

    @Override // ck.InterfaceC4994f
    @Nullable
    /* JADX INFO: renamed from: a */
    public C4989a mo1477a(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        InterfaceC4994f interfaceC4994f = dnsService;
        if (interfaceC4994f == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dnsService");
            interfaceC4994f = null;
        }
        return interfaceC4994f.mo1477a(host);
    }
}
