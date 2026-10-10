package com.tencent.bugly.proguard;

import com.tencent.bugly.common.heapdump.C33508a;
import com.tencent.bugly.common.heapdump.ForkJvmHeapDumper;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.s7 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33915s7 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC33625e9[] f71840a = {new ForkJvmHeapDumper(), new C33508a()};

    /* JADX INFO: renamed from: a */
    public static InterfaceC33625e9 m74925a() {
        for (InterfaceC33625e9 interfaceC33625e9 : f71840a) {
            if (interfaceC33625e9.mo72145a()) {
                return interfaceC33625e9;
            }
        }
        return new C33508a();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m74926b() {
        if (C33673gf.m73202c()) {
            return f71840a[0].mo72145a();
        }
        for (InterfaceC33625e9 interfaceC33625e9 : f71840a) {
            if (interfaceC33625e9.mo72145a()) {
                return true;
            }
        }
        return false;
    }
}
