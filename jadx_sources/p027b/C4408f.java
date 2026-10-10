package p027b;

import aai.O0000o0o0;
import aai.telemetry.AAITelemetryJNI;
import aai.telemetry.enums.MonitorType;
import android.content.Context;
import android.util.Pair;
import com.jumio.core.constants.ConstantsKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p457n.C42685f;
import p457n.C42686g;
import p457n.C42687h;
import p482o.C42901a;
import p520p.C43342c;

/* JADX INFO: renamed from: b.f */
/* JADX INFO: loaded from: classes23.dex */
public class C4408f {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap<MonitorType, Lock> f3846a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b.f$a */
    public class a implements FilenameFilter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MonitorType f3847a;

        public a(MonitorType monitorType) {
            this.f3847a = monitorType;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(this.f3847a.fileExtension);
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[][] m4074a(File[] fileArr) {
        try {
            byte[][] bArr = new byte[fileArr.length][];
            for (int i11 = 0; i11 < fileArr.length; i11++) {
                try {
                    bArr[i11] = m4079f(fileArr[i11]);
                } catch (Exception unused) {
                }
            }
            return bArr;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static File[] m4081h(MonitorType monitorType, Context context) {
        if (context == null) {
            return null;
        }
        try {
            File file = new File(context.getFilesDir(), monitorType.fileDir);
            if (file.exists() && file.isDirectory()) {
                return file.listFiles(new a(monitorType));
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m4075b(MonitorType monitorType, Map<String, Object> map, boolean z11, String str, Context context) {
        Lock reentrantLock;
        ConcurrentHashMap<MonitorType, Lock> concurrentHashMap = f3846a;
        synchronized (concurrentHashMap) {
            try {
                reentrantLock = concurrentHashMap.get(monitorType);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    concurrentHashMap.put(monitorType, reentrantLock);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        reentrantLock.lock();
        try {
            File[] fileArrM4081h = m4081h(monitorType, context);
            if (fileArrM4081h != null && fileArrM4081h.length != 0) {
                int i11 = 0;
                while (i11 < fileArrM4081h.length) {
                    File[] fileArr = (File[]) Arrays.copyOfRange(fileArrM4081h, i11, Math.min(monitorType.maxBatchFileCount + i11, fileArrM4081h.length));
                    byte[] bArrM4080g = m4080g(fileArr);
                    if (bArrM4080g == null) {
                        for (File file : fileArr) {
                            file.delete();
                        }
                    } else if (m4078e(bArrM4080g, monitorType.urlType, map, z11, str)) {
                        for (File file2 : fileArr) {
                            file2.delete();
                        }
                    }
                    i11 += monitorType.maxBatchFileCount;
                }
            }
        } catch (Exception unused) {
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m4076c(File file, MonitorType monitorType, Map<String, Object> map, boolean z11, String str) {
        if (file == null) {
            return;
        }
        try {
            if (m4078e(m4080g(new File[]{file}), monitorType.urlType, map, z11, str)) {
                file.delete();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m4078e(byte[] bArr, O0000o0o0 o0000o0o0, Map<String, Object> map, boolean z11, String str) {
        C43342c c43342cM95430g = new C43342c.a().m95429f("data", "data.json", ConstantsKt.MIME_TYPE_OCTET_STREAM, bArr).m95430g();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strO0OO0oOo0o0o0 = AAITelemetryJNI.O0OO0oOo0o0o0(o0000o0o0.name());
        C42686g c42686gM93543h = new C42686g.a().m93547l(strO0OO0oOo0o0o0).m93542g(map).m93548m(c43342cM95430g).m93544i(str).m93543h();
        C42687h c42687hM93519n = new C42685f.b().m93526d(new C42901a()).m93529g(30000).m93528f(z11).m93527e().m93519n(c42686gM93543h);
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
        m4077d(c42686gM93543h, c42687hM93519n, strO0OO0oOo0o0o0, iCurrentTimeMillis);
        return ((C42687h) Pair.create(c42687hM93519n, Integer.valueOf(iCurrentTimeMillis)).first).m93549a() != null;
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m4079f(File file) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[(int) file.length()];
            if (fileInputStream.read(bArr) == file.length()) {
                fileInputStream.close();
                return bArr;
            }
            throw new IOException("Could not completely read file " + file.getName());
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m4080g(File[] fileArr) {
        try {
            byte[][] bArrM4074a = m4074a(fileArr);
            if (bArrM4074a != null) {
                return AAITelemetryJNI.O0OO0oOo0o0o(bArrM4074a);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m4077d(C42686g c42686g, C42687h c42687h, String str, int i11) {
    }
}
