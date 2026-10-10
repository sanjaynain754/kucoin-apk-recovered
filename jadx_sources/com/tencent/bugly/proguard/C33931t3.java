package com.tencent.bugly.proguard;

import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.rmonitor.base.config.C35101b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.t3 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33931t3 {

    /* JADX INFO: renamed from: a */
    public static boolean f72033a = false;

    /* JADX INFO: renamed from: b */
    public static boolean f72034b = false;

    /* JADX INFO: renamed from: c */
    public static final int f72035c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f72036d = 2;

    /* JADX INFO: renamed from: e */
    public static final String f72037e = "https://rmonitor.qq.com";

    /* JADX INFO: renamed from: f */
    public static final String f72038f = "https://pro.bugly.qq.com";

    /* JADX INFO: renamed from: g */
    public static final String f72039g = "https://android.bugly.tencent.com";

    /* JADX INFO: renamed from: h */
    public static final String f72040h = "https://cloud.bugly.qq.com";

    /* JADX INFO: renamed from: a */
    public static void m75022a(String str, String str2, boolean z11) {
        try {
            if (f72034b) {
                return;
            }
            f72034b = true;
            C33905rh.m74872a(C33598d3.m72772c());
            C33765l2.m73825a(C33598d3.m72772c());
            C33765l2.m73827s().m73873e(str);
            C33765l2.m73827s().m73881i(str2);
            C33765l2.m73827s().f70756k0 = true;
            C33765l2.m73827s().f70786z0 = true;
            C33863pg.m74571a(C33598d3.m72772c(), (List<AbstractC33575c1>) null);
            C33918sa.f71856p = new C33969v1(C33598d3.m72772c(), true);
            AbstractC34022xe abstractC34022xeM77083a = C35101b.c.f75199a.m77083a(C33911s3.f71802h);
            if (abstractC34022xeM77083a == null || !(abstractC34022xeM77083a instanceof C33911s3) || ((C33911s3) abstractC34022xeM77083a).m74908b().booleanValue()) {
                f72033a = true;
            } else {
                C34012x4.m75444f("crash report is disabled, please modify your project's setting", new Object[0]);
                f72033a = false;
            }
        } catch (Throwable th2) {
            f72033a = false;
            C34012x4.m75435a(th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m75025b(String str) {
        if (f72033a) {
            C33765l2.m73827s().m73889m(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m75027c(String str) {
        if (f72033a) {
            C33765l2.m73827s().m73877g(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m75026b(List<CrashDetailBean> list) {
        if (!f72033a) {
            return false;
        }
        C33971v3.m75269a(C33598d3.m72772c(), C33905rh.m74876d(), list, 0L, true);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m75028c(List<C33965uh> list) {
        if (f72033a) {
            for (C33965uh c33965uh : list) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(C33592ci.m72747a(c33965uh));
                if (c33965uh.m75200c()) {
                    C33918sa.f71856p.m75249b(1);
                } else {
                    C33918sa.f71856p.m75249b(2);
                }
                C33918sa.f71856p.m75245a((List<UserInfoBean>) arrayList, true);
            }
            return true;
        }
        C34012x4.m75442d("uploadUserInfoData failed, please call init first", new Object[0]);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m75029d(String str) {
        return C33597d2.m72767a(str);
    }

    /* JADX INFO: renamed from: a */
    public static void m75021a(String str) {
        if (f72033a) {
            C33765l2.m73827s().m73879h(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m75023a(boolean z11) {
        if (f72033a) {
            C33765l2.m73827s().m73850a(Boolean.valueOf(z11));
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m75024a(List<C33703i3> list) {
        if (f72033a) {
            ArrayList arrayList = new ArrayList();
            Iterator<C33703i3> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C33592ci.m72748a(it.next()));
            }
            m75026b(arrayList);
            return true;
        }
        C34012x4.m75442d("uploadExceptionData failed, please call init first", new Object[0]);
        return false;
    }
}
