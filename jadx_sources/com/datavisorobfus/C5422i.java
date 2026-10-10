package com.datavisorobfus;

import android.content.Context;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.datavisor.vangogh.bridge.config;
import com.datavisor.vangogh.face.DVTokenClient;
import com.tencent.bugly.proguard.C33590cg;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.datavisorobfus.i */
/* JADX INFO: loaded from: classes34.dex */
public class C5422i {

    /* JADX INFO: renamed from: t */
    private static C5422i f7261t = new C5422i();

    /* JADX INFO: renamed from: m */
    public long f7274m;

    /* JADX INFO: renamed from: n */
    public boolean f7275n;

    /* JADX INFO: renamed from: o */
    public boolean f7276o;

    /* JADX INFO: renamed from: g */
    public byte[] f7268g = null;

    /* JADX INFO: renamed from: h */
    public byte[] f7269h = null;

    /* JADX INFO: renamed from: i */
    public long f7270i = 0;

    /* JADX INFO: renamed from: j */
    public long f7271j = 0;

    /* JADX INFO: renamed from: k */
    public String f7272k = "";

    /* JADX INFO: renamed from: l */
    public String f7273l = "";

    /* JADX INFO: renamed from: p */
    private AtomicBoolean f7277p = new AtomicBoolean(false);

    /* JADX INFO: renamed from: s */
    private boolean f7280s = false;

    /* JADX INFO: renamed from: a */
    private String f7262a = "";

    /* JADX INFO: renamed from: b */
    private String f7263b = "";

    /* JADX INFO: renamed from: q */
    private String f7278q = null;

    /* JADX INFO: renamed from: r */
    private boolean f7279r = false;

    /* JADX INFO: renamed from: c */
    public DVTokenClient.InitResultListener f7264c = null;

    /* JADX INFO: renamed from: d */
    public DVTokenClient.InitResultWithExceptionListener f7265d = null;

    /* JADX INFO: renamed from: e */
    public CyclicBarrier f7266e = new CyclicBarrier(2);

    /* JADX INFO: renamed from: f */
    public boolean f7267f = false;

