package com.tencent.bugly.proguard;

import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import com.tencent.rmonitor.common.logger.LogState;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.af */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33547af {

    /* JADX INFO: renamed from: d */
    public static final String f68866d = "RMonitor_config";

    /* JADX INFO: renamed from: a */
    public float f68867a = 1.0f;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap<String, C33694hf> f68868b = new ConcurrentHashMap<>(10);

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap<String, AbstractC34022xe> f68869c = new ConcurrentHashMap<>(3);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: a */
    public List<String> m72366a(List<String> list) {
        ArrayList arrayList = null;
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                C33694hf c33694hfM72369c = m72369c(it.next());
                if (c33694hfM72369c != null && c33694hfM72369c.f70122g) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c33694hfM72369c.f70121f);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public AbstractC34022xe m72368b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        AbstractC34022xe abstractC34022xeM72369c = this.f68869c.get(str);
        if (abstractC34022xeM72369c == null && (abstractC34022xeM72369c = C33970v2.b.f72311a.mo73136b(str)) != null) {
            this.f68869c.put(str, abstractC34022xeM72369c);
        }
        if (abstractC34022xeM72369c == null) {
            abstractC34022xeM72369c = m72369c(str);
        }
        if (abstractC34022xeM72369c == null) {
            Logger.INSTANCE.mo77130d("RMonitor_config", C33778lf.m73987a("getConfig, ", str, " with null config"));
        }
        return abstractC34022xeM72369c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: c */
    public C33694hf m72369c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C33694hf c33694hfMo73135a = this.f68868b.get(str);
        if (c33694hfMo73135a == null && (c33694hfMo73135a = C33970v2.b.f72311a.mo73135a(str)) != null) {
            this.f68868b.put(str, c33694hfMo73135a);
        }
        if (c33694hfMo73135a == null) {
            Logger.INSTANCE.mo77130d("RMonitor_config", C33778lf.m73987a("getPluginConfig, ", str, " with null config"));
        }
        return c33694hfMo73135a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: a */
    public void m72367a(String str) {
        if (Logger.INSTANCE.getIntLevel() < LogState.INFO.getValue()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(300);
        sb2.append("dump for ");
        sb2.append(str);
        sb2.append(", {");
        try {
            Iterator<Map.Entry<String, C33694hf>> it = this.f68868b.entrySet().iterator();
            int i11 = 0;
            while (it.hasNext()) {
                C33694hf value = it.next().getValue();
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(value.f70121f);
                sb2.append(C33844oi.f71346o);
                sb2.append(value.f70122g);
                i11++;
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception("RMonitor_config", th2);
        }
        sb2.append("}");
        Logger.INSTANCE.mo77132i("RMonitor_config", sb2.toString());
    }
}
