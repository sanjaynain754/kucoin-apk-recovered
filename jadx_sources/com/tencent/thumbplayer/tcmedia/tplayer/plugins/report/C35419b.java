package com.tencent.thumbplayer.tcmedia.tplayer.plugins.report;

import android.app.UiModeManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.camera.core.processing.util.GLUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.webkit.ProxyConfig;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import com.tencent.thumbplayer.tcmedia.api.TPErrorCode;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr;
import com.tencent.thumbplayer.tcmedia.api.report.ITPBusinessReportManager;
import com.tencent.thumbplayer.tcmedia.api.report.TPDefaultReportInfo;
import com.tencent.thumbplayer.tcmedia.api.report.TPLiveReportInfo;
import com.tencent.thumbplayer.tcmedia.api.report.TPVodReportInfo;
import com.tencent.thumbplayer.tcmedia.common.p158a.C35305b;
import com.tencent.thumbplayer.tcmedia.common.p158a.InterfaceC35304a;
import com.tencent.thumbplayer.tcmedia.config.TPPlayerConfig;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyHelper;
import com.tencent.thumbplayer.tcmedia.tplayer.plugins.InterfaceC35415a;
import com.tencent.thumbplayer.tcmedia.utils.C35423c;
import com.tencent.thumbplayer.tcmedia.utils.C35426f;
import com.tencent.thumbplayer.tcmedia.utils.C35427g;
import com.tencent.thumbplayer.tcmedia.utils.C35432l;
import com.tencent.thumbplayer.tcmedia.utils.C35435o;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.b */
/* JADX INFO: loaded from: classes64.dex */
public class C35419b implements ITPBusinessReportManager, InterfaceC35415a {

    /* JADX INFO: renamed from: a */
    private static final String f76490a = String.format("Android %s", TPSystemInfo.getOsVersion());

    /* JADX INFO: renamed from: b */
    private static String f76491b = "";

    /* JADX INFO: renamed from: c */
    private static boolean f76492c = false;

    /* JADX INFO: renamed from: h */
    private static C35423c f76493h = null;

    /* JADX INFO: renamed from: I */
    private Context f76502I;

    /* JADX INFO: renamed from: d */
    private HandlerThread f76511d;

    /* JADX INFO: renamed from: e */
    private b f76512e;

    /* JADX INFO: renamed from: f */
    private final Object f76513f = new Object();

    /* JADX INFO: renamed from: g */
    private boolean f76514g = false;

    /* JADX INFO: renamed from: i */
    private TPDefaultReportInfo f76515i = null;

    /* JADX INFO: renamed from: j */
    private TPReportParams f76516j = null;

    /* JADX INFO: renamed from: k */
    private int f76517k = 1;

    /* JADX INFO: renamed from: l */
    private int f76518l = 0;

    /* JADX INFO: renamed from: m */
    private boolean f76519m = true;

    /* JADX INFO: renamed from: n */
    private boolean f76520n = true;

    /* JADX INFO: renamed from: o */
    private boolean f76521o = false;

    /* JADX INFO: renamed from: p */
    private boolean f76522p = false;

    /* JADX INFO: renamed from: q */
    private long f76523q = 0;

    /* JADX INFO: renamed from: r */
    private long f76524r = 0;

    /* JADX INFO: renamed from: s */
    private int f76525s = 81;

    /* JADX INFO: renamed from: t */
    private int f76526t = 0;

    /* JADX INFO: renamed from: u */
    private int f76527u = 0;

    /* JADX INFO: renamed from: v */
    private int f76528v = 0;

    /* JADX INFO: renamed from: w */
    private boolean f76529w = false;

    /* JADX INFO: renamed from: x */
    private boolean f76530x = false;

    /* JADX INFO: renamed from: y */
    private boolean f76531y = false;

    /* JADX INFO: renamed from: z */
    private String f76532z = "0";

    /* JADX INFO: renamed from: A */
    private String f76494A = "";

    /* JADX INFO: renamed from: B */
    private String f76495B = "";

    /* JADX INFO: renamed from: C */
    private String f76496C = "";

    /* JADX INFO: renamed from: D */
    private int f76497D = 0;

    /* JADX INFO: renamed from: E */
    private int f76498E = 0;

    /* JADX INFO: renamed from: F */
    private String f76499F = "";

    /* JADX INFO: renamed from: G */
    private int f76500G = 0;

    /* JADX INFO: renamed from: H */
    private long f76501H = 0;

    /* JADX INFO: renamed from: J */
    private int f76503J = -1;

    /* JADX INFO: renamed from: K */
    private c f76504K = new a();

    /* JADX INFO: renamed from: L */
    private double f76505L = 1.0d;

    /* JADX INFO: renamed from: M */
    private boolean f76506M = true;

    /* JADX INFO: renamed from: N */
    private TPReportParams.BufferingOnceParams f76507N = null;

    /* JADX INFO: renamed from: O */
    private TPReportParams.UserSeekOnceParams f76508O = null;

    /* JADX INFO: renamed from: P */
    private final e f76509P = new e();

    /* JADX INFO: renamed from: Q */
    private C35426f.a f76510Q = new C35426f.a() { // from class: com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.b.1
        @Override // com.tencent.thumbplayer.tcmedia.utils.C35426f.a
        /* JADX INFO: renamed from: a */
        public void mo78011a(int i11, int i12, int i13, Object obj) {
            int i14;
            TPLogUtil.m78800i("TPReportManager", "OnGlobalEventChangeListener eventId: ".concat(String.valueOf(i11)));
            switch (i11) {
                case TPPlayerMgr.EVENT_ID_APP_ENTER_BACKGROUND /* 100001 */:
                    i14 = 2100;
                    break;
                case TPPlayerMgr.EVENT_ID_APP_ENTER_FOREGROUND /* 100002 */:
                    i14 = 2101;
                    break;
                default:
                    return;
            }
            C35419b.this.f76512e.obtainMessage(i14, null).sendToTarget();
        }
    };

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.b$a */
    public class a implements c {
        public a() {
        }

