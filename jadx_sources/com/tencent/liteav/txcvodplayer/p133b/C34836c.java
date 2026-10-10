package com.tencent.liteav.txcvodplayer.p133b;

import android.os.AsyncTask;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.ThreadUtils;
import com.tencent.liteav.base.util.HttpDnsUtil;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.sdk.common.EscapeDomainsFetcher;
import com.tencent.liteav.txcplayer.common.C34809a;
import com.tencent.liteav.txcplayer.common.C34810b;
import com.tencent.liteav.txcplayer.p131a.C34804a;
import com.tencent.liteav.txcvodplayer.hlsencoder.TXCHLSEncoder;
import com.tencent.liteav.txcvodplayer.p134c.C34841a;
import com.tencent.rtmp.TXPlayInfoParams;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.b.c */
/* JADX INFO: loaded from: classes59.dex */
public final class C34836c {

    /* JADX INFO: renamed from: a */
    static final String[] f73943a = {new String(Base64.decode("cGxheXZpZGVvLnZvZHBsYXl2aWRlby5uZXQ=", 0)), new String(Base64.decode("cGxheXZpZGVvLnZvZGdsY2RuLmNvbQ==", 0)), new String(Base64.decode("cGxheXZpZGVvLnZvZHBsYXl2aWRlby5jb20=", 0)), new String(Base64.decode("cGxheXZpZGVvLnZvZC1jb21tb24uY29t", 0)), new String(Base64.decode("cGxheXZpZGVvLnFjbG91ZC5jb20=", 0))};

    /* JADX INFO: renamed from: g */
    static volatile String f73944g;

    /* JADX INFO: renamed from: b */
    TXPlayInfoParams f73945b;

    /* JADX INFO: renamed from: c */
    public C34835b f73946c;

    /* JADX INFO: renamed from: d */
    public b f73947d;

    /* JADX INFO: renamed from: e */
    List<String> f73948e;

    /* JADX INFO: renamed from: f */
    int f73949f;

    /* JADX INFO: renamed from: h */
    private Handler f73950h = ThreadUtils.getUiThreadHandler();

    /* JADX INFO: renamed from: i */
    private C34839f f73951i;

    /* JADX INFO: renamed from: j */
    private String f73952j;

