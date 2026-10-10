package com.tencent.rmonitor.p145fd.cluser;

import com.tencent.bugly.proguard.C33621e5;
import com.tencent.bugly.proguard.C33693he;
import com.tencent.bugly.proguard.C33914s6;
import com.tencent.bugly.proguard.C33933t5;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.bugly.proguard.InterfaceC34056z8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
public class FdCluster {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC34056z8[] f75267a = {new C33693he(1, "socket:["), new C33693he(6, "pipe:["), new C33621e5(2, "anon_inode:[eventpoll]", "anon_inode:[eventfd]"), new C33693he(3, "/dev/ashmem"), new C33693he(4, "/dmabuf", "anon_inode:dmabuf", "/dev/ion"), new C33693he(5, "/data/", "/storage/", "/sdcard/"), new C33693he(9, "/system/", "/vendor/", "/apex/", "/sys/", "/proc/"), new C33693he(7, "/dev/mali", "/dev/kgsl-3d", "/dev/pvrsrvkm"), new C33693he(8, "/dev/")};

    /* JADX INFO: renamed from: a */
    public Map<Integer, C33933t5> m77174a(List<String> list) {
        HashMap map = new HashMap();
        for (String str : list) {
            InterfaceC34056z8 interfaceC34056z8M77173a = m77173a(str);
            if (interfaceC34056z8M77173a != null) {
                m77175a(interfaceC34056z8M77173a.mo72407a(), str, map);
            } else {
                m77175a(10, str, map);
            }
        }
        return map;
    }

    public static String matchFdType(String str) {
        InterfaceC34056z8 interfaceC34056z8M77173a = m77173a(str);
        if (interfaceC34056z8M77173a != null) {
            return C33914s6.m74915b(interfaceC34056z8M77173a.mo72407a());
        }
        return InterfaceC33953u5.f72221q;
    }

    /* JADX INFO: renamed from: a */
    public static C33933t5 m77172a(Map<Integer, C33933t5> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.values());
        Collections.sort(arrayList);
        return (C33933t5) arrayList.get(0);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static InterfaceC34056z8 m77173a(String str) {
        for (InterfaceC34056z8 interfaceC34056z8 : f75267a) {
            if (interfaceC34056z8.mo72925a(str)) {
                return interfaceC34056z8;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m77175a(int i11, String str, Map<Integer, C33933t5> map) {
        C33933t5 c33933t5 = map.get(Integer.valueOf(i11));
        if (c33933t5 == null) {
            c33933t5 = new C33933t5(i11);
            map.put(Integer.valueOf(i11), c33933t5);
        }
        c33933t5.m75038a(str);
    }
}
