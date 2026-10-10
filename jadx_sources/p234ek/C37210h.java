package p234ek;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.httpdns.HttpDnsConfig;
import com.kubi.httpdns.request.C15197a;
import com.kubi.httpdns.request.C15199c;
import com.kubi.httpdns.request.C15200d;
import com.kubi.httpdns.request.C15204h;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ek.h */
/* JADX INFO: compiled from: NormalCategory.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m90084d2 = {"Lek/h;", "Lek/c;", "Lcom/kubi/httpdns/HttpDnsConfig;", "config", "Lek/b;", "clientControl", "<init>", "(Lcom/kubi/httpdns/HttpDnsConfig;Lek/b;)V", "Lek/e;", "request", "Lek/f;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lek/e;)Lek/f;", "Lcom/kubi/httpdns/HttpDnsConfig;", "b", "Lek/b;", "Lek/i;", "c", "Lek/i;", "serverControl", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C37210h implements InterfaceC37205c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final HttpDnsConfig config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC37204b<InterfaceC37205c> clientControl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C37211i serverControl;

    public C37210h(@NotNull HttpDnsConfig config, @NotNull InterfaceC37204b<InterfaceC37205c> clientControl) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(clientControl, "clientControl");
        this.config = config;
        this.clientControl = clientControl;
        this.serverControl = new C37211i(config.getServerConfig());
    }

    @Override // p234ek.InterfaceC37205c
    @NotNull
    /* JADX INFO: renamed from: a */
    public C37208f mo83241a(@NotNull C37207e request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new C15200d(new C15204h(new C15204h(new C15199c(this.config.getOkHttpClient(), this.config.getRequestDecoder(), this.serverControl), new C15197a(this.clientControl)), new C15197a(this.serverControl)), this.config.getAllowRetryCount()).mo31482a(request);
    }
}
