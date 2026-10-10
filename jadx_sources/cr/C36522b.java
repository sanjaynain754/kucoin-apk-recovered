package cr;

import android.app.ActivityManager;
import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.monitor.utils.DeviceLevel;
import com.kubi.monitor.utils.DeviceLevelException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43848i;
import p569qq.C43852m;
import p734wq.C45916a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.Charsets;
import p852kotlin.text.Regex;
import ro.C44128b;

/* JADX INFO: renamed from: cr.b */
/* JADX INFO: compiled from: DeviceLevelHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\rH\u0002¢\u0006\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010,¨\u0006."}, m90084d2 = {"Lcr/b;", "", "<init>", "()V", "Lcom/kubi/monitor/utils/DeviceLevel;", "g", "()Lcom/kubi/monitor/utils/DeviceLevel;", "Landroid/content/Context;", "context", "", "i", "(Landroid/content/Context;)V", "m", "", "k", "(Landroid/content/Context;)I", "j", "()I", CmcdData.Factory.STREAMING_FORMAT_HLS, "d", "", "file", "e", "(Ljava/lang/String;)I", "cores", "f", "(I)I", "Ljava/io/FileInputStream;", "stream", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/io/FileInputStream;)I", "", "buffer", "index", "c", "([BI)I", "Lcr/c;", "b", "Lcr/c;", "sLevelCache", "", "Z", "hasInitialed", "Ljava/io/FileFilter;", "Ljava/io/FileFilter;", "CPU_FILTER", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C36522b {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static boolean hasInitialed;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C36522b f79371a = new C36522b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static DeviceLevelInfo sLevelCache = new DeviceLevelInfo(0, null, 0, 0, 0, 31, null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final FileFilter CPU_FILTER = new FileFilter() { // from class: cr.a
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            return C36522b.m81772b(file);
        }
    };

    /* JADX INFO: renamed from: c */
    public final int m81773c(byte[] buffer, int index) {
        byte b11;
        while (index < buffer.length && (b11 = buffer[index]) != ((byte) 10)) {
            if (Character.isDigit(b11)) {
                int i11 = index + 1;
                while (i11 < buffer.length && Character.isDigit(buffer[i11])) {
                    i11++;
                }
                return Integer.parseInt(new String(buffer, index, i11 - index, Charsets.UTF_8));
            }
            index++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public final int m81776f(int cores) {
        int i11 = 0;
        int iM81782l = 0;
        while (i11 < cores) {
            int i12 = i11 + 1;
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i11 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists() && file.canRead()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        try {
                            fileInputStream.read(bArr);
                            int i13 = 0;
                            while (Character.isDigit(bArr[i13])) {
                                i13++;
                            }
                            String str = new String(bArr, 0, i13, Charsets.UTF_8);
                            C44128b.m97259c("Monitor::DeviceLevelHelper", Intrinsics.stringPlus("getCPUFreqKHz:::", str));
                            iM81782l += Integer.parseInt(str);
                        } catch (Throwable th2) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable unused) {
                            }
                            throw th2;
                        }
                    } catch (NumberFormatException e11) {
                        C44128b.m97263g("Monitor::DeviceLevelHelper", e11);
                    }
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused2) {
                    }
                }
                i11 = i12;
            } catch (IOException e12) {
                C44128b.m97263g("Monitor::DeviceLevelHelper", e12);
                return -1;
            }
        }
        if (iM81782l != 0) {
            return iM81782l;
        }
        FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
        try {
            iM81782l += m81782l(fileInputStream2) * 1000;
        } catch (Throwable th3) {
            try {
                C44128b.m97263g("Monitor::DeviceLevelHelper", th3);
            } finally {
                try {
                    fileInputStream2.close();
                } catch (Throwable unused3) {
                }
            }
        }
        try {
            return iM81782l;
        } catch (Throwable unused4) {
            return iM81782l;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m81772b(File file) {
        return Pattern.matches("cpu\\d", file.getName());
    }

    /* JADX INFO: renamed from: d */
    public final int m81774d() {
        File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(CPU_FILTER);
        if (fileArrListFiles == null) {
            return 0;
        }
        return fileArrListFiles.length;
    }

    /* JADX INFO: renamed from: e */
    public final int m81775e(String file) throws Throwable {
        int i11 = 0;
        FileInputStream fileInputStream = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream2, "UTF-8"));
                        String line = bufferedReader.readLine();
                        C44128b.m97259c("Monitor::DeviceLevelHelper", Intrinsics.stringPlus("[getCoresFromFile] content ! ", line));
                        bufferedReader.close();
                        if (line != null && new Regex("0-\\d+$").matches(line)) {
                            String strSubstring = line.substring(2);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                            i11 = Integer.parseInt(strSubstring) + 1;
                            fileInputStream2.close();
                            return i11;
                        }
                        try {
                            fileInputStream2.close();
                            return 0;
                        } catch (IOException e11) {
                            C44128b.m97262f("Monitor::DeviceLevelHelper", "[getCoresFromFile] error!", e11);
                            return 0;
                        }
                    } catch (IOException e12) {
                        e = e12;
                        fileInputStream = fileInputStream2;
                        C44128b.m97262f("Monitor::DeviceLevelHelper", "[getCoresFromFile] error!", e);
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return i11;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e13) {
                                C44128b.m97262f("Monitor::DeviceLevelHelper", "[getCoresFromFile] error!", e13);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e14) {
                    e = e14;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e15) {
            C44128b.m97262f("Monitor::DeviceLevelHelper", "[getCoresFromFile] error!", e15);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final DeviceLevel m81777g() {
        if (!hasInitialed) {
            m81779i(C43848i.f96913a.m96584c());
        }
        return sLevelCache.getRelativeLevel();
    }

    /* JADX INFO: renamed from: h */
    public final int m81778h() throws Throwable {
        int iM81775e;
        try {
            iM81775e = m81775e("/sys/devices/system/cpu/possible");
            if (iM81775e == 0) {
                iM81775e = m81775e("/sys/devices/system/cpu/present");
            }
            if (iM81775e == 0) {
                iM81775e = m81774d();
            }
        } catch (Exception unused) {
            iM81775e = 0;
        }
        if (iM81775e == 0) {
            return 1;
        }
        return iM81775e;
    }

    /* JADX INFO: renamed from: i */
    public final void m81779i(@Nullable Context context) {
        Object objM103844constructorimpl;
        DeviceLevel deviceLevel;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (context == null) {
                C44128b.m97266j("Monitor::DeviceLevelHelper", "initLevel context is null");
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            int iM81781k = m81781k(context);
            int iM81780j = m81780j();
            int i11 = iM81781k + iM81780j;
            hasInitialed = true;
            if (i11 >= 8) {
                deviceLevel = DeviceLevel.BEST;
            } else if (i11 >= 6) {
                deviceLevel = DeviceLevel.HIGH;
            } else if (i11 >= 4) {
                deviceLevel = DeviceLevel.MIDDLE;
            } else {
                deviceLevel = i11 > 2 ? DeviceLevel.LOW : DeviceLevel.BAD;
            }
            sLevelCache.m81792i(deviceLevel);
            sLevelCache.m81791h(i11);
            C44128b.m97266j("Monitor::DeviceLevelHelper", "getLevel, cost:" + (System.currentTimeMillis() - jCurrentTimeMillis) + ", memLevel:" + iM81781k + ", cpuLevel:" + iM81780j + ", finalLevel:" + sLevelCache);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl == null) {
                return;
            }
            C45916a.m101366a(new DeviceLevelException(thM103847exceptionOrNullimpl), "Monitor::DeviceLevelHelper");
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: renamed from: l */
    public final int m81782l(FileInputStream stream) {
        byte[] bArr = new byte[1024];
        try {
            int i11 = stream.read(bArr);
            int i12 = 0;
            while (i12 < i11) {
                byte b11 = bArr[i12];
                byte b12 = (byte) 10;
                if (b11 == b12 || i12 == 0) {
                    if (b11 == b12) {
                        i12++;
                    }
                    int i13 = i12;
                    while (i13 < i11) {
                        int i14 = i13 + 1;
                        int i15 = i13 - i12;
                        if (bArr[i13] != ((byte) "cpu MHz".charAt(i15))) {
                            break;
                        }
                        if (i15 == 6) {
                            return m81773c(bArr, i13);
                        }
                        i13 = i14;
                    }
                }
                i12++;
            }
            return -1;
        } catch (Exception e11) {
            C44128b.m97263g("Monitor::DeviceLevelHelper", e11);
            return -1;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m81783m() {
        C43852m.m96604p("DeviceLevel", "Monitor", new Pair("type", Integer.valueOf(sLevelCache.getRelativeLevel().getValue())), new Pair("timeConsuming", Long.valueOf(sLevelCache.getTotalMem())), new Pair("code", Long.valueOf(sLevelCache.getAvgCpuFreq())), new Pair("message", Integer.valueOf(sLevelCache.getLevelScore())), new Pair("error_msg", Integer.valueOf(sLevelCache.getCpuCrossNum())));
    }

    /* JADX INFO: renamed from: j */
    public final int m81780j() throws Throwable {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iM81778h = m81778h();
        long jM81776f = ((long) m81776f(iM81778h)) / 1000;
        long j11 = jM81776f / ((long) iM81778h);
        C44128b.m97266j("Monitor::DeviceLevelHelper", "getNumOfCores cost:" + (System.currentTimeMillis() - jCurrentTimeMillis) + ", cpuCross:" + iM81778h + ", totalCpuZ:" + jM81776f + ", avgCpuHz:" + j11);
        sLevelCache.m81789f(j11);
        sLevelCache.m81790g(iM81778h);
        if (iM81778h < 4 || j11 < 1600) {
            return 1;
        }
        if (j11 < 2150) {
            return 2;
        }
        if (j11 >= 2300) {
            return 4;
        }
        return 3;
    }

    /* JADX INFO: renamed from: k */
    public final int m81781k(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        Object systemService = context.getSystemService("activity");
        if (systemService != null) {
            ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
            long j11 = memoryInfo.totalMem / 1073741824;
            C44128b.m97266j("Monitor::DeviceLevelHelper", "getTotalMemory cost:" + (System.currentTimeMillis() - jCurrentTimeMillis) + ", total_mem:" + j11 + " GB");
            sLevelCache.m81793j(j11);
            if (j11 >= 8) {
                return 5;
            }
            if (j11 >= 6) {
                return 4;
            }
            if (j11 >= 4) {
                return 3;
            }
            if (j11 >= 2) {
                return 2;
            }
            if (j11 >= 0) {
                return 1;
            }
            return 0;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
    }
}
