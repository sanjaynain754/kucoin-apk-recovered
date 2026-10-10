package com.forter.mobile.fortersdk;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.x */
/* JADX INFO: loaded from: classes45.dex */
public final class C6625x {
    /* JADX INFO: renamed from: a */
    public static long m12492a(@NonNull List<PackageInfo> list) {
        long j11 = 7;
        for (int i11 = 0; i11 < list.size(); i11++) {
            j11 = (j11 * 31) + ((long) list.get(i11).versionCode);
        }
        return j11;
    }

    @NonNull
    @RequiresApi(api = 29)
    /* JADX INFO: renamed from: b */
    public static JSONObject m12493b(@NonNull AppOpsManager appOpsManager, @NonNull List<PackageInfo> list, @NonNull String str, boolean z11) {
        ApplicationInfo applicationInfo;
        JSONObject jSONObject = new JSONObject();
        int i11 = 0;
        long j11 = 0;
        for (PackageInfo packageInfo : list) {
            if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
                try {
                    if (appOpsManager.unsafeCheckOpNoThrow(str, applicationInfo.uid, applicationInfo.packageName) == 0) {
                        i11++;
                        if (z11) {
                            long j12 = packageInfo.firstInstallTime;
                            if (j12 > j11) {
                                j11 = j12;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        try {
            jSONObject.put("count", i11);
            if (i11 > 0 && z11) {
                jSONObject.put("latestInstallTime", j11);
            }
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static JSONObject m12494c(@NonNull Context context, @NonNull C6545h[] c6545hArr) {
        Context context2;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArrayM12175i = AbstractC6518b3.m12175i(c6545hArr, "groups");
            JSONArray jSONArrayM12175i2 = AbstractC6518b3.m12175i(c6545hArr, "appPerms");
            JSONArray jSONArrayM12175i3 = AbstractC6518b3.m12175i(c6545hArr, "serPerms");
            JSONArray jSONArrayM12175i4 = AbstractC6518b3.m12175i(c6545hArr, "appOps");
            JSONArray jSONArrayM12175i5 = AbstractC6518b3.m12175i(c6545hArr, "intents");
            JSONArray jSONArrayM12175i6 = AbstractC6518b3.m12175i(c6545hArr, "categories");
            JSONArray jSONArrayM12175i7 = AbstractC6518b3.m12175i(c6545hArr, "admins");
            JSONArray jSONArrayM12175i8 = AbstractC6518b3.m12175i(c6545hArr, "accessibilityServices");
            C6545h c6545hM12167a = AbstractC6518b3.m12167a(c6545hArr, "getEarliestInstallTime");
            boolean z11 = c6545hM12167a != null && Boolean.parseBoolean(c6545hM12167a.f10960b);
            int i11 = jSONArrayM12175i2 != null ? 4096 : 0;
            if (jSONArrayM12175i3 != null) {
                i11 |= 4;
            }
            PackageManager packageManager = context.getPackageManager();
            List<PackageInfo> listM12277k = AbstractC6539f3.m12277k(packageManager, i11);
            jSONObject.put("total", listM12277k.size());
            m12505n(jSONArrayM12175i6, listM12277k, z11, jSONObject);
            if (jSONArrayM12175i != null) {
                m12506o(jSONArrayM12175i, AbstractC6539f3.m12278l(listM12277k), jSONObject);
            }
            if (jSONArrayM12175i2 != null) {
                m12504m(jSONArrayM12175i2, listM12277k, jSONObject);
            }
            if (jSONArrayM12175i3 != null) {
                m12503l(jSONArrayM12175i3, listM12277k, AbstractC6539f3.m12265L(context), jSONObject);
            }
            if (jSONArrayM12175i4 == null || Build.VERSION.SDK_INT < 29) {
                context2 = context;
            } else {
                context2 = context;
                m12500i((AppOpsManager) context2.getSystemService("appops"), jSONArrayM12175i4, listM12277k, jSONObject);
            }
            if (jSONArrayM12175i5 != null) {
                m12501j(jSONArrayM12175i5, packageManager, jSONObject);
            }
            if (jSONArrayM12175i7 != null) {
                m12502k(jSONArrayM12175i7, AbstractC6539f3.m12261H(context2), "admins", jSONObject);
            }
            if (jSONArrayM12175i8 != null) {
                m12502k(jSONArrayM12175i8, AbstractC6539f3.m12263J(context2), "accessibilityServices", jSONObject);
            }
            jSONObject.put("versionHash", m12492a(listM12277k));
            return jSONObject;
        } catch (Throwable unused) {
            AbstractC6524c3.m12212d();
            return jSONObject;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NonNull
    /* JADX INFO: renamed from: d */
    public static JSONObject m12495d(@NonNull PackageManager packageManager, @NonNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i11, boolean z11) throws JSONException {
        byte b11;
        List<ResolveInfo> listQueryIntentActivities;
        String str6;
        JSONObject jSONObject = new JSONObject();
        Intent intent = new Intent();
        if (!TextUtils.isEmpty(str2)) {
            intent.setAction(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            Uri uri = Uri.parse(str3);
            if (TextUtils.isEmpty(str4)) {
                intent.setData(uri);
            } else {
                intent.setDataAndType(uri, str4);
            }
        }
        if (!TextUtils.isEmpty(str5)) {
            intent.setPackage(str5);
        }
        try {
            switch (str.hashCode()) {
                case -1655966961:
                    if (str.equals("activity")) {
                        b11 = 0;
                    } else {
                        b11 = -1;
                    }
                    break;
                case -808719889:
                    if (str.equals("receiver")) {
                        b11 = 2;
                    } else {
                        b11 = -1;
                    }
                    break;
                case 1571331113:
                    if (str.equals("contentProviders")) {
                        b11 = 3;
                    } else {
                        b11 = -1;
                    }
                    break;
                case 1984153269:
                    if (str.equals(NotificationCompat.CATEGORY_SERVICE)) {
                        b11 = 1;
                    } else {
                        b11 = -1;
                    }
                    break;
                default:
                    b11 = -1;
                    break;
            }
            if (b11 == 0) {
                listQueryIntentActivities = packageManager.queryIntentActivities(intent, i11);
            } else if (b11 == 1) {
                listQueryIntentActivities = packageManager.queryIntentServices(intent, i11);
            } else {
                if (b11 != 2) {
                    if (b11 == 3) {
                        listQueryIntentActivities = packageManager.queryIntentContentProviders(intent, i11);
                    }
                    return jSONObject;
                }
                listQueryIntentActivities = packageManager.queryBroadcastReceivers(intent, i11);
            }
            int size = listQueryIntentActivities != null ? listQueryIntentActivities.size() : 0;
            long j11 = 0;
            if (size > 0 && z11) {
                for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                    if (resolveInfo != null) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo != null) {
                            str6 = activityInfo.packageName;
                        } else {
                            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                            if (serviceInfo != null) {
                                str6 = serviceInfo.packageName;
                            } else {
                                ProviderInfo providerInfo = resolveInfo.providerInfo;
                                str6 = providerInfo != null ? providerInfo.packageName : null;
                            }
                        }
                        if (!TextUtils.isEmpty(str6)) {
                            try {
                                PackageInfo packageInfo = packageManager.getPackageInfo(str6, 0);
                                if (packageInfo != null) {
                                    long j12 = packageInfo.firstInstallTime;
                                    if (j12 > j11) {
                                        j11 = j12;
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                        }
                    }
                }
            }
            jSONObject.put("count", size);
            if (size > 0 && z11) {
                jSONObject.put("latestInstallTime", j11);
            }
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: e */
    public static JSONObject m12496e(@NonNull HashSet<String> hashSet, @NonNull JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        int i11 = 0;
        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i12);
            if (jSONObjectOptJSONObject != null) {
                Object objOpt = jSONObjectOptJSONObject.opt("id");
                String strOptString = jSONObjectOptJSONObject.optString("name");
                if (!TextUtils.isEmpty(strOptString) && hashSet.contains(strOptString)) {
                    i11++;
                    if (objOpt != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("id", objOpt);
                            jSONArray2.put(jSONObject);
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("count", i11);
            if (jSONArray2.length() > 0) {
                jSONObject2.put("data", jSONArray2);
            }
        } catch (JSONException unused2) {
        }
        return jSONObject2;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static JSONObject m12497f(@NonNull List<PackageInfo> list, @NonNull String str, @Nullable HashSet<String> hashSet, boolean z11) {
        JSONObject jSONObject = new JSONObject();
        long j11 = 0;
        Boolean bool = null;
        int i11 = 0;
        for (PackageInfo packageInfo : list) {
            if (packageInfo != null) {
                ServiceInfo[] serviceInfoArr = packageInfo.services;
                if (!AbstractC6539f3.m12287u(serviceInfoArr)) {
                    for (ServiceInfo serviceInfo : serviceInfoArr) {
                        if (serviceInfo != null && str.equals(serviceInfo.permission)) {
                            i11++;
                            if (z11) {
                                long j12 = packageInfo.firstInstallTime;
                                if (j12 > j11) {
                                    j11 = j12;
                                }
                            }
                            if (hashSet != null) {
                                if (!hashSet.contains(serviceInfo.name)) {
                                    if (bool != null) {
                                        break;
                                    }
                                    bool = Boolean.FALSE;
                                    break;
                                }
                                bool = Boolean.TRUE;
                                break;
                            }
                            break;
                        }
                    }
                }
            }
        }
        try {
            jSONObject.put("count", i11);
            if (bool != null) {
                jSONObject.put("isRunning", bool);
            }
            if (i11 >= 0 && z11) {
                jSONObject.put("latestInstallTime", j11);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static JSONObject m12498g(@NonNull List<PackageInfo> list, @NonNull String str, boolean z11) {
        JSONObject jSONObject = new JSONObject();
        long j11 = 0;
        int i11 = 0;
        for (PackageInfo packageInfo : list) {
            if (packageInfo != null) {
                String[] strArr = packageInfo.requestedPermissions;
                if (!AbstractC6539f3.m12287u(strArr)) {
                    for (String str2 : strArr) {
                        if (str.equals(str2)) {
                            i11++;
                            if (!z11) {
                                break;
                            }
                            long j12 = packageInfo.firstInstallTime;
                            if (j12 <= j11) {
                                break;
                            }
                            j11 = j12;
                            break;
                        }
                    }
                }
            }
        }
        try {
            jSONObject.put("count", i11);
            if (i11 > 0 && z11) {
                jSONObject.put("latestInstallTime", j11);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public static JSONObject m12499h(@NonNull Map<String, PackageInfo> map, @NonNull JSONArray jSONArray, boolean z11) {
        String strOptString;
        Object objOpt;
        long j11;
        PackageInfo packageInfo;
        JSONArray jSONArray2 = new JSONArray();
        int i11 = 0;
        long j12 = 0;
        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i12);
            if (jSONObjectOptJSONObject != null) {
                strOptString = jSONObjectOptJSONObject.optString("name");
                objOpt = jSONObjectOptJSONObject.opt("id");
            } else {
                strOptString = jSONArray.optString(i12);
                objOpt = null;
            }
            if (map.containsKey(strOptString)) {
                i11++;
                if (!z11 || (packageInfo = map.get(strOptString)) == null) {
                    j11 = 0;
                } else {
                    j11 = packageInfo.firstInstallTime;
                    if (j11 > j12) {
                        j12 = j11;
                    }
                }
                if (objOpt != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", objOpt);
                        if (z11) {
                            jSONObject.put("installTime", j11);
                        }
                        jSONArray2.put(jSONObject);
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("count", i11);
            if (jSONArray2.length() > 0) {
                jSONObject2.put("data", jSONArray2);
            }
            if (i11 > 0 && z11) {
                jSONObject2.put("latestInstallTime", j12);
            }
        } catch (JSONException unused2) {
        }
        return jSONObject2;
    }

    @RequiresApi(api = 29)
    /* JADX INFO: renamed from: i */
    public static void m12500i(@NonNull AppOpsManager appOpsManager, @NonNull JSONArray jSONArray, @NonNull List<PackageInfo> list, @NonNull JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i11);
                String strOptString = jSONObject3.optString("name");
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONObject jSONObjectM12493b = m12493b(appOpsManager, list, strOptString, jSONObject3.optBoolean("installTime"));
                    Object objOpt = jSONObject3.opt("id");
                    if (objOpt != null) {
                        try {
                            strOptString = String.valueOf(objOpt);
                        } catch (JSONException unused) {
                        }
                    }
                    jSONObject2.put(strOptString, jSONObjectM12493b);
                }
            }
            jSONObject.put("appOps", jSONObject2);
        } catch (Throwable unused2) {
            AbstractC6524c3.m12212d();
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m12501j(@NonNull JSONArray jSONArray, @NonNull PackageManager packageManager, @NonNull JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i11);
                if (jSONObject3.has("id") && (jSONObject3.has(TUIConstants.TIMPush.NOTIFICATION.ACTION) || jSONObject3.has("data") || jSONObject3.has(TPDownloadProxyEnum.DLPARAM_PACKAGE))) {
                    String strOptString = jSONObject3.optString("type");
                    if ("activity".equals(strOptString) || NotificationCompat.CATEGORY_SERVICE.equals(strOptString) || "receiver".equals(strOptString) || "contentProviders".equals(strOptString)) {
                        "contentProviders".equals(strOptString);
                        JSONObject jSONObjectM12495d = m12495d(packageManager, strOptString, jSONObject3.optString(TUIConstants.TIMPush.NOTIFICATION.ACTION), jSONObject3.optString("data"), jSONObject3.optString("mimeType"), jSONObject3.optString(TPDownloadProxyEnum.DLPARAM_PACKAGE), jSONObject3.optInt("flags"), jSONObject3.optBoolean("installTime"));
                        Object objOpt = jSONObject3.opt("id");
                        if (objOpt != null) {
                            try {
                                jSONObject2.put(String.valueOf(objOpt), jSONObjectM12495d);
                            } catch (JSONException unused) {
                            }
                        }
                    }
                }
            }
            jSONObject.put("intents", jSONObject2);
        } catch (Throwable unused2) {
            AbstractC6524c3.m12212d();
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m12503l(@NonNull JSONArray jSONArray, @NonNull List<PackageInfo> list, @Nullable HashSet<String> hashSet, @NonNull JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i11);
                String strOptString = jSONObject3.optString("name");
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONObject jSONObjectM12497f = m12497f(list, strOptString, hashSet, jSONObject3.optBoolean("installTime"));
                    Object objOpt = jSONObject3.opt("id");
                    if (objOpt != null) {
                        try {
                            strOptString = String.valueOf(objOpt);
                        } catch (JSONException unused) {
                        }
                    }
                    jSONObject2.put(strOptString, jSONObjectM12497f);
                }
            }
            jSONObject.put("servicePerms", jSONObject2);
        } catch (Throwable unused2) {
            AbstractC6524c3.m12212d();
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m12504m(@NonNull JSONArray jSONArray, @NonNull List<PackageInfo> list, @NonNull JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i11);
                String strOptString = jSONObject3.optString("name");
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONObject jSONObjectM12498g = m12498g(list, strOptString, jSONObject3.optBoolean("installTime"));
                    Object objOpt = jSONObject3.opt("id");
                    if (objOpt != null) {
                        try {
                            strOptString = String.valueOf(objOpt);
                        } catch (JSONException unused) {
                        }
                    }
                    jSONObject2.put(strOptString, jSONObjectM12498g);
                }
            }
            jSONObject.put("perms", jSONObject2);
        } catch (Throwable unused2) {
            AbstractC6524c3.m12212d();
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m12506o(@NonNull JSONArray jSONArray, @NonNull Map<String, PackageInfo> map, @NonNull JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i11);
                String strOptString = jSONObject3.optString("name", String.valueOf(i11));
                if (jSONObject3.has("packages")) {
                    jSONObject2.put(strOptString, m12499h(map, jSONObject3.getJSONArray("packages"), jSONObject3.optBoolean("installTime")));
                }
            }
            jSONObject.put("groups", jSONObject2);
        } catch (Throwable unused) {
            AbstractC6524c3.m12212d();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: p */
    public static Map<Integer, C6634y3> m12507p(@Nullable JSONArray jSONArray, @NonNull List<PackageInfo> list, boolean z11, @NonNull JSONObject jSONObject) {
        ApplicationInfo applicationInfo;
        int i11;
        HashMap map = new HashMap();
        try {
            int i12 = 0;
            long j11 = 0;
            for (PackageInfo packageInfo : list) {
                if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
                    boolean z12 = (applicationInfo.flags & 129) > 0;
                    if (z12) {
                        i12++;
                    } else if (z11) {
                        long j12 = packageInfo.firstInstallTime;
                        if (j12 > 0 && (j11 == 0 || j12 < j11)) {
                            j11 = j12;
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 26 && jSONArray != null && (i11 = applicationInfo.category) != -1) {
                        C6634y3 c6634y3 = (C6634y3) map.get(Integer.valueOf(i11));
                        if (c6634y3 == null) {
                            map.put(Integer.valueOf(i11), new C6634y3(z12));
                        } else if (z12) {
                            c6634y3.f11093b++;
                        } else {
                            c6634y3.f11092a++;
                        }
                    }
                }
            }
            try {
                jSONObject.put("system", i12);
            } catch (JSONException unused) {
                AbstractC6524c3.m12212d();
            }
            if (z11) {
                try {
                    jSONObject.put("earliestInstallTime", j11);
                } catch (JSONException unused2) {
                    AbstractC6524c3.m12212d();
                }
            }
        } catch (Throwable unused3) {
            AbstractC6524c3.m12212d();
        }
        return map;
    }

    /* JADX INFO: renamed from: k */
    public static void m12502k(@NonNull JSONArray jSONArray, @NonNull HashSet<String> hashSet, @NonNull String str, @NonNull JSONObject jSONObject) {
        try {
            jSONObject.put(str, m12496e(hashSet, jSONArray));
        } catch (Throwable unused) {
            String.format("Error filling %s packages result", str);
            AbstractC6524c3.m12212d();
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m12505n(@Nullable JSONArray jSONArray, @NonNull List<PackageInfo> list, boolean z11, @NonNull JSONObject jSONObject) {
        C6634y3 c6634y3;
        Map<Integer, C6634y3> mapM12507p = m12507p(jSONArray, list, z11, jSONObject);
        if (Build.VERSION.SDK_INT >= 26 && jSONArray != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    int iOptInt = jSONArray.optInt(i11, -1);
                    if (iOptInt != -1 && (c6634y3 = mapM12507p.get(Integer.valueOf(iOptInt))) != null) {
                        try {
                            String strValueOf = String.valueOf(iOptInt);
                            JSONObject jSONObject3 = new JSONObject();
                            int i12 = c6634y3.f11093b;
                            if (i12 > 0) {
                                jSONObject3.put("system", i12);
                            }
                            int i13 = c6634y3.f11092a;
                            if (i13 > 0) {
                                jSONObject3.put("data", i13);
                            }
                            jSONObject2.put(strValueOf, jSONObject3);
                        } catch (JSONException unused) {
                        }
                    }
                }
                jSONObject.put("categories", jSONObject2);
            } catch (Throwable unused2) {
                AbstractC6524c3.m12212d();
            }
        }
    }
}