    /* JADX INFO: renamed from: com.datavisorobfus.i$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f7281a;

        public a(Context context) {
            this.f7281a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jM7415d = C5447u0.m7415d(this.f7281a, "DVSPLASTTESTINGTIME");
                if (jM7415d < 0 || jCurrentTimeMillis - jM7415d > 86400000) {
                    C5447u0.m7407a(this.f7281a, "DVSPLASTTESTINGTIME", jCurrentTimeMillis);
                    String strTestVangogh = config.testVangogh(C5422i.this.f7262a);
                    C5422i.this.f7278q = strTestVangogh;
                    if (C5457z0.m7482b(strTestVangogh)) {
                        C5447u0.m7411b(this.f7281a, "DVSPTESTING", strTestVangogh);
                    } else {
                        C5447u0.m7412b(this.f7281a, "DVSPTESTING");
                    }
                } else {
                    C5422i.this.f7278q = C5447u0.m7416e(this.f7281a, "DVSPTESTING");
                }
                C5422i.this.f7279r = true;
            } catch (Throwable th2) {
                C5415f0.m7139a(th2);
            }
        }
    }

    /* JADX INFO: renamed from: com.datavisorobfus.i$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f7283a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f7284b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f7285c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ DVTokenClient.InitResultListener f7286d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ DVTokenClient.InitResultWithExceptionListener f7287e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ Throwable f7288f;

        public b(Context context, String str, int i11, DVTokenClient.InitResultListener initResultListener, DVTokenClient.InitResultWithExceptionListener initResultWithExceptionListener, Throwable th2) {
            this.f7283a = context;
            this.f7284b = str;
            this.f7285c = i11;
            this.f7286d = initResultListener;
            this.f7287e = initResultWithExceptionListener;
            this.f7288f = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            DVTokenClient.InitResultListener initResultListener;
            DVTokenClient.InitResultWithExceptionListener initResultWithExceptionListener;
            int i11;
            Throwable th2;
            try {
                JSONObject jSONObjectM7478c = C5455y0.m7470a(this.f7283a).m7478c(this.f7284b);
                String str = "";
                if (jSONObjectM7478c == null) {
                    C5415f0.m7136a("runListener retTokenToUser jsonObject is null");
                    initResultListener = this.f7286d;
                    if (initResultListener != null) {
                        i11 = this.f7285c;
                        initResultListener.onResult(str, i11);
                    }
                    initResultWithExceptionListener = this.f7287e;
                    if (initResultWithExceptionListener != null) {
                        i11 = this.f7285c;
                        th2 = this.f7288f;
                        initResultWithExceptionListener.onResult(str, i11, th2);
                        return;
                    }
                    return;
                }
                String strOptString = jSONObjectM7478c.optString(InterfaceC33826o0.f71244p, "");
                boolean zOptBoolean = jSONObjectM7478c.optBoolean(C33590cg.f69441k, false);
                if (!C5457z0.m7480a(strOptString)) {
                    str = strOptString;
                }
                i11 = this.f7285c;
                if (i11 == 0 && zOptBoolean) {
                    i11 = 25;
                }
                initResultListener = this.f7286d;
                if (initResultListener == null) {
                    initResultWithExceptionListener = this.f7287e;
                    if (initResultWithExceptionListener != null) {
                        th2 = this.f7288f;
                        initResultWithExceptionListener.onResult(str, i11, th2);
                        return;
                    }
                    return;
                }
                initResultListener.onResult(str, i11);
            } catch (Throwable th3) {
                C5415f0.m7139a(th3);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C5422i m7160b() {
        return f7261t;
    }

    /* JADX INFO: renamed from: d */
    private String m7161d(Context context) {
        if (context == null) {
            return null;
        }
        try {
            if (this.f7277p.compareAndSet(false, true)) {
                C5426k.m7189a().f7302j.execute(new a(context));
            }
            return !this.f7279r ? C5447u0.m7416e(context, "DVSPTESTING") : this.f7278q;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized String m7162a() {
        return this.f7262a;
    }

    /* JADX INFO: renamed from: c */
    public synchronized String m7169c() {
        return this.f7263b;
    }

    /* JADX INFO: renamed from: a */
    public String m7163a(Context context) {
        if (!this.f7280s || context == null) {
            return null;
        }
        try {
            if (C5457z0.m7480a(this.f7262a)) {
                return null;
            }
            String strM7161d = m7161d(context);
            if (C5457z0.m7480a(strM7161d)) {
                return null;
            }
            return m7158a(strM7161d, "dvdm");
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized String m7167b(Context context) {
        String strM7416e;
        try {
            strM7416e = C5447u0.m7416e(context, "SPLASTSESSIONID");
            if (strM7416e == null) {
                strM7416e = "";
            }
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return "";
        }
        return strM7416e;
    }

    /* JADX INFO: renamed from: c */
    public boolean m7170c(Context context) {
        if (!this.f7280s || context == null) {
            return true;
        }
        try {
            if (C5457z0.m7480a(this.f7262a)) {
                return true;
            }
            String strM7161d = m7161d(context);
            if (C5457z0.m7480a(strM7161d)) {
                return true;
            }
            String strM7158a = m7158a(strM7161d, "dvsw");
            return C5457z0.m7480a(strM7158a) || Integer.parseInt(strM7158a) != 0;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return true;
        }
    }

    private C5422i() {
        this.f7274m = 0L;
        this.f7275n = false;
        this.f7276o = false;
        this.f7274m = System.currentTimeMillis() - SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
        this.f7275n = false;
        this.f7276o = false;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m7168b(String str) {
        try {
            if (C5457z0.m7480a(str)) {
                return;
            }
            if (C5457z0.m7482b(this.f7263b)) {
            } else {
                this.f7263b = str;
            }
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
        }
    }

    /* JADX INFO: renamed from: a */
    private String m7158a(String str, String str2) {
        if (!C5457z0.m7480a(str) && !C5457z0.m7480a(str2)) {
            try {
                for (String str3 : str.split("&")) {
                    String[] strArrSplit = str3.split("=");
                    if (strArrSplit.length == 2 && strArrSplit[0].trim().equals(str2)) {
                        return strArrSplit[1].trim();
                    }
                }
                return null;
            } catch (Throwable th2) {
                C5415f0.m7139a(th2);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m7164a(Context context, int i11, Throwable th2, String str) {
        this.f7275n = i11 == 0;
        new Thread(new b(context, str, i11, this.f7264c, this.f7265d, th2)).start();
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m7165a(Context context, String str) {
        if (context == null) {
            return;
        }
        try {
            if (C5457z0.m7482b(str)) {
                C5447u0.m7411b(context, "SPLASTSESSIONID", str);
            } else if (C5447u0.m7409a(context, "SPLASTSESSIONID")) {
                C5447u0.m7412b(context, "SPLASTSESSIONID");
            }
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m7166a(String str) {
        try {
            if (C5457z0.m7480a(str)) {
                return;
            }
            if (C5457z0.m7482b(this.f7262a)) {
            } else {
                this.f7262a = str;
            }
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
        }
    }
}
