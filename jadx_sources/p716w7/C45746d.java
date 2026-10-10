package p716w7;

import android.annotation.SuppressLint;
import android.os.Build;

/* JADX INFO: renamed from: w7.d */
/* JADX INFO: compiled from: SystemLibraryLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class C45746d implements C45744b.b {
    @Override // p716w7.C45744b.b
    /* JADX INFO: renamed from: b */
    public String[] mo100977b() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        return !C45747e.m100989a(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }

    @Override // p716w7.C45744b.b
    /* JADX INFO: renamed from: d */
    public String mo100979d(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    @Override // p716w7.C45744b.b
    /* JADX INFO: renamed from: a */
    public String mo100976a(String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override // p716w7.C45744b.b
    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    /* JADX INFO: renamed from: c */
    public void mo100978c(String str) {
        System.load(str);
    }

    @Override // p716w7.C45744b.b
    public void loadLibrary(String str) {
        System.loadLibrary(str);
    }
}
