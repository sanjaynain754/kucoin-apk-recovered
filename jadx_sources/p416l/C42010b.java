package p416l;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;

/* JADX INFO: renamed from: l.b */
/* JADX INFO: loaded from: classes23.dex */
public class C42010b {

    /* JADX INFO: renamed from: a */
    public final Context f92209a;

    /* JADX INFO: renamed from: c */
    public String m92098c() {
        String string;
        try {
            string = this.f92209a.getResources().getString(this.f92209a.getPackageManager().getPackageInfo(this.f92209a.getPackageName(), 0).applicationInfo.labelRes);
        } catch (Exception unused) {
            string = null;
        }
        if (string != null) {
            return string;
        }
        PackageManager packageManager = this.f92209a.getPackageManager();
        try {
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f92209a.getPackageName(), 0));
        } catch (Exception unused2) {
            return string;
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m92096a(long j11) {
        return j11 / 1024;
    }

    /* JADX INFO: renamed from: b */
    public String m92097b() {
        return "";
    }

    /* JADX INFO: renamed from: d */
    public int m92099d() {
        try {
            return this.f92209a.getPackageManager().getPackageInfo(this.f92209a.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: e */
    public String m92100e() {
        try {
            return this.f92209a.getPackageManager().getPackageInfo(this.f92209a.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public String m92101f() {
        return Build.BRAND;
    }

    /* JADX INFO: renamed from: g */
    public String m92102g() {
        return Build.CPU_ABI;
    }

    /* JADX INFO: renamed from: h */
    public String m92103h() {
        return Build.CPU_ABI2;
    }

    /* JADX INFO: renamed from: j */
    public String m92105j() {
        return Build.MODEL;
    }

    /* JADX INFO: renamed from: k */
    public String m92106k() {
        return Build.HARDWARE;
    }

    /* JADX INFO: renamed from: l */
    public String m92107l() {
        return "";
    }

    /* JADX INFO: renamed from: m */
    public String m92108m() {
        return Build.MANUFACTURER;
    }

    /* JADX INFO: renamed from: n */
    public int m92109n() {
        return Build.VERSION.SDK_INT;
    }

    /* JADX INFO: renamed from: o */
    public long m92110o() {
        try {
            ActivityManager activityManager = (ActivityManager) this.f92209a.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return m92096a(memoryInfo.totalMem);
        } catch (Exception unused) {
            return -1L;
        }
    }

    public C42010b(Context context) {
        this.f92209a = context;
    }

    /* JADX INFO: renamed from: i */
    public int m92104i() {
        return Runtime.getRuntime().availableProcessors();
    }

    /* JADX INFO: renamed from: p */
    public long m92111p() {
        return Environment.getDataDirectory().getTotalSpace();
    }

    /* JADX INFO: renamed from: q */
    public long m92112q() {
        return SystemClock.uptimeMillis();
    }
}
