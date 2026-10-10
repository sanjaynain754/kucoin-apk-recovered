package com.tencent.bugly.proguard;

import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.k4 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C33746k4 implements InterfaceC33771l8 {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, C33694hf> f70547a = new HashMap<>(12);

    /* JADX INFO: renamed from: a */
    public final void m73695a() {
        this.f70547a.put(C33690hb.f70089t, new C33690hb(C33690hb.f70089t));
        this.f70547a.put("looper_metric", new C33690hb("looper_metric"));
        this.f70547a.put("memory_quantile", new C33694hf("memory_quantile", false, 100, 0.001f));
        this.f70547a.put("sub_memory_quantile", new C33694hf("sub_memory_quantile", false, 100, 0.001f));
        this.f70547a.put("launch_metric", new C33574c0());
        this.f70547a.put("db", new C33694hf("db", false, 10, 0.1f));
        this.f70547a.put("io", new C33694hf("io", false, 10, 0.1f));
        this.f70547a.put("battery", new C33694hf("battery", false, 10, 0.1f));
        this.f70547a.put("device", new C33694hf("device", false, 1, 0.001f));
        this.f70547a.put("traffic", new C33694hf("traffic", false, 1000, 0.5f, 0.0f, 100));
        this.f70547a.put("battery_ele_metric", new C33694hf("battery_ele_metric", false, 1000, 0.5f, 0.0f, 100));
        this.f70547a.put("battery_metric", new C33694hf("battery_metric", false, 1000, 0.5f, 0.0f, 1));
        this.f70547a.put("page_launch", new C33694hf("page_launch", false, 1000, 0.0f, 0.5f, 1));
        this.f70547a.put("custom_event", new C34031y3("custom_event"));
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33771l8
    /* JADX INFO: renamed from: b */
    public AbstractC34022xe mo73136b(String str) {
        if (AbstractC34022xe.f72512c.equals(str)) {
            return new C33805n0();
        }
        if (C33653fg.f69897g.equals(str)) {
            return new C33653fg();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final C33694hf m73696c(String str) {
        if (this.f70547a.size() == 0) {
            m73695a();
        }
        return this.f70547a.get(str);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33771l8
    /* JADX INFO: renamed from: a */
    public C33694hf mo73135a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C33694hf c33694hfM73696c = m73696c(str);
        return c33694hfM73696c != null ? c33694hfM73696c.clone() : c33694hfM73696c;
    }
}
