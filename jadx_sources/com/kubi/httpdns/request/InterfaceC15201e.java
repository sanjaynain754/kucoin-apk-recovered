package com.kubi.httpdns.request;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.httpdns.ServerConfig;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import p234ek.C37207e;
import p234ek.C37208f;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.httpdns.request.e */
/* JADX INFO: compiled from: IRequestDecoder.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/httpdns/request/e;", "", "Lek/e;", "request", "Lcom/kubi/httpdns/ServerConfig;", "serverConfig", "Lokhttp3/Request;", "b", "(Lek/e;Lcom/kubi/httpdns/ServerConfig;)Lokhttp3/Request;", "Lokhttp3/Response;", DbParams.KEY_CHANNEL_RESULT, "Lek/f;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lek/e;Lokhttp3/Response;)Lek/f;", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC15201e {
    @NotNull
    /* JADX INFO: renamed from: a */
    C37208f mo31480a(@NotNull C37207e request, @NotNull Response result);

    @NotNull
    /* JADX INFO: renamed from: b */
    Request mo31481b(@NotNull C37207e request, @NotNull ServerConfig serverConfig);
}
