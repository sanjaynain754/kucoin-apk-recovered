package com.kubi.httpdns.request;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.kubi.httpdns.ServerConfig;
import com.kubi.httpdns.track.IInterpretTrack;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import p234ek.C37207e;
import p234ek.C37208f;
import p234ek.InterfaceC37204b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.httpdns.request.c */
/* JADX INFO: compiled from: HttpRequestTask.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/httpdns/request/c;", "Lcom/kubi/httpdns/request/f;", "Lek/e;", "Lek/f;", "Lokhttp3/OkHttpClient;", "client", "Lcom/kubi/httpdns/request/e;", "decoder", "Lek/b;", "Lcom/kubi/httpdns/ServerConfig;", SessionDescription.ATTR_CONTROL, "<init>", "(Lokhttp3/OkHttpClient;Lcom/kubi/httpdns/request/e;Lek/b;)V", "request", "b", "(Lek/e;)Lek/f;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lokhttp3/OkHttpClient;", "Lcom/kubi/httpdns/request/e;", "c", "Lek/b;", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C15199c implements InterfaceC15202f<C37207e, C37208f> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final OkHttpClient client;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC15201e decoder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC37204b<ServerConfig> control;

    public C15199c(@NotNull OkHttpClient client, @NotNull InterfaceC15201e decoder, @NotNull InterfaceC37204b<ServerConfig> control) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(control, "control");
        this.client = client;
        this.decoder = decoder;
        this.control = control;
    }

    @Override // com.kubi.httpdns.request.InterfaceC15202f
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C37208f mo31482a(@NotNull C37207e request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ServerConfig serverConfigMo31469a = this.control.mo31469a();
        IInterpretTrack iInterpretTrack = (IInterpretTrack) request.m83245b(IInterpretTrack.Companion.TAG);
        if (iInterpretTrack != null) {
            try {
                iInterpretTrack.mo31502r(serverConfigMo31469a.getName());
            } catch (Throwable th2) {
                if (iInterpretTrack != null) {
                    iInterpretTrack.mo31500p(th2);
                }
                throw th2;
            }
        }
        C37208f c37208fMo31480a = this.decoder.mo31480a(request, FirebasePerfOkHttpClient.execute(this.client.newCall(this.decoder.mo31481b(request, this.control.mo31469a()))));
        if (iInterpretTrack != null) {
            iInterpretTrack.mo31494j();
        }
        return c37208fMo31480a;
    }
}
