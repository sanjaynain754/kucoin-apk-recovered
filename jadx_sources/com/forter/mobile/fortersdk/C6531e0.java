package com.forter.mobile.fortersdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.firebase.messaging.Constants;
import com.tencent.bugly.proguard.C33675gh;
import java.util.Iterator;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6531e0 {

    /* JADX INFO: renamed from: a */
    public static final UUID f10940a = new UUID(-2129748144642739255L, 8654423357094679310L);

    /* JADX INFO: renamed from: b */
    public static final UUID f10941b = new UUID(-1301668207276963122L, -6645017420763422227L);

    /* JADX INFO: renamed from: c */
    public static final UUID f10942c = new UUID(-7348484286925749626L, -6083546864340672619L);

    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: h */
    public static void m12234h(@NonNull Object obj, @NonNull JSONArray jSONArray, @NonNull JSONObject jSONObject, @Nullable String str) {
        JSONObject jSONObject2;
        String str2;
        Object objM12227a;
        int i11 = 0;
        while (i11 < jSONArray.length()) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("name");
                String strOptString2 = jSONObjectOptJSONObject.optString("type");
                if (!TextUtils.isEmpty(strOptString) && m12237k(obj, strOptString2) && C6541g0.m12299f(jSONObjectOptJSONObject)) {
                    if (obj instanceof MediaDrm) {
                        objM12227a = m12229c((MediaDrm) obj, strOptString, strOptString2);
                    } else {
                        objM12227a = (Build.VERSION.SDK_INT < 28 || !(obj instanceof PersistableBundle)) ? null : m12227a((PersistableBundle) obj, strOptString, strOptString2);
                    }
                    Object obj2 = objM12227a;
                    if (obj2 != null) {
                        jSONObject2 = jSONObject;
                        str2 = str;
                        C6541g0.m12296c(strOptString, obj2, strOptString2, str2, jSONObjectOptJSONObject, jSONObject2);
                    } else {
                        jSONObject2 = jSONObject;
                        str2 = str;
                    }
                } else {
                    jSONObject2 = jSONObject;
                    str2 = str;
                }
            } else {
                jSONObject2 = jSONObject;
                str2 = str;
            }
            i11++;
            str = str2;
            jSONObject = jSONObject2;
        }
    }

    @Nullable
    @RequiresApi(api = 28)
    /* JADX INFO: renamed from: a */
    public static Object m12227a(@NonNull PersistableBundle persistableBundle, @NonNull String str, @NonNull String str2) {
        try {
            if ("long".equals(str2)) {
                return Long.valueOf(persistableBundle.getLong(str, -1L));
            }
            if (!"lArr".equals(str2)) {
                return null;
            }
            long[] longArray = persistableBundle.getLongArray(str);
            return longArray != null ? new JSONArray(longArray) : new JSONArray();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: b */
    public static String m12228b(@NonNull MediaDrm mediaDrm) {
        try {
            return mediaDrm.getPropertyString("securityLevel");
        } catch (Throwable unused) {
            return null;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static JSONArray m12230d(@NonNull Context context) {
        DrmManagerClient drmManagerClient;
        JSONArray jSONArray = new JSONArray();
        try {
            drmManagerClient = new DrmManagerClient(context);
            try {
                String[] availableDrmEngines = drmManagerClient.getAvailableDrmEngines();
                if (!AbstractC6539f3.m12287u(availableDrmEngines)) {
                    for (String str : availableDrmEngines) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONArray.put(str);
                        }
                    }
                }
                drmManagerClient.close();
                return jSONArray;
            } catch (Throwable unused) {
                if (drmManagerClient != null) {
                    drmManagerClient.close();
                }
                return jSONArray;
            }
        } catch (Throwable unused2) {
            drmManagerClient = null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static JSONObject m12231e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            C6545h[] c6545hArrM12165b = AbstractC6515b0.m12165b("dri");
            if (c6545hArrM12165b == null) {
                return null;
            }
            JSONObject jSONObjectM12174h = AbstractC6518b3.m12174h(c6545hArrM12165b, "wV");
            JSONObject jSONObjectM12174h2 = AbstractC6518b3.m12174h(c6545hArrM12165b, "cK");
            JSONObject jSONObjectM12174h3 = AbstractC6518b3.m12174h(c6545hArrM12165b, "pR");
            JSONObject jSONObjectM12232f = jSONObjectM12174h != null ? m12232f(jSONObjectM12174h, f10941b, 18) : null;
            JSONObject jSONObjectM12232f2 = jSONObjectM12174h2 != null ? m12232f(jSONObjectM12174h2, f10940a, 21) : null;
            JSONObject jSONObjectM12232f3 = jSONObjectM12174h3 != null ? m12232f(jSONObjectM12174h3, f10942c, 18) : null;
            if (jSONObjectM12232f != null) {
                jSONObject.put("wV", jSONObjectM12232f);
            }
            if (jSONObjectM12232f2 != null) {
                jSONObject.put("cK", jSONObjectM12232f2);
            }
            if (jSONObjectM12232f3 != null) {
                jSONObject.put("pR", jSONObjectM12232f3);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007e A[Catch: all -> 0x00b7, TryCatch #3 {all -> 0x00b7, blocks: (B:3:0x0005, B:5:0x0009, B:7:0x000f, B:9:0x0028, B:11:0x002e, B:13:0x0036, B:16:0x003e, B:33:0x006e, B:38:0x0078, B:40:0x007e, B:42:0x0086, B:48:0x0096, B:54:0x00a2, B:56:0x00a7, B:57:0x00aa, B:35:0x0073, B:36:0x0076, B:30:0x0064, B:32:0x006a, B:53:0x009e), top: B:71:0x0005, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0086 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #3 {all -> 0x00b7, blocks: (B:3:0x0005, B:5:0x0009, B:7:0x000f, B:9:0x0028, B:11:0x002e, B:13:0x0036, B:16:0x003e, B:33:0x006e, B:38:0x0078, B:40:0x007e, B:42:0x0086, B:48:0x0096, B:54:0x00a2, B:56:0x00a7, B:57:0x00aa, B:35:0x0073, B:36:0x0076, B:30:0x0064, B:32:0x006a, B:53:0x009e), top: B:71:0x0005, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:74:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @NonNull
    @SuppressLint({"NewApi", "WrongConstant"})
    /* JADX INFO: renamed from: f */
    public static JSONObject m12232f(@NonNull JSONObject jSONObject, @NonNull UUID uuid, int i11) throws JSONException {
        String string;
        MediaDrm mediaDrm;
        MediaDrm mediaDrm2;
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (Build.VERSION.SDK_INT >= i11 && MediaDrm.isCryptoSchemeSupported(uuid)) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("props");
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(C33675gh.f70007m);
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("securityLevels");
                String str = null;
                if (AbstractC6539f3.m12285s(jSONArrayOptJSONArray) && AbstractC6539f3.m12285s(jSONArrayOptJSONArray2)) {
                    string = str;
                } else {
                    if (!f10941b.equals(uuid) || AbstractC6539f3.m12285s(jSONArrayOptJSONArray3)) {
                        string = null;
                        mediaDrm = null;
                    } else {
                        mediaDrm = null;
                        for (int i12 = 0; i12 < jSONArrayOptJSONArray3.length(); i12++) {
                            try {
                                String strOptString = jSONArrayOptJSONArray3.optString(i12);
                                if (!AbstractC6539f3.m12282p(strOptString)) {
                                    MediaDrm mediaDrm3 = new MediaDrm(uuid);
                                    try {
                                        if (m12236j(mediaDrm3, strOptString)) {
                                            m12233g(mediaDrm3, jSONArrayOptJSONArray, jSONArrayOptJSONArray2, jSONObject2, strOptString);
                                        }
                                        mediaDrm = mediaDrm3;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        mediaDrm = mediaDrm3;
                                        try {
                                            string = th.toString();
                                            m12239m(mediaDrm);
                                            if (AbstractC6539f3.m12286t(jSONObject2)) {
                                                if (string == null) {
                                                    try {
                                                        mediaDrm2 = new MediaDrm(uuid);
                                                        try {
                                                            m12233g(mediaDrm2, jSONArrayOptJSONArray, jSONArrayOptJSONArray2, jSONObject2, null);
                                                            m12239m(mediaDrm2);
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            mediaDrm = mediaDrm2;
                                                            try {
                                                                string = th.toString();
                                                                m12239m(mediaDrm);
                                                            } catch (Throwable th4) {
                                                                m12239m(mediaDrm);
                                                                throw th4;
                                                            }
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                    }
                                                } else {
                                                    str = string;
                                                    string = str;
                                                }
                                                if (string != null) {
                                                    jSONObject2.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, string);
                                                }
                                            } else if (jSONObject.optBoolean("cleanProps")) {
                                                m12235i(jSONObject2);
                                            }
                                            return jSONObject2;
                                        } catch (Throwable th6) {
                                            m12239m(mediaDrm);
                                            throw th6;
                                        }
                                    }
                                }
                                m12239m(mediaDrm);
                            } catch (Throwable th7) {
                                th = th7;
                            }
                        }
                        string = null;
                        if (AbstractC6539f3.m12286t(jSONObject2)) {
                            if (jSONObject.optBoolean("cleanProps")) {
                                m12235i(jSONObject2);
                            }
                        }
                    }
                    if (string == null) {
                        mediaDrm2 = new MediaDrm(uuid);
                        m12233g(mediaDrm2, jSONArrayOptJSONArray, jSONArrayOptJSONArray2, jSONObject2, null);
                        m12239m(mediaDrm2);
                    } else {
                        str = string;
                        string = str;
                    }
                }
                return jSONObject2;
            }
            string = "not supported";
            if (string != null) {
                jSONObject2.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, string);
            }
        } catch (Throwable unused) {
        }
        return jSONObject2;
    }

    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: g */
    public static void m12233g(@NonNull MediaDrm mediaDrm, @Nullable JSONArray jSONArray, @Nullable JSONArray jSONArray2, @NonNull JSONObject jSONObject, @Nullable String str) {
        if (!AbstractC6539f3.m12285s(jSONArray)) {
            m12234h(mediaDrm, jSONArray, jSONObject, str);
        }
        if (AbstractC6539f3.m12285s(jSONArray2) || Build.VERSION.SDK_INT < 28) {
            return;
        }
        try {
            PersistableBundle metrics = mediaDrm.getMetrics();
            if (metrics != null) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C33675gh.f70007m);
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                m12234h(metrics, jSONArray2, jSONObjectOptJSONObject, str);
                jSONObject.put(C33675gh.f70007m, jSONObjectOptJSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: k */
    public static boolean m12237k(@Nullable Object obj, @Nullable String str) {
        if (obj instanceof MediaDrm) {
            return "str".equals(str) || "bArr".equals(str);
        }
        if (Build.VERSION.SDK_INT < 28 || !(obj instanceof PersistableBundle)) {
            return false;
        }
        return "long".equals(str) || "lArr".equals(str);
    }

    @Nullable
    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: l */
    public static String m12238l() {
        MediaDrm mediaDrm;
        UUID uuid = f10941b;
        if (MediaDrm.isCryptoSchemeSupported(uuid)) {
            try {
                mediaDrm = new MediaDrm(uuid);
                try {
                    String strM12229c = m12229c(mediaDrm, "deviceUniqueId", "bArr");
                    m12239m(mediaDrm);
                    return strM12229c;
                } catch (Throwable unused) {
                    m12239m(mediaDrm);
                    return null;
                }
            } catch (Throwable unused2) {
                mediaDrm = null;
            }
        }
        return null;
    }

    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: m */
    public static void m12239m(@Nullable MediaDrm mediaDrm) {
        if (mediaDrm != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                mediaDrm.release();
            } else {
                mediaDrm.release();
            }
        }
    }

    @Nullable
    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: c */
    public static String m12229c(@NonNull MediaDrm mediaDrm, @NonNull String str, @NonNull String str2) {
        try {
            if ("str".equals(str2)) {
                return AbstractC6539f3.m12260G(mediaDrm.getPropertyString(str));
            }
            if ("bArr".equals(str2)) {
                byte[] propertyByteArray = mediaDrm.getPropertyByteArray(str);
                if (propertyByteArray != null) {
                    return Base64.encodeToString(propertyByteArray, 2);
                }
                return "";
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m12235i(@NonNull JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!C33675gh.f70007m.equals(next)) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                Object obj = null;
                if (jSONObjectOptJSONObject != null) {
                    Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                    Object obj2 = null;
                    while (true) {
                        if (itKeys2.hasNext()) {
                            Object objOpt = jSONObjectOptJSONObject.opt(itKeys2.next());
                            if (obj2 != null && !obj2.equals(objOpt)) {
                                break;
                            } else {
                                obj2 = objOpt;
                            }
                        } else {
                            obj = obj2;
                            break;
                        }
                    }
                }
                if (obj != null) {
                    try {
                        jSONObject.put(next, obj);
                    } catch (JSONException unused) {
                    }
                }
            }
        }
    }

    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: j */
    public static boolean m12236j(@NonNull MediaDrm mediaDrm, @NonNull String str) {
        String strM12228b = m12228b(mediaDrm);
        if (strM12228b == null) {
            return false;
        }
        if (str.equals(strM12228b)) {
            return true;
        }
        try {
            mediaDrm.setPropertyString("securityLevel", str);
            return str.equals(m12228b(mediaDrm));
        } catch (Throwable unused) {
            return false;
        }
    }
}
