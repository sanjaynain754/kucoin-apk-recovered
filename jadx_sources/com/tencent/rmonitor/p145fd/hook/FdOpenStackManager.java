package com.tencent.rmonitor.p145fd.hook;

import com.tencent.bugly.common.heapdump.ForkJvmHeapDumper;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.bugly.proguard.C33664g6;
import com.tencent.bugly.proguard.InterfaceC33541a9;
import com.tencent.rmonitor.common.util.FileUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
public class FdOpenStackManager {

    /* JADX INFO: renamed from: b */
    public static List<String> f75269b = new C35156a();

    /* JADX INFO: renamed from: c */
    public static final String[] f75270c = {".*\\.so$"};

    /* JADX INFO: renamed from: a */
    public static boolean f75268a = FileUtil.loadLibrary("rmonitor_memory");

    /* JADX INFO: renamed from: d */
    public static InterfaceC33541a9 f75271d = new C35157b();

    /* JADX INFO: renamed from: com.tencent.rmonitor.fd.hook.FdOpenStackManager$b */
    /* JADX INFO: compiled from: BUGLY */
    public class C35157b implements InterfaceC33541a9 {
        @Override // com.tencent.bugly.proguard.InterfaceC33541a9
        /* JADX INFO: renamed from: a */
        public void mo72321a() {
            if (FdOpenStackManager.f75268a) {
                FdOpenStackManager.m77176a(true);
            }
        }

        @Override // com.tencent.bugly.proguard.InterfaceC33541a9
        /* JADX INFO: renamed from: b */
        public void mo72322b() {
            if (FdOpenStackManager.f75268a) {
                FdOpenStackManager.m77176a(false);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m77177a() {
        if (!f75268a) {
            return false;
        }
        for (String str : f75270c) {
            nSetRegisterHookSo(str);
        }
        if (AndroidVersion.isOverR()) {
            f75269b.add(".*/libmonochrome.so$");
        }
        Iterator<String> it = f75269b.iterator();
        while (it.hasNext()) {
            nSetIgnoreHookSo(it.next());
        }
        nStartFdOpenHook(C33664g6.m73159i());
        ForkJvmHeapDumper.m72141a(f75271d);
        return true;
    }

    private static native boolean nDumpFdOpenStacks(String str);

    private static native void nSetFdOpenHookValue(boolean z11);

    private static native void nSetIgnoreHookSo(String str);

    private static native void nSetRegisterHookSo(String str);

    private static native void nStartFdOpenHook(boolean z11);

    private static native void nStopFdOpenHook();

    /* JADX INFO: renamed from: com.tencent.rmonitor.fd.hook.FdOpenStackManager$a */
    /* JADX INFO: compiled from: BUGLY */
    public class C35156a extends ArrayList<String> {
        public C35156a() {
            add(".*/librmonitor_memory.so$");
            add(".*/libBugly_Native.so$");
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m77179b() {
        if (f75268a) {
            nStopFdOpenHook();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m77176a(boolean z11) {
        if (f75268a) {
            nSetFdOpenHookValue(z11);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m77178a(String str) {
        if (f75268a) {
            return nDumpFdOpenStacks(str);
        }
        return false;
    }
}
