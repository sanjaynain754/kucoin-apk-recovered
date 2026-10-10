package com.tencent.bugly.proguard;

import android.text.TextUtils;
import com.tencent.rmonitor.p145fd.utils.SharkUtil;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import shark.HeapObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.u6 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33954u6 extends AbstractC33533a1 {

    /* JADX INFO: renamed from: b */
    public static final String f72231b = "java.net.Socket";

    /* JADX INFO: renamed from: c */
    public static final String f72232c = "java.net.SocketImpl";

    /* JADX INFO: renamed from: d */
    public static final String f72233d = "impl";

    /* JADX INFO: renamed from: e */
    public static final String f72234e = "address";

    /* JADX INFO: renamed from: f */
    public static final String f72235f = "sun.nio.ch.SocketChannelImpl";

    /* JADX INFO: renamed from: g */
    public static final String f72236g = "remoteAddress";

    /* JADX INFO: renamed from: h */
    public static final String f72237h = "java.net.InetSocketAddress";

    /* JADX INFO: renamed from: i */
    public static final String f72238i = "holder";

    /* JADX INFO: renamed from: j */
    public static final String f72239j = "addr";

    /* JADX INFO: renamed from: k */
    public static final String f72240k = "java.net.InetSocketAddress$InetSocketAddressHolder";

    /* JADX INFO: renamed from: l */
    public static final String f72241l = "port";

    /* JADX INFO: renamed from: m */
    public static final String f72242m = "java.net.InetAddress";

    /* JADX INFO: renamed from: n */
    public static final String f72243n = "java.net.InetAddress$InetAddressHolder";

    /* JADX INFO: renamed from: o */
    public static final String f72244o = "originalHostName";

    /* JADX INFO: renamed from: p */
    public static final String f72245p = "address";

    @Override // com.tencent.bugly.proguard.InterfaceC33976v8
    /* JADX INFO: renamed from: a */
    public String mo72308a() {
        return "socket";
    }

    @Override // com.tencent.bugly.proguard.AbstractC34028y0
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Map<String, Integer> mo72309a(C33580c6 c33580c6) {
        HashMap map = new HashMap();
        Set<Long> setM75161a = m75161a(c33580c6, map);
        Set<Long> setM75162b = m75162b(c33580c6, map);
        HashSet hashSet = new HashSet();
        hashSet.addAll(setM75161a);
        hashSet.addAll(setM75162b);
        c33580c6.m72651a(mo72308a(), hashSet);
        return map;
    }

    /* JADX INFO: renamed from: b */
    public final Set<Long> m75162b(C33580c6 c33580c6, Map<String, Integer> map) {
        HeapObject.HeapInstance instanceField;
        HeapObject.HeapClass heapClassMo98072b = c33580c6.m72650a().mo98072b(f72235f);
        HashSet hashSet = new HashSet();
        if (heapClassMo98072b != null) {
            for (HeapObject.HeapInstance heapInstance : heapClassMo98072b.m98016o()) {
                HeapObject.HeapInstance instanceField2 = SharkUtil.getInstanceField(heapInstance, f72235f, f72236g);
                if (instanceField2 != null && (instanceField = SharkUtil.getInstanceField(instanceField2, f72237h, f72238i)) != null) {
                    int intField = SharkUtil.getIntField(instanceField, "port");
                    String strM75160a = m75160a(SharkUtil.getInstanceField(instanceField, f72240k, f72239j));
                    if (!TextUtils.isEmpty(strM75160a)) {
                        m75471a(map, String.format("/%s:%s", strM75160a, Integer.valueOf(intField)));
                        hashSet.add(Long.valueOf(heapInstance.getObjectId()));
                    }
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: a */
    public final Set<Long> m75161a(C33580c6 c33580c6, Map<String, Integer> map) {
        HeapObject.HeapClass heapClassMo98072b = c33580c6.m72650a().mo98072b(f72231b);
        HashSet hashSet = new HashSet();
        if (heapClassMo98072b != null) {
            for (HeapObject.HeapInstance heapInstance : heapClassMo98072b.m98016o()) {
                HeapObject.HeapInstance instanceField = SharkUtil.getInstanceField(heapInstance, f72231b, f72233d);
                if (instanceField != null) {
                    int intField = SharkUtil.getIntField(instanceField, f72232c, "port");
                    String strM75160a = m75160a(SharkUtil.getInstanceField(instanceField, f72232c, "address"));
                    if (!TextUtils.isEmpty(strM75160a)) {
                        m75471a(map, String.format("/%s:%s", strM75160a, Integer.valueOf(intField)));
                        hashSet.add(Long.valueOf(heapInstance.getObjectId()));
                    }
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: a */
    public final String m75160a(HeapObject.HeapInstance heapInstance) {
        if (heapInstance == null) {
            return null;
        }
        HeapObject.HeapInstance instanceField = SharkUtil.getInstanceField(heapInstance, f72242m, f72238i);
        String stringField = SharkUtil.getStringField(instanceField, f72244o);
        return TextUtils.isEmpty(stringField) ? m75159a(SharkUtil.getIntField(instanceField, "address")) : stringField;
    }

    /* JADX INFO: renamed from: a */
    public final String m75159a(long j11) {
        StringBuilder sb2 = new StringBuilder(15);
        for (int i11 = 0; i11 < 4; i11++) {
            sb2.insert(0, Long.toString(255 & j11));
            if (i11 < 3) {
                sb2.insert(0, '.');
            }
            j11 >>= 8;
        }
        return sb2.toString();
    }
}
