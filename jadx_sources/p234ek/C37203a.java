package p234ek;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.httpdns.HttpDnsConfig;
import com.kubi.httpdns.interpret.GloomyFrequentException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ek.a */
/* JADX INFO: compiled from: GloomyCategory.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m90084d2 = {"Lek/a;", "Lek/c;", "Lcom/kubi/httpdns/HttpDnsConfig;", "config", "Lek/h;", "category", "<init>", "(Lcom/kubi/httpdns/HttpDnsConfig;Lek/h;)V", "Lek/e;", "request", "Lek/f;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lek/e;)Lek/f;", "", "b", "()V", "Lcom/kubi/httpdns/HttpDnsConfig;", "Lek/h;", "", "c", "J", "lastRequestTime", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C37203a implements InterfaceC37205c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final HttpDnsConfig config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C37210h category;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public long lastRequestTime;

    public C37203a(@NotNull HttpDnsConfig config, @NotNull C37210h category) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(category, "category");
        this.config = config;
        this.category = category;
    }

    @Override // p234ek.InterfaceC37205c
    @NotNull
    /* JADX INFO: renamed from: a */
    public C37208f mo83241a(@NotNull C37207e request) throws GloomyFrequentException {
        Intrinsics.checkNotNullParameter(request, "request");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastRequestTime < this.config.getGloomyInterval() * ((long) 1000)) {
            throw new GloomyFrequentException();
        }
        this.lastRequestTime = jCurrentTimeMillis;
        return this.category.mo83241a(request);
    }

    /* JADX INFO: renamed from: b */
    public final void m83242b() {
        this.lastRequestTime = 0L;
    }
}
