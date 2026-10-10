package com.tencent.bugly.proguard;

import android.text.TextUtils;
import com.tencent.rmonitor.p145fd.utils.SharkUtil;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import shark.HeapObject;
import shark.InterfaceC44456i;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.w5 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33993w5 extends AbstractC33533a1 {

    /* JADX INFO: renamed from: b */
    public static final String f72410b = "RMonitor_FdLeak_FdCursorAnalyzer";

    /* JADX INFO: renamed from: c */
    public static final String f72411c = "android.database.CursorWindow";

    /* JADX INFO: renamed from: d */
    public static final String f72412d = "android.database.sqlite.SQLiteCursor";

    /* JADX INFO: renamed from: e */
    public static final String f72413e = "android.database.AbstractWindowedCursor";

    /* JADX INFO: renamed from: f */
    public static final String f72414f = "mWindow";

    /* JADX INFO: renamed from: g */
    public static final String f72415g = "mName";

    /* JADX INFO: renamed from: h */
    public static final String f72416h = "mEditTable";

    @Override // com.tencent.bugly.proguard.InterfaceC33976v8
    /* JADX INFO: renamed from: a */
    public String mo72308a() {
        return InterfaceC33953u5.f72198E;
    }

    @Override // com.tencent.bugly.proguard.AbstractC34028y0
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Map<String, Integer> mo72309a(C33580c6 c33580c6) {
        HashMap map = new HashMap();
        c33580c6.m72651a(mo72308a(), m75345a(c33580c6.m72650a(), map));
        return map;
    }

    /* JADX INFO: renamed from: a */
    public final Set<Long> m75345a(InterfaceC44456i interfaceC44456i, Map<String, Integer> map) {
        HeapObject.HeapClass heapClassMo98072b = interfaceC44456i.mo98072b(f72412d);
        HashSet hashSet = new HashSet();
        if (heapClassMo98072b != null) {
            for (HeapObject.HeapInstance heapInstance : heapClassMo98072b.m98016o()) {
                String stringField = SharkUtil.getStringField(heapInstance, f72412d, f72416h);
                if (TextUtils.isEmpty(stringField)) {
                    stringField = "default_table";
                }
                HeapObject.HeapInstance instanceField = SharkUtil.getInstanceField(heapInstance, f72413e, "mWindow");
                if (instanceField != null) {
                    m75471a(map, String.format("%s/table:%s", SharkUtil.getStringField(instanceField, f72411c, f72415g), stringField));
                    hashSet.add(Long.valueOf(instanceField.getObjectId()));
                }
            }
        }
        return hashSet;
    }
}
