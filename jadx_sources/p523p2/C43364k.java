package p523p2;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import p817z1.InterfaceC46633l;

/* JADX INFO: renamed from: p2.k */
/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes.dex */
public final class C43364k {

    /* JADX INFO: renamed from: a */
    public static final char[] f95762a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: b */
    public static final char[] f95763b = new char[64];

    /* JADX INFO: renamed from: c */
    @Nullable
    public static volatile Handler f95764c;

    @NonNull
    /* JADX INFO: renamed from: e */
    public static String m95512e(@NonNull byte[] bArr, @NonNull char[] cArr) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte b11 = bArr[i11];
            int i12 = i11 * 2;
            char[] cArr2 = f95762a;
            cArr[i12] = cArr2[(b11 & 255) >>> 4];
            cArr[i12 + 1] = cArr2[b11 & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: g */
    public static int m95514g(int i11, int i12, @Nullable Bitmap.Config config) {
        return i11 * i12 * m95516i(config);
    }

    /* JADX INFO: renamed from: p2.k$a */
    /* JADX INFO: compiled from: Util.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f95765a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f95765a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f95765a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f95765a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f95765a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f95765a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m95510c(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj instanceof InterfaceC46633l ? ((InterfaceC46633l) obj).m102841a(obj2) : obj.equals(obj2);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m95511d(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static <T> Queue<T> m95513f(int i11) {
        return new ArrayDeque(i11);
    }

    /* JADX INFO: renamed from: i */
    public static int m95516i(@Nullable Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i11 = a.f95765a[config.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2 && i11 != 3) {
                return i11 != 4 ? 4 : 8;
            }
        }
        return i12;
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public static <T> List<T> m95517j(@NonNull Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t11 : collection) {
            if (t11 != null) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public static Handler m95518k() {
        if (f95764c == null) {
            synchronized (C43364k.class) {
                try {
                    if (f95764c == null) {
                        f95764c = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f95764c;
    }

    /* JADX INFO: renamed from: l */
    public static int m95519l(float f11) {
        return m95520m(f11, 17);
    }

    /* JADX INFO: renamed from: n */
    public static int m95521n(int i11) {
        return m95522o(i11, 17);
    }

    /* JADX INFO: renamed from: o */
    public static int m95522o(int i11, int i12) {
        return (i12 * 31) + i11;
    }

    /* JADX INFO: renamed from: p */
    public static int m95523p(@Nullable Object obj, int i11) {
        return m95522o(obj == null ? 0 : obj.hashCode(), i11);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m95527t(int i11) {
        return i11 > 0 || i11 == Integer.MIN_VALUE;
    }

    @NonNull
    /* JADX INFO: renamed from: x */
    public static String m95531x(@NonNull byte[] bArr) {
        String strM95512e;
        char[] cArr = f95763b;
        synchronized (cArr) {
            strM95512e = m95512e(bArr, cArr);
        }
        return strM95512e;
    }

    /* JADX INFO: renamed from: a */
    public static void m95508a() {
        if (m95525r()) {
        } else {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m95509b() {
        if (m95526s()) {
        } else {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: h */
    public static int m95515h(@NonNull Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* JADX INFO: renamed from: m */
    public static int m95520m(float f11, int i11) {
        return m95522o(Float.floatToIntBits(f11), i11);
    }

    /* JADX INFO: renamed from: q */
    public static int m95524q(boolean z11, int i11) {
        return m95522o(z11 ? 1 : 0, i11);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m95525r() {
        return !m95526s();
    }

    /* JADX INFO: renamed from: s */
    public static boolean m95526s() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m95528u(int i11, int i12) {
        if (m95527t(i11) && m95527t(i12)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public static void m95529v(Runnable runnable) {
        m95518k().post(runnable);
    }

    /* JADX INFO: renamed from: w */
    public static void m95530w(Runnable runnable) {
        m95518k().removeCallbacks(runnable);
    }
}
