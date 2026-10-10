package com.tencent.bugly.proguard;

import androidx.annotation.NonNull;
import com.tencent.rmonitor.common.logger.Logger;
import okhttp3.Call;
import okhttp3.EventListener;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.rd */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33901rd implements EventListener.Factory {

    /* JADX INFO: renamed from: b */
    public static final String f71643b = "Okhttp3ListenerFactory";

    /* JADX INFO: renamed from: a */
    public final EventListener.Factory f71644a;

    @Override // okhttp3.EventListener.Factory
    public EventListener create(@NonNull Call call) {
        EventListener.Factory factory = this.f71644a;
        EventListener eventListenerCreate = factory != null ? factory.create(call) : null;
        if (eventListenerCreate == null) {
            return new C33881qd();
        }
        try {
            if (!eventListenerCreate.getClass().getName().startsWith("okhttp3")) {
                return eventListenerCreate;
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77134w(f71643b, C33799mf.m74131a("get listener clz fail, throwable ", th2));
        }
        return new C33881qd(eventListenerCreate);
    }

    public C33901rd(EventListener.Factory factory) {
        this.f71644a = factory;
    }
}
