package fi0;

import android.app.Application;
import android.content.Context;
import android.media.MediaDrm;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.text.TextUtils;
import gi0.C37961l;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.UUID;
import third.sdk.oaid.OAIDException;

/* JADX INFO: renamed from: fi0.a */
/* JADX INFO: compiled from: DeviceID.java */
/* JADX INFO: loaded from: classes61.dex */
public final class C37501a implements InterfaceC37503c {

    /* JADX INFO: renamed from: a */
    public Application f83193a;

    /* JADX INFO: renamed from: b */
    public String f83194b;

    /* JADX INFO: renamed from: c */
    public String f83195c;

    /* JADX INFO: renamed from: fi0.a$b */
    /* JADX INFO: compiled from: DeviceID.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final C37501a f83196a = new C37501a();
    }

    public C37501a() {
    }

    /* JADX INFO: renamed from: c */
    public static String m84430c(Context context) {
        String string;
        return (context == null || (string = Settings.Secure.getString(context.getContentResolver(), "android_id")) == null || "9774d56d682e549c".equals(string)) ? "" : string;
    }

    /* JADX INFO: renamed from: e */
    public static File m84432e(Context context) {
        if (Build.VERSION.SDK_INT < 30 && context != null && context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0 && "mounted".equals(Environment.getExternalStorageState())) {
            return new File(Environment.getExternalStorageDirectory(), "Android/.GUID_uuid");
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static String m84433f() {
        String str = b.f83196a.f83195c;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: h */
    public static String m84435h() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.BOARD.length() % 10);
        sb2.append(Arrays.deepToString(Build.SUPPORTED_ABIS).length() % 10);
        sb2.append(Build.DEVICE.length() % 10);
        sb2.append(Build.DISPLAY.length() % 10);
        sb2.append(Build.HOST.length() % 10);
        sb2.append(Build.ID.length() % 10);
        sb2.append(Build.MANUFACTURER.length() % 10);
        sb2.append(Build.BRAND.length() % 10);
        sb2.append(Build.MODEL.length() % 10);
        sb2.append(Build.PRODUCT.length() % 10);
        sb2.append(Build.BOOTLOADER.length() % 10);
        sb2.append(Build.HARDWARE.length() % 10);
        sb2.append(Build.TAGS.length() % 10);
        sb2.append(Build.TYPE.length() % 10);
        sb2.append(Build.USER.length() % 10);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m84436i(Context context) {
        String line = "";
        if (context == null) {
            return "";
        }
        File fileM84432e = m84432e(context);
        if (fileM84432e != null) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(fileM84432e));
                try {
                    line = bufferedReader.readLine();
                    bufferedReader.close();
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Exception e11) {
                C37505e.m84453a(e11);
            }
        }
        C37505e.m84453a("Get uuid from external storage: " + line);
        return line;
    }

    /* JADX INFO: renamed from: j */
    public static String m84437j(Context context) {
        if (context == null) {
            return "";
        }
        String string = context.getSharedPreferences("GUID", 0).getString("uuid", "");
        C37505e.m84453a("Get uuid from shared preferences: " + string);
        return string;
    }

    /* JADX INFO: renamed from: k */
    public static String m84438k(Context context) {
        if (context == null) {
            return "";
        }
        String string = Settings.System.getString(context.getContentResolver(), "GUID_uuid");
        C37505e.m84453a("Get uuid from system settings: " + string);
        return string;
    }

    /* JADX INFO: renamed from: l */
    public static String m84439l() {
        try {
            byte[] propertyByteArray = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L)).getPropertyByteArray("deviceUniqueId");
            if (propertyByteArray == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : propertyByteArray) {
                sb2.append(String.format("%02x", Byte.valueOf(b11)));
            }
            return sb2.toString();
        } catch (Error e11) {
            C37505e.m84453a(e11);
            return "";
        } catch (Exception e12) {
            C37505e.m84453a(e12);
            return "";
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m84440m(Context context, String str) {
        if (context == null) {
            return;
        }
        File fileM84432e = m84432e(context);
        if (fileM84432e == null) {
            C37505e.m84453a("UUID file in external storage is null");
            return;
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileM84432e));
            try {
                if (!fileM84432e.exists()) {
                    fileM84432e.createNewFile();
                }
                bufferedWriter.write(str);
                bufferedWriter.flush();
                C37505e.m84453a("Save uuid to external storage: " + str);
                bufferedWriter.close();
            } catch (Throwable th2) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Exception e11) {
            C37505e.m84453a(e11);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m84441n(Context context, String str) {
        if (context == null) {
            return;
        }
        context.getSharedPreferences("GUID", 0).edit().putString("uuid", str).apply();
        C37505e.m84453a("Save uuid to shared preferences: " + str);
    }

    /* JADX INFO: renamed from: o */
    public static void m84442o(Context context, String str) {
        if (context == null) {
            return;
        }
        if (!Settings.System.canWrite(context)) {
            C37505e.m84453a("android.permission.WRITE_SETTINGS not granted");
            return;
        }
        try {
            Settings.System.putString(context.getContentResolver(), "GUID_uuid", str);
            C37505e.m84453a("Save uuid to system settings: " + str);
        } catch (Exception e11) {
            C37505e.m84453a(e11);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m84431d(Context context) {
        String strM84438k = m84438k(context);
        if (TextUtils.isEmpty(strM84438k)) {
            strM84438k = m84436i(context);
        }
        if (TextUtils.isEmpty(strM84438k)) {
            strM84438k = m84437j(context);
        }
        if (TextUtils.isEmpty(strM84438k)) {
            String string = UUID.randomUUID().toString();
            C37505e.m84453a("Generate uuid by random: " + string);
            m84441n(context, string);
            m84442o(context, string);
            m84440m(context, string);
            return string;
        }
        return strM84438k;
    }

    /* JADX INFO: renamed from: g */
    public static void m84434g(Context context, InterfaceC37503c interfaceC37503c) {
        C37961l.m85801a(context).mo84452b(interfaceC37503c);
    }

    @Override // fi0.InterfaceC37503c
    /* JADX INFO: renamed from: a */
    public void mo84443a(String str) {
        if (TextUtils.isEmpty(str)) {
            mo84444b(new OAIDException("OAID is empty"));
            return;
        }
        this.f83194b = str;
        this.f83195c = str;
        C37505e.m84453a("Client id is OAID/AAID: " + this.f83194b);
    }

    @Override // fi0.InterfaceC37503c
    /* JADX INFO: renamed from: b */
    public void mo84444b(Exception exc) {
        String strM84439l = m84439l();
        if (!TextUtils.isEmpty(strM84439l)) {
            this.f83194b = strM84439l;
            C37505e.m84453a("Client id is WidevineID: " + this.f83194b);
            return;
        }
        String strM84430c = m84430c(this.f83193a);
        if (!TextUtils.isEmpty(strM84430c)) {
            this.f83194b = strM84430c;
            C37505e.m84453a("Client id is AndroidID: " + this.f83194b);
            return;
        }
        this.f83194b = m84431d(this.f83193a);
        C37505e.m84453a("Client id is GUID: " + this.f83194b);
    }
}
