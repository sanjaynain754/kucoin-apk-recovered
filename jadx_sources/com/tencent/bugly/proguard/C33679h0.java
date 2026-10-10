package com.tencent.bugly.proguard;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.h0 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33679h0 {

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArrayList<String> f70045a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: a */
    public void m73229a(String str) {
        if (TextUtils.isEmpty(str) || this.f70045a.contains(str)) {
            return;
        }
        this.f70045a.add(str);
    }

    /* JADX INFO: renamed from: b */
    public List<String> m73230b() {
        return new ArrayList(this.f70045a);
    }

    /* JADX INFO: renamed from: a */
    public void m73228a() {
        this.f70045a.clear();
    }
}
