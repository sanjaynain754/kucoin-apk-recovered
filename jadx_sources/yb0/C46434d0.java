package yb0;

import ac0.C0234d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.bugly.proguard.C33627eb;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import zb0.C46750a;

/* JADX INFO: renamed from: yb0.d0 */
/* JADX INFO: compiled from: SqflitePlugin.java */
/* JADX INFO: loaded from: classes23.dex */
public class C46434d0 implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: i */
    public static String f104117i;

    /* JADX INFO: renamed from: m */
    public static InterfaceC46448p f104121m;

    /* JADX INFO: renamed from: b */
    public Context f104122b;

    /* JADX INFO: renamed from: c */
    public MethodChannel f104123c;

    /* JADX INFO: renamed from: d */
    public static final Map<String, Integer> f104112d = new HashMap();

    /* JADX INFO: renamed from: e */
    @SuppressLint({"UseSparseArrays"})
    public static final Map<Integer, C46443k> f104113e = new HashMap();

    /* JADX INFO: renamed from: f */
    public static final Object f104114f = new Object();

    /* JADX INFO: renamed from: g */
    public static final Object f104115g = new Object();

    /* JADX INFO: renamed from: h */
    public static int f104116h = 0;

    /* JADX INFO: renamed from: j */
    public static int f104118j = 0;

    /* JADX INFO: renamed from: k */
    public static int f104119k = 1;

    /* JADX INFO: renamed from: l */
    public static int f104120l = 0;

    /* JADX INFO: renamed from: yb0.d0$a */
    /* JADX INFO: compiled from: SqflitePlugin.java */
    /* JADX INFO: loaded from: classes59.dex */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C46443k f104124b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ MethodChannel.Result f104125c;

        public a(C46443k c46443k, MethodChannel.Result result) {
            this.f104124b = c46443k;
            this.f104125c = result;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C46434d0.f104115g) {
                C46434d0.this.m102419l(this.f104124b);
            }
            this.f104125c.success(null);
        }
    }

    /* JADX INFO: renamed from: yb0.d0$b */
    /* JADX INFO: compiled from: SqflitePlugin.java */
    /* JADX INFO: loaded from: classes59.dex */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C46443k f104127b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f104128c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ MethodChannel.Result f104129d;

        public b(C46443k c46443k, String str, MethodChannel.Result result) {
            this.f104127b = c46443k;
            this.f104128c = str;
            this.f104129d = result;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C46434d0.f104115g) {
                C46443k c46443k = this.f104127b;
                if (c46443k != null) {
                    C46434d0.this.m102419l(c46443k);
                }
                try {
                    if (C46451s.m102502c(C46434d0.f104116h)) {
                        Log.d("Sqflite", "delete database " + this.f104128c);
                    }
                    C46443k.m102450o(this.f104128c);
                } catch (Exception e11) {
                    Log.e("Sqflite", "error " + e11 + " while closing database " + C46434d0.f104120l);
                }
            }
            this.f104129d.success(null);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f104122b = null;
        this.f104123c.setMethodCallHandler(null);
        this.f104123c = null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a A[Catch: all -> 0x0040, Exception -> 0x004e, TryCatch #2 {Exception -> 0x004e, blocks: (B:16:0x0042, B:18:0x004a, B:21:0x0050), top: B:46:0x0042, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0050 A[Catch: all -> 0x0040, Exception -> 0x004e, TRY_LEAVE, TryCatch #2 {Exception -> 0x004e, blocks: (B:16:0x0042, B:18:0x004a, B:21:0x0050), top: B:46:0x0042, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064 A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:25:0x0058, B:28:0x0064, B:29:0x006d), top: B:44:0x0058, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0076 A[Catch: all -> 0x0040, TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0019, B:9:0x001f, B:11:0x0025, B:12:0x003e, B:16:0x0042, B:18:0x004a, B:22:0x0053, B:23:0x0055, B:30:0x006e, B:32:0x0076, B:33:0x009c, B:37:0x00a7, B:21:0x0050, B:38:0x00a8, B:39:0x00b0, B:25:0x0058, B:28:0x0064, B:29:0x006d), top: B:43:0x0005, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x0076, please report this as an issue */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m102402d(boolean z11, String str, MethodChannel.Result result, Boolean bool, C46443k c46443k, MethodCall methodCall, boolean z12, int i11) {
        synchronized (f104115g) {
            if (z11) {
                if (Boolean.TRUE.equals(bool)) {
                    c46443k.m102460H();
                } else {
                    c46443k.m102459G();
                }
                synchronized (f104114f) {
                    if (!z12) {
                        f104113e.put(Integer.valueOf(i11), c46443k);
                        if (C46451s.m102501b(c46443k.f104147d)) {
                            Log.d("Sqflite", c46443k.m102453A() + "opened " + i11 + C33627eb.f69716f + str);
                        }
                        result.success(m102411p(i11, false, false));
                        return;
                    }
                    f104112d.put(str, Integer.valueOf(i11));
                    f104113e.put(Integer.valueOf(i11), c46443k);
                    if (C46451s.m102501b(c46443k.f104147d)) {
                        Log.d("Sqflite", c46443k.m102453A() + "opened " + i11 + C33627eb.f69716f + str);
                    }
                    result.success(m102411p(i11, false, false));
                    return;
                }
            }
            File file = new File(new File(str).getParent());
            if (!file.exists() && !file.mkdirs() && !file.exists()) {
                result.error("sqlite_error", "open_failed " + str, null);
                return;
            }
            try {
                if (Boolean.TRUE.equals(bool)) {
                    c46443k.m102460H();
                } else {
                    c46443k.m102459G();
                }
                synchronized (f104114f) {
                    if (!z12) {
                        try {
                            f104112d.put(str, Integer.valueOf(i11));
                            f104113e.put(Integer.valueOf(i11), c46443k);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } else {
                        f104113e.put(Integer.valueOf(i11), c46443k);
                    }
                }
                if (C46451s.m102501b(c46443k.f104147d)) {
                    Log.d("Sqflite", c46443k.m102453A() + "opened " + i11 + C33627eb.f69716f + str);
                }
                result.success(m102411p(i11, false, false));
                return;
            } catch (Exception e11) {
                c46443k.m102456D(e11, new C0234d(methodCall, result));
                return;
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: o */
    public static boolean m102410o(String str) {
        return str == null || str.equals(":memory:");
    }

    /* JADX INFO: renamed from: p */
    public static Map m102411p(int i11, boolean z11, boolean z12) {
        HashMap map = new HashMap();
        map.put("id", Integer.valueOf(i11));
        if (z11) {
            map.put("recovered", Boolean.TRUE);
        }
        if (z12) {
            map.put("recoveredInTransaction", Boolean.TRUE);
        }
        return map;
    }

    /* JADX INFO: renamed from: q */
    private void m102412q(Context context, BinaryMessenger binaryMessenger) {
        this.f104122b = context;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.tekartik.sqflite", StandardMethodCodec.INSTANCE, binaryMessenger.makeBackgroundTaskQueue());
        this.f104123c = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    /* JADX INFO: renamed from: B */
    public void m102414B(MethodCall methodCall, MethodChannel.Result result) {
        Object objArgument = methodCall.argument("androidThreadPriority");
        if (objArgument != null) {
            f104118j = ((Integer) objArgument).intValue();
        }
        Object objArgument2 = methodCall.argument("androidThreadCount");
        if (objArgument2 != null && !objArgument2.equals(Integer.valueOf(f104119k))) {
            f104119k = ((Integer) objArgument2).intValue();
            InterfaceC46448p interfaceC46448p = f104121m;
            if (interfaceC46448p != null) {
                interfaceC46448p.mo102493c();
                f104121m = null;
            }
        }
        Integer numM102500a = C46451s.m102500a(methodCall);
        if (numM102500a != null) {
            f104116h = numM102500a.intValue();
        }
        result.success(null);
    }

    /* JADX INFO: renamed from: l */
    public final void m102419l(C46443k c46443k) {
        try {
            if (C46451s.m102501b(c46443k.f104147d)) {
                Log.d("Sqflite", c46443k.m102453A() + "closing database ");
            }
            c46443k.m102467k();
        } catch (Exception e11) {
            Log.e("Sqflite", "error " + e11 + " while closing database " + f104120l);
        }
        synchronized (f104114f) {
            try {
                if (f104113e.isEmpty() && f104121m != null) {
                    if (C46451s.m102501b(c46443k.f104147d)) {
                        Log.d("Sqflite", c46443k.m102453A() + "stopping thread");
                    }
                    f104121m.mo102493c();
                    f104121m = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final C46443k m102420m(int i11) {
        return f104113e.get(Integer.valueOf(i11));
    }

    /* JADX INFO: renamed from: n */
    public final C46443k m102421n(MethodCall methodCall, MethodChannel.Result result) {
        int iIntValue = ((Integer) methodCall.argument("id")).intValue();
        C46443k c46443kM102420m = m102420m(iIntValue);
        if (c46443kM102420m != null) {
            return c46443kM102420m;
        }
        result.error("sqlite_error", "database_closed " + iIntValue, null);
        return null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "execute":
                m102428x(methodCall, result);
                break;
            case "closeDatabase":
                m102423s(methodCall, result);
                break;
            case "options":
                m102414B(methodCall, result);
                break;
            case "insert":
                m102430z(methodCall, result);
                break;
            case "update":
                m102418F(methodCall, result);
                break;
            case "androidSetLocale":
                m102417E(methodCall, result);
                break;
            case "deleteDatabase":
                m102427w(methodCall, result);
                break;
            case "debugMode":
                m102426v(methodCall, result);
                break;
            case "openDatabase":
                m102413A(methodCall, result);
                break;
            case "batch":
                m102422r(methodCall, result);
                break;
            case "debug":
                m102425u(methodCall, result);
                break;
            case "query":
                m102415C(methodCall, result);
                break;
            case "databaseExists":
                m102424t(methodCall, result);
                break;
            case "queryCursorNext":
                m102416D(methodCall, result);
                break;
            case "getPlatformVersion":
                result.success("Android " + Build.VERSION.RELEASE);
                break;
            case "getDatabasesPath":
                m102429y(methodCall, result);
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m102423s(MethodCall methodCall, MethodChannel.Result result) {
        Integer num = (Integer) methodCall.argument("id");
        int iIntValue = num.intValue();
        C46443k c46443kM102421n = m102421n(methodCall, result);
        if (c46443kM102421n == null) {
            return;
        }
        if (C46451s.m102501b(c46443kM102421n.f104147d)) {
            Log.d("Sqflite", c46443kM102421n.m102453A() + "closing " + iIntValue + C33627eb.f69716f + c46443kM102421n.f104145b);
        }
        String str = c46443kM102421n.f104145b;
        synchronized (f104114f) {
            try {
                f104113e.remove(num);
                if (c46443kM102421n.f104144a) {
                    f104112d.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f104121m.m102494d(c46443kM102421n, new a(c46443kM102421n, result));
    }

    /* JADX INFO: renamed from: u */
    public final void m102425u(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) methodCall.argument(C33556b3.f69058j2);
        HashMap map = new HashMap();
        if ("get".equals(str)) {
            int i11 = f104116h;
            if (i11 > 0) {
                map.put("logLevel", Integer.valueOf(i11));
            }
            Map<Integer, C46443k> map2 = f104113e;
            if (!map2.isEmpty()) {
                HashMap map3 = new HashMap();
                for (Map.Entry<Integer, C46443k> entry : map2.entrySet()) {
                    C46443k value = entry.getValue();
                    HashMap map4 = new HashMap();
                    map4.put("path", value.f104145b);
                    map4.put("singleInstance", Boolean.valueOf(value.f104144a));
                    int i12 = value.f104147d;
                    if (i12 > 0) {
                        map4.put("logLevel", Integer.valueOf(i12));
                    }
                    map3.put(entry.getKey().toString(), map4);
                }
                map.put("databases", map3);
            }
        }
        result.success(map);
    }

    /* JADX INFO: renamed from: y */
    public void m102429y(MethodCall methodCall, MethodChannel.Result result) {
        if (f104117i == null) {
            f104117i = this.f104122b.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        result.success(f104117i);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m102405g(MethodCall methodCall, C46443k c46443k, MethodChannel.Result result) {
        try {
            c46443k.f104152i.setLocale(C46438f0.m102440d((String) methodCall.argument("locale")));
            result.success(null);
        } catch (Exception e11) {
            result.error("sqlite_error", "Error calling setLocale: " + e11.getMessage(), null);
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m102413A(final MethodCall methodCall, final MethodChannel.Result result) {
        boolean z11;
        final int i11;
        C46443k c46443k;
        String str;
        final String str2 = (String) methodCall.argument("path");
        final Boolean bool = (Boolean) methodCall.argument("readOnly");
        final boolean zM102410o = m102410o(str2);
        if (!Boolean.FALSE.equals(methodCall.argument("singleInstance")) && !zM102410o) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            synchronized (f104114f) {
                try {
                    if (C46451s.m102502c(f104116h)) {
                        Log.d("Sqflite", "Look for " + str2 + " in " + f104112d.keySet());
                    }
                    Integer num = f104112d.get(str2);
                    if (num != null && (c46443k = f104113e.get(num)) != null) {
                        if (!c46443k.f104152i.isOpen()) {
                            if (C46451s.m102502c(f104116h)) {
                                Log.d("Sqflite", c46443k.m102453A() + "single instance database of " + str2 + " not opened");
                            }
                        } else {
                            if (C46451s.m102502c(f104116h)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(c46443k.m102453A());
                                sb2.append("re-opened single instance ");
                                if (c46443k.m102458F()) {
                                    str = "(in transaction) ";
                                } else {
                                    str = "";
                                }
                                sb2.append(str);
                                sb2.append(num);
                                sb2.append(C33627eb.f69716f);
                                sb2.append(str2);
                                Log.d("Sqflite", sb2.toString());
                            }
                            result.success(m102411p(num.intValue(), true, c46443k.m102458F()));
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        Object obj = f104114f;
        synchronized (obj) {
            i11 = f104120l + 1;
            f104120l = i11;
        }
        final C46443k c46443k2 = new C46443k(this.f104122b, str2, i11, z11, f104116h);
        synchronized (obj) {
            try {
                if (f104121m == null) {
                    InterfaceC46448p interfaceC46448pM102491a = InterfaceC46448p.m102491a("Sqflite", f104119k, f104118j);
                    f104121m = interfaceC46448pM102491a;
                    interfaceC46448pM102491a.start();
                    if (C46451s.m102501b(c46443k2.f104147d)) {
                        Log.d("Sqflite", c46443k2.m102453A() + "starting worker pool with priority " + f104118j);
                    }
                }
                c46443k2.f104151h = f104121m;
                if (C46451s.m102501b(c46443k2.f104147d)) {
                    Log.d("Sqflite", c46443k2.m102453A() + "opened " + i11 + C33627eb.f69716f + str2);
                }
                final boolean z12 = z11;
                f104121m.m102494d(c46443k2, new Runnable() { // from class: yb0.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        C46434d0.m102402d(zM102410o, str2, result, bool, c46443k2, methodCall, z12, i11);
                    }
                });
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m102415C(final MethodCall methodCall, final MethodChannel.Result result) {
        final C46443k c46443kM102421n = m102421n(methodCall, result);
        if (c46443kM102421n == null) {
            return;
        }
        f104121m.m102494d(c46443kM102421n, new Runnable() { // from class: yb0.x
            @Override // java.lang.Runnable
            public final void run() {
                c46443kM102421n.m102461I(new C0234d(methodCall, result));
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public final void m102416D(final MethodCall methodCall, final MethodChannel.Result result) {
        final C46443k c46443kM102421n = m102421n(methodCall, result);
        if (c46443kM102421n == null) {
            return;
        }
        f104121m.m102494d(c46443kM102421n, new Runnable() { // from class: yb0.v
            @Override // java.lang.Runnable
            public final void run() {
                c46443kM102421n.m102462J(new C0234d(methodCall, result));
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m102417E(final MethodCall methodCall, final MethodChannel.Result result) {
        final C46443k c46443kM102421n = m102421n(methodCall, result);
        if (c46443kM102421n == null) {
            return;
        }
        f104121m.m102494d(c46443kM102421n, new Runnable() { // from class: yb0.y
            @Override // java.lang.Runnable
            public final void run() {
                C46434d0.m102405g(methodCall, c46443kM102421n, result);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public final void m102418F(final MethodCall methodCall, final MethodChannel.Result result) {
        final C46443k c46443kM102421n = m102421n(methodCall, result);
        if (c46443kM102421n == null) {
            return;
        }
        f104121m.m102494d(c46443kM102421n, new Runnable() { // from class: yb0.b0
            @Override // java.lang.Runnable
            public final void run() {
                c46443kM102421n.m102464L(new C0234d(methodCall, result));
            }
        });
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m102412q(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
    }

    /* JADX INFO: renamed from: r */
    public final void m102422r(final MethodCall methodCall, final MethodChannel.Result result) {
        final C46443k c46443kM102421n = m102421n(methodCall, result);
        if (c46443kM102421n == null) {
            return;
        }
        f104121m.m102494d(c46443kM102421n, new Runnable() { // from class: yb0.c0
            @Override // java.lang.Runnable
            public final void run() {
                c46443kM102421n.m102466h(methodCall, result);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m102424t(MethodCall methodCall, MethodChannel.Result result) {
        result.success(Boolean.valueOf(C46443k.m102451x((String) methodCall.argument("path"))));
    }

    /* JADX INFO: renamed from: v */
    public final void m102426v(MethodCall methodCall, MethodChannel.Result result) {
        boolean z11;
        C46750a.f104573a = Boolean.TRUE.equals(methodCall.arguments());
        if (C46750a.f104574b && C46750a.f104573a) {
            z11 = true;
        } else {
            z11 = false;
        }
        C46750a.f104575c = z11;
        if (C46750a.f104573a) {
            if (C46750a.f104575c) {
                f104116h = 2;
            } else if (C46750a.f104573a) {
                f104116h = 1;
            }
        } else {
            f104116h = 0;
        }
        result.success(null);
    }

    /* JADX INFO: renamed from: w */
    public final void m102427w(MethodCall methodCall, MethodChannel.Result result) {
        C46443k c46443k;
        Map<Integer, C46443k> map;
        String str;
        String str2 = (String) methodCall.argument("path");
        synchronized (f104114f) {
            try {
                if (C46451s.m102502c(f104116h)) {
                    Log.d("Sqflite", "Look for " + str2 + " in " + f104112d.keySet());
                }
                Map<String, Integer> map2 = f104112d;
                Integer num = map2.get(str2);
                if (num != null && (c46443k = (map = f104113e).get(num)) != null && c46443k.f104152i.isOpen()) {
                    if (C46451s.m102502c(f104116h)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(c46443k.m102453A());
                        sb2.append("found single instance ");
                        if (c46443k.m102458F()) {
                            str = "(in transaction) ";
                        } else {
                            str = "";
                        }
                        sb2.append(str);
                        sb2.append(num);
                        sb2.append(C33627eb.f69716f);
                        sb2.append(str2);
                        Log.d("Sqflite", sb2.toString());
                    }
                    map.remove(num);
                    map2.remove(str2);
                } else {
                    c46443k = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        b bVar = new b(c46443k, str2, result);
        InterfaceC46448p interfaceC46448p = f104121m;
        if (interfaceC46448p != null) {
            interfaceC46448p.m102494d(c46443k, bVar);
        } else {
            bVar.run();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m102428x(final MethodCall methodCall, final MethodChannel.Result result) {
        final C46443k c46443kM102421n = m102421n(methodCall, result);
        if (c46443kM102421n == null) {
            return;
        }
        f104121m.m102494d(c46443kM102421n, new Runnable() { // from class: yb0.a0
            @Override // java.lang.Runnable
            public final void run() {
                c46443kM102421n.m102477v(new C0234d(methodCall, result));
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public final void m102430z(final MethodCall methodCall, final MethodChannel.Result result) {
        final C46443k c46443kM102421n = m102421n(methodCall, result);
        if (c46443kM102421n == null) {
            return;
        }
        f104121m.m102494d(c46443kM102421n, new Runnable() { // from class: yb0.w
            @Override // java.lang.Runnable
            public final void run() {
                c46443kM102421n.m102457E(new C0234d(methodCall, result));
            }
        });
    }
}
