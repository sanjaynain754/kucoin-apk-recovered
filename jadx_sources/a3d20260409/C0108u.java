package a3d20260409;

import aai.liveness.Detector$DetectionFailedType;
import android.content.Context;
import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: renamed from: a3d20260409.u */
/* JADX INFO: loaded from: classes23.dex */
public class C0108u {
    /* JADX INFO: renamed from: a */
    public static void m501a(Detector$DetectionFailedType detector$DetectionFailedType) {
        j3d20260409.O0ooooo00o00ooOo(detector$DetectionFailedType.name());
    }

    /* JADX INFO: renamed from: b */
    public static void m502b(intl.OOOoooooo oOOoooooo) {
        j3d20260409.O0ooooo00o00ooOo(oOOoooooo.name());
    }

    /* JADX INFO: renamed from: c */
    public static void m503c(String str) {
        j3d20260409.O0ooooo00o00ooOo(str);
    }

    /* JADX INFO: renamed from: d */
    public static void m504d() {
        j3d20260409.O0ooC();
    }

    /* JADX INFO: renamed from: e */
    public static String m505e() {
        return j3d20260409.O0ooooo00o00ooO();
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static String m506f() {
        return j3d20260409.O0ooooo00o00ooOO0();
    }

    /* JADX INFO: renamed from: g */
    public static String m507g() {
        return j3d20260409.O00000();
    }

    /* JADX INFO: renamed from: h */
    public static String m508h() {
        return j3d20260409.O0ooooo00o00oo();
    }

    /* JADX INFO: renamed from: i */
    public static File m509i(Context context) {
        String strM521J = C0109v.m521J();
        if (strM521J != null && context != null) {
            File file = new File(context.getFilesDir() + File.separator + strM521J);
            if (file.exists()) {
                return file;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m510j() {
        return j3d20260409.O0ooooo00o00ooo();
    }

    /* JADX INFO: renamed from: k */
    public static void m511k(String str) {
        j3d20260409.O0ooooo00o00ooOO(str);
    }
}
