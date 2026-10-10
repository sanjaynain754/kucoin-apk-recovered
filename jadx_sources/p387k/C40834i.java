package p387k;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* JADX INFO: renamed from: k.i */
/* JADX INFO: loaded from: classes23.dex */
public class C40834i {

    /* JADX INFO: renamed from: a */
    public static int f90706a;

    /* JADX INFO: renamed from: b */
    public static int f90707b;

    /* JADX INFO: renamed from: c */
    public static int f90708c;

    /* JADX INFO: renamed from: d */
    public static int f90709d;

    /* JADX INFO: renamed from: e */
    public static int f90710e;

    /* JADX INFO: renamed from: f */
    public static float f90711f;

    /* JADX INFO: renamed from: g */
    public static float f90712g;

    /* JADX INFO: renamed from: h */
    public static float f90713h;

    /* JADX INFO: renamed from: i */
    public static float f90714i;

    /* JADX INFO: renamed from: j */
    public static float f90715j;

    /* JADX INFO: renamed from: k */
    public static float f90716k;

    /* JADX INFO: renamed from: l */
    public static float f90717l;

    /* JADX INFO: renamed from: m */
    public static float f90718m;

    /* JADX INFO: renamed from: a */
    public static void m89366a(Context context) {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float f11 = displayMetrics.density;
        f90712g = f11;
        f90706a = (int) (35.0f * f11);
        int i11 = displayMetrics.widthPixels;
        f90709d = i11;
        int i12 = displayMetrics.heightPixels;
        f90710e = i12;
        f90707b = i11;
        f90708c = i12;
        f90711f = displayMetrics.densityDpi;
        float f12 = 30.0f * f11;
        f90715j = f12;
        f90716k = f12;
        float f13 = 50.0f * f11;
        f90717l = f13;
        float f14 = f11 * 40.0f;
        f90718m = f14;
        f90713h = (i11 - f12) - f12;
        f90714i = (i12 - f13) - f14;
    }
}
