package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import p523p2.C43356c;
import p523p2.C43359f;
import p817z1.C46628g;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.j */
/* JADX INFO: compiled from: HttpUrlFetcher.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5329j implements InterfaceC5323d<InputStream> {

    /* JADX INFO: renamed from: h */
    @VisibleForTesting
    public static final b f6761h = new a();

    /* JADX INFO: renamed from: b */
    public final C46628g f6762b;

    /* JADX INFO: renamed from: c */
    public final int f6763c;

    /* JADX INFO: renamed from: d */
    public final b f6764d;

    /* JADX INFO: renamed from: e */
    public HttpURLConnection f6765e;

    /* JADX INFO: renamed from: f */
    public InputStream f6766f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f6767g;

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.j$b */
    /* JADX INFO: compiled from: HttpUrlFetcher.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        HttpURLConnection mo6688a(URL url) throws IOException;
    }

    public C5329j(C46628g c46628g, int i11) {
        this(c46628g, i11, f6761h);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5323d
    public void cancel() {
        this.f6767g = true;
    }

    /* JADX INFO: renamed from: e */
    public final HttpURLConnection m6685e(URL url, Map<String, String> map) throws HttpException {
        try {
            HttpURLConnection httpURLConnectionMo6688a = this.f6764d.mo6688a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnectionMo6688a.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnectionMo6688a.setConnectTimeout(this.f6763c);
            httpURLConnectionMo6688a.setReadTimeout(this.f6763c);
            httpURLConnectionMo6688a.setUseCaches(false);
            httpURLConnectionMo6688a.setDoInput(true);
            httpURLConnectionMo6688a.setInstanceFollowRedirects(false);
            return httpURLConnectionMo6688a;
        } catch (IOException e11) {
            throw new HttpException("URL.openConnection threw", 0, e11);
        }
    }

    /* JADX INFO: renamed from: j */
    public final InputStream m6687j(URL url, int i11, URL url2, Map<String, String> map) throws HttpException {
        if (i11 >= 5) {
            throw new HttpException("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionM6685e = m6685e(url, map);
        this.f6765e = httpURLConnectionM6685e;
        try {
            httpURLConnectionM6685e.connect();
            this.f6766f = this.f6765e.getInputStream();
            if (this.f6767g) {
                return null;
            }
            int iM6682f = m6682f(this.f6765e);
            if (m6683h(iM6682f)) {
                return m6686g(this.f6765e);
            }
            if (!m6684i(iM6682f)) {
                if (iM6682f == -1) {
                    throw new HttpException(iM6682f);
                }
                try {
                    throw new HttpException(this.f6765e.getResponseMessage(), iM6682f);
                } catch (IOException e11) {
                    throw new HttpException("Failed to get a response message", iM6682f, e11);
                }
            }
            String headerField = this.f6765e.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new HttpException("Received empty or null redirect url", iM6682f);
            }
            try {
                URL url3 = new URL(url, headerField);
                mo24b();
                return m6687j(url3, i11 + 1, url, map);
            } catch (MalformedURLException e12) {
                throw new HttpException("Bad redirect url: " + headerField, iM6682f, e12);
            }
        } catch (IOException e13) {
            throw new HttpException("Failed to connect or obtain data", m6682f(this.f6765e), e13);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.j$a */
    /* JADX INFO: compiled from: HttpUrlFetcher.java */
    public static class a implements b {
        @Override // com.bumptech.glide.load.data.C5329j.b
        /* JADX INFO: renamed from: a */
        public HttpURLConnection mo6688a(URL url) throws IOException {
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        }
    }

    @VisibleForTesting
    public C5329j(C46628g c46628g, int i11, b bVar) {
        this.f6762b = c46628g;
        this.f6763c = i11;
        this.f6764d = bVar;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m6683h(int i11) {
        return i11 / 100 == 2;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m6684i(int i11) {
        return i11 / 100 == 3;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5323d
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<InputStream> mo23a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5323d
    /* JADX INFO: renamed from: b */
    public void mo24b() {
        InputStream inputStream = this.f6766f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f6765e;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f6765e = null;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5323d
    @NonNull
    /* JADX INFO: renamed from: c */
    public DataSource mo25c() {
        return DataSource.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5323d
    /* JADX INFO: renamed from: d */
    public void mo26d(@NonNull Priority priority, @NonNull InterfaceC5323d.a<? super InputStream> aVar) {
        long jM95490b = C43359f.m95490b();
        try {
            aVar.mo6674e(m6687j(this.f6762b.m102827i(), 0, null, this.f6762b.m102823e()));
        } catch (IOException e11) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e11);
            }
            aVar.mo6675f(e11);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + C43359f.m95489a(jM95490b));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final InputStream m6686g(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f6766f = C43356c.m95482b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f6766f = httpURLConnection.getInputStream();
            }
            return this.f6766f;
        } catch (IOException e11) {
            throw new HttpException("Failed to obtain InputStream", m6682f(httpURLConnection), e11);
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m6682f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e11) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to get a response code", e11);
                return -1;
            }
            return -1;
        }
    }
}
