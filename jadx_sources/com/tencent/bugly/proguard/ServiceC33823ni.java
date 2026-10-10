package com.tencent.bugly.proguard;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.tencent.bugly.matrix.backtrace.WeChatBacktraceNative;
import com.tencent.bugly.matrix.xlog.XLogNative;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ni */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class ServiceC33823ni extends Service {

    /* JADX INFO: renamed from: c */
    public static final String f71181c = "Matrix.WarmUpService";

    /* JADX INFO: renamed from: d */
    public static final String f71182d = "invoke-args";

    /* JADX INFO: renamed from: e */
    public static final String f71183e = "invoke-resp";

    /* JADX INFO: renamed from: f */
    public static final String f71184f = "path-of-xlog-so";

    /* JADX INFO: renamed from: g */
    public static final String f71185g = "enable-logger";

    /* JADX INFO: renamed from: h */
    public static final String f71186h = "saving-path";

    /* JADX INFO: renamed from: i */
    public static final String f71187i = "path-of-elf";

    /* JADX INFO: renamed from: j */
    public static final String f71188j = "elf-start-offset";

    /* JADX INFO: renamed from: k */
    public static final String f71189k = "warm-up-result";

    /* JADX INFO: renamed from: l */
    public static final int f71190l = 100;

    /* JADX INFO: renamed from: m */
    public static final int f71191m = 0;

    /* JADX INFO: renamed from: n */
    public static final int f71192n = -1;

    /* JADX INFO: renamed from: o */
    public static final int f71193o = -2;

    /* JADX INFO: renamed from: p */
    public static final int f71194p = -3;

    /* JADX INFO: renamed from: q */
    public static volatile boolean f71195q = false;

    /* JADX INFO: renamed from: r */
    public static volatile boolean f71196r = false;

    /* JADX INFO: renamed from: s */
    public static HandlerThread f71197s = null;

    /* JADX INFO: renamed from: t */
    public static Handler f71198t = null;

    /* JADX INFO: renamed from: u */
    public static final AtomicInteger f71199u = new AtomicInteger(0);

    /* JADX INFO: renamed from: v */
    public static final byte[] f71200v = new byte[0];

    /* JADX INFO: renamed from: w */
    public static final int f71201w = 1;

    /* JADX INFO: renamed from: x */
    public static final long f71202x = 60000;

    /* JADX INFO: renamed from: a */
    public final Messenger f71203a = new Messenger(new a());

    /* JADX INFO: renamed from: b */
    public final C33739ji f71204b = new C33739ji();

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ni$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        @SuppressLint({"HandlerLeak"})
        public void handleMessage(Message message) {
            super.handleMessage(message);
            Object obj = message.obj;
            if (obj instanceof Bundle) {
                Bundle bundle = (Bundle) obj;
                Bundle bundle2 = bundle.getBundle(ServiceC33823ni.f71182d);
                IBinder binder = bundle.getBinder(ServiceC33823ni.f71183e);
                Bundle bundleM74341a = ServiceC33823ni.this.m74341a(message.what, bundle2);
                try {
                    new Messenger(binder).send(Message.obtain(null, message.what, bundleM74341a));
                } catch (RemoteException e11) {
                    C33858pb.m74518a(ServiceC33823ni.f71181c, e11, "", new Object[0]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ni$b */
    /* JADX INFO: compiled from: BUGLY */
    public static final class b implements Handler.Callback {
        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                C33858pb.m74520c(ServiceC33823ni.f71181c, "Suicide.", new Object[0]);
                Process.killProcess(Process.myPid());
                System.exit(0);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ni$c */
    /* JADX INFO: compiled from: BUGLY */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo73595a(Context context);

        /* JADX INFO: renamed from: a */
        boolean mo73596a();

        /* JADX INFO: renamed from: a */
        boolean mo73597a(Context context, Bundle bundle);
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ni$d */
    /* JADX INFO: compiled from: BUGLY */
    public interface d {
        /* JADX INFO: renamed from: a */
        Bundle mo74344a(int i11, Bundle bundle);
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ni$e */
    /* JADX INFO: compiled from: BUGLY */
    public static final class e implements d, c {

        /* JADX INFO: renamed from: g */
        public static final String f71206g = "Matrix.WarmUpInvoker";

        /* JADX INFO: renamed from: a */
        public volatile Messenger f71207a;

        /* JADX INFO: renamed from: b */
        public volatile Messenger f71208b;

        /* JADX INFO: renamed from: c */
        public final Bundle[] f71209c = {null};

        /* JADX INFO: renamed from: d */
        public final HandlerThread[] f71210d = {null};

        /* JADX INFO: renamed from: e */
        public ServiceConnection f71211e = new a();

        /* JADX INFO: renamed from: f */
        public final boolean[] f71212f = {false};

        /* JADX INFO: renamed from: com.tencent.bugly.proguard.ni$e$a */
        /* JADX INFO: compiled from: BUGLY */
        public class a implements ServiceConnection {
            public a() {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                e.this.f71208b = new Messenger(iBinder);
                synchronized (e.this.f71212f) {
                    boolean[] zArr = e.this.f71212f;
                    zArr[0] = true;
                    zArr.notifyAll();
                }
                C33858pb.m74520c(e.f71206g, "This remote invoker(%s) connected.", this);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                e.this.f71208b = null;
                synchronized (e.this.f71212f) {
                    boolean[] zArr = e.this.f71212f;
                    zArr[0] = false;
                    zArr.notifyAll();
                }
                C33858pb.m74520c(e.f71206g, "This remote invoker(%s) disconnected.", this);
                synchronized (e.this.f71209c) {
                    Bundle[] bundleArr = e.this.f71209c;
                    bundleArr[0] = null;
                    bundleArr.notifyAll();
                }
            }
        }

        /* JADX INFO: renamed from: com.tencent.bugly.proguard.ni$e$b */
        /* JADX INFO: compiled from: BUGLY */
        public class b extends Handler {
            public b(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                Object obj = message.obj;
                if (obj instanceof Bundle) {
                    Bundle bundle = (Bundle) obj;
                    synchronized (e.this.f71209c) {
                        Bundle[] bundleArr = e.this.f71209c;
                        bundleArr[0] = bundle;
                        bundleArr.notifyAll();
                    }
                }
            }
        }

        @Override // com.tencent.bugly.proguard.ServiceC33823ni.c
        /* JADX INFO: renamed from: a */
        public boolean mo73596a() {
            return this.f71212f[0];
        }

        @Override // com.tencent.bugly.proguard.ServiceC33823ni.c
        /* JADX INFO: renamed from: a */
        public boolean mo73597a(Context context, Bundle bundle) {
            m74346b();
            if (this.f71212f[0]) {
                return true;
            }
            C33858pb.m74520c(f71206g, "Start connecting to remote. (%s)", Integer.valueOf(hashCode()));
            synchronized (this.f71210d) {
                try {
                    HandlerThread handlerThread = this.f71210d[0];
                    if (handlerThread != null) {
                        handlerThread.quitSafely();
                        this.f71210d[0] = null;
                    }
                    this.f71210d[0] = new HandlerThread("warm-up-remote-invoker-" + hashCode());
                    this.f71210d[0].start();
                    this.f71207a = new Messenger(new b(this.f71210d[0].getLooper()));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(context, (Class<?>) ServiceC33823ni.class));
            intent.putExtra(ServiceC33823ni.f71185g, bundle.getBoolean(ServiceC33823ni.f71185g, false));
            intent.putExtra(ServiceC33823ni.f71184f, bundle.getString(ServiceC33823ni.f71184f, null));
            context.bindService(intent, this.f71211e, 1);
            try {
                synchronized (this.f71212f) {
                    try {
                        boolean[] zArr = this.f71212f;
                        if (!zArr[0]) {
                            zArr.wait(60000L);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } catch (InterruptedException e11) {
                C33858pb.m74518a(f71206g, e11, "", new Object[0]);
            }
            if (!this.f71212f[0]) {
                mo73595a(context);
            }
            return this.f71212f[0];
        }

        /* JADX INFO: renamed from: b */
        public final void m74346b() {
            if (Looper.getMainLooper() != Looper.myLooper()) {
            } else {
                throw new RuntimeException("Should not call this from main thread!");
            }
        }

        @Override // com.tencent.bugly.proguard.ServiceC33823ni.c
        /* JADX INFO: renamed from: a */
        public void mo73595a(Context context) {
            try {
                context.unbindService(this.f71211e);
            } catch (Throwable th2) {
                C33858pb.m74518a(f71206g, th2, "", new Object[0]);
            }
            C33858pb.m74520c(f71206g, "Start disconnecting to remote. (%s)", Integer.valueOf(hashCode()));
            synchronized (this.f71210d) {
                try {
                    HandlerThread handlerThread = this.f71210d[0];
                    if (handlerThread != null) {
                        handlerThread.quitSafely();
                        this.f71210d[0] = null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            synchronized (this.f71209c) {
                Bundle[] bundleArr = this.f71209c;
                bundleArr[0] = null;
                bundleArr.notifyAll();
            }
        }

        @Override // com.tencent.bugly.proguard.ServiceC33823ni.d
        /* JADX INFO: renamed from: a */
        public Bundle mo74344a(int i11, Bundle bundle) {
            Bundle bundle2;
            try {
                Messenger messenger = this.f71208b;
                if (messenger != null) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putBundle(ServiceC33823ni.f71182d, bundle);
                    bundle3.putBinder(ServiceC33823ni.f71183e, this.f71207a.getBinder());
                    messenger.send(Message.obtain(null, i11, bundle3));
                    synchronized (this.f71209c) {
                        Bundle[] bundleArr = this.f71209c;
                        bundleArr[0] = null;
                        bundleArr.wait(300000L);
                        bundle2 = this.f71209c[0];
                    }
                    return bundle2;
                }
            } catch (RemoteException | InterruptedException e11) {
                C33858pb.m74518a(f71206g, e11, "", new Object[0]);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m74343b() {
        C33858pb.m74520c(f71181c, "Remove scheduled suicide", new Object[0]);
        synchronized (f71200v) {
            f71198t.removeMessages(1);
            f71199u.getAndIncrement();
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m74339a(Intent intent) {
        if (f71196r) {
            return;
        }
        C33858pb.m74520c(f71181c, "Init called.", new Object[0]);
        C33865pi.m74605i();
        boolean booleanExtra = intent.getBooleanExtra(f71185g, false);
        String stringExtra = intent.getStringExtra(f71184f);
        C33858pb.m74520c(f71181c, "Enable logger: %s", Boolean.valueOf(booleanExtra));
        C33858pb.m74520c(f71181c, "Path of XLog: %s", stringExtra);
        XLogNative.m72236a(stringExtra);
        WeChatBacktraceNative.enableLogger(booleanExtra);
        f71196r = true;
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        if (!f71196r) {
            m74339a(intent);
        }
        return this.f71203a.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (!f71195q) {
            m74338a();
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m74338a() {
        if (f71195q) {
            return;
        }
        synchronized (f71200v) {
            try {
                if (f71197s == null) {
                    HandlerThread handlerThread = new HandlerThread("backtrace-recycler");
                    f71197s = handlerThread;
                    handlerThread.start();
                    f71198t = new Handler(f71197s.getLooper(), new b());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m74340a(true);
        f71195q = true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m74342a(String str) {
        return str == null || str.isEmpty();
    }

    /* JADX INFO: renamed from: a */
    public static void m74340a(boolean z11) {
        C33858pb.m74520c(f71181c, "Schedule suicide", new Object[0]);
        synchronized (f71200v) {
            try {
                if (z11 || f71199u.decrementAndGet() == 0) {
                    f71198t.sendEmptyMessageDelayed(1, 60000L);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized Bundle m74341a(int i11, Bundle bundle) {
        int i12;
        m74343b();
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putInt(f71189k, -1);
            if (bundle == null) {
                C33858pb.m74520c(f71181c, "Args is null.", new Object[0]);
                m74340a(false);
                return bundle2;
            }
            String string = bundle.getString(f71186h, null);
            C33858pb.m74520c(f71181c, "Invoke from client with savingPath: %s.", string);
            if (m74342a(string)) {
                C33858pb.m74520c(f71181c, "Saving path is empty.", new Object[0]);
                m74340a(false);
                return bundle2;
            }
            this.f71204b.m73586a(string);
            if (i11 == 100) {
                String string2 = bundle.getString(f71187i, null);
                if (m74342a(string2)) {
                    C33858pb.m74520c(f71181c, "Warm-up so path is empty.", new Object[0]);
                    m74340a(false);
                    return bundle2;
                }
                int i13 = bundle.getInt(f71188j, 0);
                C33858pb.m74520c(f71181c, "Warm up so path %s offset %s.", string2, Integer.valueOf(i13));
                if (C33844oi.a.m74481b(this, string2, i13)) {
                    boolean zWarmUp = WeChatBacktraceNative.warmUp(string2, i13, true);
                    if (!WeChatBacktraceNative.testLoadQut(string2, i13)) {
                        C33858pb.m74522e(f71181c, "Warm up elf %s:%s success, but test load qut failed!", string2, Integer.valueOf(i13));
                        zWarmUp = false;
                    }
                    C33844oi.a.m74479a(this, string2, i13, zWarmUp);
                    i12 = zWarmUp ? 0 : -2;
                } else {
                    i12 = -3;
                }
                bundle2.putInt(f71189k, i12);
            } else {
                C33858pb.m74522e(f71181c, "Unknown cmd: %s", Integer.valueOf(i11));
            }
            m74340a(false);
            return bundle2;
        } catch (Throwable th2) {
            m74340a(false);
            throw th2;
        }
    }
}
