package p484o1;

import android.util.Log;
import com.airbnb.lottie.C5072d;
import com.airbnb.lottie.InterfaceC5087k0;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: o1.e */
/* JADX INFO: compiled from: LogcatLogger.java */
/* JADX INFO: loaded from: classes.dex */
public class C42923e implements InterfaceC5087k0 {

    /* JADX INFO: renamed from: a */
    public static final Set<String> f95026a = new HashSet();

    @Override // com.airbnb.lottie.InterfaceC5087k0
    /* JADX INFO: renamed from: a */
    public void mo5679a(String str) {
        mo5681c(str, null);
    }

    @Override // com.airbnb.lottie.InterfaceC5087k0
    /* JADX INFO: renamed from: d */
    public void mo5682d(String str) {
        m94155e(str, null);
    }

    @Override // com.airbnb.lottie.InterfaceC5087k0
    /* JADX INFO: renamed from: b */
    public void mo5680b(String str, Throwable th2) {
        if (C5072d.f5935a) {
            Log.d("LOTTIE", str, th2);
        }
    }

    @Override // com.airbnb.lottie.InterfaceC5087k0
    /* JADX INFO: renamed from: c */
    public void mo5681c(String str, Throwable th2) {
        Set<String> set = f95026a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th2);
        set.add(str);
    }

    /* JADX INFO: renamed from: e */
    public void m94155e(String str, Throwable th2) {
        if (C5072d.f5935a) {
            Log.d("LOTTIE", str, th2);
        }
    }
}
