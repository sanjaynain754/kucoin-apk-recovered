package p457n;

import ai.advance.network.NetworkFailedException;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.kubi.otc.entity.OtcAd;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import p482o.C42902b;
import p482o.InterfaceC42903c;
import p520p.AbstractC43343d;
import p543q.C43568a;
import p543q.C43569b;

/* JADX INFO: renamed from: n.f */
/* JADX INFO: loaded from: classes23.dex */
public class C42685f {

    /* JADX INFO: renamed from: k */
    public static final Object f94456k = new Object();

    /* JADX INFO: renamed from: a */
    public final ExecutorC42689j f94457a;

    /* JADX INFO: renamed from: b */
    public final String f94458b;

    /* JADX INFO: renamed from: c */
    public final int f94459c;

    /* JADX INFO: renamed from: d */
    public final C42902b f94460d;

    /* JADX INFO: renamed from: e */
    public final C42692m f94461e;

    /* JADX INFO: renamed from: f */
    public final long f94462f;

    /* JADX INFO: renamed from: g */
    public final C42687h f94463g;

    /* JADX INFO: renamed from: h */
    public HttpURLConnection f94464h;

    /* JADX INFO: renamed from: i */
    public C42686g f94465i;

    /* JADX INFO: renamed from: j */
    public int f94466j;

    /* JADX INFO: renamed from: n.f$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public String f94467a;

        /* JADX INFO: renamed from: b */
        public final List<InterfaceC42903c> f94468b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public int f94469c = 30000;

        /* JADX INFO: renamed from: d */
        public boolean f94470d = false;

