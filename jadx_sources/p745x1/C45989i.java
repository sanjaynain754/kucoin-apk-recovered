package p745x1;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: renamed from: x1.i */
/* JADX INFO: compiled from: MemorySizeCalculator.java */
/* JADX INFO: loaded from: classes.dex */
public final class C45989i {

    /* JADX INFO: renamed from: a */
    public final int f103451a;

    /* JADX INFO: renamed from: b */
    public final int f103452b;

    /* JADX INFO: renamed from: c */
    public final Context f103453c;

    /* JADX INFO: renamed from: d */
    public final int f103454d;

    /* JADX INFO: renamed from: x1.i$a */
    /* JADX INFO: compiled from: MemorySizeCalculator.java */
    public static final class a {

        /* JADX INFO: renamed from: i */
        public static final int f103455i;

        /* JADX INFO: renamed from: a */
        public final Context f103456a;

        /* JADX INFO: renamed from: b */
        public ActivityManager f103457b;

        /* JADX INFO: renamed from: c */
        public c f103458c;

        /* JADX INFO: renamed from: e */
        public float f103460e;

        /* JADX INFO: renamed from: d */
        public float f103459d = 2.0f;

        /* JADX INFO: renamed from: f */
        public float f103461f = 0.4f;

        /* JADX INFO: renamed from: g */
        public float f103462g = 0.33f;

        /* JADX INFO: renamed from: h */
        public int f103463h = 4194304;

        static {
            f103455i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        /* JADX INFO: renamed from: a */
        public C45989i m101460a() {
            return new C45989i(this);
        }

        public a(Context context) {
            this.f103460e = f103455i;
            this.f103456a = context;
            this.f103457b = (ActivityManager) context.getSystemService("activity");
            this.f103458c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && C45989i.m101455e(this.f103457b)) {
                this.f103460e = 0.0f;
            }
        }
    }

    /* JADX INFO: renamed from: x1.i$b */
    /* JADX INFO: compiled from: MemorySizeCalculator.java */
    public static final class b implements c {

        /* JADX INFO: renamed from: a */
        public final DisplayMetrics f103464a;

        @Override // p745x1.C45989i.c
        /* JADX INFO: renamed from: a */
        public int mo101461a() {
            return this.f103464a.heightPixels;
        }

        @Override // p745x1.C45989i.c
        /* JADX INFO: renamed from: b */
        public int mo101462b() {
            return this.f103464a.widthPixels;
        }

        public b(DisplayMetrics displayMetrics) {
            this.f103464a = displayMetrics;
        }
    }

    /* JADX INFO: renamed from: x1.i$c */
    /* JADX INFO: compiled from: MemorySizeCalculator.java */
    public interface c {
        /* JADX INFO: renamed from: a */
        int mo101461a();

        /* JADX INFO: renamed from: b */
        int mo101462b();
    }

    /* JADX INFO: renamed from: a */
    public int m101456a() {
        return this.f103454d;
    }

    /* JADX INFO: renamed from: b */
    public int m101457b() {
        return this.f103451a;
    }

    /* JADX INFO: renamed from: d */
    public int m101458d() {
        return this.f103452b;
    }

    /* JADX INFO: renamed from: f */
    public final String m101459f(int i11) {
        return Formatter.formatFileSize(this.f103453c, i11);
    }

    public C45989i(a aVar) {
        int i11;
        boolean z11;
        this.f103453c = aVar.f103456a;
        if (m101455e(aVar.f103457b)) {
            i11 = aVar.f103463h / 2;
        } else {
            i11 = aVar.f103463h;
        }
        this.f103454d = i11;
        int iM101454c = m101454c(aVar.f103457b, aVar.f103461f, aVar.f103462g);
        float fMo101462b = aVar.f103458c.mo101462b() * aVar.f103458c.mo101461a() * 4;
        int iRound = Math.round(aVar.f103460e * fMo101462b);
        int iRound2 = Math.round(fMo101462b * aVar.f103459d);
        int i12 = iM101454c - i11;
        int i13 = iRound2 + iRound;
        if (i13 <= i12) {
            this.f103452b = iRound2;
            this.f103451a = iRound;
        } else {
            float f11 = i12;
            float f12 = aVar.f103460e;
            float f13 = aVar.f103459d;
            float f14 = f11 / (f12 + f13);
            this.f103452b = Math.round(f13 * f14);
            this.f103451a = Math.round(f14 * aVar.f103460e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculation complete, Calculated memory cache size: ");
            sb2.append(m101459f(this.f103452b));
            sb2.append(", pool size: ");
            sb2.append(m101459f(this.f103451a));
            sb2.append(", byte array size: ");
            sb2.append(m101459f(i11));
            sb2.append(", memory class limited? ");
            if (i13 > iM101454c) {
                z11 = true;
            } else {
                z11 = false;
            }
            sb2.append(z11);
            sb2.append(", max size: ");
            sb2.append(m101459f(iM101454c));
            sb2.append(", memoryClass: ");
            sb2.append(aVar.f103457b.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(m101455e(aVar.f103457b));
            Log.d("MemorySizeCalculator", sb2.toString());
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m101454c(ActivityManager activityManager, float f11, float f12) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (m101455e(activityManager)) {
            f11 = f12;
        }
        return Math.round(memoryClass * f11);
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: e */
    public static boolean m101455e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }
}
