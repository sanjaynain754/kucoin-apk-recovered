package w90;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: w90.i */
/* JADX INFO: compiled from: Logger.java */
/* JADX INFO: loaded from: classes59.dex */
public class C45770i {

    /* JADX INFO: renamed from: b */
    public static int f103201b;

    /* JADX INFO: renamed from: a */
    public final String f103202a;

    /* JADX INFO: renamed from: a */
    public void m101064a(String str) {
        m101065b(str, null);
    }

    /* JADX INFO: renamed from: b */
    public void m101065b(String str, @Nullable Throwable th2) {
        m101068e(3, str, th2);
    }

    /* JADX INFO: renamed from: c */
    public void m101066c(String str) {
        m101067d(str, null);
    }

    /* JADX INFO: renamed from: d */
    public void m101067d(String str, @Nullable Throwable th2) {
        m101068e(1, str, th2);
    }

    /* JADX INFO: renamed from: h */
    public void m101070h(String str) {
        m101071i(str, null);
    }

    /* JADX INFO: renamed from: i */
    public void m101071i(String str, @Nullable Throwable th2) {
        m101068e(0, str, th2);
    }

    /* JADX INFO: renamed from: j */
    public void m101072j(String str) {
        m101073k(str, null);
    }

    /* JADX INFO: renamed from: k */
    public void m101073k(String str, @Nullable Throwable th2) {
        m101068e(2, str, th2);
    }

    /* JADX INFO: renamed from: f */
    public static void m101063f(int i11) {
        f103201b = i11;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m101069g(int i11) {
        return f103201b <= i11;
    }

    public C45770i(@NonNull String str) {
        this.f103202a = str;
    }

    /* JADX INFO: renamed from: e */
    public final void m101068e(int i11, String str, @Nullable Throwable th2) {
        if (m101069g(i11)) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return;
                        }
                        Log.e(this.f103202a, str, th2);
                        return;
                    }
                    Log.w(this.f103202a, str, th2);
                    return;
                }
                Log.i(this.f103202a, str, th2);
                return;
            }
            Log.v(this.f103202a, str, th2);
        }
    }
}
