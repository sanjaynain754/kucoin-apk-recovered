package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.utils.ProcessUtil;
import com.tencent.bugly.common.utils.StringUtil;
import com.tencent.rmonitor.common.logger.Logger;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.nf */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33820nf {

    /* JADX INFO: renamed from: A */
    public static final String f71122A = "full_os_version";

    /* JADX INFO: renamed from: B */
    public static final String f71123B = "model";

    /* JADX INFO: renamed from: C */
    public static final String f71124C = "unique_id";

    /* JADX INFO: renamed from: D */
    public static final String f71125D = "brand";

    /* JADX INFO: renamed from: E */
    public static final String f71126E = "account_id";

    /* JADX INFO: renamed from: F */
    public static final String f71127F = "operation_log";

    /* JADX INFO: renamed from: G */
    public static final String f71128G = "user_custom";

    /* JADX INFO: renamed from: H */
    public static final String f71129H = "extend_info";

    /* JADX INFO: renamed from: I */
    public static final String f71130I = "biz_extend_info";

    /* JADX INFO: renamed from: J */
    public static final String f71131J = "linkages";

    /* JADX INFO: renamed from: K */
    public static final String f71132K = "process_name";

    /* JADX INFO: renamed from: L */
    public static final String f71133L = "is64bit";

    /* JADX INFO: renamed from: M */
    public static final String f71134M = "stage";

    /* JADX INFO: renamed from: N */
    public static final String f71135N = "toolyrx";

    /* JADX INFO: renamed from: O */
    public static final String f71136O = "gc_info";

    /* JADX INFO: renamed from: P */
    public static final String f71137P = "rom_name";

    /* JADX INFO: renamed from: Q */
    public static final String f71138Q = "launch_duration";

    /* JADX INFO: renamed from: R */
    public static final String f71139R = "app_channel";

    /* JADX INFO: renamed from: S */
    public static final String[] f71140S = new String[0];

    /* JADX INFO: renamed from: T */
    public static final String[] f71141T = {"stage"};

    /* JADX INFO: renamed from: U */
    public static final long f71142U = 1000;

    /* JADX INFO: renamed from: V */
    public static final String f71143V = "Bugly_RDataBuilder";

    /* JADX INFO: renamed from: W */
    public static final String f71144W = "-";

    /* JADX INFO: renamed from: a */
    public static final String f71145a = "product_id";

    /* JADX INFO: renamed from: b */
    public static final String f71146b = "app_key";

    /* JADX INFO: renamed from: c */
    public static final String f71147c = "event_time";

    /* JADX INFO: renamed from: d */
    public static final String f71148d = "event_time_in_ms";

    /* JADX INFO: renamed from: e */
    public static final String f71149e = "base_type";

    /* JADX INFO: renamed from: f */
    public static final String f71150f = "sub_type";

    /* JADX INFO: renamed from: g */
    public static final String f71151g = "platform";

    /* JADX INFO: renamed from: h */
    public static final String f71152h = "app_version";

    /* JADX INFO: renamed from: i */
    public static final String f71153i = "app_version_mode";

    /* JADX INFO: renamed from: j */
    public static final String f71154j = "sdk_version";

    /* JADX INFO: renamed from: k */
    public static final String f71155k = "bundle_id";

    /* JADX INFO: renamed from: l */
    public static final String f71156l = "client_identify";

    /* JADX INFO: renamed from: m */
    public static final String f71157m = "build_number";

    /* JADX INFO: renamed from: n */
    public static final String f71158n = "translate_type";

    /* JADX INFO: renamed from: o */
    public static final String f71159o = "Resource";

    /* JADX INFO: renamed from: p */
    public static final String f71160p = "Attributes";

    /* JADX INFO: renamed from: q */
    public static final String f71161q = "Body";

    /* JADX INFO: renamed from: r */
    public static final String f71162r = "stack_structure_type";

    /* JADX INFO: renamed from: s */
    public static final String f71163s = "app_name";

    /* JADX INFO: renamed from: t */
    public static final String f71164t = "protocol_version";

    /* JADX INFO: renamed from: u */
    public static final String f71165u = "launch_id";

    /* JADX INFO: renamed from: v */
    public static final String f71166v = "process_launch_id";

    /* JADX INFO: renamed from: w */
    public static final String f71167w = "key_my_pid";

    /* JADX INFO: renamed from: x */
    public static final String f71168x = "exception_link";

    /* JADX INFO: renamed from: y */
    public static final String f71169y = "hardware_os";

    /* JADX INFO: renamed from: z */
    public static final String f71170z = "os_version";

    /* JADX INFO: renamed from: a */
    public static boolean m74306a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        return jSONObject != null && jSONObject.has(f71160p) && (jSONObjectOptJSONObject = jSONObject.optJSONObject(f71160p)) != null && jSONObjectOptJSONObject.has(f71144W);
    }

    /* JADX INFO: renamed from: b */
    public static String m74307b(JSONObject jSONObject) {
        return (jSONObject == null || !jSONObject.has(f71156l)) ? "" : jSONObject.optString(f71156l);
    }

    /* JADX INFO: renamed from: c */
    public static int m74309c(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has(f71167w)) {
            return 0;
        }
        return jSONObject.optInt(f71167w);
    }

    /* JADX INFO: renamed from: d */
    public static String m74310d(JSONObject jSONObject) {
        return m74301a(jSONObject, f71144W);
    }

    /* JADX INFO: renamed from: e */
    public static String m74311e(JSONObject jSONObject) {
        return (jSONObject == null || !jSONObject.has(f71150f)) ? "" : jSONObject.optString(f71150f);
    }

    /* JADX INFO: renamed from: f */
    public static String m74312f(JSONObject jSONObject) {
        return (jSONObject == null || !jSONObject.has("process_launch_id")) ? "" : jSONObject.optString("process_launch_id");
    }

    /* JADX INFO: renamed from: g */
    public static String m74313g(JSONObject jSONObject) {
        String strOptString = (jSONObject == null || !jSONObject.has("process_name")) ? "" : jSONObject.optString("process_name");
        return TextUtils.isEmpty(strOptString) ? ProcessUtil.getCurrentProcessName(C33598d3.m72772c()) : strOptString;
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m74308b(UserMeta userMeta) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f71169y, "android");
            String strMo73419g = C33714ie.m73408k().mo73419g();
            C33714ie c33714ie = C33714ie.f70270o;
            int iMo73415c = c33714ie.mo73415c();
            jSONObject.put("os_version", C33797md.m74119a(iMo73415c, strMo73419g));
            jSONObject.put("full_os_version", C33797md.m74120b(iMo73415c, strMo73419g));
            jSONObject.put("model", userMeta.getModel());
            jSONObject.put(f71124C, userMeta.getUniqueID());
            jSONObject.put(f71125D, c33714ie.mo73413b());
            jSONObject.put("account_id", userMeta.uin);
            return jSONObject;
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77131e(f71143V, C33799mf.m74131a("makeResource fail for ", th2));
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m74301a(JSONObject jSONObject, String str) {
        String strOptString;
        String strOptString2 = "";
        if (jSONObject == null || !jSONObject.has(f71149e)) {
            strOptString = "";
        } else {
            strOptString = jSONObject.optString(f71149e);
        }
        if (jSONObject != null && jSONObject.has(f71150f)) {
            strOptString2 = jSONObject.optString(f71150f);
        }
        return strOptString + str + strOptString2;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m74303a(Context context, String str, String str2, UserMeta userMeta) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("product_id", userMeta.appId);
                jSONObject.put("app_key", userMeta.appKey);
                long jCurrentTimeMillis = System.currentTimeMillis();
                jSONObject.put("event_time", jCurrentTimeMillis / 1000);
                jSONObject.put(f71148d, jCurrentTimeMillis);
                jSONObject.put(f71149e, str);
                jSONObject.put(f71150f, str2);
                jSONObject.put("app_version", userMeta.appVersion);
                jSONObject.put("app_version_mode", userMeta.getAppVersionMode());
                jSONObject.put("sdk_version", userMeta.sdkVersion);
                jSONObject.put(f71155k, m74299a(context));
                jSONObject.put(f71157m, userMeta.buildNumber);
                jSONObject.put(f71156l, m74300a(userMeta));
                jSONObject.put("platform", KCTurboSystemSettingsModuleImpl.PLATFORM_ANDROID);
                jSONObject.put(f71159o, m74308b(userMeta));
                jSONObject.put("launch_id", C33591ch.m72741a(context));
                jSONObject.put("process_launch_id", C33591ch.f69465f);
                jSONObject.put(f71164t, 1);
                jSONObject.put(f71167w, Process.myPid());
                return jSONObject;
            } catch (Throwable th2) {
                Logger.INSTANCE.mo77131e(f71143V, C33799mf.m74131a("makeParam fail for ", th2));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m74304a(String[] strArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (m74305a("stage", strArr)) {
                jSONObject.put("stage", C33657g.m73094e());
            }
            jSONObject.put(f71135N, C33955u7.m75163c().m75164a());
            if (m74305a(f71137P, strArr)) {
                String strM75382a = C34003wf.m75382a();
                if (strM75382a == null) {
                    strM75382a = "";
                }
                jSONObject.put(f71137P, strM75382a);
            }
            if (m74305a(f71138Q, strArr)) {
                jSONObject.put(f71138Q, C33791m7.m74047b());
            }
            jSONObject.put("app_channel", C33791m7.m74054e().getAppChannel());
            return jSONObject;
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77131e(f71143V, C33799mf.m74131a("makeAttributes fail for ", th2));
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m74302a() {
        return m74304a(f71140S);
    }

    /* JADX INFO: renamed from: a */
    public static String m74300a(UserMeta userMeta) {
        return StringUtil.getMD5(userMeta.uin + userMeta.getUniqueID() + System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: a */
    public static String m74299a(Context context) {
        return context != null ? context.getPackageName() : "";
    }

    /* JADX INFO: renamed from: a */
    public static boolean m74305a(String str, String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return true;
        }
        for (String str2 : strArr) {
            if (TextUtils.equals(str, str2)) {
                return false;
            }
        }
        return true;
    }
}
