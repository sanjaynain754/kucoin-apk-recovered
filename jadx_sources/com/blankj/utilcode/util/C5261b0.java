package com.blankj.utilcode.util;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import cn.jiguang.privates.push.constants.JPushConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/* JADX INFO: renamed from: com.blankj.utilcode.util.b0 */
/* JADX INFO: compiled from: RomUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5261b0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f6487a = {JPushConstants.Manufacturer.HUAWEI};

    /* JADX INFO: renamed from: b */
    public static final String[] f6488b = {JPushConstants.Manufacturer.VIVO};

    /* JADX INFO: renamed from: c */
    public static final String[] f6489c = {JPushConstants.Manufacturer.XIAOMI};

    /* JADX INFO: renamed from: d */
    public static final String[] f6490d = {JPushConstants.Manufacturer.OPPO};

    /* JADX INFO: renamed from: e */
    public static final String[] f6491e = {"leeco", "letv"};

    /* JADX INFO: renamed from: f */
    public static final String[] f6492f = {"360", "qiku"};

    /* JADX INFO: renamed from: g */
    public static final String[] f6493g = {"zte"};

    /* JADX INFO: renamed from: h */
    public static final String[] f6494h = {JPushConstants.Manufacturer.ONEPLUS};

    /* JADX INFO: renamed from: i */
    public static final String[] f6495i = {"nubia"};

    /* JADX INFO: renamed from: j */
    public static final String[] f6496j = {"coolpad", "yulong"};

    /* JADX INFO: renamed from: k */
    public static final String[] f6497k = {"lg", "lge"};

    /* JADX INFO: renamed from: l */
    public static final String[] f6498l = {"google"};

    /* JADX INFO: renamed from: m */
    public static final String[] f6499m = {"samsung"};

    /* JADX INFO: renamed from: n */
    public static final String[] f6500n = {JPushConstants.Manufacturer.MEIZU};

    /* JADX INFO: renamed from: o */
    public static final String[] f6501o = {"lenovo"};

    /* JADX INFO: renamed from: p */
    public static final String[] f6502p = {"smartisan"};

    /* JADX INFO: renamed from: q */
    public static final String[] f6503q = {"htc"};

    /* JADX INFO: renamed from: r */
    public static final String[] f6504r = {"sony"};

    /* JADX INFO: renamed from: s */
    public static final String[] f6505s = {"gionee", "amigo"};

    /* JADX INFO: renamed from: t */
    public static final String[] f6506t = {"motorola"};

    /* JADX INFO: renamed from: u */
    public static a f6507u = null;

    /* JADX INFO: renamed from: com.blankj.utilcode.util.b0$a */
    /* JADX INFO: compiled from: RomUtils.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f6508a;

        /* JADX INFO: renamed from: b */
        public String f6509b;

        public String toString() {
            return "RomInfo{name=" + this.f6508a + ", version=" + this.f6509b + "}";
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m6146g(String str) throws Throwable {
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
                try {
                    String line = bufferedReader2.readLine();
                    if (line != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException unused) {
                        }
                        return line;
                    }
                    bufferedReader2.close();
                    return "";
                } catch (IOException unused2) {
                    bufferedReader = bufferedReader2;
                    if (bufferedReader == null) {
                        return "";
                    }
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused4) {
                return "";
            }
        } catch (IOException unused5) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m6150k(String str, String str2, String... strArr) {
        for (String str3 : strArr) {
            if (str.contains(str3) || str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static String m6140a() {
        try {
            String str = Build.BRAND;
            return !TextUtils.isEmpty(str) ? str.toLowerCase() : "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m6141b() {
        try {
            String str = Build.MANUFACTURER;
            return !TextUtils.isEmpty(str) ? str.toLowerCase() : "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* JADX INFO: renamed from: c */
    public static a m6142c() throws Throwable {
        a aVar = f6507u;
        if (aVar != null) {
            return aVar;
        }
        f6507u = new a();
        String strM6140a = m6140a();
        String strM6141b = m6141b();
        String[] strArr = f6487a;
        if (m6150k(strM6140a, strM6141b, strArr)) {
            f6507u.f6508a = strArr[0];
            String strM6143d = m6143d("ro.build.version.emui");
            String[] strArrSplit = strM6143d.split("_");
            if (strArrSplit.length > 1) {
                f6507u.f6509b = strArrSplit[1];
            } else {
                f6507u.f6509b = strM6143d;
            }
            return f6507u;
        }
        String[] strArr2 = f6488b;
        if (m6150k(strM6140a, strM6141b, strArr2)) {
            f6507u.f6508a = strArr2[0];
            f6507u.f6509b = m6143d("ro.vivo.os.build.display.id");
            return f6507u;
        }
        String[] strArr3 = f6489c;
        if (m6150k(strM6140a, strM6141b, strArr3)) {
            f6507u.f6508a = strArr3[0];
            f6507u.f6509b = m6143d("ro.build.version.incremental");
            return f6507u;
        }
        String[] strArr4 = f6490d;
        if (m6150k(strM6140a, strM6141b, strArr4)) {
            f6507u.f6508a = strArr4[0];
            f6507u.f6509b = m6143d("ro.build.version.opporom");
            return f6507u;
        }
        String[] strArr5 = f6491e;
        if (m6150k(strM6140a, strM6141b, strArr5)) {
            f6507u.f6508a = strArr5[0];
            f6507u.f6509b = m6143d("ro.letv.release.version");
            return f6507u;
        }
        String[] strArr6 = f6492f;
        if (m6150k(strM6140a, strM6141b, strArr6)) {
            f6507u.f6508a = strArr6[0];
            f6507u.f6509b = m6143d("ro.build.uiversion");
            return f6507u;
        }
        String[] strArr7 = f6493g;
        if (m6150k(strM6140a, strM6141b, strArr7)) {
            f6507u.f6508a = strArr7[0];
            f6507u.f6509b = m6143d("ro.build.MiFavor_version");
            return f6507u;
        }
        String[] strArr8 = f6494h;
        if (m6150k(strM6140a, strM6141b, strArr8)) {
            f6507u.f6508a = strArr8[0];
            f6507u.f6509b = m6143d("ro.rom.version");
            return f6507u;
        }
        String[] strArr9 = f6495i;
        if (m6150k(strM6140a, strM6141b, strArr9)) {
            f6507u.f6508a = strArr9[0];
            f6507u.f6509b = m6143d("ro.build.rom.id");
            return f6507u;
        }
        String[] strArr10 = f6496j;
        if (m6150k(strM6140a, strM6141b, strArr10)) {
            f6507u.f6508a = strArr10[0];
        } else {
            String[] strArr11 = f6497k;
            if (m6150k(strM6140a, strM6141b, strArr11)) {
                f6507u.f6508a = strArr11[0];
            } else {
                String[] strArr12 = f6498l;
                if (m6150k(strM6140a, strM6141b, strArr12)) {
                    f6507u.f6508a = strArr12[0];
                } else {
                    String[] strArr13 = f6499m;
                    if (m6150k(strM6140a, strM6141b, strArr13)) {
                        f6507u.f6508a = strArr13[0];
                    } else {
                        String[] strArr14 = f6500n;
                        if (m6150k(strM6140a, strM6141b, strArr14)) {
                            f6507u.f6508a = strArr14[0];
                        } else {
                            String[] strArr15 = f6501o;
                            if (m6150k(strM6140a, strM6141b, strArr15)) {
                                f6507u.f6508a = strArr15[0];
                            } else {
                                String[] strArr16 = f6502p;
                                if (m6150k(strM6140a, strM6141b, strArr16)) {
                                    f6507u.f6508a = strArr16[0];
                                } else {
                                    String[] strArr17 = f6503q;
                                    if (m6150k(strM6140a, strM6141b, strArr17)) {
                                        f6507u.f6508a = strArr17[0];
                                    } else {
                                        String[] strArr18 = f6504r;
                                        if (m6150k(strM6140a, strM6141b, strArr18)) {
                                            f6507u.f6508a = strArr18[0];
                                        } else {
                                            String[] strArr19 = f6505s;
                                            if (m6150k(strM6140a, strM6141b, strArr19)) {
                                                f6507u.f6508a = strArr19[0];
                                            } else {
                                                String[] strArr20 = f6506t;
                                                if (m6150k(strM6140a, strM6141b, strArr20)) {
                                                    f6507u.f6508a = strArr20[0];
                                                } else {
                                                    f6507u.f6508a = strM6141b;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        f6507u.f6509b = m6143d("");
        return f6507u;
    }

    /* JADX INFO: renamed from: f */
    public static String m6145f(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m6147h(String str) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
            return properties.getProperty(str, "");
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m6148i() {
        return f6487a[0].equals(m6142c().f6508a);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m6149j() {
        return f6500n[0].equals(m6142c().f6508a);
    }

    /* JADX INFO: renamed from: d */
    public static String m6143d(String str) throws Throwable {
        String lowerCase;
        if (!TextUtils.isEmpty(str)) {
            lowerCase = m6144e(str);
        } else {
            lowerCase = "";
        }
        if (TextUtils.isEmpty(lowerCase) || lowerCase.equals("unknown")) {
            try {
                String str2 = Build.DISPLAY;
                if (!TextUtils.isEmpty(str2)) {
                    lowerCase = str2.toLowerCase();
                }
            } catch (Throwable unused) {
            }
        }
        if (TextUtils.isEmpty(lowerCase)) {
            return "unknown";
        }
        return lowerCase;
    }

    /* JADX INFO: renamed from: e */
    public static String m6144e(String str) throws Throwable {
        String strM6146g = m6146g(str);
        if (!TextUtils.isEmpty(strM6146g)) {
            return strM6146g;
        }
        String strM6147h = m6147h(str);
        if (TextUtils.isEmpty(strM6147h) && Build.VERSION.SDK_INT < 28) {
            return m6145f(str);
        }
        return strM6147h;
    }
}
