package com.tencent.bugly.proguard;

import com.tencent.rmonitor.base.plugin.listener.ListenerManager;
import com.tencent.rmonitor.natmem.NatMemMonitor;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.zc */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34060zc {
    /* JADX INFO: renamed from: a */
    public static void m75594a() {
        for (T t11 : ListenerManager.natMemListener.getListenerList()) {
            if (t11 instanceof InterfaceC33751k9) {
                ((InterfaceC33751k9) t11).m73747c();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m75598b(String str) {
        NatMemMonitor.m77197b().m77201c(str);
    }

    /* JADX INFO: renamed from: a */
    public static void m75595a(int i11) {
        for (T t11 : ListenerManager.natMemListener.getListenerList()) {
            if (t11 instanceof InterfaceC33751k9) {
                ((InterfaceC33751k9) t11).m73745a(i11);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m75597a(String str, int i11) {
        for (T t11 : ListenerManager.natMemListener.getListenerList()) {
            if (t11 instanceof InterfaceC33751k9) {
                ((InterfaceC33751k9) t11).m73746a(str, i11);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m75596a(String str) {
        NatMemMonitor.m77197b().m77199b(str);
    }
}
