package a3d20260409;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.WindowManager;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import org.json.JSONObject;
import p387k.C40832g;
import p416l.C42010b;
import p442m.C42337g;
import we0.C45819f;

/* JADX INFO: renamed from: a3d20260409.t */
/* JADX INFO: loaded from: classes23.dex */
public class C0107t {
    /* JADX INFO: renamed from: d */
    public static String m498d(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            C42010b c42010b = new C42010b(context);
            C40832g.m89354i(jSONObject, m499e("109 97 110 117 102 97 99 116 117 114 101 114"), c42010b.m92108m());
            C40832g.m89354i(jSONObject, m499e("99 112 117 67 111 114 101 78 117 109 98 101 114"), Integer.valueOf(c42010b.m92104i()));
            C40832g.m89354i(jSONObject, m499e("104 97 114 100 119 97 114 101"), c42010b.m92106k());
            C40832g.m89354i(jSONObject, m499e("98 114 97 110 100"), c42010b.m92101f());
            C40832g.m89354i(jSONObject, m499e("99 112 117 65 66 73"), c42010b.m92102g());
            C40832g.m89354i(jSONObject, m499e("99 112 117 65 66 73 50"), c42010b.m92103h());
            C40832g.m89354i(jSONObject, m499e("109 111 100 101 108"), c42010b.m92105j());
            C40832g.m89354i(jSONObject, m499e("115 99 114 101 101 110 87 105 100 116 104"), m500f(context).first);
            C40832g.m89354i(jSONObject, m499e("115 99 114 101 101 110 72 101 105 103 104 116"), m500f(context).second);
            C40832g.m89354i(jSONObject, m499e("100 105 115 107 84 111 116 97 108 83 105 122 101"), Long.valueOf(c42010b.m92111p()));
            C40832g.m89354i(jSONObject, m499e("98 111 111 116 84 105 109 101"), Long.valueOf(m496b()));
            C40832g.m89354i(jSONObject, m499e("117 112 84 105 109 101"), Long.valueOf(c42010b.m92112q()));
            C40832g.m89354i(jSONObject, m499e("97 112 112 76 97 115 116 85 112 100 97 116 101 84 105 109 101"), Long.valueOf(m495a(context)));
            C40832g.m89354i(jSONObject, m499e("97 112 112 73 110 115 116 97 108 108 84 105 109 101"), Long.valueOf(m497c(context)));
            C40832g.m89354i(jSONObject, m499e("105 109 101 105 65 110 100 114 111 105 100"), c42010b.m92107l());
            C40832g.m89354i(jSONObject, m499e("116 101 110 97 110 116 73 100"), context.getPackageName());
            C40832g.m89354i(jSONObject, m499e("108 111 99 97 108 68 101 118 105 99 101 73 100"), str);
            C40832g.m89354i(jSONObject, m499e("119 105 102 105 77 97 99"), C42337g.m92905b(context));
            C40832g.m89354i(jSONObject, m499e("105 112 118 54 87 105 102 105 77 97 99"), C42337g.m92908e(context));
            C40832g.m89354i(jSONObject, m499e("105 112 118 54 77 111 98 105 108 101 77 97 99"), C42337g.m92906c(context));
            C40832g.m89354i(jSONObject, m499e("97 110 100 114 111 105 100 73 100"), c42010b.m92097b());
            C40832g.m89354i(jSONObject, m499e("97 112 112 73 100"), context.getPackageName());
            C40832g.m89354i(jSONObject, m499e("97 112 112 86 101 114 115 105 111 110"), c42010b.m92100e());
        } catch (Exception e11) {
            C45819f.m101227J().m83492H(e11);
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: e */
    public static String m499e(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : str.split(C33627eb.f69716f)) {
            sb2.append((char) Integer.parseInt(str2));
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: a */
    public static long m495a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m496b() {
        return System.currentTimeMillis() - (SystemClock.elapsedRealtimeNanos() / 1000000);
    }

    /* JADX INFO: renamed from: c */
    public static long m497c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: f */
    public static Pair<Integer, Integer> m500f(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(InterfaceC33953u5.f72199F);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return new Pair<>(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
    }
}
