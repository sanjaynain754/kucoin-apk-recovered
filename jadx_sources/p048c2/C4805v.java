package p048c2;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.tencent.bugly.proguard.C33914s6;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: c2.v */
/* JADX INFO: compiled from: HardwareConfigState.java */
/* JADX INFO: loaded from: classes.dex */
public final class C4805v {

    /* JADX INFO: renamed from: g */
    public static final boolean f4818g;

    /* JADX INFO: renamed from: h */
    public static final boolean f4819h;

    /* JADX INFO: renamed from: i */
    public static final File f4820i;

    /* JADX INFO: renamed from: j */
    public static volatile C4805v f4821j;

    /* JADX INFO: renamed from: k */
    public static volatile int f4822k;

    /* JADX INFO: renamed from: b */
    public final int f4824b;

    /* JADX INFO: renamed from: c */
    public final int f4825c;

    /* JADX INFO: renamed from: d */
    @GuardedBy("this")
    public int f4826d;

    /* JADX INFO: renamed from: e */
    @GuardedBy("this")
    public boolean f4827e = true;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f4828f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public final boolean f4823a = m4900f();

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m4905d() {
        try {
            boolean z11 = true;
            int i11 = this.f4826d + 1;
            this.f4826d = i11;
            if (i11 >= 50) {
                this.f4826d = 0;
                int length = f4820i.list().length;
                long jM4904c = m4904c();
                if (length >= jM4904c) {
                    z11 = false;
                }
                this.f4827e = z11;
                if (!z11 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jM4904c);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f4827e;
    }

    /* JADX INFO: renamed from: e */
    public boolean m4906e(int i11, int i12, boolean z11, boolean z12) {
        if (!z11) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!this.f4823a) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by device model");
            }
            return false;
        }
        if (!f4819h) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (m4903a()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z12) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        int i13 = this.f4825c;
        if (i11 < i13) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because width is too small");
            }
            return false;
        }
        if (i12 < i13) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because height is too small");
            }
            return false;
        }
        if (m4905d()) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        f4818g = i11 < 29;
        f4819h = i11 >= 26;
        f4820i = new File(C33914s6.f71831j);
        f4822k = -1;
    }

    /* JADX INFO: renamed from: b */
    public static C4805v m4899b() {
        if (f4821j == null) {
            synchronized (C4805v.class) {
                try {
                    if (f4821j == null) {
                        f4821j = new C4805v();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f4821j;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m4901g() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        Iterator it = Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m4902h() {
        if (Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4903a() {
        return f4818g && !this.f4828f.get();
    }

    /* JADX INFO: renamed from: c */
    public final int m4904c() {
        return f4822k != -1 ? f4822k : this.f4824b;
    }

    @VisibleForTesting
    public C4805v() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4824b = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
            this.f4825c = 0;
        } else {
            this.f4824b = 700;
            this.f4825c = 128;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m4900f() {
        if (!m4901g() && !m4902h()) {
            return true;
        }
        return false;
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: i */
    public boolean m4907i(int i11, int i12, BitmapFactory.Options options, boolean z11, boolean z12) {
        boolean zM4906e = m4906e(i11, i12, z11, z12);
        if (zM4906e) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zM4906e;
    }
}
