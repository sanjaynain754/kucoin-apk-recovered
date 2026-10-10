package com.tencent.thumbplayer.tcmedia.p164g.p172g;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.g.a */
/* JADX INFO: loaded from: classes64.dex */
public class C35378a {

    /* JADX INFO: renamed from: b */
    private long f76184b;

    /* JADX INFO: renamed from: c */
    private boolean f76185c;

    /* JADX INFO: renamed from: d */
    private boolean f76186d;

    /* JADX INFO: renamed from: e */
    private boolean f76187e;

    /* JADX INFO: renamed from: g */
    private boolean f76189g;

    /* JADX INFO: renamed from: a */
    private final Map<String, Long> f76183a = new HashMap();

    /* JADX INFO: renamed from: f */
    private String f76188f = "";

    /* JADX INFO: renamed from: a */
    public final void m78321a() {
        this.f76188f = "";
        this.f76183a.clear();
        this.f76184b = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: b */
    public final void m78323b() {
        this.f76183a.put("createCodec", Long.valueOf(System.currentTimeMillis() - this.f76184b));
    }

    /* JADX INFO: renamed from: c */
    public final void m78325c() {
        this.f76184b = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: d */
    public final void m78326d() {
        this.f76183a.put("startCodec", Long.valueOf(System.currentTimeMillis() - this.f76184b));
    }

    /* JADX INFO: renamed from: c */
    private final void m78319c(boolean z11) {
        this.f76185c = z11;
        this.f76187e = true;
    }

    /* JADX INFO: renamed from: d */
    private final void m78320d(boolean z11) {
        this.f76186d = z11;
    }

    /* JADX INFO: renamed from: a */
    public final void m78322a(boolean z11) {
        m78320d(z11);
        this.f76184b = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: b */
    public final void m78324b(boolean z11) {
        m78319c(z11);
        this.f76183a.put("configCodec", Long.valueOf(System.currentTimeMillis() - this.f76184b));
    }

    /* JADX INFO: renamed from: e */
    public final String m78327e() {
        if (TextUtils.isEmpty(this.f76188f)) {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("\"isVideo\":");
            sb2.append(this.f76189g + " ,");
            if (this.f76187e) {
                sb2.append("\"isReuse\":");
                sb2.append(this.f76185c + " ,");
            }
            sb2.append("\"reuseEnable\":");
            sb2.append(this.f76186d + " ,");
            long jLongValue = 0;
            for (Map.Entry<String, Long> entry : this.f76183a.entrySet()) {
                if (entry != null) {
                    jLongValue += entry.getValue().longValue();
                }
                sb2.append("\"" + ((Object) entry.getKey()) + "\":");
                sb2.append(entry.getValue().longValue() + " ,");
            }
            sb2.append("\"totalCodec\":");
            sb2.append(jLongValue);
            sb2.append("}");
            this.f76188f = sb2.toString();
        }
        return this.f76188f;
    }

    public C35378a(boolean z11) {
        this.f76189g = z11;
    }
}
