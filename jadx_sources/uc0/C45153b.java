package uc0;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.credentials.provider.CredentialEntry;
import cn.jiguang.privates.push.constants.JPushConstants;

/* JADX INFO: renamed from: uc0.b */
/* JADX INFO: compiled from: TUIBuild.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C45153b {

    /* JADX INFO: renamed from: a */
    public static String f101599a = "";

    /* JADX INFO: renamed from: b */
    public static String f101600b = "";

    /* JADX INFO: renamed from: c */
    public static int f101601c;

    /* JADX INFO: renamed from: g */
    public static boolean m99807g() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return "harmony".equals(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]));
        } catch (Exception unused) {
            Log.e("TUIBuild", "the phone not support the harmonyOS");
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m99801a() {
        String str = f101599a;
        if (str == null || str.isEmpty()) {
            synchronized (C45153b.class) {
                try {
                    String str2 = f101599a;
                    if (str2 == null || str2.isEmpty()) {
                        f101599a = Build.BRAND;
                        Log.i("TUIBuild", "get BRAND by Build.BRAND :" + f101599a);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f101599a;
    }

    /* JADX INFO: renamed from: b */
    public static String m99802b() {
        String str = f101600b;
        if (str == null || str.isEmpty()) {
            synchronized (C45153b.class) {
                try {
                    String str2 = f101600b;
                    if (str2 == null || str2.isEmpty()) {
                        f101600b = Build.MANUFACTURER;
                        Log.i("TUIBuild", "get MANUFACTURER by Build.MANUFACTURER :" + f101600b);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f101600b;
    }

    /* JADX INFO: renamed from: c */
    public static int m99803c() {
        if (f101601c == 0) {
            synchronized (C45153b.class) {
                try {
                    if (f101601c == 0) {
                        f101601c = Build.VERSION.SDK_INT;
                        Log.i("TUIBuild", "get VERSION_INT by Build.VERSION.SDK_INT :" + f101601c);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f101601c;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m99808h() {
        try {
            Class<?> cls = Class.forName("android.os.systemProperties");
            String str = (String) cls.getDeclaredMethod("get", String.class, String.class).invoke(cls, "persist.sys.miuiOptimization", "");
            return CredentialEntry.TRUE_STRING.equals(str) | TextUtils.isEmpty(str);
        } catch (Exception unused) {
            Log.e("TUIBuild", "the phone not support the miui optimization");
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m99804d() {
        if (!JPushConstants.Manufacturer.HUAWEI.equalsIgnoreCase(m99801a()) && !JPushConstants.Manufacturer.HUAWEI.equalsIgnoreCase(m99802b()) && !JPushConstants.Manufacturer.HONOR.equalsIgnoreCase(m99801a())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m99805e() {
        if (!JPushConstants.Manufacturer.VIVO.equalsIgnoreCase(m99801a()) && !JPushConstants.Manufacturer.VIVO.equalsIgnoreCase(m99802b())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m99806f() {
        if (!JPushConstants.Manufacturer.XIAOMI.equalsIgnoreCase(m99801a()) && !JPushConstants.Manufacturer.XIAOMI.equalsIgnoreCase(m99802b())) {
            return false;
        }
        return true;
    }
}
