package p795yf;

import android.os.Build;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: yf.j */
/* JADX INFO: compiled from: RootUtil.java */
/* JADX INFO: loaded from: classes.dex */
public class C46484j {
    /* JADX INFO: renamed from: c */
    public static boolean m102553c() {
        Process processExec = null;
        try {
            processExec = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", CmcdConfiguration.KEY_STARTUP});
            boolean z11 = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null;
            processExec.destroy();
            return z11;
        } catch (Throwable unused) {
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m102551a() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m102552b() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i11 = 0; i11 < 10; i11++) {
            if (new File(strArr[i11]).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m102554d() {
        if (!m102551a() && !m102552b() && !m102553c()) {
            return false;
        }
        return true;
    }
}