        /* JADX INFO: renamed from: d */
        public b m93526d(InterfaceC42903c interfaceC42903c) {
            if (interfaceC42903c != null) {
                this.f94468b.add(interfaceC42903c);
            }
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C42685f m93527e() {
            return new C42685f(this);
        }

        /* JADX INFO: renamed from: f */
        public b m93528f(boolean z11) {
            this.f94470d = z11;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public b m93529g(int i11) {
            this.f94469c = i11;
            return this;
        }
    }

    public C42685f(b bVar) {
        this.f94457a = new ExecutorC42689j();
        this.f94460d = new C42902b();
        C42692m c42692m = new C42692m();
        this.f94461e = c42692m;
        this.f94462f = System.currentTimeMillis();
        this.f94463g = new C42687h(null, c42692m);
        this.f94466j = -1;
        System.setProperty("http.maxConnections", "30");
        this.f94458b = bVar.f94467a;
        this.f94459c = bVar.f94469c;
        List list = bVar.f94468b;
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f94460d.m94081a((InterfaceC42903c) it.next());
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m93513h(C42692m c42692m) throws Exception {
        String strM93515j = m93515j(this.f94465i.m93534e());
        long jCurrentTimeMillis = System.currentTimeMillis();
        URL url = new URL(strM93515j);
        if (strM93515j.startsWith(ProxyConfig.MATCH_HTTPS)) {
            this.f94464h = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            String strM93530a = this.f94465i.m93530a();
            if (!TextUtils.isEmpty(strM93530a)) {
                C43568a.m95844a((HttpsURLConnection) this.f94464h, strM93530a, new C43569b.a() { // from class: n.d
                    @Override // p543q.C43569b.a
                    /* JADX INFO: renamed from: a */
                    public final void mo93505a(int i11) {
                        this.f94454a.f94466j = i11;
                    }
                });
            } else if (!(HttpsURLConnection.getDefaultSSLSocketFactory() instanceof C43569b)) {
                HttpsURLConnection.setDefaultSSLSocketFactory(new C43569b((SSLSocketFactory) SSLSocketFactory.getDefault(), new C43569b.a() { // from class: n.e
                    @Override // p543q.C43569b.a
                    /* JADX INFO: renamed from: a */
                    public final void mo93505a(int i11) {
                        this.f94455a.f94466j = i11;
                    }
                }));
            }
        } else {
            this.f94464h = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        }
        this.f94464h.setConnectTimeout(this.f94459c);
        this.f94464h.setReadTimeout(this.f94459c);
        c42692m.m93574g(System.currentTimeMillis() - jCurrentTimeMillis);
    }

    /* JADX INFO: renamed from: i */
    public C42687h m93514i(C42686g c42686g) {
        this.f94465i = c42686g;
        m93512g(null);
        return this.f94463g;
    }

    /* JADX INFO: renamed from: j */
    public final String m93515j(String str) {
        if (str.startsWith("http")) {
            return str;
        }
        return this.f94458b + str;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX INFO: renamed from: m */
    public final void m93518m(C42692m c42692m, InputStream inputStream, String str) {
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            synchronized (f94456k) {
                try {
                    if (!parentFile.exists() && !parentFile.mkdirs() && !parentFile.exists()) {
                        c42692m.m93576i("Create " + str + " failed");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(str);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i11 = inputStream.read(bArr);
                        if (i11 == -1) {
                            fileOutputStream.flush();
                            this.f94463g.m93554f(true);
                            fileOutputStream.close();
                            inputStream.close();
                            return;
                        }
                        fileOutputStream.write(bArr, 0, i11);
                        c42692m.m93576i("Save file failed: " + e.getMessage());
                        if (file.exists()) {
                            file.delete();
                        }
                        this.f94463g.m93554f(false);
                    }
                } catch (Throwable th3) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
        } catch (Exception e11) {
            c42692m.m93576i("Save file failed: " + e11.getMessage());
            if (file.exists()) {
                file.delete();
            }
            this.f94463g.m93554f(false);
        }
    }

    /* JADX INFO: renamed from: n */
    public C42687h m93519n(C42686g c42686g) {
        this.f94465i = c42686g;
        m93511f(null);
        return this.f94463g;
    }

    /* JADX INFO: renamed from: o */
    public final void m93520o(HttpURLConnection httpURLConnection, final String str, final String str2, int i11, final String str3, final InterfaceC42690k interfaceC42690k) {
        this.f94461e.m93577j(i11);
        this.f94461e.m93576i(str2);
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f94463g.m93556h(str3);
        this.f94463g.m93555g(str2);
        if (interfaceC42690k != null) {
            this.f94457a.execute(new Runnable(interfaceC42690k, str, str2, str3) { // from class: n.c

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f94451c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ String f94452d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ String f94453e;

                @Override // java.lang.Runnable
                public final void run() {
                    ((InterfaceC42690k) null).m93560b(this.f94451c, this.f94452d, this.f94453e, this.f94450b.f94461e);
                }

                {
                    this.f94451c = str;
                    this.f94452d = str2;
                    this.f94453e = str3;
                }
            });
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m93521p(C42692m c42692m, HttpURLConnection httpURLConnection) throws Exception {
        AbstractC43343d abstractC43343dM93535f = this.f94465i.m93535f();
        if (!"POST".equals(this.f94465i.m93533d()) || abstractC43343dM93535f == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        httpURLConnection.setDoOutput(true);
        C42691l.m93563c(httpURLConnection, abstractC43343dM93535f);
        c42692m.m93578k(System.currentTimeMillis() - jCurrentTimeMillis);
        c42692m.m93573f(abstractC43343dM93535f.mo95414a());
    }

    /* JADX INFO: renamed from: f */
    public final void m93511f(InterfaceC42690k interfaceC42690k) {
        HttpURLConnection httpURLConnection;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f94461e.m93581n(jCurrentTimeMillis);
        try {
            try {
                m93513h(this.f94461e);
                m93522q(this.f94461e, this.f94464h);
                m93521p(this.f94461e, this.f94464h);
                this.f94464h.connect();
                this.f94463g.m93556h(m93517l(this.f94461e, this.f94464h, interfaceC42690k));
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                this.f94461e.m93582o(jCurrentTimeMillis2 - jCurrentTimeMillis);
                this.f94461e.m93575h(jCurrentTimeMillis2);
                int i11 = this.f94466j;
                if (i11 != -1) {
                    this.f94461e.m93572e(i11);
                }
                httpURLConnection = this.f94464h;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (NetworkFailedException e11) {
                m93520o(this.f94464h, e11.getCode(), e11.getMessage(), 200, e11.getResponse(), interfaceC42690k);
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                this.f94461e.m93582o(jCurrentTimeMillis3 - jCurrentTimeMillis);
                this.f94461e.m93575h(jCurrentTimeMillis3);
                int i12 = this.f94466j;
                if (i12 != -1) {
                    this.f94461e.m93572e(i12);
                }
                httpURLConnection = this.f94464h;
                if (httpURLConnection != null) {
                }
            } catch (InterruptedException unused) {
                m93520o(this.f94464h, OtcAd.KYC_NOT_PASS, "Network is canceled", -1, null, interfaceC42690k);
                long jCurrentTimeMillis4 = System.currentTimeMillis();
                this.f94461e.m93582o(jCurrentTimeMillis4 - jCurrentTimeMillis);
                this.f94461e.m93575h(jCurrentTimeMillis4);
                int i13 = this.f94466j;
                if (i13 != -1) {
                    this.f94461e.m93572e(i13);
                }
                httpURLConnection = this.f94464h;
                if (httpURLConnection != null) {
                }
            } catch (Exception e12) {
                m93520o(this.f94464h, "-2", e12.getMessage(), -2, null, interfaceC42690k);
                long jCurrentTimeMillis5 = System.currentTimeMillis();
                this.f94461e.m93582o(jCurrentTimeMillis5 - jCurrentTimeMillis);
                this.f94461e.m93575h(jCurrentTimeMillis5);
                int i14 = this.f94466j;
                if (i14 != -1) {
                    this.f94461e.m93572e(i14);
                }
                httpURLConnection = this.f94464h;
                if (httpURLConnection != null) {
                }
            }
        } catch (Throwable th2) {
            long jCurrentTimeMillis6 = System.currentTimeMillis();
            this.f94461e.m93582o(jCurrentTimeMillis6 - jCurrentTimeMillis);
            this.f94461e.m93575h(jCurrentTimeMillis6);
            int i15 = this.f94466j;
            if (i15 != -1) {
                this.f94461e.m93572e(i15);
            }
            HttpURLConnection httpURLConnection2 = this.f94464h;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m93512g(InterfaceC42688i interfaceC42688i) {
        int i11;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f94461e.m93581n(jCurrentTimeMillis);
        try {
            m93513h(this.f94461e);
            m93522q(this.f94461e, this.f94464h);
            m93521p(this.f94461e, this.f94464h);
            this.f94464h.connect();
            this.f94463g.m93553e(m93516k(this.f94461e, this.f94464h, interfaceC42688i));
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            this.f94461e.m93582o(jCurrentTimeMillis2 - jCurrentTimeMillis);
            this.f94461e.m93575h(jCurrentTimeMillis2);
            i11 = this.f94466j;
            if (i11 == -1) {
                return;
            }
        } catch (Exception e11) {
            if (interfaceC42688i != null) {
                interfaceC42688i.m93557a("-2", e11.getMessage(), this.f94461e);
            }
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            this.f94461e.m93582o(jCurrentTimeMillis3 - jCurrentTimeMillis);
            this.f94461e.m93575h(jCurrentTimeMillis3);
            i11 = this.f94466j;
            if (i11 == -1) {
                return;
            }
        } catch (InterruptedException unused) {
            if (interfaceC42688i != null) {
                interfaceC42688i.m93557a(OtcAd.KYC_NOT_PASS, "Network is canceled", this.f94461e);
            }
            long jCurrentTimeMillis4 = System.currentTimeMillis();
            this.f94461e.m93582o(jCurrentTimeMillis4 - jCurrentTimeMillis);
            this.f94461e.m93575h(jCurrentTimeMillis4);
            i11 = this.f94466j;
            if (i11 == -1) {
                return;
            }
        } finally {
            long jCurrentTimeMillis5 = System.currentTimeMillis();
            this.f94461e.m93582o(jCurrentTimeMillis5 - jCurrentTimeMillis);
            this.f94461e.m93575h(jCurrentTimeMillis5);
            int i12 = this.f94466j;
            if (i12 != -1) {
                this.f94461e.m93572e(i12);
            }
        }
        C42692m c42692m = this.f94461e;
        long j11 = i11;
    }

    /* JADX INFO: renamed from: k */
    public final InputStream m93516k(C42692m c42692m, HttpURLConnection httpURLConnection, InterfaceC42688i interfaceC42688i) throws Exception {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int responseCode = httpURLConnection.getResponseCode();
        c42692m.m93577j(responseCode);
        InputStream inputStream = null;
        if (responseCode == 200) {
            InputStream inputStream2 = httpURLConnection.getInputStream();
            String strM93531b = this.f94465i.m93531b();
            if (!TextUtils.isEmpty(strM93531b)) {
                m93518m(c42692m, inputStream2, strM93531b);
            } else {
                inputStream = inputStream2;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            c42692m.m93580m(jCurrentTimeMillis2 - jCurrentTimeMillis);
            c42692m.m93575h(jCurrentTimeMillis2);
            if (interfaceC42688i != null) {
                interfaceC42688i.m93558b(inputStream, c42692m);
            }
            return inputStream;
        }
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        c42692m.m93575h(jCurrentTimeMillis3);
        c42692m.m93580m(jCurrentTimeMillis3 - jCurrentTimeMillis);
        String responseMessage = httpURLConnection.getResponseMessage();
        c42692m.m93576i(responseMessage);
        if (interfaceC42688i != null) {
            interfaceC42688i.m93557a(responseCode + "", responseMessage, c42692m);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final String m93517l(final C42692m c42692m, HttpURLConnection httpURLConnection, final InterfaceC42690k interfaceC42690k) throws Exception {
        long jCurrentTimeMillis = System.currentTimeMillis();
        final int responseCode = httpURLConnection.getResponseCode();
        c42692m.m93577j(responseCode);
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                }
                String string = sb2.toString();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                c42692m.m93580m(jCurrentTimeMillis2 - jCurrentTimeMillis);
                c42692m.m93575h(jCurrentTimeMillis2);
                final String strM94083c = this.f94460d.m94083c(httpURLConnection, string);
                if (interfaceC42690k != null) {
                    this.f94457a.execute(new Runnable(interfaceC42690k, strM94083c, c42692m) { // from class: n.a

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ String f94445b;

                        /* JADX INFO: renamed from: c */
                        public final /* synthetic */ C42692m f94446c;

                        @Override // java.lang.Runnable
                        public final void run() {
                            ((InterfaceC42690k) null).m93559a(this.f94445b, this.f94446c);
                        }

                        {
                            this.f94445b = strM94083c;
                            this.f94446c = c42692m;
                        }
                    });
                }
                bufferedReader.close();
                return strM94083c;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        c42692m.m93575h(jCurrentTimeMillis3);
        c42692m.m93580m(jCurrentTimeMillis3 - jCurrentTimeMillis);
        final String responseMessage = httpURLConnection.getResponseMessage();
        c42692m.m93576i(responseMessage);
        if (interfaceC42690k != null) {
            this.f94457a.execute(new Runnable(interfaceC42690k, responseCode, responseMessage, c42692m) { // from class: n.b

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f94447b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f94448c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ C42692m f94449d;

                @Override // java.lang.Runnable
                public final void run() {
                    ((InterfaceC42690k) null).m93560b(this.f94447b + "", this.f94448c, null, this.f94449d);
                }

                {
                    this.f94447b = responseCode;
                    this.f94448c = responseMessage;
                    this.f94449d = c42692m;
                }
            });
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final void m93522q(C42692m c42692m, HttpURLConnection httpURLConnection) throws Exception {
        long jCurrentTimeMillis = System.currentTimeMillis();
        httpURLConnection.setRequestMethod(this.f94465i.m93533d());
        Map<String, Object> mapM93532c = this.f94465i.m93532c();
        if (!mapM93532c.isEmpty()) {
            for (Map.Entry<String, Object> entry : mapM93532c.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!TextUtils.isEmpty(key) && value != null) {
                    httpURLConnection.setRequestProperty(key, value.toString());
                }
            }
        }
        c42692m.m93579l(System.currentTimeMillis() - jCurrentTimeMillis);
    }
}
