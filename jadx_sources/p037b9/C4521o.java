package p037b9;

import android.os.Looper;

/* JADX INFO: renamed from: b9.o */
/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes56.dex */
public class C4521o {
    /* JADX INFO: renamed from: a */
    public static void m4363a() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
        } else {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }
}
