package com.tencent.bugly.proguard;

import android.text.TextUtils;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.utils.StringUtil;
import com.tencent.rmonitor.common.logger.Logger;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.s2 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33910s2 {

    /* JADX INFO: renamed from: a */
    public String f71790a = "";

    /* JADX INFO: renamed from: b */
    public String f71791b = "";

    /* JADX INFO: renamed from: c */
    public String f71792c;

    /* JADX INFO: renamed from: d */
    public String f71793d;

    /* JADX INFO: renamed from: e */
    public String f71794e;

    /* JADX INFO: renamed from: f */
    public String f71795f;

    /* JADX INFO: renamed from: g */
    public String f71796g;

    /* JADX INFO: renamed from: h */
    public String f71797h;

    /* JADX INFO: renamed from: i */
    public String f71798i;

    /* JADX INFO: renamed from: j */
    public String f71799j;

    /* JADX INFO: renamed from: k */
    public String f71800k;

    /* JADX INFO: renamed from: l */
    public String f71801l;

    /* JADX INFO: renamed from: a */
    public void m74904a(UserMeta userMeta) {
        if (userMeta == null) {
            return;
        }
        this.f71792c = userMeta.appId;
        this.f71793d = userMeta.appKey;
        this.f71796g = userMeta.getAppVersionMode();
        this.f71794e = userMeta.appVersion;
        this.f71795f = userMeta.sdkVersion;
        this.f71797h = userMeta.uin;
        this.f71798i = userMeta.getUniqueID();
        this.f71799j = StringUtil.encode(userMeta.getModel());
        this.f71801l = C33714ie.m73408k().mo73413b();
        this.f71800k = C33714ie.f70270o.mo73419g();
    }

    /* JADX INFO: renamed from: b */
    public void m74907b(C33910s2 c33910s2) {
        if (c33910s2 == null) {
            return;
        }
        this.f71790a = c33910s2.f71790a;
        this.f71791b = c33910s2.f71791b;
        this.f71792c = c33910s2.f71792c;
        this.f71793d = c33910s2.f71793d;
        this.f71794e = c33910s2.f71794e;
        this.f71795f = c33910s2.f71795f;
        this.f71796g = c33910s2.f71796g;
        this.f71797h = c33910s2.f71797h;
        this.f71798i = c33910s2.f71798i;
        this.f71799j = c33910s2.f71799j;
        this.f71800k = c33910s2.f71800k;
        this.f71801l = c33910s2.f71801l;
    }

    /* JADX INFO: renamed from: a */
    public void m74905a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f71792c = jSONObject.optString(C33556b3.f69038e2);
        this.f71793d = jSONObject.optString("app_key");
        this.f71794e = jSONObject.optString("version");
        this.f71797h = jSONObject.optString("uin");
        this.f71798i = jSONObject.optString("deviceid");
        this.f71794e = jSONObject.optString("version");
        this.f71795f = jSONObject.optString("sdk_ver");
        this.f71800k = jSONObject.optString(C33556b3.f69078o2);
        this.f71801l = jSONObject.optString("manu");
        this.f71799j = jSONObject.optString("device");
        this.f71796g = jSONObject.optString("app_version_mode");
        this.f71791b = jSONObject.optString("md5code");
    }

    /* JADX INFO: renamed from: a */
    public boolean m74906a(@NotNull C33910s2 c33910s2) {
        return (TextUtils.equals(this.f71792c, c33910s2.f71792c) && TextUtils.equals(this.f71796g, c33910s2.f71796g) && TextUtils.equals(this.f71794e, c33910s2.f71794e) && TextUtils.equals(this.f71795f, c33910s2.f71795f) && TextUtils.equals(this.f71798i, c33910s2.f71798i) && TextUtils.equals(this.f71797h, c33910s2.f71797h) && TextUtils.equals(this.f71800k, c33910s2.f71800k) && TextUtils.equals(this.f71799j, c33910s2.f71799j)) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m74903a() {
        Throwable th2;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(C33556b3.f69038e2, this.f71792c);
                jSONObject.put("app_key", this.f71793d);
                jSONObject.put("version", this.f71794e);
                jSONObject.put("sdk_ver", this.f71795f);
                jSONObject.put("uin", this.f71797h);
                jSONObject.put("deviceid", this.f71798i);
                jSONObject.put(C33556b3.f69078o2, this.f71800k);
                jSONObject.put("manu", this.f71801l);
                jSONObject.put("device", this.f71799j);
                jSONObject.put("app_version_mode", this.f71796g);
                jSONObject.put("md5code", this.f71791b);
                return jSONObject;
            } catch (Throwable th3) {
                th2 = th3;
                Logger.INSTANCE.exception("RMonitor_config", th2);
                return jSONObject;
            }
        } catch (Throwable th4) {
            th2 = th4;
            jSONObject = null;
        }
    }
}
