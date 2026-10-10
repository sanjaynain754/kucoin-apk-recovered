package com.tencent.bugly.matrix.memguard;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.bugly.proguard.C33557b4;
import com.tencent.bugly.proguard.C33591ch;
import com.tencent.bugly.proguard.C33799mf;
import com.tencent.bugly.proguard.C33865pi;
import com.tencent.rmonitor.common.logger.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class MemGuard {

    /* JADX INFO: renamed from: a */
    public static final String f68733a = "MemGuard";

    /* JADX INFO: renamed from: b */
    public static final String f68734b = "matrix-hookcommon";

    /* JADX INFO: renamed from: c */
    public static final String f68735c = "matrix-memguard";

    /* JADX INFO: renamed from: d */
    public static final String f68736d = "MemGuard.IssueCB";

    /* JADX INFO: renamed from: e */
    public static final long f68737e = 5000;

    /* JADX INFO: renamed from: f */
    public static final String f68738f = ".txt";

    /* JADX INFO: renamed from: g */
    public static final boolean[] f68739g = {false};

    /* JADX INFO: renamed from: h */
    public static InterfaceC33528d f68740h = new C33525a();

    /* JADX INFO: compiled from: BUGLY */
    public static final class Options {

        /* JADX INFO: renamed from: a */
        public static final int f68741a = 8192;

        /* JADX INFO: renamed from: b */
        public static final int f68742b = 4096;

        /* JADX INFO: renamed from: c */
        public static final int f68743c = 5;

        /* JADX INFO: renamed from: d */
        public static final int f68744d = 30;

        /* JADX INFO: renamed from: e */
        public static final boolean f68745e = false;

        /* JADX INFO: renamed from: f */
        public static final boolean f68746f = false;

        /* JADX INFO: renamed from: g */
        public static final String f68747g = ".*/lib.*\\.so$";

        @Keep
        public boolean ignoreOverlappedReading;

        @Keep
        public String[] ignoredSOPatterns;

        @Keep
        public String issueDumpFilePath;

        @Keep
        public int maxAllocationSize;

        @Keep
        public int maxDetectableAllocationCount;

        @Keep
        public int maxSkippedAllocationCount;

        @Keep
        public int percentageOfLeftSideGuard;

        @Keep
        public boolean perfectRightSideGuard;

        @Keep
        public String[] targetSOPatterns;

        /* JADX INFO: renamed from: com.tencent.bugly.matrix.memguard.MemGuard$Options$a */
        /* JADX INFO: compiled from: BUGLY */
        public static class C33524a {

            /* JADX INFO: renamed from: a */
            public Context f68748a;

            /* JADX INFO: renamed from: b */
            public int f68749b;

            /* JADX INFO: renamed from: c */
            public int f68750c;

            /* JADX INFO: renamed from: d */
            public int f68751d;

            /* JADX INFO: renamed from: e */
            public int f68752e;

            /* JADX INFO: renamed from: f */
            public boolean f68753f;

            /* JADX INFO: renamed from: g */
            public boolean f68754g;

            /* JADX INFO: renamed from: h */
            public String f68755h;

            /* JADX INFO: renamed from: i */
            public final List<String> f68756i;

            /* JADX INFO: renamed from: j */
            public final List<String> f68757j;

            @NonNull
            /* JADX INFO: renamed from: a */
            public C33524a m72215a(int i11) {
                this.f68750c = i11;
                return this;
            }

            @NonNull
            /* JADX INFO: renamed from: b */
            public C33524a m72220b(int i11) {
                this.f68749b = i11;
                return this;
            }

            @NonNull
            /* JADX INFO: renamed from: c */
            public C33524a m72224c(int i11) {
                this.f68751d = i11;
                return this;
            }

            /* JADX INFO: renamed from: d */
            public int m72226d() {
                return this.f68749b;
            }

            @NonNull
            /* JADX INFO: renamed from: a */
            public C33524a m72218a(boolean z11) {
                this.f68754g = z11;
                return this;
            }

            @NonNull
            /* JADX INFO: renamed from: b */
            public C33524a m72222b(boolean z11) {
                this.f68753f = z11;
                return this;
            }

            @Nullable
            /* JADX INFO: renamed from: c */
            public String m72225c() {
                return this.f68755h;
            }

            @NonNull
            /* JADX INFO: renamed from: d */
            public C33524a m72227d(int i11) {
                this.f68752e = i11;
                return this;
            }

            /* JADX INFO: renamed from: e */
            public int m72228e() {
                return this.f68750c;
            }

            /* JADX INFO: renamed from: f */
            public int m72229f() {
                return this.f68751d;
            }

            /* JADX INFO: renamed from: g */
            public int m72230g() {
                return this.f68752e;
            }

            @NonNull
            /* JADX INFO: renamed from: h */
            public List<String> m72231h() {
                return Collections.unmodifiableList(this.f68756i);
            }

            /* JADX INFO: renamed from: i */
            public boolean m72232i() {
                return this.f68754g;
            }

            /* JADX INFO: renamed from: j */
            public boolean m72233j() {
                return this.f68753f;
            }

            public C33524a(Context context) {
                this.f68748a = context;
                if (context instanceof Activity) {
                    this.f68748a = context.getApplicationContext();
                }
                this.f68749b = 8192;
                this.f68750c = 4096;
                this.f68751d = 5;
                this.f68752e = 30;
                this.f68753f = false;
                this.f68754g = false;
                this.f68755h = MemGuard.m72211b(context);
                this.f68756i = new ArrayList();
                this.f68757j = new ArrayList();
            }

            @NonNull
            /* JADX INFO: renamed from: a */
            public C33524a m72216a(@Nullable String str) {
                this.f68755h = str;
                return this;
            }

            @NonNull
            /* JADX INFO: renamed from: b */
            public C33524a m72221b(@NonNull String str, String... strArr) {
                this.f68756i.clear();
                this.f68756i.add(str);
                this.f68756i.addAll(Arrays.asList(strArr));
                return this;
            }

            @NonNull
            /* JADX INFO: renamed from: a */
            public C33524a m72217a(@NonNull String str, String... strArr) {
                this.f68757j.clear();
                this.f68757j.add(str);
                this.f68757j.addAll(Arrays.asList(strArr));
                return this;
            }

            @NonNull
            /* JADX INFO: renamed from: b */
            public List<String> m72223b() {
                return Collections.unmodifiableList(this.f68757j);
            }

            @NonNull
            /* JADX INFO: renamed from: a */
            public Options m72219a() {
                Options options = new Options();
                if (m72231h().isEmpty()) {
                    m72221b(Options.f68747g, new String[0]);
                }
                options.maxAllocationSize = m72226d();
                options.maxDetectableAllocationCount = m72228e();
                options.maxSkippedAllocationCount = m72229f();
                options.percentageOfLeftSideGuard = m72230g();
                options.perfectRightSideGuard = m72233j();
                options.ignoreOverlappedReading = m72232i();
                options.issueDumpFilePath = MemGuard.m72212b(this.f68748a, m72225c());
                options.targetSOPatterns = (String[]) m72231h().toArray(new String[0]);
                options.ignoredSOPatterns = (String[]) m72223b().toArray(new String[0]);
                return options;
            }
        }

        public /* synthetic */ Options(C33525a c33525a) {
            this();
        }

        public Options() {
        }

        public String toString() {
            return "Options{maxAllocationSize=" + this.maxAllocationSize + ", maxDetectableAllocationCount=" + this.maxDetectableAllocationCount + ", maxSkippedAllocationCount=" + this.maxSkippedAllocationCount + ", percentageOfLeftSideGuard=" + this.percentageOfLeftSideGuard + ", perfectRightSideGuard=" + this.perfectRightSideGuard + ", ignoreOverlappedReading=" + this.ignoreOverlappedReading + ", issueDumpFilePath=" + this.issueDumpFilePath + ", targetSOPatterns=" + Arrays.toString(this.targetSOPatterns) + ", ignoredSOPatterns=" + Arrays.toString(this.ignoredSOPatterns) + '}';
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.matrix.memguard.MemGuard$a */
    /* JADX INFO: compiled from: BUGLY */
    public class C33525a implements InterfaceC33528d {
        @Override // com.tencent.bugly.matrix.memguard.MemGuard.InterfaceC33528d
        /* JADX INFO: renamed from: a */
        public void mo72234a(@NonNull String str) throws Throwable {
            Throwable th2;
            BufferedReader bufferedReader;
            File file = new File(str);
            if (!file.exists()) {
                Logger.INSTANCE.mo77131e(MemGuard.f68733a, "Dump file %s does not exist, dump failure ?", str);
                return;
            }
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            try {
                                bufferedReader.close();
                                return;
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                        Logger.INSTANCE.mo77134w(MemGuard.f68733a, line);
                    } catch (Throwable th3) {
                        th2 = th3;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th2 = th4;
                bufferedReader = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.matrix.memguard.MemGuard$b */
    /* JADX INFO: compiled from: BUGLY */
    public class C33526b implements FilenameFilter {
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(".txt");
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.matrix.memguard.MemGuard$c */
    /* JADX INFO: compiled from: BUGLY */
    public class RunnableC33527c implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f68758b;

        public RunnableC33527c(String str) {
            this.f68758b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MemGuard.f68740h.mo72234a(this.f68758b);
            } catch (Throwable th2) {
                Logger.INSTANCE.mo77131e(MemGuard.f68733a, C33799mf.m74131a("Exception was thrown when onIssueDumpped was called.", th2));
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.matrix.memguard.MemGuard$d */
    /* JADX INFO: compiled from: BUGLY */
    public interface InterfaceC33528d {
        /* JADX INFO: renamed from: a */
        void mo72234a(@NonNull String str) throws Throwable;
    }

    /* JADX INFO: renamed from: com.tencent.bugly.matrix.memguard.MemGuard$e */
    /* JADX INFO: compiled from: BUGLY */
    public interface InterfaceC33529e {
        /* JADX INFO: renamed from: a */
        void m72235a(@NonNull String str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m72213b() {
        boolean z11;
        boolean[] zArr = f68739g;
        synchronized (zArr) {
            z11 = zArr[0];
        }
        return z11;
    }

    @Nullable
    private static native String nativeGetIssueDumpFilePath();

    private static native boolean nativeInstall(@NonNull Options options);

    public static native void stopDumpIssue();

    @NonNull
    /* JADX INFO: renamed from: c */
    public static List<File> m72214c(@NonNull Context context) {
        File[] fileArrListFiles = new File(m72211b(context)).listFiles(new C33526b());
        return fileArrListFiles != null ? Collections.unmodifiableList(Arrays.asList(fileArrListFiles)) : Collections.EMPTY_LIST;
    }

    @Keep
    private static void c2jNotifyOnIssueDumped(String str) {
        Thread thread = new Thread(new RunnableC33527c(str), f68736d);
        long jCurrentTimeMillis = System.currentTimeMillis();
        thread.start();
        try {
            thread.join(5000L);
        } catch (InterruptedException unused) {
            Logger.INSTANCE.mo77134w(f68733a, "Issue callback was interrupted.");
        }
        if (System.currentTimeMillis() - jCurrentTimeMillis > 5000) {
            Logger.INSTANCE.mo77134w(f68733a, "Timeout when call issue callback.");
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m72210a(@NonNull Options options, @Nullable InterfaceC33528d interfaceC33528d) {
        boolean zNativeInstall;
        Objects.requireNonNull(options);
        boolean[] zArr = f68739g;
        synchronized (zArr) {
            if (zArr[0]) {
                Logger.INSTANCE.mo77134w(f68733a, "Already installed.");
                return true;
            }
            try {
                C33865pi.m74602e();
                if (interfaceC33528d != null) {
                    f68740h = interfaceC33528d;
                }
                zNativeInstall = nativeInstall(options);
            } catch (Throwable th2) {
                Logger.INSTANCE.mo77131e(f68733a, "Install MemGuard failed." + th2);
                zNativeInstall = false;
            }
            if (zNativeInstall) {
                Logger.INSTANCE.mo77132i(f68733a, "Install MemGuard successfully with " + options);
            } else {
                Logger.INSTANCE.mo77131e(f68733a, "Install MemGuard failed with " + options);
            }
            f68739g[0] = zNativeInstall;
            return zNativeInstall;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m72211b(@NonNull Context context) {
        return new File(context.getFilesDir(), C33557b4.f69124l).getAbsolutePath();
    }

    /* JADX INFO: renamed from: b */
    public static String m72212b(Context context, String str) {
        return new File(str, C33557b4.f69126n + C33591ch.m72746d() + ".txt").getAbsolutePath();
    }
}
