package com.tencent.bugly.proguard;

import androidx.annotation.RequiresApi;
import com.tencent.bugly.common.utils.cpu.Process;
import com.tencent.rmonitor.common.logger.Logger;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Predicate;
import p465n7.C42764f;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.na */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@RequiresApi(api = 26)
public class C33815na {

    /* JADX INFO: renamed from: g */
    public static final String f71076g = "KernelCpuThreadReader";

    /* JADX INFO: renamed from: h */
    public static final boolean f71077h = false;

    /* JADX INFO: renamed from: i */
    public static final String f71078i = "time_in_state";

    /* JADX INFO: renamed from: j */
    public static final String f71079j = "cmdline";

    /* JADX INFO: renamed from: k */
    public static final String f71080k = "comm";

    /* JADX INFO: renamed from: l */
    public static final String f71081l = "[0-9]*";

    /* JADX INFO: renamed from: m */
    public static final String f71082m = "unknown_process";

    /* JADX INFO: renamed from: n */
    public static final String f71083n = "unknown_thread";

    /* JADX INFO: renamed from: o */
    public static final Path f71084o;

    /* JADX INFO: renamed from: p */
    public static final Path f71085p;

    /* JADX INFO: renamed from: q */
    public static final int f71086q = -1;

    /* JADX INFO: renamed from: a */
    public Predicate<Integer> f71087a;

    /* JADX INFO: renamed from: b */
    public final Path f71088b;

    /* JADX INFO: renamed from: c */
    public int[] f71089c;

    /* JADX INFO: renamed from: d */
    public final C33777le f71090d;

    /* JADX INFO: renamed from: e */
    public a f71091e;

    /* JADX INFO: renamed from: f */
    public final b f71092f;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.na$a */
    /* JADX INFO: compiled from: BUGLY */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f71093a;

        /* JADX INFO: renamed from: b */
        public final int f71094b;

        /* JADX INFO: renamed from: c */
        public final int[] f71095c;

        /* JADX INFO: renamed from: a */
        public int[] m74257a(long[] jArr) {
            if (jArr.length != this.f71093a) {
                throw new IllegalArgumentException();
            }
            int i11 = this.f71094b;
            int[] iArr = new int[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                iArr[i12] = (int) jArr[this.f71095c[i12]];
            }
            return iArr;
        }

        /* JADX INFO: renamed from: b */
        public int[] m74258b(long[] jArr) {
            if (jArr.length != this.f71093a) {
                throw new IllegalArgumentException();
            }
            int[] iArr = new int[this.f71094b];
            for (int i11 = 0; i11 < this.f71094b; i11++) {
                int[] iArr2 = this.f71095c;
                int iM74254a = m74254a(i11, iArr2, jArr.length);
                for (int i12 = iArr2[i11]; i12 < iM74254a; i12++) {
                    iArr[i11] = (int) (((long) iArr[i11]) + jArr[i12]);
                }
            }
            return iArr;
        }

        /* JADX INFO: renamed from: c */
        public static int[] m74256c(long[] jArr) {
            int i11 = 0;
            C33605da c33605da = new C33605da(0);
            c33605da.m72815a(c33605da.f69563c, 0);
            while (i11 < jArr.length - 1) {
                long j11 = jArr[i11];
                i11++;
                if (j11 >= jArr[i11]) {
                    c33605da.m72815a(c33605da.f69563c, i11);
                }
            }
            return c33605da.m72818b();
        }

        public a(long[] jArr, int i11) {
            int length = jArr.length;
            this.f71093a = length;
            int[] iArrM74255a = m74255a(m74256c(jArr), i11, length);
            this.f71095c = iArrM74255a;
            this.f71094b = iArrM74255a.length;
        }

        /* JADX INFO: renamed from: a */
        public static int[] m74255a(int[] iArr, int i11, int i12) {
            int i13;
            int length = iArr.length;
            if (length > i11) {
                return Arrays.copyOfRange(iArr, 0, i11);
            }
            C33605da c33605da = new C33605da(0);
            for (int i14 = 0; i14 < length; i14++) {
                int i15 = iArr[i14];
                int iM74254a = m74254a(i14, iArr, i12);
                int i16 = length - 1;
                if (i14 != i16) {
                    i13 = i11 / length;
                } else {
                    i13 = i11 - ((i11 / length) * i16);
                }
                int iMax = Math.max(1, (iM74254a - i15) / i13);
                for (int i17 = 0; i17 < i13; i17++) {
                    int i18 = (i17 * iMax) + i15;
                    if (i18 >= iM74254a) {
                        break;
                    }
                    c33605da.m72815a(c33605da.f69563c, i18);
                }
            }
            return c33605da.m72818b();
        }

        /* JADX INFO: renamed from: a */
        public static int m74253a(int i11, int[] iArr) {
            return iArr[i11];
        }

