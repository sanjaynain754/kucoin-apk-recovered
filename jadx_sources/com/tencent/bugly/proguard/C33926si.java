package com.tencent.bugly.proguard;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.si */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C33926si extends C33694hf {

    /* JADX INFO: renamed from: n */
    public final ArrayList<a> f72011n;

    public C33926si() {
        super("work_thread_lag", false, 100, 0.1f);
        this.f72011n = new ArrayList<>();
    }

    @Override // com.tencent.bugly.proguard.C33694hf
    /* JADX INFO: renamed from: a */
    public void mo72626a(C33694hf c33694hf) {
        super.mo72626a(c33694hf);
        ArrayList<a> arrayList = this.f72011n;
        if (arrayList == null || !(c33694hf instanceof C33926si)) {
            return;
        }
        arrayList.clear();
        this.f72011n.addAll(((C33926si) c33694hf).f72011n);
    }

    /* JADX INFO: renamed from: b */
    public final void m75004b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            a aVar = new a();
            if (jSONObject.has("thread_name")) {
                aVar.f72012a = jSONObject.getString("thread_name");
            }
            if (jSONObject.has(AbstractC34022xe.f72511b)) {
                aVar.f72013b = (float) jSONObject.getDouble(AbstractC34022xe.f72511b);
            }
            if (jSONObject.has("event_sample_ratio")) {
                aVar.f72014c = (float) jSONObject.getDouble("event_sample_ratio");
            }
            if (jSONObject.has("lag_threshold")) {
                aVar.f72015d = jSONObject.getLong("lag_threshold");
            }
            if (jSONObject.has("stack_interval")) {
                aVar.f72016e = jSONObject.getLong("stack_interval");
            }
            if (jSONObject.has("max_stack_duration")) {
                aVar.f72017f = jSONObject.getLong("max_stack_duration");
            }
            m75003a(aVar);
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77131e("RMonitor_config", C33799mf.m74131a("parseWorkTypeConfig, t: ", th2));
        }
    }

    @Override // com.tencent.bugly.proguard.C33694hf
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C33926si clone() {
        return new C33926si(this);
    }

    public C33926si(@NonNull C33926si c33926si) {
        super(c33926si);
        this.f72011n = new ArrayList<>();
        mo72626a(c33926si);
    }

    /* JADX INFO: renamed from: a */
    public void m75003a(a aVar) {
        if (aVar == null || !aVar.m75007a()) {
            return;
        }
        a aVarM75002a = m75002a(aVar.f72012a);
        if (aVarM75002a != null) {
            aVarM75002a.m75006a(aVar);
        } else {
            this.f72011n.add(aVar);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.si$a */
    /* JADX INFO: compiled from: BUGLY */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f72012a = null;

        /* JADX INFO: renamed from: b */
        public float f72013b = 0.0f;

        /* JADX INFO: renamed from: c */
        public float f72014c = 0.1f;

        /* JADX INFO: renamed from: d */
        public long f72015d = 500;

        /* JADX INFO: renamed from: e */
        public long f72016e = 300;

        /* JADX INFO: renamed from: f */
        public long f72017f = 20000;

        /* JADX INFO: renamed from: a */
        public void m75006a(a aVar) {
            if (aVar == null) {
                return;
            }
            this.f72012a = aVar.f72012a;
            this.f72013b = aVar.f72013b;
            this.f72014c = aVar.f72014c;
            this.f72015d = aVar.f72015d;
            this.f72016e = aVar.f72016e;
            this.f72017f = aVar.f72017f;
        }

        /* JADX INFO: renamed from: a */
        public boolean m75007a() {
            return !TextUtils.isEmpty(this.f72012a) && this.f72015d > 0 && this.f72016e > 0 && this.f72017f > 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public a m75002a(String str) {
        try {
            for (a aVar : this.f72011n) {
                if (TextUtils.equals(str, aVar.f72012a)) {
                    return aVar;
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.tencent.bugly.proguard.C33694hf, com.tencent.bugly.proguard.InterfaceC33814n9
    /* JADX INFO: renamed from: a */
    public void mo72627a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        super.mo72627a(jSONObject);
        try {
            if (jSONObject.has("threads")) {
                JSONArray jSONArray = jSONObject.getJSONArray("threads");
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    m75004b(jSONArray.getJSONObject(i11));
                }
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception("RMonitor_config", "parsePluginConfig", th2);
        }
    }
}
