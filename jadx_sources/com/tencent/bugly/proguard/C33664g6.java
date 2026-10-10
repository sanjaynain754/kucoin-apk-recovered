package com.tencent.bugly.proguard;

import android.text.TextUtils;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.base.config.DefaultPluginConfig;
import com.tencent.rmonitor.common.util.FileUtil;
import java.io.File;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.g6 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33664g6 {

    /* JADX INFO: renamed from: a */
    public static final String f69955a = "RMonitor_FdLeak_ConfigHelper";

    /* JADX INFO: renamed from: b */
    public static final String f69956b = "fd_leak";

    /* JADX INFO: renamed from: c */
    public static final int f69957c = 400;

    /* JADX INFO: renamed from: d */
    public static File f69958d;

    /* JADX INFO: renamed from: c */
    public static DefaultPluginConfig m73153c() {
        return ConfigProxy.INSTANCE.getConfig().m77072c("fd_leak");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m73151a() {
        if (C33704i4.m73338a()) {
            return true;
        }
        return m73154d().f70932p;
    }

    /* JADX INFO: renamed from: b */
    public static File m73152b() {
        String rootPath = FileUtil.getRootPath();
        if (f69958d == null && !TextUtils.isEmpty(rootPath)) {
            f69958d = new File(rootPath, "fd_leak");
        }
        return f69958d;
    }

    /* JADX INFO: renamed from: d */
    public static C33790m6 m73154d() {
        DefaultPluginConfig defaultPluginConfigM73153c = m73153c();
        if (defaultPluginConfigM73153c != null) {
            C33694hf c33694hf = defaultPluginConfigM73153c.config;
            if (c33694hf instanceof C33790m6) {
                return (C33790m6) c33694hf;
            }
        }
        return new C33790m6();
    }

    /* JADX INFO: renamed from: e */
    public static int m73155e() {
        if (C33704i4.m73338a()) {
            return 400;
        }
        return m73154d().f70127l;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m73156f() {
        if (C33704i4.m73338a()) {
            return true;
        }
        if (AndroidVersion.isOverO() && (m73154d().f70930n & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m73157g() {
        if (Math.random() < m73154d().f70934r) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m73158h() {
        if ((m73154d().f70931o & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m73159i() {
        if (C33704i4.m73338a()) {
            return true;
        }
        if (AndroidVersion.isOverR() && m73154d().f70933q) {
            return true;
        }
        return false;
    }
}