    /* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.b.c$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ a f73953a;

        public AnonymousClass1(a aVar) {
            this.f73953a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            final C34834a c34834a = C34834a.a.f73925a;
            final C34836c c34836c = C34836c.this;
            final C34834a.b bVar = new C34834a.b() { // from class: com.tencent.liteav.txcvodplayer.b.c.1.1
                @Override // com.tencent.liteav.txcvodplayer.p133b.C34834a.b
                /* JADX INFO: renamed from: a */
                public final void mo76358a(String str, Map<String, String> map) {
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    if (C34836c.this.m76370a(str, map, anonymousClass1.f73953a)) {
                        C34836c.this.m76368a(new Runnable() { // from class: com.tencent.liteav.txcvodplayer.b.c.1.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass1 anonymousClass2 = AnonymousClass1.this;
                                a aVar = anonymousClass2.f73953a;
                                C34836c c34836c2 = C34836c.this;
                                aVar.mo75989a(c34836c2, c34836c2.f73945b);
                            }
                        });
                        if (C34836c.this.f73948e != null) {
                            C34841a c34841aM76410a = C34841a.m76410a();
                            String unused = C34836c.f73944g = (String) C34836c.this.f73948e.get(C34836c.this.f73949f);
                            c34841aM76410a.m76418a(C34836c.f73944g);
                        }
                    }
                }

                @Override // com.tencent.liteav.txcvodplayer.p133b.C34834a.b
                /* JADX INFO: renamed from: a */
                public final void mo76357a() {
                    C34836c.this.m76368a(new Runnable() { // from class: com.tencent.liteav.txcvodplayer.b.c.1.1.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            a aVar = AnonymousClass1.this.f73953a;
                            if (aVar != null) {
                                aVar.mo75988a(-1, "http request error.");
                            }
                        }
                    });
                    String unused = C34836c.f73944g = "";
                    C34841a.m76410a().m76418a(C34836c.f73944g);
                }
            };
            AsyncTask.execute(new Runnable() { // from class: com.tencent.liteav.txcvodplayer.b.a.1

                /* JADX INFO: renamed from: d */
                private boolean f73923d = true;

                /* JADX INFO: renamed from: e */
                private String f73924e;

                /* JADX WARN: Code duplicated, block: B:30:0x00b3  */
                /* JADX WARN: Code duplicated, block: B:32:0x00cc  */
                /* JADX WARN: Code duplicated, block: B:35:0x00e7  */
                /* JADX WARN: Code duplicated, block: B:40:0x011c  */
                /* JADX WARN: Code duplicated, block: B:43:0x0174  */
                /* JADX WARN: Code duplicated, block: B:51:0x01a4  */
                /* JADX WARN: Code duplicated, block: B:54:0x01d3  */
                /* JADX WARN: Code duplicated, block: B:57:0x01ed  */
                /* JADX WARN: Code duplicated, block: B:59:0x01fa  */
                /* JADX WARN: Code duplicated, block: B:62:0x0201  */
                /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
                
                    if (r1 == r0.f73948e.size()) goto L64;
                 */
                /* JADX WARN: Instruction removed from duplicated block: B:32:0x00cc, please report this as an issue */
                /* JADX WARN: Instruction removed from duplicated block: B:35:0x00e7, please report this as an issue */
                /* JADX WARN: Instruction removed from duplicated block: B:54:0x01d3, please report this as an issue */
                /* JADX WARN: Instruction removed from duplicated block: B:62:0x0201, please report this as an issue */
                /* JADX INFO: renamed from: a */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private URLConnection m76356a() throws IOException {
                    String str;
                    String string;
                    String pSign;
                    StringBuilder sb2;
                    C34836c.b bVarM76415a;
                    C34836c c34836c2 = c34836c;
                    String str2 = C34836c.f73944g;
                    String str3 = "";
                    if (TextUtils.isEmpty(str2)) {
                        List<String> list = c34836c2.f73948e;
                        if (list == null || list.size() == 0) {
                            c34836c2.f73948e = new ArrayList();
                            List<String> listM76236c = C34810b.m76236c();
                            if (listM76236c != null && listM76236c.size() > 0) {
                                c34836c2.f73948e.addAll(listM76236c);
                            }
                            String strM76420c = C34841a.m76410a().m76420c();
                            if (!TextUtils.isEmpty(strM76420c)) {
                                c34836c2.f73948e.add(strM76420c);
                            }
                            for (String str4 : C34836c.f73943a) {
                                if (!c34836c2.f73948e.contains(str4)) {
                                    c34836c2.f73948e.add(str4);
                                }
                            }
                            c34836c2.f73949f = 0;
                        } else {
                            int i11 = c34836c2.f73949f + 1;
                            c34836c2.f73949f = i11;
                        }
                        str2 = c34836c2.f73948e.get(c34836c2.f73949f);
                        str = String.format(Locale.ROOT, "%s/%d/%s", "https://" + str2 + "/getplayinfo/v4", Integer.valueOf(c34836c2.f73945b.getAppId()), c34836c2.f73945b.getFileId());
                        if (c34836c2.f73945b.getPSign() != null) {
                            pSign = c34836c2.f73945b.getPSign();
                            sb2 = new StringBuilder();
                            sb2.append("subversion=1&");
                            if (!TextUtils.isEmpty(null)) {
                                sb2.append("pcfg=" + ((String) null) + "&");
                            }
                            if (!TextUtils.isEmpty(pSign)) {
                                sb2.append("psign=" + pSign + "&");
                            }
                            bVarM76415a = C34841a.m76410a().m76415a(c34836c2.f73945b.getAppId(), c34836c2.f73945b.getFileId());
                            c34836c2.f73947d = bVarM76415a;
                            if (bVarM76415a != null) {
                                C34836c.b bVar2 = new C34836c.b();
                                c34836c2.f73947d = bVar2;
                                bVar2.f73966a = TXCHLSEncoder.m76424a();
                                c34836c2.f73947d.f73967b = TXCHLSEncoder.m76424a();
                            } else {
                                C34836c.b bVar3 = new C34836c.b();
                                c34836c2.f73947d = bVar3;
                                bVar3.f73966a = TXCHLSEncoder.m76424a();
                                c34836c2.f73947d.f73967b = TXCHLSEncoder.m76424a();
                            }
                            LiteavLog.m76087i("TXCPlayInfoProtocolV4", "[" + c34836c2.hashCode() + "], V4 protocol send request fileId : " + c34836c2.f73945b.getFileId() + " | overlayKey: " + c34836c2.f73947d.f73966a + " | overlayIv: " + c34836c2.f73947d.f73967b);
                            if (TextUtils.isEmpty(c34836c2.f73947d.f73968c)) {
                                C34836c.b bVar4 = c34836c2.f73947d;
                                bVar4.f73968c = TXCHLSEncoder.m76426a(bVar4.f73966a);
                                C34836c.b bVar5 = c34836c2.f73947d;
                                bVar5.f73969d = TXCHLSEncoder.m76426a(bVar5.f73967b);
                            }
                            if (!TextUtils.isEmpty(c34836c2.f73947d.f73968c)) {
                                str3 = "1";
                            }
                            if (!TextUtils.isEmpty(str3)) {
                                sb2.append("cipheredOverlayKey=");
                                sb2.append(c34836c2.f73947d.f73968c);
                                sb2.append("&");
                                sb2.append("cipheredOverlayIv=");
                                sb2.append(c34836c2.f73947d.f73969d);
                                sb2.append("&");
                                sb2.append("keyId=");
                                sb2.append(str3);
                                sb2.append("&");
                            }
                            if (!TextUtils.isEmpty(null)) {
                                sb2.append("context=" + ((String) null) + "&");
                            }
                            if (sb2.length() > 1) {
                                sb2.deleteCharAt(sb2.length() - 1);
                            }
                            string = sb2.toString();
                        } else {
                            string = null;
                        }
                        if (!TextUtils.isEmpty(string)) {
                            str = str + "?" + string;
                        }
                        str3 = str;
                        LiteavLog.m76087i("TXCPlayInfoProtocolV4", "[" + c34836c2.hashCode() + "], request url: " + str3);
                    } else {
                        str = String.format(Locale.ROOT, "%s/%d/%s", "https://" + str2 + "/getplayinfo/v4", Integer.valueOf(c34836c2.f73945b.getAppId()), c34836c2.f73945b.getFileId());
                        if (c34836c2.f73945b.getPSign() != null) {
                            pSign = c34836c2.f73945b.getPSign();
                            sb2 = new StringBuilder();
                            sb2.append("subversion=1&");
                            if (!TextUtils.isEmpty(null)) {
                                sb2.append("pcfg=" + ((String) null) + "&");
                            }
                            if (!TextUtils.isEmpty(pSign)) {
                                sb2.append("psign=" + pSign + "&");
                            }
                            bVarM76415a = C34841a.m76410a().m76415a(c34836c2.f73945b.getAppId(), c34836c2.f73945b.getFileId());
                            c34836c2.f73947d = bVarM76415a;
                            if (bVarM76415a != null || TextUtils.isEmpty(bVarM76415a.f73966a)) {
                                C34836c.b bVar6 = new C34836c.b();
                                c34836c2.f73947d = bVar6;
                                bVar6.f73966a = TXCHLSEncoder.m76424a();
                                c34836c2.f73947d.f73967b = TXCHLSEncoder.m76424a();
                            }
                            LiteavLog.m76087i("TXCPlayInfoProtocolV4", "[" + c34836c2.hashCode() + "], V4 protocol send request fileId : " + c34836c2.f73945b.getFileId() + " | overlayKey: " + c34836c2.f73947d.f73966a + " | overlayIv: " + c34836c2.f73947d.f73967b);
                            if (TextUtils.isEmpty(c34836c2.f73947d.f73968c)) {
                                C34836c.b bVar7 = c34836c2.f73947d;
                                bVar7.f73968c = TXCHLSEncoder.m76426a(bVar7.f73966a);
                                C34836c.b bVar8 = c34836c2.f73947d;
                                bVar8.f73969d = TXCHLSEncoder.m76426a(bVar8.f73967b);
                            }
                            if (!TextUtils.isEmpty(c34836c2.f73947d.f73968c) && !TextUtils.isEmpty(c34836c2.f73947d.f73969d)) {
                                str3 = "1";
                            }
                            if (!TextUtils.isEmpty(str3)) {
                                sb2.append("cipheredOverlayKey=");
                                sb2.append(c34836c2.f73947d.f73968c);
                                sb2.append("&");
                                sb2.append("cipheredOverlayIv=");
                                sb2.append(c34836c2.f73947d.f73969d);
                                sb2.append("&");
                                sb2.append("keyId=");
                                sb2.append(str3);
                                sb2.append("&");
                            }
                            if (!TextUtils.isEmpty(null)) {
                                sb2.append("context=" + ((String) null) + "&");
                            }
                            if (sb2.length() > 1) {
                                sb2.deleteCharAt(sb2.length() - 1);
                            }
                            string = sb2.toString();
                        } else {
                            string = null;
                        }
                        if (!TextUtils.isEmpty(string)) {
                            str = str + "?" + string;
                        }
                        str3 = str;
                        LiteavLog.m76087i("TXCPlayInfoProtocolV4", "[" + c34836c2.hashCode() + "], request url: " + str3);
                    }
                    this.f73924e = str3;
                    if (TextUtils.isEmpty(str3)) {
                        LiteavLog.m76093w("TXCHttpURLClient", "requestUrlStr is empty!");
                        return null;
                    }
                    URL url = new URL(this.f73924e);
                    if (this.f73923d) {
                        try {
                            return HttpDnsUtil.createConnectionUseCustomHttpDNS(this.f73924e, url.getHost());
                        } catch (Exception e11) {
                            LiteavLog.m76093w("TXCHttpURLClient", "createConnectionUseCustomHttpDNS failed. error: " + Log.getStackTraceString(e11));
                        }
                    }
                    return (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                }

                /* JADX WARN: Code duplicated, block: B:60:0x00df A[PHI: r2 r4
                  0x00df: PHI (r2v6 java.io.BufferedReader) = (r2v5 java.io.BufferedReader), (r2v8 java.io.BufferedReader) binds: [B:59:0x00dd, B:69:0x011b] A[DONT_GENERATE, DONT_INLINE]
                  0x00df: PHI (r4v3 com.tencent.liteav.txcvodplayer.b.a$b) = (r4v2 com.tencent.liteav.txcvodplayer.b.a$b), (r4v5 com.tencent.liteav.txcvodplayer.b.a$b) binds: [B:59:0x00dd, B:69:0x011b] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    b bVar2;
                    b bVar3;
                    BufferedReader bufferedReader = null;
                    boolean z11 = true;
                    while (z11) {
                        try {
                            try {
                                URLConnection uRLConnectionM76356a = m76356a();
                                if (uRLConnectionM76356a != null) {
                                    uRLConnectionM76356a.setConnectTimeout(15000);
                                    uRLConnectionM76356a.setReadTimeout(15000);
                                    uRLConnectionM76356a.connect();
                                    InputStream inputStream = uRLConnectionM76356a.getInputStream();
                                    if (inputStream == null) {
                                        b bVar4 = bVar;
                                        if (bVar4 != null) {
                                            bVar4.mo76357a();
                                        }
                                        if (bufferedReader != null) {
                                            try {
                                                bufferedReader.close();
                                            } catch (IOException unused) {
                                            }
                                        }
                                        if (!z11 || c34836c.m76377a()) {
                                            return;
                                        }
                                        LiteavLog.m76093w("TXCHttpURLClient", "http retry request failed, no switch host!");
                                        bVar3 = bVar;
                                        if (bVar3 == null) {
                                            return;
                                        }
                                    } else {
                                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
                                        try {
                                            StringBuilder sb2 = new StringBuilder();
                                            while (true) {
                                                String line = bufferedReader2.readLine();
                                                if (line == null) {
                                                    break;
                                                }
                                                sb2.append(line);
                                                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                                            }
                                            this.f73923d = true;
                                            if (bVar != null) {
                                                bVar.mo76358a(sb2.toString(), C34834a.m76355a(uRLConnectionM76356a.getHeaderFields()));
                                            }
                                            try {
                                                bufferedReader2.close();
                                            } catch (IOException unused2) {
                                            }
                                            z11 = false;
                                            bufferedReader = bufferedReader2;
                                        } catch (SSLPeerUnverifiedException e11) {
                                            e = e11;
                                            bufferedReader = bufferedReader2;
                                            LiteavLog.m76093w("TXCHttpURLClient", "playcgi get failed SSLPeerUnverifiedException. url: " + this.f73924e + "error: " + Log.getStackTraceString(e));
                                            this.f73923d = false;
                                            if (bufferedReader != null) {
                                                try {
                                                    bufferedReader.close();
                                                } catch (IOException unused3) {
                                                }
                                            }
                                            if (z11 && !c34836c.m76377a()) {
                                                LiteavLog.m76093w("TXCHttpURLClient", "http retry request failed, no switch host!");
                                                bVar2 = bVar;
                                                if (bVar2 != null) {
                                                    bVar2.mo76357a();
                                                }
                                                z11 = false;
                                            }
                                        } catch (IOException e12) {
                                            e = e12;
                                            bufferedReader = bufferedReader2;
                                            LiteavLog.m76093w("TXCHttpURLClient", "playcgi get failed. url: " + this.f73924e + " error: " + Log.getStackTraceString(e));
                                            if (bufferedReader != null) {
                                                try {
                                                    bufferedReader.close();
                                                } catch (IOException unused4) {
                                                }
                                            }
                                            if (z11 && !c34836c.m76377a()) {
                                                LiteavLog.m76093w("TXCHttpURLClient", "http retry request failed, no switch host!");
                                                bVar2 = bVar;
                                                if (bVar2 != null) {
                                                    bVar2.mo76357a();
                                                }
                                                z11 = false;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            bufferedReader = bufferedReader2;
                                        }
                                    }
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException unused5) {
                                        }
                                    }
                                    if (!z11 || c34836c.m76377a()) {
                                        throw th;
                                    }
                                    LiteavLog.m76093w("TXCHttpURLClient", "http retry request failed, no switch host!");
                                    b bVar5 = bVar;
                                    if (bVar5 == null) {
                                        throw th;
                                    }
                                    bVar5.mo76357a();
                                    throw th;
                                }
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException unused6) {
                                    }
                                }
                                if (!z11 || c34836c.m76377a()) {
                                    return;
                                }
                                LiteavLog.m76093w("TXCHttpURLClient", "http retry request failed, no switch host!");
                                bVar3 = bVar;
                                if (bVar3 == null) {
                                    return;
                                }
                                bVar3.mo76357a();
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (SSLPeerUnverifiedException e13) {
                            e = e13;
                        } catch (IOException e14) {
                            e = e14;
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.b.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo75988a(int i11, String str);

        /* JADX INFO: renamed from: a */
        void mo75989a(C34836c c34836c, TXPlayInfoParams tXPlayInfoParams);
    }

    /* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.b.c$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public String f73966a;

        /* JADX INFO: renamed from: b */
        public String f73967b;

        /* JADX INFO: renamed from: c */
        public String f73968c;

        /* JADX INFO: renamed from: d */
        public String f73969d;
    }

    /* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.b.c$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public ArrayList<String> f73970a;

        /* JADX INFO: renamed from: b */
        public String f73971b;
    }

    /* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.b.c$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public String f73972a;

        /* JADX INFO: renamed from: b */
        public float f73973b;

        public final String toString() {
            return "TCPlayKeyFrameDescInfo{content='" + this.f73972a + "', time=" + this.f73973b + '}';
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.b.c$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public String f73974a;

        /* JADX INFO: renamed from: b */
        public int f73975b;

        /* JADX INFO: renamed from: c */
        public int f73976c;

        /* JADX INFO: renamed from: d */
        public String f73977d;

        /* JADX INFO: renamed from: e */
        public long f73978e;

        /* JADX INFO: renamed from: f */
        public String f73979f;
    }

    /* JADX INFO: renamed from: c */
    public final String m76379c() {
        C34835b c34835b = this.f73946c;
        if (c34835b != null) {
            return c34835b.f73928c;
        }
        C34839f c34839f = this.f73951i;
        if (c34839f != null) {
            return c34839f.m76402d();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final String m76380d() {
        C34835b c34835b = this.f73946c;
        if (c34835b != null) {
            return c34835b.m76362a();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final String m76381e() {
        C34835b c34835b = this.f73946c;
        if (c34835b != null) {
            return c34835b.f73926a;
        }
        C34839f c34839f = this.f73951i;
        if (c34839f != null) {
            return c34839f.m76405g();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final String m76382f() {
        C34835b c34835b = this.f73946c;
        if (c34835b != null) {
            return c34835b.f73927b;
        }
        C34839f c34839f = this.f73951i;
        if (c34839f != null) {
            return c34839f.m76406h();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final int m76383g() {
        C34835b c34835b = this.f73946c;
        if (c34835b != null) {
            return c34835b.f73929d;
        }
        C34839f c34839f = this.f73951i;
        if (c34839f != null) {
            return c34839f.m76400b();
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public final long m76384h() {
        C34835b c34835b = this.f73946c;
        if (c34835b != null) {
            return c34835b.f73930e;
        }
        C34839f c34839f = this.f73951i;
        if (c34839f != null) {
            if (c34839f.f73998b == null) {
                c34839f.f73998b = c34839f.m76401c();
            }
            C34840g c34840g = c34839f.f73998b;
            if (c34840g != null) {
                return c34840g.f74005d;
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: i */
    public final c m76385i() {
        C34835b c34835b = this.f73946c;
        if (c34835b != null) {
            return c34835b.f73934i;
        }
        C34839f c34839f = this.f73951i;
        if (c34839f != null) {
            return c34839f.m76407i();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final List<d> m76386j() {
        C34835b c34835b = this.f73946c;
        if (c34835b != null) {
            return c34835b.f73935j;
        }
        C34839f c34839f = this.f73951i;
        if (c34839f != null) {
            return c34839f.m76408j();
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final List<e> m76387k() {
        C34835b c34835b = this.f73946c;
        if (c34835b != null) {
            return c34835b.f73932g;
        }
        C34839f c34839f = this.f73951i;
        if (c34839f == null) {
            return null;
        }
        List<C34839f.a> listM76409k = c34839f.m76409k();
        List<C34840g> listM76403e = this.f73951i.m76403e();
        if (listM76409k == null || listM76409k.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listM76409k.size());
        for (C34839f.a aVar : listM76409k) {
            e eVar = new e();
            eVar.f73974a = aVar.f74000b;
            List<Integer> list = aVar.f74001c;
            if (list != null) {
                for (C34840g c34840g : listM76403e) {
                    if (list.contains(Integer.valueOf(c34840g.f74010i))) {
                        int i11 = c34840g.f74004c;
                        eVar.f73975b = i11;
                        eVar.f73976c = c34840g.f74003b;
                        if (i11 > 0) {
                            eVar.f73977d = "video";
                        }
                        arrayList.add(eVar);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public final String m76388l() {
        C34835b c34835b = this.f73946c;
        return c34835b != null ? c34835b.f73933h : "";
    }

    /* JADX INFO: renamed from: m */
    public final String m76389m() {
        C34835b c34835b = this.f73946c;
        if (c34835b != null) {
            return c34835b.m76364b();
        }
        return null;
    }

    public C34836c(TXPlayInfoParams tXPlayInfoParams) {
        this.f73945b = tXPlayInfoParams;
    }

    /* JADX INFO: renamed from: b */
    public final String m76378b() {
        C34835b c34835b = this.f73946c;
        if (c34835b != null) {
            String strM76363a = c34835b.m76363a("SimpleAES");
            return !TextUtils.isEmpty(strM76363a) ? strM76363a : this.f73946c.m76363a("plain");
        }
        C34839f c34839f = this.f73951i;
        if (c34839f != null) {
            return c34839f.m76399a();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m76376a(a aVar) {
        if (this.f73945b == null) {
            return;
        }
        C34809a.m76230a().execute(new AnonymousClass1(aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m76370a(String str, Map<String, String> map, final a aVar) {
        if (TextUtils.isEmpty(str)) {
            LiteavLog.m76083e("TXCPlayInfoProtocolV4", "[" + hashCode() + "],parseJson err, content is empty!");
            m76368a(new Runnable() { // from class: com.tencent.liteav.txcvodplayer.b.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.mo75988a(-2, "response content empty error!");
                }
            });
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            final int i11 = jSONObject.getInt("code");
            final String strOptString = jSONObject.optString("message");
            String strOptString2 = jSONObject.optString("warning");
            this.f73952j = jSONObject.optString("context");
            LiteavLog.m76087i("TXCPlayInfoProtocolV4", "context : " + this.f73952j);
            LiteavLog.m76087i("TXCPlayInfoProtocolV4", "message: ".concat(String.valueOf(strOptString)));
            LiteavLog.m76087i("TXCPlayInfoProtocolV4", "warning: ".concat(String.valueOf(strOptString2)));
            if (i11 == 0) {
                int i12 = jSONObject.getInt("version");
                LiteavLog.m76087i("TXCPlayInfoProtocolV4", "version: ".concat(String.valueOf(i12)));
                if (i12 == 2) {
                    this.f73947d = null;
                    this.f73951i = new C34839f(jSONObject);
                } else if (i12 == 4) {
                    this.f73946c = new C34835b(jSONObject);
                    b bVar = this.f73947d;
                    if (bVar != null && !TextUtils.isEmpty(bVar.f73967b) && !TextUtils.isEmpty(this.f73947d.f73966a)) {
                        String strM76366a = m76366a(map, "x-vod-checksum");
                        String strM76215b = C34804a.m76215b(this.f73947d.f73966a.toLowerCase() + this.f73947d.f73967b.toLowerCase() + str.trim());
                        if (!TextUtils.isEmpty(strM76366a) && !TextUtils.isEmpty(strM76215b) && !strM76366a.equalsIgnoreCase(strM76215b)) {
                            LiteavLog.m76093w("TXCPlayInfoProtocolV4", "[" + hashCode() + "], [checkResponseDataValid], response content not valid, vodChecksum=" + strM76366a + " ,bodyMd5=" + strM76215b + " ,content=" + str);
                            m76368a(new Runnable() { // from class: com.tencent.liteav.txcvodplayer.b.c.3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    aVar.mo75988a(-2, "response data invalid!");
                                }
                            });
                            return false;
                        }
                    }
                    return true;
                }
                return true;
            }
            m76368a(new Runnable() { // from class: com.tencent.liteav.txcvodplayer.b.c.4
                @Override // java.lang.Runnable
                public final void run() {
                    LiteavLog.m76083e("TXCPlayInfoProtocolV4", "playcgi response data auth fail, errorCode: " + i11);
                    aVar.mo75988a(-2, strOptString);
                }
            });
            return false;
        } catch (JSONException e11) {
            e11.printStackTrace();
            LiteavLog.m76083e("TXCPlayInfoProtocolV4", "[" + hashCode() + "], parseJson err: " + Log.getStackTraceString(e11));
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m76366a(Map<String, String> map, String str) {
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null && key.equalsIgnoreCase(str)) {
                    return entry.getValue();
                }
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    public final boolean m76377a() {
        List<String> list = this.f73948e;
        if (list != null && this.f73949f >= list.size() - 1) {
            List<String> escapeDomains = EscapeDomainsFetcher.getEscapeDomains(0, this.f73945b.getAppId());
            if (escapeDomains != null && escapeDomains.size() > 0 && !this.f73948e.containsAll(escapeDomains)) {
                this.f73948e.addAll(escapeDomains);
                if (this.f73949f < this.f73948e.size() - 1) {
                    return true;
                }
            }
            return false;
        }
        if (this.f73948e == null && !TextUtils.isEmpty(f73944g)) {
            f73944g = "";
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final String m76375a(String str) {
        C34835b c34835b = this.f73946c;
        if (c34835b != null) {
            return c34835b.m76363a(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m76368a(Runnable runnable) {
        if (ThreadUtils.runningOnUiThread()) {
            runnable.run();
        } else {
            this.f73950h.post(runnable);
        }
    }
}
