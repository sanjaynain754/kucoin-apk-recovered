package com.tencent.bugly.proguard;

import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.wc */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C34000wc extends C33694hf {

    /* JADX INFO: renamed from: A */
    public static final int f72425A = 5;

    /* JADX INFO: renamed from: u */
    public static final long f72426u = 1099511627776L;

    /* JADX INFO: renamed from: v */
    public static final long f72427v = 3670016000L;

    /* JADX INFO: renamed from: w */
    public static final int f72428w = 1;

    /* JADX INFO: renamed from: x */
    public static final int f72429x = 2;

    /* JADX INFO: renamed from: y */
    public static final int f72430y = 3;

    /* JADX INFO: renamed from: z */
    public static final int f72431z = 4;

    /* JADX INFO: renamed from: n */
    public int f72432n;

    /* JADX INFO: renamed from: o */
    public long f72433o;

    /* JADX INFO: renamed from: p */
    public long f72434p;

    /* JADX INFO: renamed from: q */
    public boolean f72435q;

    /* JADX INFO: renamed from: r */
    public boolean f72436r;

    /* JADX INFO: renamed from: s */
    public int f72437s;

    /* JADX INFO: renamed from: t */
    public List<String> f72438t;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.wc$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a extends ArrayList<String> {
        public a() {
            add("librmonitor_memory.so");
            add("librmonitor_base.so");
            add("libBugly_Native.so");
            add("libbuglybacktrace.so");
        }
    }

    public C34000wc() {
        super("native_memory", false, 10, 0.5f, 0.1f, 0);
        this.f72432n = 4096;
        this.f72433o = 1073741824L;
        this.f72434p = f72426u;
        this.f72435q = true;
        this.f72436r = false;
        this.f72437s = 1;
        this.f72438t = new a();
    }

    @Override // com.tencent.bugly.proguard.C33694hf
    /* JADX INFO: renamed from: a */
    public void mo72626a(C33694hf c33694hf) {
        super.mo72626a(c33694hf);
        if (c33694hf instanceof C34000wc) {
            C34000wc c34000wc = (C34000wc) c33694hf;
            this.f72432n = c34000wc.f72432n;
            this.f72433o = c34000wc.f72433o;
            this.f72434p = c34000wc.f72434p;
            this.f72438t = c34000wc.f72438t;
            this.f72435q = c34000wc.f72435q;
            this.f72437s = c34000wc.f72437s;
            this.f72436r = c34000wc.f72436r;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m75365b(int i11) {
        if (i11 > 0) {
            HandlerC33544ac.f68831F = i11;
        }
    }

    @Override // com.tencent.bugly.proguard.C33694hf
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C34000wc clone() {
        return new C34000wc(this);
    }

    /* JADX INFO: renamed from: d */
    public int m75368d() {
        return this.f72432n;
    }

    /* JADX INFO: renamed from: e */
    public boolean m75369e() {
        return this.f72435q;
    }

    /* JADX INFO: renamed from: f */
    public List<String> m75370f() {
        return this.f72438t;
    }

    /* JADX INFO: renamed from: g */
    public boolean m75371g() {
        return this.f72436r;
    }

    /* JADX INFO: renamed from: h */
    public long m75372h() {
        return this.f72433o;
    }

    /* JADX INFO: renamed from: i */
    public long m75373i() {
        return this.f72434p;
    }

    /* JADX INFO: renamed from: j */
    public int m75374j() {
        return this.f72437s;
    }

    /* JADX INFO: renamed from: b */
    public final void m75366b(JSONObject jSONObject) {
        try {
            if (jSONObject.has("ignore_so_list")) {
                JSONArray jSONArray = jSONObject.getJSONArray("ignore_so_list");
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    String string = jSONArray.getString(i11);
                    if (!TextUtils.isEmpty(string)) {
                        this.f72438t.add(string);
                    }
                }
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception("RMonitor_config", th2);
        }
    }

    public C34000wc(C34000wc c34000wc) {
        super(c34000wc);
        this.f72432n = 4096;
        this.f72433o = 1073741824L;
        this.f72434p = f72426u;
        this.f72435q = true;
        this.f72436r = false;
        this.f72437s = 1;
        this.f72438t = new a();
        mo72626a(c34000wc);
    }

    /* JADX INFO: renamed from: a */
    public void m75361a(int i11) {
        this.f72432n = i11;
    }

    /* JADX INFO: renamed from: a */
    public void m75363a(List<String> list) {
        this.f72438t = list;
    }

    /* JADX INFO: renamed from: a */
    public void m75364a(boolean z11) {
        this.f72435q = z11;
    }

    /* JADX INFO: renamed from: a */
    public void m75362a(long j11) {
        this.f72433o = j11;
    }

    @Override // com.tencent.bugly.proguard.C33694hf, com.tencent.bugly.proguard.InterfaceC33814n9
    /* JADX INFO: renamed from: a */
    public void mo72627a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        super.mo72627a(jSONObject);
        try {
            if (jSONObject.has("app_min_size")) {
                m75361a(jSONObject.getInt("app_min_size"));
            }
            if (jSONObject.has("max_physical_pss")) {
                m75362a(jSONObject.getLong("max_physical_pss"));
            }
            if (jSONObject.has("enable_libc_hook")) {
                m75364a(jSONObject.getBoolean("enable_libc_hook"));
            }
            if (jSONObject.has("max_history_mem_size")) {
                m75365b(jSONObject.getInt("max_history_mem_size"));
            }
            if (jSONObject.has("enable_mmap_hook")) {
                this.f72436r = jSONObject.optBoolean("enable_mmap_hook", false);
            }
            if (jSONObject.has("unwind_method")) {
                this.f72437s = jSONObject.optInt("unwind_method", 1);
            }
            m75366b(jSONObject);
        } catch (Throwable th2) {
            Logger.INSTANCE.exception("RMonitor_config", "parsePluginConfig", th2);
        }
    }
}
