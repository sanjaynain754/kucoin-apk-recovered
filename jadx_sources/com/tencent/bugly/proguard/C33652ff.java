package com.tencent.bugly.proguard;

import androidx.annotation.Nullable;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.custom.ICustomDataEditor;
import com.tencent.rmonitor.manager.RMonitorLauncher;
import com.tencent.rmonitor.sla.C35185b;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ff */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33652ff implements InterfaceC33568bf {

    /* JADX INFO: renamed from: Y */
    public static final String f69896Y = "RMonitor_manager_sdk";

    /* JADX INFO: renamed from: a */
    public static boolean m73064a(int i11, String str) {
        boolean zMo75059a;
        InterfaceC34057z9 interfaceC34057z9M75058c = C33942te.m75054a().m75058c(i11);
        if (interfaceC34057z9M75058c != null) {
            zMo75059a = interfaceC34057z9M75058c.mo75059a(str);
        } else {
            m73061a("setProperty", i11, str);
            zMo75059a = false;
        }
        m73062a("setProperty", i11, str, zMo75059a);
        C35185b.c.f75333a.m77226b();
        return zMo75059a;
    }

    /* JADX INFO: renamed from: b */
    public static void m73067b() {
        C35185b.c.f75333a.m77231g();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m73074c(int i11, @Nullable Object obj) {
        boolean zMo75060a;
        InterfaceC33977v9 interfaceC33977v9M75055a = C33942te.m75054a().m75055a(i11);
        if (interfaceC33977v9M75055a != null) {
            zMo75060a = interfaceC33977v9M75055a.mo75060a(obj);
        } else {
            m73061a("setProperty", i11, obj);
            zMo75060a = false;
        }
        m73062a("setProperty", i11, obj, zMo75060a);
        C35185b.c.f75333a.m77226b();
        return zMo75060a;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m73076d() {
        return C33673gf.m73198a();
    }

    /* JADX INFO: renamed from: d */
    public static String m73075d(String str) {
        return C33991w3.m75338a().m77156e(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m73069b(List<String> list) {
        C33791m7.m74060h();
        if (C33791m7.f70940f) {
            Logger.INSTANCE.mo77134w("RMonitor_manager_sdk", "start monitors fail for app in standalone mode.");
            return;
        }
        if (list != null && !list.isEmpty()) {
            if (!C33673gf.m73198a()) {
                Logger.INSTANCE.mo77131e("RMonitor_manager_sdk", "start monitor fail for ", C33673gf.m73203d());
                return;
            } else {
                C34045yh.m75539c().m75541a(list, true);
                C33795mb.m74115a(list);
                return;
            }
        }
        Logger.INSTANCE.mo77131e("RMonitor_manager_sdk", "start monitor fail for list is null or empty.");
    }

    /* JADX INFO: renamed from: e */
    public static void m73077e(String str) {
        m73069b((List<String>) Collections.singletonList(str));
    }

    /* JADX INFO: renamed from: f */
    public static void m73078f(String str) {
        m73073c((List<String>) Collections.singletonList(str));
    }

    /* JADX INFO: renamed from: a */
    public static void m73059a() {
        if (!C33673gf.m73198a()) {
            Logger.INSTANCE.mo77131e("RMonitor_manager_sdk", "abolish fail for ", C33673gf.m73203d());
        } else {
            C34045yh.m75539c().m75540a();
            C33795mb.m74113a();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m73073c(List<String> list) {
        if (list != null && !list.isEmpty()) {
            if (!C33673gf.m73198a()) {
                Logger.INSTANCE.mo77131e("RMonitor_manager_sdk", "stop monitor fail for ", C33673gf.m73203d());
                return;
            } else {
                C34045yh.m75539c().m75541a(list, false);
                C33795mb.m74117b(list);
                return;
            }
        }
        Logger.INSTANCE.mo77131e("RMonitor_manager_sdk", "stop monitor fail for list is null or empty.");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m73066a(List<String> list) {
        return RMonitorLauncher.INSTANCE.checkAllDesiredPluginStarted(list);
    }

    /* JADX INFO: renamed from: a */
    public static void m73060a(String str) {
        C33657g.m73095h().m73104b(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m73068b(String str) {
        C33657g.m73095h().m73105c(str);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m73065a(String str, String str2) {
        return C33991w3.m75338a().putUserData(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m73070b(int i11, Object obj) {
        boolean zMo75360b;
        InterfaceC33997w9 interfaceC33997w9M75056b = C33942te.m75054a().m75056b(i11);
        if (interfaceC33997w9M75056b != null) {
            zMo75360b = interfaceC33997w9M75056b.mo75360b(obj);
        } else {
            m73061a("removeProperty", i11, obj);
            zMo75360b = false;
        }
        m73062a("removeProperty", i11, obj, zMo75360b);
        return zMo75360b;
    }

    /* JADX INFO: renamed from: c */
    public static ICustomDataEditor m73071c() {
        return C33991w3.m75338a();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m73063a(int i11, Object obj) {
        boolean zMo75359a;
        InterfaceC33997w9 interfaceC33997w9M75056b = C33942te.m75054a().m75056b(i11);
        if (interfaceC33997w9M75056b != null) {
            zMo75359a = interfaceC33997w9M75056b.mo75359a(obj);
        } else {
            m73061a("addProperty", i11, obj);
            zMo75359a = false;
        }
        m73062a("addProperty", i11, obj, zMo75359a);
        C35185b.c.f75333a.m77226b();
        return zMo75359a;
    }

    /* JADX INFO: renamed from: c */
    public static String m73072c(String str) {
        return C33991w3.m75338a().getUserData(str);
    }

    /* JADX INFO: renamed from: a */
    public static void m73061a(String str, int i11, Object obj) {
        Logger.INSTANCE.mo77134w("RMonitor_manager_sdk", str, ", invalid property, key = ", String.valueOf(i11), ", value = ", obj == null ? "null" : obj.toString());
    }

    /* JADX INFO: renamed from: a */
    public static void m73062a(String str, int i11, Object obj, boolean z11) {
        Logger.INSTANCE.mo77132i("RMonitor_manager_sdk", str, ", key = ", String.valueOf(i11), ", value = ", obj == null ? "null" : obj.toString(), ", ret = ", String.valueOf(z11));
    }
}
