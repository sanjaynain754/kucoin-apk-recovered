package com.tencent.bugly.proguard;

import com.tencent.rmonitor.base.config.C35101b;
import com.tencent.rmonitor.common.logger.Logger;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.c8 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33582c8 extends C33694hf {

    /* JADX INFO: renamed from: A */
    public static final String f69394A = "error_portal_ratio";

    /* JADX INFO: renamed from: B */
    public static final String f69395B = "launch_time_ratio";

    /* JADX INFO: renamed from: C */
    public static final String f69396C = "userinfo_ratio";

    /* JADX INFO: renamed from: D */
    public static final String f69397D = "http";

    /* JADX INFO: renamed from: x */
    public static final String f69398x = "HttpRequestControlConfig";

    /* JADX INFO: renamed from: y */
    public static final String f69399y = "crash_atta_ratio";

    /* JADX INFO: renamed from: z */
    public static final String f69400z = "crash_portal_ratio";

    /* JADX INFO: renamed from: n */
    public float f69401n;

    /* JADX INFO: renamed from: o */
    public float f69402o;

    /* JADX INFO: renamed from: p */
    public float f69403p;

    /* JADX INFO: renamed from: q */
    public float f69404q;

    /* JADX INFO: renamed from: r */
    public float f69405r;

    /* JADX INFO: renamed from: s */
    public float f69406s;

    /* JADX INFO: renamed from: t */
    public float f69407t;

    /* JADX INFO: renamed from: u */
    public float f69408u;

    /* JADX INFO: renamed from: v */
    public float f69409v;

    /* JADX INFO: renamed from: w */
    public float f69410w;

    /* JADX INFO: renamed from: a */
    public static boolean m72656a(String str) {
        C33694hf c33694hfM77091b = C35101b.c.f75199a.m77091b("http");
        if (!(c33694hfM77091b instanceof C33582c8)) {
            return false;
        }
        if (((C33582c8) c33694hfM77091b).m72657b(str)) {
            return true;
        }
        Logger.INSTANCE.mo77132i(f69398x, str + " is disabled, please modify your project's setting");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x0087 A[RETURN] */
    /* JADX INFO: renamed from: b */
    public boolean m72657b(String str) {
        str.getClass();
        switch (str) {
            case "userinfo_ratio":
                if (this.f69409v >= this.f69405r) {
                    return true;
                }
                return false;
            case "crash_atta_ratio":
                if (this.f69406s >= this.f69401n) {
                    return true;
                }
                return false;
            case "error_portal_ratio":
                if (this.f69408u >= this.f69403p) {
                    return true;
                }
                return false;
            case "crash_portal_ratio":
                if (this.f69407t >= this.f69402o) {
                    return true;
                }
                return false;
            case "launch_time_ratio":
                if (this.f69410w >= this.f69404q) {
                    return true;
                }
                return false;
            default:
                Logger.INSTANCE.mo77134w(f69398x, str.concat(" is not a valid key"));
                return false;
        }
    }

    public C33582c8(String str) {
        super(str);
        this.f69406s = 0.0f;
        this.f69407t = 1.0f;
        this.f69408u = 1.0f;
        this.f69409v = 1.0f;
        this.f69410w = 0.0f;
        this.f69401n = (float) Math.random();
        this.f69402o = (float) Math.random();
        this.f69403p = (float) Math.random();
        this.f69404q = (float) Math.random();
        this.f69405r = (float) Math.random();
    }

    @Override // com.tencent.bugly.proguard.C33694hf, com.tencent.bugly.proguard.InterfaceC33814n9
    /* JADX INFO: renamed from: a */
    public void mo72627a(JSONObject jSONObject) {
        try {
            if (jSONObject == null) {
                Logger.INSTANCE.mo77132i(f69398x, "http configs is null");
                return;
            }
            if (jSONObject.has(f69399y)) {
                this.f69406s = (float) jSONObject.getDouble(f69399y);
            }
            if (jSONObject.has(f69400z)) {
                this.f69407t = (float) jSONObject.getDouble(f69400z);
            }
            if (jSONObject.has(f69394A)) {
                this.f69408u = (float) jSONObject.getDouble(f69394A);
            }
            if (jSONObject.has(f69395B)) {
                this.f69410w = (float) jSONObject.getDouble(f69395B);
            }
            if (jSONObject.has(f69396C)) {
                this.f69409v = (float) jSONObject.getDouble(f69396C);
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f69398x, "parseHttpConfigs", th2);
        }
    }
}
