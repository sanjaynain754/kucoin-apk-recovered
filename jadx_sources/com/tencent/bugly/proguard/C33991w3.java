package com.tencent.bugly.proguard;

import com.tencent.rmonitor.custom.C35153a;
import com.tencent.rmonitor.custom.ICustomDataEditor;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.w3 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33991w3 {

    /* JADX INFO: renamed from: a */
    public static C35153a f72409a;

    /* JADX INFO: renamed from: a */
    public static C35153a m75338a() {
        if (f72409a == null) {
            synchronized (C33991w3.class) {
                try {
                    if (f72409a == null) {
                        C35153a c35153a = new C35153a();
                        c35153a.f75243h = C33882qe.a.f71576a.m74699d();
                        f72409a = c35153a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f72409a;
    }

    /* JADX INFO: renamed from: b */
    public static C35153a m75341b() {
        return new C35153a();
    }

    /* JADX INFO: renamed from: c */
    public static void m75343c(InterfaceC33917s9 interfaceC33917s9, C35153a c35153a, String str) {
        List<String> listMo74446a = interfaceC33917s9.mo74446a(str, (List<String>) null);
        if (listMo74446a == null || listMo74446a.isEmpty()) {
            return;
        }
        Iterator<String> it = listMo74446a.iterator();
        while (it.hasNext()) {
            c35153a.addStringToStringArrayParam(str, it.next());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m75342b(InterfaceC33917s9 interfaceC33917s9, C35153a c35153a, String str) {
        List<String> listMo74446a = interfaceC33917s9.mo74446a(str, (List<String>) null);
        if (listMo74446a == null || listMo74446a.isEmpty()) {
            return;
        }
        Iterator<String> it = listMo74446a.iterator();
        while (it.hasNext()) {
            c35153a.m77150b(str, it.next());
        }
    }

    /* JADX INFO: renamed from: a */
    public static C35153a m75339a(InterfaceC33917s9 interfaceC33917s9) {
        C35153a c35153a = null;
        if (interfaceC33917s9 == null) {
            return null;
        }
        Set<String> setMo74447a = interfaceC33917s9.mo74447a();
        if (setMo74447a != null && !setMo74447a.isEmpty()) {
            c35153a = new C35153a();
            Iterator<String> it = setMo74447a.iterator();
            while (it.hasNext()) {
                m75340a(interfaceC33917s9, c35153a, it.next());
            }
        }
        return c35153a;
    }

    /* JADX INFO: renamed from: a */
    public static void m75340a(InterfaceC33917s9 interfaceC33917s9, C35153a c35153a, String str) {
        if (C33702i2.m73295a(ICustomDataEditor.NUMBER_PARAM_KEYS, str)) {
            c35153a.putNumberParam(str, interfaceC33917s9.mo74442a(str, 0.0d));
            return;
        }
        if (C33702i2.m73295a(ICustomDataEditor.STRING_PARAM_KEYS, str)) {
            c35153a.putStringParam(str, interfaceC33917s9.mo74445a(str, ""));
            return;
        }
        if (C33702i2.m73295a(ICustomDataEditor.STRING_ARRAY_PARAM_KEYS, str)) {
            m75343c(interfaceC33917s9, c35153a, str);
        } else if (C33702i2.m73295a(C35153a.f75234l, str)) {
            m75342b(interfaceC33917s9, c35153a, str);
        } else if (str.startsWith(C35153a.f75235m)) {
            c35153a.putUserData(str.substring(10), interfaceC33917s9.mo74445a(str, ""));
        }
    }
}
