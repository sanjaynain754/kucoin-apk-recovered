package com.tencent.bugly.proguard;

import android.os.StrictMode;
import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import androidx.camera.core.CameraInfo;
import com.kubi.assets.entity.BreakEvenAnalysisEntity;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.bugly.common.utils.FileUtil;
import com.tencent.bugly.common.utils.cpu.Process;
import com.tencent.rmonitor.common.logger.Logger;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.re */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33902re {

    /* JADX INFO: renamed from: O */
    public static final String f71645O = "ProcessCpuTracker";

    /* JADX INFO: renamed from: P */
    public static final boolean f71646P = false;

    /* JADX INFO: renamed from: R */
    public static final int f71648R = 0;

    /* JADX INFO: renamed from: S */
    public static final int f71649S = 1;

    /* JADX INFO: renamed from: T */
    public static final int f71650T = 2;

    /* JADX INFO: renamed from: U */
    public static final int f71651U = 3;

    /* JADX INFO: renamed from: W */
    public static final int f71653W = 1;

    /* JADX INFO: renamed from: X */
    public static final int f71654X = 2;

    /* JADX INFO: renamed from: Y */
    public static final int f71655Y = 3;

    /* JADX INFO: renamed from: Z */
    public static final int f71656Z = 4;

    /* JADX INFO: renamed from: a0 */
    public static final int f71657a0 = 5;

    /* JADX INFO: renamed from: c0 */
    public static final int f71659c0 = 0;

    /* JADX INFO: renamed from: d0 */
    public static final int f71660d0 = 1;

    /* JADX INFO: renamed from: g0 */
    public static final int f71663g0 = 10;

    /* JADX INFO: renamed from: h0 */
    public static final int f71664h0 = 3;

    /* JADX INFO: renamed from: A */
    public int f71666A;

    /* JADX INFO: renamed from: B */
    public int f71667B;

    /* JADX INFO: renamed from: C */
    public boolean f71668C;

    /* JADX INFO: renamed from: D */
    public int[] f71669D;

    /* JADX INFO: renamed from: E */
    public int[] f71670E;

    /* JADX INFO: renamed from: H */
    public boolean f71673H;

    /* JADX INFO: renamed from: J */
    public int f71675J;

    /* JADX INFO: renamed from: K */
    public boolean f71676K;

    /* JADX INFO: renamed from: L */
    public C33777le[] f71677L;

    /* JADX INFO: renamed from: M */
    public boolean f71678M;

    /* JADX INFO: renamed from: N */
    public boolean f71679N;

    /* JADX INFO: renamed from: f */
    public final boolean f71685f;

    /* JADX INFO: renamed from: g */
    public final long f71686g;

    /* JADX INFO: renamed from: k */
    public long f71690k;

    /* JADX INFO: renamed from: l */
    public long f71691l;

    /* JADX INFO: renamed from: m */
    public long f71692m;

    /* JADX INFO: renamed from: n */
    public long f71693n;

    /* JADX INFO: renamed from: o */
    public long f71694o;

    /* JADX INFO: renamed from: p */
    public long f71695p;

    /* JADX INFO: renamed from: q */
    public long f71696q;

    /* JADX INFO: renamed from: r */
    public long f71697r;

    /* JADX INFO: renamed from: s */
    public long f71698s;

    /* JADX INFO: renamed from: t */
    public long f71699t;

    /* JADX INFO: renamed from: u */
    public long f71700u;

    /* JADX INFO: renamed from: v */
    public long f71701v;

    /* JADX INFO: renamed from: w */
    public int f71702w;

    /* JADX INFO: renamed from: x */
    public int f71703x;

    /* JADX INFO: renamed from: y */
    public int f71704y;

    /* JADX INFO: renamed from: z */
    public int f71705z;

    /* JADX INFO: renamed from: Q */
    public static final int[] f71647Q = {32, 544, 32, 32, 32, 32, 32, 32, 32, 8224, 32, 8224, 32, 8224, 8224};

    /* JADX INFO: renamed from: V */
    public static final int[] f71652V = {32, 4640, 32, 32, 32, 32, 32, 32, 32, 8224, 32, 8224, 32, 8224, 8224, 32, 32, 32, 32, 32, 32, 32, 8224};

    /* JADX INFO: renamed from: b0 */
    public static final int[] f71658b0 = {8224, 8224};

    /* JADX INFO: renamed from: e0 */
    public static final int[] f71661e0 = {288, 8224, 8224, 8224, 8224, 8224, 8224, 8224};

    /* JADX INFO: renamed from: f0 */
    public static final int[] f71662f0 = {16416, 16416, 16416};

    /* JADX INFO: renamed from: i0 */
    public static final Comparator<c> f71665i0 = new a();

    /* JADX INFO: renamed from: a */
    public final long[] f71680a = new long[4];

    /* JADX INFO: renamed from: b */
    public final String[] f71681b = new String[6];

    /* JADX INFO: renamed from: c */
    public final long[] f71682c = new long[6];

    /* JADX INFO: renamed from: d */
    public final long[] f71683d = new long[7];

    /* JADX INFO: renamed from: e */
    public final float[] f71684e = new float[3];

    /* JADX INFO: renamed from: h */
    public float f71687h = 0.0f;

    /* JADX INFO: renamed from: i */
    public float f71688i = 0.0f;

    /* JADX INFO: renamed from: j */
    public float f71689j = 0.0f;

    /* JADX INFO: renamed from: F */
    public final ArrayList<c> f71671F = new ArrayList<>();

    /* JADX INFO: renamed from: G */
    public final ArrayList<c> f71672G = new ArrayList<>();

    /* JADX INFO: renamed from: I */
    public boolean f71674I = true;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.re$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            int i11 = cVar.f71722q + cVar.f71723r;
            int i12 = cVar2.f71722q + cVar2.f71723r;
            if (i11 != i12) {
                return i11 > i12 ? -1 : 1;
            }
            boolean z11 = cVar.f71730y;
            if (z11 != cVar2.f71730y) {
                return z11 ? -1 : 1;
            }
            if (cVar.f71731z != cVar2.f71731z) {
                return z11 ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.re$b */
    /* JADX INFO: compiled from: BUGLY */
    public interface b {
        /* JADX INFO: renamed from: a */
        boolean m74859a(c cVar);
    }

    /* JADX INFO: renamed from: a */
    public int m74824a(String str) {
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public long m74836b(int i11) {
        long[] jArr = new long[4];
        if (Process.readProcFile("/proc/" + i11 + "/stat", f71647Q, null, jArr, null)) {
            return (jArr[2] + jArr[3]) * this.f71686g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: c */
    public final c m74838c(int i11) {
        return this.f71671F.get(i11);
    }

    /* JADX INFO: renamed from: d */
    public final long m74839d() {
        long jLongValue = 0;
        for (int i11 = 0; i11 < this.f71675J; i11++) {
            for (int i12 = 0; i12 < 3; i12++) {
                String str = "/sys/devices/system/cpu/cpu" + i11 + "/cpuidle/state" + i12 + "/time";
                if (new File(str).exists()) {
                    jLongValue += Long.valueOf(FileUtil.readOutputFromFile(str)).longValue();
                }
            }
        }
        return jLongValue / 1000;
    }

    /* JADX INFO: renamed from: o */
    public void m74851o() throws Throwable {
        this.f71674I = true;
        m74854r();
    }

    /* JADX INFO: renamed from: p */
    public final void m74852p() throws IOException {
        for (int i11 = 0; i11 < this.f71675J; i11++) {
            String strM75326a = C33986vi.m75326a("/sys/devices/system/cpu/cpu", i11);
            if (new File(strM75326a).exists()) {
                this.f71677L[i11] = new C33777le(Paths.get(strM75326a + "/cpufreq/stats", new String[0]).resolve(C33815na.f71078i));
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.re$c */
    /* JADX INFO: compiled from: BUGLY */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final int f71706a;

        /* JADX INFO: renamed from: b */
        public final int f71707b;

        /* JADX INFO: renamed from: c */
        public final String f71708c;

        /* JADX INFO: renamed from: d */
        public final String f71709d;

        /* JADX INFO: renamed from: e */
        public final String f71710e;

        /* JADX INFO: renamed from: f */
        public final ArrayList<c> f71711f;

        /* JADX INFO: renamed from: g */
        public final ArrayList<c> f71712g;

        /* JADX INFO: renamed from: h */
        public boolean f71713h;

        /* JADX INFO: renamed from: i */
        public String f71714i;

        /* JADX INFO: renamed from: j */
        public String f71715j;

        /* JADX INFO: renamed from: k */
        public int f71716k;

        /* JADX INFO: renamed from: l */
        public long f71717l;

        /* JADX INFO: renamed from: m */
        public long f71718m;

        /* JADX INFO: renamed from: n */
        public long f71719n;

        /* JADX INFO: renamed from: o */
        public long f71720o;

        /* JADX INFO: renamed from: p */
        public long f71721p;

        /* JADX INFO: renamed from: q */
        public int f71722q;

        /* JADX INFO: renamed from: r */
        public int f71723r;

        /* JADX INFO: renamed from: s */
        public long f71724s;

        /* JADX INFO: renamed from: t */
        public long f71725t;

        /* JADX INFO: renamed from: u */
        public int f71726u;

        /* JADX INFO: renamed from: v */
        public int f71727v;

        /* JADX INFO: renamed from: w */
        public boolean f71728w;

        /* JADX INFO: renamed from: x */
        public boolean f71729x;

        /* JADX INFO: renamed from: y */
        public boolean f71730y;

        /* JADX INFO: renamed from: z */
        public boolean f71731z;

        public c(int i11, int i12, boolean z11) {
            this.f71706a = i11;
            if (i12 < 0) {
                File file = new File("/proc", Integer.toString(i11));
                this.f71707b = m74860a(file.toString());
                this.f71708c = new File(file, "stat").toString();
                this.f71709d = new File(file, C33815na.f71079j).toString();
                this.f71710e = new File(file, "task").toString();
                if (z11) {
                    this.f71711f = new ArrayList<>();
                    this.f71712g = new ArrayList<>();
                    return;
                } else {
                    this.f71711f = null;
                    this.f71712g = null;
                    return;
                }
            }
            File file2 = new File(new File(new File("/proc", Integer.toString(i12)), "task"), Integer.toString(i11));
            this.f71707b = m74860a(file2.toString());
            this.f71708c = new File(file2, "stat").toString();
            this.f71709d = null;
            this.f71710e = null;
            this.f71711f = null;
            this.f71712g = null;
        }

        /* JADX INFO: renamed from: a */
        public static int m74860a(String str) {
            try {
                return Os.stat(str).st_uid;
            } catch (Throwable th2) {
                Logger.INSTANCE.mo77134w(C33902re.f71645O, "Failed to stat(" + str + "): " + th2);
                return -1;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m74830a(float f11, float f12, float f13) {
    }

    /* JADX INFO: renamed from: c */
    public final int m74837c() {
        m74829a();
        return this.f71672G.size();
    }

    /* JADX INFO: renamed from: e */
    public final long m74841e() {
        if (!this.f71676K) {
            try {
                m74852p();
            } catch (IOException e11) {
                Logger.INSTANCE.exception(f71645O, e11);
            }
            this.f71676K = true;
        }
        long j11 = 0;
        for (int i11 = 0; i11 < this.f71675J; i11++) {
            long[] jArrM73985a = this.f71677L[i11].m73985a(Paths.get(C33986vi.m75326a("/sys/devices/system/cpu/cpu", i11) + "/cpufreq/stats", new String[0]).resolve(C33815na.f71078i));
            int length = jArrM73985a.length;
            for (int i12 = 0; i12 < length; i12++) {
                j11 += jArrM73985a[i12];
            }
        }
        return j11;
    }

    /* JADX INFO: renamed from: f */
    public final int m74842f() {
        return this.f71667B;
    }

    /* JADX INFO: renamed from: g */
    public final int m74843g() {
        return this.f71704y;
    }

    /* JADX INFO: renamed from: h */
    public final int m74844h() {
        return this.f71705z;
    }

    /* JADX INFO: renamed from: i */
    public final int m74845i() {
        return this.f71666A;
    }

    /* JADX INFO: renamed from: j */
    public final int m74846j() {
        return this.f71703x;
    }

    /* JADX INFO: renamed from: k */
    public final int m74847k() {
        return this.f71702w;
    }

    /* JADX INFO: renamed from: m */
    public final float m74849m() {
        int i11 = this.f71702w + this.f71703x + this.f71705z;
        int i12 = this.f71667B + i11;
        if (i12 <= 0) {
            return 0.0f;
        }
        return (i11 * 100.0f) / i12;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m74850n() {
        return this.f71668C;
    }

    /* JADX INFO: renamed from: q */
    public final String m74853q() {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.print("Load: ");
        printWriter.print(this.f71687h);
        printWriter.print(" / ");
        printWriter.print(this.f71688i);
        printWriter.print(" / ");
        printWriter.println(this.f71689j);
        printWriter.flush();
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: s */
    public void m74855s() {
        boolean procFile;
        long[] jArr = this.f71683d;
        if (AndroidVersion.isOverO()) {
            jArr[0] = m74841e();
            jArr[3] = m74839d();
            jArr[6] = 0;
            jArr[5] = 0;
            jArr[4] = 0;
            jArr[2] = 0;
            jArr[1] = 0;
            procFile = true;
        } else {
            procFile = Process.readProcFile("/proc/stat", f71661e0, null, jArr, null);
        }
        if (procFile) {
            long j11 = jArr[0] + jArr[1];
            long j12 = this.f71686g;
            long j13 = j11 * j12;
            long j14 = jArr[2] * j12;
            long j15 = jArr[3] * j12;
            long j16 = jArr[4] * j12;
            long j17 = jArr[5] * j12;
            long j18 = jArr[6] * j12;
            long j19 = this.f71696q;
            if (j13 >= j19) {
                long j21 = this.f71697r;
                if (j14 >= j21) {
                    long j22 = this.f71698s;
                    if (j16 >= j22) {
                        long j23 = this.f71699t;
                        if (j17 >= j23) {
                            long j24 = this.f71700u;
                            if (j18 >= j24) {
                                long j25 = this.f71701v;
                                if (j15 >= j25) {
                                    this.f71702w = (int) (j13 - j19);
                                    this.f71703x = (int) (j14 - j21);
                                    this.f71704y = (int) (j16 - j22);
                                    this.f71705z = (int) (j17 - j23);
                                    this.f71666A = (int) (j18 - j24);
                                    this.f71667B = (int) (j15 - j25);
                                    this.f71668C = true;
                                    this.f71696q = j13;
                                    this.f71697r = j14;
                                    this.f71698s = j16;
                                    this.f71699t = j17;
                                    this.f71700u = j18;
                                    this.f71701v = j15;
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            this.f71702w = 0;
            this.f71703x = 0;
            this.f71704y = 0;
            this.f71705z = 0;
            this.f71666A = 0;
            this.f71667B = 0;
            this.f71668C = false;
            Logger.INSTANCE.mo77134w(f71645O, "/proc/stats has gone backwards; skipping CPU update");
        }
    }

    /* JADX INFO: renamed from: t */
    public void m74856t() {
        float[] fArr = this.f71684e;
        if (Process.readProcFile("/proc/loadavg", f71662f0, null, null, fArr)) {
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = fArr[2];
            if (f11 == this.f71687h && f12 == this.f71688i && f13 == this.f71689j) {
                return;
            }
            this.f71687h = f11;
            this.f71688i = f12;
            this.f71689j = f13;
            m74830a(f11, f12, f13);
        }
    }

    public C33902re(boolean z11) {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        this.f71675J = iAvailableProcessors;
        this.f71676K = false;
        this.f71677L = new C33777le[iAvailableProcessors];
        this.f71685f = z11;
        this.f71678M = false;
        this.f71679N = false;
        this.f71686g = 1000 / Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00db  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final int[] m74834a(String str, int i11, boolean z11, int[] iArr, ArrayList<c> arrayList) {
        int[] pids;
        int i12;
        int i13;
        int i14;
        long j11;
        ArrayList<c> arrayList2 = arrayList;
        int i15 = 1;
        boolean z12 = false;
        if (this.f71685f) {
            pids = Process.getPids(str, iArr);
        } else {
            pids = new int[]{android.os.Process.myPid()};
        }
        int[] iArr2 = pids;
        int length = iArr2 == null ? 0 : iArr2.length;
        int size = arrayList2.size();
        int i16 = 0;
        int i17 = 0;
        while (i17 < length && (i12 = iArr2[i17]) >= 0) {
            c cVar = i16 < size ? arrayList2.get(i16) : null;
            if (cVar != null && cVar.f71706a == i12) {
                cVar.f71730y = z12;
                cVar.f71729x = z12;
                int i18 = i16 + 1;
                if (cVar.f71713h) {
                    boolean z13 = i15;
                    boolean z14 = z12;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    long[] jArr = this.f71680a;
                    if (Process.readProcFile(cVar.f71708c, f71647Q, null, jArr, null)) {
                        long j12 = jArr[z14 ? 1 : 0];
                        long j13 = jArr[z13 ? 1 : 0];
                        long j14 = jArr[2];
                        long j15 = this.f71686g;
                        long j16 = j14 * j15;
                        long j17 = jArr[3] * j15;
                        if (j16 == cVar.f71720o && j17 == cVar.f71721p) {
                            cVar.f71722q = z14 ? 1 : 0;
                            cVar.f71723r = z14 ? 1 : 0;
                            cVar.f71726u = z14 ? 1 : 0;
                            cVar.f71727v = z14 ? 1 : 0;
                            if (cVar.f71728w) {
                                cVar.f71728w = z14;
                            }
                            iArr2 = iArr2;
                            length = length;
                            size = size;
                            i17 = i17;
                        } else {
                            if (!cVar.f71728w) {
                                cVar.f71728w = z13;
                            }
                            if (i11 < 0) {
                                m74831a(cVar, cVar.f71709d);
                                ArrayList<c> arrayList3 = cVar.f71711f;
                                if (arrayList3 != null) {
                                    j11 = j16;
                                    this.f71670E = m74834a(cVar.f71710e, i12, false, this.f71670E, arrayList3);
                                } else {
                                    j11 = j16;
                                }
                            } else {
                                j11 = j16;
                            }
                            cVar.f71719n = jUptimeMillis - cVar.f71718m;
                            cVar.f71718m = jUptimeMillis;
                            cVar.f71722q = (int) (j11 - cVar.f71720o);
                            cVar.f71723r = (int) (j17 - cVar.f71721p);
                            cVar.f71720o = j11;
                            cVar.f71721p = j17;
                            cVar.f71726u = (int) (r19 - cVar.f71724s);
                            cVar.f71727v = (int) (j13 - cVar.f71725t);
                            cVar.f71724s = j12;
                            cVar.f71725t = j13;
                            cVar.f71729x = true;
                        }
                    } else {
                        iArr2 = iArr2;
                        length = length;
                        size = size;
                        i17 = i17;
                    }
                } else {
                    iArr2 = iArr2;
                    length = length;
                    size = size;
                    i17 = i17;
                }
                arrayList2 = arrayList;
                i16 = i18;
                size = size;
                i14 = i17;
            } else {
                iArr2 = iArr2;
                length = length;
                int i19 = size;
                int i21 = i17;
                if (cVar != null && cVar.f71706a <= i12) {
                    cVar.f71722q = 0;
                    cVar.f71723r = 0;
                    cVar.f71726u = 0;
                    cVar.f71727v = 0;
                    cVar.f71731z = true;
                    cVar.f71729x = true;
                    arrayList2 = arrayList;
                    arrayList2.remove(i16);
                    size = i19 - 1;
                    i14 = i21 - 1;
                } else {
                    arrayList2 = arrayList;
                    c cVar2 = new c(i12, i11, this.f71685f);
                    arrayList2.add(i16, cVar2);
                    int i22 = i16 + 1;
                    size = i19 + 1;
                    String[] strArr = this.f71681b;
                    long[] jArr2 = this.f71682c;
                    cVar2.f71718m = SystemClock.uptimeMillis();
                    if (Process.readProcFile(cVar2.f71708c, f71652V, strArr, jArr2, null)) {
                        cVar2.f71717l = jArr2[5];
                        cVar2.f71713h = true;
                        cVar2.f71714i = strArr[0];
                        cVar2.f71724s = jArr2[1];
                        cVar2.f71725t = jArr2[2];
                        long j18 = jArr2[3];
                        long j19 = this.f71686g;
                        cVar2.f71720o = j18 * j19;
                        cVar2.f71721p = jArr2[4] * j19;
                    } else {
                        Logger.INSTANCE.mo77134w(f71645O, C33986vi.m75326a("Skipping unknown process pid ", i12));
                        cVar2.f71714i = CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN;
                        cVar2.f71721p = 0L;
                        cVar2.f71720o = 0L;
                        cVar2.f71725t = 0L;
                        cVar2.f71724s = 0L;
                    }
                    if (i11 < 0) {
                        m74831a(cVar2, cVar2.f71709d);
                        ArrayList<c> arrayList4 = cVar2.f71711f;
                        if (arrayList4 != null) {
                            this.f71670E = m74834a(cVar2.f71710e, i12, true, this.f71670E, arrayList4);
                        }
                    } else if (cVar2.f71713h) {
                        String str2 = cVar2.f71714i;
                        cVar2.f71715j = str2;
                        cVar2.f71716k = m74824a(str2);
                    }
                    cVar2.f71722q = 0;
                    cVar2.f71723r = 0;
                    cVar2.f71726u = 0;
                    cVar2.f71727v = 0;
                    i13 = 1;
                    cVar2.f71730y = true;
                    if (!z11 && cVar2.f71713h) {
                        cVar2.f71729x = true;
                    }
                    i16 = i22;
                    i14 = i21;
                }
                i17 = i14 + i13;
                i15 = i13;
                iArr2 = iArr2;
                length = length;
                z12 = false;
            }
            i13 = 1;
            i17 = i14 + i13;
            i15 = i13;
            iArr2 = iArr2;
            length = length;
            z12 = false;
        }
        boolean z15 = i15;
        int[] iArr3 = iArr2;
        int i23 = size;
        while (i16 < i23) {
            c cVar3 = arrayList2.get(i16);
            cVar3.f71722q = 0;
            cVar3.f71723r = 0;
            cVar3.f71726u = 0;
            cVar3.f71727v = 0;
            cVar3.f71731z = z15;
            cVar3.f71729x = z15;
            arrayList2.remove(i16);
            i23--;
            Logger.INSTANCE.mo77133v(f71645O, "Removed pid " + cVar3.f71706a + ": " + cVar3);
        }
        return iArr3;
    }

    /* JADX INFO: renamed from: l */
    public final c m74848l() {
        m74829a();
        if (!this.f71672G.isEmpty()) {
            return this.f71672G.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public void m74854r() throws Throwable {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f71678M) {
            m74855s();
        }
        m74857u();
        if (this.f71679N) {
            m74856t();
        }
        this.f71691l = this.f71690k;
        this.f71690k = jUptimeMillis;
        this.f71693n = this.f71692m;
        this.f71692m = jElapsedRealtime;
        this.f71695p = this.f71694o;
        this.f71694o = jCurrentTimeMillis;
        this.f71673H = false;
        this.f71674I = false;
    }

    /* JADX INFO: renamed from: u */
    public void m74857u() throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                if (this.f71685f) {
                    this.f71669D = m74834a("/proc/self/task", android.os.Process.myPid(), this.f71674I, this.f71669D, this.f71671F);
                } else {
                    this.f71669D = m74834a("/proc/self/task", -1, this.f71674I, this.f71669D, this.f71671F);
                }
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            } catch (Throwable th2) {
                th = th2;
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m74835b() {
        return this.f71671F.size();
    }

    /* JADX INFO: renamed from: d */
    public final c m74840d(int i11) {
        return this.f71672G.get(i11);
    }

    /* JADX INFO: renamed from: a */
    public long m74825a(int i11) {
        long[] jArr = new long[4];
        if (Process.readProcFile("/proc/" + i11 + "/schedstat", f71658b0, null, jArr, null)) {
            return jArr[1] / 1000000;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    public final void m74829a() {
        if (this.f71673H) {
            return;
        }
        this.f71672G.clear();
        int size = this.f71671F.size();
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = this.f71671F.get(i11);
            if (cVar.f71729x) {
                this.f71672G.add(cVar);
                ArrayList<c> arrayList = cVar.f71711f;
                if (arrayList != null && arrayList.size() > 1) {
                    cVar.f71712g.clear();
                    int size2 = cVar.f71711f.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        c cVar2 = cVar.f71711f.get(i12);
                        if (cVar2.f71729x) {
                            cVar.f71712g.add(cVar2);
                        }
                    }
                    Collections.sort(cVar.f71712g, f71665i0);
                }
            }
        }
        Collections.sort(this.f71672G, f71665i0);
        this.f71673H = true;
    }

    /* JADX INFO: renamed from: a */
    public final List<c> m74828a(b bVar) {
        ArrayList arrayList = new ArrayList(this.f71671F.size());
        int size = this.f71671F.size();
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = this.f71671F.get(i11);
            if (bVar.m74859a(cVar)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final String m74826a(long j11) {
        return m74827a(j11, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: a */
    public final String m74827a(long j11, int i11) {
        ArrayList<c> arrayList;
        C33902re c33902re = this;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        c33902re.m74829a();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        printWriter.print("CPU usage from ");
        long j12 = c33902re.f71691l;
        if (j11 > j12) {
            printWriter.print(j11 - j12);
            printWriter.print("ms to ");
            printWriter.print(j11 - c33902re.f71690k);
            printWriter.print("ms ago");
        } else {
            printWriter.print(j12 - j11);
            printWriter.print("ms to ");
            printWriter.print(c33902re.f71690k - j11);
            printWriter.print("ms later");
        }
        printWriter.print(" (");
        printWriter.print(simpleDateFormat.format(new Date(c33902re.f71695p)));
        printWriter.print(" to ");
        printWriter.print(simpleDateFormat.format(new Date(c33902re.f71694o)));
        printWriter.print(")");
        long j13 = c33902re.f71690k - c33902re.f71691l;
        long j14 = c33902re.f71692m - c33902re.f71693n;
        long j15 = j14 > 0 ? (j13 * 100) / j14 : 0L;
        if (j15 != 100) {
            printWriter.print(" with ");
            printWriter.print(j15);
            printWriter.print("% awake");
        }
        printWriter.println(C33844oi.f71346o);
        int i12 = c33902re.f71702w + c33902re.f71703x + c33902re.f71704y + c33902re.f71705z + c33902re.f71666A + c33902re.f71667B;
        int iMin = Math.min(i11, c33902re.f71672G.size());
        int i13 = 0;
        while (i13 < iMin) {
            c cVar = c33902re.f71672G.get(i13);
            int i14 = i13;
            int i15 = iMin;
            PrintWriter printWriter2 = printWriter;
            c33902re.m74833a(printWriter2, cVar.f71730y ? " +" : cVar.f71731z ? " -" : "  ", cVar.f71706a, cVar.f71715j, (int) cVar.f71719n, cVar.f71722q, cVar.f71723r, 0, 0, 0, cVar.f71726u, cVar.f71727v);
            if (!cVar.f71731z && (arrayList = cVar.f71712g) != null) {
                int i16 = 0;
                for (int size = arrayList.size(); i16 < size; size = size) {
                    c cVar2 = cVar.f71712g.get(i16);
                    m74833a(printWriter2, cVar2.f71730y ? "   +" : cVar2.f71731z ? "   -" : "    ", cVar2.f71706a, cVar2.f71715j, (int) cVar.f71719n, cVar2.f71722q, cVar2.f71723r, 0, 0, 0, 0, 0);
                    i16++;
                }
            }
            c33902re = this;
            i13 = i14 + 1;
            printWriter = printWriter2;
            iMin = i15;
        }
        PrintWriter printWriter3 = printWriter;
        c33902re.m74833a(printWriter3, "", -1, BreakEvenAnalysisEntity.TOTAL, i12, c33902re.f71702w, c33902re.f71703x, c33902re.f71704y, c33902re.f71705z, c33902re.f71666A, 0, 0);
        printWriter3.flush();
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: a */
    public final void m74832a(PrintWriter printWriter, long j11, long j12) {
        long j13 = (j11 * 1000) / j12;
        long j14 = j13 / 10;
        printWriter.print(j14);
        if (j14 < 10) {
            long j15 = j13 - (j14 * 10);
            if (j15 != 0) {
                printWriter.print('.');
                printWriter.print(j15);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m74833a(PrintWriter printWriter, String str, int i11, String str2, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        printWriter.print(str);
        long j11 = i12 == 0 ? 1 : i12;
        m74832a(printWriter, i13 + i14 + i15 + i16 + i17, j11);
        printWriter.print("% ");
        if (i11 >= 0) {
            printWriter.print(i11);
            printWriter.print("/");
        }
        printWriter.print(str2);
        printWriter.print(": ");
        m74832a(printWriter, i13, j11);
        printWriter.print("% user + ");
        m74832a(printWriter, i14, j11);
        printWriter.print("% kernel");
        if (i15 > 0) {
            printWriter.print(" + ");
            m74832a(printWriter, i15, j11);
            printWriter.print("% iowait");
        }
        if (i16 > 0) {
            printWriter.print(" + ");
            m74832a(printWriter, i16, j11);
            printWriter.print("% irq");
        }
        if (i17 > 0) {
            printWriter.print(" + ");
            m74832a(printWriter, i17, j11);
            printWriter.print("% softirq");
        }
        if (i18 > 0 || i19 > 0) {
            printWriter.print(" / faults:");
            if (i18 > 0) {
                printWriter.print(C33627eb.f69716f);
                printWriter.print(i18);
                printWriter.print(" minor");
            }
            if (i19 > 0) {
                printWriter.print(C33627eb.f69716f);
                printWriter.print(i19);
                printWriter.print(" major");
            }
        }
        printWriter.println();
    }

    /* JADX INFO: renamed from: a */
    public final void m74831a(c cVar, String str) {
        String strSubstring = cVar.f71715j;
        if (strSubstring == null || strSubstring.equals("app_process") || cVar.f71715j.equals("<pre-initialized>") || cVar.f71715j.equals("usap32") || cVar.f71715j.equals("usap64")) {
            String strM73815a = C33756ke.m73815a(str, (byte) 0);
            if (strM73815a != null && strM73815a.length() > 1) {
                int iLastIndexOf = strM73815a.lastIndexOf("/");
                strSubstring = (iLastIndexOf <= 0 || iLastIndexOf >= strM73815a.length() - 1) ? strM73815a : strM73815a.substring(iLastIndexOf + 1);
            }
            if (strSubstring == null) {
                strSubstring = cVar.f71714i;
            }
        }
        String str2 = cVar.f71715j;
        if (str2 == null || !strSubstring.equals(str2)) {
            cVar.f71715j = strSubstring;
            cVar.f71716k = m74824a(strSubstring);
        }
    }
}
