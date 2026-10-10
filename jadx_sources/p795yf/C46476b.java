package p795yf;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.tencent.bugly.proguard.C33627eb;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;

/* JADX INFO: renamed from: yf.b */
/* JADX INFO: compiled from: CheckHook.java */
/* JADX INFO: loaded from: classes13.dex */
public class C46476b {
    /* JADX INFO: renamed from: f */
    public static boolean m102512f(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (Throwable unused) {
            Log.wtf("HookDetection", "isPackageInstalled  has error");
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m102507a(Context context) {
        return m102512f(context, "de.robv.android.xposed.installer") || m102512f(context, "com.saurik.substrate");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m102509c() {
        boolean z11 = false;
        try {
            HashSet<String> hashSet = new HashSet();
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/" + Process.myPid() + "/maps"));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (line.endsWith(".so") || line.endsWith(".jar")) {
                    hashSet.add(line.substring(line.lastIndexOf(C33627eb.f69716f) + 1));
                }
            }
            for (String str : hashSet) {
                if (str.contains("com.saurik.substrate")) {
                    Log.wtf("HookDetection", "Substrate shared object found: " + str);
                    z11 = true;
                }
                if (str.contains("XposedBridge.jar")) {
                    Log.wtf("HookDetection", "Xposed JAR found: " + str);
                    z11 = true;
                }
            }
            bufferedReader.close();
            return z11;
        } catch (Exception e11) {
            Log.wtf("HookDetection", e11.toString());
            return z11;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m102511e(Context context) {
        try {
            throw new Exception("blah");
        } catch (Exception e11) {
            boolean z11 = false;
            int i11 = 0;
            for (StackTraceElement stackTraceElement : e11.getStackTrace()) {
                if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit") && (i11 = i11 + 1) == 2) {
                    Log.wtf("HookDetection", "Substrate is active on the device.");
                    z11 = true;
                }
                if (stackTraceElement.getClassName().equals("com.saurik.substrate.MS$2") && stackTraceElement.getMethodName().equals("invoked")) {
                    Log.wtf("HookDetection", "A method on the stack trace has been hooked using Substrate.");
                    z11 = true;
                }
                if (stackTraceElement.getClassName().equals("de.robv.android.xposed.XposedBridge") && stackTraceElement.getMethodName().equals("main")) {
                    Log.wtf("HookDetection", "Xposed is active on the device.");
                    z11 = true;
                }
                if (stackTraceElement.getClassName().equals("de.robv.android.xposed.XposedBridge") && stackTraceElement.getMethodName().equals("handleHookedMethod")) {
                    Log.wtf("HookDetection", "A method on the stack trace has been hooked using Xposed.");
                    z11 = true;
                }
            }
            return z11;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m102508b(Context context) {
        if (!m102510d(context) && !m102511e(context) && !m102509c()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m102510d(Context context) {
        return m102507a(context);
    }
}
