package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.ae */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class C7810ae {

    /* JADX INFO: renamed from: a */
    private static final Map f12092a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Context f12093b;

    /* JADX INFO: renamed from: c */
    private final C7837s f12094c;

    /* JADX INFO: renamed from: d */
    private final String f12095d;

    /* JADX INFO: renamed from: h */
    private boolean f12099h;

    /* JADX INFO: renamed from: i */
    private final Intent f12100i;

    /* JADX INFO: renamed from: j */
    private final InterfaceC7844z f12101j;

    /* JADX INFO: renamed from: n */
    @Nullable
    private ServiceConnection f12105n;

    /* JADX INFO: renamed from: o */
    @Nullable
    private IInterface f12106o;

    /* JADX INFO: renamed from: e */
    private final List f12096e = new ArrayList();

    /* JADX INFO: renamed from: f */
    @GuardedBy("attachedRemoteTasksLock")
    private final Set f12097f = new HashSet();

    /* JADX INFO: renamed from: g */
    private final Object f12098g = new Object();

    /* JADX INFO: renamed from: l */
    private final IBinder.DeathRecipient f12103l = new IBinder.DeathRecipient() { // from class: com.google.android.play.integrity.internal.u
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C7810ae.m13282k(this.f12118a);
        }
    };

    /* JADX INFO: renamed from: m */
    @GuardedBy("attachedRemoteTasksLock")
    private final AtomicInteger f12104m = new AtomicInteger(0);

    /* JADX INFO: renamed from: k */
    private final WeakReference f12102k = new WeakReference(null);

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m13282k(C7810ae c7810ae) {
        c7810ae.f12094c.m13326d("reportBinderDeath", new Object[0]);
        InterfaceC7843y interfaceC7843y = (InterfaceC7843y) c7810ae.f12102k.get();
        if (interfaceC7843y != null) {
            c7810ae.f12094c.m13326d("calling onBinderDied", new Object[0]);
            interfaceC7843y.m13329a();
        } else {
            c7810ae.f12094c.m13326d("%s : Binder has died.", c7810ae.f12095d);
            Iterator it = c7810ae.f12096e.iterator();
            while (it.hasNext()) {
                ((AbstractRunnableC7838t) it.next()).mo13220a(c7810ae.m13291w());
            }
            c7810ae.f12096e.clear();
        }
        synchronized (c7810ae.f12098g) {
            c7810ae.m13292x();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m13286o(final C7810ae c7810ae, final TaskCompletionSource taskCompletionSource) {
        c7810ae.f12097f.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.integrity.internal.v
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f12119a.m13296u(taskCompletionSource, task);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m13288q(C7810ae c7810ae, AbstractRunnableC7838t abstractRunnableC7838t) {
        if (c7810ae.f12106o != null || c7810ae.f12099h) {
            if (!c7810ae.f12099h) {
                abstractRunnableC7838t.run();
                return;
            } else {
                c7810ae.f12094c.m13326d("Waiting to bind to the service.", new Object[0]);
                c7810ae.f12096e.add(abstractRunnableC7838t);
                return;
            }
        }
        c7810ae.f12094c.m13326d("Initiate binding to the service.", new Object[0]);
        c7810ae.f12096e.add(abstractRunnableC7838t);
        ServiceConnectionC7809ad serviceConnectionC7809ad = new ServiceConnectionC7809ad(c7810ae, null);
        c7810ae.f12105n = serviceConnectionC7809ad;
        c7810ae.f12099h = true;
        if (c7810ae.f12093b.bindService(c7810ae.f12100i, serviceConnectionC7809ad, 1)) {
            return;
        }
        c7810ae.f12094c.m13326d("Failed to bind to the service.", new Object[0]);
        c7810ae.f12099h = false;
        Iterator it = c7810ae.f12096e.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC7838t) it.next()).mo13220a(new C7811af());
        }
        c7810ae.f12096e.clear();
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m13289r(C7810ae c7810ae) {
        c7810ae.f12094c.m13326d("linkToDeath", new Object[0]);
        try {
            c7810ae.f12106o.asBinder().linkToDeath(c7810ae.f12103l, 0);
        } catch (RemoteException e11) {
            c7810ae.f12094c.m13325c(e11, "linkToDeath failed", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m13290s(C7810ae c7810ae) {
        c7810ae.f12094c.m13326d("unlinkToDeath", new Object[0]);
        c7810ae.f12106o.asBinder().unlinkToDeath(c7810ae.f12103l, 0);
    }

    /* JADX INFO: renamed from: w */
    private final RemoteException m13291w() {
        return new RemoteException(String.valueOf(this.f12095d).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GuardedBy("attachedRemoteTasksLock")
    /* JADX INFO: renamed from: x */
    public final void m13292x() {
        Iterator it = this.f12097f.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(m13291w());
        }
        this.f12097f.clear();
    }

    /* JADX INFO: renamed from: c */
    public final Handler m13293c() {
        Handler handler;
        Map map = f12092a;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f12095d)) {
                    HandlerThread handlerThread = new HandlerThread(this.f12095d, 10);
                    handlerThread.start();
                    map.put(this.f12095d, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f12095d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final IInterface m13294e() {
        return this.f12106o;
    }

    /* JADX INFO: renamed from: t */
    public final void m13295t(AbstractRunnableC7838t abstractRunnableC7838t, @Nullable TaskCompletionSource taskCompletionSource) {
        m13293c().post(new C7841w(this, abstractRunnableC7838t.m13328c(), taskCompletionSource, abstractRunnableC7838t));
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m13296u(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f12098g) {
            this.f12097f.remove(taskCompletionSource);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m13297v(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f12098g) {
            this.f12097f.remove(taskCompletionSource);
        }
        m13293c().post(new C7842x(this));
    }

    public C7810ae(Context context, C7837s c7837s, String str, Intent intent, InterfaceC7844z interfaceC7844z, @Nullable InterfaceC7843y interfaceC7843y) {
        this.f12093b = context;
        this.f12094c = c7837s;
        this.f12095d = str;
        this.f12100i = intent;
        this.f12101j = interfaceC7844z;
    }
}
