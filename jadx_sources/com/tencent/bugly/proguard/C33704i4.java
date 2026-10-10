package com.tencent.bugly.proguard;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Looper;
import android.widget.Toast;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.rmonitor.common.logger.Logger;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.i4 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33704i4 implements InterfaceC33683h4 {

    /* JADX INFO: renamed from: b */
    public static final String f70187b = "RMonitor_debug";

    /* JADX INFO: renamed from: c */
    public static boolean f70188c;

    /* JADX INFO: renamed from: a */
    public final InterfaceC34010x2 f70189a = new C34030y2();

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.i4$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Activity f70190b;

        public a(Activity activity) {
            this.f70190b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast.makeText(this.f70190b, "正在调用Bugly的测试接口，上线前请务必移除!!!", 1).show();
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33683h4
    /* JADX INFO: renamed from: a */
    public void mo73243a(Activity activity, boolean z11) {
        if (m73339b(activity)) {
            f70188c = z11;
            this.f70189a.mo75418a(z11);
            EnumC33662g4.INSTANCE.f69954b = z11;
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33683h4
    /* JADX INFO: renamed from: b */
    public void mo73244b(Activity activity, InterfaceC33855p8 interfaceC33855p8) {
        if (m73339b(activity) && f70188c) {
            this.f70189a.mo75419b(interfaceC33855p8);
        }
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: c */
    public static void m73340c(Activity activity) {
        a aVar = new a(activity);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            aVar.run();
        } else {
            ThreadManager.runInMainThread(aVar, 0L);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m73339b(Activity activity) {
        if (activity == null) {
            return false;
        }
        try {
            m73340c(activity);
            return true;
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f70187b, "showDebugTip fail", th2);
            return false;
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33683h4
    /* JADX INFO: renamed from: a */
    public void mo73241a(Activity activity) {
        if (m73339b(activity) && f70188c) {
            this.f70189a.mo75416a();
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33683h4
    /* JADX INFO: renamed from: a */
    public void mo73242a(Activity activity, InterfaceC33855p8 interfaceC33855p8) {
        if (m73339b(activity) && f70188c) {
            this.f70189a.mo75417a(interfaceC33855p8);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m73338a() {
        return f70188c;
    }
}
