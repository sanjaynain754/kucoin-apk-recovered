package com.tencent.bugly.proguard;

import android.text.TextUtils;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ed */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33629ed implements InterfaceC34037y9 {

    /* JADX INFO: renamed from: e */
    public static final long f69746e = 10000;

    /* JADX INFO: renamed from: b */
    public b f69747b = null;

    /* JADX INFO: renamed from: c */
    public boolean f69748c = false;

    /* JADX INFO: renamed from: d */
    public String f69749d = null;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ed$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
            if (nativeCrashHandler != null) {
                nativeCrashHandler.setStage(C33629ed.this.f69749d);
            }
            C33629ed.this.f69748c = false;
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC34037y9
    /* JADX INFO: renamed from: a */
    public void mo72960a(String str) {
        if (TextUtils.equals(this.f69749d, str)) {
            return;
        }
        this.f69749d = str;
        if (this.f69748c) {
            return;
        }
        if (this.f69747b == null) {
            this.f69747b = new b();
        }
        this.f69748c = true;
        ThreadManager.runInMainThread(this.f69747b, 10000L);
    }
}
