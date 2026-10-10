package com.tencent.bugly.proguard;

import android.os.SystemClock;
import com.tencent.rmonitor.common.util.FileUtil;
import java.io.File;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.z0 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC34048z0 implements InterfaceC34016x8 {

    /* JADX INFO: renamed from: g */
    public static final String f72584g = "RMonitor_FdLeak_BaseFdLeakDumper";

    @Override // com.tencent.bugly.proguard.InterfaceC34016x8
    /* JADX INFO: renamed from: a */
    public C33706i6 mo75450a(String str) {
        C33706i6 c33706i6Mo72780c;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (m75571b(str)) {
            c33706i6Mo72780c = mo72780c(str);
        } else {
            C33648fb.m73045d(f72584g, "dump failed due to invalid file path");
            c33706i6Mo72780c = m75569a(3, str);
        }
        c33706i6Mo72780c.m73343a(SystemClock.uptimeMillis() - jUptimeMillis);
        return c33706i6Mo72780c;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC34016x8
    /* JADX INFO: renamed from: b */
    public boolean mo75288b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public abstract C33706i6 mo72780c(String str);

    /* JADX INFO: renamed from: b */
    public final boolean m75571b(String str) {
        File file = new File(str);
        return file.exists() ? file.isFile() : FileUtil.createFile(str);
    }

    /* JADX INFO: renamed from: a */
    public C33706i6 m75570a(String str, Object obj) {
        return new C33706i6(mo72778a(), str, obj);
    }

    /* JADX INFO: renamed from: a */
    public C33706i6 m75569a(int i11, String str) {
        return new C33706i6(mo72778a(), i11, str);
    }

    /* JADX INFO: renamed from: a */
    public C33706i6 m75568a(int i11) {
        return C33706i6.m73341a(mo72778a(), i11);
    }
}
