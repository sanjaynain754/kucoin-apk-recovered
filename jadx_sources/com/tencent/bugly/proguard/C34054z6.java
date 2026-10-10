package com.tencent.bugly.proguard;

import android.text.TextUtils;
import com.tencent.rmonitor.p145fd.utils.SharkUtil;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import shark.HeapObject;
import shark.InterfaceC44456i;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.z6 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34054z6 extends AbstractC33533a1 {

    /* JADX INFO: renamed from: b */
    public static final String f72603b = "com.android.internal.policy.PhoneWindow";

    /* JADX INFO: renamed from: c */
    public static final String f72604c = "com.android.internal.policy.impl.PhoneWindow";

    /* JADX INFO: renamed from: d */
    public static final String f72605d = "com.android.internal.policy.HwPhoneWindow";

    /* JADX INFO: renamed from: e */
    public static final String f72606e = "android.view.SurfaceView";

    /* JADX INFO: renamed from: f */
    public static final String f72607f = "android.app.Activity";

    /* JADX INFO: renamed from: g */
    public static final String f72608g = "android.app.Dialog";

    /* JADX INFO: renamed from: h */
    public static final String f72609h = "mWindow";

    /* JADX INFO: renamed from: i */
    public static final String f72610i = "mTitle";

    @Override // com.tencent.bugly.proguard.InterfaceC33976v8
    /* JADX INFO: renamed from: a */
    public String mo72308a() {
        return InterfaceC33953u5.f72199F;
    }

    @Override // com.tencent.bugly.proguard.AbstractC34028y0
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Map<String, Integer> mo72309a(C33580c6 c33580c6) {
        HashMap map = new HashMap();
        Set<Long> hashSet = new HashSet<>();
        hashSet.addAll(m75589a(c33580c6, map, f72603b));
        hashSet.addAll(m75589a(c33580c6, map, f72604c));
        hashSet.addAll(m75589a(c33580c6, map, f72605d));
        m75591a(c33580c6.m72650a(), hashSet, f72607f, "mWindow", map);
        m75591a(c33580c6.m72650a(), hashSet, f72608g, "mWindow", map);
        m75590a(c33580c6, map);
        Map<String, Integer> map2 = new HashMap<>();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            m75471a(map2, (String) it.next());
        }
        return map2;
    }

    /* JADX INFO: renamed from: a */
    public final Set<Long> m75589a(C33580c6 c33580c6, Map<Long, String> map, String str) {
        HeapObject.HeapClass heapClassMo98072b = c33580c6.m72650a().mo98072b(str);
        HashSet hashSet = new HashSet();
        if (heapClassMo98072b != null) {
            for (HeapObject.HeapInstance heapInstance : heapClassMo98072b.m98016o()) {
                String stringField = SharkUtil.getStringField(heapInstance, f72610i);
                map.put(Long.valueOf(heapInstance.getObjectId()), "/title(" + stringField + ")");
                hashSet.add(Long.valueOf(heapInstance.getObjectId()));
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: a */
    public final void m75590a(C33580c6 c33580c6, Map<Long, String> map) {
        HeapObject.HeapClass heapClassMo98072b = c33580c6.m72650a().mo98072b(f72606e);
        if (heapClassMo98072b == null) {
            return;
        }
        for (HeapObject.HeapInstance heapInstance : heapClassMo98072b.m98016o()) {
            map.put(Long.valueOf(heapInstance.getObjectId()), "/" + heapInstance.m98034p());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m75591a(InterfaceC44456i interfaceC44456i, Set<Long> set, String str, String str2, Map<Long, String> map) {
        HeapObject.HeapClass heapClassMo98072b = interfaceC44456i.mo98072b(str);
        if (heapClassMo98072b == null) {
            return;
        }
        for (HeapObject.HeapInstance heapInstance : heapClassMo98072b.m98016o()) {
            HeapObject.HeapInstance instanceField = SharkUtil.getInstanceField(heapInstance, str, str2);
            if (instanceField != null && set.contains(Long.valueOf(instanceField.getObjectId()))) {
                String str3 = map.get(Long.valueOf(instanceField.getObjectId()));
                if (!TextUtils.isEmpty(str3)) {
                    map.put(Long.valueOf(instanceField.getObjectId()), "/" + heapInstance.m98034p() + str3);
                }
            }
        }
    }
}
