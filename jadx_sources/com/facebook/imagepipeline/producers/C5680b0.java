package com.facebook.imagepipeline.producers;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import p050c4.InterfaceC4820b;
import p190d4.C36613d;
import p712w3.C45706f;
import p749x5.C46075i;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.b0 */
/* JADX INFO: compiled from: HttpUrlConnectionNetworkFetcher.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5680b0 extends AbstractC5685d<c> {

    /* JADX INFO: renamed from: a */
    public int f9265a;

    /* JADX INFO: renamed from: b */
    public String f9266b;

    /* JADX INFO: renamed from: c */
    public final Map<String, String> f9267c;

    /* JADX INFO: renamed from: d */
    public final ExecutorService f9268d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4820b f9269e;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.b0$a */
    /* JADX INFO: compiled from: HttpUrlConnectionNetworkFetcher.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ c f9270b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC5719p0.a f9271c;

        public a(c cVar, InterfaceC5719p0.a aVar) {
            this.f9270b = cVar;
            this.f9271c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            C5680b0.this.m9617e(this.f9270b, this.f9271c);
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.b0$b */
    /* JADX INFO: compiled from: HttpUrlConnectionNetworkFetcher.java */
    public class b extends C5691f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Future f9273a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC5719p0.a f9274b;

        public b(Future future, InterfaceC5719p0.a aVar) {
            this.f9273a = future;
            this.f9274b = aVar;
        }

        @Override // com.facebook.imagepipeline.producers.InterfaceC5735x0
        /* JADX INFO: renamed from: b */
        public void mo9116b() {
            if (this.f9273a.cancel(false)) {
                this.f9274b.mo9783a();
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.b0$c */
    /* JADX INFO: compiled from: HttpUrlConnectionNetworkFetcher.java */
    public static class c extends C5677a0 {

        /* JADX INFO: renamed from: f */
        public long f9276f;

        /* JADX INFO: renamed from: g */
        public long f9277g;

        /* JADX INFO: renamed from: h */
        public long f9278h;

        public c(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
            super(interfaceC5712m, interfaceC5733w0);
        }
    }

    public C5680b0(int i11) {
        this(null, null, RealtimeSinceBootClock.get());
        this.f9265a = i11;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0045  */
    /* JADX WARN: Code duplicated, block: B:38:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[SYNTHETIC] */
    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public void m9617e(c cVar, InterfaceC5719p0.a aVar) throws Throwable {
        HttpURLConnection httpURLConnectionM9615b;
        InputStream inputStream = null;
        try {
            httpURLConnectionM9615b = m9615b(cVar.m9605g(), 5);
            try {
                try {
                    cVar.f9277g = this.f9269e.now();
                    if (httpURLConnectionM9615b != null) {
                        inputStream = httpURLConnectionM9615b.getInputStream();
                        aVar.mo9784b(inputStream, -1);
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (httpURLConnectionM9615b == null) {
                        return;
                    }
                } catch (IOException e11) {
                    e = e11;
                    aVar.onFailure(e);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (httpURLConnectionM9615b == null) {
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                if (httpURLConnectionM9615b != null) {
                    throw th;
                }
                httpURLConnectionM9615b.disconnect();
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
            httpURLConnectionM9615b = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnectionM9615b = null;
            if (inputStream != null) {
                inputStream.close();
            }
            if (httpURLConnectionM9615b != null) {
                throw th;
            }
            httpURLConnectionM9615b.disconnect();
            throw th;
        }
        httpURLConnectionM9615b.disconnect();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m9611g(int i11) {
        if (i11 == 307 || i11 == 308) {
            return true;
        }
        switch (i11) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m9612h(int i11) {
        return i11 >= 200 && i11 < 300;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5719p0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c createFetchState(InterfaceC5712m<C46075i> interfaceC5712m, InterfaceC5733w0 interfaceC5733w0) {
        return new c(interfaceC5712m, interfaceC5733w0);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5719p0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void fetch(c cVar, InterfaceC5719p0.a aVar) {
        cVar.f9276f = this.f9269e.now();
        cVar.m9600b().mo9667i(new b(this.f9268d.submit(new a(cVar, aVar)), aVar));
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5685d, com.facebook.imagepipeline.producers.InterfaceC5719p0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map<String, String> getExtraMap(c cVar, int i11) {
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(cVar.f9277g - cVar.f9276f));
        map.put("fetch_time", Long.toString(cVar.f9278h - cVar.f9277g));
        map.put("total_time", Long.toString(cVar.f9278h - cVar.f9276f));
        map.put("image_size", Integer.toString(i11));
        return map;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5685d, com.facebook.imagepipeline.producers.InterfaceC5719p0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onFetchCompletion(c cVar, int i11) {
        cVar.f9278h = this.f9269e.now();
    }

    @VisibleForTesting
    public C5680b0(String str, Map<String, String> map, InterfaceC4820b interfaceC4820b) {
        this.f9268d = Executors.newFixedThreadPool(3);
        this.f9269e = interfaceC4820b;
        this.f9267c = map;
        this.f9266b = str;
    }

    /* JADX INFO: renamed from: c */
    public static String m9610c(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: j */
    public static HttpURLConnection m9613j(Uri uri) throws IOException {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(C36613d.m81949r(uri).openConnection()));
    }

    /* JADX INFO: renamed from: b */
    public final HttpURLConnection m9615b(Uri uri, int i11) throws IOException {
        Uri uri2;
        String strM9610c;
        HttpURLConnection httpURLConnectionM9613j = m9613j(uri);
        String str = this.f9266b;
        if (str != null) {
            httpURLConnectionM9613j.setRequestProperty("User-Agent", str);
        }
        Map<String, String> map = this.f9267c;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnectionM9613j.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        httpURLConnectionM9613j.setConnectTimeout(this.f9265a);
        int responseCode = httpURLConnectionM9613j.getResponseCode();
        if (m9612h(responseCode)) {
            return httpURLConnectionM9613j;
        }
        if (m9611g(responseCode)) {
            String headerField = httpURLConnectionM9613j.getHeaderField("Location");
            httpURLConnectionM9613j.disconnect();
            if (headerField == null) {
                uri2 = null;
            } else {
                uri2 = Uri.parse(headerField);
            }
            String scheme = uri.getScheme();
            if (i11 > 0 && uri2 != null && !C45706f.m100883a(uri2.getScheme(), scheme)) {
                return m9615b(uri2, i11 - 1);
            }
            if (i11 == 0) {
                strM9610c = m9610c("URL %s follows too many redirects", uri.toString());
            } else {
                strM9610c = m9610c("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode));
            }
            throw new IOException(strM9610c);
        }
        httpURLConnectionM9613j.disconnect();
        throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
    }
}
