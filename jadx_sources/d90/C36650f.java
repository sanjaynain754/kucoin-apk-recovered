package d90;

import android.content.Context;
import android.os.Debug;
import android.os.Process;
import com.tencent.bugly.proguard.C33844oi;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* JADX INFO: renamed from: d90.f */
/* JADX INFO: compiled from: SecurityCheckUtil.java */
/* JADX INFO: loaded from: classes23.dex */
public class C36650f {

    /* JADX INFO: renamed from: d90.f$b */
    /* JADX INFO: compiled from: SecurityCheckUtil.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final C36650f f79448a = new C36650f();
    }

    /* JADX INFO: renamed from: h */
    public boolean m82018h() {
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/" + Process.myPid() + "/status"));
            do {
                line = bufferedReader.readLine();
            } while (!line.contains("TracerPid"));
            String strTrim = line.substring(line.indexOf(C33844oi.f71346o) + 1, line.length()).trim();
            bufferedReader.close();
            return !"0".equals(strTrim);
        } catch (Exception unused) {
            return false;
        }
    }

    public C36650f() {
    }

    /* JADX INFO: renamed from: f */
    public final boolean m82016f() {
        String[] strArr = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};
        for (int i11 = 0; i11 < 8; i11++) {
            if (new File(strArr[i11]).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public boolean m82017g() {
        try {
            throw new Exception("gg");
        } catch (Exception e11) {
            for (StackTraceElement stackTraceElement : e11.getStackTrace()) {
                if (stackTraceElement.getClassName().contains("de.robv.android.xposed.XposedBridge")) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C36650f m82011c() {
        return b.f79448a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m82012a(Context context) {
        if ((context.getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public boolean m82013b() {
        return Debug.isDebuggerConnected();
    }

    /* JADX INFO: renamed from: d */
    public final int m82014d() {
        String strM81984b = C36646b.m81981c().m81984b("ro.secure");
        if (strM81984b == null || !"0".equals(strM81984b)) {
            return 1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public boolean m82015e() {
        if (m82014d() == 0) {
            return true;
        }
        return m82016f();
    }
}
