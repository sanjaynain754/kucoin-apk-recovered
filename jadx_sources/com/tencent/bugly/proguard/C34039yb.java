package com.tencent.bugly.proguard;

import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.meta.DumpResult;
import com.tencent.rmonitor.base.plugin.listener.IMemoryDumpListener;
import com.tencent.rmonitor.common.logcat.ILogcat;
import com.tencent.rmonitor.common.logcat.LogcatManager;
import com.tencent.rmonitor.common.logger.Logger;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.yb */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34039yb {

    /* JADX INFO: renamed from: a */
    public static final String f72552a = "RMonitor_Heap_MemoryDumpHelper";

    /* JADX INFO: renamed from: b */
    public static final InterfaceC33625e9 f72553b = C33915s7.m74925a();

    /* JADX INFO: renamed from: a */
    public static Pair<Boolean, String> m75494a(String str, InterfaceC33625e9 interfaceC33625e9, boolean z11, int i11) {
        Pair<Boolean, String> pair;
        String str2 = "";
        if (interfaceC33625e9 == null) {
            return new Pair<>(Boolean.FALSE, "");
        }
        synchronized (C34039yb.class) {
            try {
                Logger logger = Logger.INSTANCE;
                logger.mo77130d(f72552a, "ReportLog dumpHprof: ", str);
                String strM73404a = C33712ic.m73404a(System.currentTimeMillis(), "yy-MM-dd_HH.mm.ss");
                boolean z12 = false;
                if ("mounted".equals(Environment.getExternalStorageState())) {
                    File file = new File(C33712ic.f70262b);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    String absolutePath = file.getAbsolutePath();
                    if (!absolutePath.endsWith("/")) {
                        absolutePath = absolutePath.concat("/");
                    }
                    str2 = absolutePath + "dump_" + str + "_" + strM73404a + ".hprof";
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (z11 && i11 > 0) {
                            if (interfaceC33625e9.mo72144a(str2, new C33895r7(z11, i11, "")) == 0) {
                                z12 = true;
                            }
                            throw th;
                        }
                        if (interfaceC33625e9.mo72144a(str2, new C33895r7(false, 0)) == 0) {
                            z12 = true;
                        }
                        logger.mo77130d(f72552a, "dump used ", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), " ms");
                    } catch (Throwable th2) {
                        Logger.INSTANCE.exception(f72552a, th2);
                    }
                }
                pair = new Pair<>(Boolean.valueOf(z12), str2);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return pair;
    }

    /* JADX INFO: renamed from: a */
    public static DumpResult m75495a(String str, String str2, boolean z11, boolean z12, IMemoryDumpListener iMemoryDumpListener, boolean z13, int i11) {
        Object obj;
        List<String> listOnPrepareDump = iMemoryDumpListener != null ? iMemoryDumpListener.onPrepareDump(str) : null;
        if (listOnPrepareDump == null) {
            listOnPrepareDump = new ArrayList<>();
        }
        DumpResult dumpResult = new DumpResult();
        if (z11) {
            Pair<Boolean, String> pairM75494a = m75494a(str, f72553b, z13, i11);
            if (iMemoryDumpListener != null) {
                iMemoryDumpListener.onHprofDumped(str);
            }
            boolean zBooleanValue = ((Boolean) pairM75494a.first).booleanValue();
            dumpResult.success = zBooleanValue;
            if (zBooleanValue && (obj = pairM75494a.second) != null) {
                String str3 = (String) obj;
                listOnPrepareDump.add(str3);
                dumpResult.hprofFileSize = new File(str3).length();
                dumpResult.hprofPath = str3;
            } else {
                if (iMemoryDumpListener != null) {
                    iMemoryDumpListener.onFinishDump(false, str, "");
                }
                Logger.INSTANCE.mo77131e(f72552a, "generateHprof error ", str);
                return dumpResult;
            }
        }
        if (z12) {
            m75497a(listOnPrepareDump);
        }
        m75496a(str, str2, iMemoryDumpListener, listOnPrepareDump, dumpResult);
        return dumpResult;
    }

    /* JADX INFO: renamed from: a */
    public static void m75496a(String str, String str2, IMemoryDumpListener iMemoryDumpListener, List<String> list, DumpResult dumpResult) {
        Pair<Boolean, String> pairM73403a = C33712ic.m73403a(list, str2);
        boolean zBooleanValue = ((Boolean) pairM73403a.first).booleanValue();
        dumpResult.success = zBooleanValue;
        dumpResult.zipFilePath = (String) pairM73403a.second;
        Logger.INSTANCE.mo77130d(f72552a, "leakFlag=true", ",ZipFile=", String.valueOf(zBooleanValue), ",leakName=", str, ",dumpPath=", dumpResult.zipFilePath);
        if (iMemoryDumpListener != null) {
            iMemoryDumpListener.onFinishDump(dumpResult.success, str, dumpResult.zipFilePath);
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(it.next());
            if (file.isFile() && file.exists()) {
                file.delete();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m75497a(List<String> list) {
        if (AndroidVersion.isOverJellyBean() || C33872q4.m74663a(BaseInfo.app, "android.permission.READ_LOGS")) {
            ILogcat iLogcatInitLogcat = LogcatManager.initLogcat(1);
            iLogcatInitLogcat.setArgs(new String[]{"-t", C33556b3.f68995S, "-v", "threadtime"});
            String logcatFile = iLogcatInitLogcat.getLogcatFile();
            if (TextUtils.isEmpty(logcatFile)) {
                return;
            }
            list.add(logcatFile);
        }
    }
}
