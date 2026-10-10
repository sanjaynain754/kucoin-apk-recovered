package com.tencent.bugly.proguard;

import android.text.TextUtils;
import com.tencent.rmonitor.common.util.FileUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.h6 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33685h6 {

    /* JADX INFO: renamed from: a */
    public static final String f70086a = "RMonitor_FdLeak_kDumpHelper";

    /* JADX INFO: renamed from: b */
    public static final InterfaceC34016x8[] f70087b = {new C33914s6(), new C34034y6(), new C33601d6(), new C33974v6()};

    /* JADX INFO: renamed from: c */
    public static final String f70088c = "fd_dump_";

    /* JADX INFO: renamed from: a */
    public static void m73249a() {
        FileUtil.deleteFile(m73250b());
    }

    /* JADX INFO: renamed from: b */
    public static File m73250b() {
        return new File(C33664g6.m73152b(), "dump_root");
    }

    /* JADX INFO: renamed from: a */
    public static C33706i6 m73245a(int i11, InterfaceC33996w8 interfaceC33996w8) {
        C33706i6 c33706i6M73341a;
        if (interfaceC33996w8 != null) {
            interfaceC33996w8.mo73008c(i11);
        }
        InterfaceC34016x8[] interfaceC34016x8Arr = f70087b;
        int length = interfaceC34016x8Arr.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                c33706i6M73341a = null;
                break;
            }
            InterfaceC34016x8 interfaceC34016x8 = interfaceC34016x8Arr[i12];
            if (interfaceC34016x8.mo72778a() == i11) {
                c33706i6M73341a = interfaceC34016x8.mo75450a(m73246a(i11, m73250b()));
                break;
            }
            i12++;
        }
        if (c33706i6M73341a == null) {
            c33706i6M73341a = C33706i6.m73341a(i11, 2);
        }
        if (interfaceC33996w8 != null) {
            interfaceC33996w8.mo73004a(i11, c33706i6M73341a);
        }
        return c33706i6M73341a;
    }

    /* JADX INFO: renamed from: b */
    public static String m73251b(List<C33706i6> list, ArrayList<String> arrayList) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (C33706i6 c33706i6 : list) {
            if (!c33706i6.m74914c() || TextUtils.isEmpty(c33706i6.m73347f())) {
                C33648fb.m73045d(f70086a, "dump result error or dump file path is empty");
            } else {
                arrayList2.add(c33706i6.m73347f());
            }
        }
        return m73247a(arrayList2, arrayList);
    }

    /* JADX INFO: renamed from: c */
    public static String m73252c() {
        return new File(new File(C33664g6.m73152b(), "zips"), f70088c + System.currentTimeMillis() + ".zip").getAbsolutePath();
    }

    /* JADX INFO: renamed from: a */
    public static List<C33706i6> m73248a(InterfaceC33996w8 interfaceC33996w8) {
        InterfaceC34016x8[] interfaceC34016x8Arr = f70087b;
        ArrayList arrayList = new ArrayList(interfaceC34016x8Arr.length);
        for (InterfaceC34016x8 interfaceC34016x8 : interfaceC34016x8Arr) {
            if (interfaceC34016x8.mo75288b()) {
                if (interfaceC33996w8 != null) {
                    interfaceC33996w8.mo73008c(interfaceC34016x8.mo72778a());
                }
                C33706i6 c33706i6Mo75450a = interfaceC34016x8.mo75450a(m73246a(interfaceC34016x8.mo72778a(), m73250b()));
                if (interfaceC33996w8 != null) {
                    interfaceC33996w8.mo73004a(interfaceC34016x8.mo72778a(), c33706i6Mo75450a);
                }
                arrayList.add(c33706i6Mo75450a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static String m73247a(List<String> list, ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(list);
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2.addAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        String strM73252c = m73252c();
        File file = new File(strM73252c);
        if (file.exists() && file.isFile()) {
            FileUtil.deleteFile(file);
        }
        if (!FileUtil.zipFiles((List<String>) arrayList2, strM73252c, false)) {
            return null;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            FileUtil.deleteFile(new File(it.next()));
        }
        return strM73252c;
    }

    /* JADX INFO: renamed from: a */
    public static String m73246a(int i11, File file) {
        String str;
        if (i11 == 1) {
            str = InterfaceC33953u5.f72201H;
        } else if (i11 == 2) {
            str = InterfaceC33953u5.f72202I;
        } else if (i11 == 3) {
            str = InterfaceC33953u5.f72203J;
        } else if (i11 != 4) {
            str = "";
        } else {
            str = InterfaceC33953u5.f72204K;
        }
        return new File(file, str).getAbsolutePath();
    }
}
