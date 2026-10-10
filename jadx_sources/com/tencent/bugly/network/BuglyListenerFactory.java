package com.tencent.bugly.network;

import com.tencent.bugly.proguard.C33650fd;
import com.tencent.bugly.proguard.InterfaceC33729j8;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import okhttp3.Call;
import okhttp3.EventListener;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class BuglyListenerFactory implements EventListener.Factory, InterfaceC33729j8 {

    /* JADX INFO: renamed from: b */
    public static final String f68760b = "RMonitor_net_quality";

    /* JADX INFO: renamed from: c */
    public static BuglyListenerFactory f68761c;

    /* JADX INFO: renamed from: a */
    public CopyOnWriteArraySet<EventListener.Factory> f68762a = new CopyOnWriteArraySet<>();

    public static BuglyListenerFactory getInstance() {
        if (f68761c == null) {
            synchronized (C33650fd.class) {
                try {
                    if (f68761c == null) {
                        f68761c = new BuglyListenerFactory();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f68761c;
    }

    public void addFactory(EventListener.Factory factory) {
        if (factory == null) {
            return;
        }
        this.f68762a.add(factory);
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        C33650fd c33650fd = new C33650fd();
        Iterator<EventListener.Factory> it = this.f68762a.iterator();
        while (it.hasNext()) {
            EventListener eventListenerCreate = it.next().create(call);
            if (eventListenerCreate != null) {
                c33650fd.m73058a(eventListenerCreate);
            }
        }
        return c33650fd;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33729j8
    public void onCallEnd(Call call, boolean z11, IOException iOException) {
        try {
            for (EventListener.Factory factory : this.f68762a) {
                if (factory instanceof InterfaceC33729j8) {
                    ((InterfaceC33729j8) factory).onCallEnd(call, z11, iOException);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void removeFactory(EventListener.Factory factory) {
        if (factory == null) {
            return;
        }
        this.f68762a.remove(factory);
    }
}