        /* JADX INFO: renamed from: a */
        public static int m74254a(int i11, int[] iArr, int i12) {
            return i11 != iArr.length + (-1) ? iArr[i11 + 1] : i12;
        }
    }

    static {
        Path path = Paths.get("/proc", new String[0]);
        f71084o = path;
        f71085p = path.resolve("self/time_in_state");
    }

    /* JADX INFO: renamed from: a */
    public static C33815na m74243a(int i11, Predicate<Integer> predicate) {
        try {
            return new C33815na(i11, predicate, f71084o, f71085p, new b());
        } catch (IOException e11) {
            Logger.INSTANCE.exception(f71076g, "Failed to initialize KernelCpuThreadReader", e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public ArrayList<c> m74250b() {
        c cVarM74245a;
        ArrayList<c> arrayList = new ArrayList<>();
        try {
            DirectoryStream directoryStreamNewDirectoryStream = Files.newDirectoryStream(this.f71088b, f71081l);
            try {
                Iterator it = directoryStreamNewDirectoryStream.iterator();
                while (it.hasNext()) {
                    Path pathM93699a = C42764f.m93699a(it.next());
                    int iM74244a = m74244a(pathM93699a);
                    int iM74259a = this.f71092f.m74259a(iM74244a);
                    if (iM74259a != -1 && iM74244a != -1 && this.f71087a.test(Integer.valueOf(iM74259a)) && (cVarM74245a = m74245a(pathM93699a, iM74244a, iM74259a)) != null) {
                        arrayList.add(cVarM74245a);
                    }
                }
                directoryStreamNewDirectoryStream.close();
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
                Logger.INSTANCE.mo77134w(f71076g, "Didn't successfully get any process CPU information for UIDs specified");
                return null;
            } catch (Throwable th2) {
                if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException e11) {
            Logger.INSTANCE.exception(f71076g, "Failed to iterate over process paths", e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final d m74251c(Path path) {
        int[] iArrM74258b;
        try {
            int i11 = Integer.parseInt(path.getFileName().toString());
            String strM74252d = m74252d(path);
            long[] jArrM73985a = this.f71090d.m73985a(path.resolve(f71078i));
            if (jArrM73985a == null) {
                return null;
            }
            a aVar = this.f71091e;
            if (aVar != null) {
                iArrM74258b = aVar.m74258b(jArrM73985a);
            } else {
                int[] iArr = new int[jArrM73985a.length];
                for (int i12 = 0; i12 < jArrM73985a.length; i12++) {
                    iArr[i12] = (int) jArrM73985a[i12];
                }
                iArrM74258b = iArr;
            }
            return new d(i11, strM74252d, iArrM74258b);
        } catch (NumberFormatException e11) {
            Logger.INSTANCE.exception(f71076g, "Failed to parse thread ID when iterating over /proc/*/task", e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.na$b */
    /* JADX INFO: compiled from: BUGLY */
    public static class b {
        /* JADX INFO: renamed from: a */
        public int m74259a(int i11) {
            return Process.m72173a(i11);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.na$c */
    /* JADX INFO: compiled from: BUGLY */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final int f71096a;

        /* JADX INFO: renamed from: b */
        public final String f71097b;

        /* JADX INFO: renamed from: c */
        public final int f71098c;

        /* JADX INFO: renamed from: d */
        public ArrayList<d> f71099d;

        public c(int i11, String str, int i12, ArrayList<d> arrayList) {
            this.f71096a = i11;
            this.f71097b = str;
            this.f71098c = i12;
            this.f71099d = arrayList;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.na$d */
    /* JADX INFO: compiled from: BUGLY */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final int f71100a;

        /* JADX INFO: renamed from: b */
        public final String f71101b;

        /* JADX INFO: renamed from: c */
        public int[] f71102c;

        public d(int i11, String str, int[] iArr) {
            this.f71100a = i11;
            this.f71101b = str;
            this.f71102c = iArr;
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m74252d(Path path) {
        String strM73814a = C33756ke.m73814a(path.resolve(f71080k).toString());
        return strM73814a == null ? f71083n : strM73814a;
    }

    public C33815na(int i11, Predicate<Integer> predicate, Path path, Path path2, b bVar) throws IOException {
        this.f71087a = predicate;
        this.f71088b = path;
        this.f71090d = new C33777le(path2);
        this.f71092f = bVar;
        m74246a(i11);
    }

    /* JADX INFO: renamed from: a */
    public int[] m74248a() {
        return this.f71089c;
    }

    /* JADX INFO: renamed from: a */
    public void m74246a(int i11) {
        int[] iArr = this.f71089c;
        if (iArr == null || iArr.length != i11) {
            long[] jArrM73984a = this.f71090d.m73984a();
            if (i11 != 0) {
                a aVar = new a(jArrM73984a, i11);
                this.f71091e = aVar;
                this.f71089c = aVar.m74257a(jArrM73984a);
            } else {
                this.f71091e = null;
                this.f71089c = new int[jArrM73984a.length];
                for (int i12 = 0; i12 < jArrM73984a.length; i12++) {
                    this.f71089c[i12] = (int) jArrM73984a[i12];
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m74247a(Predicate<Integer> predicate) {
        this.f71087a = predicate;
    }

    /* JADX INFO: renamed from: a */
    public final c m74245a(Path path, int i11, int i12) {
        Path pathResolve = path.resolve("task");
        ArrayList arrayList = new ArrayList();
        try {
            DirectoryStream directoryStreamNewDirectoryStream = Files.newDirectoryStream(pathResolve);
            try {
                Iterator it = directoryStreamNewDirectoryStream.iterator();
                while (it.hasNext()) {
                    d dVarM74251c = m74251c(C42764f.m93699a(it.next()));
                    if (dVarM74251c != null) {
                        arrayList.add(dVarM74251c);
                    }
                }
                directoryStreamNewDirectoryStream.close();
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new c(i11, m74249b(path), i12, arrayList);
            } catch (Throwable th2) {
                if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException | DirectoryIteratorException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m74249b(Path path) {
        String strM73815a = C33756ke.m73815a(path.resolve(f71079j).toString(), (byte) 10);
        return strM73815a != null ? strM73815a : f71082m;
    }

    /* JADX INFO: renamed from: a */
    public final int m74244a(Path path) {
        String string = path.getFileName().toString();
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException e11) {
            Logger.INSTANCE.exception(f71076g, C33778lf.m73987a("Failed to parse ", string, " as process ID"), e11);
            return -1;
        }
    }
}
