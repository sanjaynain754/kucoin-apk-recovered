package com.tencent.bugly.proguard;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.mi */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33802mi implements Handler.Callback {

    /* JADX INFO: renamed from: h */
    public static final String f70975h = "Matrix.WarmUpScheduler";

    /* JADX INFO: renamed from: i */
    public static final long f70976i = 3000;

    /* JADX INFO: renamed from: j */
    public static final long f70977j = 3000;

    /* JADX INFO: renamed from: k */
    public static final long f70978k = 3000;

    /* JADX INFO: renamed from: l */
    public static final long f70979l = 3000;

    /* JADX INFO: renamed from: m */
    public static final int f70980m = 1;

    /* JADX INFO: renamed from: n */
    public static final int f70981n = 2;

    /* JADX INFO: renamed from: o */
    public static final int f70982o = 3;

    /* JADX INFO: renamed from: p */
    public static final int f70983p = 4;

    /* JADX INFO: renamed from: b */
    public c f70984b;

    /* JADX INFO: renamed from: c */
    public C33739ji f70985c;

    /* JADX INFO: renamed from: d */
    public Handler f70986d;

    /* JADX INFO: renamed from: e */
    public Context f70987e;

    /* JADX INFO: renamed from: f */
    public C33865pi.h f70988f;

    /* JADX INFO: renamed from: g */
    public long f70989g;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.mi$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d f70990b;

        public a(d dVar) {
            this.f70990b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C33802mi.this.m74168c(this.f70990b);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.mi$d */
    /* JADX INFO: compiled from: BUGLY */
    public enum d {
        WarmUp,
        CleanUp,
        RequestConsuming,
        DiskUsage
    }

    /* JADX INFO: renamed from: a */
    public final void m74165a(d dVar) {
        int i11 = b.f70993b[dVar.ordinal()];
        if (i11 == 1) {
            C33858pb.m74520c(f70975h, "Schedule warm-up in %ss", Long.valueOf(this.f70989g / 1000));
            Handler handler = this.f70986d;
            handler.sendMessageDelayed(Message.obtain(handler, 1, new CancellationSignal()), this.f70989g);
        } else if (i11 == 2) {
            C33858pb.m74520c(f70975h, "Schedule clean-up in %ss", Long.valueOf(this.f70989g / 1000));
            Handler handler2 = this.f70986d;
            handler2.sendMessageDelayed(Message.obtain(handler2, 3, new CancellationSignal()), this.f70989g);
        } else {
            if (i11 != 3) {
                return;
            }
            C33858pb.m74520c(f70975h, "Schedule request consuming in %ss", Long.valueOf(this.f70989g / 1000));
            Handler handler3 = this.f70986d;
            handler3.sendMessageDelayed(Message.obtain(handler3, 2, new CancellationSignal()), this.f70989g);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m74167b(d dVar) {
        this.f70986d.post(new a(dVar));
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.mi$b */
    /* JADX INFO: compiled from: BUGLY */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f70992a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f70993b;

        static {
            int[] iArr = new int[d.values().length];
            f70993b = iArr;
            try {
                iArr[d.WarmUp.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70993b[d.CleanUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70993b[d.RequestConsuming.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f70993b[d.DiskUsage.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C33865pi.h.values().length];
            f70992a = iArr2;
            try {
                iArr2[C33865pi.h.PostStartup.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f70992a[C33865pi.h.WhileCharging.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f70992a[C33865pi.h.WhileScreenOff.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.mi$c */
    /* JADX INFO: compiled from: BUGLY */
    public static final class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public CancellationSignal f70994a;

        /* JADX INFO: renamed from: b */
        public Handler f70995b;

        /* JADX INFO: renamed from: c */
        public Context f70996c;

        /* JADX INFO: renamed from: d */
        public final C33865pi.h f70997d;

        /* JADX INFO: renamed from: e */
        public final long f70998e;

        /* JADX INFO: renamed from: f */
        public final Set<d> f70999f = new HashSet();

        /* JADX INFO: renamed from: a */
        public synchronized void m74171a(d dVar) {
            if (this.f70999f.contains(dVar)) {
                return;
            }
            this.f70999f.add(dVar);
        }

        /* JADX INFO: renamed from: b */
        public synchronized int m74173b(d dVar) {
            this.f70999f.remove(dVar);
            return this.f70999f.size();
        }

        public c(Context context, Handler handler, C33865pi.h hVar, long j11) {
            this.f70996c = context;
            this.f70995b = handler;
            this.f70997d = hVar;
            this.f70998e = j11;
        }

        /* JADX INFO: renamed from: a */
        public final synchronized void m74172a(boolean z11, boolean z12) {
            try {
                C33858pb.m74520c(C33802mi.f70975h, "Idle status changed: interactive = %s, charging = %s", Boolean.valueOf(z11), Boolean.valueOf(z12));
                boolean z13 = !z11 && (this.f70997d == C33865pi.h.WhileScreenOff || !z12);
                if (z13 && this.f70994a == null) {
                    this.f70994a = new CancellationSignal();
                    Iterator<d> it = this.f70999f.iterator();
                    while (it.hasNext()) {
                        int i11 = b.f70993b[it.next().ordinal()];
                        if (i11 != 1) {
                            if (i11 == 2) {
                                if (C33844oi.m74473f(this.f70996c)) {
                                    Handler handler = this.f70995b;
                                    handler.sendMessageDelayed(Message.obtain(handler, 3, this.f70994a), 3000L);
                                } else {
                                    it.remove();
                                }
                                C33858pb.m74520c(C33802mi.f70975h, "System idle, trigger clean up in %s seconds.", 3L);
                            } else if (i11 == 3) {
                                Handler handler2 = this.f70995b;
                                handler2.sendMessageDelayed(Message.obtain(handler2, 2, this.f70994a), this.f70998e);
                                C33858pb.m74520c(C33802mi.f70975h, "System idle, trigger consume requested qut in %s seconds.", Long.valueOf(this.f70998e / 1000));
                            } else if (i11 == 4) {
                                if (C33844oi.m74475h(this.f70996c)) {
                                    Handler handler3 = this.f70995b;
                                    handler3.sendMessageDelayed(Message.obtain(handler3, 4, this.f70994a), 3000L);
                                } else {
                                    it.remove();
                                }
                                C33858pb.m74520c(C33802mi.f70975h, "System idle, trigger disk usage in %s seconds.", 3L);
                            }
                        } else if (!C33844oi.m74477j(this.f70996c).exists()) {
                            Handler handler4 = this.f70995b;
                            handler4.sendMessageDelayed(Message.obtain(handler4, 1, this.f70994a), this.f70998e);
                            C33858pb.m74520c(C33802mi.f70975h, "System idle, trigger warm up in %s seconds.", Long.valueOf(this.f70998e / 1000));
                        } else {
                            it.remove();
                        }
                    }
                } else if (!z13 && this.f70994a != null) {
                    this.f70995b.removeMessages(1);
                    this.f70995b.removeMessages(2);
                    this.f70995b.removeMessages(3);
                    this.f70995b.removeMessages(4);
                    this.f70994a.cancel();
                    this.f70994a = null;
                    C33858pb.m74520c(C33802mi.f70975h, "Exit idle state, task cancelled.", new Object[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        /* JADX WARN: Code duplicated, block: B:29:0x004e  */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            byte b11;
            String action = intent.getAction();
            if (action == null) {
                return;
            }
            synchronized (this) {
                try {
                    int iHashCode = action.hashCode();
                    boolean z11 = true;
                    boolean z12 = false;
                    if (iHashCode != -2128145023) {
                        if (iHashCode != -1886648615) {
                            if (iHashCode != -1454123155) {
                                if (iHashCode == 1019184907 && action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                    b11 = 2;
                                } else {
                                    b11 = -1;
                                }
                            } else if (action.equals("android.intent.action.SCREEN_ON")) {
                                b11 = 0;
                            } else {
                                b11 = -1;
                            }
                        } else if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                            b11 = 3;
                        } else {
                            b11 = -1;
                        }
                    } else if (action.equals("android.intent.action.SCREEN_OFF")) {
                        b11 = 1;
                    } else {
                        b11 = -1;
                    }
                    if (b11 != 0) {
                        if (b11 == 1 || b11 != 2) {
                            z11 = false;
                        } else {
                            z12 = true;
                            z11 = false;
                        }
                    }
                    m74172a(z11, z12);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m74170a(Context context) {
            int intExtra;
            try {
                boolean zIsInteractive = ((PowerManager) context.getSystemService("power")).isInteractive();
                Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                boolean z11 = false;
                if (intentRegisterReceiver != null && ((intExtra = intentRegisterReceiver.getIntExtra("status", -1)) == 2 || intExtra == 5)) {
                    z11 = true;
                }
                m74172a(zIsInteractive, z11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m74166b(Context context, d dVar) {
        c cVar = this.f70984b;
        if (cVar != null && cVar.m74173b(dVar) == 0) {
            C33858pb.m74520c(f70975h, "Unregister idle receiver.", new Object[0]);
            context.unregisterReceiver(this.f70984b);
            this.f70984b = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m74168c(d dVar) {
        int i11 = b.f70992a[this.f70988f.ordinal()];
        if (i11 == 1) {
            m74165a(dVar);
        } else if (i11 == 2 || i11 == 3) {
            m74164a(this.f70987e, dVar);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m74169d(d dVar) {
        int i11 = b.f70992a[this.f70988f.ordinal()];
        if (i11 == 2 || i11 == 3) {
            m74166b(this.f70987e, dVar);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i11 = message.what;
        if (i11 == 1) {
            this.f70985c.m73593d((CancellationSignal) message.obj);
            return false;
        }
        if (i11 == 2) {
            this.f70985c.m73592c((CancellationSignal) message.obj);
            return false;
        }
        if (i11 == 3) {
            this.f70985c.m73582a((CancellationSignal) message.obj);
            return false;
        }
        if (i11 != 4) {
            return false;
        }
        this.f70985c.m73588b((CancellationSignal) message.obj);
        return false;
    }

    public C33802mi(C33739ji c33739ji, Context context, C33865pi.h hVar, long j11) {
        this.f70989g = 0L;
        this.f70985c = c33739ji;
        if (this.f70986d == null) {
            this.f70986d = new Handler(Looper.getMainLooper(), this);
        }
        this.f70987e = context;
        this.f70988f = hVar;
        this.f70989g = Math.max(j11, 3000L);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m74164a(Context context, d dVar) {
        c cVar = this.f70984b;
        if (cVar == null) {
            c cVar2 = new c(context, this.f70986d, this.f70988f, this.f70989g);
            this.f70984b = cVar2;
            cVar2.m74171a(dVar);
            C33858pb.m74520c(f70975h, "Register idle receiver.", new Object[0]);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            context.registerReceiver(this.f70984b, intentFilter);
            this.f70984b.m74170a(context);
            return;
        }
        cVar.m74171a(dVar);
    }
}
