package com.tencent.bugly.proguard;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.p4 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33851p4 {

    /* JADX INFO: renamed from: i */
    public static final String f71368i = "RMonitor_device";

    /* JADX INFO: renamed from: b */
    public final HashMap<String, String> f71370b;

    /* JADX INFO: renamed from: a */
    public boolean f71369a = false;

    /* JADX INFO: renamed from: c */
    public String f71371c = null;

    /* JADX INFO: renamed from: d */
    public String f71372d = null;

    /* JADX INFO: renamed from: e */
    public String f71373e = null;

    /* JADX INFO: renamed from: f */
    public String f71374f = null;

    /* JADX INFO: renamed from: g */
    public String f71375g = null;

    /* JADX INFO: renamed from: h */
    public String f71376h = null;

    /* JADX INFO: renamed from: a */
    public final void m74500a(Context context) {
        if (context == null || this.f71369a) {
            return;
        }
        this.f71369a = true;
        try {
            if (!C33872q4.m74663a(context, C33872q4.f71536c)) {
                Logger.INSTANCE.mo77133v(f71368i, "init fail for no permission.");
                return;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            this.f71371c = telephonyManager.getSimOperatorName();
            this.f71372d = telephonyManager.getSimOperator();
            this.f71373e = telephonyManager.getNetworkOperator();
            this.f71374f = telephonyManager.getNetworkOperatorName();
            this.f71375g = telephonyManager.getSimCountryIso();
            this.f71376h = telephonyManager.getNetworkCountryIso();
            Logger.INSTANCE.mo77133v(f71368i, "init simOperatorName: " + this.f71371c + ", simOperator: " + this.f71372d + ", netWorkOperator: " + this.f71373e + ", netWorkOperatorName: " + this.f71374f + ", simCountryIso: " + this.f71375g + ", netCountryIso: " + this.f71376h);
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77133v(f71368i, "init fail for " + th2.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public String m74502c() {
        return TextUtils.isEmpty(this.f71372d) ? this.f71373e : this.f71372d;
    }

    public C33851p4() {
        HashMap<String, String> map = new HashMap<>(11);
        this.f71370b = map;
        map.put("46001", "中国联通");
        map.put("46006", "中国联通");
        map.put("46009", "中国联通");
        map.put("46000", "中国移动");
        map.put("46002", "中国移动");
        map.put("46004", "中国移动");
        map.put("46007", "中国移动");
        map.put("46003", "中国电信");
        map.put("46005", "中国电信");
        map.put("46011", "中国电信");
        map.put("46020", "中国铁通");
    }

    /* JADX INFO: renamed from: b */
    public String m74501b() {
        m74500a(C33598d3.m72772c());
        String strM74502c = m74502c();
        if (TextUtils.isEmpty(strM74502c)) {
            return "unknown";
        }
        return strM74502c;
    }

    /* JADX INFO: renamed from: d */
    public String m74503d() {
        String str;
        m74500a(C33598d3.m72772c());
        String strM74502c = m74502c();
        if (TextUtils.isEmpty(strM74502c)) {
            if (TextUtils.isEmpty(this.f71371c)) {
                str = this.f71374f;
            } else {
                str = this.f71371c;
            }
        } else {
            str = this.f71370b.get(strM74502c);
            if (TextUtils.isEmpty(str)) {
                str = "Other";
            }
        }
        if (TextUtils.isEmpty(str)) {
            return "unknown";
        }
        return str;
    }

    /* JADX INFO: renamed from: e */
    public String m74504e() {
        return "unknown";
    }

    /* JADX INFO: renamed from: a */
    public String m74499a() {
        m74500a(C33598d3.m72772c());
        String str = TextUtils.isEmpty(this.f71375g) ? this.f71376h : this.f71375g;
        return TextUtils.isEmpty(str) ? "unknown" : str;
    }
}
