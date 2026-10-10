package com.forter.mobile.fortersdk;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.ActivityManager;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import java.io.ByteArrayInputStream;
import java.net.InetAddress;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.f3 */
/* JADX INFO: compiled from: bv.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6539f3 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f10950a = {BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions};

    /* JADX INFO: renamed from: M */
    public static int m12266M(@NonNull Context context) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver != null) {
                return Settings.Global.getInt(contentResolver, "boot_count", -1);
            }
        } catch (Throwable unused) {
        }
        return -1;
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public static String m12276j(@NonNull String[] strArr) {
        if (strArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(strArr[0]);
        for (int i11 = 1; i11 < strArr.length; i11++) {
            sb2.append(',');
            sb2.append(strArr[i11]);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.f3$a */
    public class a implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setDaemon(true);
            return threadNewThread;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: C */
    public static String m12256C() {
        try {
            return new SimpleDateFormat("EEE MMM dd yyyy HH:mm:ss 'GMT'Z (z)", Locale.ENGLISH).format(Calendar.getInstance().getTime());
        } catch (AssertionError e11) {
            C6520c.m12182b().m12187e("Failed formatting local time (AssertionErr)", e11.getMessage());
            return "FAILURE";
        } catch (Exception e12) {
            C6520c.m12182b().m12187e("Failed formatting local time", e12.getMessage());
            return "FAILURE";
        }
    }

    /* JADX INFO: renamed from: E */
    public static String m12258E(@NonNull String str) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (' ' == str.charAt(i11)) {
                sb2.append('_');
            } else {
                sb2.append(Character.toLowerCase(str.charAt(i11)));
            }
        }
        return sb2.toString();
    }

    @NonNull
    /* JADX INFO: renamed from: G */
    public static String m12260G(@Nullable String str) {
        return str == null ? "" : str;
    }

    @NonNull
    /* JADX INFO: renamed from: H */
    public static HashSet<String> m12261H(@NonNull Context context) {
        HashSet<String> hashSet = new HashSet<>();
        try {
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
            if (devicePolicyManager != null) {
                List<ComponentName> activeAdmins = devicePolicyManager.getActiveAdmins();
                if (!m12283q(activeAdmins)) {
                    Iterator<ComponentName> it = activeAdmins.iterator();
                    while (it.hasNext()) {
                        String packageName = it.next().getPackageName();
                        if (!TextUtils.isEmpty(packageName)) {
                            hashSet.add(packageName);
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: I */
    public static String m12262I() {
        return Build.VERSION.SDK_INT < 26 ? C6529d3.m12225d("ro.runtime.firstboot", "FAILURE") : "FAILURE";
    }

    @NonNull
    /* JADX INFO: renamed from: J */
    public static HashSet<String> m12263J(@NonNull Context context) {
        ServiceInfo serviceInfo;
        HashSet<String> hashSet = new HashSet<>();
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            if (accessibilityManager != null) {
                List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                if (!m12283q(enabledAccessibilityServiceList)) {
                    Iterator<AccessibilityServiceInfo> it = enabledAccessibilityServiceList.iterator();
                    while (it.hasNext()) {
                        ResolveInfo resolveInfo = it.next().getResolveInfo();
                        if (resolveInfo != null && (serviceInfo = resolveInfo.serviceInfo) != null) {
                            String str = serviceInfo.packageName;
                            if (TextUtils.isEmpty(str)) {
                                continue;
                            } else {
                                hashSet.add(str);
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: K */
    public static String m12264K() {
        return String.format(Locale.ENGLISH, "%s(%d)", "2.4.12", 75);
    }

    @Nullable
    @Deprecated
    /* JADX INFO: renamed from: L */
    public static HashSet<String> m12265L(@NonNull Context context) {
        ComponentName componentName;
        if (Build.VERSION.SDK_INT >= 26) {
            return null;
        }
        HashSet<String> hashSet = new HashSet<>();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(Integer.MAX_VALUE);
        if (!m12283q(runningServices)) {
            for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                if (runningServiceInfo != null && (componentName = runningServiceInfo.service) != null) {
                    String className = componentName.getClassName();
                    if (!TextUtils.isEmpty(className)) {
                        hashSet.add(className);
                    }
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: b */
    public static String m12268b(int i11) {
        try {
            return InetAddress.getByAddress(new byte[]{(byte) (i11 & 255), (byte) ((i11 >> 8) & 255), (byte) ((i11 >> 16) & 255), (byte) ((i11 >> 24) & 255)}).getHostAddress();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @NonNull
    /* JADX INFO: renamed from: c */
    public static synchronized String m12269c(@NonNull Context context) {
        String strM12270d;
        try {
            SharedPreferences sharedPreferencesM12110f0 = AbstractC6506a3.m12110f0(context);
            strM12270d = m12270d(sharedPreferencesM12110f0);
            if (strM12270d == null) {
                strM12270d = UUID.randomUUID().toString();
                sharedPreferencesM12110f0.edit().putString("installation_guid", strM12270d).apply();
            }
        } catch (Throwable unused) {
            return "FAILURE";
        }
        return strM12270d;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static String m12270d(@NonNull SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("installation_guid", null);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static String m12271e(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static String m12272f(@NonNull String str) {
        return str.toLowerCase(Locale.ROOT);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static String m12275i(byte[] bArr) {
        try {
            return m12290x(MessageDigest.getInstance("SHA1").digest(CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(bArr)).getEncoded()));
        } catch (Throwable unused) {
            return null;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public static List<PackageInfo> m12277k(@NonNull PackageManager packageManager, int i11) {
        return Collections.EMPTY_LIST;
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public static Map<String, PackageInfo> m12278l(@NonNull List<PackageInfo> list) {
        HashMap map = new HashMap();
        try {
            for (PackageInfo packageInfo : list) {
                map.put(packageInfo.packageName, packageInfo);
            }
        } catch (Throwable unused) {
        }
        return map;
    }

    @NonNull
    /* JADX INFO: renamed from: m */
    public static JSONArray m12279m(@Nullable Signature[] signatureArr) {
        JSONArray jSONArray = new JSONArray();
        if (!m12287u(signatureArr)) {
            for (Signature signature : signatureArr) {
                if (signature != null) {
                    String strM12275i = m12275i(signature.toByteArray());
                    if (!TextUtils.isEmpty(strM12275i)) {
                        jSONArray.put(strM12275i);
                    }
                }
            }
        }
        return jSONArray;
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public static JSONObject m12280n(@NonNull Context context, C6535f c6535f) throws JSONException {
        JSONArray jSONArrayM12279m;
        String[] strArr;
        JSONObject jSONObject = new JSONObject();
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            jSONObject.put("pkgName", packageName);
            boolean zM12249b = c6535f.m12249b("permissions");
            boolean zM12249b2 = c6535f.m12249b("signatures");
            int i11 = zM12249b ? 4096 : 0;
            if (zM12249b2) {
                i11 = Build.VERSION.SDK_INT >= 28 ? i11 | C2711C.BUFFER_FLAG_FIRST_SAMPLE : i11 | 64;
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, i11);
            if (packageInfo != null) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo != null) {
                    jSONObject.put("appName", packageManager.getApplicationLabel(applicationInfo));
                    jSONObject.put("minSdkVersion", applicationInfo.minSdkVersion);
                    jSONObject.put("targetSdkVersion", applicationInfo.targetSdkVersion);
                    if ((applicationInfo.flags & 2) != 0) {
                        jSONObject.put("debuggable", true);
                    }
                }
                jSONObject.put("verCode", packageInfo.versionCode);
                jSONObject.put("verName", packageInfo.versionName);
                jSONObject.put("installTime", packageInfo.firstInstallTime);
                jSONObject.put("updateTime", packageInfo.lastUpdateTime);
                if (zM12249b && (strArr = packageInfo.requestedPermissions) != null && strArr.length > 0) {
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str : packageInfo.requestedPermissions) {
                        jSONObject2.put(str, AbstractC6506a3.m12115i(context, str) == 0);
                    }
                    jSONObject.put("permissions", jSONObject2);
                }
                if (zM12249b2) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        SigningInfo signingInfo = packageInfo.signingInfo;
                        jSONArrayM12279m = signingInfo != null ? signingInfo.hasMultipleSigners() ? m12279m(signingInfo.getApkContentsSigners()) : m12279m(signingInfo.getSigningCertificateHistory()) : new JSONArray();
                    } else {
                        jSONArrayM12279m = m12279m(packageInfo.signatures);
                    }
                    jSONObject.put("signatures", jSONArrayM12279m);
                }
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 26 && packageManager.isInstantApp()) {
                jSONObject.put("instantApp", true);
            }
            if (i12 >= 30) {
                m12281o(jSONObject, packageManager.getInstallSourceInfo(packageName).getInitiatingPackageName());
            } else {
                m12281o(jSONObject, packageManager.getInstallerPackageName(packageName));
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: o */
    public static void m12281o(@NonNull JSONObject jSONObject, @Nullable String str) throws JSONException {
        if ("com.android.vending".equals(str)) {
            return;
        }
        jSONObject.put("installerPkgName", String.valueOf(str));
    }

    /* JADX INFO: renamed from: p */
    public static boolean m12282p(@Nullable CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* JADX INFO: renamed from: q */
    public static <T> boolean m12283q(Collection<T> collection) {
        return collection == null || collection.isEmpty();
    }

    /* JADX INFO: renamed from: r */
    public static boolean m12284r(Map<?, ?> map) {
        return map == null || map.size() == 0;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m12285s(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m12286t(JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() == 0;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m12287u(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public static Object m12288v(@Nullable Object obj) {
        return obj == null ? JSONObject.NULL : obj;
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public static String m12289w(@NonNull String str) {
        return m12273g(str, "SHA-1");
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public static String m12290x(@Nullable byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b11 : bArr) {
            byte[] bArr2 = f10950a;
            sb2.append((char) bArr2[(b11 & 255) >>> 4]);
            sb2.append((char) bArr2[b11 & 15]);
        }
        return sb2.toString();
    }

    @NonNull
    /* JADX INFO: renamed from: y */
    public static ExecutorService m12291y() {
        return Executors.newSingleThreadExecutor(new a());
    }

    /* JADX INFO: renamed from: A */
    public static String m12254A(@NonNull String str) {
        if (str.length() > 250) {
            return str.substring(0, 250);
        }
        return str;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m12255B(@NonNull Context context) {
        if (m12270d(AbstractC6506a3.m12110f0(context)) == null) {
            return true;
        }
        return false;
    }

    @NonNull
    /* JADX INFO: renamed from: D */
    public static String m12257D(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "FAILURE";
        }
    }

    @NonNull
    /* JADX INFO: renamed from: F */
    public static String m12259F() {
        try {
            return TimeZone.getDefault().getDisplayName();
        } catch (Exception unused) {
            return "FAILURE";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m12267a() {
        return UUID.randomUUID().toString();
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static String m12273g(@NonNull String str, @NonNull String str2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            byte[] bytes = str.getBytes("UTF-8");
            messageDigest.update(bytes, 0, bytes.length);
            return m12290x(messageDigest.digest());
        } catch (Throwable unused) {
            return null;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public static String m12274h(@NonNull String str, @NonNull JSONObject jSONObject) {
        try {
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                builderBuildUpon.appendQueryParameter(next, jSONObject.getString(next));
            }
            return builderBuildUpon.build().toString();
        } catch (Exception unused) {
            AbstractC6524c3.m12212d();
            return str;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: z */
    public static String m12292z() {
        Date time = Calendar.getInstance().getTime();
        try {
            return DateFormat.getDateTimeInstance(0, 0).format(time);
        } catch (AssertionError | Exception unused) {
            return time.toString() + "(FAILURE)";
        }
    }
}
