package com.tencent.bugly.proguard;

import android.util.Pair;
import androidx.annotation.NonNull;
import com.tencent.rmonitor.common.util.FileUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ic */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33712ic {

    /* JADX INFO: renamed from: a */
    public static final String f70261a = "RMonitor_MemoryUtils";

    /* JADX INFO: renamed from: b */
    public static final String f70262b = FileUtil.getRootPath() + "/Log/";

    /* JADX INFO: renamed from: a */
    public static Pair<Boolean, String> m73403a(@NonNull List<String> list, String str) {
        String strM73404a = m73404a(System.currentTimeMillis(), "yy-MM-dd_HH.mm.ss");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f70262b);
        sb2.append("dump_");
        sb2.append(str);
        sb2.append("_");
        String strM75464a = C34025xh.m75464a(sb2, strM73404a, ".zip");
        return new Pair<>(Boolean.valueOf(FileUtil.zipFiles(list, strM75464a, false)), strM75464a);
    }

    /* JADX INFO: renamed from: b */
    public static String m73405b() {
        return f70262b;
    }

    /* JADX INFO: renamed from: a */
    public static String m73404a(long j11, @NonNull String str) {
        if (j11 <= 0) {
            return null;
        }
        return new SimpleDateFormat(str, Locale.US).format(new Date(j11));
    }

    /* JADX INFO: renamed from: a */
    public static long m73402a() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }
}
