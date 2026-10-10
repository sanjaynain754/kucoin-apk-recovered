package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import com.tencent.rmonitor.common.logger.LogState;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.eb */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33627eb {

    /* JADX INFO: renamed from: a */
    public static boolean f69711a = true;

    /* JADX INFO: renamed from: b */
    public static final int f69712b = 51200;

    /* JADX INFO: renamed from: c */
    public static final int f69713c = 102400;

    /* JADX INFO: renamed from: d */
    public static final int f69714d = 0;

    /* JADX INFO: renamed from: e */
    public static final int f69715e = 30720;

    /* JADX INFO: renamed from: f */
    public static final String f69716f = " ";

    /* JADX INFO: renamed from: g */
    public static final String f69717g = "\u0001\r\n";

    /* JADX INFO: renamed from: h */
    public static SimpleDateFormat f69718h = null;

    /* JADX INFO: renamed from: i */
    public static boolean f69719i = true;

    /* JADX INFO: renamed from: j */
    public static int f69720j = 51200;

    /* JADX INFO: renamed from: k */
    public static StringBuilder f69721k;

    /* JADX INFO: renamed from: l */
    public static StringBuilder f69722l;

    /* JADX INFO: renamed from: m */
    public static boolean f69723m;

    /* JADX INFO: renamed from: n */
    public static c f69724n;

    /* JADX INFO: renamed from: o */
    public static String f69725o;

    /* JADX INFO: renamed from: p */
    public static String f69726p;

    /* JADX INFO: renamed from: q */
    public static Context f69727q;

    /* JADX INFO: renamed from: r */
    public static String f69728r;

    /* JADX INFO: renamed from: s */
    public static boolean f69729s;

    /* JADX INFO: renamed from: t */
    public static boolean f69730t;

    /* JADX INFO: renamed from: u */
    public static ExecutorService f69731u;

    /* JADX INFO: renamed from: v */
    public static int f69732v;

    /* JADX INFO: renamed from: w */
    public static final Object f69733w = new Object();

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.eb$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f69734b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f69735c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f69736d;

        public a(String str, String str2, String str3) {
            this.f69734b = str;
            this.f69735c = str2;
            this.f69736d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            C33627eb.m72949f(this.f69734b, this.f69735c, this.f69736d);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.eb$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f69737b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f69738c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f69739d;

        public b(String str, String str2, String str3) {
            this.f69737b = str;
            this.f69738c = str2;
            this.f69739d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            C33627eb.m72946d(this.f69737b, this.f69738c, this.f69739d);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.eb$c */
    /* JADX INFO: compiled from: BUGLY */
    public static class c {

        /* JADX INFO: renamed from: a */
        public boolean f69740a;

        /* JADX INFO: renamed from: b */
        public File f69741b;

        /* JADX INFO: renamed from: c */
        public String f69742c;

        /* JADX INFO: renamed from: d */
        public long f69743d;

        /* JADX INFO: renamed from: e */
        public long f69744e = 30720;

        /* JADX INFO: renamed from: a */
        public final boolean m72955a() {
            try {
                File file = new File(this.f69742c);
                this.f69741b = file;
                if (file.exists() && !this.f69741b.delete()) {
                    this.f69740a = false;
                    return false;
                }
                if (this.f69741b.createNewFile()) {
                    return true;
                }
                this.f69740a = false;
                return false;
            } catch (Throwable th2) {
                C34012x4.m75438b(th2);
                this.f69740a = false;
                return false;
            }
        }

        public c(String str) {
            if (str != null && !str.equals("")) {
                this.f69742c = str;
                this.f69740a = m72955a();
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m72956a(String str) {
            if (!this.f69740a) {
                return false;
            }
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(this.f69741b, true);
                try {
                    byte[] bytes = str.getBytes("UTF-8");
                    fileOutputStream2.write(bytes);
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    this.f69743d += (long) bytes.length;
                    this.f69740a = true;
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    return true;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    try {
                        C34012x4.m75438b(th);
                        this.f69740a = false;
                        return false;
                    } finally {
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m72944c() {
        InterfaceC33587cd interfaceC33587cd;
        try {
            C33765l2 c33765l2M73827s = C33765l2.m73827s();
            if (c33765l2M73827s == null || (interfaceC33587cd = c33765l2M73827s.f70758l0) == null) {
                return null;
            }
            return interfaceC33587cd.getLogFromNative();
        } catch (Throwable th2) {
            if (C34012x4.m75438b(th2)) {
                return null;
            }
            th2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m72946d(String str, String str2, String str3) {
        try {
            if (f69711a) {
                m72948e(str, str2, str3);
            } else {
                m72950g(str, str2, str3);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    static {
        try {
            f69718h = new SimpleDateFormat("MM-dd HH:mm:ss");
        } catch (Throwable th2) {
            C34012x4.m75435a(th2.getCause());
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m72937a(Context context) {
        if (f69729s || context == null || !f69719i) {
            return;
        }
        try {
            f69731u = Executors.newSingleThreadExecutor();
            f69722l = new StringBuilder(0);
            f69721k = new StringBuilder(0);
            f69727q = context;
            f69725o = C33765l2.m73825a(context).f70745f;
            f69726p = "";
            f69728r = f69727q.getFilesDir().getPath() + "/buglylog_" + f69725o + "_" + f69726p + ".txt";
            f69732v = Process.myPid();
        } catch (Throwable unused) {
        }
        f69729s = true;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m72943b() {
        return f69711a ? m72941a() : m72947d();
    }

    /* JADX INFO: renamed from: e */
    public static synchronized void m72948e(String str, String str2, String str3) {
        String strM72935a = m72935a(str, str2, str3, Process.myTid());
        synchronized (f69733w) {
            try {
                f69722l.append(strM72935a);
                if (f69722l.length() >= f69720j) {
                    StringBuilder sb2 = f69722l;
                    f69722l = sb2.delete(0, sb2.indexOf(f69717g) + 1);
                }
            } catch (Throwable th2) {
                try {
                    if (!C34012x4.m75435a(th2)) {
                        th2.printStackTrace();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static synchronized void m72950g(String str, String str2, String str3) {
        String strM72935a = m72935a(str, str2, str3, Process.myTid());
        try {
            synchronized (f69733w) {
                try {
                    f69722l.append(strM72935a);
                    if (f69722l.length() <= f69720j) {
                        return;
                    }
                    if (f69723m) {
                        return;
                    }
                    f69723m = true;
                    c cVar = f69724n;
                    if (cVar == null) {
                        f69724n = new c(f69728r);
                    } else {
                        File file = cVar.f69741b;
                        if (file == null || file.length() + ((long) f69722l.length()) > f69724n.f69744e) {
                            f69724n.m72955a();
                        }
                    }
                    if (f69724n.m72956a(f69722l.toString())) {
                        f69722l.setLength(0);
                        f69723m = false;
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m72949f(String str, String str2, String str3) {
        InterfaceC33587cd interfaceC33587cd;
        try {
            C33765l2 c33765l2M73827s = C33765l2.m73827s();
            if (c33765l2M73827s != null && (interfaceC33587cd = c33765l2M73827s.f70758l0) != null) {
                return interfaceC33587cd.appendLogToNative(str, str2, str3);
            }
            return false;
        } catch (Throwable th2) {
            if (!C34012x4.m75438b(th2)) {
                th2.printStackTrace();
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m72947d() {
        File file;
        if (!f69719i) {
            return null;
        }
        if (f69730t) {
            C34012x4.m75442d("[LogUtil] Get user log from native.", new Object[0]);
            String strM72944c = m72944c();
            if (strM72944c != null) {
                C34012x4.m75431a(LogState.INFO, "[LogUtil] Got user log from native: %d bytes", Integer.valueOf(strM72944c.length()));
                return C33571bi.m72597a((File) null, strM72944c, "BuglyNativeLog.txt");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        synchronized (f69733w) {
            try {
                c cVar = f69724n;
                if (cVar != null && cVar.f69740a && (file = cVar.f69741b) != null && file.length() > 0) {
                    sb2.append(C33571bi.m72578a(f69724n.f69741b, f69715e, true));
                }
                StringBuilder sb3 = f69722l;
                if (sb3 != null && sb3.length() > 0) {
                    sb2.append(f69722l.toString());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return C33571bi.m72597a((File) null, sb2.toString(), "BuglyLog.txt");
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m72945c(String str, String str2, String str3) {
        try {
            if (f69729s && f69719i) {
                try {
                    if (f69730t) {
                        f69731u.execute(new a(str, str2, str3));
                    } else {
                        f69731u.execute(new b(str, str2, str3));
                    }
                } catch (Exception e11) {
                    C34012x4.m75435a(e11);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m72936a(int i11) {
        synchronized (f69733w) {
            try {
                f69720j = i11;
                if (i11 < 0) {
                    f69720j = 0;
                } else if (i11 > 102400) {
                    f69720j = f69713c;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m72939a(boolean z11) {
        C34012x4.m75442d("[LogUtil] Whether can record user log into native: " + z11, new Object[0]);
        f69730t = z11;
    }

    /* JADX INFO: renamed from: a */
    public static void m72938a(String str, String str2, Throwable th2) {
        if (th2 == null) {
            return;
        }
        String message = th2.getMessage();
        if (message == null) {
            message = "";
        }
        m72945c(str, str2, message + '\n' + C33571bi.m72581a(th2));
    }

    /* JADX INFO: renamed from: a */
    public static String m72935a(String str, String str2, String str3, long j11) {
        String string;
        f69721k.setLength(0);
        if (str3.length() > 30720) {
            str3 = str3.substring(str3.length() - f69715e, str3.length() - 1);
        }
        Date date = new Date();
        if (f69718h != null) {
            string = C33571bi.m72582a(date);
        } else {
            string = date.toString();
        }
        StringBuilder sb2 = f69721k;
        sb2.append(string);
        sb2.append(f69716f);
        sb2.append(f69732v);
        sb2.append(f69716f);
        sb2.append(j11);
        sb2.append(f69716f);
        sb2.append(str);
        sb2.append(f69716f);
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(str3);
        sb2.append(f69717g);
        return f69721k.toString();
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m72941a() {
        if (f69719i) {
            return C33571bi.m72597a((File) null, f69722l.toString(), "BuglyLog.txt");
        }
        return null;
    }
}
