package com.tencent.bugly.proguard;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.a1 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC33533a1 extends AbstractC34028y0<C33580c6> implements InterfaceC33956u8 {
    @Override // com.tencent.bugly.proguard.InterfaceC33956u8
    /* JADX INFO: renamed from: a */
    public void mo72281a(C33580c6 c33580c6, C33727j6 c33727j6, Map<Long, String> map) {
        Set<Long> setM72649a = c33580c6.m72649a(mo72308a());
        if (setM72649a != null && !setM72649a.isEmpty()) {
            HashMap map2 = new HashMap();
            Iterator<Long> it = setM72649a.iterator();
            while (it.hasNext()) {
                String str = map.get(it.next());
                if (!TextUtils.isEmpty(str)) {
                    m75471a(map2, str);
                }
            }
            c33727j6.m73528b(C33853p6.m74505a(map2));
        }
    }
}
