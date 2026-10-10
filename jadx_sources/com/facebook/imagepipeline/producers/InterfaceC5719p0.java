package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.C5677a0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import p749x5.C46075i;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.p0 */
/* JADX INFO: compiled from: NetworkFetcher.java */
/* JADX INFO: loaded from: classes34.dex */
public interface InterfaceC5719p0<FETCH_STATE extends C5677a0> {

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.p0$a */
    /* JADX INFO: compiled from: NetworkFetcher.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo9783a();

        /* JADX INFO: renamed from: b */
        void mo9784b(InputStream inputStream, int i11) throws IOException;

        void onFailure(Throwable th2);
    }

    FETCH_STATE createFetchState(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0);

    void fetch(FETCH_STATE fetch_state, a aVar);

    Map<String, String> getExtraMap(FETCH_STATE fetch_state, int i11);

    void onFetchCompletion(FETCH_STATE fetch_state, int i11);

    boolean shouldPropagate(FETCH_STATE fetch_state);
}
