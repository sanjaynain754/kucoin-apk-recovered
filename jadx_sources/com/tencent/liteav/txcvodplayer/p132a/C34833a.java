package com.tencent.liteav.txcvodplayer.p132a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.liteav.LiveSettingJni;
import com.tencent.liteav.base.datareport.Event4XReporter;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.sdk.common.HouseBuilder;
import com.tencent.liteav.txcplayer.common.C34811c;
import com.tencent.liteav.txcplayer.p131a.C34804a;
import com.tencent.ugc.datereport.UGCDataReportDef;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.a.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C34833a {

    /* JADX INFO: renamed from: A */
    public String f73876A;

    /* JADX INFO: renamed from: B */
    public String f73877B;

    /* JADX INFO: renamed from: E */
    private Context f73880E;

    /* JADX INFO: renamed from: J */
    private int f73885J;

    /* JADX INFO: renamed from: K */
    private int f73886K;

    /* JADX INFO: renamed from: M */
    private int f73888M;

    /* JADX INFO: renamed from: O */
    private String f73890O;

    /* JADX INFO: renamed from: P */
    private Map<String, String> f73891P;

    /* JADX INFO: renamed from: Q */
    private Event4XReporter f73892Q;

    /* JADX INFO: renamed from: R */
    private Event4XReporter f73893R;

    /* JADX INFO: renamed from: o */
    public int f73908o;

    /* JADX INFO: renamed from: a */
    public String f73894a = null;

    /* JADX INFO: renamed from: b */
    public long f73895b = 0;

    /* JADX INFO: renamed from: c */
    public long f73896c = 0;

    /* JADX INFO: renamed from: d */
    public long f73897d = 0;

    /* JADX INFO: renamed from: e */
    public long f73898e = 0;

    /* JADX INFO: renamed from: F */
    private boolean f73881F = false;

    /* JADX INFO: renamed from: f */
    public boolean f73899f = true;

    /* JADX INFO: renamed from: g */
    public boolean f73900g = false;

    /* JADX INFO: renamed from: h */
    public boolean f73901h = false;

    /* JADX INFO: renamed from: i */
    public int f73902i = 0;

    /* JADX INFO: renamed from: j */
    public int f73903j = 0;

    /* JADX INFO: renamed from: G */
    private int f73882G = 0;

    /* JADX INFO: renamed from: k */
    public long f73904k = 0;

    /* JADX INFO: renamed from: l */
    public int f73905l = -1;

    /* JADX INFO: renamed from: m */
    public int f73906m = 0;

    /* JADX INFO: renamed from: n */
    public int f73907n = 0;

    /* JADX INFO: renamed from: p */
    public boolean f73909p = false;

    /* JADX INFO: renamed from: q */
    public boolean f73910q = false;

    /* JADX INFO: renamed from: r */
    public boolean f73911r = false;

    /* JADX INFO: renamed from: I */
    private int f73884I = 0;

    /* JADX INFO: renamed from: s */
    public int f73912s = 0;

    /* JADX INFO: renamed from: t */
    public String f73913t = "0";

    /* JADX INFO: renamed from: u */
    public String f73914u = "";

    /* JADX INFO: renamed from: v */
    public String f73915v = "";

    /* JADX INFO: renamed from: w */
    public int f73916w = -1;

    /* JADX INFO: renamed from: x */
    public int f73917x = 0;

    /* JADX INFO: renamed from: y */
    public int f73918y = 0;

    /* JADX INFO: renamed from: z */
    public int f73919z = 0;

    /* JADX INFO: renamed from: L */
    private float f73887L = 1.0f;

    /* JADX INFO: renamed from: C */
    public int f73878C = 0;

    /* JADX INFO: renamed from: D */
    public int f73879D = 0;

    /* JADX INFO: renamed from: H */
    private String f73883H = LiteavSystemInfo.getAppVersion();

    /* JADX INFO: renamed from: N */
    private String f73889N = m76340j();

    /* JADX INFO: renamed from: a */
    public final void m76345a(String str, String str2) {
        m76348b("[putCustomData]: <" + str + " ," + str2 + ">");
        this.f73891P.put(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public final void m76347b() {
        if (0 == this.f73897d) {
            m76348b("calculateSegmentPlayTime mBeginPlayTS == 0");
            return;
        }
        m76348b("calculateSegmentPlayTime mCurIndexPlayTime= " + this.f73904k + ", mBeginPlayTS=" + this.f73897d);
        this.f73904k = this.f73904k + ((long) ((int) (System.currentTimeMillis() - this.f73897d)));
        this.f73897d = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: c */
    public final void m76350c() {
        m76348b("[stop] mCurIndexPlayTime = " + this.f73904k + " ,mIsPaused = " + this.f73899f + " ,mIsPlaying = " + this.f73881F + " ,mIsPreLoading =" + this.f73900g);
        if (this.f73899f) {
            this.f73897d = System.currentTimeMillis();
        }
        if (this.f73881F && !this.f73900g) {
            m76347b();
            this.f73882G = (int) (((long) this.f73882G) + (this.f73904k / 1000));
            m76348b("[stop] mPlayTime = " + this.f73882G + " s");
            this.f73904k = 0L;
            m76339i();
            this.f73889N = m76340j();
            this.f73881F = false;
        }
        this.f73885J = 0;
        this.f73915v = "";
        this.f73909p = false;
        this.f73910q = false;
        this.f73899f = false;
        this.f73900g = false;
        this.f73901h = false;
        this.f73905l = -1;
        this.f73891P.clear();
    }

    /* JADX INFO: renamed from: f */
    public final void m76354f() {
        this.f73909p = true;
        this.f73884I++;
        this.f73893R.reportDau(1551, 0, "");
        m76348b("mSeekCnt= " + this.f73884I);
    }

    /* JADX INFO: renamed from: g */
    private void m76337g() {
        this.f73892Q.setEventStringValue("str_sdk_name", "liteavSdk");
        this.f73892Q.setEventStringValue("str_brand_type", LiteavSystemInfo.getBrand());
        this.f73892Q.setEventStringValue("str_device_resolution", m76336a(this.f73880E));
        this.f73892Q.setEventStringValue("str_device_type", LiteavSystemInfo.getModel());
        this.f73892Q.setEventIntValue("u32_network_type", LiteavSystemInfo.getNetworkType());
        String deviceUuid = LiteavSystemInfo.getDeviceUuid();
        this.f73892Q.setEventStringValue(UGCDataReportDef.DR_KEY_DEV_UUID, deviceUuid);
        this.f73892Q.setEventStringValue("str_app_version", this.f73883H);
        this.f73892Q.setEventStringValue("str_app_name", LiteavSystemInfo.getAppName());
        this.f73892Q.setEventStringValue(UGCDataReportDef.DR_KEY_SYS_VER, String.valueOf(LiteavSystemInfo.getSystemOSVersionInt()));
        this.f73892Q.setEventStringValue("str_stream_url", this.f73894a);
        this.f73892Q.setEventStringValue("bytes_token", this.f73889N);
        String userId = LiveSettingJni.getUserId();
        if (TextUtils.isEmpty(userId)) {
            userId = "_".concat(String.valueOf(deviceUuid));
        }
        this.f73892Q.setEventStringValue("str_user_id", userId);
        this.f73892Q.setEventStringValue("str_package_name", LiteavSystemInfo.getAppPackageName());
        this.f73892Q.setEventStringValue("u32_app_id", this.f73890O);
        this.f73892Q.setEventStringValue("custom_data", m76338h());
    }

    /* JADX INFO: renamed from: h */
    private String m76338h() {
        if (this.f73891P.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : this.f73891P.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                try {
                    jSONObject.put(key, value);
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
            }
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: i */
    private void m76339i() {
        this.f73892Q = new Event4XReporter(40304, 1011, "", true, 1);
        m76337g();
        this.f73892Q.setEventIntValue("u32_timeuse", this.f73882G);
        this.f73892Q.setEventIntValue("u32_videotime", this.f73902i);
        Event4XReporter event4XReporter = this.f73892Q;
        int i11 = this.f73906m;
        event4XReporter.setEventIntValue("u32_avg_load", i11 == 0 ? 0L : this.f73907n / i11);
        this.f73892Q.setEventIntValue("u32_load_cnt", this.f73906m);
        this.f73892Q.setEventIntValue("u32_max_load", this.f73908o);
        this.f73892Q.setEventIntValue("u32_avg_block_time", this.f73907n);
        this.f73892Q.setEventIntValue("u32_player_type", this.f73912s);
        Event4XReporter event4XReporter2 = this.f73892Q;
        int i12 = this.f73918y;
        event4XReporter2.setEventIntValue("u32_dns_time", i12 > 0 ? i12 : 0L);
        Event4XReporter event4XReporter3 = this.f73892Q;
        int i13 = this.f73917x;
        event4XReporter3.setEventIntValue("u32_tcp_did_connect", i13 > 0 ? i13 : 0L);
        Event4XReporter event4XReporter4 = this.f73892Q;
        int i14 = this.f73919z;
        event4XReporter4.setEventIntValue("u32_first_video_packet", i14 > 0 ? i14 : 0L);
        this.f73892Q.setEventIntValue("u32_first_i_frame", this.f73905l);
        this.f73892Q.setEventStringValue("u32_server_ip", this.f73876A);
        this.f73892Q.setEventStringValue("u32_drm_type", this.f73877B);
        this.f73892Q.setEventStringValue("str_fileid", this.f73914u);
        this.f73892Q.setEventStringValue("u32_playmode", this.f73913t);
        this.f73892Q.setEventIntValue("u64_err_code", this.f73885J);
        this.f73892Q.setEventStringValue("str_err_info", this.f73915v);
        this.f73892Q.setEventIntValue("u32_video_decode_type", this.f73916w);
        this.f73892Q.setEventIntValue("u32_speed", (int) (this.f73887L * 100.0f));
        this.f73892Q.setEventIntValue("vwidth", this.f73878C);
        this.f73892Q.setEventIntValue("vheight", this.f73879D);
        this.f73892Q.sendReport();
        StringBuilder sb2 = new StringBuilder("[reportEnd] evt 40304: token=");
        sb2.append(this.f73889N);
        sb2.append(" ,dev_uuid=");
        sb2.append(LiteavSystemInfo.getDeviceUuid());
        sb2.append(" ,str_app_version=");
        sb2.append(this.f73883H);
        sb2.append(" ,sys_version=");
        sb2.append(LiteavSystemInfo.getSystemOSVersionInt());
        sb2.append(" ,str_stream_url=");
        sb2.append(this.f73894a);
        sb2.append(" ,u32_timeuse=");
        sb2.append(this.f73882G);
        sb2.append(" ,u32_videotime=");
        sb2.append(this.f73902i);
        sb2.append(" ,u32_avg_load=");
        int i15 = this.f73906m;
        sb2.append(i15 == 0 ? 0 : this.f73907n / i15);
        sb2.append(" ,u32_load_cnt=");
        sb2.append(this.f73906m);
        sb2.append(" ,u32_max_load=");
        sb2.append(this.f73908o);
        sb2.append(" ,u32_avg_block_time=");
        sb2.append(this.f73907n);
        sb2.append(" ,u32_player_type=");
        sb2.append(this.f73912s);
        sb2.append(" ,u32_dns_time=");
        sb2.append(this.f73918y);
        sb2.append(" ,u32_tcp_did_connect=");
        int i16 = this.f73917x;
        if (i16 <= 0) {
            i16 = -1;
        }
        sb2.append(i16);
        sb2.append(" ,u32_first_video_packet=");
        int i17 = this.f73919z;
        sb2.append(i17 > 0 ? i17 : -1);
        sb2.append(" ,u32_first_i_frame=");
        sb2.append(this.f73905l);
        sb2.append(" ,u32_server_ip=");
        sb2.append(this.f73876A);
        sb2.append(" ,u32_drm_type=");
        sb2.append(this.f73877B);
        sb2.append(" ,str_fileid=");
        sb2.append(this.f73914u);
        sb2.append(" ,u32_playmode=");
        sb2.append(this.f73913t);
        sb2.append(" ,u64_err_code=");
        sb2.append(this.f73885J);
        sb2.append(" ,str_err_info=");
        sb2.append(this.f73915v);
        sb2.append(" ,u32_speed=");
        sb2.append(this.f73887L * 100.0f);
        sb2.append(" ,u32_app_id=");
        sb2.append(this.f73890O);
        sb2.append(" ,u32_video_decode_type=");
        sb2.append(this.f73916w);
        sb2.append(" ,custom_data=");
        sb2.append(m76338h());
        sb2.append(" ,vwidth=");
        sb2.append(this.f73878C);
        sb2.append(" ,vheight=");
        sb2.append(this.f73879D);
        m76348b(sb2.toString());
    }

    /* JADX INFO: renamed from: d */
    public final void m76352d() {
        if (this.f73905l == -1) {
            this.f73905l = (int) (System.currentTimeMillis() - this.f73895b);
        }
    }

    public C34833a(Context context) {
        this.f73890O = "";
        this.f73880E = context;
        String appId = HouseBuilder.getInstance().getAppId();
        LiteavLog.m76087i("VodLicenseCheck", "getLicenseAppId = ".concat(String.valueOf(appId)));
        this.f73890O = appId;
        this.f73891P = new HashMap();
        this.f73893R = new Event4XReporter(UGCDataReportDef.COMMAND_ID_DAU, 1004, "", true, 1);
        m76348b("new TXCVodPlayCollection");
    }

    /* JADX INFO: renamed from: j */
    private static String m76340j() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jUptimeMillis = SystemClock.uptimeMillis();
        String str = "";
        for (int i11 = 5; i11 >= 0; i11--) {
            str = str + String.format("%02x", Byte.valueOf((byte) (255 & (jCurrentTimeMillis >> (i11 * 8)))));
        }
        for (int i12 = 3; i12 >= 0; i12--) {
            str = str + String.format("%02x", Byte.valueOf((byte) ((jUptimeMillis >> (i12 * 8)) & 255)));
        }
        return str + C34804a.m76215b(str + LiteavSystemInfo.getDeviceUuid());
    }

    /* JADX INFO: renamed from: a */
    public final void m76341a() {
        this.f73892Q = new Event4XReporter(40303, 1011, "", true, 1);
        m76337g();
        this.f73892Q.setEventStringValue("str_fileid", this.f73914u);
        HouseBuilder.EnumC34768d enumC34768dM76237a = C34811c.m76237a();
        if (enumC34768dM76237a != HouseBuilder.EnumC34768d.OK) {
            int i11 = enumC34768dM76237a.value;
            this.f73885J = i11;
            this.f73915v = "player_license_error";
            this.f73892Q.setEventStringValue("u64_err_code", String.valueOf(i11));
            this.f73892Q.setEventStringValue("str_err_info", this.f73915v);
        }
        this.f73892Q.sendReport();
        m76348b("[reportStart], report evt 40303: token=" + this.f73889N + " ,u32_app_id=" + this.f73890O + " ,str_fileid=" + this.f73914u + " ,str_stream_url=" + this.f73894a + " ,u64_err_code=" + this.f73885J + " ,str_err_info=" + this.f73915v);
    }

    /* JADX INFO: renamed from: e */
    public final void m76353e() {
        m76348b("setBitrateRenderStart");
        this.f73901h = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m76349b(boolean z11) {
        if (z11) {
            this.f73886K = 1;
            this.f73893R.reportDau(1553, 0, "");
        } else {
            this.f73886K = 0;
        }
        m76348b(" mIsMirror= " + this.f73886K);
    }

    /* JADX INFO: renamed from: b */
    public final void m76348b(String str) {
        LiteavLog.m76087i("TXCVodPlayCollection", "[" + hashCode() + "], " + str);
    }

    /* JADX INFO: renamed from: a */
    private static String m76336a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(InterfaceC33953u5.f72199F);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        Display defaultDisplay = windowManager.getDefaultDisplay();
        try {
            Class<?> cls = Class.forName("android.view.Display");
            if (LiteavSystemInfo.getSystemOSVersionInt() > 8) {
                cls.getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            }
            int i11 = displayMetrics.heightPixels;
            return displayMetrics.widthPixels + "_" + i11;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m76351c(boolean z11) {
        if (!z11) {
            this.f73901h = true;
        }
        this.f73888M++;
        this.f73893R.reportDau(1554, 0, "");
        m76348b("setBitrateIndexCnt= " + this.f73888M);
    }

    /* JADX INFO: renamed from: a */
    public final void m76346a(boolean z11) {
        this.f73881F = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f73897d = jCurrentTimeMillis;
        this.f73895b = jCurrentTimeMillis;
        this.f73896c = System.currentTimeMillis();
        this.f73882G = 0;
        this.f73904k = 0L;
        this.f73903j = 0;
        this.f73898e = 0L;
        this.f73906m = 0;
        this.f73907n = 0;
        this.f73908o = 0;
        if (z11) {
            this.f73899f = false;
        } else {
            this.f73900g = true;
        }
        m76348b("[start] ,mBeginPlayTS = " + this.f73897d + ", mIsPaused = " + this.f73899f + " mIsPreLoading = " + this.f73900g);
    }

    /* JADX INFO: renamed from: a */
    public final void m76342a(float f11) {
        this.f73887L = f11;
        this.f73893R.reportDau(1552, 0, "");
        m76348b("[changeSpeed], mSpeed = " + this.f73887L);
    }

    /* JADX INFO: renamed from: a */
    public final void m76343a(int i11, String str) {
        m76348b("errorCode= " + i11 + " ，errorInfo= " + str);
        if (this.f73905l == -1) {
            this.f73885J = i11;
            if (str == null) {
                str = "";
            }
            this.f73915v = str;
            this.f73905l = 0;
        } else {
            this.f73885J = i11;
            StringBuilder sb2 = new StringBuilder("errorCode=");
            sb2.append(i11);
            sb2.append("_errorInfo=");
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            this.f73915v = sb2.toString();
        }
        if (this.f73881F) {
            m76350c();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m76344a(String str) {
        if (TextUtils.isEmpty(this.f73890O)) {
            this.f73890O = str;
        }
    }
}
