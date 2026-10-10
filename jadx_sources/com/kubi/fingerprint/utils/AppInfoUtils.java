package com.kubi.fingerprint.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.webkit.WebSettings;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.C33872q4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p795yf.C46481g;

/* JADX INFO: loaded from: classes13.dex */
public class AppInfoUtils {

    /* JADX INFO: renamed from: a */
    public static String f21989a;

    /* JADX INFO: renamed from: b */
    public static final Set<String> f21990b = new HashSet();

    /* JADX INFO: renamed from: c */
    public static final Map<String, String> f21991c = new HashMap<String, String>() { // from class: com.kubi.fingerprint.utils.AppInfoUtils.1
        {
            put("46000", "中国移动");
            put("46002", "中国移动");
            put("46007", "中国移动");
            put("46008", "中国移动");
            put("46001", "中国联通");
            put("46006", "中国联通");
            put("46009", "中国联通");
            put("46003", "中国电信");
            put("46005", "中国电信");
            put("46011", "中国电信");
            put("46004", "中国卫通");
            put("46020", "中国铁通");
        }
    };

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX INFO: renamed from: c */
    public static String m23787c(Context context) {
        String simOperatorName;
        try {
            try {
                if (m23785a(context, C33872q4.f71536c)) {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                        if (telephonyManager != null) {
                            String simOperator = telephonyManager.getSimOperator();
                            if (Build.VERSION.SDK_INT >= 28) {
                                CharSequence simCarrierIdName = telephonyManager.getSimCarrierIdName();
                                if (TextUtils.isEmpty(simCarrierIdName)) {
                                    simOperatorName = null;
                                } else {
                                    simOperatorName = simCarrierIdName.toString();
                                }
                            } else {
                                simOperatorName = null;
                            }
                            if (TextUtils.isEmpty(simOperatorName)) {
                                simOperatorName = telephonyManager.getSimState() == 5 ? telephonyManager.getSimOperatorName() : "未知";
                            }
                            if (!TextUtils.isEmpty(simOperator)) {
                                return m23793i(context, simOperator, simOperatorName);
                            }
                        }
                    } catch (Exception e11) {
                        C46481g.m102541d(e11);
                    }
                }
            } catch (Error e12) {
                C46481g.m102538a("SA.SensorsDataUtils", e12.toString());
            }
        } catch (Exception e13) {
            C46481g.m102541d(e13);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m23785a(Context context, String str) {
        Class<?> cls;
        try {
            if (f21990b.contains(str)) {
                return true;
            }
            try {
                cls = Class.forName("android.support.v4.content.ContextCompat");
            } catch (Exception unused) {
                cls = null;
            }
            if (cls == null) {
                try {
                    int i11 = ContextCompat.RECEIVER_VISIBLE_TO_INSTANT_APPS;
                    cls = ContextCompat.class;
                } catch (Exception unused2) {
                }
            }
            if (cls == null) {
                f21990b.add(str);
                return true;
            }
            if (((Integer) cls.getMethod("checkSelfPermission", Context.class, String.class).invoke(null, context, str)).intValue() == 0) {
                f21990b.add(str);
                return true;
            }
            C46481g.m102538a("SA.SensorsDataUtils", "You can fix this by adding the following to your AndroidManifest.xml file:\n<uses-permission android:name=\"" + str + "\" />");
            return false;
        } catch (Exception e11) {
            C46481g.m102538a("SA.SensorsDataUtils", e11.toString());
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m23786b(Context context) {
        if (context == null) {
            return "";
        }
        if (!TextUtils.isEmpty(f21989a)) {
            return f21989a;
        }
        try {
            f21989a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e11) {
            C46481g.m102541d(e11);
        }
        return f21989a;
    }

    /* JADX INFO: renamed from: d */
    public static String m23788d(JSONObject jSONObject, String str) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    /* JADX INFO: renamed from: e */
    public static String m23789e(String str, Context context) throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(context.getAssets().open(str)));
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            sb2.append(line);
                        } catch (IOException e11) {
                            e = e11;
                            bufferedReader = bufferedReader2;
                            C46481g.m102541d(e);
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return sb2.toString();
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e12) {
                                    C46481g.m102541d(e12);
                                }
                            }
                            throw th;
                        }
                    }
                    bufferedReader2.close();
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e13) {
                e = e13;
            }
        } catch (IOException e14) {
            C46481g.m102541d(e14);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: f */
    public static String m23790f(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getApplicationInfo().processName;
        } catch (Exception e11) {
            C46481g.m102541d(e11);
            return "";
        }
    }

    /* JADX INFO: renamed from: g */
    public static SharedPreferences m23791g(Context context) {
        return context.getSharedPreferences(DbParams.DATABASE_NAME, 0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0037 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:3:0x0003, B:10:0x0031, B:12:0x0037, B:15:0x0040, B:17:0x0046, B:9:0x002a, B:5:0x0011, B:7:0x0025), top: B:21:0x0003, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0046 A[Catch: Exception -> 0x003e, TRY_LEAVE, TryCatch #0 {Exception -> 0x003e, blocks: (B:3:0x0003, B:10:0x0031, B:12:0x0037, B:15:0x0040, B:17:0x0046, B:9:0x002a, B:5:0x0011, B:7:0x0025), top: B:21:0x0003, inners: #1 }] */
    /* JADX INFO: renamed from: h */
    public static String m23792h(Context context) {
        try {
            SharedPreferences sharedPreferencesM23791g = m23791g(context);
            String string = sharedPreferencesM23791g.getString("sensorsdata.user.agent", null);
            if (TextUtils.isEmpty(string)) {
                try {
                    if (Class.forName("android.webkit.WebSettings").getMethod("getDefaultUserAgent", Context.class) != null) {
                        string = WebSettings.getDefaultUserAgent(context);
                        if (TextUtils.isEmpty(string)) {
                            string = System.getProperty("http.agent");
                        }
                        if (!TextUtils.isEmpty(string)) {
                            SharedPreferences.Editor editorEdit = sharedPreferencesM23791g.edit();
                            editorEdit.putString("sensorsdata.user.agent", string);
                            editorEdit.apply();
                        }
                    } else {
                        if (TextUtils.isEmpty(string)) {
                            string = System.getProperty("http.agent");
                        }
                        if (!TextUtils.isEmpty(string)) {
                            SharedPreferences.Editor editorEdit2 = sharedPreferencesM23791g.edit();
                            editorEdit2.putString("sensorsdata.user.agent", string);
                            editorEdit2.apply();
                        }
                    }
                } catch (Exception unused) {
                    C46481g.m102538a("SA.SensorsDataUtils", "WebSettings NoSuchMethod: getDefaultUserAgent");
                }
            }
            return string;
        } catch (Exception e11) {
            C46481g.m102541d(e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m23793i(Context context, String str, String str2) throws Throwable {
        try {
            if (!TextUtils.isEmpty(str)) {
                Map<String, String> map = f21991c;
                if (map.containsKey(str)) {
                    return map.get(str);
                }
                String strM23789e = m23789e("sa_mcc_mnc_mini.json", context);
                if (TextUtils.isEmpty(strM23789e)) {
                    map.put(str, str2);
                    return str2;
                }
                String strM23788d = m23788d(new JSONObject(strM23789e), str);
                if (!TextUtils.isEmpty(strM23788d)) {
                    map.put(str, strM23788d);
                    return strM23788d;
                }
            }
        } catch (Exception e11) {
            C46481g.m102541d(e11);
        }
        return str2;
    }
}
