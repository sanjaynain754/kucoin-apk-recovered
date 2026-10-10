package com.tencent.bugly.proguard;

import android.app.Activity;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.d7 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33602d7 {

    /* JADX INFO: renamed from: e */
    public static final String f69511e = "FragmentCallbackManager";

    /* JADX INFO: renamed from: a */
    public b f69512a;

    /* JADX INFO: renamed from: b */
    public CopyOnWriteArraySet<InterfaceC33583c9> f69513b;

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArraySet<InterfaceC33562b9> f69514c;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f69515d;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.d7$b */
    /* JADX INFO: compiled from: BUGLY */
    public static class b extends C33758kg {
        @Override // com.tencent.bugly.proguard.C33758kg, com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
        public void onCreate(@NotNull Activity activity) {
            for (InterfaceC33583c9 interfaceC33583c9 : c.f69516a.f69513b) {
                if (interfaceC33583c9.mo72659a(activity)) {
                    interfaceC33583c9.mo72660b(activity);
                }
            }
        }

        @Override // com.tencent.bugly.proguard.C33758kg, com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
        public void onDestroy(@NotNull Activity activity) {
            for (InterfaceC33583c9 interfaceC33583c9 : c.f69516a.f69513b) {
                if (interfaceC33583c9.mo72659a(activity)) {
                    interfaceC33583c9.mo72662c(activity);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.d7$c */
    /* JADX INFO: compiled from: BUGLY */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public static final C33602d7 f69516a = new C33602d7();
    }

    /* JADX INFO: renamed from: b */
    public void m72785b() {
        if (this.f69515d.get()) {
            return;
        }
        this.f69515d.compareAndSet(false, true);
        try {
            if (AndroidVersion.isOverO()) {
                this.f69513b.add(FragmentManagerFragmentLifecycleCallbacksC33867q.m74633a());
            }
        } catch (Throwable unused) {
            Logger.INSTANCE.mo77134w(f69511e, "AndroidOFragmentLifecycleAdapter start failed");
        }
        try {
            this.f69513b.add(C33907s.m74897a());
        } catch (Throwable unused2) {
            Logger.INSTANCE.mo77134w(f69511e, "AndroidXFragmentLifecycleAdapter start failed");
        }
        try {
            this.f69513b.add(C33887r.m74704a());
        } catch (Throwable unused3) {
            Logger.INSTANCE.mo77134w(f69511e, "AndroidV4FragmentLifecycleAdapter start failed");
        }
        LifecycleCallback.register(this.f69512a);
        Logger.INSTANCE.mo77132i(f69511e, "start success");
    }

    public C33602d7() {
        this.f69512a = new b();
        this.f69513b = new CopyOnWriteArraySet<>();
        this.f69514c = new CopyOnWriteArraySet<>();
        this.f69515d = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public static C33602d7 m72782a() {
        return c.f69516a;
    }

    /* JADX INFO: renamed from: c */
    public final void m72787c() {
        if (this.f69515d.get()) {
            this.f69515d.compareAndSet(true, false);
            LifecycleCallback.unRegister(this.f69512a);
            try {
                this.f69513b.remove(FragmentManagerFragmentLifecycleCallbacksC33867q.m74633a());
            } catch (Throwable unused) {
                Logger.INSTANCE.mo77134w(f69511e, "AndroidOFragmentLifecycleAdapter stop failed");
            }
            try {
                this.f69513b.remove(C33907s.m74897a());
            } catch (Throwable unused2) {
                Logger.INSTANCE.mo77134w(f69511e, "AndroidXFragmentLifecycleAdapter stop failed");
            }
            try {
                this.f69513b.remove(C33887r.m74704a());
            } catch (Throwable unused3) {
                Logger.INSTANCE.mo77134w(f69511e, "AndroidV4FragmentLifecycleAdapter stop failed");
            }
            Logger.INSTANCE.mo77132i(f69511e, "stop success");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m72784a(InterfaceC33562b9 interfaceC33562b9) {
        if (interfaceC33562b9 != null) {
            this.f69514c.add(interfaceC33562b9);
            if (!this.f69515d.get()) {
                m72785b();
            }
            Iterator<InterfaceC33583c9> it = this.f69513b.iterator();
            while (it.hasNext()) {
                it.next().mo72661b(interfaceC33562b9);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m72786b(InterfaceC33562b9 interfaceC33562b9) {
        if (interfaceC33562b9 == null || !this.f69515d.get()) {
            return;
        }
        this.f69514c.remove(interfaceC33562b9);
        Iterator<InterfaceC33583c9> it = this.f69513b.iterator();
        while (it.hasNext()) {
            it.next().mo72658a(interfaceC33562b9);
        }
        if (this.f69514c.size() == 0) {
            m72787c();
        }
    }
}