        @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.C35419b.c
        /* JADX INFO: renamed from: a */
        public void mo78794a(int i11, InterfaceC35304a interfaceC35304a) {
            C35419b.this.m78710a(interfaceC35304a, i11, i11 <= 30);
            C35419b.this.m78709a(interfaceC35304a);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.b$b */
    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object obj = message.obj;
            Map map = obj instanceof Map ? (Map) obj : null;
            int i11 = message.what;
            if (i11 == 100) {
                C35419b.this.m78759l();
                return;
            }
            if (i11 == 3000) {
                C35419b.this.m78740f();
                return;
            }
            if (i11 == 4000) {
                C35419b.this.m78753j();
                return;
            }
            if (i11 == 2100) {
                C35419b.this.m78750i();
                return;
            }
            if (i11 == 2101) {
                C35419b.this.m78744g();
                return;
            }
            switch (i11) {
                case 999:
                    C35419b.this.m78719a((Map<String, Object>) map);
                    break;
                case 1000:
                    C35419b.this.m78727b((Map<String, Object>) map);
                    break;
                case 1001:
                    C35419b.this.m78730c((Map<String, Object>) map);
                    break;
                case 1002:
                    C35419b.this.m78734d((Map<String, Object>) map);
                    break;
                case 1003:
                    C35419b.this.m78738e((Map<String, Object>) map);
                    break;
                case 1004:
                    C35419b.this.m78746g((Map<String, Object>) map);
                    break;
                case 1005:
                    C35419b.this.m78749h(map);
                    break;
                case 1006:
                    C35419b.this.m78752i(map);
                    break;
                case 1007:
                    C35419b.this.m78755j(map);
                    break;
                case 1008:
                    C35419b.this.m78758k(map);
                    break;
                case 1009:
                    C35419b.this.m78767n(map);
                    break;
                case 1010:
                    C35419b.this.m78772p(map);
                    break;
                case 1011:
                    C35419b.this.m78770o(map);
                    break;
                case 1012:
                    C35419b.this.m78742f((Map<String, Object>) map);
                    break;
                case 1013:
                    C35419b.this.m78761l(map);
                    break;
                case 1014:
                    C35419b.this.m78764m(map);
                    break;
                case 1015:
                    C35419b.this.m78776r(map);
                    break;
                case 1016:
                    if (obj instanceof String) {
                        C35419b.this.m78718a((String) obj);
                    }
                    break;
                case 1017:
                    C35419b.this.m78700C(map);
                    break;
                case 1018:
                    C35419b.this.m78702D(map);
                    break;
                case 1019:
                    C35419b.this.m78696A(map);
                    break;
                case 1020:
                    C35419b.this.m78790y(map);
                    break;
                case 1021:
                    C35419b.this.m78792z(map);
                    break;
                case 1022:
                    C35419b.this.m78698B(map);
                    break;
                case 1023:
                    C35419b.this.m78703E(map);
                    break;
                default:
                    switch (i11) {
                        case 2000:
                            C35419b.this.m78778s(map);
                            break;
                        case 2001:
                            C35419b.this.m78780t(map);
                            break;
                        case 2002:
                            C35419b.this.m78784v(map);
                            break;
                        case 2003:
                            C35419b.this.m78782u(map);
                            break;
                        case 2004:
                            C35419b.this.m78786w(map);
                            break;
                        case 2005:
                            C35419b.this.m78788x(map);
                            break;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.b$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo78794a(int i11, InterfaceC35304a interfaceC35304a);
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.b$d */
    public class d implements c {
        public d() {
        }

        @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.C35419b.c
        /* JADX INFO: renamed from: a */
        public void mo78794a(int i11, InterfaceC35304a interfaceC35304a) {
            C35432l c35432l = new C35432l();
            boolean z11 = i11 <= 30 || i11 == 263;
            if (i11 == 30) {
                i11 = 205;
            } else if (i11 == 50) {
                C35419b.this.f76512e.removeMessages(3000);
                i11 = 263;
            } else if (i11 == 150) {
                C35419b.this.f76512e.removeMessages(3000);
            } else {
                if (i11 != 263) {
                    return;
                }
                C35419b.this.f76512e.removeMessages(3000);
                C35419b.this.f76512e.sendEmptyMessageDelayed(3000, 60000L);
            }
            C35419b.this.m78710a(c35432l, i11, z11);
            C35419b.this.m78722b(c35432l, z11);
            if (i11 != 205) {
                c35432l.mo78036a("loadingtime", 0);
            }
            TPLogUtil.m78800i("TPReportManager", "liveExParam.prePlayLengthInt: " + C35419b.this.f76516j.getLiveExParam().prePlayLengthInt);
            C35419b.this.m78709a(c35432l);
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.b$e */
    public class e {

        /* JADX INFO: renamed from: a */
        long f76537a;

        /* JADX INFO: renamed from: b */
        int f76538b;

        /* JADX INFO: renamed from: c */
        long f76539c;

        /* JADX INFO: renamed from: d */
        long f76540d;

        /* JADX INFO: renamed from: e */
        int f76541e;

        /* JADX INFO: renamed from: f */
        int f76542f;

        /* JADX INFO: renamed from: g */
        long f76543g;

        /* JADX INFO: renamed from: h */
        long f76544h;

        /* JADX INFO: renamed from: i */
        int f76545i;

        /* JADX INFO: renamed from: j */
        int f76546j;

        /* JADX INFO: renamed from: k */
        int f76547k;

        /* JADX INFO: renamed from: l */
        int f76548l;

        /* JADX INFO: renamed from: m */
        boolean f76549m;

        /* JADX INFO: renamed from: n */
        boolean f76550n;

        /* JADX INFO: renamed from: o */
        boolean f76551o;

        /* JADX INFO: renamed from: p */
        int f76552p;

        /* JADX INFO: renamed from: q */
        String f76553q;

        /* JADX INFO: renamed from: r */
        String f76554r;

        /* JADX INFO: renamed from: s */
        String f76555s;

        /* JADX INFO: renamed from: t */
        String f76556t;

        /* JADX INFO: renamed from: u */
        String f76557u;

        /* JADX INFO: renamed from: v */
        String f76558v;

        /* JADX INFO: renamed from: w */
        ArrayList<f> f76559w;

        private e() {
            this.f76537a = 0L;
            this.f76538b = 0;
            this.f76539c = 0L;
            this.f76540d = 0L;
            this.f76541e = 0;
            this.f76542f = 0;
            this.f76543g = 0L;
            this.f76544h = 0L;
            this.f76545i = 0;
            this.f76546j = 0;
            this.f76547k = 0;
            this.f76548l = 0;
            this.f76549m = false;
            this.f76550n = false;
            this.f76551o = false;
            this.f76552p = -1;
            this.f76553q = "";
            this.f76554r = "";
            this.f76555s = "";
            this.f76556t = "";
            this.f76557u = "";
            this.f76558v = "";
            this.f76559w = new ArrayList<>();
        }

        /* JADX INFO: renamed from: a */
        public void m78795a() {
            this.f76537a = 0L;
            this.f76538b = 0;
            this.f76539c = 0L;
            this.f76540d = 0L;
            this.f76541e = 0;
            this.f76542f = 0;
            this.f76543g = 0L;
            this.f76544h = 0L;
            this.f76545i = 0;
            this.f76546j = 0;
            this.f76547k = 0;
            this.f76548l = 0;
            this.f76549m = false;
            this.f76550n = false;
            this.f76551o = false;
            this.f76552p = -1;
            this.f76553q = "";
            this.f76554r = "";
            this.f76555s = "";
            this.f76556t = "";
            this.f76557u = "";
            this.f76558v = "";
            this.f76559w.clear();
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.b$f */
    public class f {

        /* JADX INFO: renamed from: a */
        String f76561a;

        /* JADX INFO: renamed from: b */
        String f76562b;

        /* JADX INFO: renamed from: c */
        long f76563c = -1;

        public f(String str, String str2) {
            this.f76561a = str;
            this.f76562b = str2;
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.b$g */
    public class g implements c {
        public g() {
        }

        @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.report.C35419b.c
        /* JADX INFO: renamed from: a */
        public void mo78794a(int i11, InterfaceC35304a interfaceC35304a) {
            boolean z11 = i11 <= 30;
            C35419b.this.m78710a(interfaceC35304a, i11, z11);
            C35419b.this.m78711a(interfaceC35304a, z11);
            C35419b.this.m78709a(interfaceC35304a);
        }
    }

    /* JADX INFO: renamed from: a */
    private float m78704a(Map<String, Object> map, String str, float f11) {
        Object obj;
        return (map == null || (obj = map.get(str)) == null) ? f11 : ((Float) obj).floatValue();
    }

    /* JADX INFO: renamed from: b */
    private int m78721b(int i11) {
        switch (i11) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 3;
            case 13:
                return 4;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m78731d() {
        this.f76511d = C35435o.m78917a().m78919a("TP-ReportThread");
        this.f76512e = new b(this.f76511d.getLooper());
        this.f76516j = new TPReportParams();
        C35426f.m78866a(this.f76510Q);
        synchronized (C35419b.class) {
            try {
                if (f76493h == null) {
                    f76493h = new C35423c(this.f76502I, "TPReportCache");
                }
                if (!f76492c) {
                    this.f76512e.obtainMessage(TPErrorCode.TP_ERROR_TYPE_DOWNLOAD_PROXY).sendToTarget();
                }
                f76492c = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private void m78735e() {
        TPLogUtil.m78800i("TPReportManager", "release: ");
        C35426f.m78867b(this.f76510Q);
        HandlerThread handlerThread = this.f76511d;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f76511d = null;
        }
        TPLogUtil.m78800i("TPReportManager", "release: end!");
    }

    /* JADX INFO: renamed from: h */
    private void m78747h() {
        TPLogUtil.m78800i("TPReportManager", "removeCacheEvent: mFlowId: " + this.f76496C);
        if (f76493h == null || TextUtils.isEmpty(this.f76496C)) {
            return;
        }
        f76493h.m78851a(this.f76496C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m78750i() {
        TPLogUtil.m78800i("TPReportManager", "onAppBackground");
        if (this.f76519m || this.f76503J == 1 || !this.f76520n) {
            return;
        }
        this.f76520n = false;
        C35432l c35432l = new C35432l();
        this.f76516j.getBufferingTotalParams().paramsToProperties(c35432l);
        this.f76516j.getUserSeekTotalParams().paramsToProperties(c35432l);
        TPReportParams.PlayDoneParams playDoneParams = this.f76516j.getPlayDoneParams();
        playDoneParams.endTimeUnix = System.currentTimeMillis();
        playDoneParams.reasonInt = 2;
        playDoneParams.errCodeString = this.f76532z;
        e eVar = this.f76509P;
        if (eVar.f76537a > 0) {
            int i11 = eVar.f76538b;
            long jCurrentTimeMillis = System.currentTimeMillis();
            e eVar2 = this.f76509P;
            eVar.f76538b = i11 + ((int) (jCurrentTimeMillis - eVar2.f76537a));
            eVar2.f76537a = 0L;
        }
        long j11 = this.f76523q;
        if (j11 > 0) {
            this.f76524r += playDoneParams.endTimeUnix - j11;
            this.f76523q = 0L;
        }
        playDoneParams.playDurationFloat = this.f76524r / 1000.0f;
        playDoneParams.paramsToProperties(c35432l);
        TPReportParams.CommonParams commonParams = this.f76516j.getCommonParams();
        commonParams.stepInt = 50;
        commonParams.paramsToProperties(c35432l);
        int i12 = this.f76503J;
        if (i12 == 0) {
            m78711a((InterfaceC35304a) c35432l, false);
        } else if (i12 == 1) {
            m78722b((InterfaceC35304a) c35432l, false);
        }
        if (f76493h == null || TextUtils.isEmpty(this.f76496C) || !this.f76506M) {
            return;
        }
        TPLogUtil.m78800i("TPReportManager", "Cache report event. mFlowId: " + this.f76496C);
        f76493h.m78852a(this.f76496C, c35432l.m78901a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m78753j() {
        TPLogUtil.m78800i("TPReportManager", "onReportLastEvent");
        C35423c c35423c = f76493h;
        if (c35423c == null) {
            return;
        }
        try {
            ArrayList arrayList = (ArrayList) c35423c.m78850a();
            if (arrayList == null) {
                return;
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                try {
                    Properties properties = (Properties) arrayList.get(i11);
                    if (properties != null) {
                        m78709a(new C35432l(properties));
                    }
                } catch (Exception e11) {
                    TPLogUtil.m78798e("TPReportManager", e11);
                }
            }
        } catch (Exception e12) {
            TPLogUtil.m78798e("TPReportManager", e12);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m78756k() {
        this.f76523q = 0L;
        this.f76524r = 0L;
        this.f76528v = 0;
        this.f76527u = 0;
        this.f76529w = false;
        this.f76530x = false;
        this.f76521o = false;
        this.f76522p = false;
        this.f76496C = "";
        this.f76497D = 0;
        this.f76498E = 0;
        this.f76500G = 0;
        this.f76501H = 0L;
        this.f76526t = 0;
        this.f76531y = false;
        this.f76494A = "";
        this.f76495B = "";
        this.f76499F = "";
        this.f76503J = -1;
        this.f76532z = "0";
        this.f76509P.m78795a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m78759l() {
        TPLogUtil.m78796d("TPReportManager", "handleReportThreadExit");
        synchronized (this.f76513f) {
            this.f76514g = true;
            this.f76513f.notify();
        }
    }

    /* JADX INFO: renamed from: m */
    private String m78762m() {
        if (this.f76502I == null) {
            return "0";
        }
        if (!TextUtils.isEmpty(f76491b)) {
            return f76491b;
        }
        int i11 = this.f76502I.getResources().getDisplayMetrics().widthPixels;
        String str = this.f76502I.getResources().getDisplayMetrics().heightPixels + ProxyConfig.MATCH_ALL_SCHEMES + i11;
        f76491b = str;
        return str;
    }

    /* JADX INFO: renamed from: n */
    private int m78765n() {
        NetworkInfo activeNetworkInfo;
        Context context = this.f76502I;
        if (context == null) {
            return 0;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    return m78721b(activeNetworkInfo.getSubtype());
                }
                if (type == 1) {
                    return 1;
                }
                if (type == 9) {
                    return 10;
                }
            }
            return 0;
        } catch (Exception e11) {
            TPLogUtil.m78798e("TPReportManager", e11);
            return 0;
        }
    }

    /* JADX INFO: renamed from: o */
    private int m78768o() {
        UiModeManager uiModeManager = (UiModeManager) this.f76502I.getSystemService("uimode");
        if (uiModeManager == null) {
            return 2;
        }
        if (uiModeManager.getCurrentModeType() == 4) {
            return 9;
        }
        return (this.f76502I.getResources().getConfiguration().screenLayout & 15) >= 3 ? 5 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public void m78696A(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        TPReportParams.LiveExParam liveExParam = this.f76516j.getLiveExParam();
        long jM78706a = m78706a(map, "stime", System.currentTimeMillis());
        liveExParam.getSyncFrameDurationInt = (int) (jM78706a - this.f76509P.f76539c);
        this.f76516j.getFirstLoadParams().firstPacketReadTimeUnix = jM78706a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public void m78698B(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f76516j.getFirstLoadParams().firstOpenTimeUnix = m78706a(map, "stime", System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public void m78700C(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        int iM78705a = m78705a(map, "speed", 0);
        this.f76526t = iM78705a;
        e eVar = this.f76509P;
        eVar.f76547k += iM78705a;
        eVar.f76548l++;
        if (iM78705a > eVar.f76546j) {
            eVar.f76546j = iM78705a;
        }
        String strM78708a = m78708a(map, "spanId", "");
        if (TextUtils.isEmpty(strM78708a)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strM78708a);
            if (jSONObject.has("spanId")) {
                this.f76509P.f76557u = jSONObject.getString("spanId");
            }
        } catch (Exception e11) {
            TPLogUtil.m78798e("TPReportManager", e11);
        }
        m78726b(strM78708a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public void m78702D(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f76509P.f76554r = m78708a(map, "url", "");
        this.f76509P.f76555s = m78708a(map, "cdnip", "");
        this.f76509P.f76556t = m78708a(map, "cdnuip", "");
        if (TextUtils.isEmpty(this.f76509P.f76554r) || !this.f76509P.f76554r.contains("sid=")) {
            return;
        }
        int iIndexOf = this.f76509P.f76554r.indexOf("sid=");
        int iIndexOf2 = this.f76509P.f76554r.indexOf("&", iIndexOf);
        e eVar = this.f76509P;
        eVar.f76558v = iIndexOf2 >= 0 ? eVar.f76554r.substring(iIndexOf + 4, iIndexOf2) : eVar.f76554r.substring(iIndexOf + 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public void m78703E(Map<String, Object> map) {
        this.f76494A = m78708a(map, "proto", "");
        this.f76495B = m78708a(map, "protover", "");
    }

    /* JADX INFO: renamed from: a */
    private int m78705a(Map<String, Object> map, String str, int i11) {
        Object obj;
        return (map == null || (obj = map.get(str)) == null) ? i11 : ((Integer) obj).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m78740f() {
        TPLogUtil.m78800i("TPReportManager", "onLivePeriodReport");
        this.f76504K.mo78794a(TPReportParams.LIVE_STEP_PLAY, new C35432l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m78744g() {
        TPLogUtil.m78800i("TPReportManager", "onAppForeground");
        if (this.f76520n) {
            return;
        }
        this.f76520n = true;
        m78747h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public void m78772p(Map<String, Object> map) {
        TPLogUtil.m78800i("TPReportManager", "onPlayerRelease");
        if (map == null) {
            return;
        }
        map.put("reason", 1);
        m78774q(map);
    }

    /* JADX INFO: renamed from: q */
    private void m78774q(Map<String, Object> map) {
        TPLogUtil.m78800i("TPReportManager", "onPlayEnd");
        if (map == null || this.f76519m) {
            return;
        }
        this.f76519m = true;
        if (this.f76503J != 1 && this.f76521o) {
            m78734d(new C35427g().m78868a("etime", Long.valueOf(System.currentTimeMillis())).m78869a());
        }
        if (this.f76530x) {
            m78764m(new C35427g().m78868a("etime", Long.valueOf(System.currentTimeMillis())).m78869a());
        }
        if (this.f76529w) {
            m78758k(new C35427g().m78868a("etime", Long.valueOf(System.currentTimeMillis())).m78869a());
        }
        e eVar = this.f76509P;
        if (eVar.f76537a > 0) {
            int i11 = eVar.f76538b;
            long jCurrentTimeMillis = System.currentTimeMillis();
            e eVar2 = this.f76509P;
            eVar.f76538b = i11 + ((int) (jCurrentTimeMillis - eVar2.f76537a));
            eVar2.f76537a = 0L;
        }
        this.f76529w = false;
        C35432l c35432l = new C35432l();
        this.f76516j.getBufferingTotalParams().paramsToProperties(c35432l);
        this.f76516j.getBufferingTotalParams().reset();
        this.f76516j.getUserSeekTotalParams().paramsToProperties(c35432l);
        this.f76516j.getUserSeekTotalParams().reset();
        TPReportParams.PlayDoneParams playDoneParams = this.f76516j.getPlayDoneParams();
        playDoneParams.endTimeUnix = m78706a(map, "etime", System.currentTimeMillis());
        playDoneParams.reasonInt = m78705a(map, "reason", 0);
        playDoneParams.errCodeString = this.f76532z;
        long j11 = this.f76523q;
        if (j11 > 0) {
            this.f76524r += playDoneParams.endTimeUnix - j11;
            this.f76523q = 0L;
        }
        playDoneParams.playDurationFloat = this.f76524r / 1000.0f;
        playDoneParams.paramsToProperties(c35432l);
        this.f76504K.mo78794a(50, c35432l);
        this.f76532z = "0";
        this.f76516j.resetAllParam();
        m78747h();
        m78756k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public void m78776r(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f76517k = m78704a(map, DropFrameTable.COLUMN_SCENE, 1.0f) != 1.0f ? 2 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public void m78778s(Map<String, Object> map) {
        TPLogUtil.m78800i("TPReportManager", "onGetCdn");
        if (map == null) {
            return;
        }
        C35432l c35432l = new C35432l();
        TPReportParams.GetCdnUrlParams getCdnParams = this.f76516j.getGetCdnParams();
        getCdnParams.proxyIpString = m78708a(map, "ip", "");
        getCdnParams.starTimeUnix = m78706a(map, "stime", 0L);
        getCdnParams.endTimeUnix = m78706a(map, "etime", 0L);
        getCdnParams.errCodeString = m78708a(map, "code", "0");
        getCdnParams.paramsToProperties(c35432l);
        this.f76504K.mo78794a(15, c35432l);
        if (TextUtils.isEmpty(getCdnParams.errCodeString) || getCdnParams.errCodeString.equals("0") || getCdnParams.errCodeString.equals(GLUtils.VERSION_UNKNOWN)) {
            return;
        }
        this.f76532z = getCdnParams.errCodeString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public void m78780t(Map<String, Object> map) {
        TPLogUtil.m78800i("TPReportManager", "on302Redirect");
        if (map == null) {
            return;
        }
        C35432l c35432l = new C35432l();
        TPReportParams.RedirectParams redirectParams = this.f76516j.getRedirectParams();
        redirectParams.cdnTypeInt = m78705a(map, "vt", 0);
        redirectParams.redirectCountInt = m78705a(map, "t302", 0);
        redirectParams.redirectedUrlString = m78708a(map, "url", "");
        redirectParams.starTimeUnix = m78706a(map, "stime", 0L);
        redirectParams.endTimeUnix = m78706a(map, "etime", 0L);
        redirectParams.errCodeString = m78708a(map, "code", "0");
        redirectParams.paramsToProperties(c35432l);
        this.f76504K.mo78794a(34, c35432l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m78782u(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f76496C = UUID.randomUUID().toString() + System.nanoTime() + "_" + TPPlayerConfig.getPlatform();
        this.f76532z = m78708a(map, "code", "0");
        TPDefaultReportInfo tPDefaultReportInfo = this.f76515i;
        if (tPDefaultReportInfo != null) {
            this.f76503J = tPDefaultReportInfo.getPlayType();
        }
        if (this.f76503J == 1) {
            this.f76504K.mo78794a(150, new C35432l());
        } else {
            map.put("reason", 3);
            this.f76519m = false;
            m78774q(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m78784v(Map<String, Object> map) {
        TPLogUtil.m78800i("TPReportManager", "onLoadSubtitle");
        if (map == null) {
            return;
        }
        this.f76509P.f76559w.add(new f(m78708a(map, "name", ""), m78708a(map, "url", "")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public void m78786w(Map<String, Object> map) {
        TPLogUtil.m78800i("TPReportManager", "onSelectTrack");
        if (map == null || this.f76509P.f76559w.size() == 0 || m78705a(map, "tracktype", 0) != 3) {
            return;
        }
        this.f76522p = true;
        this.f76509P.f76549m = true;
        TPReportParams.LoadSubtitleParams loadSubtitleParams = this.f76516j.getLoadSubtitleParams();
        loadSubtitleParams.starTimeUnix = m78706a(map, "stime", 0L);
        TPDefaultReportInfo tPDefaultReportInfo = this.f76515i;
        if (tPDefaultReportInfo != null) {
            loadSubtitleParams.cdnTypeInt = tPDefaultReportInfo.subtitleCdnType;
            loadSubtitleParams.cgiUrlIndex = tPDefaultReportInfo.subtitleUrlIndex;
        }
        long jM78706a = m78706a(map, "opaque", -1L);
        String strM78708a = m78708a(map, "name", "");
        for (f fVar : this.f76509P.f76559w) {
            if (!TextUtils.isEmpty(strM78708a) && fVar.f76561a.equals(strM78708a)) {
                loadSubtitleParams.subtitleUrlString = fVar.f76562b;
                fVar.f76563c = jM78706a;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public void m78788x(Map<String, Object> map) {
        TPLogUtil.m78800i("TPReportManager", "onSelectTrackDone");
        if (!this.f76522p || map == null || this.f76509P.f76559w.size() == 0) {
            return;
        }
        long jM78706a = m78706a(map, "opaque", -1L);
        if (jM78706a == -1) {
            return;
        }
        Iterator<f> it = this.f76509P.f76559w.iterator();
        while (it.hasNext()) {
            if (it.next().f76563c == jM78706a) {
                TPReportParams.LoadSubtitleParams loadSubtitleParams = this.f76516j.getLoadSubtitleParams();
                loadSubtitleParams.endTimeUnix = m78706a(map, "etime", 0L);
                loadSubtitleParams.errCodeString = m78708a(map, "code", "0");
                loadSubtitleParams.bufferingDurationInt = (int) (loadSubtitleParams.endTimeUnix - loadSubtitleParams.starTimeUnix);
                C35432l c35432l = new C35432l();
                loadSubtitleParams.paramsToProperties(c35432l);
                this.f76504K.mo78794a(33, c35432l);
                this.f76522p = false;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m78790y(Map<String, Object> map) {
        TPLogUtil.m78800i("TPReportManager", "onSwitchDef");
        if (map == null) {
            return;
        }
        this.f76509P.f76553q = m78708a(map, "switch", "");
        this.f76509P.f76551o = true;
        if (this.f76503J == 1) {
            this.f76512e.removeMessages(3000);
            m78740f();
            e eVar = this.f76509P;
            eVar.f76539c = 0L;
            eVar.f76540d = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public void m78792z(Map<String, Object> map) {
        TPLogUtil.m78800i("TPReportManager", "onSwitchDefEnd");
        if (map == null) {
            return;
        }
        this.f76509P.f76553q = m78708a(map, "switch", "");
        this.f76509P.f76551o = false;
        if (this.f76503J == 1) {
            this.f76504K.mo78794a(30, new C35432l());
            this.f76512e.removeMessages(3000);
            this.f76512e.sendEmptyMessageDelayed(3000, 60000L);
            this.f76509P.f76537a = System.currentTimeMillis();
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.InterfaceC35415a
    /* JADX INFO: renamed from: b */
    public void mo78184b() {
        m78735e();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.report.ITPBusinessReportManager
    public void setReportInfoGetter(TPDefaultReportInfo tPDefaultReportInfo) {
        this.f76515i = tPDefaultReportInfo;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.report.ITPBusinessReportManager
    public void setReportSamplingRate(double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        if (d11 > 1.0d) {
            d11 = 1.0d;
        }
        this.f76505L = d11;
    }

    public C35419b(Context context) {
        this.f76502I = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    private long m78706a(Map<String, Object> map, String str, long j11) {
        Object obj;
        return (map == null || (obj = map.get(str)) == null) ? j11 : ((Long) obj).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m78722b(InterfaceC35304a interfaceC35304a, boolean z11) {
        TPReportParams.LiveExParam liveExParam = this.f76516j.getLiveExParam();
        if (liveExParam == null) {
            return;
        }
        TPDefaultReportInfo tPDefaultReportInfo = this.f76515i;
        if (tPDefaultReportInfo != null && (tPDefaultReportInfo instanceof TPLiveReportInfo) && z11) {
            liveExParam.adPlayLengthInt = ((TPLiveReportInfo) tPDefaultReportInfo).adPlayLength;
            liveExParam.liveProgramIdInt = ((TPLiveReportInfo) tPDefaultReportInfo).programId;
            liveExParam.streamIdInt = ((TPLiveReportInfo) tPDefaultReportInfo).streamId;
            liveExParam.contentIdInt = ((TPLiveReportInfo) tPDefaultReportInfo).contentId;
            liveExParam.playTimeInt = ((TPLiveReportInfo) tPDefaultReportInfo).playTime;
            liveExParam.liveTypeInt = ((TPLiveReportInfo) tPDefaultReportInfo).liveType;
            liveExParam.isUserPayInt = ((TPLiveReportInfo) tPDefaultReportInfo).isUserPay ? 1 : 0;
            liveExParam.isLookBackInt = ((TPLiveReportInfo) tPDefaultReportInfo).isLookBack ? 1 : 0;
            liveExParam.cdnServerString = ((TPLiveReportInfo) tPDefaultReportInfo).cdnServer;
            liveExParam.freeTypeInt = tPDefaultReportInfo.freeType;
            liveExParam.userQXString = tPDefaultReportInfo.uin;
            liveExParam.userIpString = tPDefaultReportInfo.uip;
            liveExParam.isStreamP2PInt = tPDefaultReportInfo.enableP2p ? 1 : 0;
        }
        if (tPDefaultReportInfo != null && (tPDefaultReportInfo instanceof TPLiveReportInfo)) {
            liveExParam.liveDelayInt = ((TPLiveReportInfo) tPDefaultReportInfo).liveDelay;
        }
        liveExParam.isUseP2PInt = this.f76531y ? 1 : 0;
        String str = this.f76509P.f76554r;
        liveExParam.downloadUrl = str;
        if (TextUtils.isEmpty(str)) {
            liveExParam.downloadUrl = this.f76516j.getFirstLoadParams().cdnUrlString;
        }
        liveExParam.downloadServerIpString = this.f76509P.f76555s;
        liveExParam.reportTimeLong = System.currentTimeMillis();
        e eVar = this.f76509P;
        if (eVar.f76537a > 0) {
            long j11 = eVar.f76538b;
            long jCurrentTimeMillis = System.currentTimeMillis();
            e eVar2 = this.f76509P;
            eVar.f76538b = (int) (j11 + (jCurrentTimeMillis - eVar2.f76537a));
            if (this.f76519m || this.f76530x || eVar2.f76551o) {
                eVar2.f76537a = 0L;
            } else {
                eVar2.f76537a = System.currentTimeMillis();
            }
        }
        e eVar3 = this.f76509P;
        liveExParam.prePlayLengthInt = eVar3.f76538b;
        eVar3.f76538b = 0;
        liveExParam.playerVersionString = TPPlayerConfig.VERSION;
        liveExParam.deviceTypeInt = m78768o();
        liveExParam.networkTypeInt = m78765n();
        e eVar4 = this.f76509P;
        liveExParam.maxSpeedInt = eVar4.f76546j;
        eVar4.f76546j = 0;
        liveExParam.testSpeedInt = this.f76526t;
        int i11 = eVar4.f76548l;
        if (i11 > 0) {
            liveExParam.downSpeedInt = eVar4.f76547k / i11;
            eVar4.f76547k = 0;
            eVar4.f76548l = 0;
        }
        liveExParam.liveTagInt = 0;
        liveExParam.extraInfoString = "";
        liveExParam.reconnectCntInt = 0;
        liveExParam.connectTimeInt = 0;
        liveExParam.getUrlTimeInt = 0;
        liveExParam.defSwitchString = eVar4.f76553q;
        liveExParam.loadingTimeLong = eVar4.f76540d - eVar4.f76539c;
        liveExParam.blockTimeInt = eVar4.f76542f;
        liveExParam.blockCountInt = eVar4.f76541e;
        eVar4.f76541e = 0;
        eVar4.f76542f = 0;
        liveExParam.errCodeInt = 0;
        liveExParam.fullErrCodeString = this.f76532z;
        liveExParam.spanId = eVar4.f76557u;
        liveExParam.tuid = eVar4.f76558v;
        liveExParam.paramsToProperties(interfaceC35304a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x006e  */
    /* JADX WARN: Code duplicated, block: B:19:0x007a  */
    /* JADX INFO: renamed from: c */
    public void m78730c(Map<String, Object> map) {
        c gVar;
        TPReportParams.FirstLoadParams firstLoadParams;
        String str;
        TPDefaultReportInfo tPDefaultReportInfo;
        if (this.f76521o) {
            return;
        }
        TPLogUtil.m78800i("TPReportManager", "onStartPrepare");
        this.f76519m = false;
        this.f76496C = m78708a(map, "flowid", "");
        this.f76531y = m78720a(map, "p2p", false);
        TPDefaultReportInfo tPDefaultReportInfo2 = this.f76515i;
        if (tPDefaultReportInfo2 != null) {
            this.f76503J = tPDefaultReportInfo2.getPlayType();
        }
        int i11 = this.f76503J;
        if (i11 != 1) {
            if (i11 == 0) {
                gVar = new g();
            }
            C35432l c35432l = new C35432l();
            this.f76516j.getInitParams().paramsToProperties(c35432l);
            this.f76504K.mo78794a(5, c35432l);
            this.f76509P.f76539c = System.currentTimeMillis();
            firstLoadParams = this.f76516j.getFirstLoadParams();
            str = this.f76509P.f76554r;
            firstLoadParams.cdnUrlString = str;
            if (TextUtils.isEmpty(str)) {
                firstLoadParams.cdnUrlString = m78708a(map, "url", "");
            }
            tPDefaultReportInfo = this.f76515i;
            if (tPDefaultReportInfo != null) {
                firstLoadParams.cgiUrlIndex = tPDefaultReportInfo.cdnUrlIndex;
            }
            firstLoadParams.cgiUrlIndex = m78705a(map, "urlindex", 0);
            firstLoadParams.starTimeUnix = m78706a(map, "stime", 0L);
            this.f76516j.getFirstRenderParams().starTimeUnix = m78706a(map, "stime", 0L);
            this.f76521o = true;
        }
        gVar = new d();
        this.f76504K = gVar;
        C35432l c35432l2 = new C35432l();
        this.f76516j.getInitParams().paramsToProperties(c35432l2);
        this.f76504K.mo78794a(5, c35432l2);
        this.f76509P.f76539c = System.currentTimeMillis();
        firstLoadParams = this.f76516j.getFirstLoadParams();
        str = this.f76509P.f76554r;
        firstLoadParams.cdnUrlString = str;
        if (TextUtils.isEmpty(str)) {
            firstLoadParams.cdnUrlString = m78708a(map, "url", "");
        }
        tPDefaultReportInfo = this.f76515i;
        if (tPDefaultReportInfo != null) {
            firstLoadParams.cgiUrlIndex = tPDefaultReportInfo.cdnUrlIndex;
        }
        firstLoadParams.cgiUrlIndex = m78705a(map, "urlindex", 0);
        firstLoadParams.starTimeUnix = m78706a(map, "stime", 0L);
        this.f76516j.getFirstRenderParams().starTimeUnix = m78706a(map, "stime", 0L);
        this.f76521o = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m78749h(Map<String, Object> map) {
        TPLogUtil.m78800i("TPReportManager", "onPlayerStop");
        if (map == null) {
            return;
        }
        if (this.f76523q > 0) {
            this.f76524r += m78706a(map, "etime", System.currentTimeMillis()) - this.f76523q;
            this.f76523q = 0L;
        }
        e eVar = this.f76509P;
        if (eVar.f76537a > 0) {
            int i11 = eVar.f76538b;
            long jCurrentTimeMillis = System.currentTimeMillis();
            e eVar2 = this.f76509P;
            eVar.f76538b = i11 + ((int) (jCurrentTimeMillis - eVar2.f76537a));
            eVar2.f76537a = 0L;
        }
        map.put("reason", 1);
        m78774q(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m78752i(Map<String, Object> map) {
        TPLogUtil.m78800i("TPReportManager", "onPlayerError");
        if (map == null) {
            return;
        }
        e eVar = this.f76509P;
        if (eVar.f76537a > 0) {
            int i11 = eVar.f76538b;
            long jCurrentTimeMillis = System.currentTimeMillis();
            e eVar2 = this.f76509P;
            eVar.f76538b = i11 + ((int) (jCurrentTimeMillis - eVar2.f76537a));
            eVar2.f76537a = 0L;
        }
        this.f76532z = m78708a(map, "code", "0");
        if (this.f76503J == 1) {
            this.f76504K.mo78794a(150, new C35432l());
        } else {
            map.put("reason", 3);
            m78774q(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m78755j(Map<String, Object> map) {
        TPLogUtil.m78800i("TPReportManager", "onStartSeek");
        if (map == null) {
            return;
        }
        if (this.f76530x) {
            m78764m(new C35427g().m78868a("etime", Long.valueOf(System.currentTimeMillis())).m78869a());
        }
        if (this.f76529w) {
            m78758k(new C35427g().m78868a("etime", Long.valueOf(System.currentTimeMillis())).m78868a("petime", Long.valueOf(m78706a(map, "pstime", 0L) / 1000)).m78869a());
        }
        this.f76529w = true;
        this.f76518l = 1;
        TPReportParams.UserSeekOnceParams userSeekOnceParamsCreateUserSeekOnceParams = this.f76516j.createUserSeekOnceParams();
        this.f76508O = userSeekOnceParamsCreateUserSeekOnceParams;
        userSeekOnceParamsCreateUserSeekOnceParams.seekStartTimeUnix = m78706a(map, "stime", System.currentTimeMillis());
        TPReportParams.CommonParams commonParams = this.f76516j.getCommonParams();
        TPReportParams.UserSeekOnceParams userSeekOnceParams = this.f76508O;
        userSeekOnceParams.formatInt = commonParams.mediaFormatInt;
        userSeekOnceParams.startPresentTimeLong = m78706a(map, "pstime", 0L) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public void m78758k(Map<String, Object> map) {
        TPReportParams.UserSeekOnceParams userSeekOnceParams;
        TPLogUtil.m78800i("TPReportManager", "onSeekComplete");
        this.f76529w = false;
        if (map == null || (userSeekOnceParams = this.f76508O) == null) {
            return;
        }
        userSeekOnceParams.seekEndTimeUnix = m78706a(map, "etime", System.currentTimeMillis());
        this.f76508O.endPresentTimeLong = m78706a(map, "petime", 0L) / 1000;
        TPReportParams.UserSeekOnceParams userSeekOnceParams2 = this.f76508O;
        userSeekOnceParams2.errCodeString = this.f76532z;
        long j11 = userSeekOnceParams2.seekEndTimeUnix - userSeekOnceParams2.seekStartTimeUnix;
        if (j11 > 1200) {
            this.f76528v++;
            this.f76527u = (int) (((long) this.f76527u) + j11);
        }
        TPReportParams.UserSeekTotalParams userSeekTotalParams = this.f76516j.getUserSeekTotalParams();
        userSeekTotalParams.seekTotalCountInt++;
        userSeekTotalParams.seekBufferingDurationInt = this.f76527u;
        userSeekTotalParams.seekBufferingCountInt = this.f76528v;
        if (userSeekTotalParams.seekOnceParamsList.size() < 20) {
            userSeekTotalParams.seekOnceParamsList.add(this.f76508O);
            C35432l c35432l = new C35432l();
            this.f76508O.paramsToProperties(c35432l);
            this.f76504K.mo78794a(40, c35432l);
        }
        this.f76508O = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m78761l(Map<String, Object> map) {
        TPLogUtil.m78800i("TPReportManager", "onBufferingStart");
        if (map == null) {
            return;
        }
        this.f76530x = true;
        if (this.f76529w) {
            return;
        }
        e eVar = this.f76509P;
        if (eVar.f76537a > 0) {
            int i11 = eVar.f76538b;
            long jCurrentTimeMillis = System.currentTimeMillis();
            e eVar2 = this.f76509P;
            eVar.f76538b = i11 + ((int) (jCurrentTimeMillis - eVar2.f76537a));
            eVar2.f76537a = 0L;
        }
        this.f76509P.f76543g = m78706a(map, "stime", System.currentTimeMillis());
        TPReportParams.BufferingOnceParams bufferingOnceParamsCreateBufferingOnceParams = this.f76516j.createBufferingOnceParams();
        this.f76507N = bufferingOnceParamsCreateBufferingOnceParams;
        bufferingOnceParamsCreateBufferingOnceParams.starTimeUnix = this.f76509P.f76543g;
        bufferingOnceParamsCreateBufferingOnceParams.formatInt = m78705a(map, TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, 0);
        TPReportParams.CommonParams commonParams = this.f76516j.getCommonParams();
        TPReportParams.BufferingOnceParams bufferingOnceParams = this.f76507N;
        bufferingOnceParams.formatInt = commonParams.mediaFormatInt;
        bufferingOnceParams.reasonInt = m78705a(map, "reason", 0);
        TPReportParams.BufferingOnceParams bufferingOnceParams2 = this.f76507N;
        bufferingOnceParams2.lastEventInt = this.f76518l;
        bufferingOnceParams2.sceneInt = this.f76517k;
        bufferingOnceParams2.bufferingPresentTimeLong = m78706a(map, "ptime", 0L) / 1000;
        this.f76507N.urlString = m78708a(map, "url", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m78764m(Map<String, Object> map) {
        TPLogUtil.m78800i("TPReportManager", "onBufferingEnd");
        this.f76530x = false;
        e eVar = this.f76509P;
        if (!eVar.f76551o) {
            eVar.f76537a = System.currentTimeMillis();
        }
        if (map == null) {
            return;
        }
        long jM78706a = m78706a(map, "etime", System.currentTimeMillis());
        e eVar2 = this.f76509P;
        long j11 = eVar2.f76543g;
        int i11 = (int) (jM78706a - j11);
        if (i11 > 1200 && !this.f76529w) {
            eVar2.f76541e++;
            eVar2.f76544h = jM78706a;
            eVar2.f76542f += (int) (jM78706a - j11);
            TPReportParams.BufferingOnceParams bufferingOnceParams = this.f76507N;
            if (bufferingOnceParams == null) {
                return;
            }
            bufferingOnceParams.endTimeUnix = m78706a(map, "etime", 0L);
            this.f76507N.errCodeString = this.f76532z;
            TPReportParams.BufferingTotalParams bufferingTotalParams = this.f76516j.getBufferingTotalParams();
            bufferingTotalParams.bufferingCountInt++;
            bufferingTotalParams.bufferingDurationInt += i11;
            if (bufferingTotalParams.bufferingOnceParamsList.size() < 20) {
                bufferingTotalParams.bufferingOnceParamsList.add(this.f76507N);
                C35432l c35432l = new C35432l();
                this.f76507N.paramsToProperties(c35432l);
                this.f76504K.mo78794a(35, c35432l);
            }
            this.f76507N = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m78767n(Map<String, Object> map) {
        TPLogUtil.m78800i("TPReportManager", "onPlayComplete");
        if (map == null) {
            return;
        }
        map.put("reason", 0);
        m78774q(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public void m78770o(Map<String, Object> map) {
        TPLogUtil.m78800i("TPReportManager", "onPlayerReset");
        if (map == null) {
            return;
        }
        map.put("reason", 1);
        m78774q(map);
    }

    /* JADX INFO: renamed from: a */
    private static String m78707a(int i11) {
        if (i11 == 5) {
            return "init_player";
        }
        if (i11 == 15) {
            return "get_cdn_url";
        }
        if (i11 == 30) {
            return "first_load";
        }
        if (i11 == 40) {
            return "user_seek";
        }
        if (i11 == 50) {
            return "play_done";
        }
        if (i11 == 150) {
            return "live_error";
        }
        if (i11 == 205) {
            return "live_loading";
        }
        if (i11 == 263) {
            return "live_period";
        }
        switch (i11) {
            case 32:
                return "first_rendering";
            case 33:
                return "load_subtitle";
            case 34:
                return "302_redirect";
            case 35:
                return "second_buffering";
            default:
                return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m78734d(Map<String, Object> map) {
        if (this.f76521o) {
            this.f76521o = false;
            TPLogUtil.m78800i("TPReportManager", "onPrepareDone");
            if (map == null) {
                return;
            }
            this.f76509P.f76540d = System.currentTimeMillis();
            this.f76509P.f76550n = m78720a(map, "multitrack", false);
            C35432l c35432l = new C35432l();
            if (m78705a(map, "playertype", 0) == 1) {
                this.f76497D = 0;
            } else {
                this.f76497D = 1;
            }
            this.f76499F = m78708a(map, "definition", "");
            this.f76501H = m78706a(map, TypedValues.TransitionType.S_DURATION, 0L);
            this.f76500G = (int) m78706a(map, "rate", 0L);
            String strM78708a = m78708a(map, "fmt", "");
            if (strM78708a == null || !strM78708a.contains("hls")) {
                this.f76498E = 1;
            } else {
                this.f76498E = 3;
            }
            TPReportParams.FirstLoadParams firstLoadParams = this.f76516j.getFirstLoadParams();
            firstLoadParams.endTimeUnix = m78706a(map, "etime", 0L);
            firstLoadParams.errCodeString = this.f76532z;
            firstLoadParams.paramsToProperties(c35432l);
            this.f76504K.mo78794a(30, c35432l);
            this.f76516j.getFirstLoadParams().reset();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m78738e(Map<String, Object> map) {
        TPLogUtil.m78800i("TPReportManager", "onStartPlayer");
        this.f76519m = false;
        if (map == null) {
            return;
        }
        this.f76509P.f76537a = System.currentTimeMillis();
        long jM78706a = m78706a(map, "stime", 0L);
        if (this.f76523q > 0) {
            this.f76524r += System.currentTimeMillis() - jM78706a;
        }
        this.f76523q = jM78706a;
        if (this.f76503J == 1) {
            this.f76512e.removeMessages(3000);
            this.f76512e.sendEmptyMessageDelayed(3000, 60000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m78742f(Map<String, Object> map) {
        TPLogUtil.m78800i("TPReportManager", "onRenderingStart");
        if (map == null) {
            return;
        }
        C35432l c35432l = new C35432l();
        TPReportParams.FirstRenderParams firstRenderParams = this.f76516j.getFirstRenderParams();
        firstRenderParams.endTimeUnix = m78706a(map, "etime", 0L);
        firstRenderParams.errCodeString = this.f76532z;
        firstRenderParams.paramsToProperties(c35432l);
        this.f76504K.mo78794a(32, c35432l);
        this.f76516j.getFirstRenderParams().reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m78746g(Map<String, Object> map) {
        TPLogUtil.m78800i("TPReportManager", "onPlayerPause");
        if (map == null) {
            return;
        }
        if (this.f76523q > 0) {
            this.f76524r += m78706a(map, "stime", System.currentTimeMillis()) - this.f76523q;
            this.f76523q = 0L;
        }
        e eVar = this.f76509P;
        if (eVar.f76537a > 0) {
            int i11 = eVar.f76538b;
            long jCurrentTimeMillis = System.currentTimeMillis();
            e eVar2 = this.f76509P;
            eVar.f76538b = i11 + ((int) (jCurrentTimeMillis - eVar2.f76537a));
            eVar2.f76537a = 0L;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m78793c() {
        boolean z11;
        if (Math.random() < this.f76505L) {
            TPLogUtil.m78800i("TPReportManager", "reports are sampled");
            z11 = true;
        } else {
            TPLogUtil.m78800i("TPReportManager", "reports are not sampled");
            z11 = false;
        }
        this.f76506M = z11;
        return this.f76506M;
    }

    /* JADX INFO: renamed from: a */
    private String m78708a(Map<String, Object> map, String str, String str2) {
        Object obj;
        return (map == null || (obj = map.get(str)) == null) ? str2 : (String) obj;
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.InterfaceC35415a
    /* JADX INFO: renamed from: a */
    public void mo78182a() {
        m78731d();
    }

    /* JADX INFO: renamed from: b */
    private void m78726b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("hitDownloaded")) {
                e eVar = this.f76509P;
                if (eVar.f76552p == -1) {
                    eVar.f76552p = jSONObject.getInt("hitDownloaded");
                }
            }
        } catch (Exception e11) {
            TPLogUtil.m78798e("TPReportManager", e11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.plugins.InterfaceC35415a
    /* JADX INFO: renamed from: a */
    public void mo78183a(int i11, int i12, int i13, String str, Object obj) {
        int i14;
        switch (i11) {
            case 100:
                i14 = 999;
                break;
            case 101:
                i14 = 1000;
                break;
            case 102:
                i14 = 1001;
                break;
            case 103:
                i14 = 1002;
                break;
            case 104:
                i14 = 1003;
                break;
            case 105:
                i14 = 1012;
                break;
            case 106:
                i14 = 1004;
                break;
            case 107:
                i14 = 1005;
                break;
            case 108:
                i14 = 1006;
                break;
            case 109:
                i14 = 1007;
                break;
            case 110:
                i14 = 1008;
                break;
            case 111:
                i14 = 1009;
                break;
            case 112:
                i14 = 1010;
                break;
            case 113:
                i14 = 1011;
                break;
            case 114:
                i14 = 1013;
                break;
            case 115:
                i14 = 1014;
                break;
            case 116:
                i14 = 1015;
                break;
            case 117:
                i14 = 1016;
                break;
            case 118:
                i14 = 2002;
                break;
            case 119:
                i14 = 1019;
                break;
            case 120:
                i14 = 1020;
                break;
            case 121:
                i14 = 1021;
                break;
            case 122:
                i14 = 2004;
                break;
            case 123:
                i14 = 2005;
                break;
            case 124:
                i14 = 1022;
                break;
            default:
                switch (i11) {
                    case 200:
                        i14 = 1017;
                        break;
                    case 201:
                        i14 = 1018;
                        break;
                    case 202:
                        i14 = 1023;
                        break;
                    default:
                        return;
                }
                break;
        }
        this.f76512e.obtainMessage(i14, obj).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m78709a(InterfaceC35304a interfaceC35304a) {
        String str;
        if (this.f76506M) {
            HashMap map = new HashMap();
            interfaceC35304a.mo78039a(map);
            if (!map.containsKey("step") || (str = map.get("step")) == null) {
                return;
            }
            String strM78707a = m78707a(Integer.parseInt(str));
            if (TextUtils.isEmpty(strM78707a)) {
                return;
            }
            C35305b.m78041a(strM78707a, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m78727b(Map<String, Object> map) {
        TPLogUtil.m78800i("TPReportManager", "onPlayerCreateDone");
        if (map == null) {
            return;
        }
        C35432l c35432l = new C35432l();
        TPReportParams.PlayerInitParams initParams = this.f76516j.getInitParams();
        initParams.playEndTimeUnix = m78706a(map, "etime", System.currentTimeMillis());
        initParams.errCodeString = this.f76532z;
        initParams.paramsToProperties(c35432l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m78710a(InterfaceC35304a interfaceC35304a, int i11, boolean z11) {
        TPReportParams.CommonParams commonParams = this.f76516j.getCommonParams();
        commonParams.stepInt = i11;
        commonParams.seqInt++;
        String str = this.f76496C;
        commonParams.flowIdString = str;
        commonParams.playNoString = str;
        commonParams.signalStrengthInt = this.f76525s;
        commonParams.networkSpeedInt = this.f76526t;
        commonParams.networkTypeInt = m78765n();
        commonParams.deviceNameString = TPSystemInfo.getDeviceName();
        commonParams.deviceResolutionString = m78762m();
        commonParams.osVersionString = f76490a;
        commonParams.p2pVersionString = TPDownloadProxyHelper.getNativeLibVersion();
        commonParams.playerVersionString = TPPlayerConfig.VERSION;
        commonParams.playerTypeInt = this.f76497D;
        commonParams.p2pInt = this.f76531y ? 1 : 0;
        commonParams.proto = this.f76494A;
        commonParams.protover = this.f76495B;
        commonParams.playTypeInt = this.f76503J;
        TPDefaultReportInfo tPDefaultReportInfo = this.f76515i;
        if (tPDefaultReportInfo != null && z11) {
            commonParams.testIdInt = tPDefaultReportInfo.testId;
            commonParams.cdnIdInt = tPDefaultReportInfo.cdnId;
            commonParams.downloadTypeInt = tPDefaultReportInfo.dlType;
            commonParams.loginTypeInt = tPDefaultReportInfo.loginType;
            commonParams.mediaFormatInt = tPDefaultReportInfo.mediaFormat;
            commonParams.mediaRateInt = tPDefaultReportInfo.mediaRate;
            commonParams.platformLong = tPDefaultReportInfo.platform;
            commonParams.onlineInt = tPDefaultReportInfo.isOnline ? 1 : 0;
            commonParams.mediaDurationFloat = tPDefaultReportInfo.mediaDuration;
            commonParams.uinString = tPDefaultReportInfo.uin;
            commonParams.qxOpenIdString = tPDefaultReportInfo.qxOpenId;
            commonParams.wxOpenIdString = tPDefaultReportInfo.wxOpenId;
            commonParams.guidString = tPDefaultReportInfo.guid;
            commonParams.uipString = tPDefaultReportInfo.uip;
            commonParams.cdnUipString = tPDefaultReportInfo.cdnUip;
            commonParams.cdnIpString = tPDefaultReportInfo.cdnIp;
            commonParams.appVersionString = tPDefaultReportInfo.appVersion;
            commonParams.vidString = tPDefaultReportInfo.vid;
            commonParams.mediaResolutionString = tPDefaultReportInfo.mediaResolution;
            commonParams.scenesId = tPDefaultReportInfo.scenesId;
            Properties properties = tPDefaultReportInfo.reportInfoProperties;
            if (properties != null) {
                for (Map.Entry entry : properties.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (value == null) {
                        interfaceC35304a.mo78038a(key.toString(), "");
                    } else {
                        interfaceC35304a.mo78038a(key.toString(), value.toString());
                    }
                }
            }
            this.f76503J = this.f76515i.getPlayType();
        }
        if (commonParams.platformLong <= 0) {
            commonParams.platformLong = TPPlayerConfig.getPlatform();
        }
        if (TextUtils.isEmpty(commonParams.uinString)) {
            commonParams.uinString = TPPlayerConfig.getUserUin();
        }
        if (TextUtils.isEmpty(commonParams.guidString)) {
            commonParams.guidString = TPPlayerConfig.getGuid();
        }
        if (TextUtils.isEmpty(commonParams.appVersionString)) {
            commonParams.appVersionString = TPPlayerConfig.getAppVersionName(this.f76502I);
        }
        if (TextUtils.isEmpty(commonParams.uipString)) {
            commonParams.uipString = this.f76509P.f76556t;
        }
        if (TextUtils.isEmpty(commonParams.cdnUipString)) {
            commonParams.cdnUipString = this.f76509P.f76556t;
        }
        if (TextUtils.isEmpty(commonParams.cdnIpString)) {
            commonParams.cdnIpString = this.f76509P.f76555s;
        }
        if (commonParams.downloadTypeInt <= 0) {
            commonParams.downloadTypeInt = this.f76498E;
        }
        if (TextUtils.isEmpty(commonParams.mediaResolutionString)) {
            commonParams.mediaResolutionString = this.f76499F;
        }
        if (commonParams.mediaDurationFloat <= 0.0f) {
            commonParams.mediaDurationFloat = this.f76501H / 1000.0f;
        }
        if (commonParams.mediaRateInt <= 0) {
            commonParams.mediaRateInt = this.f76500G;
        }
        commonParams.paramsToProperties(interfaceC35304a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m78711a(InterfaceC35304a interfaceC35304a, boolean z11) {
        TPReportParams.VodExParam vodExParam = this.f76516j.getVodExParam();
        if (vodExParam == null) {
            return;
        }
        TPDefaultReportInfo tPDefaultReportInfo = this.f76515i;
        if (tPDefaultReportInfo != null && (tPDefaultReportInfo instanceof TPVodReportInfo) && z11) {
            vodExParam.currentPlayInt = ((TPVodReportInfo) tPDefaultReportInfo).currentPlayState;
            vodExParam.optimizedPlayInt = ((TPVodReportInfo) tPDefaultReportInfo).optimizedPlay;
            vodExParam.hasSubtitleInt = ((TPVodReportInfo) tPDefaultReportInfo).hasSubtitles ? 1 : 0;
            vodExParam.bizIdInt = ((TPVodReportInfo) tPDefaultReportInfo).bizId;
            vodExParam.clipInt = ((TPVodReportInfo) tPDefaultReportInfo).clipCount;
            vodExParam.statusInt = ((TPVodReportInfo) tPDefaultReportInfo).videoStatus;
            vodExParam.freeTypeInt = tPDefaultReportInfo.freeType;
        }
        e eVar = this.f76509P;
        vodExParam.multiTrackInt = eVar.f76550n ? 1 : 0;
        vodExParam.isSelectedSubtitleInt = eVar.f76549m ? 1 : 0;
        vodExParam.hevcLcInt = 0;
        vodExParam.hitDownloaded = eVar.f76552p;
        vodExParam.paramsToProperties(interfaceC35304a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m78718a(String str) {
        String strReplace;
        if (TextUtils.isEmpty(str)) {
            TPLogUtil.m78800i("TPReportManager", "onHandleHlsTag, tag is null");
            return;
        }
        if (!str.startsWith("#EXT-X-PROGRAM-DATE-TIME:")) {
            TPLogUtil.m78800i("TPReportManager", "onHandleHlsTag, tag is not start with #EXT-X-PROGRAM-DATE-TIME:");
            return;
        }
        try {
            String strSubstring = str.substring(25);
            int iIndexOf = strSubstring.indexOf(43);
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(0, iIndexOf);
            } else {
                TPLogUtil.m78800i("TPReportManager", "handleOnPlayerPrivaterHlsM3u8Tag , player_m3u8_tag , tag do not contains time zone");
            }
            strReplace = strSubstring.replace('T', ' ');
        } catch (Exception e11) {
            TPLogUtil.m78798e("TPReportManager", e11);
            strReplace = "";
        }
        if (TextUtils.isEmpty(strReplace)) {
            TPLogUtil.m78800i("TPReportManager", "onHandleHlsTag , player_m3u8_tag , dataTime is null ");
            return;
        }
        long time = 0;
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(strReplace);
            if (date != null) {
                time = date.getTime();
            }
        } catch (Exception e12) {
            TPLogUtil.m78798e("TPReportManager", e12);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("onHandleHlsTag , player_m3u8_tag , sysCurTime: ");
        sb2.append(jCurrentTimeMillis);
        sb2.append(", time:");
        sb2.append(time);
        sb2.append(", delay:");
        long j11 = jCurrentTimeMillis - time;
        sb2.append(j11);
        TPLogUtil.m78800i("TPReportManager", sb2.toString());
        this.f76509P.f76545i = (int) j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m78719a(Map<String, Object> map) {
        TPLogUtil.m78800i("TPReportManager", "onPlayerCreateStart");
        if (map == null) {
            return;
        }
        this.f76516j.getInitParams().playStarTimeUnix = m78706a(map, "stime", System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: a */
    private boolean m78720a(Map<String, Object> map, String str, boolean z11) {
        Object obj;
        return (map == null || (obj = map.get(str)) == null) ? z11 : ((Boolean) obj).booleanValue();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.report.ITPBusinessReportManager
    public void reportEvent(int i11, Map<String, Object> map) {
    }
}
