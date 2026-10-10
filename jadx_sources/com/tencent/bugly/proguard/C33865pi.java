package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.facebook.soloader.MinElf;
import com.tencent.bugly.common.utils.ProcessUtil;
import com.tencent.bugly.matrix.backtrace.WeChatBacktraceNative;
import com.tencent.bugly.matrix.xlog.XLogNative;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.pi */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33865pi {

    /* JADX INFO: renamed from: g */
    public static final String f71460g = "Matrix.Backtrace";

    /* JADX INFO: renamed from: h */
    public static final String f71461h = "/apex/com.android.runtime/lib/";

    /* JADX INFO: renamed from: i */
    public static final String f71462i = "/apex/com.android.runtime/lib64/";

    /* JADX INFO: renamed from: j */
    public static final String f71463j = "/system/lib/";

    /* JADX INFO: renamed from: k */
    public static final String f71464k = "/system/lib64/";

    /* JADX INFO: renamed from: l */
    public static final String f71465l = "/system/framework/arm/";

    /* JADX INFO: renamed from: m */
    public static final String f71466m = "/system/framework/arm64/";

    /* JADX INFO: renamed from: n */
    public static final String f71467n = ":backtrace__";

    /* JADX INFO: renamed from: o */
    public static boolean f71468o = false;

    /* JADX INFO: renamed from: q */
    public static final String f71470q = "buglybacktrace";

    /* JADX INFO: renamed from: a */
    public volatile boolean f71472a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f71473b;

    /* JADX INFO: renamed from: c */
    public volatile c f71474c;

    /* JADX INFO: renamed from: d */
    public final C33739ji f71475d = new C33739ji();

    /* JADX INFO: renamed from: e */
    public final Handler f71476e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f */
    public boolean f71477f = false;

    /* JADX INFO: renamed from: p */
    public static ArrayList<String> f71469p = new ArrayList<>();

    /* JADX INFO: renamed from: r */
    public static boolean f71471r = false;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.pi$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C33865pi.this.m74612j();
            C33865pi.this.f71477f = false;
            C33865pi.this.m74613k();
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.pi$c */
    /* JADX INFO: compiled from: BUGLY */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public Context f71480a;

        /* JADX INFO: renamed from: b */
        public String f71481b;

        /* JADX INFO: renamed from: c */
        public HashSet<String> f71482c;

        /* JADX INFO: renamed from: d */
        public f f71483d;

        /* JADX INFO: renamed from: e */
        public e f71484e;

        /* JADX INFO: renamed from: f */
        public boolean f71485f;

        /* JADX INFO: renamed from: g */
        public boolean f71486g;

        /* JADX INFO: renamed from: h */
        public boolean f71487h;

        /* JADX INFO: renamed from: i */
        public boolean f71488i;

        /* JADX INFO: renamed from: j */
        public boolean f71489j;

        /* JADX INFO: renamed from: k */
        public h f71490k;

        /* JADX INFO: renamed from: l */
        public long f71491l;

        /* JADX INFO: renamed from: m */
        public boolean f71492m;

        /* JADX INFO: renamed from: n */
        public boolean f71493n;

        /* JADX INFO: renamed from: o */
        public String f71494o;

        /* JADX INFO: renamed from: p */
        public boolean f71495p;

        /* JADX INFO: renamed from: q */
        public final C33865pi f71496q;

        /* JADX INFO: renamed from: a */
        public c m74616a(f fVar) {
            if (!this.f71495p && fVar != null) {
                this.f71483d = fVar;
            }
            return this;
        }

        /* JADX INFO: renamed from: b */
        public c m74620b(String str) {
            if (this.f71495p) {
                return this;
            }
            this.f71481b = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public c m74623c() {
            if (this.f71495p) {
                return this;
            }
            this.f71486g = true;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public c m74626d(boolean z11) {
            if (this.f71495p) {
                return this;
            }
            this.f71492m = z11;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public c m74627e(boolean z11) {
            if (this.f71495p) {
                return this;
            }
            this.f71488i = z11;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public c m74628f(boolean z11) {
            if (this.f71495p) {
                return this;
            }
            this.f71489j = z11;
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("\nWeChat backtrace configurations: \n>>> Backtrace Mode: ");
            sb2.append(this.f71483d);
            sb2.append("\n>>> Quicken always on: ");
            sb2.append(this.f71486g);
            sb2.append("\n>>> Saving Path: ");
            String strM74461a = this.f71481b;
            if (strM74461a == null) {
                strM74461a = C33844oi.m74461a(this);
            }
            sb2.append(strM74461a);
            sb2.append("\n>>> Custom Library Loader: ");
            sb2.append(this.f71484e != null);
            sb2.append("\n>>> Directories to Warm-up: ");
            sb2.append(this.f71482c.toString());
            sb2.append("\n>>> Is Warm-up Process: ");
            sb2.append(this.f71488i);
            sb2.append("\n>>> Warm-up Timing: ");
            sb2.append(this.f71490k);
            sb2.append("\n>>> Warm-up Delay: ");
            sb2.append(this.f71491l);
            sb2.append("ms\n>>> Warm-up in isolate process: ");
            sb2.append(this.f71489j);
            sb2.append("\n>>> Enable logger: ");
            sb2.append(this.f71492m);
            sb2.append("\n>>> Enable Isolate Process logger: ");
            sb2.append(this.f71493n);
            sb2.append("\n>>> Path of XLog: ");
            sb2.append(this.f71494o);
            sb2.append("\n>>> Cool-down: ");
            sb2.append(this.f71485f);
            sb2.append("\n>>> Cool-down if Apk Updated: ");
            sb2.append(this.f71487h);
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            return sb2.toString();
        }

        public c(Context context, C33865pi c33865pi) {
            HashSet<String> hashSet = new HashSet<>();
            this.f71482c = hashSet;
            this.f71483d = f.Quicken;
            this.f71484e = null;
            this.f71485f = false;
            this.f71486g = false;
            this.f71487h = true;
            this.f71488i = false;
            this.f71489j = true;
            this.f71490k = h.WhileScreenOff;
            this.f71491l = 3000L;
            this.f71492m = false;
            this.f71493n = false;
            this.f71494o = null;
            this.f71495p = false;
            this.f71480a = context;
            this.f71496q = c33865pi;
            hashSet.add(context.getApplicationInfo().nativeLibraryDir);
            this.f71482c.add(C33865pi.m74601d());
            this.f71482c.add(C33865pi.m74599c());
            this.f71482c.add(C33865pi.m74597b(context));
            this.f71482c.add(C33865pi.m74596b() + "boot.oat");
            this.f71482c.add(C33865pi.m74596b() + "boot-framework.oat");
            this.f71488i = ProcessUtil.isMainProcess(this.f71480a);
        }

        /* JADX INFO: renamed from: a */
        public c m74615a(e eVar) {
            if (this.f71495p) {
                return this;
            }
            this.f71484e = eVar;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public c m74621b(boolean z11) {
            if (this.f71495p) {
                return this;
            }
            this.f71487h = z11;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public c m74624c(String str) {
            if (this.f71495p) {
                return this;
            }
            this.f71494o = str;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public c m74618a(String str) {
            if (this.f71495p) {
                return this;
            }
            this.f71482c.add(str);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public void m74622b() throws Throwable {
            if (this.f71495p) {
                return;
            }
            this.f71495p = true;
            this.f71496q.m74608a(this);
        }

        /* JADX INFO: renamed from: c */
        public c m74625c(boolean z11) {
            if (this.f71495p) {
                return this;
            }
            this.f71493n = z11;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public c m74614a() {
            if (this.f71495p) {
                return this;
            }
            this.f71482c.clear();
            return this;
        }

        /* JADX INFO: renamed from: a */
        public c m74619a(boolean z11) {
            if (this.f71495p) {
                return this;
            }
            this.f71485f = z11;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public c m74617a(h hVar, long j11) {
            if (this.f71495p) {
                return this;
            }
            this.f71490k = hVar;
            this.f71491l = j11;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.pi$e */
    /* JADX INFO: compiled from: BUGLY */
    public interface e {
        /* JADX INFO: renamed from: a */
        void m74629a(String str);
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.pi$f */
    /* JADX INFO: compiled from: BUGLY */
    public enum f {
        Fp(0),
        Quicken(1),
        Dwarf(2),
        FpUntilQuickenWarmedUp(3),
        DwarfUntilQuickenWarmedUp(4);


        /* JADX INFO: renamed from: b */
        public int f71503b;

        @Override // java.lang.Enum
        public String toString() {
            int i11 = b.f71479a[ordinal()];
            if (i11 == 1) {
                return "FramePointer-based.";
            }
            if (i11 == 2) {
                return "QuickenUnwindTable-based.";
            }
            if (i11 == 3) {
                return "Dwarf-based.";
            }
            if (i11 != 4) {
                return i11 != 5 ? "Unreachable." : "Use dwarf-based backtrace before quicken has warmed up.";
            }
            return "Use fp-based backtrace before quicken has warmed up.";
        }

        f(int i11) {
            this.f71503b = i11;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.pi$g */
    /* JADX INFO: compiled from: BUGLY */
    public static final class g {

        /* JADX INFO: renamed from: a */
        public static final C33865pi f71504a = new C33865pi();
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.pi$h */
    /* JADX INFO: compiled from: BUGLY */
    public enum h {
        WhileScreenOff,
        WhileCharging,
        PostStartup
    }

    /* JADX INFO: renamed from: c */
    public static String m74599c() {
        return !m74604g() ? f71461h : f71462i;
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.pi$b */
    /* JADX INFO: compiled from: BUGLY */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f71479a;

        static {
            int[] iArr = new int[f.values().length];
            f71479a = iArr;
            try {
                iArr[f.Fp.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71479a[f.Quicken.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71479a[f.Dwarf.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71479a[f.FpUntilQuickenWarmedUp.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f71479a[f.DwarfUntilQuickenWarmedUp.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.pi$d */
    /* JADX INFO: compiled from: BUGLY */
    public static final class d extends RuntimeException {
        public d(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m74596b() {
        return !m74604g() ? f71465l : f71466m;
    }

    /* JADX INFO: renamed from: e */
    public static void m74602e() throws Throwable {
        if (f71468o) {
            return;
        }
        f71468o = true;
        c cVarM74617a = g.f71504a.m74606a(C33598d3.m72772c()).m74616a(f.Quicken).m74617a(h.PostStartup, 0L);
        ArrayList<String> arrayList = f71469p;
        if (arrayList != null && arrayList.size() > 0) {
            for (String str : f71469p) {
                if (new File(str).exists()) {
                    cVarM74617a.m74618a(str);
                }
            }
        }
        cVarM74617a.m74628f(false).m74622b();
    }

    /* JADX INFO: renamed from: f */
    public static C33865pi m74603f() {
        return g.f71504a;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m74604g() {
        String str = Build.CPU_ABI;
        return MinElf.ISA.AARCH64.equalsIgnoreCase(str) || MinElf.ISA.X86_64.equalsIgnoreCase(str) || "mips64".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: i */
    public static void m74605i() {
        System.loadLibrary(f71470q);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m74610c(c cVar) {
        String currentProcessName = ProcessUtil.getCurrentProcessName(cVar.f71480a);
        return currentProcessName != null && currentProcessName.endsWith(f71467n);
    }

    /* JADX INFO: renamed from: h */
    public boolean m74611h() {
        return this.f71475d.m73590b();
    }

    /* JADX INFO: renamed from: j */
    public final void m74612j() {
        if (this.f71472a && this.f71473b) {
            this.f71475d.m73591c();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m74613k() {
        if (this.f71477f) {
            return;
        }
        this.f71477f = false;
        this.f71476e.postDelayed(new a(), C33918sa.f71848h);
    }

    /* JADX INFO: renamed from: b */
    public static String m74597b(Context context) {
        return new File(new File(context.getApplicationInfo().nativeLibraryDir).getParentFile().getParentFile(), C33778lf.m73987a("/oat/", !m74604g() ? "arm" : "arm64", "/base.odex")).getAbsolutePath();
    }

    /* JADX INFO: renamed from: d */
    public static String m74601d() {
        if (!m74604g()) {
            return f71463j;
        }
        return f71464k;
    }

    /* JADX INFO: renamed from: a */
    public static void m74592a(ArrayList<String> arrayList) {
        f71469p.addAll(arrayList);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m74600c(Context context) {
        return C33844oi.m74477j(context).exists();
    }

    /* JADX INFO: renamed from: a */
    public static void m74588a(InterfaceC33781li interfaceC33781li) {
        C33739ji.f70412o = interfaceC33781li;
    }

    /* JADX INFO: renamed from: a */
    public synchronized c m74606a(Context context) {
        if (this.f71474c != null) {
            return this.f71474c;
        }
        this.f71474c = new c(context, this);
        this.f71472a = true;
        return this.f71474c;
    }

    /* JADX INFO: renamed from: b */
    public final void m74609b(c cVar) throws Throwable {
        if (cVar.f71488i) {
            File fileM74477j = C33844oi.m74477j(cVar.f71480a);
            if (cVar.f71487h && fileM74477j.exists()) {
                String strM74462a = C33844oi.m74462a(fileM74477j, 4096);
                if (strM74462a == null) {
                    cVar.f71485f = true;
                } else if (!strM74462a.split(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE)[0].equalsIgnoreCase(cVar.f71480a.getApplicationInfo().nativeLibraryDir)) {
                    C33858pb.m74520c(f71460g, "Apk updated, remove warmed-up file.", new Object[0]);
                    cVar.f71485f = true;
                }
            }
            if (cVar.f71485f) {
                fileM74477j.delete();
                C33844oi.m74476i(cVar.f71480a).delete();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public String m74607a() {
        return this.f71475d.f70414b;
    }

    /* JADX INFO: renamed from: a */
    public static void m74589a(e eVar) {
        if (f71471r) {
            return;
        }
        if (eVar == null) {
            System.loadLibrary(f71470q);
        } else {
            C33858pb.m74520c(f71460g, "Using custom library loader: %s.", eVar);
            eVar.m74629a(f71470q);
        }
        f71471r = true;
    }

    /* JADX INFO: renamed from: a */
    public static void m74593a(boolean z11) {
        WeChatBacktraceNative.enableLogger(z11);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX INFO: renamed from: a */
    public final void m74608a(c cVar) throws Throwable {
        if (m74610c(cVar)) {
            C33858pb.m74520c(f71460g, "Isolate process does not need any configuration.", new Object[0]);
            return;
        }
        if (cVar.f71489j && cVar.f71484e != null) {
            throw new d("Custom library loader is not supported in isolate process warm-up mode.");
        }
        m74589a(cVar.f71484e);
        XLogNative.m72236a(cVar.f71494o);
        WeChatBacktraceNative.enableLogger(cVar.f71492m);
        C33858pb.m74520c(f71460g, cVar.toString(), new Object[0]);
        f fVar = cVar.f71483d;
        f fVar2 = f.Fp;
        if (fVar == fVar2 || fVar == f.Dwarf) {
            WeChatBacktraceNative.setBacktraceMode(fVar.f71503b);
        }
        f fVar3 = cVar.f71483d;
        f fVar4 = f.Quicken;
        if (fVar3 == fVar4 || fVar3 == f.FpUntilQuickenWarmedUp || fVar3 == f.DwarfUntilQuickenWarmedUp || cVar.f71486g) {
            String strM74469c = C33844oi.m74469c(cVar);
            C33858pb.m74520c(f71460g, "Set saving path: %s", strM74469c);
            new File(strM74469c).mkdirs();
            String str = File.separator;
            if (!strM74469c.endsWith(str)) {
                strM74469c = strM74469c + str;
            }
            this.f71475d.m73586a(strM74469c);
            m74609b(cVar);
            this.f71475d.m73584a(cVar);
            boolean zExists = C33844oi.m74477j(cVar.f71480a).exists();
            f fVar5 = cVar.f71483d;
            if (fVar5 == fVar4 || !cVar.f71486g) {
                if (zExists) {
                    fVar2 = fVar4;
                } else if (fVar5 != f.FpUntilQuickenWarmedUp) {
                    if (fVar5 == f.DwarfUntilQuickenWarmedUp) {
                        fVar2 = f.Dwarf;
                    } else {
                        fVar2 = fVar4;
                    }
                }
                WeChatBacktraceNative.setBacktraceMode(fVar2.f71503b);
            }
            C33858pb.m74520c(f71460g, "Has warmed up: %s", Boolean.valueOf(zExists));
            WeChatBacktraceNative.setWarmedUp(zExists);
            m74613k();
            if (!cVar.f71488i) {
                this.f71475d.m73585a(cVar, cVar.f71483d);
            }
        }
        this.f71473b = true;
    }

    /* JADX INFO: renamed from: a */
    public static int[] m74595a(String str) {
        return WeChatBacktraceNative.statistic(str);
    }
}
