package com.tencent.bugly.proguard;

import com.tencent.rmonitor.base.plugin.listener.IBaseListener;
import com.tencent.rmonitor.base.plugin.listener.MonitorListenerMng;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.za */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34058za<T extends IBaseListener> implements InterfaceC33997w9 {

    /* JADX INFO: renamed from: a */
    public final Class<T> f72624a;

    /* JADX INFO: renamed from: b */
    public final MonitorListenerMng<T> f72625b;

    @Override // com.tencent.bugly.proguard.InterfaceC33997w9
    /* JADX INFO: renamed from: a */
    public boolean mo75359a(Object obj) {
        if (!this.f72624a.isInstance(obj)) {
            return false;
        }
        this.f72625b.addListener(this.f72624a.cast(obj));
        return true;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33997w9
    /* JADX INFO: renamed from: b */
    public boolean mo75360b(Object obj) {
        if (!this.f72624a.isInstance(obj)) {
            return false;
        }
        this.f72625b.removeListener(this.f72624a.cast(obj));
        return true;
    }

    public C34058za(Class<T> cls, MonitorListenerMng<T> monitorListenerMng) {
        this.f72624a = cls;
        this.f72625b = monitorListenerMng;
    }
}
