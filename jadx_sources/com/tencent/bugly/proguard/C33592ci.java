package com.tencent.bugly.proguard;

import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.rmonitor.custom.C35153a;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ci */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33592ci {
    /* JADX INFO: renamed from: a */
    public static CrashDetailBean m72748a(C33703i3 c33703i3) {
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        crashDetailBean.f68602A = c33703i3.m73323m();
        crashDetailBean.f68635e = c33703i3.m73303c();
        crashDetailBean.f68631c = c33703i3.m73334t();
        crashDetailBean.f68666w = c33703i3.m73325n();
        crashDetailBean.f68649l = c33703i3.m73301b();
        crashDetailBean.f68647k = c33703i3.m73331q();
        crashDetailBean.f68669z = c33703i3.m73319k();
        crashDetailBean.f68612K = c33703i3.m73321l();
        crashDetailBean.f68611J = c33703i3.m73315i();
        crashDetailBean.f68607F = c33703i3.m73332r();
        crashDetailBean.f68609H = c33703i3.m73337w().getBytes();
        crashDetailBean.f68632c0 = c33703i3.m73328o();
        crashDetailBean.f68630b0 = c33703i3.m73329p();
        crashDetailBean.f68667x = c33703i3.m73313h();
        crashDetailBean.f68668y = c33703i3.m73311g();
        crashDetailBean.f68645j = c33703i3.m73309f();
        crashDetailBean.f68665v = c33703i3.m73336v();
        crashDetailBean.f68643i = C33765l2.m73827s().m73890n();
        crashDetailBean.f68606E = c33703i3.m73333s();
        HashMap map = new HashMap();
        crashDetailBean.f68636e0 = map;
        map.put(CrashDetailBean.f68592G0, c33703i3.m73296a());
        crashDetailBean.f68648k0 = c33703i3.m73305d();
        crashDetailBean.f68646j0 = c33703i3.m73335u();
        crashDetailBean.m72184a("stage", c33703i3.m73317j());
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(c33703i3.m73307e());
            jSONObject.put(C35153a.f75232j, jSONArray);
            crashDetailBean.m72184a("user_custom", jSONObject.toString());
            return crashDetailBean;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return crashDetailBean;
        }
    }

    /* JADX INFO: renamed from: a */
    public static UserInfoBean m72747a(C33965uh c33965uh) {
        UserInfoBean userInfoBean = new UserInfoBean();
        userInfoBean.f68541d = c33965uh.m75201d();
        userInfoBean.f68543f = c33965uh.m75202e();
        userInfoBean.f68552o = c33965uh.m75193a();
        userInfoBean.f68544g = System.currentTimeMillis();
        userInfoBean.f68540c = c33965uh.m75200c() ? 1 : 2;
        try {
            Iterator<String> it = C33991w3.m75338a().m77148b(C35153a.f75232j).iterator();
            while (it.hasNext()) {
                C33991w3.m75338a().m77153c(C35153a.f75232j, it.next());
            }
            C33991w3.m75338a().m77150b(C35153a.f75232j, c33965uh.m75197b());
            return userInfoBean;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return userInfoBean;
        }
    }
}
