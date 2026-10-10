package fi0;

import android.content.Context;

/* JADX INFO: renamed from: fi0.b */
/* JADX INFO: compiled from: DeviceIdentifier.java */
/* JADX INFO: loaded from: classes61.dex */
public final class C37502b {

    /* JADX INFO: renamed from: a */
    public static volatile String f83197a;

    /* JADX INFO: renamed from: b */
    public static volatile String f83198b;

    /* JADX INFO: renamed from: c */
    public static volatile String f83199c;

    /* JADX INFO: renamed from: d */
    public static volatile String f83200d;

    /* JADX INFO: renamed from: e */
    public static volatile String f83201e;

    /* JADX INFO: renamed from: fi0.b$a */
    /* JADX INFO: compiled from: DeviceIdentifier.java */
    public class a implements InterfaceC37503c {
        @Override // fi0.InterfaceC37503c
        /* JADX INFO: renamed from: b */
        public void mo84444b(Exception exc) {
            String unused = C37502b.f83197a = "";
        }

        @Override // fi0.InterfaceC37503c
        /* JADX INFO: renamed from: a */
        public void mo84443a(String str) {
            String unused = C37502b.f83197a = str;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m84446b(Context context) {
        if (f83198b == null) {
            synchronized (C37502b.class) {
                try {
                    if (f83198b == null) {
                        f83198b = C37501a.m84430c(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (f83198b == null) {
            f83198b = "";
        }
        return f83198b;
    }

    /* JADX INFO: renamed from: c */
    public static String m84447c(Context context) {
        if (f83201e == null) {
            synchronized (C37502b.class) {
                try {
                    if (f83201e == null) {
                        f83201e = C37501a.m84431d(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (f83201e == null) {
            f83201e = "";
        }
        return f83201e;
    }

    /* JADX INFO: renamed from: d */
    public static String m84448d(Context context) {
        if (f83197a == null) {
            synchronized (C37502b.class) {
                try {
                    if (f83197a == null) {
                        f83197a = C37501a.m84433f();
                        if (f83197a == null || f83197a.length() == 0) {
                            C37501a.m84434g(context, new a());
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (f83197a == null) {
            f83197a = "";
        }
        return f83197a;
    }

    /* JADX INFO: renamed from: e */
    public static String m84449e() {
        if (f83200d == null) {
            synchronized (C37502b.class) {
                try {
                    if (f83200d == null) {
                        f83200d = C37501a.m84435h();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (f83200d == null) {
            f83200d = "";
        }
        return f83200d;
    }

    /* JADX INFO: renamed from: f */
    public static String m84450f() {
        if (f83199c == null) {
            synchronized (C37502b.class) {
                try {
                    if (f83199c == null) {
                        f83199c = C37501a.m84439l();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (f83199c == null) {
            f83199c = "";
        }
        return f83199c;
    }
}
